package com.tom.hwk.ui.screens

import android.os.Bundle
import com.tom.hwk.R
import com.tom.hwk.ui.BaseFragmentActivity
import com.tom.hwk.ui.screens.list.ListFragment

class MainActivity : BaseFragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment(ListFragment(), ListFragment.FRAGMENT_TAG, false)
    }


    override fun getFragmentContainer(): Int {
        return R.id.fragment_container;
    }
}
