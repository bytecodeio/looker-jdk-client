# ScheduledPlanApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allScheduledPlans**](ScheduledPlanApi.md#allScheduledPlans) | **GET** /scheduled_plans | Get All Scheduled Plans
[**createScheduledPlan**](ScheduledPlanApi.md#createScheduledPlan) | **POST** /scheduled_plans | Create Scheduled Plan
[**deleteScheduledPlan**](ScheduledPlanApi.md#deleteScheduledPlan) | **DELETE** /scheduled_plans/{scheduled_plan_id} | Delete Scheduled Plan
[**scheduledPlan**](ScheduledPlanApi.md#scheduledPlan) | **GET** /scheduled_plans/{scheduled_plan_id} | Get Scheduled Plan
[**scheduledPlanRunOnce**](ScheduledPlanApi.md#scheduledPlanRunOnce) | **POST** /scheduled_plans/run_once | Run Scheduled Plan Once
[**scheduledPlansForDashboard**](ScheduledPlanApi.md#scheduledPlansForDashboard) | **GET** /scheduled_plans/dashboard/{dashboard_id} | Scheduled Plans for Dashboard
[**scheduledPlansForLook**](ScheduledPlanApi.md#scheduledPlansForLook) | **GET** /scheduled_plans/look/{look_id} | Scheduled Plans for Look
[**scheduledPlansForLookmlDashboard**](ScheduledPlanApi.md#scheduledPlansForLookmlDashboard) | **GET** /scheduled_plans/lookml_dashboard/{lookml_dashboard_id} | Scheduled Plans for LookML Dashboard
[**scheduledPlansForSpace**](ScheduledPlanApi.md#scheduledPlansForSpace) | **GET** /scheduled_plans/space/{space_id} | Scheduled Plans for Space
[**updateScheduledPlan**](ScheduledPlanApi.md#updateScheduledPlan) | **PATCH** /scheduled_plans/{scheduled_plan_id} | Update Scheduled Plan

<a name="allScheduledPlans"></a>
# **allScheduledPlans**
> List&lt;ScheduledPlan&gt; allScheduledPlans(userId, fields)

Get All Scheduled Plans

### Get All Scheduled Plans  Returns all scheduled plans owned by the caller or given user.  If no user_id is provided, this function returns the scheduled plans owned by the caller.   The caller must have &#x60;see_schedules&#x60; permission to see other users&#x27; scheduled plans.   

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
Integer userId = 56; // Integer | User Id (default is requesting user if not specified)
String fields = "fields_example"; // String | Requested fields.
try {
    List<ScheduledPlan> result = apiInstance.allScheduledPlans(userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#allScheduledPlans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**Integer**](.md)| User Id (default is requesting user if not specified) | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;ScheduledPlan&gt;**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createScheduledPlan"></a>
# **createScheduledPlan**
> ScheduledPlan createScheduledPlan(body)

Create Scheduled Plan

### Create a Scheduled Plan  Create a scheduled plan to render a Look or Dashboard on a recurring schedule.  The queries that provide the data for the look or dashboard are run in the context of user account that owns the scheduled plan.  Admins can create scheduled plans on behalf of other users by specifying a user id.  Scheduled plan destinations must specify the data format to produce and send to the destination  Scheduled Plan Destination formats:  | format | Description | :-----------: | :--- | | json | A JSON object containing a &#x60;data&#x60; property which contains an array of JSON objects, one per row. No metadata. | json_detail | Row data plus metadata describing the fields, pivots, table calcs, and other aspects of the query | inline_json | Same as the JSON format, except that the &#x60;data&#x60; property is a string containing JSON-escaped row data. Additional properties describe the data operation. This format is primarily used to send data to web hooks so that the web hook doesn&#x27;t have to re-encode the JSON row data in order to pass it on to its ultimate destination. | csv | Comma separated values with a header | txt | Tab separated values with a header | html | Simple html | xlsx | MS Excel spreadsheet | wysiwyg_pdf | Dashboard rendered in a tiled layout to produce a PDF document | assembled_pdf | Dashboard rendered in a single column layout to produce a PDF document | wysiwyg_png | Dashboard rendered in a tiled layout to produce a PNG image ||  Valid formats vary by destination type and source object. &#x60;wysiwyg_pdf&#x60; is only valid for dashboards, for example.   

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
ScheduledPlan body = new ScheduledPlan(); // ScheduledPlan | Scheduled Plan
try {
    ScheduledPlan result = apiInstance.createScheduledPlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#createScheduledPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScheduledPlan**](ScheduledPlan.md)| Scheduled Plan | [optional]

### Return type

[**ScheduledPlan**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteScheduledPlan"></a>
# **deleteScheduledPlan**
> String deleteScheduledPlan(scheduledPlanId)

Delete Scheduled Plan

### Delete a Scheduled Plan  Normal users can only delete their own scheduled plans. Admins can delete other users&#x27; scheduled plans. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
Integer scheduledPlanId = 56; // Integer | Scheduled Plan Id
try {
    String result = apiInstance.deleteScheduledPlan(scheduledPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#deleteScheduledPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduledPlanId** | [**Integer**](.md)| Scheduled Plan Id |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="scheduledPlan"></a>
# **scheduledPlan**
> ScheduledPlan scheduledPlan(scheduledPlanId, fields)

Get Scheduled Plan

### Get Information About a Scheduled Plan  Admins can fetch information about other users&#x27; Scheduled Plans. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
Integer scheduledPlanId = 56; // Integer | Scheduled Plan Id
String fields = "fields_example"; // String | Requested fields.
try {
    ScheduledPlan result = apiInstance.scheduledPlan(scheduledPlanId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#scheduledPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduledPlanId** | [**Integer**](.md)| Scheduled Plan Id |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**ScheduledPlan**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="scheduledPlanRunOnce"></a>
# **scheduledPlanRunOnce**
> ScheduledPlan scheduledPlanRunOnce(body)

Run Scheduled Plan Once

### Run a Scheduled Plan Immediately  Create a scheduled plan that runs only once, and immediately.  This can be useful for testing a Scheduled Plan before committing to a production schedule.  Admins can create scheduled plans on behalf of other users by specifying a user id.  Scheduled plan destinations must specify the data format to produce and send to the destination  Scheduled Plan Destination formats:  | format | Description | :-----------: | :--- | | json | A JSON object containing a &#x60;data&#x60; property which contains an array of JSON objects, one per row. No metadata. | json_detail | Row data plus metadata describing the fields, pivots, table calcs, and other aspects of the query | inline_json | Same as the JSON format, except that the &#x60;data&#x60; property is a string containing JSON-escaped row data. Additional properties describe the data operation. This format is primarily used to send data to web hooks so that the web hook doesn&#x27;t have to re-encode the JSON row data in order to pass it on to its ultimate destination. | csv | Comma separated values with a header | txt | Tab separated values with a header | html | Simple html | xlsx | MS Excel spreadsheet | wysiwyg_pdf | Dashboard rendered in a tiled layout to produce a PDF document | assembled_pdf | Dashboard rendered in a single column layout to produce a PDF document | wysiwyg_png | Dashboard rendered in a tiled layout to produce a PNG image ||  Valid formats vary by destination type and source object. &#x60;wysiwyg_pdf&#x60; is only valid for dashboards, for example.   

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
ScheduledPlan body = new ScheduledPlan(); // ScheduledPlan | Scheduled Plan
try {
    ScheduledPlan result = apiInstance.scheduledPlanRunOnce(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#scheduledPlanRunOnce");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScheduledPlan**](ScheduledPlan.md)| Scheduled Plan | [optional]

### Return type

[**ScheduledPlan**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scheduledPlansForDashboard"></a>
# **scheduledPlansForDashboard**
> List&lt;ScheduledPlan&gt; scheduledPlansForDashboard(dashboardId, userId, fields)

Scheduled Plans for Dashboard

### Get Scheduled Plans for a Dashboard  Returns all scheduled plans owned by the caller or given user, for a given dashboard.  If no user_id is provided, this function returns the scheduled plans owned by the caller.   The caller must have &#x60;see_schedules&#x60; permission to see other users&#x27; scheduled plans.   

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
Integer dashboardId = 56; // Integer | Dashboard Id
Integer userId = 56; // Integer | User Id (default is requesting user if not specified)
String fields = "fields_example"; // String | Requested fields.
try {
    List<ScheduledPlan> result = apiInstance.scheduledPlansForDashboard(dashboardId, userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#scheduledPlansForDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | [**Integer**](.md)| Dashboard Id |
 **userId** | [**Integer**](.md)| User Id (default is requesting user if not specified) | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;ScheduledPlan&gt;**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="scheduledPlansForLook"></a>
# **scheduledPlansForLook**
> List&lt;ScheduledPlan&gt; scheduledPlansForLook(lookId, userId, fields)

Scheduled Plans for Look

### Get Scheduled Plans for a Look  Returns all scheduled plans owned by the caller or given user, for a given look.  If no user_id is provided, this function returns the scheduled plans owned by the caller.   The caller must have &#x60;see_schedules&#x60; permission to see other users&#x27; scheduled plans.   

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
Integer lookId = 56; // Integer | Look Id
Integer userId = 56; // Integer | User Id (default is requesting user if not specified)
String fields = "fields_example"; // String | Requested fields.
try {
    List<ScheduledPlan> result = apiInstance.scheduledPlansForLook(lookId, userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#scheduledPlansForLook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookId** | [**Integer**](.md)| Look Id |
 **userId** | [**Integer**](.md)| User Id (default is requesting user if not specified) | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;ScheduledPlan&gt;**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="scheduledPlansForLookmlDashboard"></a>
# **scheduledPlansForLookmlDashboard**
> List&lt;ScheduledPlan&gt; scheduledPlansForLookmlDashboard(lookmlDashboardId, userId, fields)

Scheduled Plans for LookML Dashboard

### Get Scheduled Plans for a LookML Dashboard  Returns all scheduled plans owned by the caller or given user, for a given LookML dashboard.  If no user_id is provided, this function returns the scheduled plans owned by the caller.   The caller must have &#x60;see_schedules&#x60; permission to see other users&#x27; scheduled plans.   

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
Integer lookmlDashboardId = 56; // Integer | LookML Dashboard Id
Integer userId = 56; // Integer | User Id (default is requesting user if not specified)
String fields = "fields_example"; // String | Requested fields.
try {
    List<ScheduledPlan> result = apiInstance.scheduledPlansForLookmlDashboard(lookmlDashboardId, userId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#scheduledPlansForLookmlDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookmlDashboardId** | [**Integer**](.md)| LookML Dashboard Id |
 **userId** | [**Integer**](.md)| User Id (default is requesting user if not specified) | [optional]
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;ScheduledPlan&gt;**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="scheduledPlansForSpace"></a>
# **scheduledPlansForSpace**
> List&lt;ScheduledPlan&gt; scheduledPlansForSpace(spaceId, fields)

Scheduled Plans for Space

### Get Scheduled Plans for a Space  Returns scheduled plans owned by the caller for a given space id. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
Integer spaceId = 56; // Integer | Space Id
String fields = "fields_example"; // String | Requested fields.
try {
    List<ScheduledPlan> result = apiInstance.scheduledPlansForSpace(spaceId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#scheduledPlansForSpace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | [**Integer**](.md)| Space Id |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;ScheduledPlan&gt;**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateScheduledPlan"></a>
# **updateScheduledPlan**
> ScheduledPlan updateScheduledPlan(body, scheduledPlanId)

Update Scheduled Plan

### Update a Scheduled Plan  Admins can update other users&#x27; Scheduled Plans.  Note: Any scheduled plan destinations specified in an update will **replace** all scheduled plan destinations currently defined for the scheduled plan.  For Example: If a scheduled plan has destinations A, B, and C, and you call update on this scheduled plan specifying only B in the destinations, then destinations A and C will be deleted by the update.  Scheduled plan destinations must specify the data format to produce and send to the destination  Scheduled Plan Destination formats:  | format | Description | :-----------: | :--- | | json | A JSON object containing a &#x60;data&#x60; property which contains an array of JSON objects, one per row. No metadata. | json_detail | Row data plus metadata describing the fields, pivots, table calcs, and other aspects of the query | inline_json | Same as the JSON format, except that the &#x60;data&#x60; property is a string containing JSON-escaped row data. Additional properties describe the data operation. This format is primarily used to send data to web hooks so that the web hook doesn&#x27;t have to re-encode the JSON row data in order to pass it on to its ultimate destination. | csv | Comma separated values with a header | txt | Tab separated values with a header | html | Simple html | xlsx | MS Excel spreadsheet | wysiwyg_pdf | Dashboard rendered in a tiled layout to produce a PDF document | assembled_pdf | Dashboard rendered in a single column layout to produce a PDF document | wysiwyg_png | Dashboard rendered in a tiled layout to produce a PNG image ||  Valid formats vary by destination type and source object. &#x60;wysiwyg_pdf&#x60; is only valid for dashboards, for example.   

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduledPlanApi;


ScheduledPlanApi apiInstance = new ScheduledPlanApi();
ScheduledPlan body = new ScheduledPlan(); // ScheduledPlan | Scheduled Plan
Integer scheduledPlanId = 56; // Integer | Scheduled Plan Id
try {
    ScheduledPlan result = apiInstance.updateScheduledPlan(body, scheduledPlanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduledPlanApi#updateScheduledPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScheduledPlan**](ScheduledPlan.md)| Scheduled Plan |
 **scheduledPlanId** | [**Integer**](.md)| Scheduled Plan Id |

### Return type

[**ScheduledPlan**](ScheduledPlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

