package com.example.a20220520_jigbang_licy.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a20220520_jigbang_licy.R
import com.example.a20220520_jigbang_licy.models.RoomData

class RoomRecyclerViewAdapter (val mContext : Context, val mList: List<RoomData>): RecyclerView.Adapter<RoomRecyclerViewAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
        val row =LayoutInflater.from(mContext).inflate(R.layout.roomlistitem, parent,false)
        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return mList.size
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){

    }

}