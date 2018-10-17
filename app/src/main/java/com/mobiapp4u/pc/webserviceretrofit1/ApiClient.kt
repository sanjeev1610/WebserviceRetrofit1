package com.mobiapp4u.pc.webserviceretrofit1

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

public class ApiClient{

    companion object {
        val BASE_URL = "http://10.0.2.2/tutorial/"
        var retrofit:Retrofit? = null
        @JvmStatic fun getApiClient():Retrofit{
            if(retrofit == null){
                retrofit = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
            }
            return retrofit!!
        }
    }

}