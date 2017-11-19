package com.pascalhow.designpatternplayground.command

import android.view.View
import android.widget.Button
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.pascalhow.designpatternplayground.R

class CommandDisplayer(rootView: View) {

    @BindView(R.id.turn_on_appliance) lateinit var turnOnApplianceButton: Button
    @BindView(R.id.turn_off_appliance) lateinit var turnOffApplianceButton: Button
    @BindView(R.id.operate_appliance) lateinit var operateApplianceButton: Button
    @BindView(R.id.main_text) lateinit var mainText: TextView

    init {
        ButterKnife.bind(this, rootView)
    }

    fun display() {
        mainText.setText(R.string.command_screen_main_text)
    }

    fun setTurnOnClickListener(handler: OnApplianceClickEventHandler) {
        turnOnApplianceButton.setOnClickListener { handler.handle() }
    }

    fun setTurnOffClickListener(handler: OnApplianceClickEventHandler) {
        turnOffApplianceButton.setOnClickListener { handler.handle() }
    }

    fun setOperateClickListener(handler: OnApplianceClickEventHandler) {
        operateApplianceButton.setOnClickListener { handler.handle() }
    }

    fun clearOnClickListener() {
        turnOnApplianceButton.setOnClickListener(null)
        turnOffApplianceButton.setOnClickListener(null)
        operateApplianceButton.setOnClickListener(null)
    }

    interface OnApplianceClickEventHandler {
        fun handle()
    }
}
