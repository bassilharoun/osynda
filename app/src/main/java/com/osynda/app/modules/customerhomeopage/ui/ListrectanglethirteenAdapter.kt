package com.osynda.app.modules.customerhomeopage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osynda.app.R
import com.osynda.app.databinding.RowListrectanglethirteenBinding
import com.osynda.app.modules.customerhomeopage.`data`.model.ListrectanglethirteenRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglethirteenAdapter(
  var list: List<ListrectanglethirteenRowModel>
) : RecyclerView.Adapter<ListrectanglethirteenAdapter.RowListrectanglethirteenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglethirteenVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglethirteen,parent,false)
    return RowListrectanglethirteenVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglethirteenVH, position: Int) {
    val listrectanglethirteenRowModel = ListrectanglethirteenRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglethirteenRowModel = list[position]
    holder.binding.listrectanglethirteenRowModel = listrectanglethirteenRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglethirteenRowModel>) {
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
      item: ListrectanglethirteenRowModel
    ) {
    }
  }

  inner class RowListrectanglethirteenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglethirteenBinding = RowListrectanglethirteenBinding.bind(itemView)
  }
}
