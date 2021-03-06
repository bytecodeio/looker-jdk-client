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

/**
 * ApiVersionElement
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-15T12:39:13.185-08:00[America/Los_Angeles]")public class ApiVersionElement {

  @SerializedName("version")
  private String version = null;

  @SerializedName("full_version")
  private String fullVersion = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("swagger_url")
  private String swaggerUrl = null;
  /**
  * Version number as it appears in &#x27;/api/xxx/&#x27; urls
  * @return version
  **/
  @Schema(description = "Version number as it appears in '/api/xxx/' urls")
  public String getVersion() {
    return version;
  }
  /**
  * Full version number including minor version
  * @return fullVersion
  **/
  @Schema(description = "Full version number including minor version")
  public String getFullVersion() {
    return fullVersion;
  }
  /**
  * Status of this version
  * @return status
  **/
  @Schema(description = "Status of this version")
  public String getStatus() {
    return status;
  }
  /**
  * Url for swagger.json for this version
  * @return swaggerUrl
  **/
  @Schema(description = "Url for swagger.json for this version")
  public String getSwaggerUrl() {
    return swaggerUrl;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiVersionElement apiVersionElement = (ApiVersionElement) o;
    return Objects.equals(this.version, apiVersionElement.version) &&
        Objects.equals(this.fullVersion, apiVersionElement.fullVersion) &&
        Objects.equals(this.status, apiVersionElement.status) &&
        Objects.equals(this.swaggerUrl, apiVersionElement.swaggerUrl);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(version, fullVersion, status, swaggerUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiVersionElement {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    fullVersion: ").append(toIndentedString(fullVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    swaggerUrl: ").append(toIndentedString(swaggerUrl)).append("\n");
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
