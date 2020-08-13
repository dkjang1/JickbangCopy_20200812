package com.kakao.jickbangcopy_20200812

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.kakao.jickbangcopy_20200812.adapters.RoomAdapter
import com.kakao.jickbangcopy_20200812.datas.Room
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.room_list_item.*

class MainActivity : BaseActivity() {

    //    STEP5.ArrayList 만들기
    val mRoomList = ArrayList<Room>()
//    화면에 난타나는 방목록(배열)

    //    STEP6.RoomAdapter 만들기
    lateinit var mRoomAdapter: RoomAdapter
//    변수 객체대입(초기화)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        SETP0.BaseActivity 만들기
//        MVP(Minimum Viable Product),MVC(Model , View , Controller)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
//        메인화면 이벤트 함수

//        LIST1.리스트목록 항목을 클릭할경우
        roomListView.setOnItemClickListener { adapterView, view, i, l ->

//            몇번째방인지
            val clickedRoom = mRoomList[i]

//        LIST2.인텐트 보내기(putExtra > Room.kt > Room : Serializable)
            val roomIntent = Intent(mContext, ViewRoomDetailActivity::class.java)
            roomIntent.putExtra("roomInfo", clickedRoom)
            startActivity(roomIntent)

        }
    }

    override fun setValues() {
//        메인화면 값출력
//        방목록
        mRoomList.add(Room(8500, "서울시 은평구", 5, "은평구 방입니다."))
        mRoomList.add(Room(78000, "서울시 은평구", 3, "은평구 방입니다."))
        mRoomList.add(Room(2400, "서울시 은평구", 0, "은평구 방입니다."))
        mRoomList.add(Room(23500, "서울시 서대문구", -1, "서대문구 방입니다."))
        mRoomList.add(Room(175000, "서울시 서대문구", 4, "서대문구 방입니다."))
        mRoomList.add(Room(55000, "서울시 서대문구", 7, "서대문구 방입니다."))
        mRoomList.add(Room(9600, "서울시 동대문구", 0, "동대문구 방입니다."))
        mRoomList.add(Room(38000, "서울시 동대문구", 2, "동대문구 방입니다."))
        mRoomList.add(Room(57000, "서울시 동대문구", -2, "동대문구 방입니다."))
        mRoomList.add(Room(85000, "서울시 동대문구", 5, "동대문구 방입니다."))

//        데이터초기화(초기화 변수를 초기화함:어떤화면,어떤모양,어떤목록)
        mRoomAdapter = RoomAdapter(mContext, R.layout.room_list_item, mRoomList)
//        리스트뷰 어댑터(mRoomAdapter)연결
        roomListView.adapter = mRoomAdapter

//        STEP7.데이터적용

    }
}