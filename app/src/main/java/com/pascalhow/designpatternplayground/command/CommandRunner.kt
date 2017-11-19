package com.pascalhow.designpatternplayground.command

class CommandRunner {

    private val commandList: ArrayList<Command> = ArrayList()

    fun prepare(command: Command) {
        commandList.add(command)
    }

    fun run() {
        commandList.forEach { command: Command -> command.execute() }
    }

}

