# LDAPUserAttributeRead

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of User Attribute in LDAP |  [optional]
**required** | **Boolean** | Required to be in LDAP assertion for login to be allowed to succeed |  [optional]
**userAttributes** | [**List&lt;UserAttribute&gt;**](UserAttribute.md) | Looker User Attributes |  [optional]
**url** | **String** | Link to LDAP config |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
