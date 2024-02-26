package com.example.sem7_recycleviewimg

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.sem7_recycleviewimg.databinding.ItemAndroidBinding

class AdapterAndroid(val listaAndroid: List<Android>, val context:Context) : RecyclerView.Adapter<AdapterAndroid.ViewHolder>() {
    inner class  ViewHolder(val binding: ItemAndroidBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemAndroidBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ViewHolder(binding)
    }

    override fun getItemCount()= listaAndroid.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(listaAndroid[position]){
                binding.vnonvercion.text=nombre
                binding.tvnumvercion.text=version
                binding.ivandroid.setImageResource(img)
                binding.cvandroid.setOnClickListener({
                    Toast.makeText(context,"click item android $nombre", Toast.LENGTH_LONG).show()
                })
            }
        }
    }


}