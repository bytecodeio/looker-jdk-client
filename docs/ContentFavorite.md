# ContentFavorite

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique Id |  [optional]
**userId** | **Long** | User Id which owns this ContentFavorite |  [optional]
**contentMetadataId** | **Long** | Content Metadata Id associated with this ContentFavorite |  [optional]
**lookId** | **Long** | Id of a look |  [optional]
**dashboardId** | **Long** | Id of a dashboard |  [optional]
**look** | [**LookBasic**](LookBasic.md) |  |  [optional]
**dashboard** | [**DashboardBase**](DashboardBase.md) |  |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
