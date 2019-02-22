# Prefetch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ttl** | **Long** | Number of seconds prefetch will live for. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time when prefetch was created. |  [optional]
**computationTime** | **Float** | Number of seconds it took to compute results for prefetch. |  [optional]
**resultSizeBytes** | **Long** | Size of result. |  [optional]
**hitCount** | **Long** | Number of times prefetch has been accessed. |  [optional]
**touchedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time when prefetch was last accessed. |  [optional]
**value** | **Map&lt;String, String&gt;** | Data associated with the queries stored by prefetching the data |  [optional]
**url** | **String** | Link to get this item |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
