package com.example.tools.models.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "movies")
data class MovieDB(

    @PrimaryKey
    var movieId: String,
    var rating: Float? = 0f,
    var synopsis: String? = "",
    var title: String? = "",
    var year: Int? = 0
): Parcelable