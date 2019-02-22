# RoleApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allModelSets**](RoleApi.md#allModelSets) | **GET** /model_sets | Get All Model Sets
[**allPermissionSets**](RoleApi.md#allPermissionSets) | **GET** /permission_sets | Get All Permission Sets
[**allPermissions**](RoleApi.md#allPermissions) | **GET** /permissions | Get All Permissions
[**allRoles**](RoleApi.md#allRoles) | **GET** /roles | Get All Roles
[**createModelSet**](RoleApi.md#createModelSet) | **POST** /model_sets | Create Model Set
[**createPermissionSet**](RoleApi.md#createPermissionSet) | **POST** /permission_sets | Create Permission Set
[**createRole**](RoleApi.md#createRole) | **POST** /roles | Create Role
[**deleteModelSet**](RoleApi.md#deleteModelSet) | **DELETE** /model_sets/{model_set_id} | Delete Model Set
[**deletePermissionSet**](RoleApi.md#deletePermissionSet) | **DELETE** /permission_sets/{permission_set_id} | Delete Permission Set
[**deleteRole**](RoleApi.md#deleteRole) | **DELETE** /roles/{role_id} | Delete Role
[**modelSet**](RoleApi.md#modelSet) | **GET** /model_sets/{model_set_id} | Get Model Set
[**permissionSet**](RoleApi.md#permissionSet) | **GET** /permission_sets/{permission_set_id} | Get Permission Set
[**role**](RoleApi.md#role) | **GET** /roles/{role_id} | Get Role
[**roleGroups**](RoleApi.md#roleGroups) | **GET** /roles/{role_id}/groups | Get Role Groups
[**roleUsers**](RoleApi.md#roleUsers) | **GET** /roles/{role_id}/users | Get Role Users
[**setRoleGroups**](RoleApi.md#setRoleGroups) | **PUT** /roles/{role_id}/groups | Update Role Groups
[**setRoleUsers**](RoleApi.md#setRoleUsers) | **PUT** /roles/{role_id}/users | Update Role Users
[**updateModelSet**](RoleApi.md#updateModelSet) | **PATCH** /model_sets/{model_set_id} | Update Model Set
[**updatePermissionSet**](RoleApi.md#updatePermissionSet) | **PATCH** /permission_sets/{permission_set_id} | Update Permission Set
[**updateRole**](RoleApi.md#updateRole) | **PATCH** /roles/{role_id} | Update Role

<a name="allModelSets"></a>
# **allModelSets**
> List&lt;ModelSet&gt; allModelSets(fields)

Get All Model Sets

### Get information about all model sets. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String fields = "fields_example"; // String | Requested fields.
try {
    List<ModelSet> result = apiInstance.allModelSets(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#allModelSets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;ModelSet&gt;**](ModelSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allPermissionSets"></a>
# **allPermissionSets**
> List&lt;PermissionSet&gt; allPermissionSets(fields)

Get All Permission Sets

### Get information about all permission sets. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String fields = "fields_example"; // String | Requested fields.
try {
    List<PermissionSet> result = apiInstance.allPermissionSets(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#allPermissionSets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;PermissionSet&gt;**](PermissionSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allPermissions"></a>
# **allPermissions**
> List&lt;Permission&gt; allPermissions()

Get All Permissions

### Get all supported permissions. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
try {
    List<Permission> result = apiInstance.allPermissions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#allPermissions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Permission&gt;**](Permission.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allRoles"></a>
# **allRoles**
> List&lt;Role&gt; allRoles(fields, ids)

Get All Roles

### Get information about all roles. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String fields = "fields_example"; // String | Requested fields.
List<Long> ids = Arrays.asList(56L); // List<Long> | Optional list of ids to get specific roles.
try {
    List<Role> result = apiInstance.allRoles(fields, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#allRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]
 **ids** | [**List&lt;Long&gt;**](Long.md)| Optional list of ids to get specific roles. | [optional]

### Return type

[**List&lt;Role&gt;**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createModelSet"></a>
# **createModelSet**
> ModelSet createModelSet(body)

Create Model Set

### Create a model set with the specified information. Model sets are used by Roles. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
ModelSet body = new ModelSet(); // ModelSet | ModelSet
try {
    ModelSet result = apiInstance.createModelSet(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#createModelSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelSet**](ModelSet.md)| ModelSet | [optional]

### Return type

[**ModelSet**](ModelSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPermissionSet"></a>
# **createPermissionSet**
> PermissionSet createPermissionSet(body)

Create Permission Set

### Create a permission set with the specified information. Permission sets are used by Roles. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
PermissionSet body = new PermissionSet(); // PermissionSet | Permission Set
try {
    PermissionSet result = apiInstance.createPermissionSet(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#createPermissionSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PermissionSet**](PermissionSet.md)| Permission Set | [optional]

### Return type

[**PermissionSet**](PermissionSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRole"></a>
# **createRole**
> Role createRole(body)

Create Role

### Create a role with the specified information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Role body = new Role(); // Role | Role
try {
    Role result = apiInstance.createRole(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#createRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Role**](Role.md)| Role | [optional]

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteModelSet"></a>
# **deleteModelSet**
> String deleteModelSet(modelSetId)

Delete Model Set

### Delete the model set with a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Integer modelSetId = 56; // Integer | id of model set
try {
    String result = apiInstance.deleteModelSet(modelSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#deleteModelSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelSetId** | [**Integer**](.md)| id of model set |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePermissionSet"></a>
# **deletePermissionSet**
> String deletePermissionSet(permissionSetId)

Delete Permission Set

### Delete the permission set with a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Integer permissionSetId = 56; // Integer | Id of permission set
try {
    String result = apiInstance.deletePermissionSet(permissionSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#deletePermissionSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permissionSetId** | [**Integer**](.md)| Id of permission set |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteRole"></a>
# **deleteRole**
> String deleteRole(roleId)

Delete Role

### Delete the role with a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Integer roleId = 56; // Integer | id of role
try {
    String result = apiInstance.deleteRole(roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#deleteRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | [**Integer**](.md)| id of role |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelSet"></a>
# **modelSet**
> ModelSet modelSet(modelSetId, fields)

Get Model Set

### Get information about the model set with a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Integer modelSetId = 56; // Integer | Id of model set
String fields = "fields_example"; // String | Requested fields.
try {
    ModelSet result = apiInstance.modelSet(modelSetId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#modelSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelSetId** | [**Integer**](.md)| Id of model set |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**ModelSet**](ModelSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="permissionSet"></a>
# **permissionSet**
> PermissionSet permissionSet(permissionSetId, fields)

Get Permission Set

### Get information about the permission set with a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Integer permissionSetId = 56; // Integer | Id of permission set
String fields = "fields_example"; // String | Requested fields.
try {
    PermissionSet result = apiInstance.permissionSet(permissionSetId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#permissionSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **permissionSetId** | [**Integer**](.md)| Id of permission set |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**PermissionSet**](PermissionSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="role"></a>
# **role**
> Role role(roleId)

Get Role

### Get information about the role with a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Integer roleId = 56; // Integer | id of role
try {
    Role result = apiInstance.role(roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#role");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | [**Integer**](.md)| id of role |

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="roleGroups"></a>
# **roleGroups**
> List&lt;Group&gt; roleGroups(roleId, fields)

Get Role Groups

### Get information about all the groups with the role that has a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Integer roleId = 56; // Integer | id of role
String fields = "fields_example"; // String | Requested fields.
try {
    List<Group> result = apiInstance.roleGroups(roleId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | [**Integer**](.md)| id of role |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="roleUsers"></a>
# **roleUsers**
> List&lt;User&gt; roleUsers(roleId, fields, directAssociationOnly)

Get Role Users

### Get information about all the users with the role that has a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Integer roleId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
Boolean directAssociationOnly = true; // Boolean | Get only users associated directly with the role: exclude those only associated through groups.
try {
    List<User> result = apiInstance.roleUsers(roleId, fields, directAssociationOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#roleUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]
 **directAssociationOnly** | [**Boolean**](.md)| Get only users associated directly with the role: exclude those only associated through groups. | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setRoleGroups"></a>
# **setRoleGroups**
> List&lt;Group&gt; setRoleGroups(body, roleId)

Update Role Groups

### Set all groups for a role, removing all existing group associations from that role. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
List<Long> body = Arrays.asList(56L); // List<Long> | Array of Group Ids
Integer roleId = 56; // Integer | Id of Role
try {
    List<Group> result = apiInstance.setRoleGroups(body, roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#setRoleGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Long&gt;**](Long.md)| Array of Group Ids |
 **roleId** | [**Integer**](.md)| Id of Role |

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setRoleUsers"></a>
# **setRoleUsers**
> List&lt;User&gt; setRoleUsers(body, roleId)

Update Role Users

### Set all the users of the role with a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
List<Long> body = Arrays.asList(56L); // List<Long> | array of user ids for role
Integer roleId = 56; // Integer | id of role
try {
    List<User> result = apiInstance.setRoleUsers(body, roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#setRoleUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Long&gt;**](Long.md)| array of user ids for role |
 **roleId** | [**Integer**](.md)| id of role |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateModelSet"></a>
# **updateModelSet**
> ModelSet updateModelSet(body, modelSetId)

Update Model Set

### Update information about the model set with a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
ModelSet body = new ModelSet(); // ModelSet | ModelSet
Integer modelSetId = 56; // Integer | id of model set
try {
    ModelSet result = apiInstance.updateModelSet(body, modelSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#updateModelSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelSet**](ModelSet.md)| ModelSet |
 **modelSetId** | [**Integer**](.md)| id of model set |

### Return type

[**ModelSet**](ModelSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePermissionSet"></a>
# **updatePermissionSet**
> PermissionSet updatePermissionSet(body, permissionSetId)

Update Permission Set

### Update information about the permission set with a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
PermissionSet body = new PermissionSet(); // PermissionSet | Permission Set
Integer permissionSetId = 56; // Integer | id of permission set
try {
    PermissionSet result = apiInstance.updatePermissionSet(body, permissionSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#updatePermissionSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PermissionSet**](PermissionSet.md)| Permission Set |
 **permissionSetId** | [**Integer**](.md)| id of permission set |

### Return type

[**PermissionSet**](PermissionSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRole"></a>
# **updateRole**
> Role updateRole(body, roleId)

Update Role

### Update information about the role with a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
Role body = new Role(); // Role | Role
Integer roleId = 56; // Integer | id of role
try {
    Role result = apiInstance.updateRole(body, roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#updateRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Role**](Role.md)| Role |
 **roleId** | [**Integer**](.md)| id of role |

### Return type

[**Role**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

