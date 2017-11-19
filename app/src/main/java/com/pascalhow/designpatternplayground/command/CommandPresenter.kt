package com.pascalhow.designpatternplayground.command

import com.pascalhow.designpatternplayground.logger.Logger

class CommandPresenter(private val commandDisplayer: CommandDisplayer,
                       private val electricalApplianceRunner: ElectricalApplianceRunner,
                       private val logger: Logger) {

    fun startPresenting() {
        commandDisplayer.display()
    }

    fun turnOnIOTAppliances() {
        val kettle = Kettle(logger)
        val vacuumCleaner = VacuumCleaner(logger)
        val washingMachine = WashineMachine(logger)
        electricalApplianceRunner.prepare(TurnOn(kettle))
        electricalApplianceRunner.prepare(TurnOn(vacuumCleaner))
        electricalApplianceRunner.prepare(TurnOn(washingMachine))
        electricalApplianceRunner.run()
    }

    fun turnOffIOTAppliances() {
        val kettle = Kettle(logger)
        val vacuumCleaner = VacuumCleaner(logger)
        val washingMachine = WashineMachine(logger)
        electricalApplianceRunner.prepare(TurnOff(kettle))
        electricalApplianceRunner.prepare(TurnOff(vacuumCleaner))
        electricalApplianceRunner.prepare(TurnOff(washingMachine))
        electricalApplianceRunner.run()
    }

    fun OperateIOTAppliances() {
        val kettle = Kettle(logger)
        val vacuumCleaner = VacuumCleaner(logger)
        val washingMachine = WashineMachine(logger)
        electricalApplianceRunner.prepare(DoAction(kettle))
        electricalApplianceRunner.prepare(DoAction(vacuumCleaner))
        electricalApplianceRunner.prepare(DoAction(washingMachine))
        electricalApplianceRunner.run()
    }

}
