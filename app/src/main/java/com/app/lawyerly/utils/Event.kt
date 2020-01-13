package com.app.lawyerly.utils

/**
 * Used as a wrapper for data that is exposed via a LiveData that represents an event
 *
 * Created by Renjith Kandanatt on 12/01/2020
 */
open class Event<out T>(private val content: T) {
    private var hasBeenHandled = false

    /**
     * Returns the content and prevents its use again.
     */
    fun getContentIfNotHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }
}