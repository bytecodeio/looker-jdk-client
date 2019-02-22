# SqlQueryApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSqlQuery**](SqlQueryApi.md#createSqlQuery) | **POST** /sql_queries | Create SQL Runner Query
[**sqlQuery**](SqlQueryApi.md#sqlQuery) | **GET** /sql_queries/{slug} | Get SQL Runner Query

<a name="createSqlQuery"></a>
# **createSqlQuery**
> SqlQuery createSqlQuery(body)

Create SQL Runner Query

Create a SQL Runner query.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SqlQueryApi;


SqlQueryApi apiInstance = new SqlQueryApi();
SqlQueryCreate body = new SqlQueryCreate(); // SqlQueryCreate | SQL Runner Query
try {
    SqlQuery result = apiInstance.createSqlQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlQueryApi#createSqlQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SqlQueryCreate**](SqlQueryCreate.md)| SQL Runner Query |

### Return type

[**SqlQuery**](SqlQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sqlQuery"></a>
# **sqlQuery**
> SqlQuery sqlQuery(slug)

Get SQL Runner Query

Get a SQL Runner query.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SqlQueryApi;


SqlQueryApi apiInstance = new SqlQueryApi();
String slug = "slug_example"; // String | slug of query
try {
    SqlQuery result = apiInstance.sqlQuery(slug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SqlQueryApi#sqlQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | [**String**](.md)| slug of query |

### Return type

[**SqlQuery**](SqlQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

