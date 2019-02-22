# DBConnectionBase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the connection. Also used as the unique identifier |  [optional]
**dialect** | [**Dialect**](Dialect.md) |  |  [optional]
**snippets** | [**List&lt;Snippet&gt;**](Snippet.md) | SQL Runner snippets for this connection |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
