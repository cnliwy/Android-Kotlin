package com.liwy.kotlin.adapter

import android.content.Context
import android.widget.TextView
import com.liwy.kotlin.R
import com.liwy.kotlin.bean.Menu

/**
 * Created by liwy on 2017/5/24.
 */
class MenuAdapter(context: Context?, mDatas: MutableList<Menu>?) : EasyListAdapter<Menu>(context, mDatas) {

    override fun initView(viewHolder: ViewHolder, position: Int): ViewHolder {
        val menu = mDatas.get(position);
        viewHolder?.getView<TextView>(R.id.tv_text)?.setText(menu.title);
        return viewHolder;
    }

    override fun getLayoutId(): Int {
        return R.layout.item_main;
    }
}