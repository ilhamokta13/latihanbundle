package com.example.latihanbundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihanbundle.databinding.ActivityLoginBinding
import com.example.latihanbundle.databinding.ActivityRegisterBinding

class register : AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSave.setOnClickListener{
            val namasaya = binding.txtnama.text.toString()
            val tahunlahir = binding.txttahunLahir.text.toString().toInt()
            val pindah = Intent(this, login::class.java)
            val umur = 2023 - tahunlahir

            val bundle = Bundle()
            bundle.putString("name", namasaya)
            bundle.putInt("umur",umur)
            pindah.putExtras(bundle)
            startActivity(pindah)

        }
    }
}