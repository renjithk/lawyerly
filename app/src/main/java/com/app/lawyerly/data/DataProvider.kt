package com.app.lawyerly.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * Simple data provider to product a list of lawyers
 */
object DataProvider {
    /**
     * Returns a list of lawyers
     * @return a valid object of type {@link LiveData<List<LawyerEntity>>}
     */
    fun getLawyers() : LiveData<List<LawyerEntity>> {
        val list = mutableListOf<LawyerEntity>()

        list.add(
            LawyerEntity(
                "Lawyer's name",
                 "Speciality",
                "4.8",
                "£60.90/h",
                true
            )
        )
        list.add(
            LawyerEntity(
                "Lawyer's name",
                "Speciality",
                "4.2",
                "£50.50/h",
                true
            )
        )
        list.add(
            LawyerEntity(
                "Lawyer's name",
                "Speciality",
                "4.5",
                "£50.25/h",
                true
            )
        )
        list.add(
            LawyerEntity(
                "Lawyer's name",
                "Speciality",
                "3.9",
                "£45.60/h",
                false
            )
        )
        list.add(
            LawyerEntity(
                "Lawyer's name",
                "Speciality",
                "4.1",
                "£62.90/h",
                false
            )
        )
        list.add(
            LawyerEntity(
                "Lawyer's name",
                "Speciality",
                "4.6",
                "£60.90/h",
                true
            )
        )
        list.add(
            LawyerEntity(
                "Lawyer's name",
                "Speciality",
                "4.4",
                "£60.90/h",
                false
            )
        )

        val liveData = MutableLiveData<List<LawyerEntity>>()
        liveData.postValue(list)
        return liveData
    }
}
