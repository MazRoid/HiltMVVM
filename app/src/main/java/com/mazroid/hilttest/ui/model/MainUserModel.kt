package com.mazroid.hilttest.ui.model

import android.os.Parcelable
import androidx.room.*
import kotlinx.android.parcel.Parcelize
import com.google.gson.annotations.SerializedName

@Parcelize
@Entity(tableName = "MainUserModel")
data class MainUserModel(
    @ColumnInfo(name = "info")
    @SerializedName("info")
    var info: Info,
    @ColumnInfo(name = "results")
    @SerializedName("results")
    var results: List<ResultUser>
) : Parcelable

@Parcelize
data class Info(
    @ColumnInfo(name = "page")
    @SerializedName("page")
    var page: Int,
    @ColumnInfo(name = "results")
    @SerializedName("results")
    var results: Int,
    @ColumnInfo(name = "seed")
    @SerializedName("seed")
    var seed: String,
    @ColumnInfo(name = "version")
    @SerializedName("version")
    var version: String
) : Parcelable

@Parcelize
data class ResultUser(
    @ColumnInfo(name = "cell")
    @SerializedName("cell")
    var cell: String,
    @ColumnInfo(name = "dob")
    @SerializedName("dob")
    var dob: Dob,
    @ColumnInfo(name = "email")
    @SerializedName("email")
    var email: String,
    @ColumnInfo(name = "gender")
    @SerializedName("gender")
    var gender: String,
    @ColumnInfo(name = "id")
    @SerializedName("id")
    var id: Id,
    @ColumnInfo(name = "location")
    @SerializedName("location")
    var location: Location,
//    @ColumnInfo(name = "login")
//    @SerializedName("login")
//    var login: Login,
    @ColumnInfo(name = "name")
    @SerializedName("name")
    var name: Name,
    @ColumnInfo(name = "nat")
    @SerializedName("nat")
    var nat: String,
    @ColumnInfo(name = "phone")
    @SerializedName("phone")
    var phone: String,
    @ColumnInfo(name = "picture")
    @SerializedName("picture")
    var picture: Picture,
    @ColumnInfo(name = "registered")
    @SerializedName("registered")
    var registered: Registered
) : Parcelable {
    @Parcelize
    data class Dob(
        @ColumnInfo(name = "age")
        @SerializedName("age")
        var age: Int,
        @ColumnInfo(name = "date")
        @SerializedName("date")
        var date: String
    ) : Parcelable

    @Parcelize
    data class Id(
        @ColumnInfo(name = "name")
        @SerializedName("name")
        var name: String,
        @ColumnInfo(name = "value")
        @SerializedName("value")
        var value: String
    ) : Parcelable

    /* Not Used
    @Parcelize
    data class Login(
        @ColumnInfo(name = "md5")
        @SerializedName("md5")
        var md5: String,
        @ColumnInfo(name = "password")
        @SerializedName("password")
        var password: String,
        @ColumnInfo(name = "salt")
        @SerializedName("salt")
        var salt: String,
        @ColumnInfo(name = "sha1")
        @SerializedName("sha1")
        var sha1: String,
        @ColumnInfo(name = "sha256")
        @SerializedName("sha256")
        var sha256: String,
        @ColumnInfo(name = "username")
        @SerializedName("username")
        var username: String,
        @ColumnInfo(name = "uuid")
        @SerializedName("uuid")
        var uuid: String
    ) : Parcelable*/

    @Parcelize
    data class Name(
        @ColumnInfo(name = "first")
        @SerializedName("first")
        var first: String,
        @ColumnInfo(name = "last")
        @SerializedName("last")
        var last: String,
        @ColumnInfo(name = "title")
        @SerializedName("title")
        var title: String
    ) : Parcelable

    @Parcelize
    data class Picture(
        @ColumnInfo(name = "large")
        @SerializedName("large")
        var large: String,
        @ColumnInfo(name = "medium")
        @SerializedName("medium")
        var medium: String,
        @ColumnInfo(name = "thumbnail")
        @SerializedName("thumbnail")
        var thumbnail: String
    ) : Parcelable

    @Parcelize
    data class Registered(
        @ColumnInfo(name = "age")
        @SerializedName("age")
        var age: Int,
        @ColumnInfo(name = "date")
        @SerializedName("date")
        var date: String
    ) : Parcelable
}

@Parcelize
data class Location(
    @ColumnInfo(name = "city")
    @SerializedName("city")
    var city: String,
    @ColumnInfo(name = "coordinates")
    @SerializedName("coordinates")
    var coordinates: Coordinates,
    @ColumnInfo(name = "country")
    @SerializedName("country")
    var country: String,
    @ColumnInfo(name = "postcode")
    @SerializedName("postcode")
    var postcode: Int,
    @ColumnInfo(name = "state")
    @SerializedName("state")
    var state: String,
    @ColumnInfo(name = "street")
    @SerializedName("street")
    var street: Street,
    @ColumnInfo(name = "timezone")
    @SerializedName("timezone")
    var timezone: Timezone
) : Parcelable
{
    @Parcelize
    data class Coordinates(
        @ColumnInfo(name = "latitude")
        @SerializedName("latitude")
        var latitude: String,
        @ColumnInfo(name = "longitude")
        @SerializedName("longitude")
        var longitude: String
    ) : Parcelable

    @Parcelize
    data class Street(
        @ColumnInfo(name = "name")
        @SerializedName("name")
        var name: String,
        @ColumnInfo(name = "number")
        @SerializedName("number")
        var number: Int
    ) : Parcelable

    @Parcelize
    data class Timezone(
        @ColumnInfo(name = "description")
        @SerializedName("description")
        var description: String,
        @ColumnInfo(name = "offset")
        @SerializedName("offset")
        var offset: String
    ) : Parcelable
}