# ConnectionApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allConnections**](ConnectionApi.md#allConnections) | **GET** /connections | Get All Connections
[**allDialectInfos**](ConnectionApi.md#allDialectInfos) | **GET** /dialect_info | Get All Dialect Infos
[**connection**](ConnectionApi.md#connection) | **GET** /connections/{connection_name} | Get Connection
[**createConnection**](ConnectionApi.md#createConnection) | **POST** /connections | Create Connection
[**deleteConnection**](ConnectionApi.md#deleteConnection) | **DELETE** /connections/{connection_name} | Delete Connection
[**deleteConnectionOverride**](ConnectionApi.md#deleteConnectionOverride) | **DELETE** /connections/{connection_name}/connection_override/{override_context} | Delete Connection
[**testConnection**](ConnectionApi.md#testConnection) | **PUT** /connections/{connection_name}/test | Test Connection
[**testConnectionConfig**](ConnectionApi.md#testConnectionConfig) | **PUT** /connections/test | Test Connection Configuration
[**updateConnection**](ConnectionApi.md#updateConnection) | **PATCH** /connections/{connection_name} | Update Connection

<a name="allConnections"></a>
# **allConnections**
> List&lt;DBConnection&gt; allConnections(fields)

Get All Connections

### Get information about all connections. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConnectionApi;


ConnectionApi apiInstance = new ConnectionApi();
String fields = "fields_example"; // String | Requested fields.
try {
    List<DBConnection> result = apiInstance.allConnections(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionApi#allConnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;DBConnection&gt;**](DBConnection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allDialectInfos"></a>
# **allDialectInfos**
> List&lt;DialectInfo&gt; allDialectInfos(fields)

Get All Dialect Infos

### Get information about all dialects. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConnectionApi;


ConnectionApi apiInstance = new ConnectionApi();
String fields = "fields_example"; // String | Requested fields.
try {
    List<DialectInfo> result = apiInstance.allDialectInfos(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionApi#allDialectInfos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;DialectInfo&gt;**](DialectInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="connection"></a>
# **connection**
> DBConnection connection(connectionName, fields)

Get Connection

### Get information about a connection. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConnectionApi;


ConnectionApi apiInstance = new ConnectionApi();
String connectionName = "connectionName_example"; // String | Name of connection
String fields = "fields_example"; // String | Requested fields.
try {
    DBConnection result = apiInstance.connection(connectionName, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionApi#connection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionName** | [**String**](.md)| Name of connection |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**DBConnection**](DBConnection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createConnection"></a>
# **createConnection**
> DBConnection createConnection(body)

Create Connection

### Create a connection using the specified configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConnectionApi;


ConnectionApi apiInstance = new ConnectionApi();
DBConnection body = new DBConnection(); // DBConnection | Connection
try {
    DBConnection result = apiInstance.createConnection(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionApi#createConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DBConnection**](DBConnection.md)| Connection | [optional]

### Return type

[**DBConnection**](DBConnection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteConnection"></a>
# **deleteConnection**
> String deleteConnection(connectionName)

Delete Connection

### Delete a connection. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConnectionApi;


ConnectionApi apiInstance = new ConnectionApi();
String connectionName = "connectionName_example"; // String | Name of connection
try {
    String result = apiInstance.deleteConnection(connectionName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionApi#deleteConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionName** | [**String**](.md)| Name of connection |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteConnectionOverride"></a>
# **deleteConnectionOverride**
> String deleteConnectionOverride(connectionName, overrideContext)

Delete Connection

### Delete a connection override. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConnectionApi;


ConnectionApi apiInstance = new ConnectionApi();
String connectionName = "connectionName_example"; // String | Name of connection
String overrideContext = "overrideContext_example"; // String | Context of connection override
try {
    String result = apiInstance.deleteConnectionOverride(connectionName, overrideContext);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionApi#deleteConnectionOverride");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionName** | [**String**](.md)| Name of connection |
 **overrideContext** | [**String**](.md)| Context of connection override |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="testConnection"></a>
# **testConnection**
> List&lt;DBConnectionTestResult&gt; testConnection(connectionName, tests)

Test Connection

### Test an existing connection.  Note that a connection&#x27;s &#x27;dialect&#x27; property has a &#x27;connection_tests&#x27; property that lists the specific types of tests that the connection supports.  Unsupported tests in the request will be ignored. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConnectionApi;


ConnectionApi apiInstance = new ConnectionApi();
String connectionName = "connectionName_example"; // String | Name of connection
List<String> tests = Arrays.asList("tests_example"); // List<String> | Array of names of tests to run
try {
    List<DBConnectionTestResult> result = apiInstance.testConnection(connectionName, tests);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionApi#testConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionName** | [**String**](.md)| Name of connection |
 **tests** | [**List&lt;String&gt;**](String.md)| Array of names of tests to run | [optional]

### Return type

[**List&lt;DBConnectionTestResult&gt;**](DBConnectionTestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="testConnectionConfig"></a>
# **testConnectionConfig**
> List&lt;DBConnectionTestResult&gt; testConnectionConfig(body, tests)

Test Connection Configuration

### Test a connection configuration.  Note that a connection&#x27;s &#x27;dialect&#x27; property has a &#x27;connection_tests&#x27; property that lists the specific types of tests that the connection supports.  Unsupported tests in the request will be ignored. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConnectionApi;


ConnectionApi apiInstance = new ConnectionApi();
DBConnection body = new DBConnection(); // DBConnection | Connection
List<String> tests = Arrays.asList("tests_example"); // List<String> | Array of names of tests to run
try {
    List<DBConnectionTestResult> result = apiInstance.testConnectionConfig(body, tests);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionApi#testConnectionConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DBConnection**](DBConnection.md)| Connection | [optional]
 **tests** | [**List&lt;String&gt;**](String.md)| Array of names of tests to run | [optional]

### Return type

[**List&lt;DBConnectionTestResult&gt;**](DBConnectionTestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateConnection"></a>
# **updateConnection**
> DBConnection updateConnection(body, connectionName)

Update Connection

### Update a connection using the specified configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConnectionApi;


ConnectionApi apiInstance = new ConnectionApi();
DBConnection body = new DBConnection(); // DBConnection | Connection
String connectionName = "connectionName_example"; // String | Name of connection
try {
    DBConnection result = apiInstance.updateConnection(body, connectionName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectionApi#updateConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DBConnection**](DBConnection.md)| Connection |
 **connectionName** | [**String**](.md)| Name of connection |

### Return type

[**DBConnection**](DBConnection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

