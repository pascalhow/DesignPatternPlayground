package com.pascalhow.designpatternplayground.command

class ElectricalApplianceRunner {

    private lateinit var commandList: ArrayList<Command>

    fun prepare(command: Command) {
        commandList.add(command)
    }

    fun run() {
        commandList.forEach { command: Command -> command.execute() }
    }

}

