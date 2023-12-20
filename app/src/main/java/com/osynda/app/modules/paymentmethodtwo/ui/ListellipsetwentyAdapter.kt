package com.osynda.app.modules.paymentmethodtwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osynda.app.R
import com.osynda.app.databinding.RowListellipsetwentyBinding
import com.osynda.app.modules.paymentmethodtwo.`data`.model.ListellipsetwentyRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsetwentyAdapter(
  var list: List<ListellipsetwentyRowModel>
) : RecyclerView.Adapter<ListellipsetwentyAdapter.RowListellipsetwentyVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsetwentyVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsetwenty,parent,false)
    return RowListellipsetwentyVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsetwentyVH, position: Int) {
    val listellipsetwentyRowModel = ListellipsetwentyRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsetwentyRowModel = list[position]
    holder.binding.listellipsetwentyRowModel = listellipsetwentyRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipsetwentyRowModel>) {
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
      item: ListellipsetwentyRowModel
    ) {
    }
  }

  inner class RowListellipsetwentyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsetwentyBinding = RowListellipsetwentyBinding.bind(itemView)
  }
}
