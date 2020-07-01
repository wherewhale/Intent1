package com.example.one2two

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        //intent로 부터 존재하는 문자열을 현재 Activity에 추출해옴
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // 레이아웃의 TextView를 확인해서 Text를 추출한 message로 설정함
        val textView = findViewById<TextView>(R.id.textView).apply{
            text = message
        }
    }
}