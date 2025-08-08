package com.example.navigationuidemo2

import androidx.lifecycle.*
import androidx.lifecycle.map

class TenantViewModel: ViewModel() {
    private val _tenantInfo = MutableLiveData<String>("")
    val tenantInfo: LiveData<String> = _tenantInfo
    val capitalizedTenantInfo: LiveData<String> = tenantInfo.map {
        it.uppercase()
    }
    private val _tenantCount = MutableLiveData<Int>(0)
    val tenantCount: LiveData<Int> = _tenantCount
    fun addTenant(name: String, unit: String, rent: String) {
        val newEntry = "Name: $name\nUnit: $unit\nRent: $rent\n\n"
        _tenantInfo.value = (_tenantInfo.value ?: "") + newEntry

        _tenantCount.value = (_tenantCount.value ?: 0) + 1
    }
}