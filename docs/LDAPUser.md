# LDAPUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | Primary email address |  [optional]
**firstName** | **String** | First name |  [optional]
**lastName** | **String** | Last Name |  [optional]
**ldapId** | **String** | LDAP&#x27;s Unique ID for the user |  [optional]
**allEmails** | **List&lt;String&gt;** | Array of user&#x27;s email addresses and aliases for use in migration |  [optional]
**ldapDn** | **String** | LDAP&#x27;s distinguished name for the user record |  [optional]
**roles** | **List&lt;String&gt;** | Array of user&#x27;s roles (role names only) |  [optional]
**groups** | **List&lt;String&gt;** | Array of user&#x27;s groups (group names only) |  [optional]
**attributes** | **Map&lt;String, String&gt;** | Dictionary of user&#x27;s attrributes (name/value) |  [optional]
**url** | **String** | Link to ldap config |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
