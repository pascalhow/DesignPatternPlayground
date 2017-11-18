package com.pascalhow.designpatternplayground.command

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.*
import com.pascalhow.designpatternplayground.R

class CommandFragment : Fragment() {

    private lateinit var commandPresenter: CommandPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val rootView = inflater.inflate(R.layout.fragment_main, container, false)

        (activity as AppCompatActivity).supportActionBar?.title = "Command Pattern"

        val commandDisplayer = CommandDisplayer(rootView)
        commandPresenter = CommandPresenter(commandDisplayer)

        setHasOptionsMenu(true)

        return rootView
    }

    override fun onResume() {
        super.onResume()
        commandPresenter.startPresenting()
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        val item = menu.findItem(R.id.action_settings)
        item.isVisible = false
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        menu.clear()
        inflater.inflate(R.menu.main, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.action_settings -> {
            }
            else -> {
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
