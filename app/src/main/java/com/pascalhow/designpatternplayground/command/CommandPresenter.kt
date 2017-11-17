package com.pascalhow.designpatternplayground.command

class CommandPresenter(private val commandDisplayer: CommandDisplayer) {

    fun startPresenting() {
        commandDisplayer.display()
    }
}
