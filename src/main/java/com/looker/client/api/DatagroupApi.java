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
import com.looker.client.model.Datagroup;
import com.looker.client.model.Error;
import com.looker.client.model.ValidationError;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatagroupApi {
    private ApiClient apiClient;

    public DatagroupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DatagroupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for allDatagroups
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call allDatagroupsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/datagroups";

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
    private com.squareup.okhttp.Call allDatagroupsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = allDatagroupsCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get All Datagroups
     * ### Get information about all datagroups. 
     * @return List&lt;Datagroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Datagroup> allDatagroups() throws ApiException {
        ApiResponse<List<Datagroup>> resp = allDatagroupsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get All Datagroups
     * ### Get information about all datagroups. 
     * @return ApiResponse&lt;List&lt;Datagroup&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Datagroup>> allDatagroupsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = allDatagroupsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<Datagroup>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All Datagroups (asynchronously)
     * ### Get information about all datagroups. 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call allDatagroupsAsync(final ApiCallback<List<Datagroup>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = allDatagroupsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Datagroup>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for datagroup
     * @param datagroupId ID of datagroup. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call datagroupCall(String datagroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/datagroups/{datagroup_id}"
            .replaceAll("\\{" + "datagroup_id" + "\\}", apiClient.escapeString(datagroupId.toString()));

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
    private com.squareup.okhttp.Call datagroupValidateBeforeCall(String datagroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'datagroupId' is set
        if (datagroupId == null) {
            throw new ApiException("Missing the required parameter 'datagroupId' when calling datagroup(Async)");
        }
        
        com.squareup.okhttp.Call call = datagroupCall(datagroupId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Datagroup
     * ### Get information about a datagroup. 
     * @param datagroupId ID of datagroup. (required)
     * @return Datagroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Datagroup datagroup(String datagroupId) throws ApiException {
        ApiResponse<Datagroup> resp = datagroupWithHttpInfo(datagroupId);
        return resp.getData();
    }

    /**
     * Get Datagroup
     * ### Get information about a datagroup. 
     * @param datagroupId ID of datagroup. (required)
     * @return ApiResponse&lt;Datagroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Datagroup> datagroupWithHttpInfo(String datagroupId) throws ApiException {
        com.squareup.okhttp.Call call = datagroupValidateBeforeCall(datagroupId, null, null);
        Type localVarReturnType = new TypeToken<Datagroup>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Datagroup (asynchronously)
     * ### Get information about a datagroup. 
     * @param datagroupId ID of datagroup. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call datagroupAsync(String datagroupId, final ApiCallback<Datagroup> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = datagroupValidateBeforeCall(datagroupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Datagroup>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateDatagroup
     * @param body Datagroup (required)
     * @param datagroupId ID of datagroup. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateDatagroupCall(Datagroup body, String datagroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/datagroups/{datagroup_id}"
            .replaceAll("\\{" + "datagroup_id" + "\\}", apiClient.escapeString(datagroupId.toString()));

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
            "application/json"
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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateDatagroupValidateBeforeCall(Datagroup body, String datagroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateDatagroup(Async)");
        }
        // verify the required parameter 'datagroupId' is set
        if (datagroupId == null) {
            throw new ApiException("Missing the required parameter 'datagroupId' when calling updateDatagroup(Async)");
        }
        
        com.squareup.okhttp.Call call = updateDatagroupCall(body, datagroupId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Datagroup
     * ### Update a datagroup using the specified params. 
     * @param body Datagroup (required)
     * @param datagroupId ID of datagroup. (required)
     * @return Datagroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Datagroup updateDatagroup(Datagroup body, String datagroupId) throws ApiException {
        ApiResponse<Datagroup> resp = updateDatagroupWithHttpInfo(body, datagroupId);
        return resp.getData();
    }

    /**
     * Update Datagroup
     * ### Update a datagroup using the specified params. 
     * @param body Datagroup (required)
     * @param datagroupId ID of datagroup. (required)
     * @return ApiResponse&lt;Datagroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Datagroup> updateDatagroupWithHttpInfo(Datagroup body, String datagroupId) throws ApiException {
        com.squareup.okhttp.Call call = updateDatagroupValidateBeforeCall(body, datagroupId, null, null);
        Type localVarReturnType = new TypeToken<Datagroup>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Datagroup (asynchronously)
     * ### Update a datagroup using the specified params. 
     * @param body Datagroup (required)
     * @param datagroupId ID of datagroup. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateDatagroupAsync(Datagroup body, String datagroupId, final ApiCallback<Datagroup> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateDatagroupValidateBeforeCall(body, datagroupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Datagroup>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}