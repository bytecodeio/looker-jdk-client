# ApiAuthApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](ApiAuthApi.md#login) | **POST** /login | Login
[**loginUser**](ApiAuthApi.md#loginUser) | **POST** /login/{user_id} | Login user
[**logout**](ApiAuthApi.md#logout) | **DELETE** /logout | Logout

<a name="login"></a>
# **login**
> AccessToken login(clientId, clientSecret)

Login

### Present client credentials to obtain an authorization token  Looker API implements the OAuth2 [Resource Owner Password Credentials Grant](https://looker.com/docs/r/api/outh2_resource_owner_pc) pattern. The client credentials required for this login must be obtained by creating an API3 key on a user account in the Looker Admin console. The API3 key consists of a public &#x60;client_id&#x60; and a private &#x60;client_secret&#x60;.  The access token returned by &#x60;login&#x60; must be used in the HTTP Authorization header of subsequent API requests, like this: &#x60;&#x60;&#x60; Authorization: token 4QDkCyCtZzYgj4C2p2cj3csJH7zqS5RzKs2kTnG4 &#x60;&#x60;&#x60; Replace \&quot;4QDkCy...\&quot; with the &#x60;access_token&#x60; value returned by &#x60;login&#x60;. The word &#x27;token&#x27; is a string literal and must be included exactly as shown.  For more information and detailed examples of Looker API authorization, see [How to Authenticate to Looker API3](https://github.com/looker/looker-sdk-ruby/blob/master/authentication.md). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiAuthApi;


ApiAuthApi apiInstance = new ApiAuthApi();
String clientId = "clientId_example"; // String | client_id part of API3 Key.
String clientSecret = "clientSecret_example"; // String | client_secret part of API3 Key.
try {
    AccessToken result = apiInstance.login(clientId, clientSecret);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiAuthApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**String**](.md)| client_id part of API3 Key. | [optional]
 **clientSecret** | [**String**](.md)| client_secret part of API3 Key. | [optional]

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loginUser"></a>
# **loginUser**
> AccessToken loginUser(userId)

Login user

### Create an access token for a given user.  This can only be called by an authenticated admin user. It allows that admin to generate a new authentication token for the user with the given user id. That token can then be used for subsequent API calls - which are then performed *as* that target user.  The target user does *not* need to have a pre-existing API client_id/client_secret pair. And, no such credentials are created by this call.  This allows for building systems where api user authentication for an arbitrary number of users is done outside of Looker and funneled through a single &#x27;service account&#x27; with admin permissions. Note that a new access token is generated on each call. If target users are going to be making numerous API calls in a short period then it is wise to cache this authentication token rather than call this before each of those API calls.  See &#x27;login&#x27; for more detail on the access token and how to use it. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiAuthApi;


ApiAuthApi apiInstance = new ApiAuthApi();
Integer userId = 56; // Integer | Id of user.
try {
    AccessToken result = apiInstance.loginUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiAuthApi#loginUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| Id of user. |

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="logout"></a>
# **logout**
> String logout()

Logout

### Logout of the API and invalidate the current access token. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiAuthApi;


ApiAuthApi apiInstance = new ApiAuthApi();
try {
    String result = apiInstance.logout();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiAuthApi#logout");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

