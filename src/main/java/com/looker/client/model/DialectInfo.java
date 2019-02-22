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
import com.looker.client.model.DialectInfoOptions;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DialectInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-15T12:39:13.185-08:00[America/Los_Angeles]")public class DialectInfo {

  @SerializedName("name")
  private String name = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("label_for_database_equivalent")
  private String labelForDatabaseEquivalent = null;

  @SerializedName("default_port")
  private String defaultPort = null;

  @SerializedName("default_max_connections")
  private String defaultMaxConnections = null;

  @SerializedName("supported_options")
  private DialectInfoOptions supportedOptions = null;

  @SerializedName("installed")
  private Boolean installed = null;

  @SerializedName("can")
  private Map<String, Boolean> can = null;
  /**
  * The name of the dialect
  * @return name
  **/
  @Schema(description = "The name of the dialect")
  public String getName() {
    return name;
  }
  /**
  * The human-readable label of the connection
  * @return label
  **/
  @Schema(description = "The human-readable label of the connection")
  public String getLabel() {
    return label;
  }
  /**
  * What the dialect calls the equivalent of a normal SQL table
  * @return labelForDatabaseEquivalent
  **/
  @Schema(description = "What the dialect calls the equivalent of a normal SQL table")
  public String getLabelForDatabaseEquivalent() {
    return labelForDatabaseEquivalent;
  }
  /**
  * Default port number
  * @return defaultPort
  **/
  @Schema(description = "Default port number")
  public String getDefaultPort() {
    return defaultPort;
  }
  /**
  * Default number max connections
  * @return defaultMaxConnections
  **/
  @Schema(description = "Default number max connections")
  public String getDefaultMaxConnections() {
    return defaultMaxConnections;
  }
  public DialectInfo supportedOptions(DialectInfoOptions supportedOptions) {
    this.supportedOptions = supportedOptions;
    return this;
  }

  

  /**
  * Get supportedOptions
  * @return supportedOptions
  **/
  @Schema(description = "")
  public DialectInfoOptions getSupportedOptions() {
    return supportedOptions;
  }
  public void setSupportedOptions(DialectInfoOptions supportedOptions) {
    this.supportedOptions = supportedOptions;
  }
  /**
  * Is the supporting driver installed
  * @return installed
  **/
  @Schema(description = "Is the supporting driver installed")
  public Boolean isInstalled() {
    return installed;
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
    DialectInfo dialectInfo = (DialectInfo) o;
    return Objects.equals(this.name, dialectInfo.name) &&
        Objects.equals(this.label, dialectInfo.label) &&
        Objects.equals(this.labelForDatabaseEquivalent, dialectInfo.labelForDatabaseEquivalent) &&
        Objects.equals(this.defaultPort, dialectInfo.defaultPort) &&
        Objects.equals(this.defaultMaxConnections, dialectInfo.defaultMaxConnections) &&
        Objects.equals(this.supportedOptions, dialectInfo.supportedOptions) &&
        Objects.equals(this.installed, dialectInfo.installed) &&
        Objects.equals(this.can, dialectInfo.can);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, label, labelForDatabaseEquivalent, defaultPort, defaultMaxConnections, supportedOptions, installed, can);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialectInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    labelForDatabaseEquivalent: ").append(toIndentedString(labelForDatabaseEquivalent)).append("\n");
    sb.append("    defaultPort: ").append(toIndentedString(defaultPort)).append("\n");
    sb.append("    defaultMaxConnections: ").append(toIndentedString(defaultMaxConnections)).append("\n");
    sb.append("    supportedOptions: ").append(toIndentedString(supportedOptions)).append("\n");
    sb.append("    installed: ").append(toIndentedString(installed)).append("\n");
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
