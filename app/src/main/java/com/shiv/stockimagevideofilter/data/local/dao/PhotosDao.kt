package com.shiv.stockimagevideofilter.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.shiv.stockimagevideofilter.data.dto.Photos
import io.reactivex.Completable
import io.reactivex.Single
@Dao
interface PhotosDao {

    @Query("SELECT * FROM Photos")
    fun getAll(): Single<List<Photos>>

    @Insert
    fun insertAll(vararg photo: Photos): Completable

    @Delete
    fun delete(photo: Photos)
}