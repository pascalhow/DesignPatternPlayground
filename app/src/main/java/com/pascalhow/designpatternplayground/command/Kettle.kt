package com.pascalhow.designpatternplayground.command

import com.pascalhow.designpatternplayground.logger.Logger

class Kettle(private val logger: Logger) : ElectricalAppliance {

    override fun turnOn() {
        logger.d("Kettle turning ON")
    }

    override fun turnOff() {
        logger.d("Kettle turning OFF")
    }

    override fun operate() {
        logger.d("Kettle BOILING WATER!")
    }

}
