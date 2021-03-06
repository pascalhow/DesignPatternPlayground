package com.pascalhow.designpatternplayground.command

interface Command {
    fun execute()
}

class TurnOn(private val electricalAppliance: ElectricalAppliance) : Command {

    override fun execute() {
        electricalAppliance.turnOn()
    }

}

class TurnOff(private val electricalAppliance: ElectricalAppliance) : Command {

    override fun execute() {
        electricalAppliance.turnOff()
    }

}

class Operate(private val electricalAppliance: ElectricalAppliance) : Command {

    override fun execute() {
        electricalAppliance.operate()
    }

}
