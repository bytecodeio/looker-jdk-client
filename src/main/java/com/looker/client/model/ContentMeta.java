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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ContentMeta
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-15T12:39:13.185-08:00[America/Los_Angeles]")public class ContentMeta {

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parent_id")
  private Long parentId = null;

  @SerializedName("space_id")
  private String spaceId = null;

  @SerializedName("dashboard_id")
  private String dashboardId = null;

  @SerializedName("look_id")
  private Long lookId = null;

  @SerializedName("content_type")
  private String contentType = null;

  @SerializedName("inherits")
  private Boolean inherits = null;

  @SerializedName("inheriting_id")
  private Long inheritingId = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("can")
  private Map<String, Boolean> can = null;
  /**
  * Unique Id
  * @return id
  **/
  @Schema(description = "Unique Id")
  public Long getId() {
    return id;
  }
  /**
  * Name or title of underlying content
  * @return name
  **/
  @Schema(description = "Name or title of underlying content")
  public String getName() {
    return name;
  }
  /**
  * Id of Parent Content
  * @return parentId
  **/
  @Schema(description = "Id of Parent Content")
  public Long getParentId() {
    return parentId;
  }
  /**
  * Id of associated space when content_type is \&quot;space\&quot;
  * @return spaceId
  **/
  @Schema(description = "Id of associated space when content_type is \"space\"")
  public String getSpaceId() {
    return spaceId;
  }
  /**
  * Id of associated dashboard when content_type is \&quot;dashboard\&quot;
  * @return dashboardId
  **/
  @Schema(description = "Id of associated dashboard when content_type is \"dashboard\"")
  public String getDashboardId() {
    return dashboardId;
  }
  /**
  * Id of associated look when content_type is \&quot;look\&quot;
  * @return lookId
  **/
  @Schema(description = "Id of associated look when content_type is \"look\"")
  public Long getLookId() {
    return lookId;
  }
  /**
  * Content Type (\&quot;dashboard\&quot;, \&quot;look\&quot;, or \&quot;space\&quot;)
  * @return contentType
  **/
  @Schema(description = "Content Type (\"dashboard\", \"look\", or \"space\")")
  public String getContentType() {
    return contentType;
  }
  public ContentMeta inherits(Boolean inherits) {
    this.inherits = inherits;
    return this;
  }

  

  /**
  * Whether content inherits its access levels from parent
  * @return inherits
  **/
  @Schema(description = "Whether content inherits its access levels from parent")
  public Boolean isInherits() {
    return inherits;
  }
  public void setInherits(Boolean inherits) {
    this.inherits = inherits;
  }
  /**
  * Id of Inherited Content
  * @return inheritingId
  **/
  @Schema(description = "Id of Inherited Content")
  public Long getInheritingId() {
    return inheritingId;
  }
  /**
  * Content Slug
  * @return slug
  **/
  @Schema(description = "Content Slug")
  public String getSlug() {
    return slug;
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
    ContentMeta contentMeta = (ContentMeta) o;
    return Objects.equals(this.id, contentMeta.id) &&
        Objects.equals(this.name, contentMeta.name) &&
        Objects.equals(this.parentId, contentMeta.parentId) &&
        Objects.equals(this.spaceId, contentMeta.spaceId) &&
        Objects.equals(this.dashboardId, contentMeta.dashboardId) &&
        Objects.equals(this.lookId, contentMeta.lookId) &&
        Objects.equals(this.contentType, contentMeta.contentType) &&
        Objects.equals(this.inherits, contentMeta.inherits) &&
        Objects.equals(this.inheritingId, contentMeta.inheritingId) &&
        Objects.equals(this.slug, contentMeta.slug) &&
        Objects.equals(this.can, contentMeta.can);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, parentId, spaceId, dashboardId, lookId, contentType, inherits, inheritingId, slug, can);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentMeta {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    lookId: ").append(toIndentedString(lookId)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    inherits: ").append(toIndentedString(inherits)).append("\n");
    sb.append("    inheritingId: ").append(toIndentedString(inheritingId)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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