package com.pascalhow.designpatternplayground.command

import com.pascalhow.designpatternplayground.logger.Logger

class CommandPresenter(private val commandDisplayer: CommandDisplayer,
                       logger: Logger) {

    private val kettle = Kettle(logger)
    private val vacuumCleaner = VacuumCleaner(logger)
    private val washingMachine = WashineMachine(logger)

    fun startPresenting() {
        commandDisplayer.display()
        prepareAppliances()
    }

    private fun prepareAppliances() {
        commandDisplayer.setTurnOnClickListener(object : CommandDisplayer.OnApplianceClickEventHandler {
            override fun handle() {
                turnOnIOTAppliances()
            }
        })

        commandDisplayer.setTurnOffClickListener(object : CommandDisplayer.OnApplianceClickEventHandler {
            override fun handle() {
                turnOffIOTAppliances()
            }
        })

        commandDisplayer.setOperateClickListener(object : CommandDisplayer.OnApplianceClickEventHandler {
            override fun handle() {
                operateIOTAppliances()
            }
        })
    }

    fun turnOnIOTAppliances() {
        val commandRunner = CommandRunner()
        commandRunner.prepare(TurnOn(kettle))
        commandRunner.prepare(TurnOn(vacuumCleaner))
        commandRunner.prepare(TurnOn(washingMachine))
        commandRunner.run()
    }

    fun turnOffIOTAppliances() {
        val commandRunner = CommandRunner()
        commandRunner.prepare(TurnOff(kettle))
        commandRunner.prepare(TurnOff(vacuumCleaner))
        commandRunner.prepare(TurnOff(washingMachine))
        commandRunner.run()
    }

    fun operateIOTAppliances() {
        val commandRunner = CommandRunner()
        commandRunner.prepare(Operate(kettle))
        commandRunner.prepare(Operate(vacuumCleaner))
        commandRunner.prepare(Operate(washingMachine))
        commandRunner.run()
    }

    fun stopPresenting() {
        commandDisplayer.clearOnClickListener()
    }
}
