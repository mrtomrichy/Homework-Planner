package com.tom.hwk.ui.screens.list.adapter

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.View
import android.widget.TextView
import com.tom.hwk.R
import com.tom.hwk.model.Homework

/**
 * Created by tomr on 24/07/2017.
 */

class HomeworkViewHolder(itemView: View): ViewHolder(itemView) {

    val title = itemView.findViewById(R.id.cell_homework_title) as TextView
    val subject = itemView.findViewById(R.id.cell_homework_subject) as TextView
    val status = itemView.findViewById(R.id.cell_homework_status) as TextView

    fun bind(homework: Homework) {
        title.text = homework.title
        subject.text = homework.subject
        status.text = "Complete"
    }

}