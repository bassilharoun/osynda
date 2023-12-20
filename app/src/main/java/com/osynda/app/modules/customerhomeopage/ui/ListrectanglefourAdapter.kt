package com.osynda.app.modules.customerhomeopage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osynda.app.R
import com.osynda.app.databinding.RowListrectanglefourBinding
import com.osynda.app.modules.customerhomeopage.`data`.model.ListrectanglefourRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglefourAdapter(
  var list: List<ListrectanglefourRowModel>
) : RecyclerView.Adapter<ListrectanglefourAdapter.RowListrectanglefourVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglefourVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglefour,parent,false)
    return RowListrectanglefourVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglefourVH, position: Int) {
    val listrectanglefourRowModel = ListrectanglefourRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglefourRowModel = list[position]
    holder.binding.listrectanglefourRowModel = listrectanglefourRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglefourRowModel>) {
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
      item: ListrectanglefourRowModel
    ) {
    }
  }

  inner class RowListrectanglefourVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglefourBinding = RowListrectanglefourBinding.bind(itemView)
  }
}
