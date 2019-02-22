# HomepageSection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique Id |  [optional]
**title** | **String** | Name of row |  [optional]
**isHeader** | **Boolean** | Is this a header section (has no items) |  [optional]
**order** | **Float** | An arbitrary float representing the sort order of sections. |  [optional]
**detailUrl** | **String** | A URL pointing to a page showing further information about the content in the section. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time at which this section was created. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time at which this section was last updated. |  [optional]
**deletedAt** | [**OffsetDateTime**](OffsetDateTime.md) | Time at which this section was deleted. |  [optional]
**homepageId** | **Long** | Id reference to parent homepage |  [optional]
**homepageItems** | [**List&lt;HomepageItem&gt;**](HomepageItem.md) | Items in the homepage section |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
