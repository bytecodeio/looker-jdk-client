# Dialect

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the dialect |  [optional]
**label** | **String** | The human-readable label of the connection |  [optional]
**supportsCostEstimate** | **Boolean** | Whether the dialect supports query cost estimates |  [optional]
**supportsUploadTables** | **Boolean** | Whether the dialect supports uploading tables |  [optional]
**persistentTableIndexes** | **String** | PDT index columns |  [optional]
**persistentTableSortkeys** | **String** | PDT sortkey columns |  [optional]
**persistentTableDistkey** | **String** | PDT distkey column |  [optional]
**supportsStreaming** | **Boolean** | Suports streaming results |  [optional]
**automaticallyRunSqlRunnerSnippets** | **Boolean** | Should SQL Runner snippets automatically be run |  [optional]
**connectionTests** | **List&lt;String&gt;** | Array of names of the tests that can be run on a connection using this dialect |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
