package com.shiv.stockimagevideofilter.data.remote

import com.shiv.stockimagevideofilter.data.dto.Base
import com.shiv.stockimagevideofilter.data.remote.service.PhotoService
import io.reactivex.Single

class DataRepository {


    fun loadPhotosFromServer(serviceGenerator: ServiceGenerator): Single<Base> {
        val photoService = serviceGenerator.createService(PhotoService::class.java)
        return photoService.fetchPhotos();
    }

}