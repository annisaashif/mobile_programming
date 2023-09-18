package com.example.belajarkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var input_tinggi:EditText
    private lateinit var input_panjang:EditText
    private lateinit var input_lebar:EditText
    private lateinit var btn:Button
    private lateinit var result:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisialisasi variabel
        input_panjang=findViewById(R.id.edt_length)
        input_lebar=findViewById(R.id.edt_width)
        input_tinggi=findViewById(R.id.edt_height)
        btn=findViewById(R.id.btn_result)
        result=findViewById(R.id.result)

        btn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
       if( v?.id == R.id.btn_result){
           var tinggi = input_tinggi.text.toString().trim()
           var panjang = input_panjang.text.toString().trim()
           var lebar = input_lebar.text.toString().trim()
           var check = false

           // type data

           if(tinggi.isEmpty()){
               check = true
               input_tinggi.error = "Wajib Diisi"
           }

           if(panjang.isEmpty()){
               check = true
               input_panjang.error = "Wajib Diisi"
           }

           if(lebar.isEmpty()){
               check = true
               input_lebar.error = "Wajib Diisi"
           }

           if(!check){
               var volume = tinggi.toDouble()*lebar.toDouble()*panjang.toDouble()
               result.text = volume.toString()
           }

       }
    }
}