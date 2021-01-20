package com.jqz.databindingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jqz.databindingproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        binding.bean = DataBean("张三", 19, "男")
        //我在模拟合并冲突


    }
}