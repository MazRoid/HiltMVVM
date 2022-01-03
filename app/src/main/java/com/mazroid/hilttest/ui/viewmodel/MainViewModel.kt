package com.mazroid.hilttest.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mazroid.hilttest.ui.model.MainUserModel
import com.mazroid.hilttest.ui.model.ResultUser
import com.mazroid.hilttest.ui.repo.MainRepo
import com.mazroid.hilttest.util.Utils
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject constructor(val repo: MainRepo) : ViewModel() {

    fun getAllUser(): MutableLiveData<List<ResultUser>> {
        return repo.getAllUser()
    }

    fun replaceUser(value: ResultUser): MutableLiveData<ResultUser?> {
        return repo.replaceUser(value)
    }

}