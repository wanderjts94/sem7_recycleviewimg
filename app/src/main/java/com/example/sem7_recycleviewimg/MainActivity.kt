package com.example.sem7_recycleviewimg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sem7_recycleviewimg.databinding.ActivityMainBinding
import com.example.sem7_recycleviewimg.databinding.ItemAndroidBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvandroid.layoutManager=LinearLayoutManager(applicationContext)
        binding.rvandroid.adapter=AdapterAndroid(
            listaAndroid(),applicationContext)
    }
    fun listaAndroid(): List<Android>{
        var lista = ArrayList<Android>()
        lista.add(
            Android("AngelCake",
                "Android 1.0",
                R.drawable.image1)
        )
        lista.add(
            Android("pettit four",
                "Android 1.5",
                R.drawable.image2))
        lista.add(
            Android("pastelito",
                "Android 1.6",
                R.drawable.image3))
        lista.add(
            Android("donut",
                "Android 2.0-2,1",
                R.drawable.image4))
        lista.add(
            Android("sanwich",
                "Android 2.0-2,1",
                R.drawable.image5))
        lista.add(
            Android("froyo",
                "Android 2.2-2.2.3",
                R.drawable.image6))
        lista.add(
            Android("Gingerbread",
                "Android 2.3 - 2.3.7",
                R.drawable.image7))
        lista.add(
            Android("Honeyconb",
                "Android 3.0 - 3.2.6",
                R.drawable.image8))
        lista.add(
            Android("jellybean",
                "Android 4.1 - 4.3.1",
                R.drawable.image9))
        lista.add(
            Android("Mashmellow",
                "Android 6.0 - 6.0.1",
                R.drawable.image10))
        return  lista
    }
}