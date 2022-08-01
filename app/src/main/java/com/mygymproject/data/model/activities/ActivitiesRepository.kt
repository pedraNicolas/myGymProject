package com.mygymproject.data.model.activities

import com.mygymproject.data.model.activity.ActivityModel
import com.mygymproject.data.network.ActivitiesService
import javax.inject.Inject

class ActivitiesRepository
@Inject constructor(
    private val activitiesService: ActivitiesService
) {
    suspend fun getAllActivities():List<ActivityModel>{
        return if(activitiesService.getActivities().success){
            val list = activitiesService.getActivities().activities
            list.filter { it.status != "No Available"}
        }else{
            emptyList()
        }
    }
}