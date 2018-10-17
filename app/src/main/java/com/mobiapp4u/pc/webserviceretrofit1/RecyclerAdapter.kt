package com.mobiapp4u.pc.webserviceretrofit1

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.layout_item_for_main.view.*


class RecyclerVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val id = itemView.id_brand
    val name = itemView.name_brand

}
class RecyclerAdapter(context:Context, brand:List<Brand>): RecyclerView.Adapter<RecyclerVH>(){

    val brnd:List<Brand> = brand
    val cntxt:Context = context
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerVH {
     val view = LayoutInflater.from(cntxt).inflate(R.layout.layout_item_for_main,p0,false)
        return RecyclerVH(view)
    }

    override fun getItemCount(): Int {
        return brnd.size
    }

    override fun onBindViewHolder(holder: RecyclerVH, pos: Int) {
         holder.id.text = brnd.get(pos).id.toString()
        holder.name.text = brnd.get(pos).name

    }

}