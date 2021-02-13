package com.shiv.stockimagevideofilter.data.local

import android.content.Context
import com.shiv.stockimagevideofilter.data.dto.Photos
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class DatabaseHelper (context: Context){

    private var appDatabase:AppDatabase? = AppDatabase.getAppDataBase(context)
    fun fetchPhotosFromDb(listener: DbListener){
        appDatabase?.photosDao()?.getAll()
            ?.subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.subscribe ({ it ->
                listener.onSuccess(it)
            },{
                listener.onError(it.localizedMessage.toString())
            })?.let {
            }
    }


    fun insertArticles(photos: Photos){
        appDatabase?.photosDao()?.insertAll(photos)?.subscribeOn(Schedulers.io())?.observeOn(
            AndroidSchedulers.mainThread())?.subscribe({
        },{
        }).let {
        }
    }
}