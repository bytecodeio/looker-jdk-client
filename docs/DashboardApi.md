# DashboardApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allDashboards**](DashboardApi.md#allDashboards) | **GET** /dashboards | Get All Dashboards
[**createDashboard**](DashboardApi.md#createDashboard) | **POST** /dashboards | Create Dashboard
[**createDashboardPrefetch**](DashboardApi.md#createDashboardPrefetch) | **POST** /dashboards/{dashboard_id}/prefetch | Create Dashboard Prefetch
[**dashboard**](DashboardApi.md#dashboard) | **GET** /dashboards/{dashboard_id} | Get Dashboard
[**dashboardPrefetch**](DashboardApi.md#dashboardPrefetch) | **GET** /dashboards/{dashboard_id}/prefetch | Get Dashboard Prefetch
[**deleteDashboard**](DashboardApi.md#deleteDashboard) | **DELETE** /dashboards/{dashboard_id} | Delete Dashboard
[**importLookmlDashboard**](DashboardApi.md#importLookmlDashboard) | **POST** /dashboards/{lookml_dashboard_id}/import/{space_id} | Create Dashboard
[**searchDashboards**](DashboardApi.md#searchDashboards) | **GET** /dashboards/search | Search Dashboards
[**syncLookmlDashboard**](DashboardApi.md#syncLookmlDashboard) | **PATCH** /dashboards/{lookml_dashboard_id}/sync | Update Dashboard
[**updateDashboard**](DashboardApi.md#updateDashboard) | **PATCH** /dashboards/{dashboard_id} | Update Dashboard

<a name="allDashboards"></a>
# **allDashboards**
> List&lt;DashboardBase&gt; allDashboards(fields)

Get All Dashboards

### Get information about all active dashboards.  Returns an array of **abbreviated dashboard objects**. Dashboards marked as deleted are excluded from this list.  Get the **full details** of a specific dashboard by id with [Dashboard](#!/Dashboard/dashboard)  Find **deleted dashboards** with [Search Dashboards](#!/Dashboard/search_dashboards) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String fields = "fields_example"; // String | Requested fields.
try {
    List<DashboardBase> result = apiInstance.allDashboards(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#allDashboards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**List&lt;DashboardBase&gt;**](DashboardBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createDashboard"></a>
# **createDashboard**
> Dashboard createDashboard(body)

Create Dashboard

### Create a dashboard with the specified information  Creates a new dashboard object, returning the dashboard details, including the created id.  **Update** an existing dashboard with [Update Dashboard](#!/Dashboard/update_dashboard)  **Permanently delete** an existing dashboard with [Delete Dashboard](#!/Dashboard/delete_dashboard) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
Dashboard body = new Dashboard(); // Dashboard | Dashboard
try {
    Dashboard result = apiInstance.createDashboard(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#createDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Dashboard**](Dashboard.md)| Dashboard | [optional]

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDashboardPrefetch"></a>
# **createDashboardPrefetch**
> PrefetchDashboardRequest createDashboardPrefetch(dashboardId, body)

Create Dashboard Prefetch

### Create a prefetch for a dashboard with the specified information.  **Deprecated** Use [DataGroups](#!/Datagroup) to manage cache invalidation of groups of queries. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String dashboardId = "dashboardId_example"; // String | Id of dashboard
PrefetchDashboardRequest body = new PrefetchDashboardRequest(); // PrefetchDashboardRequest | Parameters for prefetch request
try {
    PrefetchDashboardRequest result = apiInstance.createDashboardPrefetch(dashboardId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#createDashboardPrefetch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | [**String**](.md)| Id of dashboard |
 **body** | [**PrefetchDashboardRequest**](PrefetchDashboardRequest.md)| Parameters for prefetch request | [optional]

### Return type

[**PrefetchDashboardRequest**](PrefetchDashboardRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dashboard"></a>
# **dashboard**
> Dashboard dashboard(dashboardId, fields)

Get Dashboard

### Get information about the dashboard with the specified id  Returns the full details of the identified dashboard object  Get a **summary list** of all active dashboards with [All Dashboards](#!/Dashboard/all_dashboards)  **Search** for dashboards with [Search Dashboards](#!/Dashboard/search_dashboards) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String dashboardId = "dashboardId_example"; // String | Id of dashboard
String fields = "fields_example"; // String | Requested fields.
try {
    Dashboard result = apiInstance.dashboard(dashboardId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#dashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | [**String**](.md)| Id of dashboard |
 **fields** | [**String**](.md)| Requested fields. | [optional]

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dashboardPrefetch"></a>
# **dashboardPrefetch**
> Prefetch dashboardPrefetch(dashboardId, dashboardFilters)

Get Dashboard Prefetch

### Get a prefetch for a dashboard with the specified information.  **Deprecated** Use [DataGroups](#!/Datagroup) to manage cache invalidation of groups of queries. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String dashboardId = "dashboardId_example"; // String | Id of dashboard
List<PrefetchDashboardFilterValue> dashboardFilters = Arrays.asList(new PrefetchDashboardFilterValue()); // List<PrefetchDashboardFilterValue> | JSON encoded string of Dashboard filters that were applied to prefetch
try {
    Prefetch result = apiInstance.dashboardPrefetch(dashboardId, dashboardFilters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#dashboardPrefetch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | [**String**](.md)| Id of dashboard |
 **dashboardFilters** | [**List&lt;PrefetchDashboardFilterValue&gt;**](PrefetchDashboardFilterValue.md)| JSON encoded string of Dashboard filters that were applied to prefetch | [optional]

### Return type

[**Prefetch**](Prefetch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteDashboard"></a>
# **deleteDashboard**
> String deleteDashboard(dashboardId)

Delete Dashboard

### Delete the dashboard with the specified id  Permanently **deletes** a dashboard. (The dashboard cannot be recovered after this operation.)  \&quot;Soft\&quot; delete or hide a dashboard by setting its &#x60;deleted&#x60; status to &#x60;True&#x60; with [Update Dashboard](#!/Dashboard/update_dashboard).  Note: When a dashboard is deleted in the UI, it is soft deleted. Use this API call to permanently remove it, if desired. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String dashboardId = "dashboardId_example"; // String | Id of dashboard
try {
    String result = apiInstance.deleteDashboard(dashboardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#deleteDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | [**String**](.md)| Id of dashboard |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importLookmlDashboard"></a>
# **importLookmlDashboard**
> Dashboard importLookmlDashboard(lookmlDashboardId, spaceId, body)

Create Dashboard

### Import a LookML dashboard to a space as a UDD Creates a UDD (a dashboard which exists in the Looker database rather than as a LookML file) from the LookML dashboard and puts it in the space specified. The created UDD will have a lookml_link_id which links to the original LookML dashboard.  To give the imported dashboard specify a (e.g. title: \&quot;my title\&quot;) in the body of your request, otherwise the imported dashboard will have the same title as the original LookML dashboard.  For this operation to succeed the user must have permission to see the LookML dashboard in question, and have permission to create content in the space the dashboard is being imported to.  **Sync** a linked UDD with [Sync LookML Dashboard] (#!/Dashboard/sync_lookml_dashboard) **Unlink** a linked UDD by setting lookml_link_id to null with [Update Dashboard](#!/Dashboard/update_dashboard) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String lookmlDashboardId = "lookmlDashboardId_example"; // String | Id of LookML dashboard
String spaceId = "spaceId_example"; // String | Id of space to import the dashboard to
Dashboard body = new Dashboard(); // Dashboard | Dashboard
try {
    Dashboard result = apiInstance.importLookmlDashboard(lookmlDashboardId, spaceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#importLookmlDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookmlDashboardId** | [**String**](.md)| Id of LookML dashboard |
 **spaceId** | [**String**](.md)| Id of space to import the dashboard to |
 **body** | [**Dashboard**](Dashboard.md)| Dashboard | [optional]

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchDashboards"></a>
# **searchDashboards**
> List&lt;Dashboard&gt; searchDashboards(fields, id, slug, page, perPage, limit, offset, sorts, title, description, contentFavoriteId, spaceId, deleted, userId, viewCount)

Search Dashboards

### Search all dashboards for matching criteria.  Returns an **array of dashboard objects** that match the specified search criteria.  The parameters &#x60;limit&#x60;, and &#x60;offset&#x60; are recommended for \&quot;paging\&quot; the returned results.  Get a **single dashboard** by id with [Dashboard](#!/Dashboard/dashboard) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
String fields = "fields_example"; // String | Requested fields.
Integer id = 56; // Integer | Match dashboard id.
String slug = "slug_example"; // String | Match dashboard slug.
Integer page = 56; // Integer | Requested page.
Integer perPage = 56; // Integer | Results per page.
Integer limit = 56; // Integer | Number of results to return. (used with offset and takes priority over page and per_page)
Integer offset = 56; // Integer | Number of results to skip before returning any. (used with limit and takes priority over page and per_page)
String sorts = "sorts_example"; // String | Fields to sort by.
String title = "title_example"; // String | Match Dashboard title.
String description = "description_example"; // String | Match Dashboard description.
Integer contentFavoriteId = 56; // Integer | Filter on a content favorite id.
String spaceId = "spaceId_example"; // String | Filter on a particular space.
String deleted = "deleted_example"; // String | Filter on dashboards deleted status.
String userId = "userId_example"; // String | Filter on dashboards created by a particular user.
String viewCount = "viewCount_example"; // String | Filter on a particular value of view_count
try {
    List<Dashboard> result = apiInstance.searchDashboards(fields, id, slug, page, perPage, limit, offset, sorts, title, description, contentFavoriteId, spaceId, deleted, userId, viewCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#searchDashboards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields. | [optional]
 **id** | [**Integer**](.md)| Match dashboard id. | [optional]
 **slug** | [**String**](.md)| Match dashboard slug. | [optional]
 **page** | [**Integer**](.md)| Requested page. | [optional]
 **perPage** | [**Integer**](.md)| Results per page. | [optional]
 **limit** | [**Integer**](.md)| Number of results to return. (used with offset and takes priority over page and per_page) | [optional]
 **offset** | [**Integer**](.md)| Number of results to skip before returning any. (used with limit and takes priority over page and per_page) | [optional]
 **sorts** | [**String**](.md)| Fields to sort by. | [optional]
 **title** | [**String**](.md)| Match Dashboard title. | [optional]
 **description** | [**String**](.md)| Match Dashboard description. | [optional]
 **contentFavoriteId** | [**Integer**](.md)| Filter on a content favorite id. | [optional]
 **spaceId** | [**String**](.md)| Filter on a particular space. | [optional]
 **deleted** | [**String**](.md)| Filter on dashboards deleted status. | [optional]
 **userId** | [**String**](.md)| Filter on dashboards created by a particular user. | [optional]
 **viewCount** | [**String**](.md)| Filter on a particular value of view_count | [optional]

### Return type

[**List&lt;Dashboard&gt;**](Dashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="syncLookmlDashboard"></a>
# **syncLookmlDashboard**
> List&lt;Long&gt; syncLookmlDashboard(body, lookmlDashboardId)

Update Dashboard

### Update all linked dashboards to match the specified LookML dashboard.  Any UDD (a dashboard which exists in the Looker database rather than as a LookML file) which has a lookml_link_id which specifies the LookML dashboard&#x27;s id will be updated so that it matches the current state of the LookML dashboard.  For this operation to succeed the user must have permission to view the LookML dashboard, and only linked dashboards that the user has permission to update will be synced.  To **link** or **unlink** a UDD set the lookml_link_id with [Update Dashboard](#!/Dashboard/update_dashboard) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
Dashboard body = new Dashboard(); // Dashboard | Dashboard
String lookmlDashboardId = "lookmlDashboardId_example"; // String | Id of LookML dashboard
try {
    List<Long> result = apiInstance.syncLookmlDashboard(body, lookmlDashboardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#syncLookmlDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Dashboard**](Dashboard.md)| Dashboard |
 **lookmlDashboardId** | [**String**](.md)| Id of LookML dashboard |

### Return type

**List&lt;Long&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDashboard"></a>
# **updateDashboard**
> Dashboard updateDashboard(body, dashboardId)

Update Dashboard

### Update the dashboard with the specified id  Changes simple (scalar) properties of the dashboard. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DashboardApi;


DashboardApi apiInstance = new DashboardApi();
Dashboard body = new Dashboard(); // Dashboard | Dashboard
String dashboardId = "dashboardId_example"; // String | Id of dashboard
try {
    Dashboard result = apiInstance.updateDashboard(body, dashboardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardApi#updateDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Dashboard**](Dashboard.md)| Dashboard |
 **dashboardId** | [**String**](.md)| Id of dashboard |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

