# RunningQueries

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique Id |  [optional]
**user** | [**UserPublic**](UserPublic.md) |  |  [optional]
**query** | [**Query**](Query.md) |  |  [optional]
**sqlQuery** | [**SqlQuery**](SqlQuery.md) |  |  [optional]
**look** | [**LookBasic**](LookBasic.md) |  |  [optional]
**createdAt** | **String** | Date/Time Query was initiated |  [optional]
**completedAt** | **String** | Date/Time Query was completed |  [optional]
**queryId** | **String** | Query Id |  [optional]
**source** | **String** | Source (look, dashboard, queryrunner, explore, etc.) |  [optional]
**nodeId** | **String** | Node Id |  [optional]
**slug** | **String** | Slug |  [optional]
**queryTaskId** | **String** | ID of a Query Task |  [optional]
**cacheKey** | **String** | Cache Key |  [optional]
**connectionName** | **String** | Connection |  [optional]
**dialect** | **String** | Dialect |  [optional]
**connectionId** | **String** | Connection ID |  [optional]
**message** | **String** | Additional Information(Error message or verbose status) |  [optional]
**status** | **String** | Status description |  [optional]
**runtime** | **Double** | Number of seconds elapsed running the Query |  [optional]
**sql** | **String** | SQL text of the query as run |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
