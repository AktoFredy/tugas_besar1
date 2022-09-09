package com.example.tubes1.entity

import android.media.Image

class dummy (var namaKota: String, var biaya: Int, var waktu: String){
    companion object{
        @JvmField
        var listOfDummy = arrayOf(
            dummy("Bekasi", 50000, "12 Jam"),
            dummy("Bogor", 40000, "10 Jam"),
            dummy("Boyolali", 10000, "3 Jam"),
            dummy("Gresik", 40000, "9 Jam"),
            dummy("Kediri", 50000, "11 Jam"),
            dummy("Jogja", 10000, "1 Jam"),
            dummy("Solo", 20000, "2 Jam"),
            dummy("Jakarta", 50000, "11 Jam"),
            dummy("Surabaya", 60000, "13 Jam"),
            dummy("Wonosobo", 30000, "5 Jam")
        )
    }
}