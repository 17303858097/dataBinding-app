package com.jqz.databindingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.setPadding
import androidx.databinding.DataBindingUtil
import com.jqz.databindingproject.databinding.ActivityMainBinding
import com.jqz.databindingproject.model.DataBean

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.bean = DataBean("张三", 19, "男")
        //第二个版本


    }
}