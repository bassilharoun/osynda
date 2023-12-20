package com.osynda.app.modules.login.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osynda.app.R
import com.osynda.app.databinding.RowLoginBinding
import com.osynda.app.modules.login.`data`.model.LoginRowModel
import kotlin.Int
import kotlin.collections.List

class LoginAdapter(
  var list: List<LoginRowModel>
) : RecyclerView.Adapter<LoginAdapter.RowLoginVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowLoginVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_login,parent,false)
    return RowLoginVH(view)
  }

  override fun onBindViewHolder(holder: RowLoginVH, position: Int) {
    val loginRowModel = LoginRowModel()
    // TODO uncomment following line after integration with data source
    // val loginRowModel = list[position]
    holder.binding.loginRowModel = loginRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<LoginRowModel>) {
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
      item: LoginRowModel
    ) {
    }
  }

  inner class RowLoginVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowLoginBinding = RowLoginBinding.bind(itemView)
  }
}
