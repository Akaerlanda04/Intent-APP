package com.example.intentapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Mahasiswa(
    val name: String?,
    val clas: String?,
    val Age: Int?,
    val email: String?,
    val city: String?
):Parcelable

