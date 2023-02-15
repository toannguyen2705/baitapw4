package com.watasolutions.w4_t6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.watasolutions.w4_t6.model.Image


class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    companion object {
        fun from(parent: ViewGroup): ImageViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val view =
                layoutInflater.inflate(R.layout.item_view_idol, parent, false)
            return ImageViewHolder(view)
        }
    }

    fun bindData(idol: Image) {
        val tvTitle = itemView.findViewById<TextView>(R.id.tv_title);
        val tvDescription = itemView.findViewById<TextView>(R.id.tv_description)
        val ivAvatar = itemView.findViewById<ImageView>(R.id.iv_avatar)
        tvTitle.text = idol.name
        tvDescription.text = idol.author
        Glide.with(itemView.context).load(idol.link).centerCrop().into(ivAvatar)
    }
}