package com.tom.hwk.ui

import android.support.annotation.IntegerRes
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import java.lang.ref.WeakReference
import java.util.ArrayList

/**
 * Created by tomr on 24/07/2017.
 */
abstract class BaseFragmentActivity : AppCompatActivity() {

    private val fragments = ArrayList<WeakReference<Fragment>>()

    override fun onBackPressed() {
        val activeFragments = getActiveFragments()
        val topFragment = activeFragments[activeFragments.size - 1] as? BackConsumer

        if (topFragment == null || !topFragment.consumeBack()) {
            super.onBackPressed()
        }
    }

    override fun onAttachFragment(fragment: Fragment) {
        super.onAttachFragment(fragment)
        fragments.add(WeakReference(fragment))
    }

    fun getActiveFragments(): List<Fragment> {
        val ret = ArrayList<Fragment>()
        val it = fragments.iterator()
        while (it.hasNext()) {
            val f = it.next().get()
            if (f != null) {
                if (f.isVisible) {
                    ret.add(f)
                }
            } else {
                it.remove()
            }
        }
        return ret
    }

    fun addFragment(fragment: Fragment, name: String, addToBackstack: Boolean) {
        val trans = supportFragmentManager.beginTransaction().add(getFragmentContainer(), fragment, name)
        if(addToBackstack) {
            trans.addToBackStack(name)
        }
        trans.commit()
    }

    abstract fun getFragmentContainer() : Int

}