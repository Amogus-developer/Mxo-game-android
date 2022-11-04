package com.example.mxo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    var start = 1
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageNolik1 = findViewById<ImageView>(R.id.imageNolik1)
        val imageNolik2 = findViewById<ImageView>(R.id.imageNolik2)
        val imageNolik3 = findViewById<ImageView>(R.id.imageNolik3)
        val imageNolik4 = findViewById<ImageView>(R.id.imageNolik4)
        val imageNolik5 = findViewById<ImageView>(R.id.imageNolik5)
        val imageNolik6 = findViewById<ImageView>(R.id.imageNolik6)
        val imageNolik7 = findViewById<ImageView>(R.id.imageNolik7)
        val imageNolik8 = findViewById<ImageView>(R.id.imageNolik8)
        val imageNolik9 = findViewById<ImageView>(R.id.imageNolik9)

        val imageKrest1 = findViewById<ImageView>(R.id.imageKrest1)
        val imageKrest2 = findViewById<ImageView>(R.id.imageKrest2)
        val imageKrest3 = findViewById<ImageView>(R.id.imageKrest3)
        val imageKrest4 = findViewById<ImageView>(R.id.imageKrest4)
        val imageKrest5 = findViewById<ImageView>(R.id.imageKrest5)
        val imageKrest6 = findViewById<ImageView>(R.id.imageKrest6)
        val imageKrest7 = findViewById<ImageView>(R.id.imageKrest7)
        val imageKrest8 = findViewById<ImageView>(R.id.imageKrest8)
        val imageKrest9 = findViewById<ImageView>(R.id.imageKrest9)

        val imagePlank = findViewById<ImageView>(R.id.imagePlank)
        val imagePlank2 = findViewById<ImageView>(R.id.imagePlank2)
        val imagePlank3 = findViewById<ImageView>(R.id.imagePlank3)
        val imagePlank90a = findViewById<ImageView>(R.id.imagePlank90a)
        val imagePlank90a1 = findViewById<ImageView>(R.id.imagePlank90a1)
        val imagePlank90a2 = findViewById<ImageView>(R.id.imagePlank90a2)
        val imagePlankLeft = findViewById<ImageView>(R.id.imagePlankLeft)
        val imagePlankRight = findViewById<ImageView>(R.id.imagePlankRight)

        imagePlank.visibility = View.INVISIBLE
        imagePlank2.visibility = View.INVISIBLE
        imagePlank3.visibility = View.INVISIBLE
        imagePlank90a.visibility = View.INVISIBLE
        imagePlank90a1.visibility = View.INVISIBLE
        imagePlank90a2.visibility = View.INVISIBLE
        imagePlankRight.visibility = View.INVISIBLE
        imagePlankLeft.visibility = View.INVISIBLE

        imageKrest1.visibility = View.INVISIBLE
        imageKrest2.visibility = View.INVISIBLE
        imageKrest3.visibility = View.INVISIBLE
        imageKrest4.visibility = View.INVISIBLE
        imageKrest5.visibility = View.INVISIBLE
        imageKrest6.visibility = View.INVISIBLE
        imageKrest7.visibility = View.INVISIBLE
        imageKrest8.visibility = View.INVISIBLE
        imageKrest9.visibility = View.INVISIBLE

        imageNolik1.visibility = View.INVISIBLE
        imageNolik2.visibility = View.INVISIBLE
        imageNolik3.visibility = View.INVISIBLE
        imageNolik4.visibility = View.INVISIBLE
        imageNolik5.visibility = View.INVISIBLE
        imageNolik6.visibility = View.INVISIBLE
        imageNolik7.visibility = View.INVISIBLE
        imageNolik8.visibility = View.INVISIBLE
        imageNolik9.visibility = View.INVISIBLE

        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener{
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            2/0
        }
        val buttonPoop = findViewById<Button>(R.id.buttonPoop)
        buttonPoop.setOnClickListener {
            imageNolik1.visibility = View.VISIBLE
            imageNolik2.visibility = View.VISIBLE
            imageNolik3.visibility = View.VISIBLE
            imageNolik4.visibility = View.VISIBLE
            imageNolik5.visibility = View.VISIBLE
            imageNolik6.visibility = View.VISIBLE
            imageNolik7.visibility = View.VISIBLE
            imageNolik8.visibility = View.VISIBLE
            imageNolik9.visibility = View.VISIBLE
        }

        if (start == 1){
            xX()
        }
    }
    fun xX(){
        val imageBall1 = findViewById<ImageView>(R.id.imageBall1)
        val imageBall2 = findViewById<ImageView>(R.id.imageBall2)
        val imageBall3 = findViewById<ImageView>(R.id.imageBall3)
        val imageBall4 = findViewById<ImageView>(R.id.imageBall4)
        val imageBall5 = findViewById<ImageView>(R.id.imageBall5)
        val imageBall6 = findViewById<ImageView>(R.id.imageBall6)
        val imageBall7 = findViewById<ImageView>(R.id.imageBall7)
        val imageBall8 = findViewById<ImageView>(R.id.imageBall8)
        val imageBall9 = findViewById<ImageView>(R.id.imageBall9)

        val imageKrest1 = findViewById<ImageView>(R.id.imageKrest1)
        val imageKrest2 = findViewById<ImageView>(R.id.imageKrest2)
        val imageKrest3 = findViewById<ImageView>(R.id.imageKrest3)
        val imageKrest4 = findViewById<ImageView>(R.id.imageKrest4)
        val imageKrest5 = findViewById<ImageView>(R.id.imageKrest5)
        val imageKrest6 = findViewById<ImageView>(R.id.imageKrest6)
        val imageKrest7 = findViewById<ImageView>(R.id.imageKrest7)
        val imageKrest8 = findViewById<ImageView>(R.id.imageKrest8)
        val imageKrest9 = findViewById<ImageView>(R.id.imageKrest9)

        imageBall1.setOnClickListener {
            imageBall1.visibility = View.INVISIBLE
            imageKrest1.visibility = View.VISIBLE
            proX()
        }
        imageBall2.setOnClickListener {
            imageBall2.visibility = View.INVISIBLE
            imageKrest2.visibility = View.VISIBLE
            proX()

        }
        imageBall3.setOnClickListener {
            imageBall3.visibility = View.INVISIBLE
            imageKrest3.visibility = View.VISIBLE
            proX()
        }
        imageBall4.setOnClickListener {
            imageBall4.visibility = View.INVISIBLE
            imageKrest4.visibility = View.VISIBLE
            proX()
        }
        imageBall5.setOnClickListener {
            imageBall5.visibility = View.INVISIBLE
            imageKrest5.visibility = View.VISIBLE
            proX()
        }
        imageBall6.setOnClickListener {
            imageBall6.visibility = View.INVISIBLE
            imageKrest6.visibility = View.VISIBLE
            proX()
        }
        imageBall7.setOnClickListener {
            imageBall7.visibility = View.INVISIBLE
            imageKrest7.visibility = View.VISIBLE
            proX()
        }
        imageBall8.setOnClickListener {
            imageBall8.visibility = View.INVISIBLE
            imageKrest8.visibility = View.VISIBLE
            proX()
        }
        imageBall9.setOnClickListener {
            imageBall9.visibility = View.INVISIBLE
            imageKrest9.visibility = View.VISIBLE
            proX()
        }
    }
    fun oO(){
        val imageBall1 = findViewById<ImageView>(R.id.imageBall1)
        val imageBall2 = findViewById<ImageView>(R.id.imageBall2)
        val imageBall3 = findViewById<ImageView>(R.id.imageBall3)
        val imageBall4 = findViewById<ImageView>(R.id.imageBall4)
        val imageBall5 = findViewById<ImageView>(R.id.imageBall5)
        val imageBall6 = findViewById<ImageView>(R.id.imageBall6)
        val imageBall7 = findViewById<ImageView>(R.id.imageBall7)
        val imageBall8 = findViewById<ImageView>(R.id.imageBall8)
        val imageBall9 = findViewById<ImageView>(R.id.imageBall9)

        val imageNolik1 = findViewById<ImageView>(R.id.imageNolik1)
        val imageNolik2 = findViewById<ImageView>(R.id.imageNolik2)
        val imageNolik3 = findViewById<ImageView>(R.id.imageNolik3)
        val imageNolik4 = findViewById<ImageView>(R.id.imageNolik4)
        val imageNolik5 = findViewById<ImageView>(R.id.imageNolik5)
        val imageNolik6 = findViewById<ImageView>(R.id.imageNolik6)
        val imageNolik7 = findViewById<ImageView>(R.id.imageNolik7)
        val imageNolik8 = findViewById<ImageView>(R.id.imageNolik8)
        val imageNolik9 = findViewById<ImageView>(R.id.imageNolik9)

        imageBall1.setOnClickListener {
            imageBall1.visibility = View.INVISIBLE
            imageNolik1.visibility = View.VISIBLE
            proO()
        }
        imageBall2.setOnClickListener {
            imageBall2.visibility = View.INVISIBLE
            imageNolik2.visibility = View.VISIBLE
            proO()
        }
        imageBall3.setOnClickListener {
            imageBall3.visibility = View.INVISIBLE
            imageNolik3.visibility = View.VISIBLE
            proO()
        }
        imageBall4.setOnClickListener {
            imageBall4.visibility = View.INVISIBLE
            imageNolik4.visibility = View.VISIBLE
            proO()
        }
        imageBall5.setOnClickListener {
            imageBall5.visibility = View.INVISIBLE
            imageNolik5.visibility = View.VISIBLE
            proO()
        }
        imageBall6.setOnClickListener {
            imageBall6.visibility = View.INVISIBLE
            imageNolik6.visibility = View.VISIBLE
            proO()
        }
        imageBall7.setOnClickListener {
            imageBall7.visibility = View.INVISIBLE
            imageNolik7.visibility = View.VISIBLE
            proO()
        }
        imageBall8.setOnClickListener {
            imageBall8.visibility = View.INVISIBLE
            imageNolik8.visibility = View.VISIBLE
            proO()
        }
        imageBall9.setOnClickListener {
            imageBall9.visibility = View.INVISIBLE
            imageNolik9.visibility = View.VISIBLE
            proO()
        }
    }
    fun rStartX(){
        val imageNolikS = findViewById<ImageView>(R.id.imageNolikS)
        imageNolikS.visibility = View.INVISIBLE
    }
    fun rStartO(){
        val imageKrestS = findViewById<ImageView>(R.id.imageKrestS)
        imageKrestS.visibility = View.INVISIBLE
    }
    fun proX(){
        val imageKrest1 = findViewById<ImageView>(R.id.imageKrest1)
        val imageKrest2 = findViewById<ImageView>(R.id.imageKrest2)
        val imageKrest3 = findViewById<ImageView>(R.id.imageKrest3)
        val imageKrest4 = findViewById<ImageView>(R.id.imageKrest4)
        val imageKrest5 = findViewById<ImageView>(R.id.imageKrest5)
        val imageKrest6 = findViewById<ImageView>(R.id.imageKrest6)
        val imageKrest7 = findViewById<ImageView>(R.id.imageKrest7)
        val imageKrest8 = findViewById<ImageView>(R.id.imageKrest8)
        val imageKrest9 = findViewById<ImageView>(R.id.imageKrest9)

        val imagePlank = findViewById<ImageView>(R.id.imagePlank)
        val imagePlank2 = findViewById<ImageView>(R.id.imagePlank2)
        val imagePlank3 = findViewById<ImageView>(R.id.imagePlank3)
        val imagePlank90a = findViewById<ImageView>(R.id.imagePlank90a)
        val imagePlank90a1 = findViewById<ImageView>(R.id.imagePlank90a1)
        val imagePlank90a2 = findViewById<ImageView>(R.id.imagePlank90a2)
        val imagePlankLeft = findViewById<ImageView>(R.id.imagePlankLeft)
        val imagePlankRight = findViewById<ImageView>(R.id.imagePlankRight)

        if (imageKrest1.visibility == View.VISIBLE && imageKrest2.visibility == View.VISIBLE && imageKrest3.visibility == View.VISIBLE ){
            imagePlank.visibility = View.VISIBLE
            rStartX()
        }
        if (imageKrest4.visibility == View.VISIBLE && imageKrest5.visibility == View.VISIBLE && imageKrest6.visibility == View.VISIBLE ){
            imagePlank2.visibility = View.VISIBLE
            rStartX()
        }
        if (imageKrest7.visibility == View.VISIBLE && imageKrest8.visibility == View.VISIBLE && imageKrest9.visibility == View.VISIBLE ){
            imagePlank3.visibility = View.VISIBLE
            rStartX()
        }
        if (imageKrest1.visibility == View.VISIBLE && imageKrest4.visibility == View.VISIBLE && imageKrest7.visibility == View.VISIBLE){
            imagePlank90a.visibility = View.VISIBLE
            rStartX()
        }
        if (imageKrest2.visibility == View.VISIBLE && imageKrest5.visibility == View.VISIBLE && imageKrest8.visibility == View.VISIBLE){
            imagePlank90a1.visibility = View.VISIBLE
            rStartX()
        }
        if (imageKrest3.visibility == View.VISIBLE && imageKrest6.visibility == View.VISIBLE && imageKrest9.visibility == View.VISIBLE){
            imagePlank90a2.visibility = View.VISIBLE
            rStartX()
        }
        if (imageKrest1.visibility == View.VISIBLE && imageKrest5.visibility == View.VISIBLE && imageKrest9.visibility == View.VISIBLE){
            imagePlankLeft.visibility = View.VISIBLE
            rStartX()
        }
        if (imageKrest3.visibility == View.VISIBLE && imageKrest5.visibility == View.VISIBLE && imageKrest7.visibility == View.VISIBLE){
            imagePlankRight.visibility = View.VISIBLE
            rStartX()
        }
        else{
            oO()
        }
    }
    fun proO(){
        val imageNolik1 = findViewById<ImageView>(R.id.imageNolik1)
        val imageNolik2 = findViewById<ImageView>(R.id.imageNolik2)
        val imageNolik3 = findViewById<ImageView>(R.id.imageNolik3)
        val imageNolik4 = findViewById<ImageView>(R.id.imageNolik4)
        val imageNolik5 = findViewById<ImageView>(R.id.imageNolik5)
        val imageNolik6 = findViewById<ImageView>(R.id.imageNolik6)
        val imageNolik7 = findViewById<ImageView>(R.id.imageNolik7)
        val imageNolik8 = findViewById<ImageView>(R.id.imageNolik8)
        val imageNolik9 = findViewById<ImageView>(R.id.imageNolik9)

        val imagePlank = findViewById<ImageView>(R.id.imagePlank)
        val imagePlank2 = findViewById<ImageView>(R.id.imagePlank2)
        val imagePlank3 = findViewById<ImageView>(R.id.imagePlank3)
        val imagePlank90a = findViewById<ImageView>(R.id.imagePlank90a)
        val imagePlank90a1 = findViewById<ImageView>(R.id.imagePlank90a1)
        val imagePlank90a2 = findViewById<ImageView>(R.id.imagePlank90a2)
        val imagePlankLeft = findViewById<ImageView>(R.id.imagePlankLeft)
        val imagePlankRight = findViewById<ImageView>(R.id.imagePlankRight)

        if (imageNolik1.visibility == View.VISIBLE && imageNolik2.visibility == View.VISIBLE && imageNolik3.visibility == View.VISIBLE ){
            imagePlank.visibility = View.VISIBLE
            rStartO()
        }
        if (imageNolik4.visibility == View.VISIBLE && imageNolik5.visibility == View.VISIBLE && imageNolik6.visibility == View.VISIBLE ){
            imagePlank2.visibility = View.VISIBLE
            rStartO()
        }
        if (imageNolik7.visibility == View.VISIBLE && imageNolik8.visibility == View.VISIBLE && imageNolik9.visibility == View.VISIBLE ){
            imagePlank3.visibility = View.VISIBLE
            rStartO()
        }
        if (imageNolik1.visibility == View.VISIBLE && imageNolik4.visibility == View.VISIBLE && imageNolik7.visibility == View.VISIBLE){
            imagePlank90a.visibility = View.VISIBLE
            rStartO()
        }
        if (imageNolik2.visibility == View.VISIBLE && imageNolik5.visibility == View.VISIBLE && imageNolik8.visibility == View.VISIBLE){
            imagePlank90a1.visibility = View.VISIBLE
            rStartO()
        }
        if (imageNolik3.visibility == View.VISIBLE && imageNolik6.visibility == View.VISIBLE && imageNolik9.visibility == View.VISIBLE){
            imagePlank90a2.visibility = View.VISIBLE
            rStartO()
        }
        if (imageNolik1.visibility == View.VISIBLE && imageNolik5.visibility == View.VISIBLE && imageNolik9.visibility == View.VISIBLE){
            imagePlankLeft.visibility = View.VISIBLE
            rStartO()
        }
        if (imageNolik3.visibility == View.VISIBLE && imageNolik5.visibility == View.VISIBLE && imageNolik7.visibility == View.VISIBLE){
            imagePlankRight.visibility = View.VISIBLE
            rStartO()
        }
        else{
            xX()
        }
    }
}