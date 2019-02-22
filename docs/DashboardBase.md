# DashboardBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique Id |  [optional]
**userId** | **Long** | Id of User |  [optional]
**title** | **String** | Look Title |  [optional]
**description** | **String** | Description |  [optional]
**readonly** | **Boolean** | Is Read-only |  [optional]
**hidden** | **Boolean** | Is Hidden |  [optional]
**refreshInterval** | **String** | Refresh Interval |  [optional]
**refreshIntervalToI** | **Long** | Refresh Interval as Integer |  [optional]
**space** | [**SpaceBase**](SpaceBase.md) |  |  [optional]
**model** | [**LookModel**](LookModel.md) |  |  [optional]
**contentFavoriteId** | **Long** | Content Favorite Id |  [optional]
**scheduledPlan** | [**ScheduledPlan**](ScheduledPlan.md) |  |  [optional]
**contentMetadataId** | **Long** | Id of content metadata |  [optional]
**queryTimezone** | **String** | Timezone in which the Dashboard will run by default. |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
