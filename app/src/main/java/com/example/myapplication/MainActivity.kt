package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val dataList = ArrayList<Data>()
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        listInit()
        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = Adapter(dataList)
    }

    fun listInit(){
        dataList.add(Data("pureum1", "T2",  1))
        dataList.add(Data("pureum2", "T2", 2))
        dataList.add(Data("pureum3", "T2", 3))
        dataList.add(Data("pureum4", "T2", 1))
        dataList.add(Data("pureum5", "T2", 2))
        dataList.add(Data("pureum6", "T2", 3))
        dataList.add(Data("pureum7", "T2", 1))
        dataList.add(Data("pureum8", "T2", 2))
        dataList.add(Data("pureum9", "T2", 3))
        dataList.add(Data("pureum10", "T2", 1))
        dataList.add(Data("pureum11", "T2", 2))
        dataList.add(Data("pureum12", "T2", 3))
        dataList.add(Data("pureum13", "T2", 1))
        dataList.add(Data("pureum14", "T2", 2))
        dataList.add(Data("pureum15", "T2", 3))
        dataList.add(Data("pureum16", "T2", 1))
        dataList.add(Data("pureum17", "T2", 2))
        dataList.add(Data("pureum18", "T2", 3))
    }
}