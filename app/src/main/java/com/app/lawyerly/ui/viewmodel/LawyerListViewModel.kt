package com.app.lawyerly.ui.viewmodel

import androidx.lifecycle.*
import com.app.lawyerly.data.AppDispatchers
import com.app.lawyerly.data.DataProvider
import com.app.lawyerly.data.LawyerEntity
import com.app.lawyerly.utils.Event
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * This class is responsible for handling UI related data for {@link FLawyerList}
 *
 * Created by Renjith Kandanatt on 12/01/2020
 */
class LawyerListViewModel @Inject constructor(private val dispatchers: AppDispatchers): ViewModel() {
    protected val lawyersMediator = MediatorLiveData<List<LawyerEntity>>()
    val lawyers: LiveData<List<LawyerEntity>> get() = lawyersMediator
    protected var dataSource: LiveData<List<LawyerEntity>> = MutableLiveData()

    val canShowDetails = MutableLiveData<Event<Boolean>>()
    init {
        lawyersMediator.value = mutableListOf()
    }

    /**
     * Loads a list of lawyers from a predefined data provider
     */
     fun loadLawyers() {
        viewModelScope.launch(dispatchers.main) {
            lawyersMediator.removeSource(lawyersMediator)
            withContext(dispatchers.io) {
                dataSource = DataProvider.getLawyers()
            }
            lawyersMediator.addSource(dataSource) {
                lawyersMediator.value = it
            }
        }
    }

    /**
     * Handles click events from {@link FLawyerList}
     */
    fun onItemClick() {
        canShowDetails.value = Event(true)
    }
}