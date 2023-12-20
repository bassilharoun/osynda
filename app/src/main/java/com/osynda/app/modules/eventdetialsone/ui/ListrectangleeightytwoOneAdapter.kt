package com.osynda.app.modules.eventdetialsone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osynda.app.R
import com.osynda.app.databinding.RowListrectangleeightytwoOneBinding
import com.osynda.app.modules.eventdetialsone.`data`.model.ListrectangleeightytwoOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectangleeightytwoOneAdapter(
  var list: List<ListrectangleeightytwoOneRowModel>
) : RecyclerView.Adapter<ListrectangleeightytwoOneAdapter.RowListrectangleeightytwoOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowListrectangleeightytwoOneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangleeightytwo_one,parent,false)
    return RowListrectangleeightytwoOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangleeightytwoOneVH, position: Int) {
    val listrectangleeightytwoOneRowModel = ListrectangleeightytwoOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangleeightytwoOneRowModel = list[position]
    holder.binding.listrectangleeightytwoOneRowModel = listrectangleeightytwoOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectangleeightytwoOneRowModel>) {
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
      item: ListrectangleeightytwoOneRowModel
    ) {
    }
  }

  inner class RowListrectangleeightytwoOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangleeightytwoOneBinding =
        RowListrectangleeightytwoOneBinding.bind(itemView)
  }
}
