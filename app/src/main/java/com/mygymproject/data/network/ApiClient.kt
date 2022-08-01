package com.mygymproject.data.network

import com.mygymproject.data.model.activities.ActivitiesModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {
    @GET("activities.json")
    suspend fun getActivities(): Response<ActivitiesModel>
}