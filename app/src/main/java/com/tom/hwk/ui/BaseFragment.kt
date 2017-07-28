package com.tom.hwk.ui

import android.content.Context
import android.support.v4.app.Fragment

/**
 * Created by tomr on 24/07/2017.
 */

abstract class BaseFragment<Callbacks> : Fragment() {

    protected var callbacks: Callbacks? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        callbacks = context as? Callbacks
    }
}
