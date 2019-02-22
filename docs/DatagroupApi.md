# DatagroupApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allDatagroups**](DatagroupApi.md#allDatagroups) | **GET** /datagroups | Get All Datagroups
[**datagroup**](DatagroupApi.md#datagroup) | **GET** /datagroups/{datagroup_id} | Get Datagroup
[**updateDatagroup**](DatagroupApi.md#updateDatagroup) | **PATCH** /datagroups/{datagroup_id} | Update Datagroup

<a name="allDatagroups"></a>
# **allDatagroups**
> List&lt;Datagroup&gt; allDatagroups()

Get All Datagroups

### Get information about all datagroups. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DatagroupApi;


DatagroupApi apiInstance = new DatagroupApi();
try {
    List<Datagroup> result = apiInstance.allDatagroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatagroupApi#allDatagroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Datagroup&gt;**](Datagroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="datagroup"></a>
# **datagroup**
> Datagroup datagroup(datagroupId)

Get Datagroup

### Get information about a datagroup. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DatagroupApi;


DatagroupApi apiInstance = new DatagroupApi();
String datagroupId = "datagroupId_example"; // String | ID of datagroup.
try {
    Datagroup result = apiInstance.datagroup(datagroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatagroupApi#datagroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datagroupId** | [**String**](.md)| ID of datagroup. |

### Return type

[**Datagroup**](Datagroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDatagroup"></a>
# **updateDatagroup**
> Datagroup updateDatagroup(body, datagroupId)

Update Datagroup

### Update a datagroup using the specified params. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DatagroupApi;


DatagroupApi apiInstance = new DatagroupApi();
Datagroup body = new Datagroup(); // Datagroup | Datagroup
String datagroupId = "datagroupId_example"; // String | ID of datagroup.
try {
    Datagroup result = apiInstance.updateDatagroup(body, datagroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatagroupApi#updateDatagroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Datagroup**](Datagroup.md)| Datagroup |
 **datagroupId** | [**String**](.md)| ID of datagroup. |

### Return type

[**Datagroup**](Datagroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

