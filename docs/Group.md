# Group

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique Id |  [optional]
**name** | **String** | Name of group |  [optional]
**userCount** | **Long** | Number of users included in this group |  [optional]
**containsCurrentUser** | **Boolean** | Currently logged in user is group member |  [optional]
**externallyManaged** | **Boolean** | Group membership controlled outside of Looker |  [optional]
**includeByDefault** | **Boolean** | New users are added to this group by default |  [optional]
**externalGroupId** | **String** | External Id group if embed group |  [optional]
**canAddToContentMetadata** | **Boolean** | Group can be used in content access controls |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
