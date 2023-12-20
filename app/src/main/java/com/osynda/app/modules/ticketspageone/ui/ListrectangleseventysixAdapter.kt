package com.osynda.app.modules.ticketspageone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osynda.app.R
import com.osynda.app.databinding.RowListrectangleseventysixBinding
import com.osynda.app.modules.ticketspageone.`data`.model.ListrectangleseventysixRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectangleseventysixAdapter(
  var list: List<ListrectangleseventysixRowModel>
) : RecyclerView.Adapter<ListrectangleseventysixAdapter.RowListrectangleseventysixVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangleseventysixVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangleseventysix,parent,false)
    return RowListrectangleseventysixVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangleseventysixVH, position: Int) {
    val listrectangleseventysixRowModel = ListrectangleseventysixRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangleseventysixRowModel = list[position]
    holder.binding.listrectangleseventysixRowModel = listrectangleseventysixRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectangleseventysixRowModel>) {
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
      item: ListrectangleseventysixRowModel
    ) {
    }
  }

  inner class RowListrectangleseventysixVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangleseventysixBinding =
        RowListrectangleseventysixBinding.bind(itemView)
  }
}
