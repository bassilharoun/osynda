package com.osynda.app.modules.eventdetialsone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osynda.app.R
import com.osynda.app.databinding.RowListrectangleeightytwoThreeBinding
import com.osynda.app.modules.eventdetialsone.`data`.model.ListrectangleeightytwoThreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectangleeightytwoThreeAdapter(
  var list: List<ListrectangleeightytwoThreeRowModel>
) : RecyclerView.Adapter<ListrectangleeightytwoThreeAdapter.RowListrectangleeightytwoThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowListrectangleeightytwoThreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangleeightytwo_three,parent,false)
    return RowListrectangleeightytwoThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangleeightytwoThreeVH, position: Int) {
    val listrectangleeightytwoThreeRowModel = ListrectangleeightytwoThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangleeightytwoThreeRowModel = list[position]
    holder.binding.listrectangleeightytwoThreeRowModel = listrectangleeightytwoThreeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectangleeightytwoThreeRowModel>) {
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
      item: ListrectangleeightytwoThreeRowModel
    ) {
    }
  }

  inner class RowListrectangleeightytwoThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangleeightytwoThreeBinding =
        RowListrectangleeightytwoThreeBinding.bind(itemView)
  }
}
