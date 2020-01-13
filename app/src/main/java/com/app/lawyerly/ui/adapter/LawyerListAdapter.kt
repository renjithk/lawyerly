package com.app.lawyerly.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.lawyerly.R
import com.app.lawyerly.data.LawyerEntity
import com.app.lawyerly.databinding.LayoutLawyerItemBinding
import com.app.lawyerly.ui.viewmodel.LawyerListViewModel

/**
 * Adapter to display list of lawyers on the RecyclerView
 *
 * Created by Renjith Kandanatt on 12/01/2020
 */
class LawyerListAdapter(
    private val viewModel: LawyerListViewModel
) : RecyclerView.Adapter<LawyerListAdapter.ViewHolder>(), IBindableAdapter<List<LawyerEntity>> {
    private val items = mutableListOf<LawyerEntity>()

    override fun setData(data: List<LawyerEntity>) {
        this.items.clear()
        this.items.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_lawyer_item, parent, false))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(items[position])

    inner class ViewHolder(parent: View) : RecyclerView.ViewHolder(parent) {
        private val binding = LayoutLawyerItemBinding.bind(parent)

        fun bind(itemData: LawyerEntity) {
            binding.item = itemData
            binding.viewModel = viewModel
        }
    }
}