package com.kakao.jickbangcopy_20200812

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BaseActivity() {

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

    }
}