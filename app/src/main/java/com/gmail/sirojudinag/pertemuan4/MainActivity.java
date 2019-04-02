package com.gmail.sirojudinag.pertemuan4;
//nama package dari java

import android.support.v7.app.AppCompatActivity;
//import package untuk sopport compability app.
import android.os.Bundle;
//proses import package dari android bundle

public class MainActivity extends AppCompatActivity {
    //membuat class turunan dari main activity dengan nama AppCompatActivity

    @Override
    //method overriding
    protected void onCreate(Bundle savedInstanceState) {
        //Secara default, sistem menggunakan status instance Bundle untuk menyimpan informasi tentang setiap objek 
        super.onCreate(savedInstanceState);
        //sistem sedang membuat instance baru aktivitas maupun membuat ulang instance sebelumnya.
        setContentView(R.layout.activity_main);
         //Ini adalah metode Java yang disebut setContentView, yang akan menampilkan layout dari activity_main
    }
}
