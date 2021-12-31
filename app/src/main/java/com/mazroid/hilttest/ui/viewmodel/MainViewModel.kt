package com.mazroid.hilttest.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mazroid.hilttest.ui.model.MainUserModel
import com.mazroid.hilttest.ui.repo.MainRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject constructor(val repo: MainRepo) : ViewModel() {

    fun getAllUser(): MutableLiveData<MainUserModel> {
        return repo.getAllUser()
    }

}