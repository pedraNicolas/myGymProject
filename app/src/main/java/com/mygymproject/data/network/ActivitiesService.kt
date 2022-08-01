package com.mygymproject.data.network

import com.mygymproject.data.model.activities.ActivitiesModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.Dispatcher
import javax.inject.Inject

//API request to get Activities response
class ActivitiesService
@Inject constructor(
    private val apiClient: ApiClient
) {
    suspend fun getActivities(): ActivitiesModel{
        return withContext(Dispatchers.IO){
            apiClient.getActivities().body() ?: ActivitiesModel()
        }
    }
}