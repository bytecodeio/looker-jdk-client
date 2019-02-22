# LookmlModel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the model. Also used as the unique identifier |  [optional]
**projectName** | **String** | Name of project containing the model |  [optional]
**allowedDbConnectionNames** | **List&lt;String&gt;** | Array of names of connections this model is allowed to use |  [optional]
**unlimitedDbConnections** | **Boolean** | Is this model allowed to use all current and future connections |  [optional]
**hasContent** | **Boolean** | Does this model declaration have have lookml content? |  [optional]
**label** | **String** | UI-friendly name for this model |  [optional]
**explores** | [**List&lt;LookmlModelNavExplore&gt;**](LookmlModelNavExplore.md) | Array of explores (if has_content) |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
