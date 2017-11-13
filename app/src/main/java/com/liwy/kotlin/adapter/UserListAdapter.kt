package com.liwy.kotlin.adapter

import android.content.Context
import android.widget.TextView
import com.liwy.kotlin.R
import com.liwy.kotlin.bean.User

/**
 * Created by liwy on 2017/11/9.
 */

class UserListAdapter(mContext:Context,mData:List<User>) : EasyListAdapter<User>(mContext,mData){
    override fun initView(viewHolder: ViewHolder?, position: Int): ViewHolder? {
        viewHolder?.getView<TextView>(R.id.tv_username)?.setText("张三")
        return viewHolder
    }

    override fun getLayoutId(): Int {
        return R.layout.item_user
    }

}
