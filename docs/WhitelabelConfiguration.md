# WhitelabelConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique Id |  [optional]
**logoFile** | **String** | Customer logo image. Expected base64 encoded data (write-only) |  [optional]
**logoUrl** | **String** | Logo image url (read-only) |  [optional]
**faviconFile** | **String** | Custom favicon image. Expected base64 encoded data (write-only) |  [optional]
**faviconUrl** | **String** | Favicon image url (read-only) |  [optional]
**defaultTitle** | **String** | Default page title |  [optional]
**showHelpMenu** | **Boolean** | Boolean to toggle showing help menus |  [optional]
**showDocs** | **Boolean** | Boolean to toggle showing docs |  [optional]
**showEmailSubOptions** | **Boolean** | Boolean to toggle showing email subscription options. |  [optional]
**allowLookerMentions** | **Boolean** | Boolean to toggle mentions of Looker in emails |  [optional]
**allowLookerLinks** | **Boolean** | Boolean to toggle links to Looker in emails |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
