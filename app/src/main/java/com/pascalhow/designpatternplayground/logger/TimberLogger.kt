package com.pascalhow.designpatternplayground.logger

import timber.log.Timber

class TimberLogger: Logger {

    override fun d(message:String) {
        Timber.d(message)
    }

    override fun e(message:String) {
        Timber.e(message)
    }

    override fun w(message:String) {
        Timber.w(message)
    }

}
