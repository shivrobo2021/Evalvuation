package com.shiv.stockimagevideofilter.data.local

import com.shiv.stockimagevideofilter.data.dto.Photos

interface DbListener {

    fun onSuccess(photos : List<Photos> )

    fun onError( error:String)
}