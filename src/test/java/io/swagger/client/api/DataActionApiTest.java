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

package io.swagger.client.api;

import org.junit.Test;

import com.looker.client.ApiException;
import com.looker.client.api.DataActionApi;
import com.looker.client.model.DataActionForm;
import com.looker.client.model.DataActionRequest;
import com.looker.client.model.DataActionResponse;
import com.looker.client.model.Error;
import com.looker.client.model.ValidationError;

import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataActionApi
 */
@Ignore
public class DataActionApiTest {

    private final DataActionApi api = new DataActionApi();

    /**
     * Fetch Remote Data Action Form
     *
     * For some data actions, the remote server may supply a form requesting further user input. This endpoint takes a data action, asks the remote server to generate a form for it, and returns that form to you for presentation to the user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchRemoteDataActionFormTest() throws ApiException {
        Map<String, String> body = null;
        DataActionForm response = api.fetchRemoteDataActionForm(body);

        // TODO: test validations
    }
    /**
     * Send a Data Action
     *
     * Perform a data action. The data action object can be obtained from query results, and used to perform an arbitrary action.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void performDataActionTest() throws ApiException {
        DataActionRequest body = null;
        DataActionResponse response = api.performDataAction(body);

        // TODO: test validations
    }
}
