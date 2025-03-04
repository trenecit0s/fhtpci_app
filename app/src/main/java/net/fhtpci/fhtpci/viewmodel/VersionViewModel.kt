package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.VersionResponse
import net.fhtpci.fhtpci.repository.VersionRepository

class VersionViewModel : ViewModel() {
    private val repository = VersionRepository()
    private val _versionList = MutableLiveData<List<VersionResponse>?>()
    val versionList: LiveData<List<VersionResponse>?> get() = _versionList

    fun fetchVersion() {
        viewModelScope.launch {
            val versions = repository.fetchVersion()
            _versionList.postValue(versions)
        }
    }
}
