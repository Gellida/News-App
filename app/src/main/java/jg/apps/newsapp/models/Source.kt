package jg.apps.newsapp.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable
@Parcelize
data class Source(
    val id: String?,
    val name: String
): Parcelable