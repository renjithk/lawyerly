package com.app.lawyerly.data

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

/**
 * This class holds different Coroutine dispatchers
 *
 * Created by Renjith Kandanatt on 12/01/2020
 */
class AppDispatchers (val main: CoroutineDispatcher,
                      val io: CoroutineDispatcher) {
    @Inject
    constructor() : this (
        main = Dispatchers.Main,
        io = Dispatchers.IO
    )
}