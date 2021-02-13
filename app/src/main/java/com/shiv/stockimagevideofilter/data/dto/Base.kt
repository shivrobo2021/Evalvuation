package com.shiv.stockimagevideofilter.data.dto

import com.google.gson.annotations.SerializedName
import com.shiv.stockimagevideofilter.data.dto.Photos



data class Base (

	@SerializedName("page") val page : Int,
	@SerializedName("per_page") val per_page : Int,
	@SerializedName("photos") val photos : List<Photos>,
	@SerializedName("total_results") val total_results : Int,
	@SerializedName("next_page") val next_page : String
)