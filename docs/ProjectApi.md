# ProjectApi

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allGitBranches**](ProjectApi.md#allGitBranches) | **GET** /projects/{project_id}/git_branches | Get All Git Branches
[**allGitConnectionTests**](ProjectApi.md#allGitConnectionTests) | **GET** /projects/{project_id}/git_connection_tests | Get All Git Connection Tests
[**allProjectFiles**](ProjectApi.md#allProjectFiles) | **GET** /projects/{project_id}/files | Get All Project Files
[**allProjects**](ProjectApi.md#allProjects) | **GET** /projects | Get All Projects
[**createGitBranch**](ProjectApi.md#createGitBranch) | **POST** /projects/{project_id}/git_branch | Checkout New Git Branch
[**createGitDeployKey**](ProjectApi.md#createGitDeployKey) | **POST** /projects/{project_id}/git/deploy_key | Create Deploy Key
[**createProject**](ProjectApi.md#createProject) | **POST** /projects | Create Project
[**deleteGitBranch**](ProjectApi.md#deleteGitBranch) | **DELETE** /projects/{project_id}/git_branch/{branch_name} | Delete a Git Branch
[**deployToProduction**](ProjectApi.md#deployToProduction) | **POST** /projects/{project_id}/deploy_to_production | Deploy To Production
[**findGitBranch**](ProjectApi.md#findGitBranch) | **GET** /projects/{project_id}/git_branch/{branch_name} | Find a Git Branch
[**gitBranch**](ProjectApi.md#gitBranch) | **GET** /projects/{project_id}/git_branch | Get Active Git Branch
[**gitDeployKey**](ProjectApi.md#gitDeployKey) | **GET** /projects/{project_id}/git/deploy_key | Git Deploy Key
[**project**](ProjectApi.md#project) | **GET** /projects/{project_id} | Get Project
[**projectFile**](ProjectApi.md#projectFile) | **GET** /projects/{project_id}/files/file | Get Project File
[**projectValidationResults**](ProjectApi.md#projectValidationResults) | **GET** /projects/{project_id}/validate | Cached Project Validation Results
[**projectWorkspace**](ProjectApi.md#projectWorkspace) | **GET** /projects/{project_id}/current_workspace | Get Project Workspace
[**resetProjectToProduction**](ProjectApi.md#resetProjectToProduction) | **POST** /projects/{project_id}/reset_to_production | Reset To Production
[**resetProjectToRemote**](ProjectApi.md#resetProjectToRemote) | **POST** /projects/{project_id}/reset_to_remote | Reset To Remote
[**runGitConnectionTest**](ProjectApi.md#runGitConnectionTest) | **GET** /projects/{project_id}/git_connection_tests/{test_id} | Run Git Connection Test
[**updateGitBranch**](ProjectApi.md#updateGitBranch) | **PUT** /projects/{project_id}/git_branch | Update Project Git Branch
[**updateProject**](ProjectApi.md#updateProject) | **PATCH** /projects/{project_id} | Update Project
[**validateProject**](ProjectApi.md#validateProject) | **POST** /projects/{project_id}/validate | Validate Project

<a name="allGitBranches"></a>
# **allGitBranches**
> List&lt;GitBranch&gt; allGitBranches(projectId)

Get All Git Branches

### Get All Git Branches  Returns a list of git branches in the project repository 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
try {
    List<GitBranch> result = apiInstance.allGitBranches(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#allGitBranches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Project Id |

### Return type

[**List&lt;GitBranch&gt;**](GitBranch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allGitConnectionTests"></a>
# **allGitConnectionTests**
> List&lt;GitConnectionTest&gt; allGitConnectionTests(projectId)

Get All Git Connection Tests

### Get All Git Connection Tests  Returns a list of tests which can be run against a project&#x27;s git connection. Call [Run Git Connection Test](#!/Project/run_git_connection_test) to execute each test in sequence.  Tests are ordered by increasing specificity. Tests should be run in the order returned because later tests require functionality tested by tests earlier in the test list.  For example, a late-stage test for write access is meaningless if connecting to the git server (an early test) is failing. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
try {
    List<GitConnectionTest> result = apiInstance.allGitConnectionTests(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#allGitConnectionTests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Project Id |

### Return type

[**List&lt;GitConnectionTest&gt;**](GitConnectionTest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allProjectFiles"></a>
# **allProjectFiles**
> List&lt;ProjectFile&gt; allProjectFiles(projectId, fields)

Get All Project Files

### Get All Project Files  Returns a list of the files in the project 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String fields = "fields_example"; // String | Requested fields
try {
    List<ProjectFile> result = apiInstance.allProjectFiles(projectId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#allProjectFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Project Id |
 **fields** | [**String**](.md)| Requested fields | [optional]

### Return type

[**List&lt;ProjectFile&gt;**](ProjectFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allProjects"></a>
# **allProjects**
> List&lt;Project&gt; allProjects(fields)

Get All Projects

### Get All Projects  Returns all projects visible to the current user 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String fields = "fields_example"; // String | Requested fields
try {
    List<Project> result = apiInstance.allProjects(fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#allProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fields** | [**String**](.md)| Requested fields | [optional]

### Return type

[**List&lt;Project&gt;**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createGitBranch"></a>
# **createGitBranch**
> GitBranch createGitBranch(projectId, body)

Checkout New Git Branch

### Create and Checkout a Git Branch  Creates and checks out a new branch in the given project repository Only allowed in development mode   - Call &#x60;update_session&#x60; to select the &#x27;dev&#x27; workspace.  Optionally specify a branch name, tag name or commit SHA as the start point in the ref field.   If no ref is specified, HEAD of the current branch will be used as the start point for the new branch.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
GitBranch body = new GitBranch(); // GitBranch | Git Branch
try {
    GitBranch result = apiInstance.createGitBranch(projectId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#createGitBranch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Project Id |
 **body** | [**GitBranch**](GitBranch.md)| Git Branch | [optional]

### Return type

[**GitBranch**](GitBranch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createGitDeployKey"></a>
# **createGitDeployKey**
> String createGitDeployKey(projectId)

Create Deploy Key

### Create Git Deploy Key  Create a public/private key pair for authenticating ssh git requests from Looker to a remote git repository for a particular Looker project.  Returns the public key of the generated ssh key pair.  Copy this public key to your remote git repository&#x27;s ssh keys configuration so that the remote git service can validate and accept git requests from the Looker server. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
try {
    String result = apiInstance.createGitDeployKey(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#createGitDeployKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Project Id |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="createProject"></a>
# **createProject**
> Project createProject(body)

Create Project

### Create A Project  dev mode required. - Call &#x60;update_session&#x60; to select the &#x27;dev&#x27; workspace.  &#x60;name&#x60; is required. &#x60;git_remote_url&#x60; is not allowed. To configure Git for the newly created project, follow the instructions in &#x60;update_project&#x60;.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Project body = new Project(); // Project | Project
try {
    Project result = apiInstance.createProject(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#createProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Project**](Project.md)| Project | [optional]

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGitBranch"></a>
# **deleteGitBranch**
> String deleteGitBranch(projectId, branchName)

Delete a Git Branch

### Delete the specified Git Branch  Delete git branch specified in branch_name path param from local and remote of specified project repository 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String branchName = "branchName_example"; // String | Branch Name
try {
    String result = apiInstance.deleteGitBranch(projectId, branchName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#deleteGitBranch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Project Id |
 **branchName** | [**String**](.md)| Branch Name |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deployToProduction"></a>
# **deployToProduction**
> String deployToProduction(projectId)

Deploy To Production

### Deploy LookML from this Development Mode Project to Production  Git must have been configured, must be in dev mode and deploy permission required  Deploy is a two / three step process 1. Push commits in current branch of dev mode project to the production branch (origin/master).    Note a. This step is skipped in read-only projects.    Note b. If this step is unsuccessful for any reason (e.g. rejected non-fastforward because production branch has              commits not in current branch), subsequent steps will be skipped. 2. If this is the first deploy of this project, create the production project with git repository. 3. Pull the production branch into the production project.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Id of project
try {
    String result = apiInstance.deployToProduction(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#deployToProduction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Id of project |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findGitBranch"></a>
# **findGitBranch**
> GitBranch findGitBranch(projectId, branchName)

Find a Git Branch

### Get the specified Git Branch  Returns the git branch specified in branch_name path param if it exists in the given project repository 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String branchName = "branchName_example"; // String | Branch Name
try {
    GitBranch result = apiInstance.findGitBranch(projectId, branchName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#findGitBranch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Project Id |
 **branchName** | [**String**](.md)| Branch Name |

### Return type

[**GitBranch**](GitBranch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gitBranch"></a>
# **gitBranch**
> GitBranch gitBranch(projectId)

Get Active Git Branch

### Get the Current Git Branch  Returns the git branch currently checked out in the given project repository 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
try {
    GitBranch result = apiInstance.gitBranch(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#gitBranch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Project Id |

### Return type

[**GitBranch**](GitBranch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="gitDeployKey"></a>
# **gitDeployKey**
> String gitDeployKey(projectId)

Git Deploy Key

### Git Deploy Key  Returns the ssh public key previously created for a project&#x27;s git repository. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
try {
    String result = apiInstance.gitDeployKey(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#gitDeployKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Project Id |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="project"></a>
# **project**
> Project project(projectId, fields)

Get Project

### Get A Project  Returns the project with the given project id 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String fields = "fields_example"; // String | Requested fields
try {
    Project result = apiInstance.project(projectId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#project");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Project Id |
 **fields** | [**String**](.md)| Requested fields | [optional]

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="projectFile"></a>
# **projectFile**
> ProjectFile projectFile(projectId, fileId, fields)

Get Project File

### Get Project File Info  Returns information about a file in the project 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String fileId = "fileId_example"; // String | File Id
String fields = "fields_example"; // String | Requested fields
try {
    ProjectFile result = apiInstance.projectFile(projectId, fileId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#projectFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Project Id |
 **fileId** | [**String**](.md)| File Id |
 **fields** | [**String**](.md)| Requested fields | [optional]

### Return type

[**ProjectFile**](ProjectFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="projectValidationResults"></a>
# **projectValidationResults**
> ProjectValidationCache projectValidationResults(projectId, fields)

Cached Project Validation Results

### Get Cached Project Validation Results  Returns the cached results of a previous project validation calculation, if any. Returns http status 204 No Content if no validation results exist.  Validating the content of all the files in a project can be computationally intensive for large projects. Use this API to simply fetch the results of the most recent project validation rather than revalidating the entire project from scratch.  A value of &#x60;\&quot;stale\&quot;: true&#x60; in the response indicates that the project has changed since the cached validation results were computed. The cached validation results may no longer reflect the current state of the project. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String fields = "fields_example"; // String | Requested fields
try {
    ProjectValidationCache result = apiInstance.projectValidationResults(projectId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#projectValidationResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Project Id |
 **fields** | [**String**](.md)| Requested fields | [optional]

### Return type

[**ProjectValidationCache**](ProjectValidationCache.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="projectWorkspace"></a>
# **projectWorkspace**
> ProjectWorkspace projectWorkspace(projectId, fields)

Get Project Workspace

### Get Project Workspace  Returns information about the state of the project files in the currently selected workspace 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String fields = "fields_example"; // String | Requested fields
try {
    ProjectWorkspace result = apiInstance.projectWorkspace(projectId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#projectWorkspace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Project Id |
 **fields** | [**String**](.md)| Requested fields | [optional]

### Return type

[**ProjectWorkspace**](ProjectWorkspace.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetProjectToProduction"></a>
# **resetProjectToProduction**
> String resetProjectToProduction(projectId)

Reset To Production

### Reset a project to the revision of the project that is in production.  **DANGER** this will delete any changes that have not been pushed to a remote repository. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Id of project
try {
    String result = apiInstance.resetProjectToProduction(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#resetProjectToProduction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Id of project |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetProjectToRemote"></a>
# **resetProjectToRemote**
> String resetProjectToRemote(projectId)

Reset To Remote

### Reset a project development branch to the revision of the project that is on the remote.  **DANGER** this will delete any changes that have not been pushed to a remote repository. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Id of project
try {
    String result = apiInstance.resetProjectToRemote(projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#resetProjectToRemote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Id of project |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="runGitConnectionTest"></a>
# **runGitConnectionTest**
> GitConnectionTestResult runGitConnectionTest(projectId, testId)

Run Git Connection Test

### Run a git connection test  Run the named test on the git service used by this project and return the result. This is intended to help debug git connections when things do not work properly, to give more helpful information about why a git url is not working with Looker.  Tests should be run in the order they are returned by [Get All Git Connection Tests](#!/Project/all_git_connection_tests). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String testId = "testId_example"; // String | Test Id
try {
    GitConnectionTestResult result = apiInstance.runGitConnectionTest(projectId, testId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#runGitConnectionTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Project Id |
 **testId** | [**String**](.md)| Test Id |

### Return type

[**GitConnectionTestResult**](GitConnectionTestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateGitBranch"></a>
# **updateGitBranch**
> GitBranch updateGitBranch(body, projectId)

Update Project Git Branch

### Checkout and/or reset --hard an existing Git Branch  Only allowed in development mode   - Call &#x60;update_session&#x60; to select the &#x27;dev&#x27; workspace.  Checkout an existing branch if name field is different from the name of the currently checked out branch.  Optionally specify a branch name, tag name or commit SHA to which the branch should be reset.   **DANGER** hard reset will be force pushed to the remote. Unsaved changes and commits may be permanently lost.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
GitBranch body = new GitBranch(); // GitBranch | Git Branch
String projectId = "projectId_example"; // String | Project Id
try {
    GitBranch result = apiInstance.updateGitBranch(body, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#updateGitBranch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GitBranch**](GitBranch.md)| Git Branch |
 **projectId** | [**String**](.md)| Project Id |

### Return type

[**GitBranch**](GitBranch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProject"></a>
# **updateProject**
> Project updateProject(body, projectId, fields)

Update Project

### Update Project Configuration  Apply changes to a project&#x27;s configuration.   #### Configuring Git for a Project  To set up a Looker project with a remote git repository, follow these steps:  1. Call &#x60;update_session&#x60; to select the &#x27;dev&#x27; workspace. 1. Call &#x60;create_git_deploy_key&#x60; to create a new deploy key for the project 1. Copy the deploy key text into the remote git repository&#x27;s ssh key configuration 1. Call &#x60;update_project&#x60; to set project&#x27;s &#x60;git_remote_url&#x60; ()and &#x60;git_service_name&#x60;, if necessary).  When you modify a project&#x27;s &#x60;git_remote_url&#x60;, Looker connects to the remote repository to fetch metadata. The remote git repository MUST be configured with the Looker-generated deploy key for this project prior to setting the project&#x27;s &#x60;git_remote_url&#x60;.  To set up a Looker project with a git repository residing on the Looker server (a &#x27;bare&#x27; git repo): 1. Call &#x60;update_session&#x60; to select the &#x27;dev&#x27; workspace. 1. Call &#x60;update_project&#x60; setting &#x60;git_remote_url&#x60; to nil and &#x60;git_service_name&#x60; to \&quot;bare\&quot;.  

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
Project body = new Project(); // Project | Project
String projectId = "projectId_example"; // String | Project Id
String fields = "fields_example"; // String | Requested fields
try {
    Project result = apiInstance.updateProject(body, projectId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#updateProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Project**](Project.md)| Project |
 **projectId** | [**String**](.md)| Project Id |
 **fields** | [**String**](.md)| Requested fields | [optional]

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateProject"></a>
# **validateProject**
> ProjectValidation validateProject(projectId, fields)

Validate Project

### Validate Project  Performs lint validation of all lookml files in the project. Returns a list of errors found, if any.  Validating the content of all the files in a project can be computationally intensive for large projects. For best performance, call &#x60;validate_project(project_id)&#x60; only when you really want to recompute project validation. To quickly display the results of the most recent project validation (without recomputing), use &#x60;project_validation_results(project_id)&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProjectApi;


ProjectApi apiInstance = new ProjectApi();
String projectId = "projectId_example"; // String | Project Id
String fields = "fields_example"; // String | Requested fields
try {
    ProjectValidation result = apiInstance.validateProject(projectId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProjectApi#validateProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | [**String**](.md)| Project Id |
 **fields** | [**String**](.md)| Requested fields | [optional]

### Return type

[**ProjectValidation**](ProjectValidation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

