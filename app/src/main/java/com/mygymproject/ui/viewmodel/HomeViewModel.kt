package com.mygymproject.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mygymproject.data.model.activities.ActivityModel
import com.mygymproject.domain.ActivitiesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

enum class Status { LOADING, SUCCESS, ERROR }

@HiltViewModel
class HomeViewModel
@Inject constructor(
    private val activitiesUseCase: ActivitiesUseCase
): ViewModel() {
    private val _activity = MutableLiveData<List<ActivityModel>>()
    val activity: LiveData<List<ActivityModel>> = _activity

    private val _activityStatus = MutableLiveData(Status.SUCCESS)
    val activityStatus: LiveData<Status> = _activityStatus

    fun onCreate(){
        viewModelScope.launch {
            _activityStatus.value =Status.LOADING
            val result = activitiesUseCase()
            if(result.isNotEmpty()){
                _activity.value = result
                _activityStatus.value = Status.SUCCESS
            }else{
                _activityStatus.value = Status.ERROR
            }
        }
    }
}