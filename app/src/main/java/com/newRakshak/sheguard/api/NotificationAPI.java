package com.newRakshak.sheguard.api;

import com.newRakshak.sheguard.model.NotificationSenderModel;
import com.newRakshak.sheguard.util.NotificationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface NotificationAPI {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAu79pAmM:APA91bFBAdjmJt17MF4nFtZl53ISVH5Xn6gy3988HzJUcP4qeqpFK3LbvJv7sRQuemMw8LL6pGBdhN4QSF13xCYn_RQA7MuVJ5SMzjtNSDweA56ZJp2AzfjF-GQQkK8EjHdpvQ6TyWln" // Replace with your server key from Firebase Console
            }
    )

    @POST("fcm/send")
    Call<NotificationResponse> sendNotification(@Body NotificationSenderModel body);
}
