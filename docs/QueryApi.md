# QueryApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQuery**](QueryApi.md#createQuery) | **POST** /queries | Create Query
[**createQueryTask**](QueryApi.md#createQueryTask) | **POST** /query_tasks | Run Query Async
[**query**](QueryApi.md#query) | **GET** /queries/{query_id} | Get Query
[**queryForSlug**](QueryApi.md#queryForSlug) | **GET** /queries/slug/{slug} | Get Query for Slug
[**queryTask**](QueryApi.md#queryTask) | **GET** /query_tasks/{query_task_id} | Get Async Query Info
[**queryTaskMultiResults**](QueryApi.md#queryTaskMultiResults) | **GET** /query_tasks/multi_results | Get Multiple Async Query Results
[**queryTaskResults**](QueryApi.md#queryTaskResults) | **GET** /query_tasks/{query_task_id}/results | Get Async Query Results
[**runInlineQuery**](QueryApi.md#runInlineQuery) | **POST** /queries/run/{result_format} | Run Inline Query
[**runQuery**](QueryApi.md#runQuery) | **GET** /queries/{query_id}/run/{result_format} | Run Query
[**runUrlEncodedQuery**](QueryApi.md#runUrlEncodedQuery) | **GET** /queries/models/{model_name}/views/{view_name}/run/{result_format} | Run Url Encoded Query

<a name="createQuery"></a>
# **createQuery**
> Query createQuery(body, fields)

Create Query

### Create a query.  This allows you to create a new query that you can later run. Looker queries are immutable once created and are not deleted. If you create a query that is exactly like an existing query then the existing query will be returned and no new query will be created. Whether a new query is created or not, you can use the &#x27;id&#x27; in the returned query with the &#x27;run&#x27; method.  The query parameters are passed as json in the body of the request.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
Query body = new Query(); // Query | Query
String fields = "fields_example"; // String | Requested fields.
try {
    Query result = apiInstance.createQuery(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#createQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Query**](Query.md)| Query | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**Query**](Query.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createQueryTask"></a>
# **createQueryTask**
> QueryTask createQueryTask(body, limit, applyFormatting, applyVis, cache, imageWidth, imageHeight, generateDrillLinks, forceProduction, cacheOnly, pathPrefix, rebuildPdts, serverTableCalcs, fields)

Run Query Async

### Run a saved query asynchronously.  Runs a previously created query asynchronously. Returns a Query Task ID which can be used to fetch the results from the Query Tasks results endpoint. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
CreateQueryTask body = new CreateQueryTask(); // CreateQueryTask | Query parameters
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
String fields = "fields_example"; // String | Requested fields
try {
    QueryTask result = apiInstance.createQueryTask(body, limit, applyFormatting, applyVis, cache, imageWidth, imageHeight, generateDrillLinks, forceProduction, cacheOnly, pathPrefix, rebuildPdts, serverTableCalcs, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#createQueryTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateQueryTask**](CreateQueryTask.md)| Query parameters |
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
 **fields** | [**String**](.md)| Requested fields | [optional]

### Return type

[**QueryTask**](QueryTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="query"></a>
# **query**
> Query query(queryId, fields)

Get Query

### Get a previously created query by id.  A Looker query object includes the various parameters that define a database query that has been run or could be run in the future. These parameters include: model, view, fields, filters, pivots, etc. Query *results* are not part of the query object.  Query objects are unique and immutable. Query objects are created automatically in Looker as users explore data. Looker does not delete them; they become part of the query history. When asked to create a query for any given set of parameters, Looker will first try to find an existing query object with matching parameters and will only create a new object when an appropriate object can not be found.  This &#x27;get&#x27; method is used to get the details about a query for a given id. See the other methods here to &#x27;create&#x27; and &#x27;run&#x27; queries.  Note that some fields like &#x27;filter_config&#x27; and &#x27;vis_config&#x27; etc are specific to how the Looker UI builds queries and visualizations and are not generally useful for API use. They are not required when creating new queries and can usually just be ignored.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
Integer queryId = 56; // Integer | Id of query
String fields = "fields_example"; // String | Requested fields.
try {
    Query result = apiInstance.query(queryId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#query");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryId** | [**Integer**](.md)| Id of query |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**Query**](Query.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryForSlug"></a>
# **queryForSlug**
> Query queryForSlug(slug, fields)

Get Query for Slug

### Get the query for a given query slug.  This returns the query for the &#x27;slug&#x27; in a query share URL.  The &#x27;slug&#x27; is a randomly chosen short string that is used as an alternative to the query&#x27;s id value for use in URLs etc. This method exists as a convenience to help you use the API to &#x27;find&#x27; queries that have been created using the Looker UI.  You can use the Looker explore page to build a query and then choose the &#x27;Share&#x27; option to show the share url for the query. Share urls generally look something like &#x27;https://looker.yourcompany/x/vwGSbfc&#x27;. The trailing &#x27;vwGSbfc&#x27; is the share slug. You can pass that string to this api method to get details about the query. Those details include the &#x27;id&#x27; that you can use to run the query. Or, you can copy the query body (perhaps with your own modification) and use that as the basis to make/run new queries.  This will also work with slugs from Looker explore urls like &#x27;https://looker.yourcompany/explore/ecommerce/orders?qid&#x3D;aogBgL6o3cKK1jN3RoZl5s&#x27;. In this case &#x27;aogBgL6o3cKK1jN3RoZl5s&#x27; is the slug. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String slug = "slug_example"; // String | Slug of query
String fields = "fields_example"; // String | Requested fields.
try {
    Query result = apiInstance.queryForSlug(slug, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#queryForSlug");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slug** | [**String**](.md)| Slug of query |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**Query**](Query.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryTask"></a>
# **queryTask**
> QueryTask queryTask(queryTaskId, fields)

Get Async Query Info

Returns information about a Query Task.  Query Tasks are generated by running queries asynchronously. They are represented by a GUID returned from one of the async query endpoints. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String queryTaskId = "queryTaskId_example"; // String | ID of the Query Task
String fields = "fields_example"; // String | Requested fields.
try {
    QueryTask result = apiInstance.queryTask(queryTaskId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#queryTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryTaskId** | [**String**](.md)| ID of the Query Task |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**QueryTask**](QueryTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryTaskMultiResults"></a>
# **queryTaskMultiResults**
> Map&lt;String, String&gt; queryTaskMultiResults(queryTaskIds)

Get Multiple Async Query Results

Fetch the results of multiple async Query Tasks in one response.  Query Tasks that are not ready will be skipped and will not appear in the response. Query Tasks whose results have expired will have a status of &#x27;expired&#x27;. If the user making the API request does not have sufficient privileges to view a Query Task result, the result will have a status of &#x27;missing&#x27; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
List<String> queryTaskIds = Arrays.asList("queryTaskIds_example"); // List<String> | List of Query Task IDs
try {
    Map<String, String> result = apiInstance.queryTaskMultiResults(queryTaskIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#queryTaskMultiResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryTaskIds** | [**List&lt;String&gt;**](String.md)| List of Query Task IDs |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryTaskResults"></a>
# **queryTaskResults**
> Map&lt;String, String&gt; queryTaskResults(queryTaskId)

Get Async Query Results

Returns the results of an async Query Task if the query has completed. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String queryTaskId = "queryTaskId_example"; // String | ID of the Query Task
try {
    Map<String, String> result = apiInstance.queryTaskResults(queryTaskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#queryTaskResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryTaskId** | [**String**](.md)| ID of the Query Task |

### Return type

**Map&lt;String, String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text, application/json

<a name="runInlineQuery"></a>
# **runInlineQuery**
> String runInlineQuery(body, resultFormat, limit, applyFormatting, applyVis, cache, imageWidth, imageHeight, generateDrillLinks, forceProduction, cacheOnly, pathPrefix, rebuildPdts, serverTableCalcs)

Run Inline Query

### Run the query that is specified inline in the posted body.  This allows running a query as defined in json in the posted body. This combines the two actions of posting &amp; running a query into one step.  Here is an example body in json: &#x60;&#x60;&#x60; {   \&quot;model\&quot;:\&quot;thelook\&quot;,   \&quot;view\&quot;:\&quot;inventory_items\&quot;,   \&quot;fields\&quot;:[\&quot;category.name\&quot;,\&quot;inventory_items.days_in_inventory_tier\&quot;,\&quot;products.count\&quot;],   \&quot;filters\&quot;:{\&quot;category.name\&quot;:\&quot;socks\&quot;},   \&quot;sorts\&quot;:[\&quot;products.count desc 0\&quot;],   \&quot;limit\&quot;:\&quot;500\&quot;,   \&quot;query_timezone\&quot;:\&quot;America/Los_Angeles\&quot; } &#x60;&#x60;&#x60;  When using the Ruby SDK this would be passed as a Ruby hash like: &#x60;&#x60;&#x60; {  :model&#x3D;&gt;\&quot;thelook\&quot;,  :view&#x3D;&gt;\&quot;inventory_items\&quot;,  :fields&#x3D;&gt;   [\&quot;category.name\&quot;,    \&quot;inventory_items.days_in_inventory_tier\&quot;,    \&quot;products.count\&quot;],  :filters&#x3D;&gt;{:\&quot;category.name\&quot;&#x3D;&gt;\&quot;socks\&quot;},  :sorts&#x3D;&gt;[\&quot;products.count desc 0\&quot;],  :limit&#x3D;&gt;\&quot;500\&quot;,  :query_timezone&#x3D;&gt;\&quot;America/Los_Angeles\&quot;, } &#x60;&#x60;&#x60;  This will return the result of running the query in the format specified by the &#x27;result_format&#x27; parameter.  Supported formats:  | result_format | Description | :-----------: | :--- | | json | Plain json | json_detail | Row data plus metadata describing the fields, pivots, table calcs, and other aspects of the query | csv | Comma separated values with a header | txt | Tab separated values with a header | html | Simple html | md | Simple markdown | xlsx | MS Excel spreadsheet | sql | Returns the generated SQL rather than running the query | png | A PNG image of the visualization of the query | jpg | A JPG image of the visualization of the query   

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
Query body = new Query(); // Query | inline query
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
    String result = apiInstance.runInlineQuery(body, resultFormat, limit, applyFormatting, applyVis, cache, imageWidth, imageHeight, generateDrillLinks, forceProduction, cacheOnly, pathPrefix, rebuildPdts, serverTableCalcs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#runInlineQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Query**](Query.md)| inline query |
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

 - **Content-Type**: application/json
 - **Accept**: text, application/json, image/png, image/jpg

<a name="runQuery"></a>
# **runQuery**
> String runQuery(queryId, resultFormat, limit, applyFormatting, applyVis, cache, imageWidth, imageHeight, generateDrillLinks, forceProduction, cacheOnly, pathPrefix, rebuildPdts, serverTableCalcs)

Run Query

### Run a saved query.  This runs a previously saved query. You can use this on a query that was generated in the Looker UI or one that you have explicitly created using the API. You can also use a query &#x27;id&#x27; from a saved &#x27;Look&#x27;.  The &#x27;result_format&#x27; parameter specifies the desired structure and format of the response.  Supported formats:  | result_format | Description | :-----------: | :--- | | json | Plain json | json_detail | Row data plus metadata describing the fields, pivots, table calcs, and other aspects of the query | csv | Comma separated values with a header | txt | Tab separated values with a header | html | Simple html | md | Simple markdown | xlsx | MS Excel spreadsheet | sql | Returns the generated SQL rather than running the query | png | A PNG image of the visualization of the query | jpg | A JPG image of the visualization of the query   

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
Integer queryId = 56; // Integer | Id of query
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
    String result = apiInstance.runQuery(queryId, resultFormat, limit, applyFormatting, applyVis, cache, imageWidth, imageHeight, generateDrillLinks, forceProduction, cacheOnly, pathPrefix, rebuildPdts, serverTableCalcs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#runQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryId** | [**Integer**](.md)| Id of query |
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

<a name="runUrlEncodedQuery"></a>
# **runUrlEncodedQuery**
> String runUrlEncodedQuery(modelName, viewName, resultFormat)

Run Url Encoded Query

### Run an URL encoded query.  This requires the caller to encode the specifiers for the query into the URL query part using Looker-specific syntax as explained below.  Generally, you would want to use one of the methods that takes the parameters as json in the POST body for creating and/or running queries. This method exists for cases where one really needs to encode the parameters into the URL of a single &#x27;GET&#x27; request. This matches the way that the Looker UI formats &#x27;explore&#x27; URLs etc.  The parameters here are very similar to the json body formatting except that the filter syntax is tricky. Unfortunately, this format makes this method not currently callible via the &#x27;Try it out!&#x27; button in this documentation page. But, this is callable  when creating URLs manually or when using the Looker SDK.  Here is an example inline query URL:  &#x60;&#x60;&#x60; https://looker.mycompany.com:19999/api/3.0/queries/models/thelook/views/inventory_items/run/json?fields&#x3D;category.name,inventory_items.days_in_inventory_tier,products.count&amp;f[category.name]&#x3D;socks&amp;sorts&#x3D;products.count+desc+0&amp;limit&#x3D;500&amp;query_timezone&#x3D;America/Los_Angeles &#x60;&#x60;&#x60;  When invoking this endpoint with the Ruby SDK, pass the query parameter parts as a hash. The hash to match the above would look like:  &#x60;&#x60;&#x60;ruby query_params &#x3D; {   :fields &#x3D;&gt; \&quot;category.name,inventory_items.days_in_inventory_tier,products.count\&quot;,   :\&quot;f[category.name]\&quot; &#x3D;&gt; \&quot;socks\&quot;,   :sorts &#x3D;&gt; \&quot;products.count desc 0\&quot;,   :limit &#x3D;&gt; \&quot;500\&quot;,   :query_timezone &#x3D;&gt; \&quot;America/Los_Angeles\&quot; } response &#x3D; ruby_sdk.run_url_encoded_query(&#x27;thelook&#x27;,&#x27;inventory_items&#x27;,&#x27;json&#x27;, query_params)  &#x60;&#x60;&#x60;  Again, it is generally easier to use the variant of this method that passes the full query in the POST body. This method is available for cases where other alternatives won&#x27;t fit the need.  Supported formats:  | result_format | Description | :-----------: | :--- | | json | Plain json | json_detail | Row data plus metadata describing the fields, pivots, table calcs, and other aspects of the query | csv | Comma separated values with a header | txt | Tab separated values with a header | html | Simple html | md | Simple markdown | xlsx | MS Excel spreadsheet | sql | Returns the generated SQL rather than running the query | png | A PNG image of the visualization of the query | jpg | A JPG image of the visualization of the query   

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String modelName = "modelName_example"; // String | Model name
String viewName = "viewName_example"; // String | View name
String resultFormat = "resultFormat_example"; // String | Format of result
try {
    String result = apiInstance.runUrlEncodedQuery(modelName, viewName, resultFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#runUrlEncodedQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelName** | [**String**](.md)| Model name |
 **viewName** | [**String**](.md)| View name |
 **resultFormat** | [**String**](.md)| Format of result |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text, application/json, image/png, image/jpg

