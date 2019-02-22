# ProjectValidationCache

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List&lt;ProjectError&gt;**](ProjectError.md) | A list of project errors |  [optional]
**projectDigest** | **String** | A hash value computed from the project&#x27;s current state |  [optional]
**modelsNotValidated** | [**List&lt;ModelsNotValidated&gt;**](ModelsNotValidated.md) | A list of models which were not fully validated |  [optional]
**computationTime** | **Float** | Duration of project validation in seconds |  [optional]
**stale** | **Boolean** | If true, the cached project validation results are no longer accurate because the project has changed since the cached results were calculated |  [optional]
