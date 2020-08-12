package com.kakao.jickbangcopy_20200812

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kakao.jickbangcopy_20200812.datas.Room

class MainActivity : BaseActivity() {

//    STEP5.ArrayList 만들기
    val mRoomList = ArrayList<Room>()

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
    }
}