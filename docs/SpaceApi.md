# SpaceApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allSpaces**](SpaceApi.md#allSpaces) | **GET** /spaces | Get All Spaces
[**createSpace**](SpaceApi.md#createSpace) | **POST** /spaces | Create Space
[**deleteSpace**](SpaceApi.md#deleteSpace) | **DELETE** /spaces/{space_id} | Delete Space
[**searchSpaces**](SpaceApi.md#searchSpaces) | **GET** /spaces/search | Search Spaces
[**space**](SpaceApi.md#space) | **GET** /spaces/{space_id} | Get Space
[**spaceAncestors**](SpaceApi.md#spaceAncestors) | **GET** /spaces/{space_id}/ancestors | Get Space Ancestors
[**spaceChildren**](SpaceApi.md#spaceChildren) | **GET** /spaces/{space_id}/children | Get Space Children
[**spaceChildrenSearch**](SpaceApi.md#spaceChildrenSearch) | **GET** /spaces/{space_id}/children/search | Search Space Children
[**spaceDashboards**](SpaceApi.md#spaceDashboards) | **GET** /spaces/{space_id}/dashboards | Get Space Dashboards
[**spaceLooks**](SpaceApi.md#spaceLooks) | **GET** /spaces/{space_id}/looks | Get Space Looks
[**spaceParent**](SpaceApi.md#spaceParent) | **GET** /spaces/{space_id}/parent | Get Space Parent
[**updateSpace**](SpaceApi.md#updateSpace) | **PATCH** /spaces/{space_id} | Update Space

<a name="allSpaces"></a>
# **allSpaces**
> List&lt;SpaceBase&gt; allSpaces(fields)

Get All Spaces

### Get information about all spaces.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpaceApi;


SpaceApi apiInstance = new SpaceApi();
String fields = "fields_example"; // String | Requested fields.
try {
    List<SpaceBase> result = apiInstance.allSpaces(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceApi#allSpaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;SpaceBase&gt;**](SpaceBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSpace"></a>
# **createSpace**
> Space createSpace(body)

Create Space

### Create a space with specified information.  Caller must have permission to edit the parent space and to create spaces, otherwise the request returns 404 Not Found. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpaceApi;


SpaceApi apiInstance = new SpaceApi();
Space body = new Space(); // Space | Space
try {
    Space result = apiInstance.createSpace(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceApi#createSpace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Space**](Space.md)| Space | [optional]

### Return type

[**Space**](Space.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSpace"></a>
# **deleteSpace**
> String deleteSpace(spaceId)

Delete Space

### Delete the space with a specific id including any children spaces. **DANGER** this will delete all looks and dashboards in the space. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpaceApi;


SpaceApi apiInstance = new SpaceApi();
String spaceId = "spaceId_example"; // String | Id of space
try {
    String result = apiInstance.deleteSpace(spaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceApi#deleteSpace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | [**String**](.md)| Id of space |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchSpaces"></a>
# **searchSpaces**
> List&lt;Space&gt; searchSpaces(fields, page, perPage, limit, offset, sorts, name, id, parentId, creatorId)

Search Spaces

Search for spaces by creator id, parent id, name, etc

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpaceApi;


SpaceApi apiInstance = new SpaceApi();
String fields = "fields_example"; // String | Requested fields.
Integer page = 56; // Integer | Requested page.
Integer perPage = 56; // Integer | Results per page.
Integer limit = 56; // Integer | Number of results to return. (used with offset and takes priority over page and per_page)
Integer offset = 56; // Integer | Number of results to skip before returning any. (used with limit and takes priority over page and per_page)
String sorts = "sorts_example"; // String | Fields to sort by.
String name = "name_example"; // String | Match Space title.
Integer id = 56; // Integer | Match Space id
String parentId = "parentId_example"; // String | Filter on a children of a particular space.
String creatorId = "creatorId_example"; // String | Filter on dashboards created by a particular user.
try {
    List<Space> result = apiInstance.searchSpaces(fields, page, perPage, limit, offset, sorts, name, id, parentId, creatorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceApi#searchSpaces");
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
 **name** | [**String**](.md)| Match Space title. | [optional]
 **id** | [**Integer**](.md)| Match Space id | [optional]
 **parentId** | [**String**](.md)| Filter on a children of a particular space. | [optional]
 **creatorId** | [**String**](.md)| Filter on dashboards created by a particular user. | [optional]

### Return type

[**List&lt;Space&gt;**](Space.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="space"></a>
# **space**
> Space space(spaceId, fields)

Get Space

### Get information about the space with a specific id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpaceApi;


SpaceApi apiInstance = new SpaceApi();
String spaceId = "spaceId_example"; // String | Id of space
String fields = "fields_example"; // String | Requested fields.
try {
    Space result = apiInstance.space(spaceId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceApi#space");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | [**String**](.md)| Id of space |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**Space**](Space.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spaceAncestors"></a>
# **spaceAncestors**
> List&lt;Space&gt; spaceAncestors(spaceId, fields)

Get Space Ancestors

### Get the ancestors of a space

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpaceApi;


SpaceApi apiInstance = new SpaceApi();
String spaceId = "spaceId_example"; // String | Id of space
String fields = "fields_example"; // String | Requested fields.
try {
    List<Space> result = apiInstance.spaceAncestors(spaceId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceApi#spaceAncestors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | [**String**](.md)| Id of space |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;Space&gt;**](Space.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spaceChildren"></a>
# **spaceChildren**
> List&lt;Space&gt; spaceChildren(spaceId, fields, page, perPage, sorts)

Get Space Children

### Get the children of a space.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpaceApi;


SpaceApi apiInstance = new SpaceApi();
String spaceId = "spaceId_example"; // String | Id of space
String fields = "fields_example"; // String | Requested fields.
Integer page = 56; // Integer | Requested page.
Integer perPage = 56; // Integer | Results per page.
String sorts = "sorts_example"; // String | Fields to sort by.
try {
    List<Space> result = apiInstance.spaceChildren(spaceId, fields, page, perPage, sorts);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceApi#spaceChildren");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | [**String**](.md)| Id of space |
 **fields** | [**String**](.md)| Requested fields. | [optional]
 **page** | [**Integer**](.md)| Requested page. | [optional]
 **perPage** | [**Integer**](.md)| Results per page. | [optional]
 **sorts** | [**String**](.md)| Fields to sort by. | [optional]

### Return type

[**List&lt;Space&gt;**](Space.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spaceChildrenSearch"></a>
# **spaceChildrenSearch**
> List&lt;Space&gt; spaceChildrenSearch(spaceId, fields, sorts, name)

Search Space Children

### Search the children of a space

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpaceApi;


SpaceApi apiInstance = new SpaceApi();
String spaceId = "spaceId_example"; // String | Id of space
String fields = "fields_example"; // String | Requested fields.
String sorts = "sorts_example"; // String | Fields to sort by.
String name = "name_example"; // String | Match Space name.
try {
    List<Space> result = apiInstance.spaceChildrenSearch(spaceId, fields, sorts, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceApi#spaceChildrenSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | [**String**](.md)| Id of space |
 **fields** | [**String**](.md)| Requested fields. | [optional]
 **sorts** | [**String**](.md)| Fields to sort by. | [optional]
 **name** | [**String**](.md)| Match Space name. | [optional]

### Return type

[**List&lt;Space&gt;**](Space.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spaceDashboards"></a>
# **spaceDashboards**
> List&lt;Dashboard&gt; spaceDashboards(spaceId, fields)

Get Space Dashboards

### Get the dashboards in a space

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpaceApi;


SpaceApi apiInstance = new SpaceApi();
String spaceId = "spaceId_example"; // String | Id of space
String fields = "fields_example"; // String | Requested fields.
try {
    List<Dashboard> result = apiInstance.spaceDashboards(spaceId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceApi#spaceDashboards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | [**String**](.md)| Id of space |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;Dashboard&gt;**](Dashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spaceLooks"></a>
# **spaceLooks**
> List&lt;LookWithQuery&gt; spaceLooks(spaceId, fields)

Get Space Looks

### Get the looks in a space

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpaceApi;


SpaceApi apiInstance = new SpaceApi();
String spaceId = "spaceId_example"; // String | Id of space
String fields = "fields_example"; // String | Requested fields.
try {
    List<LookWithQuery> result = apiInstance.spaceLooks(spaceId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceApi#spaceLooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | [**String**](.md)| Id of space |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;LookWithQuery&gt;**](LookWithQuery.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="spaceParent"></a>
# **spaceParent**
> Space spaceParent(spaceId, fields)

Get Space Parent

### Get the parent of a space

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpaceApi;


SpaceApi apiInstance = new SpaceApi();
String spaceId = "spaceId_example"; // String | Id of space
String fields = "fields_example"; // String | Requested fields.
try {
    Space result = apiInstance.spaceParent(spaceId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceApi#spaceParent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | [**String**](.md)| Id of space |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**Space**](Space.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSpace"></a>
# **updateSpace**
> Space updateSpace(body, spaceId)

Update Space

### Update the space with a specific id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpaceApi;


SpaceApi apiInstance = new SpaceApi();
Space body = new Space(); // Space | Space
String spaceId = "spaceId_example"; // String | Id of space
try {
    Space result = apiInstance.updateSpace(body, spaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceApi#updateSpace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Space**](Space.md)| Space |
 **spaceId** | [**String**](.md)| Id of space |

### Return type

[**Space**](Space.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

