# OIDCUserAttributeRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of User Attribute in OIDC |  [optional]
**required** | **Boolean** | Required to be in OIDC assertion for login to be allowed to succeed |  [optional]
**userAttributes** | [**List&lt;UserAttribute&gt;**](UserAttribute.md) | Looker User Attributes |  [optional]
**url** | **String** | Link to oidc config |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
