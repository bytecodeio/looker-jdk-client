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
 * UserAttributeWithValue
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-15T12:39:13.185-08:00[America/Los_Angeles]")public class UserAttributeWithValue {

  @SerializedName("name")
  private String name = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("rank")
  private Long rank = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("user_id")
  private Long userId = null;

  @SerializedName("user_can_edit")
  private Boolean userCanEdit = null;

  @SerializedName("value_is_hidden")
  private Boolean valueIsHidden = null;

  @SerializedName("user_attribute_id")
  private Long userAttributeId = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("hidden_value_domain_whitelist")
  private String hiddenValueDomainWhitelist = null;

  @SerializedName("can")
  private Map<String, Boolean> can = null;
  /**
  * Name of user attribute
  * @return name
  **/
  @Schema(description = "Name of user attribute")
  public String getName() {
    return name;
  }
  /**
  * Human-friendly label for user attribute
  * @return label
  **/
  @Schema(description = "Human-friendly label for user attribute")
  public String getLabel() {
    return label;
  }
  /**
  * Precedence for setting value on user (lowest wins)
  * @return rank
  **/
  @Schema(description = "Precedence for setting value on user (lowest wins)")
  public Long getRank() {
    return rank;
  }
  public UserAttributeWithValue value(String value) {
    this.value = value;
    return this;
  }

  

  /**
  * Value of attribute for user
  * @return value
  **/
  @Schema(description = "Value of attribute for user")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
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
  * Can the user set this value
  * @return userCanEdit
  **/
  @Schema(description = "Can the user set this value")
  public Boolean isUserCanEdit() {
    return userCanEdit;
  }
  /**
  * If true, the \&quot;value\&quot; field will be null, because the attribute settings block access to this value
  * @return valueIsHidden
  **/
  @Schema(description = "If true, the \"value\" field will be null, because the attribute settings block access to this value")
  public Boolean isValueIsHidden() {
    return valueIsHidden;
  }
  /**
  * Id of User Attribute
  * @return userAttributeId
  **/
  @Schema(description = "Id of User Attribute")
  public Long getUserAttributeId() {
    return userAttributeId;
  }
  /**
  * How user got this value for this attribute
  * @return source
  **/
  @Schema(description = "How user got this value for this attribute")
  public String getSource() {
    return source;
  }
  /**
  * If this user attribute is hidden, whitelist of destinations to which it may be sent.
  * @return hiddenValueDomainWhitelist
  **/
  @Schema(description = "If this user attribute is hidden, whitelist of destinations to which it may be sent.")
  public String getHiddenValueDomainWhitelist() {
    return hiddenValueDomainWhitelist;
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
    UserAttributeWithValue userAttributeWithValue = (UserAttributeWithValue) o;
    return Objects.equals(this.name, userAttributeWithValue.name) &&
        Objects.equals(this.label, userAttributeWithValue.label) &&
        Objects.equals(this.rank, userAttributeWithValue.rank) &&
        Objects.equals(this.value, userAttributeWithValue.value) &&
        Objects.equals(this.userId, userAttributeWithValue.userId) &&
        Objects.equals(this.userCanEdit, userAttributeWithValue.userCanEdit) &&
        Objects.equals(this.valueIsHidden, userAttributeWithValue.valueIsHidden) &&
        Objects.equals(this.userAttributeId, userAttributeWithValue.userAttributeId) &&
        Objects.equals(this.source, userAttributeWithValue.source) &&
        Objects.equals(this.hiddenValueDomainWhitelist, userAttributeWithValue.hiddenValueDomainWhitelist) &&
        Objects.equals(this.can, userAttributeWithValue.can);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, label, rank, value, userId, userCanEdit, valueIsHidden, userAttributeId, source, hiddenValueDomainWhitelist, can);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAttributeWithValue {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userCanEdit: ").append(toIndentedString(userCanEdit)).append("\n");
    sb.append("    valueIsHidden: ").append(toIndentedString(valueIsHidden)).append("\n");
    sb.append("    userAttributeId: ").append(toIndentedString(userAttributeId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    hiddenValueDomainWhitelist: ").append(toIndentedString(hiddenValueDomainWhitelist)).append("\n");
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
