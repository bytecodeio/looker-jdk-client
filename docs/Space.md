# Space

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique Id |  [optional]
**contentMetadataId** | **Long** | Id of content metadata |  [optional]
**creatorId** | **Long** | User Id of Creator |  [optional]
**name** | **String** | Unique Name |  [optional]
**isPersonal** | **Boolean** | Space is a user&#x27;s personal space |  [optional]
**isPersonalDescendant** | **Boolean** | Space is descendant of a user&#x27;s personal space |  [optional]
**isSharedRoot** | **Boolean** | Space is the root shared space |  [optional]
**isRoot** | **Boolean** | (DEPRECATED) Space is the root shared space (alias of is_shared_root) |  [optional]
**isUsersRoot** | **Boolean** | Space is the root user space |  [optional]
**isUserRoot** | **Boolean** | (DEPRECATED) Space is the root user space (alias of is_users_root |  [optional]
**isEmbed** | **Boolean** | Space is an embed space |  [optional]
**isEmbedSharedRoot** | **Boolean** | Space is the root embed shared space |  [optional]
**isEmbedUsersRoot** | **Boolean** | Space is the root embed users space |  [optional]
**externalId** | **String** | Embedder&#x27;s Id if this space was autogenerated as an embedding shared space via &#x27;external_group_id&#x27; in an SSO embed login |  [optional]
**parentId** | **Long** | Id of Parent | 
**looks** | [**List&lt;LookWithDashboards&gt;**](LookWithDashboards.md) | Looks |  [optional]
**dashboards** | [**List&lt;DashboardBase&gt;**](DashboardBase.md) | Dashboards |  [optional]
**childCount** | **Long** | Children Count |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
