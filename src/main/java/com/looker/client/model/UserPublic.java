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
 * UserPublic
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-15T12:39:13.185-08:00[America/Los_Angeles]")public class UserPublic {

  @SerializedName("id")
  private Long id = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("avatar_url")
  private String avatarUrl = null;

  @SerializedName("url")
  private String url = null;

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
  * First Name
  * @return firstName
  **/
  @Schema(description = "First Name")
  public String getFirstName() {
    return firstName;
  }
  /**
  * Last Name
  * @return lastName
  **/
  @Schema(description = "Last Name")
  public String getLastName() {
    return lastName;
  }
  /**
  * Full name for display (available only if both first_name and last_name are set)
  * @return displayName
  **/
  @Schema(description = "Full name for display (available only if both first_name and last_name are set)")
  public String getDisplayName() {
    return displayName;
  }
  /**
  * URL for the avatar image (may be generic)
  * @return avatarUrl
  **/
  @Schema(description = "URL for the avatar image (may be generic)")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  /**
  * Link to get this item
  * @return url
  **/
  @Schema(description = "Link to get this item")
  public String getUrl() {
    return url;
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
    UserPublic userPublic = (UserPublic) o;
    return Objects.equals(this.id, userPublic.id) &&
        Objects.equals(this.firstName, userPublic.firstName) &&
        Objects.equals(this.lastName, userPublic.lastName) &&
        Objects.equals(this.displayName, userPublic.displayName) &&
        Objects.equals(this.avatarUrl, userPublic.avatarUrl) &&
        Objects.equals(this.url, userPublic.url) &&
        Objects.equals(this.can, userPublic.can);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, firstName, lastName, displayName, avatarUrl, url, can);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPublic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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