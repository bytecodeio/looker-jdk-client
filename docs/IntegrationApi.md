# IntegrationApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptIntegrationHubLegalAgreement**](IntegrationApi.md#acceptIntegrationHubLegalAgreement) | **POST** /integration_hubs/{integration_hub_id}/accept_legal_agreement | Accept Integration Hub Legal Agreement
[**allIntegrationHubs**](IntegrationApi.md#allIntegrationHubs) | **GET** /integration_hubs | Get All Integration Hubs
[**allIntegrations**](IntegrationApi.md#allIntegrations) | **GET** /integrations | Get All Integrations
[**createIntegrationHub**](IntegrationApi.md#createIntegrationHub) | **POST** /integration_hubs | Create Integration Hub
[**deleteIntegrationHub**](IntegrationApi.md#deleteIntegrationHub) | **DELETE** /integration_hubs/{integration_hub_id} | Delete Integration Hub
[**fetchIntegrationForm**](IntegrationApi.md#fetchIntegrationForm) | **POST** /integrations/{integration_id}/form | Fetch Remote Integration Form
[**integration**](IntegrationApi.md#integration) | **GET** /integrations/{integration_id} | Get Integration
[**integrationHub**](IntegrationApi.md#integrationHub) | **GET** /integration_hubs/{integration_hub_id} | Get Integration Hub
[**testIntegration**](IntegrationApi.md#testIntegration) | **POST** /integrations/{integration_id}/test | Test integration
[**updateIntegration**](IntegrationApi.md#updateIntegration) | **PATCH** /integrations/{integration_id} | Update Integration
[**updateIntegrationHub**](IntegrationApi.md#updateIntegrationHub) | **PATCH** /integration_hubs/{integration_hub_id} | Update Integration Hub

<a name="acceptIntegrationHubLegalAgreement"></a>
# **acceptIntegrationHubLegalAgreement**
> IntegrationHub acceptIntegrationHubLegalAgreement(integrationHubId)

Accept Integration Hub Legal Agreement

Accepts the legal agreement for a given integration hub. This only works for integration hubs that have legal_agreement_required set to true and legal_agreement_signed set to false.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IntegrationApi;


IntegrationApi apiInstance = new IntegrationApi();
Integer integrationHubId = 56; // Integer | Id of integration_hub
try {
    IntegrationHub result = apiInstance.acceptIntegrationHubLegalAgreement(integrationHubId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#acceptIntegrationHubLegalAgreement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationHubId** | [**Integer**](.md)| Id of integration_hub |

### Return type

[**IntegrationHub**](IntegrationHub.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allIntegrationHubs"></a>
# **allIntegrationHubs**
> List&lt;IntegrationHub&gt; allIntegrationHubs(fields)

Get All Integration Hubs

### Get information about all Integration Hubs. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IntegrationApi;


IntegrationApi apiInstance = new IntegrationApi();
String fields = "fields_example"; // String | Requested fields.
try {
    List<IntegrationHub> result = apiInstance.allIntegrationHubs(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#allIntegrationHubs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;IntegrationHub&gt;**](IntegrationHub.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allIntegrations"></a>
# **allIntegrations**
> List&lt;Integration&gt; allIntegrations(fields, integrationHubId)

Get All Integrations

### Get information about all Integrations. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IntegrationApi;


IntegrationApi apiInstance = new IntegrationApi();
String fields = "fields_example"; // String | Requested fields.
String integrationHubId = "integrationHubId_example"; // String | Filter to a specific provider
try {
    List<Integration> result = apiInstance.allIntegrations(fields, integrationHubId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#allIntegrations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]
 **integrationHubId** | [**String**](.md)| Filter to a specific provider | [optional]

### Return type

[**List&lt;Integration&gt;**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createIntegrationHub"></a>
# **createIntegrationHub**
> IntegrationHub createIntegrationHub(body, fields)

Create Integration Hub

### Create a new Integration Hub. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IntegrationApi;


IntegrationApi apiInstance = new IntegrationApi();
IntegrationHub body = new IntegrationHub(); // IntegrationHub | Integration Hub
String fields = "fields_example"; // String | Requested fields.
try {
    IntegrationHub result = apiInstance.createIntegrationHub(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#createIntegrationHub");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IntegrationHub**](IntegrationHub.md)| Integration Hub | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**IntegrationHub**](IntegrationHub.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIntegrationHub"></a>
# **deleteIntegrationHub**
> String deleteIntegrationHub(integrationHubId)

Delete Integration Hub

### Delete a Integration Hub. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IntegrationApi;


IntegrationApi apiInstance = new IntegrationApi();
Integer integrationHubId = 56; // Integer | Id of integration_hub
try {
    String result = apiInstance.deleteIntegrationHub(integrationHubId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#deleteIntegrationHub");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationHubId** | [**Integer**](.md)| Id of integration_hub |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchIntegrationForm"></a>
# **fetchIntegrationForm**
> DataActionForm fetchIntegrationForm(integrationId)

Fetch Remote Integration Form

Returns the Integration form for presentation to the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IntegrationApi;


IntegrationApi apiInstance = new IntegrationApi();
Integer integrationId = 56; // Integer | Id of Integration
try {
    DataActionForm result = apiInstance.fetchIntegrationForm(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#fetchIntegrationForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | [**Integer**](.md)| Id of Integration |

### Return type

[**DataActionForm**](DataActionForm.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="integration"></a>
# **integration**
> Integration integration(integrationId, fields)

Get Integration

### Get information about a Integration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IntegrationApi;


IntegrationApi apiInstance = new IntegrationApi();
Integer integrationId = 56; // Integer | Id of Integration
String fields = "fields_example"; // String | Requested fields.
try {
    Integration result = apiInstance.integration(integrationId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#integration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | [**Integer**](.md)| Id of Integration |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**Integration**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="integrationHub"></a>
# **integrationHub**
> IntegrationHub integrationHub(integrationHubId, fields)

Get Integration Hub

### Get information about a Integration Hub. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IntegrationApi;


IntegrationApi apiInstance = new IntegrationApi();
Integer integrationHubId = 56; // Integer | Id of Integration Hub
String fields = "fields_example"; // String | Requested fields.
try {
    IntegrationHub result = apiInstance.integrationHub(integrationHubId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#integrationHub");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationHubId** | [**Integer**](.md)| Id of Integration Hub |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**IntegrationHub**](IntegrationHub.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="testIntegration"></a>
# **testIntegration**
> IntegrationTestResult testIntegration(integrationId)

Test integration

Tests the integration to make sure all the settings are working.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IntegrationApi;


IntegrationApi apiInstance = new IntegrationApi();
Integer integrationId = 56; // Integer | Id of Integration
try {
    IntegrationTestResult result = apiInstance.testIntegration(integrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#testIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | [**Integer**](.md)| Id of Integration |

### Return type

[**IntegrationTestResult**](IntegrationTestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIntegration"></a>
# **updateIntegration**
> Integration updateIntegration(body, integrationId, fields)

Update Integration

### Update parameters on a Integration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IntegrationApi;


IntegrationApi apiInstance = new IntegrationApi();
Integration body = new Integration(); // Integration | Integration
Integer integrationId = 56; // Integer | Id of Integration
String fields = "fields_example"; // String | Requested fields.
try {
    Integration result = apiInstance.updateIntegration(body, integrationId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#updateIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Integration**](Integration.md)| Integration |
 **integrationId** | [**Integer**](.md)| Id of Integration |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**Integration**](Integration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateIntegrationHub"></a>
# **updateIntegrationHub**
> IntegrationHub updateIntegrationHub(body, integrationHubId, fields)

Update Integration Hub

### Update a Integration Hub definition. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IntegrationApi;


IntegrationApi apiInstance = new IntegrationApi();
IntegrationHub body = new IntegrationHub(); // IntegrationHub | Integration Hub
Integer integrationHubId = 56; // Integer | Id of Integration Hub
String fields = "fields_example"; // String | Requested fields.
try {
    IntegrationHub result = apiInstance.updateIntegrationHub(body, integrationHubId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationApi#updateIntegrationHub");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IntegrationHub**](IntegrationHub.md)| Integration Hub |
 **integrationHubId** | [**Integer**](.md)| Id of Integration Hub |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**IntegrationHub**](IntegrationHub.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

