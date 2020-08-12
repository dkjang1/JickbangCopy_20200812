package com.kakao.jickbangcopy_20200812.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.kakao.jickbangcopy_20200812.R
import com.kakao.jickbangcopy_20200812.datas.Room

// STEP4.Adapter(Kotlin Class)멤버변수 만들기
class RoomAdapter (
    val mContext: Context,
    val resId: Int,
    val mList: List<Room>
) : ArrayAdapter<Room>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) tempRow = inf.inflate(R.layout.room_list_item, null)
        
        val row =  tempRow!!
        return row
//        return super.getView(position, convertView, parent)
    }



}