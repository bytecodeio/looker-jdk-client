# DashboardElement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique Id |  [optional]
**dashboardId** | **String** | Id of Dashboard |  [optional]
**lookId** | **String** | Id Of Look |  [optional]
**queryId** | **Long** | Id Of Query |  [optional]
**type** | **String** | Type |  [optional]
**refreshInterval** | **String** | Refresh Interval |  [optional]
**refreshIntervalToI** | **Long** | Refresh Interval as integer |  [optional]
**noteText** | **String** | Note Text |  [optional]
**noteTextAsHtml** | **String** | Note Text as Html |  [optional]
**noteDisplay** | **String** | Note Display |  [optional]
**noteState** | **String** | Note State |  [optional]
**titleHidden** | **Boolean** | Whether title is hidden |  [optional]
**titleText** | **String** | Text tile title |  [optional]
**title** | **String** | Title of dashboard element |  [optional]
**subtitleText** | **String** | Text tile subtitle text |  [optional]
**bodyText** | **String** | Text tile body text |  [optional]
**bodyTextAsHtml** | **String** | Text tile body text as Html |  [optional]
**look** | [**LookWithQuery**](LookWithQuery.md) |  |  [optional]
**query** | [**Query**](Query.md) |  |  [optional]
**editUri** | **String** | Relative path of URI of LookML file to edit the dashboard element (LookML dashboard only). |  [optional]
**mergeResultId** | **String** | ID of merge result |  [optional]
**resultMakerId** | **Long** | ID of the ResultMakerLookup entry. |  [optional]
**resultMaker** | [**ResultMakerWithIdVisConfigAndDynamicFields**](ResultMakerWithIdVisConfigAndDynamicFields.md) |  |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
