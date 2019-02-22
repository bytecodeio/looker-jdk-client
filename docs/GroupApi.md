# GroupApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGroupGroup**](GroupApi.md#addGroupGroup) | **POST** /groups/{group_id}/groups | Add a Group to Group
[**addGroupUser**](GroupApi.md#addGroupUser) | **POST** /groups/{group_id}/users | Add a User to Group
[**allGroupGroups**](GroupApi.md#allGroupGroups) | **GET** /groups/{group_id}/groups | Get All Groups in Group
[**allGroupUsers**](GroupApi.md#allGroupUsers) | **GET** /groups/{group_id}/users | Get All Users in Group
[**allGroups**](GroupApi.md#allGroups) | **GET** /groups | Get All Groups
[**createGroup**](GroupApi.md#createGroup) | **POST** /groups | Create Group
[**deleteGroup**](GroupApi.md#deleteGroup) | **DELETE** /groups/{group_id} | Delete Group
[**deleteGroupFromGroup**](GroupApi.md#deleteGroupFromGroup) | **DELETE** /groups/{group_id}/groups/{deleting_group_id} | Deletes a Group from Group
[**deleteGroupUser**](GroupApi.md#deleteGroupUser) | **DELETE** /groups/{group_id}/users/{user_id} | Remove a User from Group
[**deleteUserAttributeGroupValue**](GroupApi.md#deleteUserAttributeGroupValue) | **DELETE** /groups/{group_id}/attribute_values/{user_attribute_id} | Delete User Attribute Group Value
[**group**](GroupApi.md#group) | **GET** /groups/{group_id} | Get Group
[**updateGroup**](GroupApi.md#updateGroup) | **PATCH** /groups/{group_id} | Update Group
[**updateUserAttributeGroupValue**](GroupApi.md#updateUserAttributeGroupValue) | **PATCH** /groups/{group_id}/attribute_values/{user_attribute_id} | Set User Attribute Group Value

<a name="addGroupGroup"></a>
# **addGroupGroup**
> Group addGroupGroup(groupId, body)

Add a Group to Group

### Adds a new group to a group. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Integer groupId = 56; // Integer | Id of group
GroupIdForGroupInclusion body = new GroupIdForGroupInclusion(); // GroupIdForGroupInclusion | Group id to add
try {
    Group result = apiInstance.addGroupGroup(groupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#addGroupGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**Integer**](.md)| Id of group |
 **body** | [**GroupIdForGroupInclusion**](GroupIdForGroupInclusion.md)| Group id to add | [optional]

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addGroupUser"></a>
# **addGroupUser**
> User addGroupUser(groupId, body)

Add a User to Group

### Adds a new user to a group. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Integer groupId = 56; // Integer | Id of group
GroupIdForGroupUserInclusion body = new GroupIdForGroupUserInclusion(); // GroupIdForGroupUserInclusion | User id to add
try {
    User result = apiInstance.addGroupUser(groupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#addGroupUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**Integer**](.md)| Id of group |
 **body** | [**GroupIdForGroupUserInclusion**](GroupIdForGroupUserInclusion.md)| User id to add | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="allGroupGroups"></a>
# **allGroupGroups**
> List&lt;Group&gt; allGroupGroups(groupId, fields)

Get All Groups in Group

### Get information about all the groups in a group 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Integer groupId = 56; // Integer | Id of group
String fields = "fields_example"; // String | Requested fields.
try {
    List<Group> result = apiInstance.allGroupGroups(groupId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#allGroupGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**Integer**](.md)| Id of group |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allGroupUsers"></a>
# **allGroupUsers**
> List&lt;User&gt; allGroupUsers(groupId, fields, page, perPage, sorts)

Get All Users in Group

### Get information about all the users directly included in a group. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Integer groupId = 56; // Integer | Id of group
String fields = "fields_example"; // String | Requested fields.
Integer page = 56; // Integer | Requested page.
Integer perPage = 56; // Integer | Results per page.
String sorts = "sorts_example"; // String | Fields to sort by.
try {
    List<User> result = apiInstance.allGroupUsers(groupId, fields, page, perPage, sorts);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#allGroupUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**Integer**](.md)| Id of group |
 **fields** | [**String**](.md)| Requested fields. | [optional]
 **page** | [**Integer**](.md)| Requested page. | [optional]
 **perPage** | [**Integer**](.md)| Results per page. | [optional]
 **sorts** | [**String**](.md)| Fields to sort by. | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allGroups"></a>
# **allGroups**
> List&lt;Group&gt; allGroups(fields, page, perPage, sorts, ids, contentMetadataId, canAddToContentMetadata)

Get All Groups

### Get information about all groups. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
String fields = "fields_example"; // String | Requested fields.
Integer page = 56; // Integer | Requested page.
Integer perPage = 56; // Integer | Results per page.
String sorts = "sorts_example"; // String | Fields to sort by.
List<Long> ids = Arrays.asList(56L); // List<Long> | Optional of ids to get specific groups.
Integer contentMetadataId = 56; // Integer | Id of content metadata to which groups must have access.
Boolean canAddToContentMetadata = true; // Boolean | Select only groups that either can/cannot be given access to content.
try {
    List<Group> result = apiInstance.allGroups(fields, page, perPage, sorts, ids, contentMetadataId, canAddToContentMetadata);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#allGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]
 **page** | [**Integer**](.md)| Requested page. | [optional]
 **perPage** | [**Integer**](.md)| Results per page. | [optional]
 **sorts** | [**String**](.md)| Fields to sort by. | [optional]
 **ids** | [**List&lt;Long&gt;**](Long.md)| Optional of ids to get specific groups. | [optional]
 **contentMetadataId** | [**Integer**](.md)| Id of content metadata to which groups must have access. | [optional]
 **canAddToContentMetadata** | [**Boolean**](.md)| Select only groups that either can/cannot be given access to content. | [optional]

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createGroup"></a>
# **createGroup**
> Group createGroup(body, fields)

Create Group

### Creates a new group (admin only). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Group body = new Group(); // Group | Group
String fields = "fields_example"; // String | Requested fields.
try {
    Group result = apiInstance.createGroup(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#createGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Group**](Group.md)| Group | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGroup"></a>
# **deleteGroup**
> String deleteGroup(groupId)

Delete Group

### Deletes a group (admin only). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Integer groupId = 56; // Integer | Id of group
try {
    String result = apiInstance.deleteGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#deleteGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**Integer**](.md)| Id of group |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteGroupFromGroup"></a>
# **deleteGroupFromGroup**
> deleteGroupFromGroup(groupId, deletingGroupId)

Deletes a Group from Group

### Removes a group from a group. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Integer groupId = 56; // Integer | Id of group
Integer deletingGroupId = 56; // Integer | Id of group to delete
try {
    apiInstance.deleteGroupFromGroup(groupId, deletingGroupId);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#deleteGroupFromGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**Integer**](.md)| Id of group |
 **deletingGroupId** | [**Integer**](.md)| Id of group to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteGroupUser"></a>
# **deleteGroupUser**
> deleteGroupUser(groupId, userId)

Remove a User from Group

### Removes a user from a group. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Integer groupId = 56; // Integer | Id of group
Integer userId = 56; // Integer | Id of user to remove from group
try {
    apiInstance.deleteGroupUser(groupId, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#deleteGroupUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**Integer**](.md)| Id of group |
 **userId** | [**Integer**](.md)| Id of user to remove from group |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserAttributeGroupValue"></a>
# **deleteUserAttributeGroupValue**
> deleteUserAttributeGroupValue(groupId, userAttributeId)

Delete User Attribute Group Value

### Remove a user attribute value from a group. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Integer groupId = 56; // Integer | Id of group
Integer userAttributeId = 56; // Integer | Id of user attribute
try {
    apiInstance.deleteUserAttributeGroupValue(groupId, userAttributeId);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#deleteUserAttributeGroupValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**Integer**](.md)| Id of group |
 **userAttributeId** | [**Integer**](.md)| Id of user attribute |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="group"></a>
# **group**
> Group group(groupId, fields)

Get Group

### Get information about a group. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Integer groupId = 56; // Integer | Id of group
String fields = "fields_example"; // String | Requested fields.
try {
    Group result = apiInstance.group(groupId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#group");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**Integer**](.md)| Id of group |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateGroup"></a>
# **updateGroup**
> Group updateGroup(body, groupId, fields)

Update Group

### Updates the a group (admin only).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
Group body = new Group(); // Group | Group
Integer groupId = 56; // Integer | Id of group
String fields = "fields_example"; // String | Requested fields.
try {
    Group result = apiInstance.updateGroup(body, groupId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#updateGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Group**](Group.md)| Group |
 **groupId** | [**Integer**](.md)| Id of group |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserAttributeGroupValue"></a>
# **updateUserAttributeGroupValue**
> UserAttributeGroupValue updateUserAttributeGroupValue(body, groupId, userAttributeId)

Set User Attribute Group Value

### Set the value of a user attribute for a group.  For information about how user attribute values are calculated, see [Set User Attribute Group Values](#!/UserAttribute/set_user_attribute_group_values). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupApi;


GroupApi apiInstance = new GroupApi();
UserAttributeGroupValue body = new UserAttributeGroupValue(); // UserAttributeGroupValue | New value for group.
Integer groupId = 56; // Integer | Id of group
Integer userAttributeId = 56; // Integer | Id of user attribute
try {
    UserAttributeGroupValue result = apiInstance.updateUserAttributeGroupValue(body, groupId, userAttributeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#updateUserAttributeGroupValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserAttributeGroupValue**](UserAttributeGroupValue.md)| New value for group. |
 **groupId** | [**Integer**](.md)| Id of group |
 **userAttributeId** | [**Integer**](.md)| Id of user attribute |

### Return type

[**UserAttributeGroupValue**](UserAttributeGroupValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

