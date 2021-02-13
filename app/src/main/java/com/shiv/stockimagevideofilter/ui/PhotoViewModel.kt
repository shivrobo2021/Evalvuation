package com.shiv.stockimagevideofilter.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shiv.stockimagevideofilter.data.dto.Photos
import com.shiv.stockimagevideofilter.data.remote.DataRepository
import com.shiv.stockimagevideofilter.data.remote.ServiceGenerator
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class PhotoViewModel : ViewModel() {

    val photos = MutableLiveData<List<Photos>>()
    private val compositeDisposable = CompositeDisposable()

     init {
         compositeDisposable.add(
             DataRepository().loadPhotosFromServer(ServiceGenerator())
                 .subscribeOn(Schedulers.io())
                 .observeOn(AndroidSchedulers.mainThread())
                 .subscribe({ photoList ->
                     photos.postValue(photoList.photos)
                 }, { throwable ->
                     photos.postValue(null)
                 }))
     }


    fun updateFavourite(photo:Photos){

    }

}