package com.wk.tossqrcheck

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            val url = "supertoss://qr-checkin?referrer=widget"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
            finish()
        } catch (e : Exception) {
            Toast.makeText(applicationContext, "토스 앱을 설치하셔야 QR인증이 가능합니다.", Toast.LENGTH_SHORT).show()
            val url = "https://play.google.com/store/apps/details?id=viva.republica.toss"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
            finish()
        }

    }
}