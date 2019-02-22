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
import com.looker.client.api.LookApi;
import com.looker.client.model.Error;
import com.looker.client.model.Look;
import com.looker.client.model.LookWithQuery;
import com.looker.client.model.ValidationError;

import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LookApi
 */
@Ignore
public class LookApiTest {

    private final LookApi api = new LookApi();

    /**
     * Get All Looks
     *
     * ### Get all the looks.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allLooksTest() throws ApiException {
        String fields = null;
        List<Look> response = api.allLooks(fields);

        // TODO: test validations
    }
    /**
     * Create Look
     *
     * ### Create a Look with specified information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLookTest() throws ApiException {
        LookWithQuery body = null;
        String fields = null;
        LookWithQuery response = api.createLook(body, fields);

        // TODO: test validations
    }
    /**
     * Delete Look
     *
     * ### Delete the look with a specific id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLookTest() throws ApiException {
        Integer lookId = null;
        String response = api.deleteLook(lookId);

        // TODO: test validations
    }
    /**
     * Get Look
     *
     * ### Get a Look.  Return detailed information about the Look and its associated Query.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lookTest() throws ApiException {
        Integer lookId = null;
        String fields = null;
        LookWithQuery response = api.look(lookId, fields);

        // TODO: test validations
    }
    /**
     * Run Look
     *
     * ### Run a Look.  Runs a given look&#x27;s query and returns the results in the requested format.  Supported formats:  | result_format | Description | :-----------: | :--- | | json | Plain json | json_detail | Row data plus metadata describing the fields, pivots, table calcs, and other aspects of the query | csv | Comma separated values with a header | txt | Tab separated values with a header | html | Simple html | md | Simple markdown | xlsx | MS Excel spreadsheet | sql | Returns the generated SQL rather than running the query | png | A PNG image of the visualization of the query | jpg | A JPG image of the visualization of the query   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void runLookTest() throws ApiException {
        Integer lookId = null;
        String resultFormat = null;
        Integer limit = null;
        Boolean applyFormatting = null;
        Boolean applyVis = null;
        Boolean cache = null;
        Integer imageWidth = null;
        Integer imageHeight = null;
        Boolean generateDrillLinks = null;
        Boolean forceProduction = null;
        Boolean cacheOnly = null;
        String pathPrefix = null;
        Boolean rebuildPdts = null;
        Boolean serverTableCalcs = null;
        String response = api.runLook(lookId, resultFormat, limit, applyFormatting, applyVis, cache, imageWidth, imageHeight, generateDrillLinks, forceProduction, cacheOnly, pathPrefix, rebuildPdts, serverTableCalcs);

        // TODO: test validations
    }
    /**
     * Search Looks
     *
     * Search looks.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchLooksTest() throws ApiException {
        String fields = null;
        Integer page = null;
        Integer perPage = null;
        Integer limit = null;
        Integer offset = null;
        String sorts = null;
        String title = null;
        String description = null;
        Integer contentFavoriteId = null;
        String spaceId = null;
        String userId = null;
        String viewCount = null;
        List<Look> response = api.searchLooks(fields, page, perPage, limit, offset, sorts, title, description, contentFavoriteId, spaceId, userId, viewCount);

        // TODO: test validations
    }
    /**
     * Update Look
     *
     * ### Update the Look with a specific id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLookTest() throws ApiException {
        LookWithQuery body = null;
        Integer lookId = null;
        String fields = null;
        LookWithQuery response = api.updateLook(body, lookId, fields);

        // TODO: test validations
    }
}
