package com.mobiapp4u.pc.webserviceretrofit1

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface APiInterface {

@get:GET("prod.php")
val posts:Observable<List<Brand>>

}