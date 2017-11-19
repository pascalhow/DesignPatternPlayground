package com.pascalhow.designpatternplayground.command

import com.pascalhow.designpatternplayground.logger.Logger

class VacuumCleaner(private val logger: Logger): ElectricalAppliance {

    override fun turnOn() {
        logger.d("Vacuum cleaner turned ON")
    }

    override fun turnOff() {
        logger.d("Vacuum cleaner turned OFF")
    }

    override fun operate() {
        logger.d("Vacuum cleaner VACUUMING!")
    }

}
