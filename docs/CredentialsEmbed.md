# CredentialsEmbed

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique Id |  [optional]
**externalUserId** | **String** | Embedder&#x27;s unique id for the user |  [optional]
**externalGroupId** | **String** | Embedder&#x27;s id for a group to which this user was added during the most recent login |  [optional]
**createdAt** | **String** | Timestamp for the creation of this credential |  [optional]
**loggedInAt** | **String** | Timestamp for most recent login using credential |  [optional]
**isDisabled** | **Boolean** | Has this credential been disabled? |  [optional]
**type** | **String** | Short name for the type of this kind of credential |  [optional]
**url** | **String** | Link to get this item |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
