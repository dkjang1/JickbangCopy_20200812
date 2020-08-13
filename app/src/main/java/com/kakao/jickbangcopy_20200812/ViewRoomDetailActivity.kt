package com.kakao.jickbangcopy_20200812

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ViewRoomDetailActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
//        LIST3.인텐트 받아오기(getSerializableExtra)
        val room = intent.getSerializableExtra("roomInfo")
    }

}