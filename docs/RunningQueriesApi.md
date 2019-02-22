# RunningQueriesApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allRunningQueries**](RunningQueriesApi.md#allRunningQueries) | **GET** /running_queries | Get All Running Queries
[**killQuery**](RunningQueriesApi.md#killQuery) | **DELETE** /running_queries/{query_task_id} | Kill Running Query

<a name="allRunningQueries"></a>
# **allRunningQueries**
> List&lt;RunningQueries&gt; allRunningQueries()

Get All Running Queries

Get information about all running queries. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RunningQueriesApi;


RunningQueriesApi apiInstance = new RunningQueriesApi();
try {
    List<RunningQueries> result = apiInstance.allRunningQueries();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RunningQueriesApi#allRunningQueries");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;RunningQueries&gt;**](RunningQueries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="killQuery"></a>
# **killQuery**
> String killQuery(queryTaskId)

Kill Running Query

Kill a query with a specific query_task_id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RunningQueriesApi;


RunningQueriesApi apiInstance = new RunningQueriesApi();
String queryTaskId = "queryTaskId_example"; // String | Query task id.
try {
    String result = apiInstance.killQuery(queryTaskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RunningQueriesApi#killQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryTaskId** | [**String**](.md)| Query task id. |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

