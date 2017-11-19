package com.pascalhow.designpatternplayground.command

import com.pascalhow.designpatternplayground.logger.Logger

class WashineMachine(private val logger: Logger) : ElectricalAppliance {

    override fun turnOn() {
        logger.d("Washing Machine turning ON")
    }

    override fun turnOff() {
        logger.d("Washing Machine turning OFF")
    }

    override fun doAction() {
        logger.d("Washing Machine WASHING CLOTHES!")
    }

}
