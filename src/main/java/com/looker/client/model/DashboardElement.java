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
import com.looker.client.model.LookWithQuery;
import com.looker.client.model.Query;
import com.looker.client.model.ResultMakerWithIdVisConfigAndDynamicFields;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DashboardElement
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-15T12:39:13.185-08:00[America/Los_Angeles]")public class DashboardElement {

  @SerializedName("id")
  private String id = null;

  @SerializedName("dashboard_id")
  private String dashboardId = null;

  @SerializedName("look_id")
  private String lookId = null;

  @SerializedName("query_id")
  private Long queryId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("refresh_interval")
  private String refreshInterval = null;

  @SerializedName("refresh_interval_to_i")
  private Long refreshIntervalToI = null;

  @SerializedName("note_text")
  private String noteText = null;

  @SerializedName("note_text_as_html")
  private String noteTextAsHtml = null;

  @SerializedName("note_display")
  private String noteDisplay = null;

  @SerializedName("note_state")
  private String noteState = null;

  @SerializedName("title_hidden")
  private Boolean titleHidden = null;

  @SerializedName("title_text")
  private String titleText = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("subtitle_text")
  private String subtitleText = null;

  @SerializedName("body_text")
  private String bodyText = null;

  @SerializedName("body_text_as_html")
  private String bodyTextAsHtml = null;

  @SerializedName("look")
  private LookWithQuery look = null;

  @SerializedName("query")
  private Query query = null;

  @SerializedName("edit_uri")
  private String editUri = null;

  @SerializedName("merge_result_id")
  private String mergeResultId = null;

  @SerializedName("result_maker_id")
  private Long resultMakerId = null;

  @SerializedName("result_maker")
  private ResultMakerWithIdVisConfigAndDynamicFields resultMaker = null;

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
  * Id of Dashboard
  * @return dashboardId
  **/
  @Schema(description = "Id of Dashboard")
  public String getDashboardId() {
    return dashboardId;
  }
  public DashboardElement lookId(String lookId) {
    this.lookId = lookId;
    return this;
  }

  

  /**
  * Id Of Look
  * @return lookId
  **/
  @Schema(description = "Id Of Look")
  public String getLookId() {
    return lookId;
  }
  public void setLookId(String lookId) {
    this.lookId = lookId;
  }
  public DashboardElement queryId(Long queryId) {
    this.queryId = queryId;
    return this;
  }

  

  /**
  * Id Of Query
  * @return queryId
  **/
  @Schema(description = "Id Of Query")
  public Long getQueryId() {
    return queryId;
  }
  public void setQueryId(Long queryId) {
    this.queryId = queryId;
  }
  public DashboardElement type(String type) {
    this.type = type;
    return this;
  }

  

  /**
  * Type
  * @return type
  **/
  @Schema(description = "Type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public DashboardElement refreshInterval(String refreshInterval) {
    this.refreshInterval = refreshInterval;
    return this;
  }

  

  /**
  * Refresh Interval
  * @return refreshInterval
  **/
  @Schema(description = "Refresh Interval")
  public String getRefreshInterval() {
    return refreshInterval;
  }
  public void setRefreshInterval(String refreshInterval) {
    this.refreshInterval = refreshInterval;
  }
  /**
  * Refresh Interval as integer
  * @return refreshIntervalToI
  **/
  @Schema(description = "Refresh Interval as integer")
  public Long getRefreshIntervalToI() {
    return refreshIntervalToI;
  }
  public DashboardElement noteText(String noteText) {
    this.noteText = noteText;
    return this;
  }

  

  /**
  * Note Text
  * @return noteText
  **/
  @Schema(description = "Note Text")
  public String getNoteText() {
    return noteText;
  }
  public void setNoteText(String noteText) {
    this.noteText = noteText;
  }
  /**
  * Note Text as Html
  * @return noteTextAsHtml
  **/
  @Schema(description = "Note Text as Html")
  public String getNoteTextAsHtml() {
    return noteTextAsHtml;
  }
  public DashboardElement noteDisplay(String noteDisplay) {
    this.noteDisplay = noteDisplay;
    return this;
  }

  

  /**
  * Note Display
  * @return noteDisplay
  **/
  @Schema(description = "Note Display")
  public String getNoteDisplay() {
    return noteDisplay;
  }
  public void setNoteDisplay(String noteDisplay) {
    this.noteDisplay = noteDisplay;
  }
  public DashboardElement noteState(String noteState) {
    this.noteState = noteState;
    return this;
  }

  

  /**
  * Note State
  * @return noteState
  **/
  @Schema(description = "Note State")
  public String getNoteState() {
    return noteState;
  }
  public void setNoteState(String noteState) {
    this.noteState = noteState;
  }
  public DashboardElement titleHidden(Boolean titleHidden) {
    this.titleHidden = titleHidden;
    return this;
  }

  

  /**
  * Whether title is hidden
  * @return titleHidden
  **/
  @Schema(description = "Whether title is hidden")
  public Boolean isTitleHidden() {
    return titleHidden;
  }
  public void setTitleHidden(Boolean titleHidden) {
    this.titleHidden = titleHidden;
  }
  public DashboardElement titleText(String titleText) {
    this.titleText = titleText;
    return this;
  }

  

  /**
  * Text tile title
  * @return titleText
  **/
  @Schema(description = "Text tile title")
  public String getTitleText() {
    return titleText;
  }
  public void setTitleText(String titleText) {
    this.titleText = titleText;
  }
  public DashboardElement title(String title) {
    this.title = title;
    return this;
  }

  

  /**
  * Title of dashboard element
  * @return title
  **/
  @Schema(description = "Title of dashboard element")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public DashboardElement subtitleText(String subtitleText) {
    this.subtitleText = subtitleText;
    return this;
  }

  

  /**
  * Text tile subtitle text
  * @return subtitleText
  **/
  @Schema(description = "Text tile subtitle text")
  public String getSubtitleText() {
    return subtitleText;
  }
  public void setSubtitleText(String subtitleText) {
    this.subtitleText = subtitleText;
  }
  public DashboardElement bodyText(String bodyText) {
    this.bodyText = bodyText;
    return this;
  }

  

  /**
  * Text tile body text
  * @return bodyText
  **/
  @Schema(description = "Text tile body text")
  public String getBodyText() {
    return bodyText;
  }
  public void setBodyText(String bodyText) {
    this.bodyText = bodyText;
  }
  /**
  * Text tile body text as Html
  * @return bodyTextAsHtml
  **/
  @Schema(description = "Text tile body text as Html")
  public String getBodyTextAsHtml() {
    return bodyTextAsHtml;
  }
  public DashboardElement look(LookWithQuery look) {
    this.look = look;
    return this;
  }

  

  /**
  * Get look
  * @return look
  **/
  @Schema(description = "")
  public LookWithQuery getLook() {
    return look;
  }
  public void setLook(LookWithQuery look) {
    this.look = look;
  }
  public DashboardElement query(Query query) {
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
  /**
  * Relative path of URI of LookML file to edit the dashboard element (LookML dashboard only).
  * @return editUri
  **/
  @Schema(description = "Relative path of URI of LookML file to edit the dashboard element (LookML dashboard only).")
  public String getEditUri() {
    return editUri;
  }
  public DashboardElement mergeResultId(String mergeResultId) {
    this.mergeResultId = mergeResultId;
    return this;
  }

  

  /**
  * ID of merge result
  * @return mergeResultId
  **/
  @Schema(description = "ID of merge result")
  public String getMergeResultId() {
    return mergeResultId;
  }
  public void setMergeResultId(String mergeResultId) {
    this.mergeResultId = mergeResultId;
  }
  /**
  * ID of the ResultMakerLookup entry.
  * @return resultMakerId
  **/
  @Schema(description = "ID of the ResultMakerLookup entry.")
  public Long getResultMakerId() {
    return resultMakerId;
  }
  public DashboardElement resultMaker(ResultMakerWithIdVisConfigAndDynamicFields resultMaker) {
    this.resultMaker = resultMaker;
    return this;
  }

  

  /**
  * Get resultMaker
  * @return resultMaker
  **/
  @Schema(description = "")
  public ResultMakerWithIdVisConfigAndDynamicFields getResultMaker() {
    return resultMaker;
  }
  public void setResultMaker(ResultMakerWithIdVisConfigAndDynamicFields resultMaker) {
    this.resultMaker = resultMaker;
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
    DashboardElement dashboardElement = (DashboardElement) o;
    return Objects.equals(this.id, dashboardElement.id) &&
        Objects.equals(this.dashboardId, dashboardElement.dashboardId) &&
        Objects.equals(this.lookId, dashboardElement.lookId) &&
        Objects.equals(this.queryId, dashboardElement.queryId) &&
        Objects.equals(this.type, dashboardElement.type) &&
        Objects.equals(this.refreshInterval, dashboardElement.refreshInterval) &&
        Objects.equals(this.refreshIntervalToI, dashboardElement.refreshIntervalToI) &&
        Objects.equals(this.noteText, dashboardElement.noteText) &&
        Objects.equals(this.noteTextAsHtml, dashboardElement.noteTextAsHtml) &&
        Objects.equals(this.noteDisplay, dashboardElement.noteDisplay) &&
        Objects.equals(this.noteState, dashboardElement.noteState) &&
        Objects.equals(this.titleHidden, dashboardElement.titleHidden) &&
        Objects.equals(this.titleText, dashboardElement.titleText) &&
        Objects.equals(this.title, dashboardElement.title) &&
        Objects.equals(this.subtitleText, dashboardElement.subtitleText) &&
        Objects.equals(this.bodyText, dashboardElement.bodyText) &&
        Objects.equals(this.bodyTextAsHtml, dashboardElement.bodyTextAsHtml) &&
        Objects.equals(this.look, dashboardElement.look) &&
        Objects.equals(this.query, dashboardElement.query) &&
        Objects.equals(this.editUri, dashboardElement.editUri) &&
        Objects.equals(this.mergeResultId, dashboardElement.mergeResultId) &&
        Objects.equals(this.resultMakerId, dashboardElement.resultMakerId) &&
        Objects.equals(this.resultMaker, dashboardElement.resultMaker) &&
        Objects.equals(this.can, dashboardElement.can);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, dashboardId, lookId, queryId, type, refreshInterval, refreshIntervalToI, noteText, noteTextAsHtml, noteDisplay, noteState, titleHidden, titleText, title, subtitleText, bodyText, bodyTextAsHtml, look, query, editUri, mergeResultId, resultMakerId, resultMaker, can);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardElement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    lookId: ").append(toIndentedString(lookId)).append("\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    refreshInterval: ").append(toIndentedString(refreshInterval)).append("\n");
    sb.append("    refreshIntervalToI: ").append(toIndentedString(refreshIntervalToI)).append("\n");
    sb.append("    noteText: ").append(toIndentedString(noteText)).append("\n");
    sb.append("    noteTextAsHtml: ").append(toIndentedString(noteTextAsHtml)).append("\n");
    sb.append("    noteDisplay: ").append(toIndentedString(noteDisplay)).append("\n");
    sb.append("    noteState: ").append(toIndentedString(noteState)).append("\n");
    sb.append("    titleHidden: ").append(toIndentedString(titleHidden)).append("\n");
    sb.append("    titleText: ").append(toIndentedString(titleText)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitleText: ").append(toIndentedString(subtitleText)).append("\n");
    sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
    sb.append("    bodyTextAsHtml: ").append(toIndentedString(bodyTextAsHtml)).append("\n");
    sb.append("    look: ").append(toIndentedString(look)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    editUri: ").append(toIndentedString(editUri)).append("\n");
    sb.append("    mergeResultId: ").append(toIndentedString(mergeResultId)).append("\n");
    sb.append("    resultMakerId: ").append(toIndentedString(resultMakerId)).append("\n");
    sb.append("    resultMaker: ").append(toIndentedString(resultMaker)).append("\n");
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
