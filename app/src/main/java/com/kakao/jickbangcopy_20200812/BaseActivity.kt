package com.kakao.jickbangcopy_20200812

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
//    어느화면인지 알려줄떄 변수
    val mContext = this
    
//    이벤트 처리코드 함수
    abstract fun setupEvents()
    
//    화면데이터 보여주는 함수
    abstract fun setValues()

}