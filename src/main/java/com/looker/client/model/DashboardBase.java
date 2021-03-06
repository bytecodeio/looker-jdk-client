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
import com.looker.client.model.LookModel;
import com.looker.client.model.ScheduledPlan;
import com.looker.client.model.SpaceBase;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DashboardBase
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-15T12:39:13.185-08:00[America/Los_Angeles]")public class DashboardBase {

  @SerializedName("id")
  private String id = null;

  @SerializedName("user_id")
  private Long userId = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("readonly")
  private Boolean readonly = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("refresh_interval")
  private String refreshInterval = null;

  @SerializedName("refresh_interval_to_i")
  private Long refreshIntervalToI = null;

  @SerializedName("space")
  private SpaceBase space = null;

  @SerializedName("model")
  private LookModel model = null;

  @SerializedName("content_favorite_id")
  private Long contentFavoriteId = null;

  @SerializedName("scheduled_plan")
  private ScheduledPlan scheduledPlan = null;

  @SerializedName("content_metadata_id")
  private Long contentMetadataId = null;

  @SerializedName("query_timezone")
  private String queryTimezone = null;

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
  /**
  * Id of User
  * @return userId
  **/
  @Schema(description = "Id of User")
  public Long getUserId() {
    return userId;
  }
  /**
  * Look Title
  * @return title
  **/
  @Schema(description = "Look Title")
  public String getTitle() {
    return title;
  }
  /**
  * Description
  * @return description
  **/
  @Schema(description = "Description")
  public String getDescription() {
    return description;
  }
  /**
  * Is Read-only
  * @return readonly
  **/
  @Schema(description = "Is Read-only")
  public Boolean isReadonly() {
    return readonly;
  }
  /**
  * Is Hidden
  * @return hidden
  **/
  @Schema(description = "Is Hidden")
  public Boolean isHidden() {
    return hidden;
  }
  /**
  * Refresh Interval
  * @return refreshInterval
  **/
  @Schema(description = "Refresh Interval")
  public String getRefreshInterval() {
    return refreshInterval;
  }
  /**
  * Refresh Interval as Integer
  * @return refreshIntervalToI
  **/
  @Schema(description = "Refresh Interval as Integer")
  public Long getRefreshIntervalToI() {
    return refreshIntervalToI;
  }
  public DashboardBase space(SpaceBase space) {
    this.space = space;
    return this;
  }

  

  /**
  * Get space
  * @return space
  **/
  @Schema(description = "")
  public SpaceBase getSpace() {
    return space;
  }
  public void setSpace(SpaceBase space) {
    this.space = space;
  }
  public DashboardBase model(LookModel model) {
    this.model = model;
    return this;
  }

  

  /**
  * Get model
  * @return model
  **/
  @Schema(description = "")
  public LookModel getModel() {
    return model;
  }
  public void setModel(LookModel model) {
    this.model = model;
  }
  /**
  * Content Favorite Id
  * @return contentFavoriteId
  **/
  @Schema(description = "Content Favorite Id")
  public Long getContentFavoriteId() {
    return contentFavoriteId;
  }
  public DashboardBase scheduledPlan(ScheduledPlan scheduledPlan) {
    this.scheduledPlan = scheduledPlan;
    return this;
  }

  

  /**
  * Get scheduledPlan
  * @return scheduledPlan
  **/
  @Schema(description = "")
  public ScheduledPlan getScheduledPlan() {
    return scheduledPlan;
  }
  public void setScheduledPlan(ScheduledPlan scheduledPlan) {
    this.scheduledPlan = scheduledPlan;
  }
  /**
  * Id of content metadata
  * @return contentMetadataId
  **/
  @Schema(description = "Id of content metadata")
  public Long getContentMetadataId() {
    return contentMetadataId;
  }
  /**
  * Timezone in which the Dashboard will run by default.
  * @return queryTimezone
  **/
  @Schema(description = "Timezone in which the Dashboard will run by default.")
  public String getQueryTimezone() {
    return queryTimezone;
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
    DashboardBase dashboardBase = (DashboardBase) o;
    return Objects.equals(this.id, dashboardBase.id) &&
        Objects.equals(this.userId, dashboardBase.userId) &&
        Objects.equals(this.title, dashboardBase.title) &&
        Objects.equals(this.description, dashboardBase.description) &&
        Objects.equals(this.readonly, dashboardBase.readonly) &&
        Objects.equals(this.hidden, dashboardBase.hidden) &&
        Objects.equals(this.refreshInterval, dashboardBase.refreshInterval) &&
        Objects.equals(this.refreshIntervalToI, dashboardBase.refreshIntervalToI) &&
        Objects.equals(this.space, dashboardBase.space) &&
        Objects.equals(this.model, dashboardBase.model) &&
        Objects.equals(this.contentFavoriteId, dashboardBase.contentFavoriteId) &&
        Objects.equals(this.scheduledPlan, dashboardBase.scheduledPlan) &&
        Objects.equals(this.contentMetadataId, dashboardBase.contentMetadataId) &&
        Objects.equals(this.queryTimezone, dashboardBase.queryTimezone) &&
        Objects.equals(this.can, dashboardBase.can);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, userId, title, description, readonly, hidden, refreshInterval, refreshIntervalToI, space, model, contentFavoriteId, scheduledPlan, contentMetadataId, queryTimezone, can);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardBase {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    refreshInterval: ").append(toIndentedString(refreshInterval)).append("\n");
    sb.append("    refreshIntervalToI: ").append(toIndentedString(refreshIntervalToI)).append("\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    contentFavoriteId: ").append(toIndentedString(contentFavoriteId)).append("\n");
    sb.append("    scheduledPlan: ").append(toIndentedString(scheduledPlan)).append("\n");
    sb.append("    contentMetadataId: ").append(toIndentedString(contentMetadataId)).append("\n");
    sb.append("    queryTimezone: ").append(toIndentedString(queryTimezone)).append("\n");
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
