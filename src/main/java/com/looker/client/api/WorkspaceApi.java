/*
 * Looker API 3.0 Reference
 * ### Authorization  The Looker API uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page. Pass API3 credentials to the **_/login** endpoint to obtain a temporary access_token. Include that access_token in the Authorization header of Looker API requests. For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization)  ### Client SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. Client SDKs for a variety of programming languages can be generated from the Looker API's Swagger JSON metadata to streamline use of the Looker API in your applications. A client SDK for Ruby is available as an example. For more information, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks)  ### Try It Out!  The 'api-docs' page served by the Looker instance includes 'Try It Out!' buttons for each API method. After logging in with API3 credentials, you can use the \"Try It Out!\" buttons to call the API directly from the documentation page to interactively explore API features and responses.  ### Versioning  Future releases of Looker will expand this API release-by-release to securely expose more and more of the core power of Looker to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning. Stable (non-beta) API endpoints should not receive breaking changes in future releases. For more information, see [Looker API Versioning](https://looker.com/docs/r/api/versioning) 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: support@looker.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.looker.client.api;

import com.google.gson.reflect.TypeToken;
import com.looker.client.ApiCallback;
import com.looker.client.ApiClient;
import com.looker.client.ApiException;
import com.looker.client.ApiResponse;
import com.looker.client.Configuration;
import com.looker.client.Pair;
import com.looker.client.ProgressRequestBody;
import com.looker.client.ProgressResponseBody;
import com.looker.client.model.Error;
import com.looker.client.model.Workspace;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkspaceApi {
    private ApiClient apiClient;

    public WorkspaceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkspaceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for allWorkspaces
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call allWorkspacesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/workspaces";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call allWorkspacesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = allWorkspacesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get All Workspaces
     * ### Get All Workspaces  Returns all workspaces available to the calling user. 
     * @return List&lt;Workspace&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Workspace> allWorkspaces() throws ApiException {
        ApiResponse<List<Workspace>> resp = allWorkspacesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get All Workspaces
     * ### Get All Workspaces  Returns all workspaces available to the calling user. 
     * @return ApiResponse&lt;List&lt;Workspace&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Workspace>> allWorkspacesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = allWorkspacesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<Workspace>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All Workspaces (asynchronously)
     * ### Get All Workspaces  Returns all workspaces available to the calling user. 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call allWorkspacesAsync(final ApiCallback<List<Workspace>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = allWorkspacesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Workspace>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for workspace
     * @param workspaceId Id of the workspace  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call workspaceCall(String workspaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/workspaces/{workspace_id}"
            .replaceAll("\\{" + "workspace_id" + "\\}", apiClient.escapeString(workspaceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call workspaceValidateBeforeCall(String workspaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling workspace(Async)");
        }
        
        com.squareup.okhttp.Call call = workspaceCall(workspaceId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Workspace
     * ### Get A Workspace  Returns information about a workspace such as the git status and selected branches of all projects available to the caller&#x27;s user account.  A workspace defines which versions of project files will be used to evaluate expressions and operations that use model definitions - operations such as running queries or rendering dashboards. Each project has its own git repository, and each project in a workspace may be configured to reference particular branch or revision within their respective repositories.  There are two predefined workspaces available: \&quot;production\&quot; and \&quot;dev\&quot;.  The production workspace is shared across all Looker users. Models in the production workspace are read-only. Changing files in production is accomplished by modifying files in a git branch and using Pull Requests to merge the changes from the dev branch into the production branch, and then telling Looker to sync with production.  The dev workspace is local to each Looker user. Changes made to project/model files in the dev workspace only affect that user, and only when the dev workspace is selected as the active workspace for the API session. (See set_session_workspace()).  The dev workspace is NOT unique to an API session. Two applications accessing the Looker API using the same user account will see the same files in the dev workspace. To avoid collisions between API clients it&#x27;s best to have each client login with API3 credentials for a different user account.  Changes made to files in a dev workspace are persistent across API sessions. It&#x27;s a good idea to commit any changes you&#x27;ve made to the git repository, but not strictly required. Your modified files reside in a special user-specific directory on the Looker server and will still be there when you login in again later and use update_session(workspace_id: \&quot;dev\&quot;) to select the dev workspace for the new API session. 
     * @param workspaceId Id of the workspace  (required)
     * @return Workspace
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Workspace workspace(String workspaceId) throws ApiException {
        ApiResponse<Workspace> resp = workspaceWithHttpInfo(workspaceId);
        return resp.getData();
    }

    /**
     * Get Workspace
     * ### Get A Workspace  Returns information about a workspace such as the git status and selected branches of all projects available to the caller&#x27;s user account.  A workspace defines which versions of project files will be used to evaluate expressions and operations that use model definitions - operations such as running queries or rendering dashboards. Each project has its own git repository, and each project in a workspace may be configured to reference particular branch or revision within their respective repositories.  There are two predefined workspaces available: \&quot;production\&quot; and \&quot;dev\&quot;.  The production workspace is shared across all Looker users. Models in the production workspace are read-only. Changing files in production is accomplished by modifying files in a git branch and using Pull Requests to merge the changes from the dev branch into the production branch, and then telling Looker to sync with production.  The dev workspace is local to each Looker user. Changes made to project/model files in the dev workspace only affect that user, and only when the dev workspace is selected as the active workspace for the API session. (See set_session_workspace()).  The dev workspace is NOT unique to an API session. Two applications accessing the Looker API using the same user account will see the same files in the dev workspace. To avoid collisions between API clients it&#x27;s best to have each client login with API3 credentials for a different user account.  Changes made to files in a dev workspace are persistent across API sessions. It&#x27;s a good idea to commit any changes you&#x27;ve made to the git repository, but not strictly required. Your modified files reside in a special user-specific directory on the Looker server and will still be there when you login in again later and use update_session(workspace_id: \&quot;dev\&quot;) to select the dev workspace for the new API session. 
     * @param workspaceId Id of the workspace  (required)
     * @return ApiResponse&lt;Workspace&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Workspace> workspaceWithHttpInfo(String workspaceId) throws ApiException {
        com.squareup.okhttp.Call call = workspaceValidateBeforeCall(workspaceId, null, null);
        Type localVarReturnType = new TypeToken<Workspace>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Workspace (asynchronously)
     * ### Get A Workspace  Returns information about a workspace such as the git status and selected branches of all projects available to the caller&#x27;s user account.  A workspace defines which versions of project files will be used to evaluate expressions and operations that use model definitions - operations such as running queries or rendering dashboards. Each project has its own git repository, and each project in a workspace may be configured to reference particular branch or revision within their respective repositories.  There are two predefined workspaces available: \&quot;production\&quot; and \&quot;dev\&quot;.  The production workspace is shared across all Looker users. Models in the production workspace are read-only. Changing files in production is accomplished by modifying files in a git branch and using Pull Requests to merge the changes from the dev branch into the production branch, and then telling Looker to sync with production.  The dev workspace is local to each Looker user. Changes made to project/model files in the dev workspace only affect that user, and only when the dev workspace is selected as the active workspace for the API session. (See set_session_workspace()).  The dev workspace is NOT unique to an API session. Two applications accessing the Looker API using the same user account will see the same files in the dev workspace. To avoid collisions between API clients it&#x27;s best to have each client login with API3 credentials for a different user account.  Changes made to files in a dev workspace are persistent across API sessions. It&#x27;s a good idea to commit any changes you&#x27;ve made to the git repository, but not strictly required. Your modified files reside in a special user-specific directory on the Looker server and will still be there when you login in again later and use update_session(workspace_id: \&quot;dev\&quot;) to select the dev workspace for the new API session. 
     * @param workspaceId Id of the workspace  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call workspaceAsync(String workspaceId, final ApiCallback<Workspace> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = workspaceValidateBeforeCall(workspaceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Workspace>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}