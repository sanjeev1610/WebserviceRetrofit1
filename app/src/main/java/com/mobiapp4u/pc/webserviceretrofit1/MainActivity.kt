package com.mobiapp4u.pc.webserviceretrofit1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import org.reactivestreams.Subscriber
import retrofit2.Call

class MainActivity : AppCompatActivity() {

    var brand:List<Brand>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView_main.layoutManager = LinearLayoutManager(this)
        recyclerView_main.setHasFixedSize(true)


        val apiInterface = ApiClient.getApiClient().create(APiInterface::class.java)
        val resp = apiInterface.posts
        resp.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    val adpter = RecyclerAdapter(this,it)
                    recyclerView_main.adapter = adpter

                }



    }
}
