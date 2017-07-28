package com.tom.hwk.ui.screens.list.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.tom.hwk.R
import com.tom.hwk.model.Homework

/**
 * Created by tomr on 24/07/2017.
 */

class HomeworkAdapter(val homework: List<Homework>) : RecyclerView.Adapter<HomeworkViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeworkViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cell_homework, parent, false)
        return HomeworkViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeworkViewHolder, position: Int) {
        holder.bind(homework[position])
    }

    override fun getItemCount(): Int {
        return homework.size
    }

}