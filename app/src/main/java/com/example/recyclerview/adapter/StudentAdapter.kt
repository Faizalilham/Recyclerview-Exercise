package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.databinding.ListItemBinding
import com.example.recyclerview.model.Provinsi

class StudentAdapter(val datas : MutableList<Provinsi>):RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    inner class StudentViewHolder(val binding : ListItemBinding):RecyclerView.ViewHolder(binding.root){
        var provinsi = binding.tvProvinsi
        var ibukota = binding.tvIbukota
        var img = binding.img
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        return StudentViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
       holder.apply {
           provinsi.text = datas[position].provinsi
           ibukota.text = datas[position].ibukota
           img.setImageResource(datas[position].img)

           binding.card.startAnimation(AnimationUtils.loadAnimation(holder.itemView.context, R.anim.anim))
       }
    }

    override fun getItemCount(): Int = datas.size
}