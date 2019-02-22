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

package com.looker.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.looker.client.model.Query;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * QueryTask
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-15T12:39:13.185-08:00[America/Los_Angeles]")public class QueryTask {

  @SerializedName("id")
  private String id = null;

  @SerializedName("query_id")
  private Long queryId = null;

  @SerializedName("query")
  private Query query = null;

  @SerializedName("generate_links")
  private Boolean generateLinks = null;

  @SerializedName("force_production")
  private Boolean forceProduction = null;

  @SerializedName("path_prefix")
  private String pathPrefix = null;

  @SerializedName("cache")
  private Boolean cache = null;

  @SerializedName("server_table_calcs")
  private Boolean serverTableCalcs = null;

  @SerializedName("cache_only")
  private Boolean cacheOnly = null;

  @SerializedName("cache_key")
  private String cacheKey = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("runtime")
  private Float runtime = null;

  @SerializedName("rebuild_pdts")
  private Boolean rebuildPdts = null;

  @SerializedName("result_source")
  private String resultSource = null;

  @SerializedName("look_id")
  private Long lookId = null;

  @SerializedName("dashboard_id")
  private String dashboardId = null;

  @SerializedName("result_format")
  private String resultFormat = null;

  @SerializedName("can")
  private Map<String, Boolean> can = null;
  /**
  * Unique Id
  * @return id
  **/
  @Schema(description = "Unique Id")
  public String getId() {
    return id;
  }
  public QueryTask queryId(Long queryId) {
    this.queryId = queryId;
    return this;
  }

  

  /**
  * Id of query
  * @return queryId
  **/
  @Schema(description = "Id of query")
  public Long getQueryId() {
    return queryId;
  }
  public void setQueryId(Long queryId) {
    this.queryId = queryId;
  }
  public QueryTask query(Query query) {
    this.query = query;
    return this;
  }

  

  /**
  * Get query
  * @return query
  **/
  @Schema(description = "")
  public Query getQuery() {
    return query;
  }
  public void setQuery(Query query) {
    this.query = query;
  }
  public QueryTask generateLinks(Boolean generateLinks) {
    this.generateLinks = generateLinks;
    return this;
  }

  

  /**
  * whether or not to generate links in the query response.
  * @return generateLinks
  **/
  @Schema(description = "whether or not to generate links in the query response.")
  public Boolean isGenerateLinks() {
    return generateLinks;
  }
  public void setGenerateLinks(Boolean generateLinks) {
    this.generateLinks = generateLinks;
  }
  public QueryTask forceProduction(Boolean forceProduction) {
    this.forceProduction = forceProduction;
    return this;
  }

  

  /**
  * Use production models to run query (even is user is in dev mode).
  * @return forceProduction
  **/
  @Schema(description = "Use production models to run query (even is user is in dev mode).")
  public Boolean isForceProduction() {
    return forceProduction;
  }
  public void setForceProduction(Boolean forceProduction) {
    this.forceProduction = forceProduction;
  }
  public QueryTask pathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
    return this;
  }

  

  /**
  * Prefix to use for drill links.
  * @return pathPrefix
  **/
  @Schema(description = "Prefix to use for drill links.")
  public String getPathPrefix() {
    return pathPrefix;
  }
  public void setPathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
  }
  public QueryTask cache(Boolean cache) {
    this.cache = cache;
    return this;
  }

  

  /**
  * Whether or not to use the cache
  * @return cache
  **/
  @Schema(description = "Whether or not to use the cache")
  public Boolean isCache() {
    return cache;
  }
  public void setCache(Boolean cache) {
    this.cache = cache;
  }
  public QueryTask serverTableCalcs(Boolean serverTableCalcs) {
    this.serverTableCalcs = serverTableCalcs;
    return this;
  }

  

  /**
  * Whether or not to run table calculations on the server
  * @return serverTableCalcs
  **/
  @Schema(description = "Whether or not to run table calculations on the server")
  public Boolean isServerTableCalcs() {
    return serverTableCalcs;
  }
  public void setServerTableCalcs(Boolean serverTableCalcs) {
    this.serverTableCalcs = serverTableCalcs;
  }
  public QueryTask cacheOnly(Boolean cacheOnly) {
    this.cacheOnly = cacheOnly;
    return this;
  }

  

  /**
  * Retrieve any results from cache even if the results have expired.
  * @return cacheOnly
  **/
  @Schema(description = "Retrieve any results from cache even if the results have expired.")
  public Boolean isCacheOnly() {
    return cacheOnly;
  }
  public void setCacheOnly(Boolean cacheOnly) {
    this.cacheOnly = cacheOnly;
  }
  /**
  * cache key used to cache query.
  * @return cacheKey
  **/
  @Schema(description = "cache key used to cache query.")
  public String getCacheKey() {
    return cacheKey;
  }
  public QueryTask status(String status) {
    this.status = status;
    return this;
  }

  

  /**
  * Status of query task.
  * @return status
  **/
  @Schema(description = "Status of query task.")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
  public QueryTask source(String source) {
    this.source = source;
    return this;
  }

  

  /**
  * Source of query task.
  * @return source
  **/
  @Schema(description = "Source of query task.")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }
  /**
  * Runtime of prior queries.
  * @return runtime
  **/
  @Schema(description = "Runtime of prior queries.")
  public Float getRuntime() {
    return runtime;
  }
  public QueryTask rebuildPdts(Boolean rebuildPdts) {
    this.rebuildPdts = rebuildPdts;
    return this;
  }

  

  /**
  * Rebuild PDTS used in query.
  * @return rebuildPdts
  **/
  @Schema(description = "Rebuild PDTS used in query.")
  public Boolean isRebuildPdts() {
    return rebuildPdts;
  }
  public void setRebuildPdts(Boolean rebuildPdts) {
    this.rebuildPdts = rebuildPdts;
  }
  /**
  * Source of the results of the query.
  * @return resultSource
  **/
  @Schema(description = "Source of the results of the query.")
  public String getResultSource() {
    return resultSource;
  }
  public QueryTask lookId(Long lookId) {
    this.lookId = lookId;
    return this;
  }

  

  /**
  * Id of look associated with query.
  * @return lookId
  **/
  @Schema(description = "Id of look associated with query.")
  public Long getLookId() {
    return lookId;
  }
  public void setLookId(Long lookId) {
    this.lookId = lookId;
  }
  public QueryTask dashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  

  /**
  * Id of dashboard associated with query.
  * @return dashboardId
  **/
  @Schema(description = "Id of dashboard associated with query.")
  public String getDashboardId() {
    return dashboardId;
  }
  public void setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
  }
  /**
  * The data format of the query results.
  * @return resultFormat
  **/
  @Schema(description = "The data format of the query results.")
  public String getResultFormat() {
    return resultFormat;
  }
  /**
  * Operations the current user is able to perform on this object
  * @return can
  **/
  @Schema(description = "Operations the current user is able to perform on this object")
  public Map<String, Boolean> getCan() {
    return can;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryTask queryTask = (QueryTask) o;
    return Objects.equals(this.id, queryTask.id) &&
        Objects.equals(this.queryId, queryTask.queryId) &&
        Objects.equals(this.query, queryTask.query) &&
        Objects.equals(this.generateLinks, queryTask.generateLinks) &&
        Objects.equals(this.forceProduction, queryTask.forceProduction) &&
        Objects.equals(this.pathPrefix, queryTask.pathPrefix) &&
        Objects.equals(this.cache, queryTask.cache) &&
        Objects.equals(this.serverTableCalcs, queryTask.serverTableCalcs) &&
        Objects.equals(this.cacheOnly, queryTask.cacheOnly) &&
        Objects.equals(this.cacheKey, queryTask.cacheKey) &&
        Objects.equals(this.status, queryTask.status) &&
        Objects.equals(this.source, queryTask.source) &&
        Objects.equals(this.runtime, queryTask.runtime) &&
        Objects.equals(this.rebuildPdts, queryTask.rebuildPdts) &&
        Objects.equals(this.resultSource, queryTask.resultSource) &&
        Objects.equals(this.lookId, queryTask.lookId) &&
        Objects.equals(this.dashboardId, queryTask.dashboardId) &&
        Objects.equals(this.resultFormat, queryTask.resultFormat) &&
        Objects.equals(this.can, queryTask.can);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, queryId, query, generateLinks, forceProduction, pathPrefix, cache, serverTableCalcs, cacheOnly, cacheKey, status, source, runtime, rebuildPdts, resultSource, lookId, dashboardId, resultFormat, can);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTask {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    generateLinks: ").append(toIndentedString(generateLinks)).append("\n");
    sb.append("    forceProduction: ").append(toIndentedString(forceProduction)).append("\n");
    sb.append("    pathPrefix: ").append(toIndentedString(pathPrefix)).append("\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    serverTableCalcs: ").append(toIndentedString(serverTableCalcs)).append("\n");
    sb.append("    cacheOnly: ").append(toIndentedString(cacheOnly)).append("\n");
    sb.append("    cacheKey: ").append(toIndentedString(cacheKey)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    rebuildPdts: ").append(toIndentedString(rebuildPdts)).append("\n");
    sb.append("    resultSource: ").append(toIndentedString(resultSource)).append("\n");
    sb.append("    lookId: ").append(toIndentedString(lookId)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    resultFormat: ").append(toIndentedString(resultFormat)).append("\n");
    sb.append("    can: ").append(toIndentedString(can)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
