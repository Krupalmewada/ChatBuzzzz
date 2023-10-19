package com.example.chatbuzzzz.`interface`


import com.example.chatbuzzzz.constants.Constants.Companion.CONTENT_TYPE
import com.example.chatbuzzzz.constants.Constants.Companion.SERVER_KEY
import com.example.chatbuzzzz.model.PushNotification
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface NotificationApi {

    @Headers(/* ...value = */ "Authorization: key=$SERVER_KEY", "Content-type:$CONTENT_TYPE")
    @POST("fcm/send")
    suspend fun postNotification(
        @Body notification : PushNotification
    ): Response<ResponseBody>

}