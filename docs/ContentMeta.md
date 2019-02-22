# ContentMeta

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique Id |  [optional]
**name** | **String** | Name or title of underlying content |  [optional]
**parentId** | **Long** | Id of Parent Content |  [optional]
**spaceId** | **String** | Id of associated space when content_type is \&quot;space\&quot; |  [optional]
**dashboardId** | **String** | Id of associated dashboard when content_type is \&quot;dashboard\&quot; |  [optional]
**lookId** | **Long** | Id of associated look when content_type is \&quot;look\&quot; |  [optional]
**contentType** | **String** | Content Type (\&quot;dashboard\&quot;, \&quot;look\&quot;, or \&quot;space\&quot;) |  [optional]
**inherits** | **Boolean** | Whether content inherits its access levels from parent |  [optional]
**inheritingId** | **Long** | Id of Inherited Content |  [optional]
**slug** | **String** | Content Slug |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
