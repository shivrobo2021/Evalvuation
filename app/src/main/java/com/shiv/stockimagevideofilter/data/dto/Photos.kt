package com.shiv.stockimagevideofilter.data.dto

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.google.gson.annotations.SerializedName
import com.shiv.stockimagevideofilter.data.dto.Src
import com.shiv.stockimagevideofilter.data.local.Converter

@Entity(tableName = "Photos")
data class Photos(

    @SerializedName("id") val id: Int,
    @SerializedName("width") val width: Int,
    @SerializedName("height") val height: Int,
    @SerializedName("url") val url: String,
    @SerializedName("photographer") val photographer: String,
    @SerializedName("photographer_url") val photographer_url: String,
    @SerializedName("photographer_id") val photographer_id: Int,
    @SerializedName("avg_color") val avg_color: String,
    @TypeConverters(Converter::class) val src: Src,
    @SerializedName("liked") val liked: Boolean,


    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idDB")
    var idDb: Int? = null

)