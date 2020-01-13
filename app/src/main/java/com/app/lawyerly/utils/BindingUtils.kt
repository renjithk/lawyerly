package com.app.lawyerly.utils

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.app.lawyerly.ui.adapter.IBindableAdapter

/**
 * Common binding utility functions
 *
 * Created by Renjith Kandanatt on 12/01/2020
 */
object BindingUtils {
    @BindingAdapter("data")
    @JvmStatic fun <T> setRecyclerData(recyclerView: RecyclerView, data: T) {
        if(recyclerView.adapter is IBindableAdapter<*>) (recyclerView.adapter as IBindableAdapter<T>).setData(data)
    }
}