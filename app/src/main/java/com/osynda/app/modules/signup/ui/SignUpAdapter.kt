package com.osynda.app.modules.signup.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.osynda.app.R
import com.osynda.app.databinding.RowSignUpBinding
import com.osynda.app.modules.signup.`data`.model.SignUpRowModel
import kotlin.Int
import kotlin.collections.List

class SignUpAdapter(
  var list: List<SignUpRowModel>
) : RecyclerView.Adapter<SignUpAdapter.RowSignUpVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSignUpVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_sign_up,parent,false)
    return RowSignUpVH(view)
  }

  override fun onBindViewHolder(holder: RowSignUpVH, position: Int) {
    val signUpRowModel = SignUpRowModel()
    // TODO uncomment following line after integration with data source
    // val signUpRowModel = list[position]
    holder.binding.signUpRowModel = signUpRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SignUpRowModel>) {
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
      item: SignUpRowModel
    ) {
    }
  }

  inner class RowSignUpVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSignUpBinding = RowSignUpBinding.bind(itemView)
  }
}
