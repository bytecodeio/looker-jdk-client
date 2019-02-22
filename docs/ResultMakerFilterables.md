# ResultMakerFilterables

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | **String** | The model this filterable comes from (used for field suggestions). |  [optional]
**view** | **String** | The view this filterable comes from (used for field suggestions). |  [optional]
**name** | **String** | The name of the filterable thing (Query or Merged Results). |  [optional]
**listen** | [**List&lt;ResultMakerFilterablesListen&gt;**](ResultMakerFilterablesListen.md) | array of dashboard_filter_name: and field: objects. |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
