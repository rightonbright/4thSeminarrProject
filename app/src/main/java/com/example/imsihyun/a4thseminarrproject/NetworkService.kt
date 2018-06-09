package com.example.imsihyun.a4thseminarrproject

import android.telecom.Call
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface NetworkService {

    // 파일 보내기
    @Multipart
    @POST("board")
    fun postBoard (
            @Part boardImag                     : MultipartBody.Part?,
            @Part("user_id") id           : RequestBody,
            @Part("user_title") title     : RequestBody,
            @Part("user_content") content : RequestBody
    ) : Call<PostBoardResponse>

    // 파일 받아오기
    @GET("board")
    fun getContent() : Call<GetBoardResponse>
}