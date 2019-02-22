# ResultMakerWithIdVisConfigAndDynamicFields

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique Id. |  [optional]
**dynamicFields** | **String** | JSON string of dynamic field information. |  [optional]
**filterables** | [**List&lt;ResultMakerFilterables&gt;**](ResultMakerFilterables.md) | array of items that can be filtered and information about them. |  [optional]
**sorts** | **String** | Sorts of the constituent Look, Query, or Merge Query |  [optional]
**mergeResultId** | **String** | ID of merge result if this is a merge_result. |  [optional]
**total** | **Boolean** | Total of the constituent Look, Query, or Merge Query |  [optional]
**queryId** | **Long** | ID of query if this is a query. |  [optional]
**query** | [**Query**](Query.md) |  |  [optional]
**visConfig** | **String** | Vis config of the constituent Query, or Merge Query. |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
