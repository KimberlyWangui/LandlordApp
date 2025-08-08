Extended the `TenantViewModel` by adding a `MutableLiveData<Int>` called `_tenantCount` to track the number of tenants added. 
Inside the `addTenant()` function, I increment this count each time a new tenant is added. 
To reflect this in the UI, I used data binding in the layout XML with a `TextView` and set its `android:text` attribute to:
```xml
android:text='@{"Tenants added: " + viewModel.tenantCount}'
