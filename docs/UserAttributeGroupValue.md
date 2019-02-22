# UserAttributeGroupValue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique Id of this group-attribute relation |  [optional]
**groupId** | **Long** | Id of group |  [optional]
**userAttributeId** | **Long** | Id of user attribute |  [optional]
**valueIsHidden** | **Boolean** | If true, the \&quot;value\&quot; field will be null, because the attribute settings block access to this value |  [optional]
**rank** | **Long** | Precedence for resolving value for user |  [optional]
**value** | **String** | Value of user attribute for group |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
