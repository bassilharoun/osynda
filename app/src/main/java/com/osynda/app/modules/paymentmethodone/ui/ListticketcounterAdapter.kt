package com.osynda.app.modules.paymentmethodone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osynda.app.R
import com.osynda.app.databinding.RowListticketcounterBinding
import com.osynda.app.modules.paymentmethodone.`data`.model.ListticketcounterRowModel
import kotlin.Int
import kotlin.collections.List

class ListticketcounterAdapter(
  var list: List<ListticketcounterRowModel>
) : RecyclerView.Adapter<ListticketcounterAdapter.RowListticketcounterVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListticketcounterVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listticketcounter,parent,false)
    return RowListticketcounterVH(view)
  }

  override fun onBindViewHolder(holder: RowListticketcounterVH, position: Int) {
    val listticketcounterRowModel = ListticketcounterRowModel()
    // TODO uncomment following line after integration with data source
    // val listticketcounterRowModel = list[position]
    holder.binding.listticketcounterRowModel = listticketcounterRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListticketcounterRowModel>) {
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
      item: ListticketcounterRowModel
    ) {
    }
  }

  inner class RowListticketcounterVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListticketcounterBinding = RowListticketcounterBinding.bind(itemView)
  }
}
