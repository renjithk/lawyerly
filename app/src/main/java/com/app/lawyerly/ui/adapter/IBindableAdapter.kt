package com.app.lawyerly.ui.adapter

/**
 * Base for all adapters which needs to use Data Binding to set their data
 *
 * Created by Renjith Kandanatt on 12/01/2020
 */
interface IBindableAdapter<T> {
    fun setData(data: T)
}