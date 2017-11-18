package com.pascalhow.designpatternplayground.command

import android.view.View
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.pascalhow.designpatternplayground.R

class CommandDisplayer(rootView: View) {

    @BindView(R.id.main_text) lateinit var mainText: TextView

    init {
        ButterKnife.bind(this, rootView)
    }

    fun display() {
        mainText.setText(R.string.command_screen_main_text)
    }

}
