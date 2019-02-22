# HomepageApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allHomepageItems**](HomepageApi.md#allHomepageItems) | **GET** /homepage_items | Get All Homepage Items
[**allHomepageSections**](HomepageApi.md#allHomepageSections) | **GET** /homepage_sections | Get All Homepage sections
[**createHomepageItem**](HomepageApi.md#createHomepageItem) | **POST** /homepage_items | Create Homepage Item
[**createHomepageSection**](HomepageApi.md#createHomepageSection) | **POST** /homepage_sections | Create Homepage section
[**deleteHomepageItem**](HomepageApi.md#deleteHomepageItem) | **DELETE** /homepage_items/{homepage_item_id} | Delete Homepage Item
[**deleteHomepageSection**](HomepageApi.md#deleteHomepageSection) | **DELETE** /homepage_sections/{homepage_section_id} | Delete Homepage section
[**homepageItem**](HomepageApi.md#homepageItem) | **GET** /homepage_items/{homepage_item_id} | Get Homepage Item
[**homepageSection**](HomepageApi.md#homepageSection) | **GET** /homepage_sections/{homepage_section_id} | Get Homepage section
[**updateHomepageItem**](HomepageApi.md#updateHomepageItem) | **PATCH** /homepage_items/{homepage_item_id} | Update Homepage Item
[**updateHomepageSection**](HomepageApi.md#updateHomepageSection) | **PATCH** /homepage_sections/{homepage_section_id} | Update Homepage section

<a name="allHomepageItems"></a>
# **allHomepageItems**
> List&lt;HomepageItem&gt; allHomepageItems(fields, sorts, homepageSectionId)

Get All Homepage Items

### Get information about all homepage items. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HomepageApi;


HomepageApi apiInstance = new HomepageApi();
String fields = "fields_example"; // String | Requested fields.
String sorts = "sorts_example"; // String | Fields to sort by.
String homepageSectionId = "homepageSectionId_example"; // String | Filter to a specific homepage section
try {
    List<HomepageItem> result = apiInstance.allHomepageItems(fields, sorts, homepageSectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomepageApi#allHomepageItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]
 **sorts** | [**String**](.md)| Fields to sort by. | [optional]
 **homepageSectionId** | [**String**](.md)| Filter to a specific homepage section | [optional]

### Return type

[**List&lt;HomepageItem&gt;**](HomepageItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allHomepageSections"></a>
# **allHomepageSections**
> List&lt;HomepageSection&gt; allHomepageSections(fields, sorts)

Get All Homepage sections

### Get information about all homepage sections. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HomepageApi;


HomepageApi apiInstance = new HomepageApi();
String fields = "fields_example"; // String | Requested fields.
String sorts = "sorts_example"; // String | Fields to sort by.
try {
    List<HomepageSection> result = apiInstance.allHomepageSections(fields, sorts);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomepageApi#allHomepageSections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]
 **sorts** | [**String**](.md)| Fields to sort by. | [optional]

### Return type

[**List&lt;HomepageSection&gt;**](HomepageSection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createHomepageItem"></a>
# **createHomepageItem**
> HomepageItem createHomepageItem(body, fields)

Create Homepage Item

### Create a new homepage item. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HomepageApi;


HomepageApi apiInstance = new HomepageApi();
HomepageItem body = new HomepageItem(); // HomepageItem | Homepage Item
String fields = "fields_example"; // String | Requested fields.
try {
    HomepageItem result = apiInstance.createHomepageItem(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomepageApi#createHomepageItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HomepageItem**](HomepageItem.md)| Homepage Item | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**HomepageItem**](HomepageItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createHomepageSection"></a>
# **createHomepageSection**
> HomepageSection createHomepageSection(body, fields)

Create Homepage section

### Create a new homepage section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HomepageApi;


HomepageApi apiInstance = new HomepageApi();
HomepageSection body = new HomepageSection(); // HomepageSection | Homepage section
String fields = "fields_example"; // String | Requested fields.
try {
    HomepageSection result = apiInstance.createHomepageSection(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomepageApi#createHomepageSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HomepageSection**](HomepageSection.md)| Homepage section | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**HomepageSection**](HomepageSection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHomepageItem"></a>
# **deleteHomepageItem**
> String deleteHomepageItem(homepageItemId)

Delete Homepage Item

### Delete a homepage item. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HomepageApi;


HomepageApi apiInstance = new HomepageApi();
Integer homepageItemId = 56; // Integer | Id of homepage_item
try {
    String result = apiInstance.deleteHomepageItem(homepageItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomepageApi#deleteHomepageItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **homepageItemId** | [**Integer**](.md)| Id of homepage_item |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteHomepageSection"></a>
# **deleteHomepageSection**
> String deleteHomepageSection(homepageSectionId)

Delete Homepage section

### Delete a homepage section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HomepageApi;


HomepageApi apiInstance = new HomepageApi();
Integer homepageSectionId = 56; // Integer | Id of homepage_section
try {
    String result = apiInstance.deleteHomepageSection(homepageSectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomepageApi#deleteHomepageSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **homepageSectionId** | [**Integer**](.md)| Id of homepage_section |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="homepageItem"></a>
# **homepageItem**
> HomepageItem homepageItem(homepageItemId, fields)

Get Homepage Item

### Get information about a homepage item. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HomepageApi;


HomepageApi apiInstance = new HomepageApi();
Integer homepageItemId = 56; // Integer | Id of homepage item
String fields = "fields_example"; // String | Requested fields.
try {
    HomepageItem result = apiInstance.homepageItem(homepageItemId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomepageApi#homepageItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **homepageItemId** | [**Integer**](.md)| Id of homepage item |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**HomepageItem**](HomepageItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="homepageSection"></a>
# **homepageSection**
> HomepageSection homepageSection(homepageSectionId, fields)

Get Homepage section

### Get information about a homepage section. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HomepageApi;


HomepageApi apiInstance = new HomepageApi();
Integer homepageSectionId = 56; // Integer | Id of homepage section
String fields = "fields_example"; // String | Requested fields.
try {
    HomepageSection result = apiInstance.homepageSection(homepageSectionId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomepageApi#homepageSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **homepageSectionId** | [**Integer**](.md)| Id of homepage section |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**HomepageSection**](HomepageSection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateHomepageItem"></a>
# **updateHomepageItem**
> HomepageItem updateHomepageItem(body, homepageItemId, fields)

Update Homepage Item

### Update a homepage item definition. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HomepageApi;


HomepageApi apiInstance = new HomepageApi();
HomepageItem body = new HomepageItem(); // HomepageItem | Homepage Item
Integer homepageItemId = 56; // Integer | Id of homepage item
String fields = "fields_example"; // String | Requested fields.
try {
    HomepageItem result = apiInstance.updateHomepageItem(body, homepageItemId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomepageApi#updateHomepageItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HomepageItem**](HomepageItem.md)| Homepage Item |
 **homepageItemId** | [**Integer**](.md)| Id of homepage item |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**HomepageItem**](HomepageItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateHomepageSection"></a>
# **updateHomepageSection**
> HomepageSection updateHomepageSection(body, homepageSectionId, fields)

Update Homepage section

### Update a homepage section definition. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HomepageApi;


HomepageApi apiInstance = new HomepageApi();
HomepageSection body = new HomepageSection(); // HomepageSection | Homepage section
Integer homepageSectionId = 56; // Integer | Id of homepage section
String fields = "fields_example"; // String | Requested fields.
try {
    HomepageSection result = apiInstance.updateHomepageSection(body, homepageSectionId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HomepageApi#updateHomepageSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HomepageSection**](HomepageSection.md)| Homepage section |
 **homepageSectionId** | [**Integer**](.md)| Id of homepage section |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**HomepageSection**](HomepageSection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

