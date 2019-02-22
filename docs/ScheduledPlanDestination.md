# ScheduledPlanDestination

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Unique Id |  [optional]
**scheduledPlanId** | **Long** | Id of a scheduled plan you own |  [optional]
**format** | **String** | The data format to send to the given destination. Supported formats vary by destination, but include: \&quot;txt\&quot;, \&quot;csv\&quot;, \&quot;inline_json\&quot;, \&quot;json\&quot;, \&quot;json_detail\&quot;, \&quot;xlsx\&quot;, \&quot;html\&quot;, \&quot;wysiwyg_pdf\&quot;, \&quot;assembled_pdf\&quot;, \&quot;wysiwyg_png\&quot; |  [optional]
**applyFormatting** | **Boolean** | Are values formatted? (containing currency symbols, digit separators, etc. |  [optional]
**applyVis** | **Boolean** | Whether visualization options are applied to the results. |  [optional]
**address** | **String** | Address for recipient. For email e.g. &#x27;user@example.com&#x27;. For webhooks e.g. &#x27;https://domain/path&#x27;. For Amazon S3 e.g. &#x27;s3://bucket-name/path/&#x27;. For SFTP e.g. &#x27;sftp://host-name/path/&#x27;.  |  [optional]
**lookerRecipient** | **Boolean** | Whether the recipient is a Looker user on the current instance (only applicable for email recipients) |  [optional]
**type** | **String** | Type of the address (&#x27;email&#x27;, &#x27;webhook&#x27;, &#x27;s3&#x27;, or &#x27;sftp&#x27;) |  [optional]
**parameters** | **String** | JSON object containing parameters for external scheduling. For Amazon S3, this requires keys and values for access_key_id and region. For SFTP, this requires a key and value for username. |  [optional]
**secretParameters** | **String** | (Write-Only) JSON object containing secret parameters for external scheduling. For Amazon S3, this requires a key and value for secret_access_key. For SFTP, this requires a key and value for password. |  [optional]
**message** | **String** | Optional message to be included in scheduled emails |  [optional]
**can** | **Map&lt;String, Boolean&gt;** | Operations the current user is able to perform on this object |  [optional]
