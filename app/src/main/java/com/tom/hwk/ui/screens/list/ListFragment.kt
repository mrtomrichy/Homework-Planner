package com.tom.hwk.ui.screens.list

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tom.hwk.R
import com.tom.hwk.model.Homework
import com.tom.hwk.ui.BaseFragment
import com.tom.hwk.ui.screens.list.adapter.HomeworkAdapter

/**
 * Created by tomr on 24/07/2017.
 */

class ListFragment : BaseFragment<Void>() {

    companion object {
        val FRAGMENT_TAG = "ListFragment"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val homework = listOf(Homework("hello", "", ""),
                Homework("hello1", "", ""),
                Homework("hello2", "", ""));

        val recyclerView = view.findViewById(R.id.list_recyclerview) as RecyclerView
        val adapter = HomeworkAdapter(homework)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }
}
