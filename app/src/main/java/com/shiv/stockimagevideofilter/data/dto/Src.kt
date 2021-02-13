package com.shiv.stockimagevideofilter.data.dto

import androidx.room.TypeConverters
import com.google.gson.annotations.SerializedName
import com.shiv.stockimagevideofilter.data.local.Converter


@TypeConverters(Converter::class)
data class Src (

	@SerializedName("original") val original : String,
	@SerializedName("large2x") val large2x : String,
	@SerializedName("large") val large : String,
	@SerializedName("medium") val medium : String,
	@SerializedName("small") val small : String,
	@SerializedName("portrait") val portrait : String,
	@SerializedName("landscape") val landscape : String,
	@SerializedName("tiny") val tiny : String
)