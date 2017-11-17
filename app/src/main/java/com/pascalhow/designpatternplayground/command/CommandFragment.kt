package com.pascalhow.designpatternplayground.command

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.pascalhow.designpatternplayground.MainActivity
import com.pascalhow.designpatternplayground.R
import com.pascalhow.designpatternplayground.R2

import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class CommandFragment : Fragment() {

    @BindView(R2.id.main_text)
    internal var mainText: TextView? = null

    private var mainActivity: MainActivity? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_main, container, false)

        ButterKnife.bind(this, rootView)

        mainActivity = activity as MainActivity
        mainActivity!!.setTitle(R.string.main_screen_fragment_title)
        mainActivity!!.showFloatingActionButton()

        setHasOptionsMenu(true)

        return rootView
    }

    @OnClick(R2.id.main_button)
    fun onMainButtonClick() {
        mainText!!.text = getString(R.string.main_screen_content_text)
    }

    override fun onPrepareOptionsMenu(menu: Menu?) {
        val item = menu!!.findItem(R.id.action_settings)
        item.isVisible = false
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        menu!!.clear()
        inflater!!.inflate(R.menu.main, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when (item!!.itemId) {

            R.id.action_settings -> {
            }
            else -> {
            }
        }//  Save new trip
        return super.onOptionsItemSelected(item)
    }
}
