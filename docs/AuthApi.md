# AuthApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOidcTestConfig**](AuthApi.md#createOidcTestConfig) | **POST** /oidc_test_configs | Create OIDC Test Configuration
[**createSamlTestConfig**](AuthApi.md#createSamlTestConfig) | **POST** /saml_test_configs | Create SAML Test Configuration
[**deleteOidcTestConfig**](AuthApi.md#deleteOidcTestConfig) | **DELETE** /oidc_test_configs/{test_slug} | Delete OIDC Test Configuration
[**deleteSamlTestConfig**](AuthApi.md#deleteSamlTestConfig) | **DELETE** /saml_test_configs/{test_slug} | Delete SAML Test Configuration
[**fetchAndParseSamlIdpMetadata**](AuthApi.md#fetchAndParseSamlIdpMetadata) | **POST** /fetch_and_parse_saml_idp_metadata | Parse SAML IdP Url
[**ldapConfig**](AuthApi.md#ldapConfig) | **GET** /ldap_config | Get LDAP Configuration
[**oidcConfig**](AuthApi.md#oidcConfig) | **GET** /oidc_config | Get OIDC Configuration
[**oidcTestConfig**](AuthApi.md#oidcTestConfig) | **GET** /oidc_test_configs/{test_slug} | Get OIDC Test Configuration
[**parseSamlIdpMetadata**](AuthApi.md#parseSamlIdpMetadata) | **POST** /parse_saml_idp_metadata | Parse SAML IdP XML
[**samlConfig**](AuthApi.md#samlConfig) | **GET** /saml_config | Get SAML Configuration
[**samlTestConfig**](AuthApi.md#samlTestConfig) | **GET** /saml_test_configs/{test_slug} | Get SAML Test Configuration
[**testLdapConfigAuth**](AuthApi.md#testLdapConfigAuth) | **PUT** /ldap_config/test_auth | Test LDAP Auth
[**testLdapConfigConnection**](AuthApi.md#testLdapConfigConnection) | **PUT** /ldap_config/test_connection | Test LDAP Connection
[**testLdapConfigUserAuth**](AuthApi.md#testLdapConfigUserAuth) | **PUT** /ldap_config/test_user_auth | Test LDAP User Auth
[**testLdapConfigUserInfo**](AuthApi.md#testLdapConfigUserInfo) | **PUT** /ldap_config/test_user_info | Test LDAP User Info
[**updateLdapConfig**](AuthApi.md#updateLdapConfig) | **PATCH** /ldap_config | Update LDAP Configuration
[**updateOidcConfig**](AuthApi.md#updateOidcConfig) | **PATCH** /oidc_config | Update OIDC Configuration
[**updateSamlConfig**](AuthApi.md#updateSamlConfig) | **PATCH** /saml_config | Update SAML Configuration

<a name="createOidcTestConfig"></a>
# **createOidcTestConfig**
> OIDCConfig createOidcTestConfig(body)

Create OIDC Test Configuration

### Create a OIDC test configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
OIDCConfig body = new OIDCConfig(); // OIDCConfig | OIDC test config
try {
    OIDCConfig result = apiInstance.createOidcTestConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createOidcTestConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OIDCConfig**](OIDCConfig.md)| OIDC test config |

### Return type

[**OIDCConfig**](OIDCConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSamlTestConfig"></a>
# **createSamlTestConfig**
> SamlConfig createSamlTestConfig(body)

Create SAML Test Configuration

### Create a SAML test configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
SamlConfig body = new SamlConfig(); // SamlConfig | SAML test config
try {
    SamlConfig result = apiInstance.createSamlTestConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createSamlTestConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SamlConfig**](SamlConfig.md)| SAML test config |

### Return type

[**SamlConfig**](SamlConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOidcTestConfig"></a>
# **deleteOidcTestConfig**
> String deleteOidcTestConfig(testSlug)

Delete OIDC Test Configuration

### Delete a OIDC test configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String testSlug = "testSlug_example"; // String | Slug of test config
try {
    String result = apiInstance.deleteOidcTestConfig(testSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteOidcTestConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testSlug** | [**String**](.md)| Slug of test config |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSamlTestConfig"></a>
# **deleteSamlTestConfig**
> String deleteSamlTestConfig(testSlug)

Delete SAML Test Configuration

### Delete a SAML test configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String testSlug = "testSlug_example"; // String | Slug of test config
try {
    String result = apiInstance.deleteSamlTestConfig(testSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteSamlTestConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testSlug** | [**String**](.md)| Slug of test config |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchAndParseSamlIdpMetadata"></a>
# **fetchAndParseSamlIdpMetadata**
> SamlMetadataParseResult fetchAndParseSamlIdpMetadata(body)

Parse SAML IdP Url

### Fetch the given url and parse it as a SAML IdP metadata document and return the result. Note that this requires that the url be public or at least at a location where the Looker instance can fetch it without requiring any special authentication. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String body = "body_example"; // String | SAML IdP metadata public url
try {
    SamlMetadataParseResult result = apiInstance.fetchAndParseSamlIdpMetadata(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#fetchAndParseSamlIdpMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| SAML IdP metadata public url |

### Return type

[**SamlMetadataParseResult**](SamlMetadataParseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json

<a name="ldapConfig"></a>
# **ldapConfig**
> LDAPConfig ldapConfig()

Get LDAP Configuration

### Get the LDAP configuration.  Looker can be optionally configured to authenticate users against an Active Directory or other LDAP directory server. LDAP setup requires coordination with an administrator of that directory server.  Only Looker administrators can read and update the LDAP configuration.  Configuring LDAP impacts authentication for all users. This configuration should be done carefully.  Looker maintains a single LDAP configuration. It can be read and updated.       Updates only succeed if the new state will be valid (in the sense that all required fields are populated);       it is up to you to ensure that the configuration is appropriate and correct).  LDAP is enabled or disabled for Looker using the **enabled** field.  Looker will never return an **auth_password** field. That value can be set, but never retrieved.  See the [Looker LDAP docs](https://www.looker.com/docs/r/api/ldap_setup) for additional information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
try {
    LDAPConfig result = apiInstance.ldapConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#ldapConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LDAPConfig**](LDAPConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oidcConfig"></a>
# **oidcConfig**
> OIDCConfig oidcConfig()

Get OIDC Configuration

### Get the OIDC configuration.  Looker can be optionally configured to authenticate users against an OpenID Connect (OIDC) authentication server. OIDC setup requires coordination with an administrator of that server.  Only Looker administrators can read and update the OIDC configuration.  Configuring OIDC impacts authentication for all users. This configuration should be done carefully.  Looker maintains a single OIDC configuation. It can be read and updated.       Updates only succeed if the new state will be valid (in the sense that all required fields are populated);       it is up to you to ensure that the configuration is appropriate and correct).  OIDC is enabled or disabled for Looker using the **enabled** field. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
try {
    OIDCConfig result = apiInstance.oidcConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#oidcConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OIDCConfig**](OIDCConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oidcTestConfig"></a>
# **oidcTestConfig**
> OIDCConfig oidcTestConfig(testSlug)

Get OIDC Test Configuration

### Get a OIDC test configuration by test_slug. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String testSlug = "testSlug_example"; // String | Slug of test config
try {
    OIDCConfig result = apiInstance.oidcTestConfig(testSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#oidcTestConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testSlug** | [**String**](.md)| Slug of test config |

### Return type

[**OIDCConfig**](OIDCConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="parseSamlIdpMetadata"></a>
# **parseSamlIdpMetadata**
> SamlMetadataParseResult parseSamlIdpMetadata(body)

Parse SAML IdP XML

### Parse the given xml as a SAML IdP metadata document and return the result. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String body = "body_example"; // String | SAML IdP metadata xml
try {
    SamlMetadataParseResult result = apiInstance.parseSamlIdpMetadata(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#parseSamlIdpMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)| SAML IdP metadata xml |

### Return type

[**SamlMetadataParseResult**](SamlMetadataParseResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json

<a name="samlConfig"></a>
# **samlConfig**
> SamlConfig samlConfig()

Get SAML Configuration

### Get the SAML configuration.  Looker can be optionally configured to authenticate users against a SAML authentication server. SAML setup requires coordination with an administrator of that server.  Only Looker administrators can read and update the SAML configuration.  Configuring SAML impacts authentication for all users. This configuration should be done carefully.  Looker maintains a single SAML configuation. It can be read and updated.       Updates only succeed if the new state will be valid (in the sense that all required fields are populated);       it is up to you to ensure that the configuration is appropriate and correct).  SAML is enabled or disabled for Looker using the **enabled** field. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
try {
    SamlConfig result = apiInstance.samlConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#samlConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SamlConfig**](SamlConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="samlTestConfig"></a>
# **samlTestConfig**
> SamlConfig samlTestConfig(testSlug)

Get SAML Test Configuration

### Get a SAML test configuration by test_slug. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String testSlug = "testSlug_example"; // String | Slug of test config
try {
    SamlConfig result = apiInstance.samlTestConfig(testSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#samlTestConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testSlug** | [**String**](.md)| Slug of test config |

### Return type

[**SamlConfig**](SamlConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="testLdapConfigAuth"></a>
# **testLdapConfigAuth**
> LDAPConfigTestResult testLdapConfigAuth(body)

Test LDAP Auth

### Test the connection authentication settings for an LDAP configuration.  This tests that the connection is possible and that a &#x27;server&#x27; account to be used by Looker can       authenticate to the LDAP server given connection and authentication information.  **connection_host**, **connection_port**, and **auth_username**, are required.       **connection_tls** and **auth_password** are optional.  Example: &#x60;&#x60;&#x60;json {   \&quot;connection_host\&quot;: \&quot;ldap.example.com\&quot;,   \&quot;connection_port\&quot;: \&quot;636\&quot;,   \&quot;connection_tls\&quot;: true,   \&quot;auth_username\&quot;: \&quot;cn&#x3D;looker,dc&#x3D;example,dc&#x3D;com\&quot;,   \&quot;auth_password\&quot;: \&quot;secret\&quot; } &#x60;&#x60;&#x60;  Looker will never return an **auth_password**. If this request omits the **auth_password** field, then       the **auth_password** value from the active config (if present) will be used for the test.  The active LDAP settings are not modified.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
LDAPConfig body = new LDAPConfig(); // LDAPConfig | LDAP Config
try {
    LDAPConfigTestResult result = apiInstance.testLdapConfigAuth(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#testLdapConfigAuth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LDAPConfig**](LDAPConfig.md)| LDAP Config |

### Return type

[**LDAPConfigTestResult**](LDAPConfigTestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testLdapConfigConnection"></a>
# **testLdapConfigConnection**
> LDAPConfigTestResult testLdapConfigConnection(body)

Test LDAP Connection

### Test the connection settings for an LDAP configuration.  This tests that the connection is possible given a connection_host and connection_port.  **connection_host** and **connection_port** are required. **connection_tls** is optional.  Example: &#x60;&#x60;&#x60;json {   \&quot;connection_host\&quot;: \&quot;ldap.example.com\&quot;,   \&quot;connection_port\&quot;: \&quot;636\&quot;,   \&quot;connection_tls\&quot;: true } &#x60;&#x60;&#x60;  No authentication to the LDAP server is attempted.  The active LDAP settings are not modified. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
LDAPConfig body = new LDAPConfig(); // LDAPConfig | LDAP Config
try {
    LDAPConfigTestResult result = apiInstance.testLdapConfigConnection(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#testLdapConfigConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LDAPConfig**](LDAPConfig.md)| LDAP Config |

### Return type

[**LDAPConfigTestResult**](LDAPConfigTestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testLdapConfigUserAuth"></a>
# **testLdapConfigUserAuth**
> LDAPConfigTestResult testLdapConfigUserAuth(body)

Test LDAP User Auth

### Test the user authentication settings for an LDAP configuration.  This test accepts a full LDAP configuration along with a username/password pair and attempts to       authenticate the user with the LDAP server. The configuration is validated before attempting the       authentication.  Looker will never return an **auth_password**. If this request omits the **auth_password** field, then       the **auth_password** value from the active config (if present) will be used for the test.  **test_ldap_user** and **test_ldap_password** are required.  The active LDAP settings are not modified.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
LDAPConfig body = new LDAPConfig(); // LDAPConfig | LDAP Config
try {
    LDAPConfigTestResult result = apiInstance.testLdapConfigUserAuth(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#testLdapConfigUserAuth");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LDAPConfig**](LDAPConfig.md)| LDAP Config |

### Return type

[**LDAPConfigTestResult**](LDAPConfigTestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testLdapConfigUserInfo"></a>
# **testLdapConfigUserInfo**
> LDAPConfigTestResult testLdapConfigUserInfo(body)

Test LDAP User Info

### Test the user authentication settings for an LDAP configuration without authenticating the user.  This test will let you easily test the mapping for user properties and roles for any user without      needing to authenticate as that user.  This test accepts a full LDAP configuration along with a username and attempts to find the full info      for the user from the LDAP server without actually authenticating the user. So, user password is not      required.The configuration is validated before attempting to contact the server.  **test_ldap_user** is required.  The active LDAP settings are not modified.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
LDAPConfig body = new LDAPConfig(); // LDAPConfig | LDAP Config
try {
    LDAPConfigTestResult result = apiInstance.testLdapConfigUserInfo(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#testLdapConfigUserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LDAPConfig**](LDAPConfig.md)| LDAP Config |

### Return type

[**LDAPConfigTestResult**](LDAPConfigTestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLdapConfig"></a>
# **updateLdapConfig**
> LDAPConfig updateLdapConfig(body)

Update LDAP Configuration

### Update the LDAP configuration.  Configuring LDAP impacts authentication for all users. This configuration should be done carefully.  Only Looker administrators can read and update the LDAP configuration.  LDAP is enabled or disabled for Looker using the **enabled** field.  It is **highly** recommended that any LDAP setting changes be tested using the APIs below before being set globally.  See the [Looker LDAP docs](https://www.looker.com/docs/r/api/ldap_setup) for additional information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
LDAPConfig body = new LDAPConfig(); // LDAPConfig | LDAP Config
try {
    LDAPConfig result = apiInstance.updateLdapConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateLdapConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LDAPConfig**](LDAPConfig.md)| LDAP Config |

### Return type

[**LDAPConfig**](LDAPConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOidcConfig"></a>
# **updateOidcConfig**
> OIDCConfig updateOidcConfig(body)

Update OIDC Configuration

### Update the OIDC configuration.  Configuring OIDC impacts authentication for all users. This configuration should be done carefully.  Only Looker administrators can read and update the OIDC configuration.  OIDC is enabled or disabled for Looker using the **enabled** field.  It is **highly** recommended that any OIDC setting changes be tested using the APIs below before being set globally. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
OIDCConfig body = new OIDCConfig(); // OIDCConfig | OIDC Config
try {
    OIDCConfig result = apiInstance.updateOidcConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateOidcConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OIDCConfig**](OIDCConfig.md)| OIDC Config |

### Return type

[**OIDCConfig**](OIDCConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSamlConfig"></a>
# **updateSamlConfig**
> SamlConfig updateSamlConfig(body)

Update SAML Configuration

### Update the SAML configuration.  Configuring SAML impacts authentication for all users. This configuration should be done carefully.  Only Looker administrators can read and update the SAML configuration.  SAML is enabled or disabled for Looker using the **enabled** field.  It is **highly** recommended that any SAML setting changes be tested using the APIs below before being set globally. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
SamlConfig body = new SamlConfig(); // SamlConfig | SAML Config
try {
    SamlConfig result = apiInstance.updateSamlConfig(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateSamlConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SamlConfig**](SamlConfig.md)| SAML Config |

### Return type

[**SamlConfig**](SamlConfig.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

