package com.example.usupbekov_adilet_homework_3_6

import android.content.Context
import android.icu.text.CaseMap.Lower
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.usupbekov_adilet_homework_3_6.databinding.ItemMusicBinding

class AdapterLower(private val playList: ArrayList<Song>,val onClick:(tittle:String)->Unit) :
    Adapter<AdapterLower.LowerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LowerViewHolder {
        return LowerViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount() = playList.size

    override fun onBindViewHolder(holder: LowerViewHolder, position: Int) {
        holder.bind()
    }

    inner class LowerViewHolder(private val binding:ItemMusicBinding) : ViewHolder(binding.root){
        fun bind (){
            val item = playList[adapterPosition]

            itemView.setOnClickListener{
                onClick(playList[adapterPosition].name)
            }

            binding.apply {
                tvNum.text=item.number
                tvMusicName.text=item.name
                tvMusicDuration.text=item.music
                tvMusicPlayer.text=item.minut
            }
        }
    }


}
