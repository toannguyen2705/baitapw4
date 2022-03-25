package com.watasolutions.w4_t6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.watasolutions.w4_t6.model.Idol

class IdolAdapter : ListAdapter<Idol, IdolAdapter.IdolViewHolder>(IdolDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IdolViewHolder {
        return IdolViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: IdolViewHolder, position: Int) {
        val idol = getItem(position)
        holder.bindData(idol)
    }


    class IdolDiffUtil : DiffUtil.ItemCallback<Idol>() {
        override fun areItemsTheSame(oldItem: Idol, newItem: Idol): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Idol, newItem: Idol): Boolean {
            return oldItem == newItem
        }

    }




    class IdolViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        companion object {
            fun from(parent: ViewGroup): IdolViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater.inflate(R.layout.item_view_idol, parent, false)
                return IdolViewHolder(view)
            }
        }

        fun bindData(idol: Idol) {
            val tvTitle = itemView.findViewById<TextView>(R.id.tv_title);
            val tvDescription = itemView.findViewById<TextView>(R.id.tv_description)
            val ivAvatar = itemView.findViewById<ImageView>(R.id.iv_avatar)
            tvTitle.text = idol.name
            tvDescription.text = idol.job
            ivAvatar.setImageResource(idol.avatar)
        }
    }




}