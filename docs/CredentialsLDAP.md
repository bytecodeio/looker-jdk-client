# CredentialsLDAP

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | EMail address |  [optional]
**ldapId** | **String** | LDAP Unique ID for this user |  [optional]
**ldapDn** | **String** | LDAP Distinguished name for this user (as-of the last login) |  [optional]
**createdAt** | **String** | Timestamp for the creation of this credential |  [optional]
**loggedInAt** | **String** | Timestamp for most recent login using credential |  [optional]
**isDisabled** | **Boolean** | Has this credential been disabled? |  [optional]
**type** | **String** | Short name for the type of this kind of credential |  [optional]
**url** | **String** | Link to get this item |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
