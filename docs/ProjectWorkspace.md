# ProjectWorkspace

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**projectId** | **String** | The id of the project |  [optional]
**workspaceId** | **String** | The id of the local workspace containing the project files |  [optional]
**gitStatus** | **String** | The status of the local git directory |  [optional]
**gitHead** | **String** | Git head revision name |  [optional]
**gitBranch** | [**GitBranch**](GitBranch.md) |  |  [optional]
**lookmlType** | **String** | The lookml syntax used by all files in this project |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
