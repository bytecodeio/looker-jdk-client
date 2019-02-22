# UserApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allUserAccessFilters**](UserApi.md#allUserAccessFilters) | **GET** /users/{user_id}/access_filters | Get All Access Filters
[**allUserCredentialsApi3s**](UserApi.md#allUserCredentialsApi3s) | **GET** /users/{user_id}/credentials_api3 | Get All API 3 Credentials
[**allUserCredentialsEmbeds**](UserApi.md#allUserCredentialsEmbeds) | **GET** /users/{user_id}/credentials_embed | Get All Embedding Credentials
[**allUserSessions**](UserApi.md#allUserSessions) | **GET** /users/{user_id}/sessions | Get All Web Login Sessions
[**allUsers**](UserApi.md#allUsers) | **GET** /users | Get All Users
[**createUser**](UserApi.md#createUser) | **POST** /users | Create User
[**createUserAccessFilter**](UserApi.md#createUserAccessFilter) | **POST** /users/{user_id}/access_filters | Create Access Filter
[**createUserCredentialsApi**](UserApi.md#createUserCredentialsApi) | **POST** /users/{user_id}/credentials_api | Create API Credential
[**createUserCredentialsApi3**](UserApi.md#createUserCredentialsApi3) | **POST** /users/{user_id}/credentials_api3 | Create API 3 Credential
[**createUserCredentialsEmail**](UserApi.md#createUserCredentialsEmail) | **POST** /users/{user_id}/credentials_email | Create Email/Password Credential
[**createUserCredentialsEmailPasswordReset**](UserApi.md#createUserCredentialsEmailPasswordReset) | **POST** /users/{user_id}/credentials_email/password_reset | Create Password Reset Token
[**createUserCredentialsTotp**](UserApi.md#createUserCredentialsTotp) | **POST** /users/{user_id}/credentials_totp | Create Two-Factor Credential
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /users/{user_id} | Delete User
[**deleteUserAccessFilter**](UserApi.md#deleteUserAccessFilter) | **DELETE** /users/{user_id}/access_filters/{access_filter_id} | Delete Access Filter
[**deleteUserAttributeUserValue**](UserApi.md#deleteUserAttributeUserValue) | **DELETE** /users/{user_id}/attribute_values/{user_attribute_id} | Delete User Attribute User Value
[**deleteUserCredentialsApi**](UserApi.md#deleteUserCredentialsApi) | **DELETE** /users/{user_id}/credentials_api | Delete API Credential
[**deleteUserCredentialsApi3**](UserApi.md#deleteUserCredentialsApi3) | **DELETE** /users/{user_id}/credentials_api3/{credentials_api3_id} | Delete API 3 Credential
[**deleteUserCredentialsEmail**](UserApi.md#deleteUserCredentialsEmail) | **DELETE** /users/{user_id}/credentials_email | Delete Email/Password Credential
[**deleteUserCredentialsEmbed**](UserApi.md#deleteUserCredentialsEmbed) | **DELETE** /users/{user_id}/credentials_embed/{credentials_embed_id} | Delete Embedding Credential
[**deleteUserCredentialsGoogle**](UserApi.md#deleteUserCredentialsGoogle) | **DELETE** /users/{user_id}/credentials_google | Delete Google Auth Credential
[**deleteUserCredentialsLdap**](UserApi.md#deleteUserCredentialsLdap) | **DELETE** /users/{user_id}/credentials_ldap | Delete LDAP Credential
[**deleteUserCredentialsLookerOpenid**](UserApi.md#deleteUserCredentialsLookerOpenid) | **DELETE** /users/{user_id}/credentials_looker_openid | Delete Looker OpenId Credential
[**deleteUserCredentialsOidc**](UserApi.md#deleteUserCredentialsOidc) | **DELETE** /users/{user_id}/credentials_oidc | Delete OIDC Auth Credential
[**deleteUserCredentialsSaml**](UserApi.md#deleteUserCredentialsSaml) | **DELETE** /users/{user_id}/credentials_saml | Delete Saml Auth Credential
[**deleteUserCredentialsTotp**](UserApi.md#deleteUserCredentialsTotp) | **DELETE** /users/{user_id}/credentials_totp | Delete Two-Factor Credential
[**deleteUserSession**](UserApi.md#deleteUserSession) | **DELETE** /users/{user_id}/sessions/{session_id} | Delete Web Login Session
[**me**](UserApi.md#me) | **GET** /user | Get Current User
[**searchUsers**](UserApi.md#searchUsers) | **GET** /users/search | Search Users
[**searchUsersNames**](UserApi.md#searchUsersNames) | **GET** /users/search/names/{pattern} | Search User Names
[**setUserAttributeUserValue**](UserApi.md#setUserAttributeUserValue) | **PATCH** /users/{user_id}/attribute_values/{user_attribute_id} | Set User Attribute User Value
[**setUserRoles**](UserApi.md#setUserRoles) | **PUT** /users/{user_id}/roles | Set User Roles
[**updateUser**](UserApi.md#updateUser) | **PATCH** /users/{user_id} | Update User
[**updateUserAccessFilter**](UserApi.md#updateUserAccessFilter) | **PATCH** /users/{user_id}/access_filters/{access_filter_id} | Update Access Filter
[**updateUserCredentialsEmail**](UserApi.md#updateUserCredentialsEmail) | **PATCH** /users/{user_id}/credentials_email | Update Email/Password Credential
[**user**](UserApi.md#user) | **GET** /users/{user_id} | Get User by Id
[**userAccessFilter**](UserApi.md#userAccessFilter) | **GET** /users/{user_id}/access_filters/{access_filter_id} | Get Access Filter
[**userAttributeUserValues**](UserApi.md#userAttributeUserValues) | **GET** /users/{user_id}/attribute_values | Get User Attribute Values
[**userCredentialsApi**](UserApi.md#userCredentialsApi) | **GET** /users/{user_id}/credentials_api | Get API Credential
[**userCredentialsApi3**](UserApi.md#userCredentialsApi3) | **GET** /users/{user_id}/credentials_api3/{credentials_api3_id} | Get API 3 Credential
[**userCredentialsEmail**](UserApi.md#userCredentialsEmail) | **GET** /users/{user_id}/credentials_email | Get Email/Password Credential
[**userCredentialsEmbed**](UserApi.md#userCredentialsEmbed) | **GET** /users/{user_id}/credentials_embed/{credentials_embed_id} | Get Embedding Credential
[**userCredentialsGoogle**](UserApi.md#userCredentialsGoogle) | **GET** /users/{user_id}/credentials_google | Get Google Auth Credential
[**userCredentialsLdap**](UserApi.md#userCredentialsLdap) | **GET** /users/{user_id}/credentials_ldap | Get LDAP Credential
[**userCredentialsLookerOpenid**](UserApi.md#userCredentialsLookerOpenid) | **GET** /users/{user_id}/credentials_looker_openid | Get Looker OpenId Credential
[**userCredentialsOidc**](UserApi.md#userCredentialsOidc) | **GET** /users/{user_id}/credentials_oidc | Get OIDC Auth Credential
[**userCredentialsSaml**](UserApi.md#userCredentialsSaml) | **GET** /users/{user_id}/credentials_saml | Get Saml Auth Credential
[**userCredentialsTotp**](UserApi.md#userCredentialsTotp) | **GET** /users/{user_id}/credentials_totp | Get Two-Factor Credential
[**userForCredential**](UserApi.md#userForCredential) | **GET** /users/credential/{credential_type}/{credential_id} | Get User by Credential Id
[**userRoles**](UserApi.md#userRoles) | **GET** /users/{user_id}/roles | Get User Roles
[**userSession**](UserApi.md#userSession) | **GET** /users/{user_id}/sessions/{session_id} | Get Web Login Session

<a name="allUserAccessFilters"></a>
# **allUserAccessFilters**
> List&lt;AccessFilter&gt; allUserAccessFilters(userId, fields)

Get All Access Filters

### NOTE: this feature is completely end of life and has been removed from the product.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
try {
    List<AccessFilter> result = apiInstance.allUserAccessFilters(userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#allUserAccessFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;AccessFilter&gt;**](AccessFilter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allUserCredentialsApi3s"></a>
# **allUserCredentialsApi3s**
> List&lt;CredentialsApi3&gt; allUserCredentialsApi3s(userId, fields)

Get All API 3 Credentials

### API 3 login information for the specified user. This is for the newer API keys that can be added for any user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
try {
    List<CredentialsApi3> result = apiInstance.allUserCredentialsApi3s(userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#allUserCredentialsApi3s");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;CredentialsApi3&gt;**](CredentialsApi3.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allUserCredentialsEmbeds"></a>
# **allUserCredentialsEmbeds**
> List&lt;CredentialsEmbed&gt; allUserCredentialsEmbeds(userId, fields)

Get All Embedding Credentials

### Embed login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
try {
    List<CredentialsEmbed> result = apiInstance.allUserCredentialsEmbeds(userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#allUserCredentialsEmbeds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;CredentialsEmbed&gt;**](CredentialsEmbed.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allUserSessions"></a>
# **allUserSessions**
> List&lt;Session&gt; allUserSessions(userId, fields)

Get All Web Login Sessions

### Web login session for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
try {
    List<Session> result = apiInstance.allUserSessions(userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#allUserSessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;Session&gt;**](Session.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allUsers"></a>
# **allUsers**
> List&lt;User&gt; allUsers(fields, page, perPage, sorts, ids)

Get All Users

### Get information about all users. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String fields = "fields_example"; // String | Requested fields.
Integer page = 56; // Integer | Requested page.
Integer perPage = 56; // Integer | Results per page.
String sorts = "sorts_example"; // String | Fields to sort by.
List<Long> ids = Arrays.asList(56L); // List<Long> | Optional list of ids to get specific users.
try {
    List<User> result = apiInstance.allUsers(fields, page, perPage, sorts, ids);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#allUsers");
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
 **ids** | [**List&lt;Long&gt;**](Long.md)| Optional list of ids to get specific users. | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createUser"></a>
# **createUser**
> User createUser(body, fields)

Create User

### Create a user with the specified information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
User body = new User(); // User | User
String fields = "fields_example"; // String | Requested fields.
try {
    User result = apiInstance.createUser(body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| User | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUserAccessFilter"></a>
# **createUserAccessFilter**
> AccessFilter createUserAccessFilter(userId, body, fields)

Create Access Filter

### NOTE: this feature is completely end of life and has been removed from the product.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
AccessFilter body = new AccessFilter(); // AccessFilter | Access Filter
String fields = "fields_example"; // String | Requested fields.
try {
    AccessFilter result = apiInstance.createUserAccessFilter(userId, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUserAccessFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **body** | [**AccessFilter**](AccessFilter.md)| Access Filter | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**AccessFilter**](AccessFilter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUserCredentialsApi"></a>
# **createUserCredentialsApi**
> CredentialsApi createUserCredentialsApi(userId, body)

Create API Credential

### Create API Credential. SUPPORT FOR THIS HAS BEEN REMOVED. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | Id of user
CredentialsApi body = new CredentialsApi(); // CredentialsApi | API Credential
try {
    CredentialsApi result = apiInstance.createUserCredentialsApi(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUserCredentialsApi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| Id of user |
 **body** | [**CredentialsApi**](CredentialsApi.md)| API Credential | [optional]

### Return type

[**CredentialsApi**](CredentialsApi.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUserCredentialsApi3"></a>
# **createUserCredentialsApi3**
> CredentialsApi3 createUserCredentialsApi3(userId, body, fields)

Create API 3 Credential

### API 3 login information for the specified user. This is for the newer API keys that can be added for any user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
CredentialsApi3 body = new CredentialsApi3(); // CredentialsApi3 | API 3 Credential
String fields = "fields_example"; // String | Requested fields.
try {
    CredentialsApi3 result = apiInstance.createUserCredentialsApi3(userId, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUserCredentialsApi3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **body** | [**CredentialsApi3**](CredentialsApi3.md)| API 3 Credential | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**CredentialsApi3**](CredentialsApi3.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUserCredentialsEmail"></a>
# **createUserCredentialsEmail**
> CredentialsEmail createUserCredentialsEmail(userId, body, fields)

Create Email/Password Credential

### Email/password login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
CredentialsEmail body = new CredentialsEmail(); // CredentialsEmail | Email/Password Credential
String fields = "fields_example"; // String | Requested fields.
try {
    CredentialsEmail result = apiInstance.createUserCredentialsEmail(userId, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUserCredentialsEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **body** | [**CredentialsEmail**](CredentialsEmail.md)| Email/Password Credential | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**CredentialsEmail**](CredentialsEmail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createUserCredentialsEmailPasswordReset"></a>
# **createUserCredentialsEmailPasswordReset**
> CredentialsEmail createUserCredentialsEmailPasswordReset(userId, expires, fields)

Create Password Reset Token

### Create a password reset token. This will create a cryptographically secure random password reset token for the user. If the user already has a password reset token then this invalidates the old token and creates a new one. The token is expressed as the &#x27;password_reset_url&#x27; of the user&#x27;s email/password credential object. This takes an optional &#x27;expires&#x27; param to indicate if the new token should be an expiring token. Tokens that expire are typically used for self-service password resets for existing users. Invitation emails for new users typically are not set to expire. The expire period is always 60 minutes when expires is enabled. This method can be called with an empty body. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | Id of user
Boolean expires = true; // Boolean | Expiring token.
String fields = "fields_example"; // String | Requested fields.
try {
    CredentialsEmail result = apiInstance.createUserCredentialsEmailPasswordReset(userId, expires, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUserCredentialsEmailPasswordReset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| Id of user |
 **expires** | [**Boolean**](.md)| Expiring token. | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**CredentialsEmail**](CredentialsEmail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createUserCredentialsTotp"></a>
# **createUserCredentialsTotp**
> CredentialsTotp createUserCredentialsTotp(userId, body, fields)

Create Two-Factor Credential

### Two-factor login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
CredentialsTotp body = new CredentialsTotp(); // CredentialsTotp | Two-Factor Credential
String fields = "fields_example"; // String | Requested fields.
try {
    CredentialsTotp result = apiInstance.createUserCredentialsTotp(userId, body, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#createUserCredentialsTotp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **body** | [**CredentialsTotp**](CredentialsTotp.md)| Two-Factor Credential | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**CredentialsTotp**](CredentialsTotp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUser"></a>
# **deleteUser**
> String deleteUser(userId)

Delete User

### Delete the user with a specific id.  **DANGER** this will delete the user and all looks and other information owned by the user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | Id of user
try {
    String result = apiInstance.deleteUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| Id of user |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserAccessFilter"></a>
# **deleteUserAccessFilter**
> String deleteUserAccessFilter(userId, accessFilterId)

Delete Access Filter

### NOTE: this feature is completely end of life and has been removed from the product.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
Integer accessFilterId = 56; // Integer | id of Access Filter
try {
    String result = apiInstance.deleteUserAccessFilter(userId, accessFilterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserAccessFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **accessFilterId** | [**Integer**](.md)| id of Access Filter |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserAttributeUserValue"></a>
# **deleteUserAttributeUserValue**
> deleteUserAttributeUserValue(userId, userAttributeId)

Delete User Attribute User Value

### Delete a user attribute value from a user&#x27;s account settings.  After the user attribute value is deleted from the user&#x27;s account settings, subsequent requests for the user attribute value for this user will draw from the user&#x27;s groups or the default value of the user attribute. See [Get User Attribute Values](#!/User/user_attribute_user_values) for more information about how user attribute values are resolved. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | Id of user
Integer userAttributeId = 56; // Integer | Id of user attribute
try {
    apiInstance.deleteUserAttributeUserValue(userId, userAttributeId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserAttributeUserValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| Id of user |
 **userAttributeId** | [**Integer**](.md)| Id of user attribute |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserCredentialsApi"></a>
# **deleteUserCredentialsApi**
> String deleteUserCredentialsApi(userId)

Delete API Credential

### API login information for the specified user. This is for &#x27;API Users&#x27; used for the &#x27;old&#x27; query API. THIS SUPPORT HAS BEEN REMOVED.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
try {
    String result = apiInstance.deleteUserCredentialsApi(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserCredentialsApi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserCredentialsApi3"></a>
# **deleteUserCredentialsApi3**
> String deleteUserCredentialsApi3(userId, credentialsApi3Id)

Delete API 3 Credential

### API 3 login information for the specified user. This is for the newer API keys that can be added for any user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
Integer credentialsApi3Id = 56; // Integer | id of API 3 Credential
try {
    String result = apiInstance.deleteUserCredentialsApi3(userId, credentialsApi3Id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserCredentialsApi3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **credentialsApi3Id** | [**Integer**](.md)| id of API 3 Credential |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserCredentialsEmail"></a>
# **deleteUserCredentialsEmail**
> String deleteUserCredentialsEmail(userId)

Delete Email/Password Credential

### Email/password login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
try {
    String result = apiInstance.deleteUserCredentialsEmail(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserCredentialsEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserCredentialsEmbed"></a>
# **deleteUserCredentialsEmbed**
> String deleteUserCredentialsEmbed(userId, credentialsEmbedId)

Delete Embedding Credential

### Embed login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
Integer credentialsEmbedId = 56; // Integer | id of Embedding Credential
try {
    String result = apiInstance.deleteUserCredentialsEmbed(userId, credentialsEmbedId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserCredentialsEmbed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **credentialsEmbedId** | [**Integer**](.md)| id of Embedding Credential |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserCredentialsGoogle"></a>
# **deleteUserCredentialsGoogle**
> String deleteUserCredentialsGoogle(userId)

Delete Google Auth Credential

### Google authentication login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
try {
    String result = apiInstance.deleteUserCredentialsGoogle(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserCredentialsGoogle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserCredentialsLdap"></a>
# **deleteUserCredentialsLdap**
> String deleteUserCredentialsLdap(userId)

Delete LDAP Credential

### LDAP login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
try {
    String result = apiInstance.deleteUserCredentialsLdap(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserCredentialsLdap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserCredentialsLookerOpenid"></a>
# **deleteUserCredentialsLookerOpenid**
> String deleteUserCredentialsLookerOpenid(userId)

Delete Looker OpenId Credential

### Looker Openid login information for the specified user. Used by Looker Analysts.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
try {
    String result = apiInstance.deleteUserCredentialsLookerOpenid(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserCredentialsLookerOpenid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserCredentialsOidc"></a>
# **deleteUserCredentialsOidc**
> String deleteUserCredentialsOidc(userId)

Delete OIDC Auth Credential

### OpenID Connect (OIDC) authentication login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
try {
    String result = apiInstance.deleteUserCredentialsOidc(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserCredentialsOidc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserCredentialsSaml"></a>
# **deleteUserCredentialsSaml**
> String deleteUserCredentialsSaml(userId)

Delete Saml Auth Credential

### Saml authentication login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
try {
    String result = apiInstance.deleteUserCredentialsSaml(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserCredentialsSaml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserCredentialsTotp"></a>
# **deleteUserCredentialsTotp**
> String deleteUserCredentialsTotp(userId)

Delete Two-Factor Credential

### Two-factor login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
try {
    String result = apiInstance.deleteUserCredentialsTotp(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserCredentialsTotp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteUserSession"></a>
# **deleteUserSession**
> String deleteUserSession(userId, sessionId)

Delete Web Login Session

### Web login session for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
Integer sessionId = 56; // Integer | id of Web Login Session
try {
    String result = apiInstance.deleteUserSession(userId, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **sessionId** | [**Integer**](.md)| id of Web Login Session |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="me"></a>
# **me**
> User me(fields)

Get Current User

### Get information about the current user; i.e. the user account currently calling the API. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String fields = "fields_example"; // String | Requested fields.
try {
    User result = apiInstance.me(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#me");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchUsers"></a>
# **searchUsers**
> List&lt;User&gt; searchUsers(fields, page, perPage, sorts, id, firstName, lastName, verifiedLookerEmployee, email, isDisabled, filterOr, contentMetadataId, groupId)

Search Users

### Search users. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String fields = "fields_example"; // String | Requested fields.
Integer page = 56; // Integer | Requested page.
Integer perPage = 56; // Integer | Results per page.
String sorts = "sorts_example"; // String | Fields to sort by.
Integer id = 56; // Integer | Match User Id.
String firstName = "firstName_example"; // String | Match First name.
String lastName = "lastName_example"; // String | Match Last name.
Boolean verifiedLookerEmployee = true; // Boolean | Match Verified Looker employee.
String email = "email_example"; // String | Match Email Address.
Boolean isDisabled = true; // Boolean | Match Is disabled.
Boolean filterOr = true; // Boolean | Do an OR search with parameters
Integer contentMetadataId = 56; // Integer | Id of content metadata to which users must have access
Integer groupId = 56; // Integer | Id of group of which users must be directly members
try {
    List<User> result = apiInstance.searchUsers(fields, page, perPage, sorts, id, firstName, lastName, verifiedLookerEmployee, email, isDisabled, filterOr, contentMetadataId, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#searchUsers");
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
 **id** | [**Integer**](.md)| Match User Id. | [optional]
 **firstName** | [**String**](.md)| Match First name. | [optional]
 **lastName** | [**String**](.md)| Match Last name. | [optional]
 **verifiedLookerEmployee** | [**Boolean**](.md)| Match Verified Looker employee. | [optional]
 **email** | [**String**](.md)| Match Email Address. | [optional]
 **isDisabled** | [**Boolean**](.md)| Match Is disabled. | [optional]
 **filterOr** | [**Boolean**](.md)| Do an OR search with parameters | [optional]
 **contentMetadataId** | [**Integer**](.md)| Id of content metadata to which users must have access | [optional]
 **groupId** | [**Integer**](.md)| Id of group of which users must be directly members | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchUsersNames"></a>
# **searchUsersNames**
> List&lt;User&gt; searchUsersNames(pattern, fields, page, perPage, sorts, id, firstName, lastName, verifiedLookerEmployee, email, isDisabled)

Search User Names

### Search users where first_name OR last_name OR email matches a string.  The results will be AND&#x27;d with any additional search parameters that are (optionally) included. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String pattern = "pattern_example"; // String | Pattern to match.
String fields = "fields_example"; // String | Requested fields.
Integer page = 56; // Integer | Requested page.
Integer perPage = 56; // Integer | Results per page.
String sorts = "sorts_example"; // String | Fields to sort by.
Integer id = 56; // Integer | Match User Id.
String firstName = "firstName_example"; // String | Match First name.
String lastName = "lastName_example"; // String | Match Last name.
Boolean verifiedLookerEmployee = true; // Boolean | Match Verified Looker employee.
String email = "email_example"; // String | Match Email Address.
Boolean isDisabled = true; // Boolean | Match Is disabled.
try {
    List<User> result = apiInstance.searchUsersNames(pattern, fields, page, perPage, sorts, id, firstName, lastName, verifiedLookerEmployee, email, isDisabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#searchUsersNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pattern** | [**String**](.md)| Pattern to match. |
 **fields** | [**String**](.md)| Requested fields. | [optional]
 **page** | [**Integer**](.md)| Requested page. | [optional]
 **perPage** | [**Integer**](.md)| Results per page. | [optional]
 **sorts** | [**String**](.md)| Fields to sort by. | [optional]
 **id** | [**Integer**](.md)| Match User Id. | [optional]
 **firstName** | [**String**](.md)| Match First name. | [optional]
 **lastName** | [**String**](.md)| Match Last name. | [optional]
 **verifiedLookerEmployee** | [**Boolean**](.md)| Match Verified Looker employee. | [optional]
 **email** | [**String**](.md)| Match Email Address. | [optional]
 **isDisabled** | [**Boolean**](.md)| Match Is disabled. | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setUserAttributeUserValue"></a>
# **setUserAttributeUserValue**
> UserAttributeWithValue setUserAttributeUserValue(body, userId, userAttributeId)

Set User Attribute User Value

### Store a custom value for a user attribute in a user&#x27;s account settings.  Per-user user attribute values take precedence over group or default values. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
UserAttributeWithValue body = new UserAttributeWithValue(); // UserAttributeWithValue | New attribute value for user.
Integer userId = 56; // Integer | Id of user
Integer userAttributeId = 56; // Integer | Id of user attribute
try {
    UserAttributeWithValue result = apiInstance.setUserAttributeUserValue(body, userId, userAttributeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#setUserAttributeUserValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserAttributeWithValue**](UserAttributeWithValue.md)| New attribute value for user. |
 **userId** | [**Integer**](.md)| Id of user |
 **userAttributeId** | [**Integer**](.md)| Id of user attribute |

### Return type

[**UserAttributeWithValue**](UserAttributeWithValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setUserRoles"></a>
# **setUserRoles**
> List&lt;Role&gt; setUserRoles(body, userId, fields)

Set User Roles

### Set roles of the user with a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
List<Long> body = Arrays.asList(56L); // List<Long> | array of roles ids for user
Integer userId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
try {
    List<Role> result = apiInstance.setUserRoles(body, userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#setUserRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Long&gt;**](Long.md)| array of roles ids for user |
 **userId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;Role&gt;**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> User updateUser(body, userId, fields)

Update User

### Update information about the user with a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
User body = new User(); // User | User
Integer userId = 56; // Integer | Id of user
String fields = "fields_example"; // String | Requested fields.
try {
    User result = apiInstance.updateUser(body, userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)| User |
 **userId** | [**Integer**](.md)| Id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserAccessFilter"></a>
# **updateUserAccessFilter**
> AccessFilter updateUserAccessFilter(body, userId, accessFilterId, fields)

Update Access Filter

### NOTE: this feature is completely end of life and has been removed from the product.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
AccessFilter body = new AccessFilter(); // AccessFilter | Access Filter
Integer userId = 56; // Integer | id of user
Integer accessFilterId = 56; // Integer | id of Access Filter
String fields = "fields_example"; // String | Requested fields.
try {
    AccessFilter result = apiInstance.updateUserAccessFilter(body, userId, accessFilterId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUserAccessFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessFilter**](AccessFilter.md)| Access Filter |
 **userId** | [**Integer**](.md)| id of user |
 **accessFilterId** | [**Integer**](.md)| id of Access Filter |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**AccessFilter**](AccessFilter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserCredentialsEmail"></a>
# **updateUserCredentialsEmail**
> CredentialsEmail updateUserCredentialsEmail(body, userId, fields)

Update Email/Password Credential

### Email/password login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
CredentialsEmail body = new CredentialsEmail(); // CredentialsEmail | Email/Password Credential
Integer userId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
try {
    CredentialsEmail result = apiInstance.updateUserCredentialsEmail(body, userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#updateUserCredentialsEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CredentialsEmail**](CredentialsEmail.md)| Email/Password Credential |
 **userId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**CredentialsEmail**](CredentialsEmail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="user"></a>
# **user**
> User user(userId, fields)

Get User by Id

### Get information about the user with a specific id.  If the caller is an admin or the caller is the user being specified, then full user information will be returned. Otherwise, a minimal &#x27;public&#x27; variant of the user information will be returned. This contains The user name and avatar url, but no sensitive information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | Id of user
String fields = "fields_example"; // String | Requested fields.
try {
    User result = apiInstance.user(userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#user");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| Id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userAccessFilter"></a>
# **userAccessFilter**
> AccessFilter userAccessFilter(userId, accessFilterId, fields)

Get Access Filter

### NOTE: this feature is completely end of life and has been removed from the product.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | Id of user
Integer accessFilterId = 56; // Integer | Id of Access Filter
String fields = "fields_example"; // String | Requested fields.
try {
    AccessFilter result = apiInstance.userAccessFilter(userId, accessFilterId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userAccessFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| Id of user |
 **accessFilterId** | [**Integer**](.md)| Id of Access Filter |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**AccessFilter**](AccessFilter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userAttributeUserValues"></a>
# **userAttributeUserValues**
> List&lt;UserAttributeWithValue&gt; userAttributeUserValues(userId, fields, userAttributeIds, allValues, includeUnset)

Get User Attribute Values

### Get user attribute values for a given user.  Returns the values of specified user attributes (or all user attributes) for a certain user.  A value for each user attribute is searched for in the following locations, in this order: 1. in the user&#x27;s account information 1. in groups that the user is a member of 1. the default value of the user attribute  If more than one group has a value defined for a user attribute, the group with the lowest rank wins.  The response will only include user attributes for which values were found. Use &#x60;include_unset&#x3D;true&#x60; to include empty records for user attributes with no value.  The value of all hidden user attributes will be blank. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | Id of user
String fields = "fields_example"; // String | Requested fields.
List<Long> userAttributeIds = Arrays.asList(56L); // List<Long> | Specific user attributes to request. Omit or leave blank to request all user attributes.
Boolean allValues = true; // Boolean | If true, returns all values in the search path instead of just the first value found. Useful for debugging group precedence.
Boolean includeUnset = true; // Boolean | If true, returns an empty record for each requested attribute that has no user, group, or default value.
try {
    List<UserAttributeWithValue> result = apiInstance.userAttributeUserValues(userId, fields, userAttributeIds, allValues, includeUnset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userAttributeUserValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| Id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]
 **userAttributeIds** | [**List&lt;Long&gt;**](Long.md)| Specific user attributes to request. Omit or leave blank to request all user attributes. | [optional]
 **allValues** | [**Boolean**](.md)| If true, returns all values in the search path instead of just the first value found. Useful for debugging group precedence. | [optional]
 **includeUnset** | [**Boolean**](.md)| If true, returns an empty record for each requested attribute that has no user, group, or default value. | [optional]

### Return type

[**List&lt;UserAttributeWithValue&gt;**](UserAttributeWithValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userCredentialsApi"></a>
# **userCredentialsApi**
> CredentialsApi userCredentialsApi(userId, fields)

Get API Credential

### API login information for the specified user. This is for &#x27;API Users&#x27; used for the &#x27;old&#x27; query API. THIS SUPPORT HAS BEEN REMOVED.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
try {
    CredentialsApi result = apiInstance.userCredentialsApi(userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCredentialsApi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**CredentialsApi**](CredentialsApi.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userCredentialsApi3"></a>
# **userCredentialsApi3**
> CredentialsApi3 userCredentialsApi3(userId, credentialsApi3Id, fields)

Get API 3 Credential

### API 3 login information for the specified user. This is for the newer API keys that can be added for any user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | Id of user
Integer credentialsApi3Id = 56; // Integer | Id of API 3 Credential
String fields = "fields_example"; // String | Requested fields.
try {
    CredentialsApi3 result = apiInstance.userCredentialsApi3(userId, credentialsApi3Id, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCredentialsApi3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| Id of user |
 **credentialsApi3Id** | [**Integer**](.md)| Id of API 3 Credential |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**CredentialsApi3**](CredentialsApi3.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userCredentialsEmail"></a>
# **userCredentialsEmail**
> CredentialsEmail userCredentialsEmail(userId, fields)

Get Email/Password Credential

### Email/password login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
try {
    CredentialsEmail result = apiInstance.userCredentialsEmail(userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCredentialsEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**CredentialsEmail**](CredentialsEmail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userCredentialsEmbed"></a>
# **userCredentialsEmbed**
> CredentialsEmbed userCredentialsEmbed(userId, credentialsEmbedId, fields)

Get Embedding Credential

### Embed login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | Id of user
Integer credentialsEmbedId = 56; // Integer | Id of Embedding Credential
String fields = "fields_example"; // String | Requested fields.
try {
    CredentialsEmbed result = apiInstance.userCredentialsEmbed(userId, credentialsEmbedId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCredentialsEmbed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| Id of user |
 **credentialsEmbedId** | [**Integer**](.md)| Id of Embedding Credential |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**CredentialsEmbed**](CredentialsEmbed.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userCredentialsGoogle"></a>
# **userCredentialsGoogle**
> CredentialsGoogle userCredentialsGoogle(userId, fields)

Get Google Auth Credential

### Google authentication login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
try {
    CredentialsGoogle result = apiInstance.userCredentialsGoogle(userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCredentialsGoogle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**CredentialsGoogle**](CredentialsGoogle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userCredentialsLdap"></a>
# **userCredentialsLdap**
> CredentialsLDAP userCredentialsLdap(userId, fields)

Get LDAP Credential

### LDAP login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
try {
    CredentialsLDAP result = apiInstance.userCredentialsLdap(userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCredentialsLdap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**CredentialsLDAP**](CredentialsLDAP.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userCredentialsLookerOpenid"></a>
# **userCredentialsLookerOpenid**
> CredentialsLookerOpenid userCredentialsLookerOpenid(userId, fields)

Get Looker OpenId Credential

### Looker Openid login information for the specified user. Used by Looker Analysts.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
try {
    CredentialsLookerOpenid result = apiInstance.userCredentialsLookerOpenid(userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCredentialsLookerOpenid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**CredentialsLookerOpenid**](CredentialsLookerOpenid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userCredentialsOidc"></a>
# **userCredentialsOidc**
> CredentialsOIDC userCredentialsOidc(userId, fields)

Get OIDC Auth Credential

### OpenID Connect (OIDC) authentication login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
try {
    CredentialsOIDC result = apiInstance.userCredentialsOidc(userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCredentialsOidc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**CredentialsOIDC**](CredentialsOIDC.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userCredentialsSaml"></a>
# **userCredentialsSaml**
> CredentialsSaml userCredentialsSaml(userId, fields)

Get Saml Auth Credential

### Saml authentication login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
try {
    CredentialsSaml result = apiInstance.userCredentialsSaml(userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCredentialsSaml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**CredentialsSaml**](CredentialsSaml.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userCredentialsTotp"></a>
# **userCredentialsTotp**
> CredentialsTotp userCredentialsTotp(userId, fields)

Get Two-Factor Credential

### Two-factor login information for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
try {
    CredentialsTotp result = apiInstance.userCredentialsTotp(userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userCredentialsTotp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**CredentialsTotp**](CredentialsTotp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userForCredential"></a>
# **userForCredential**
> User userForCredential(credentialType, credentialId, fields)

Get User by Credential Id

### Get information about the user with a credential of given type with specific id.  This is used to do things like find users by their embed external_user_id. Or, find the user with a given api3 client_id, etc. The &#x27;credential_type&#x27; matchs the &#x27;type&#x27; name of the various credential types. It must be one of the values listed in the table below. The &#x27;credential_id&#x27; is your unique Id for the user and is specific to each type of credential.  An example using the Ruby sdk might look like:  &#x60;sdk.user_for_credential(&#x27;embed&#x27;, &#x27;customer-4959425&#x27;)&#x60;  This table shows the supported &#x27;Credential Type&#x27; strings. The right column is for reference; it shows which field in the given credential type is actually searched when finding a user with the supplied &#x27;credential_id&#x27;.  | Credential Types | Id Field Matched | | ---------------- | ---------------- | | email            | email            | | google           | google_user_id   | | saml             | saml_user_id     | | oidc             | oidc_user_id     | | ldap             | ldap_id          | | api              | token            | | api3             | client_id        | | embed            | external_user_id | | looker_openid    | email            |  NOTE: &#x27;api&#x27; is the legacy Looker query API. The API you are currently looking at is &#x27;api3&#x27;.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
String credentialType = "credentialType_example"; // String | Type name of credential
String credentialId = "credentialId_example"; // String | Id of credential
String fields = "fields_example"; // String | Requested fields.
try {
    User result = apiInstance.userForCredential(credentialType, credentialId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userForCredential");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentialType** | [**String**](.md)| Type name of credential |
 **credentialId** | [**String**](.md)| Id of credential |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userRoles"></a>
# **userRoles**
> List&lt;Role&gt; userRoles(userId, fields, directAssociationOnly)

Get User Roles

### Get information about roles of the user with a specific id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | id of user
String fields = "fields_example"; // String | Requested fields.
Boolean directAssociationOnly = true; // Boolean | Get only roles associated directly with the user: exclude those only associated through groups.
try {
    List<Role> result = apiInstance.userRoles(userId, fields, directAssociationOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| id of user |
 **fields** | [**String**](.md)| Requested fields. | [optional]
 **directAssociationOnly** | [**Boolean**](.md)| Get only roles associated directly with the user: exclude those only associated through groups. | [optional]

### Return type

[**List&lt;Role&gt;**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userSession"></a>
# **userSession**
> Session userSession(userId, sessionId, fields)

Get Web Login Session

### Web login session for the specified user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserApi;


UserApi apiInstance = new UserApi();
Integer userId = 56; // Integer | Id of user
Integer sessionId = 56; // Integer | Id of Web Login Session
String fields = "fields_example"; // String | Requested fields.
try {
    Session result = apiInstance.userSession(userId, sessionId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| Id of user |
 **sessionId** | [**Integer**](.md)| Id of Web Login Session |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**Session**](Session.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

