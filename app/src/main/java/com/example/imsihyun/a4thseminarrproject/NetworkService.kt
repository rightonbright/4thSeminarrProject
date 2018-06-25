package com.example.imsihyun.a4thseminarrproject

import com.example.imsihyun.a4thseminarrproject.get.GetBoardResponse
import com.example.imsihyun.a4thseminarrproject.post.PostBoardResponse
import com.example.imsihyun.a4thseminarrproject.post.PostTemp
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface NetworkService {

    @Multipart
    @POST("board")
    fun postBoard(
            @Part boardImg : MultipartBody.Part?,
            @Part("user_id") id : RequestBody,
            @Part("board_title") title: RequestBody,
            @Part("board_content") content : RequestBody
    ) : Call<PostBoardResponse>


    @GET("board")
    fun getContent() : Call<GetBoardResponse>

    @POST("board")
    fun postPart(
            @Body temp : PostTemp
    ) : Call<Unit>
}