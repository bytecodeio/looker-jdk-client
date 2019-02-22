# LDAPConfigTestResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Test status code: always &#x27;success&#x27; or &#x27;error&#x27; |  [optional]
**message** | **String** | Short human readable test about the result |  [optional]
**details** | **String** | Additional details for error cases |  [optional]
**user** | [**LDAPUser**](LDAPUser.md) |  |  [optional]
**trace** | **String** | A more detailed trace of incremental results during auth tests |  [optional]
**issues** | [**List&lt;LDAPConfigTestIssue&gt;**](LDAPConfigTestIssue.md) | Array of issues/considerations about the result |  [optional]
**url** | **String** | Link to ldap config |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
