package com.example.recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecycleView: RecyclerView
    private lateinit var newArrayList:ArrayList<AminoAcidModel>
    lateinit var imageId:Array<Int>
    lateinit var textone: Array<String>
    lateinit var texttwo: Array<String>
    lateinit var texttree: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.ima1,
            R.drawable.ima2,
            R.drawable.ima3,
            R.drawable.ima4,
            R.drawable.ima5,
            R.drawable.ima6,
            R.drawable.ima7,
            R.drawable.ima8,
            R.drawable.ima9,
            R.drawable.ima10,
            R.drawable.ima11,

        )
        textone = arrayOf(
            "Alanio",
            "Colombo",
            "Kandy",
            "Jaffna",
            "Galle",
            "Matara",
            "Hambantota",
            "Kaduwela",
            "Kotte",
            "Nuwara",
        )
        texttwo = arrayOf(
            "Ala",
            "Col",
            "Kay",
            "Jaf",
            "Gae",
            "Mra",
            "Ham",
            "Kad",
            "Kot",
            "Nuw",
        )
        texttree = arrayOf(
            "A",
            "C",
            "K",
            "J",
            "G",
            "M",
            "H",
            "K",
            "K",
            "N",
        )
        newRecycleView=findViewById(R.id.mRecyclerView)
        newRecycleView.layoutManager=LinearLayoutManager(this)
        newRecycleView.setHasFixedSize(true)

        newArrayList = arrayListOf<AminoAcidModel>()
        getUserData()
    }
    private fun getUserData(){
        for(i in imageId.indices){
            val news = AminoAcidModel(textone[i],texttwo[i],texttree[i],imageId[i])
            newArrayList.add(news)
        }
        newRecycleView.adapter=MyAdapter(newArrayList)
    }
}