package com.shiv.stockimagevideofilter.data.local

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.shiv.stockimagevideofilter.data.dto.Src
import javax.xml.transform.Source

class Converter {

    @TypeConverter
    fun stringToSource(value: String?): Src? {
        return  Gson().fromJson(value, Src::class.java)
    }

    @TypeConverter
    fun sourceToString(source: Src): String? {
        return Gson().toJson(source)
    }
}