# SqlQuery

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**slug** | **String** | The identifier of the SQL query |  [optional]
**lastRuntime** | **Float** | Number of seconds this query took to run the most recent time it was run |  [optional]
**runCount** | **Long** | Number of times this query has been run |  [optional]
**browserLimit** | **Long** | Maximum number of rows this query will display on the SQL Runner page |  [optional]
**sql** | **String** | SQL query text |  [optional]
**lastRunAt** | **String** | The most recent time this query was run |  [optional]
**connection** | [**DBConnectionBase**](DBConnectionBase.md) |  |  [optional]
**modelName** | **String** | Model name this query uses |  [optional]
**creator** | [**UserPublic**](UserPublic.md) |  |  [optional]
**exploreUrl** | **String** | Explore page URL for this SQL query |  [optional]
**plaintext** | **Boolean** | Should this query be rendered as plain text |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
