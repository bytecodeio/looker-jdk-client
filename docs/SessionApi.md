# SessionApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**session**](SessionApi.md#session) | **GET** /session | Get Session
[**updateSession**](SessionApi.md#updateSession) | **PATCH** /session | Update Session

<a name="session"></a>
# **session**
> ApiSession session()

Get Session

### Get API Session  Returns information about the current API session, such as which workspace is selected for the session. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SessionApi;


SessionApi apiInstance = new SessionApi();
try {
    ApiSession result = apiInstance.session();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionApi#session");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiSession**](ApiSession.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSession"></a>
# **updateSession**
> ApiSession updateSession(body)

Update Session

### Update API Session  #### API Session Workspace  You can use this endpoint to change the active workspace for the current API session.  Only one workspace can be active in a session. The active workspace can be changed any number of times in a session.  The default workspace for API sessions is the \&quot;production\&quot; workspace.  All Looker APIs that use projects or lookml models (such as running queries) will use the version of project and model files defined by this workspace for the lifetime of the current API session or until the session workspace is changed again.  An API session has the same lifetime as the access_token used to authenticate API requests. Each successful API login generates a new access_token and a new API session.  If your Looker API client application needs to work in a dev workspace across multiple API sessions, be sure to select the dev workspace after each login. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SessionApi;


SessionApi apiInstance = new SessionApi();
ApiSession body = new ApiSession(); // ApiSession | Session
try {
    ApiSession result = apiInstance.updateSession(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionApi#updateSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApiSession**](ApiSession.md)| Session |

### Return type

[**ApiSession**](ApiSession.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

