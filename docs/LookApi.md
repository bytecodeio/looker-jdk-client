# LookApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allLooks**](LookApi.md#allLooks) | **GET** /looks | Get All Looks
[**createLook**](LookApi.md#createLook) | **POST** /looks | Create Look
[**deleteLook**](LookApi.md#deleteLook) | **DELETE** /looks/{look_id} | Delete Look
[**look**](LookApi.md#look) | **GET** /looks/{look_id} | Get Look
[**runLook**](LookApi.md#runLook) | **GET** /looks/{look_id}/run/{result_format} | Run Look
[**searchLooks**](LookApi.md#searchLooks) | **GET** /looks/search | Search Looks
[**updateLook**](LookApi.md#updateLook) | **PATCH** /looks/{look_id} | Update Look

<a name="allLooks"></a>
# **allLooks**
> List&lt;Look&gt; allLooks(fields)

Get All Looks

### Get all the looks.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookApi;


LookApi apiInstance = new LookApi();
String fields = "fields_example"; // String | Requested fields.
try {
    List<Look> result = apiInstance.allLooks(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookApi#allLooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;Look&gt;**](Look.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createLook"></a>
# **createLook**
> LookWithQuery createLook(body, fields)

Create Look

### Create a Look with specified information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookApi;


LookApi apiInstance = new LookApi();
LookWithQuery body = new LookWithQuery(); // LookWithQuery | Look
String fields = "fields_example"; // String | Requested fields.
try {
    LookWithQuery result = apiInstance.createLook(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookApi#createLook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LookWithQuery**](LookWithQuery.md)| Look | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**LookWithQuery**](LookWithQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLook"></a>
# **deleteLook**
> String deleteLook(lookId)

Delete Look

### Delete the look with a specific id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookApi;


LookApi apiInstance = new LookApi();
Integer lookId = 56; // Integer | Id of look
try {
    String result = apiInstance.deleteLook(lookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookApi#deleteLook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookId** | [**Integer**](.md)| Id of look |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="look"></a>
# **look**
> LookWithQuery look(lookId, fields)

Get Look

### Get a Look.  Return detailed information about the Look and its associated Query.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookApi;


LookApi apiInstance = new LookApi();
Integer lookId = 56; // Integer | Id of look
String fields = "fields_example"; // String | Requested fields.
try {
    LookWithQuery result = apiInstance.look(lookId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookApi#look");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookId** | [**Integer**](.md)| Id of look |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**LookWithQuery**](LookWithQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="runLook"></a>
# **runLook**
> String runLook(lookId, resultFormat, limit, applyFormatting, applyVis, cache, imageWidth, imageHeight, generateDrillLinks, forceProduction, cacheOnly, pathPrefix, rebuildPdts, serverTableCalcs)

Run Look

### Run a Look.  Runs a given look&#x27;s query and returns the results in the requested format.  Supported formats:  | result_format | Description | :-----------: | :--- | | json | Plain json | json_detail | Row data plus metadata describing the fields, pivots, table calcs, and other aspects of the query | csv | Comma separated values with a header | txt | Tab separated values with a header | html | Simple html | md | Simple markdown | xlsx | MS Excel spreadsheet | sql | Returns the generated SQL rather than running the query | png | A PNG image of the visualization of the query | jpg | A JPG image of the visualization of the query   

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookApi;


LookApi apiInstance = new LookApi();
Integer lookId = 56; // Integer | Id of look
String resultFormat = "resultFormat_example"; // String | Format of result
Integer limit = 56; // Integer | Row limit (may override the limit in the saved query).
Boolean applyFormatting = true; // Boolean | Apply model-specified formatting to each result.
Boolean applyVis = true; // Boolean | Apply visualization options to results.
Boolean cache = true; // Boolean | Get results from cache if available.
Integer imageWidth = 56; // Integer | Render width for image formats.
Integer imageHeight = 56; // Integer | Render height for image formats.
Boolean generateDrillLinks = true; // Boolean | Generate drill links (only applicable to 'json_detail' format.
Boolean forceProduction = true; // Boolean | Force use of production models even if the user is in development mode.
Boolean cacheOnly = true; // Boolean | Retrieve any results from cache even if the results have expired.
String pathPrefix = "pathPrefix_example"; // String | Prefix to use for drill links (url encoded).
Boolean rebuildPdts = true; // Boolean | Rebuild PDTS used in query.
Boolean serverTableCalcs = true; // Boolean | Perform table calculations on query results
try {
    String result = apiInstance.runLook(lookId, resultFormat, limit, applyFormatting, applyVis, cache, imageWidth, imageHeight, generateDrillLinks, forceProduction, cacheOnly, pathPrefix, rebuildPdts, serverTableCalcs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookApi#runLook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookId** | [**Integer**](.md)| Id of look |
 **resultFormat** | [**String**](.md)| Format of result |
 **limit** | [**Integer**](.md)| Row limit (may override the limit in the saved query). | [optional]
 **applyFormatting** | [**Boolean**](.md)| Apply model-specified formatting to each result. | [optional]
 **applyVis** | [**Boolean**](.md)| Apply visualization options to results. | [optional]
 **cache** | [**Boolean**](.md)| Get results from cache if available. | [optional]
 **imageWidth** | [**Integer**](.md)| Render width for image formats. | [optional]
 **imageHeight** | [**Integer**](.md)| Render height for image formats. | [optional]
 **generateDrillLinks** | [**Boolean**](.md)| Generate drill links (only applicable to &#x27;json_detail&#x27; format. | [optional]
 **forceProduction** | [**Boolean**](.md)| Force use of production models even if the user is in development mode. | [optional]
 **cacheOnly** | [**Boolean**](.md)| Retrieve any results from cache even if the results have expired. | [optional]
 **pathPrefix** | [**String**](.md)| Prefix to use for drill links (url encoded). | [optional]
 **rebuildPdts** | [**Boolean**](.md)| Rebuild PDTS used in query. | [optional]
 **serverTableCalcs** | [**Boolean**](.md)| Perform table calculations on query results | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text, application/json, image/png, image/jpg

<a name="searchLooks"></a>
# **searchLooks**
> List&lt;Look&gt; searchLooks(fields, page, perPage, limit, offset, sorts, title, description, contentFavoriteId, spaceId, userId, viewCount)

Search Looks

Search looks.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookApi;


LookApi apiInstance = new LookApi();
String fields = "fields_example"; // String | Requested fields.
Integer page = 56; // Integer | Requested page.
Integer perPage = 56; // Integer | Results per page.
Integer limit = 56; // Integer | Number of results to return. (used with offset and takes priority over page and per_page)
Integer offset = 56; // Integer | Number of results to skip before returning any. (used with limit and takes priority over page and per_page)
String sorts = "sorts_example"; // String | Fields to sort by.
String title = "title_example"; // String | Match Look title.
String description = "description_example"; // String | Match Look description.
Integer contentFavoriteId = 56; // Integer | Match content favorite id
String spaceId = "spaceId_example"; // String | Filter on a particular space.
String userId = "userId_example"; // String | Filter on dashboards created by a particular user.
String viewCount = "viewCount_example"; // String | Filter on a particular value of view_count
try {
    List<Look> result = apiInstance.searchLooks(fields, page, perPage, limit, offset, sorts, title, description, contentFavoriteId, spaceId, userId, viewCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookApi#searchLooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]
 **page** | [**Integer**](.md)| Requested page. | [optional]
 **perPage** | [**Integer**](.md)| Results per page. | [optional]
 **limit** | [**Integer**](.md)| Number of results to return. (used with offset and takes priority over page and per_page) | [optional]
 **offset** | [**Integer**](.md)| Number of results to skip before returning any. (used with limit and takes priority over page and per_page) | [optional]
 **sorts** | [**String**](.md)| Fields to sort by. | [optional]
 **title** | [**String**](.md)| Match Look title. | [optional]
 **description** | [**String**](.md)| Match Look description. | [optional]
 **contentFavoriteId** | [**Integer**](.md)| Match content favorite id | [optional]
 **spaceId** | [**String**](.md)| Filter on a particular space. | [optional]
 **userId** | [**String**](.md)| Filter on dashboards created by a particular user. | [optional]
 **viewCount** | [**String**](.md)| Filter on a particular value of view_count | [optional]

### Return type

[**List&lt;Look&gt;**](Look.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLook"></a>
# **updateLook**
> LookWithQuery updateLook(body, lookId, fields)

Update Look

### Update the Look with a specific id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LookApi;


LookApi apiInstance = new LookApi();
LookWithQuery body = new LookWithQuery(); // LookWithQuery | Look
Integer lookId = 56; // Integer | Id of look
String fields = "fields_example"; // String | Requested fields.
try {
    LookWithQuery result = apiInstance.updateLook(body, lookId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LookApi#updateLook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LookWithQuery**](LookWithQuery.md)| Look |
 **lookId** | [**Integer**](.md)| Id of look |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**LookWithQuery**](LookWithQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

