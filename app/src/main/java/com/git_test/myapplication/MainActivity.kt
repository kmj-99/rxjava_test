package com.git_test.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.git_test.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)
        setButton()

    }

    private fun setButton(){
        binding.btn.setOnClickListener {
            Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show()
        }
    }
}