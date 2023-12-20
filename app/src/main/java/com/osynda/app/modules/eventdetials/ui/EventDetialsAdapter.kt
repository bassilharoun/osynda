package com.osynda.app.modules.eventdetials.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osynda.app.R
import com.osynda.app.databinding.RowEventDetialsBinding
import com.osynda.app.modules.eventdetials.`data`.model.EventDetialsRowModel
import kotlin.Int
import kotlin.collections.List

class EventDetialsAdapter(
  var list: List<EventDetialsRowModel>
) : RecyclerView.Adapter<EventDetialsAdapter.RowEventDetialsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEventDetialsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_event_detials,parent,false)
    return RowEventDetialsVH(view)
  }

  override fun onBindViewHolder(holder: RowEventDetialsVH, position: Int) {
    val eventDetialsRowModel = EventDetialsRowModel()
    // TODO uncomment following line after integration with data source
    // val eventDetialsRowModel = list[position]
    holder.binding.eventDetialsRowModel = eventDetialsRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EventDetialsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: EventDetialsRowModel
    ) {
    }
  }

  inner class RowEventDetialsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEventDetialsBinding = RowEventDetialsBinding.bind(itemView)
  }
}
