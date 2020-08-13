package com.kakao.jickbangcopy_20200812

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kakao.jickbangcopy_20200812.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

//        ViewRoomDetailCloseBtn.setOnClickListener {
//            finish() //액티비티종료
//            onBackPressed() //뒤로가기
//        }

    }

    override fun setValues() {
//        LIST3.인텐트 받아오기(getSerializableExtra + Casting(as Room))
        val room = intent.getSerializableExtra("roomInfo") as Room
//        메인화면에서 넘겨준 room변환 저장해야 사용가능
        
//        실제 데이터 반영
        priceTxt.text = room.getFormattedPrice()
//        descTxt.text = room.description
        descTxt.text = "${room.getCity()} ${room.getFormattedFloor()} 방입니다"
        addressTxt.text = room.address
        floorTxt.text =  room.getFormattedFloor()
    }

}