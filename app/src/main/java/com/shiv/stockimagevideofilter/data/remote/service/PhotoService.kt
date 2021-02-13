package com.shiv.stockimagevideofilter.data.remote.service

import com.shiv.stockimagevideofilter.data.dto.Base
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface PhotoService {

    @Headers("Authorization: 563492ad6f917000010000018c51c674d6af4113844da9b77db0c686")
    @GET("https://api.pexels.com/v1/curated")
    fun fetchPhotos(): Single<Base>
}