# UserAttributeApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allUserAttributeGroupValues**](UserAttributeApi.md#allUserAttributeGroupValues) | **GET** /user_attributes/{user_attribute_id}/group_values | Get User Attribute Group Values
[**allUserAttributes**](UserAttributeApi.md#allUserAttributes) | **GET** /user_attributes | Get All User Attributes
[**createUserAttribute**](UserAttributeApi.md#createUserAttribute) | **POST** /user_attributes | Create User Attribute
[**deleteUserAttribute**](UserAttributeApi.md#deleteUserAttribute) | **DELETE** /user_attributes/{user_attribute_id} | Delete User Attribute
[**setUserAttributeGroupValues**](UserAttributeApi.md#setUserAttributeGroupValues) | **POST** /user_attributes/{user_attribute_id}/group_values | Set User Attribute Group Values
[**updateUserAttribute**](UserAttributeApi.md#updateUserAttribute) | **PATCH** /user_attributes/{user_attribute_id} | Update User Attribute
[**userAttribute**](UserAttributeApi.md#userAttribute) | **GET** /user_attributes/{user_attribute_id} | Get User Attribute

<a name="allUserAttributeGroupValues"></a>
# **allUserAttributeGroupValues**
> List&lt;UserAttributeGroupValue&gt; allUserAttributeGroupValues(userAttributeId, fields)

Get User Attribute Group Values

### Returns all values of a user attribute defined by user groups, in precedence order.  A user may be a member of multiple groups which define different values for a given user attribute. The order of group-values in the response determines precedence for selecting which group-value applies to a given user.  For more information, see [Set User Attribute Group Values](#!/UserAttribute/set_user_attribute_group_values).  Results will only include groups that the caller&#x27;s user account has permission to see. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserAttributeApi;


UserAttributeApi apiInstance = new UserAttributeApi();
Integer userAttributeId = 56; // Integer | Id of user attribute
String fields = "fields_example"; // String | Requested fields.
try {
    List<UserAttributeGroupValue> result = apiInstance.allUserAttributeGroupValues(userAttributeId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAttributeApi#allUserAttributeGroupValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAttributeId** | [**Integer**](.md)| Id of user attribute |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;UserAttributeGroupValue&gt;**](UserAttributeGroupValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allUserAttributes"></a>
# **allUserAttributes**
> List&lt;UserAttribute&gt; allUserAttributes(fields, sorts)

Get All User Attributes

### Get information about all user attributes. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserAttributeApi;


UserAttributeApi apiInstance = new UserAttributeApi();
String fields = "fields_example"; // String | Requested fields.
String sorts = "sorts_example"; // String | Fields to sort by.
try {
    List<UserAttribute> result = apiInstance.allUserAttributes(fields, sorts);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAttributeApi#allUserAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]
 **sorts** | [**String**](.md)| Fields to sort by. | [optional]

### Return type

[**List&lt;UserAttribute&gt;**](UserAttribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createUserAttribute"></a>
# **createUserAttribute**
> UserAttribute createUserAttribute(body, fields)

Create User Attribute

### Create a new user attribute. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserAttributeApi;


UserAttributeApi apiInstance = new UserAttributeApi();
UserAttribute body = new UserAttribute(); // UserAttribute | User Attribute
String fields = "fields_example"; // String | Requested fields.
try {
    UserAttribute result = apiInstance.createUserAttribute(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAttributeApi#createUserAttribute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserAttribute**](UserAttribute.md)| User Attribute | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**UserAttribute**](UserAttribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUserAttribute"></a>
# **deleteUserAttribute**
> String deleteUserAttribute(userAttributeId)

Delete User Attribute

### Delete a user attribute (admin only). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserAttributeApi;


UserAttributeApi apiInstance = new UserAttributeApi();
Integer userAttributeId = 56; // Integer | Id of user_attribute
try {
    String result = apiInstance.deleteUserAttribute(userAttributeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAttributeApi#deleteUserAttribute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAttributeId** | [**Integer**](.md)| Id of user_attribute |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setUserAttributeGroupValues"></a>
# **setUserAttributeGroupValues**
> List&lt;UserAttributeGroupValue&gt; setUserAttributeGroupValues(body, userAttributeId)

Set User Attribute Group Values

### Define values for a user attribute across a set of groups, in priority order.  This function defines all values for a user attribute defined by user groups. This is a global setting, potentially affecting all users in the system. This function replaces any existing group value definitions for the indicated user attribute.  The value of a user attribute for a given user is determined by searching the following locations, in this order:  1. the user&#x27;s account settings 2. the groups that the user is a member of 3. the default value of the user attribute, if any  The user may be a member of multiple groups which define different values for that user attribute. The order of items in the group_values parameter determines which group takes priority for that user. Lowest array index wins.  An alternate method to indicate the selection precedence of group-values is to assign numbers to the &#x27;rank&#x27; property of each group-value object in the array. Lowest &#x27;rank&#x27; value wins. If you use this technique, you must assign a rank value to every group-value object in the array.  To set a user attribute value for a single user, see [Set User Attribute User Value](#!/User/set_user_attribute_user_value). To set a user attribute value for all members of a group, see [Set User Attribute Group Value](#!/Group/update_user_attribute_group_value). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserAttributeApi;


UserAttributeApi apiInstance = new UserAttributeApi();
List<UserAttributeGroupValue> body = Arrays.asList(new UserAttributeGroupValue()); // List<UserAttributeGroupValue> | Array of group values.
Integer userAttributeId = 56; // Integer | Id of user attribute
try {
    List<UserAttributeGroupValue> result = apiInstance.setUserAttributeGroupValues(body, userAttributeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAttributeApi#setUserAttributeGroupValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;UserAttributeGroupValue&gt;**](UserAttributeGroupValue.md)| Array of group values. |
 **userAttributeId** | [**Integer**](.md)| Id of user attribute |

### Return type

[**List&lt;UserAttributeGroupValue&gt;**](UserAttributeGroupValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserAttribute"></a>
# **updateUserAttribute**
> UserAttribute updateUserAttribute(body, userAttributeId, fields)

Update User Attribute

### Update a user attribute definition. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserAttributeApi;


UserAttributeApi apiInstance = new UserAttributeApi();
UserAttribute body = new UserAttribute(); // UserAttribute | User Attribute
Integer userAttributeId = 56; // Integer | Id of user attribute
String fields = "fields_example"; // String | Requested fields.
try {
    UserAttribute result = apiInstance.updateUserAttribute(body, userAttributeId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAttributeApi#updateUserAttribute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserAttribute**](UserAttribute.md)| User Attribute |
 **userAttributeId** | [**Integer**](.md)| Id of user attribute |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**UserAttribute**](UserAttribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userAttribute"></a>
# **userAttribute**
> UserAttribute userAttribute(userAttributeId, fields)

Get User Attribute

### Get information about a user attribute. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserAttributeApi;


UserAttributeApi apiInstance = new UserAttributeApi();
Integer userAttributeId = 56; // Integer | Id of user attribute
String fields = "fields_example"; // String | Requested fields.
try {
    UserAttribute result = apiInstance.userAttribute(userAttributeId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAttributeApi#userAttribute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAttributeId** | [**Integer**](.md)| Id of user attribute |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**UserAttribute**](UserAttribute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

