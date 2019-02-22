# ContentApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allContentMetadataAccesss**](ContentApi.md#allContentMetadataAccesss) | **GET** /content_metadata_access | Get All Content Metadata Accesss
[**allContentMetadatas**](ContentApi.md#allContentMetadatas) | **GET** /content_metadata | Get All Content Metadatas
[**contentFavorite**](ContentApi.md#contentFavorite) | **GET** /content_favorite/{content_favorite_id} | Get Favorite Content
[**contentMetadata**](ContentApi.md#contentMetadata) | **GET** /content_metadata/{content_metadata_id} | Get Content Metadata
[**createContentFavorite**](ContentApi.md#createContentFavorite) | **POST** /content_favorite | Create Favorite Content
[**createContentMetadataAccess**](ContentApi.md#createContentMetadataAccess) | **POST** /content_metadata_access | Create Content Metadata Access
[**deleteContentFavorite**](ContentApi.md#deleteContentFavorite) | **DELETE** /content_favorite/{content_favorite_id} | Delete Favorite Content
[**deleteContentMetadataAccess**](ContentApi.md#deleteContentMetadataAccess) | **DELETE** /content_metadata_access/{content_metadata_access_id} | Delete Content Metadata Access
[**searchContentFavorites**](ContentApi.md#searchContentFavorites) | **GET** /content_favorite/search | Search Favorite Contents
[**searchContentViews**](ContentApi.md#searchContentViews) | **GET** /content_view/search | Search Content Views
[**updateContentMetadata**](ContentApi.md#updateContentMetadata) | **PATCH** /content_metadata/{content_metadata_id} | Update Content Metadata
[**updateContentMetadataAccess**](ContentApi.md#updateContentMetadataAccess) | **PUT** /content_metadata_access/{content_metadata_access_id} | Update Content Metadata Access

<a name="allContentMetadataAccesss"></a>
# **allContentMetadataAccesss**
> List&lt;ContentMetaGroupUser&gt; allContentMetadataAccesss(contentMetadataId, fields)

Get All Content Metadata Accesss

### All content metadata access records for a content metadata item. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Integer contentMetadataId = 56; // Integer | Id of content metadata
String fields = "fields_example"; // String | Requested fields.
try {
    List<ContentMetaGroupUser> result = apiInstance.allContentMetadataAccesss(contentMetadataId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#allContentMetadataAccesss");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentMetadataId** | [**Integer**](.md)| Id of content metadata | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;ContentMetaGroupUser&gt;**](ContentMetaGroupUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allContentMetadatas"></a>
# **allContentMetadatas**
> List&lt;ContentMeta&gt; allContentMetadatas(parentId, fields)

Get All Content Metadatas

### Get information about all content metadata in a space. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Integer parentId = 56; // Integer | Parent space of content.
String fields = "fields_example"; // String | Requested fields.
try {
    List<ContentMeta> result = apiInstance.allContentMetadatas(parentId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#allContentMetadatas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | [**Integer**](.md)| Parent space of content. |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;ContentMeta&gt;**](ContentMeta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentFavorite"></a>
# **contentFavorite**
> ContentFavorite contentFavorite(contentFavoriteId, fields)

Get Favorite Content

### Get favorite content by its id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Integer contentFavoriteId = 56; // Integer | Id of favorite content
String fields = "fields_example"; // String | Requested fields.
try {
    ContentFavorite result = apiInstance.contentFavorite(contentFavoriteId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentFavorite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentFavoriteId** | [**Integer**](.md)| Id of favorite content |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**ContentFavorite**](ContentFavorite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="contentMetadata"></a>
# **contentMetadata**
> ContentMeta contentMetadata(contentMetadataId, fields)

Get Content Metadata

### Get information about an individual content metadata record. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Integer contentMetadataId = 56; // Integer | Id of content metadata
String fields = "fields_example"; // String | Requested fields.
try {
    ContentMeta result = apiInstance.contentMetadata(contentMetadataId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#contentMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentMetadataId** | [**Integer**](.md)| Id of content metadata |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**ContentMeta**](ContentMeta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createContentFavorite"></a>
# **createContentFavorite**
> ContentFavorite createContentFavorite(body)

Create Favorite Content

### Create favorite content

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
ContentFavorite body = new ContentFavorite(); // ContentFavorite | Favorite Content
try {
    ContentFavorite result = apiInstance.createContentFavorite(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#createContentFavorite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContentFavorite**](ContentFavorite.md)| Favorite Content | [optional]

### Return type

[**ContentFavorite**](ContentFavorite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createContentMetadataAccess"></a>
# **createContentMetadataAccess**
> ContentMetaGroupUser createContentMetadataAccess(body)

Create Content Metadata Access

### Create content metadata access. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
ContentMetaGroupUser body = new ContentMetaGroupUser(); // ContentMetaGroupUser | Content Metadata Access
try {
    ContentMetaGroupUser result = apiInstance.createContentMetadataAccess(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#createContentMetadataAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContentMetaGroupUser**](ContentMetaGroupUser.md)| Content Metadata Access | [optional]

### Return type

[**ContentMetaGroupUser**](ContentMetaGroupUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContentFavorite"></a>
# **deleteContentFavorite**
> String deleteContentFavorite(contentFavoriteId)

Delete Favorite Content

### Delete favorite content

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Integer contentFavoriteId = 56; // Integer | Id of favorite content
try {
    String result = apiInstance.deleteContentFavorite(contentFavoriteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#deleteContentFavorite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentFavoriteId** | [**Integer**](.md)| Id of favorite content |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteContentMetadataAccess"></a>
# **deleteContentMetadataAccess**
> String deleteContentMetadataAccess(contentMetadataAccessId)

Delete Content Metadata Access

### Remove content metadata access. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Integer contentMetadataAccessId = 56; // Integer | Id of content metadata access
try {
    String result = apiInstance.deleteContentMetadataAccess(contentMetadataAccessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#deleteContentMetadataAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentMetadataAccessId** | [**Integer**](.md)| Id of content metadata access |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchContentFavorites"></a>
# **searchContentFavorites**
> List&lt;ContentFavorite&gt; searchContentFavorites(userId, limit, offset, sorts, fields)

Search Favorite Contents

### Search Favorite Content 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Integer userId = 56; // Integer | Match User Id
Integer limit = 56; // Integer | Number of results to return. (used with offset)
Integer offset = 56; // Integer | Number of results to skip before returning any. (used with limit)
String sorts = "sorts_example"; // String | Fields to sort by.
String fields = "fields_example"; // String | Requested fields.
try {
    List<ContentFavorite> result = apiInstance.searchContentFavorites(userId, limit, offset, sorts, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#searchContentFavorites");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| Match User Id | [optional]
 **limit** | [**Integer**](.md)| Number of results to return. (used with offset) | [optional]
 **offset** | [**Integer**](.md)| Number of results to skip before returning any. (used with limit) | [optional]
 **sorts** | [**String**](.md)| Fields to sort by. | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;ContentFavorite&gt;**](ContentFavorite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchContentViews"></a>
# **searchContentViews**
> List&lt;ContentView&gt; searchContentViews(viewCount, groupId, lookId, dashboardId, contentMetadataId, startOfWeekDate, allTime, userId, limit, offset, sorts, fields)

Search Content Views

### Search Content View 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
Integer viewCount = 56; // Integer | Match view count
Integer groupId = 56; // Integer | Match Group Id
String lookId = "lookId_example"; // String | Match look_id
String dashboardId = "dashboardId_example"; // String | Match dashboard_id
Integer contentMetadataId = 56; // Integer | Match content metadata id
String startOfWeekDate = "startOfWeekDate_example"; // String | Match start of week date
Boolean allTime = true; // Boolean | True if only all time view records should be returned
Integer userId = 56; // Integer | Match user id
Integer limit = 56; // Integer | Number of results to return. Use with `offset` to manage pagination of results
Integer offset = 56; // Integer | Number of results to skip before returning data
String sorts = "sorts_example"; // String | Fields to sort by
String fields = "fields_example"; // String | Requested fields.
try {
    List<ContentView> result = apiInstance.searchContentViews(viewCount, groupId, lookId, dashboardId, contentMetadataId, startOfWeekDate, allTime, userId, limit, offset, sorts, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#searchContentViews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **viewCount** | [**Integer**](.md)| Match view count | [optional]
 **groupId** | [**Integer**](.md)| Match Group Id | [optional]
 **lookId** | [**String**](.md)| Match look_id | [optional]
 **dashboardId** | [**String**](.md)| Match dashboard_id | [optional]
 **contentMetadataId** | [**Integer**](.md)| Match content metadata id | [optional]
 **startOfWeekDate** | [**String**](.md)| Match start of week date | [optional]
 **allTime** | [**Boolean**](.md)| True if only all time view records should be returned | [optional]
 **userId** | [**Integer**](.md)| Match user id | [optional]
 **limit** | [**Integer**](.md)| Number of results to return. Use with &#x60;offset&#x60; to manage pagination of results | [optional]
 **offset** | [**Integer**](.md)| Number of results to skip before returning data | [optional]
 **sorts** | [**String**](.md)| Fields to sort by | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;ContentView&gt;**](ContentView.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateContentMetadata"></a>
# **updateContentMetadata**
> ContentMeta updateContentMetadata(body, contentMetadataId)

Update Content Metadata

### Move a piece of content. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
ContentMeta body = new ContentMeta(); // ContentMeta | Content Metadata
Integer contentMetadataId = 56; // Integer | Id of content metadata
try {
    ContentMeta result = apiInstance.updateContentMetadata(body, contentMetadataId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#updateContentMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContentMeta**](ContentMeta.md)| Content Metadata |
 **contentMetadataId** | [**Integer**](.md)| Id of content metadata |

### Return type

[**ContentMeta**](ContentMeta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateContentMetadataAccess"></a>
# **updateContentMetadataAccess**
> ContentMetaGroupUser updateContentMetadataAccess(body, contentMetadataAccessId)

Update Content Metadata Access

### Update type of access for content metadata. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContentApi;


ContentApi apiInstance = new ContentApi();
ContentMetaGroupUser body = new ContentMetaGroupUser(); // ContentMetaGroupUser | Content Metadata Access
Integer contentMetadataAccessId = 56; // Integer | Id of content metadata access
try {
    ContentMetaGroupUser result = apiInstance.updateContentMetadataAccess(body, contentMetadataAccessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#updateContentMetadataAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ContentMetaGroupUser**](ContentMetaGroupUser.md)| Content Metadata Access |
 **contentMetadataAccessId** | [**Integer**](.md)| Id of content metadata access |

### Return type

[**ContentMetaGroupUser**](ContentMetaGroupUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

