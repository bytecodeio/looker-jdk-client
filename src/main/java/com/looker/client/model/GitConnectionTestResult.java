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
 * GitConnectionTestResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-15T12:39:13.185-08:00[America/Los_Angeles]")public class GitConnectionTestResult {

  @SerializedName("id")
  private String id = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("can")
  private Map<String, Boolean> can = null;
  /**
  * A short string, uniquely naming this test
  * @return id
  **/
  @Schema(description = "A short string, uniquely naming this test")
  public String getId() {
    return id;
  }
  /**
  * Either \&quot;pass\&quot; or \&quot;fail\&quot;
  * @return status
  **/
  @Schema(description = "Either \"pass\" or \"fail\"")
  public String getStatus() {
    return status;
  }
  /**
  * Additional data from the test
  * @return message
  **/
  @Schema(description = "Additional data from the test")
  public String getMessage() {
    return message;
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
    GitConnectionTestResult gitConnectionTestResult = (GitConnectionTestResult) o;
    return Objects.equals(this.id, gitConnectionTestResult.id) &&
        Objects.equals(this.status, gitConnectionTestResult.status) &&
        Objects.equals(this.message, gitConnectionTestResult.message) &&
        Objects.equals(this.can, gitConnectionTestResult.can);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, status, message, can);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitConnectionTestResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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