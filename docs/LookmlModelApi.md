# LookmlModelApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allLookmlModels**](LookmlModelApi.md#allLookmlModels) | **GET** /lookml_models | Get All LookML Models
[**createLookmlModel**](LookmlModelApi.md#createLookmlModel) | **POST** /lookml_models | Create LookML Model
[**deleteLookmlModel**](LookmlModelApi.md#deleteLookmlModel) | **DELETE** /lookml_models/{lookml_model_name} | Delete LookML Model
[**lookmlModel**](LookmlModelApi.md#lookmlModel) | **GET** /lookml_models/{lookml_model_name} | Get LookML Model
[**lookmlModelExplore**](LookmlModelApi.md#lookmlModelExplore) | **GET** /lookml_models/{lookml_model_name}/explores/{explore_name} | Get LookML Model Explore
[**updateLookmlModel**](LookmlModelApi.md#updateLookmlModel) | **PATCH** /lookml_models/{lookml_model_name} | Update LookML Model

<a name="allLookmlModels"></a>
# **allLookmlModels**
> List&lt;LookmlModel&gt; allLookmlModels(fields)

Get All LookML Models

### Get information about all lookml models. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookmlModelApi;


LookmlModelApi apiInstance = new LookmlModelApi();
String fields = "fields_example"; // String | Requested fields.
try {
    List<LookmlModel> result = apiInstance.allLookmlModels(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookmlModelApi#allLookmlModels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;LookmlModel&gt;**](LookmlModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLookmlModel"></a>
# **createLookmlModel**
> LookmlModel createLookmlModel(body)

Create LookML Model

### Create a lookml model using the specified configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookmlModelApi;


LookmlModelApi apiInstance = new LookmlModelApi();
LookmlModel body = new LookmlModel(); // LookmlModel | LookML Model
try {
    LookmlModel result = apiInstance.createLookmlModel(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookmlModelApi#createLookmlModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LookmlModel**](LookmlModel.md)| LookML Model | [optional]

### Return type

[**LookmlModel**](LookmlModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLookmlModel"></a>
# **deleteLookmlModel**
> String deleteLookmlModel(lookmlModelName)

Delete LookML Model

### Delete a lookml model. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookmlModelApi;


LookmlModelApi apiInstance = new LookmlModelApi();
String lookmlModelName = "lookmlModelName_example"; // String | Name of lookml model.
try {
    String result = apiInstance.deleteLookmlModel(lookmlModelName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookmlModelApi#deleteLookmlModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookmlModelName** | [**String**](.md)| Name of lookml model. |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="lookmlModel"></a>
# **lookmlModel**
> LookmlModel lookmlModel(lookmlModelName, fields)

Get LookML Model

### Get information about a lookml model. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookmlModelApi;


LookmlModelApi apiInstance = new LookmlModelApi();
String lookmlModelName = "lookmlModelName_example"; // String | Name of lookml model.
String fields = "fields_example"; // String | Requested fields.
try {
    LookmlModel result = apiInstance.lookmlModel(lookmlModelName, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookmlModelApi#lookmlModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookmlModelName** | [**String**](.md)| Name of lookml model. |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**LookmlModel**](LookmlModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="lookmlModelExplore"></a>
# **lookmlModelExplore**
> LookmlModelExplore lookmlModelExplore(lookmlModelName, exploreName, fields)

Get LookML Model Explore

### Get information about a lookml model explore. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookmlModelApi;


LookmlModelApi apiInstance = new LookmlModelApi();
String lookmlModelName = "lookmlModelName_example"; // String | Name of lookml model.
String exploreName = "exploreName_example"; // String | Name of explore.
String fields = "fields_example"; // String | Requested fields.
try {
    LookmlModelExplore result = apiInstance.lookmlModelExplore(lookmlModelName, exploreName, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookmlModelApi#lookmlModelExplore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookmlModelName** | [**String**](.md)| Name of lookml model. |
 **exploreName** | [**String**](.md)| Name of explore. |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**LookmlModelExplore**](LookmlModelExplore.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLookmlModel"></a>
# **updateLookmlModel**
> LookmlModel updateLookmlModel(body, lookmlModelName)

Update LookML Model

### Update a lookml model using the specified configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookmlModelApi;


LookmlModelApi apiInstance = new LookmlModelApi();
LookmlModel body = new LookmlModel(); // LookmlModel | LookML Model
String lookmlModelName = "lookmlModelName_example"; // String | Name of lookml model.
try {
    LookmlModel result = apiInstance.updateLookmlModel(body, lookmlModelName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookmlModelApi#updateLookmlModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LookmlModel**](LookmlModel.md)| LookML Model |
 **lookmlModelName** | [**String**](.md)| Name of lookml model. |

### Return type

[**LookmlModel**](LookmlModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

