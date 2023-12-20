package com.osynda.app.modules.customerhomeopage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osynda.app.R
import com.osynda.app.databinding.RowListrectanglethirteenTwoBinding
import com.osynda.app.modules.customerhomeopage.`data`.model.ListrectanglethirteenTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglethirteenTwoAdapter(
  var list: List<ListrectanglethirteenTwoRowModel>
) : RecyclerView.Adapter<ListrectanglethirteenTwoAdapter.RowListrectanglethirteenTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglethirteenTwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglethirteen_two,parent,false)
    return RowListrectanglethirteenTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglethirteenTwoVH, position: Int) {
    val listrectanglethirteenTwoRowModel = ListrectanglethirteenTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglethirteenTwoRowModel = list[position]
    holder.binding.listrectanglethirteenTwoRowModel = listrectanglethirteenTwoRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglethirteenTwoRowModel>) {
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
      item: ListrectanglethirteenTwoRowModel
    ) {
    }
  }

  inner class RowListrectanglethirteenTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglethirteenTwoBinding =
        RowListrectanglethirteenTwoBinding.bind(itemView)
  }
}
