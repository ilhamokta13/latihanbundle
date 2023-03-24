package com.example.latihanbundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihanbundle.databinding.ActivityLoginBinding

class login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val getbundle = intent.extras
        val name = getbundle!!.getString("name")
        val umur = getbundle.getInt("umur")
        binding.txtNama.text = " Halo " + name
        binding.txtUmur.text = " Umurku adalah : $umur"


    }
}