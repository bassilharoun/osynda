package com.osynda.app.modules.cinemas.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osynda.app.R
import com.osynda.app.databinding.RowCinemasBinding
import com.osynda.app.modules.cinemas.`data`.model.CinemasRowModel
import kotlin.Int
import kotlin.collections.List

class CinemasAdapter(
  var list: List<CinemasRowModel>
) : RecyclerView.Adapter<CinemasAdapter.RowCinemasVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCinemasVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_cinemas,parent,false)
    return RowCinemasVH(view)
  }

  override fun onBindViewHolder(holder: RowCinemasVH, position: Int) {
    val cinemasRowModel = CinemasRowModel()
    // TODO uncomment following line after integration with data source
    // val cinemasRowModel = list[position]
    holder.binding.cinemasRowModel = cinemasRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CinemasRowModel>) {
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
      item: CinemasRowModel
    ) {
    }
  }

  inner class RowCinemasVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCinemasBinding = RowCinemasBinding.bind(itemView)
  }
}
