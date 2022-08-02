package com.mygymproject.domain

import com.mygymproject.data.model.activities.ActivitiesRepository
import com.mygymproject.data.model.activities.ActivityModel
import javax.inject.Inject

class ActivitiesUseCase
@Inject constructor(
    private val activitiesRepository: ActivitiesRepository
) {
    suspend operator fun invoke():List<ActivityModel> = activitiesRepository.getAllActivities()
}