# DataActionApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchRemoteDataActionForm**](DataActionApi.md#fetchRemoteDataActionForm) | **POST** /data_actions/form | Fetch Remote Data Action Form
[**performDataAction**](DataActionApi.md#performDataAction) | **POST** /data_actions | Send a Data Action

<a name="fetchRemoteDataActionForm"></a>
# **fetchRemoteDataActionForm**
> DataActionForm fetchRemoteDataActionForm(body)

Fetch Remote Data Action Form

For some data actions, the remote server may supply a form requesting further user input. This endpoint takes a data action, asks the remote server to generate a form for it, and returns that form to you for presentation to the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DataActionApi;


DataActionApi apiInstance = new DataActionApi();
Map<String, String> body = new Map(); // Map<String, String> | Data Action Request
try {
    DataActionForm result = apiInstance.fetchRemoteDataActionForm(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataActionApi#fetchRemoteDataActionForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Map&lt;String, String&gt;**](Map.md)| Data Action Request |

### Return type

[**DataActionForm**](DataActionForm.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="performDataAction"></a>
# **performDataAction**
> DataActionResponse performDataAction(body)

Send a Data Action

Perform a data action. The data action object can be obtained from query results, and used to perform an arbitrary action.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DataActionApi;


DataActionApi apiInstance = new DataActionApi();
DataActionRequest body = new DataActionRequest(); // DataActionRequest | Data Action Request
try {
    DataActionResponse result = apiInstance.performDataAction(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataActionApi#performDataAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DataActionRequest**](DataActionRequest.md)| Data Action Request |

### Return type

[**DataActionResponse**](DataActionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

