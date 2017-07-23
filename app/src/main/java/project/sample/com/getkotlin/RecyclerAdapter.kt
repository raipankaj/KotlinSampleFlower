package project.sample.com.getkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlin.sample.com.getkotlin.R

class RecyclerAdapter(private val detailsList: ArrayList<FlowerModel>)
    : RecyclerView.Adapter<RecyclerAdapter.CustomViewHolder>() {

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        val flower = detailsList[position]

        holder?.tvKeyText?.text = flower.flowerKey
        holder?.tvValueText?.text = flower.flowerValue
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup?, position: Int): CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(viewGroup?.context)
                .inflate(R.layout.recycler_item, viewGroup, false));
    }

    override fun getItemCount(): Int {
        return detailsList.size
    }

    inner class CustomViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var tvKeyText: TextView
        var tvValueText: TextView

        init {
            tvKeyText = itemView?.findViewById(R.id.tv_key) as TextView
            tvValueText = itemView.findViewById(R.id.tv_value) as TextView
        }
    }
}