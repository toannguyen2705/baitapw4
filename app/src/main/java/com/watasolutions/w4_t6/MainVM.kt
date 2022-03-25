package com.watasolutions.w4_t6

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.watasolutions.w4_t6.model.Idol

class MainVM : ViewModel() {
    var _listOfIdol: MutableLiveData<List<Idol>> = MutableLiveData()
    val listOfIdol: LiveData<List<Idol>>
        get() = _listOfIdol

    fun getData() {
        val dataSet = DataStore.getDataSet()
        _listOfIdol.postValue(dataSet)
    }
}