package com.osynda.app.modules.cinemasone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osynda.app.R
import com.osynda.app.databinding.RowCinemasOneBinding
import com.osynda.app.modules.cinemasone.`data`.model.CinemasOneRowModel
import kotlin.Int
import kotlin.collections.List

class CinemasOneAdapter(
  var list: List<CinemasOneRowModel>
) : RecyclerView.Adapter<CinemasOneAdapter.RowCinemasOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCinemasOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_cinemas_one,parent,false)
    return RowCinemasOneVH(view)
  }

  override fun onBindViewHolder(holder: RowCinemasOneVH, position: Int) {
    val cinemasOneRowModel = CinemasOneRowModel()
    // TODO uncomment following line after integration with data source
    // val cinemasOneRowModel = list[position]
    holder.binding.cinemasOneRowModel = cinemasOneRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CinemasOneRowModel>) {
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
      item: CinemasOneRowModel
    ) {
    }
  }

  inner class RowCinemasOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCinemasOneBinding = RowCinemasOneBinding.bind(itemView)
    init {
      binding.btn35Zero.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, CinemasOneRowModel())
      }
    }
  }
}
