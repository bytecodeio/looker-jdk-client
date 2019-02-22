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
import com.looker.client.api.QueryApi;
import com.looker.client.model.CreateQueryTask;
import com.looker.client.model.Error;
import com.looker.client.model.Query;
import com.looker.client.model.QueryTask;
import com.looker.client.model.ValidationError;

import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QueryApi
 */
@Ignore
public class QueryApiTest {

    private final QueryApi api = new QueryApi();

    /**
     * Create Query
     *
     * ### Create a query.  This allows you to create a new query that you can later run. Looker queries are immutable once created and are not deleted. If you create a query that is exactly like an existing query then the existing query will be returned and no new query will be created. Whether a new query is created or not, you can use the &#x27;id&#x27; in the returned query with the &#x27;run&#x27; method.  The query parameters are passed as json in the body of the request.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createQueryTest() throws ApiException {
        Query body = null;
        String fields = null;
        Query response = api.createQuery(body, fields);

        // TODO: test validations
    }
    /**
     * Run Query Async
     *
     * ### Run a saved query asynchronously.  Runs a previously created query asynchronously. Returns a Query Task ID which can be used to fetch the results from the Query Tasks results endpoint. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createQueryTaskTest() throws ApiException {
        CreateQueryTask body = null;
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
        String fields = null;
        QueryTask response = api.createQueryTask(body, limit, applyFormatting, applyVis, cache, imageWidth, imageHeight, generateDrillLinks, forceProduction, cacheOnly, pathPrefix, rebuildPdts, serverTableCalcs, fields);

        // TODO: test validations
    }
    /**
     * Get Query
     *
     * ### Get a previously created query by id.  A Looker query object includes the various parameters that define a database query that has been run or could be run in the future. These parameters include: model, view, fields, filters, pivots, etc. Query *results* are not part of the query object.  Query objects are unique and immutable. Query objects are created automatically in Looker as users explore data. Looker does not delete them; they become part of the query history. When asked to create a query for any given set of parameters, Looker will first try to find an existing query object with matching parameters and will only create a new object when an appropriate object can not be found.  This &#x27;get&#x27; method is used to get the details about a query for a given id. See the other methods here to &#x27;create&#x27; and &#x27;run&#x27; queries.  Note that some fields like &#x27;filter_config&#x27; and &#x27;vis_config&#x27; etc are specific to how the Looker UI builds queries and visualizations and are not generally useful for API use. They are not required when creating new queries and can usually just be ignored.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryTest() throws ApiException {
        Integer queryId = null;
        String fields = null;
        Query response = api.query(queryId, fields);

        // TODO: test validations
    }
    /**
     * Get Query for Slug
     *
     * ### Get the query for a given query slug.  This returns the query for the &#x27;slug&#x27; in a query share URL.  The &#x27;slug&#x27; is a randomly chosen short string that is used as an alternative to the query&#x27;s id value for use in URLs etc. This method exists as a convenience to help you use the API to &#x27;find&#x27; queries that have been created using the Looker UI.  You can use the Looker explore page to build a query and then choose the &#x27;Share&#x27; option to show the share url for the query. Share urls generally look something like &#x27;https://looker.yourcompany/x/vwGSbfc&#x27;. The trailing &#x27;vwGSbfc&#x27; is the share slug. You can pass that string to this api method to get details about the query. Those details include the &#x27;id&#x27; that you can use to run the query. Or, you can copy the query body (perhaps with your own modification) and use that as the basis to make/run new queries.  This will also work with slugs from Looker explore urls like &#x27;https://looker.yourcompany/explore/ecommerce/orders?qid&#x3D;aogBgL6o3cKK1jN3RoZl5s&#x27;. In this case &#x27;aogBgL6o3cKK1jN3RoZl5s&#x27; is the slug. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryForSlugTest() throws ApiException {
        String slug = null;
        String fields = null;
        Query response = api.queryForSlug(slug, fields);

        // TODO: test validations
    }
    /**
     * Get Async Query Info
     *
     * Returns information about a Query Task.  Query Tasks are generated by running queries asynchronously. They are represented by a GUID returned from one of the async query endpoints. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryTaskTest() throws ApiException {
        String queryTaskId = null;
        String fields = null;
        QueryTask response = api.queryTask(queryTaskId, fields);

        // TODO: test validations
    }
    /**
     * Get Multiple Async Query Results
     *
     * Fetch the results of multiple async Query Tasks in one response.  Query Tasks that are not ready will be skipped and will not appear in the response. Query Tasks whose results have expired will have a status of &#x27;expired&#x27;. If the user making the API request does not have sufficient privileges to view a Query Task result, the result will have a status of &#x27;missing&#x27; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryTaskMultiResultsTest() throws ApiException {
        List<String> queryTaskIds = null;
        Map<String, String> response = api.queryTaskMultiResults(queryTaskIds);

        // TODO: test validations
    }
    /**
     * Get Async Query Results
     *
     * Returns the results of an async Query Task if the query has completed. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryTaskResultsTest() throws ApiException {
        String queryTaskId = null;
        Map<String, String> response = api.queryTaskResults(queryTaskId);

        // TODO: test validations
    }
    /**
     * Run Inline Query
     *
     * ### Run the query that is specified inline in the posted body.  This allows running a query as defined in json in the posted body. This combines the two actions of posting &amp; running a query into one step.  Here is an example body in json: &#x60;&#x60;&#x60; {   \&quot;model\&quot;:\&quot;thelook\&quot;,   \&quot;view\&quot;:\&quot;inventory_items\&quot;,   \&quot;fields\&quot;:[\&quot;category.name\&quot;,\&quot;inventory_items.days_in_inventory_tier\&quot;,\&quot;products.count\&quot;],   \&quot;filters\&quot;:{\&quot;category.name\&quot;:\&quot;socks\&quot;},   \&quot;sorts\&quot;:[\&quot;products.count desc 0\&quot;],   \&quot;limit\&quot;:\&quot;500\&quot;,   \&quot;query_timezone\&quot;:\&quot;America/Los_Angeles\&quot; } &#x60;&#x60;&#x60;  When using the Ruby SDK this would be passed as a Ruby hash like: &#x60;&#x60;&#x60; {  :model&#x3D;&gt;\&quot;thelook\&quot;,  :view&#x3D;&gt;\&quot;inventory_items\&quot;,  :fields&#x3D;&gt;   [\&quot;category.name\&quot;,    \&quot;inventory_items.days_in_inventory_tier\&quot;,    \&quot;products.count\&quot;],  :filters&#x3D;&gt;{:\&quot;category.name\&quot;&#x3D;&gt;\&quot;socks\&quot;},  :sorts&#x3D;&gt;[\&quot;products.count desc 0\&quot;],  :limit&#x3D;&gt;\&quot;500\&quot;,  :query_timezone&#x3D;&gt;\&quot;America/Los_Angeles\&quot;, } &#x60;&#x60;&#x60;  This will return the result of running the query in the format specified by the &#x27;result_format&#x27; parameter.  Supported formats:  | result_format | Description | :-----------: | :--- | | json | Plain json | json_detail | Row data plus metadata describing the fields, pivots, table calcs, and other aspects of the query | csv | Comma separated values with a header | txt | Tab separated values with a header | html | Simple html | md | Simple markdown | xlsx | MS Excel spreadsheet | sql | Returns the generated SQL rather than running the query | png | A PNG image of the visualization of the query | jpg | A JPG image of the visualization of the query   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void runInlineQueryTest() throws ApiException {
        Query body = null;
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
        String response = api.runInlineQuery(body, resultFormat, limit, applyFormatting, applyVis, cache, imageWidth, imageHeight, generateDrillLinks, forceProduction, cacheOnly, pathPrefix, rebuildPdts, serverTableCalcs);

        // TODO: test validations
    }
    /**
     * Run Query
     *
     * ### Run a saved query.  This runs a previously saved query. You can use this on a query that was generated in the Looker UI or one that you have explicitly created using the API. You can also use a query &#x27;id&#x27; from a saved &#x27;Look&#x27;.  The &#x27;result_format&#x27; parameter specifies the desired structure and format of the response.  Supported formats:  | result_format | Description | :-----------: | :--- | | json | Plain json | json_detail | Row data plus metadata describing the fields, pivots, table calcs, and other aspects of the query | csv | Comma separated values with a header | txt | Tab separated values with a header | html | Simple html | md | Simple markdown | xlsx | MS Excel spreadsheet | sql | Returns the generated SQL rather than running the query | png | A PNG image of the visualization of the query | jpg | A JPG image of the visualization of the query   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void runQueryTest() throws ApiException {
        Integer queryId = null;
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
        String response = api.runQuery(queryId, resultFormat, limit, applyFormatting, applyVis, cache, imageWidth, imageHeight, generateDrillLinks, forceProduction, cacheOnly, pathPrefix, rebuildPdts, serverTableCalcs);

        // TODO: test validations
    }
    /**
     * Run Url Encoded Query
     *
     * ### Run an URL encoded query.  This requires the caller to encode the specifiers for the query into the URL query part using Looker-specific syntax as explained below.  Generally, you would want to use one of the methods that takes the parameters as json in the POST body for creating and/or running queries. This method exists for cases where one really needs to encode the parameters into the URL of a single &#x27;GET&#x27; request. This matches the way that the Looker UI formats &#x27;explore&#x27; URLs etc.  The parameters here are very similar to the json body formatting except that the filter syntax is tricky. Unfortunately, this format makes this method not currently callible via the &#x27;Try it out!&#x27; button in this documentation page. But, this is callable  when creating URLs manually or when using the Looker SDK.  Here is an example inline query URL:  &#x60;&#x60;&#x60; https://looker.mycompany.com:19999/api/3.0/queries/models/thelook/views/inventory_items/run/json?fields&#x3D;category.name,inventory_items.days_in_inventory_tier,products.count&amp;f[category.name]&#x3D;socks&amp;sorts&#x3D;products.count+desc+0&amp;limit&#x3D;500&amp;query_timezone&#x3D;America/Los_Angeles &#x60;&#x60;&#x60;  When invoking this endpoint with the Ruby SDK, pass the query parameter parts as a hash. The hash to match the above would look like:  &#x60;&#x60;&#x60;ruby query_params &#x3D; {   :fields &#x3D;&gt; \&quot;category.name,inventory_items.days_in_inventory_tier,products.count\&quot;,   :\&quot;f[category.name]\&quot; &#x3D;&gt; \&quot;socks\&quot;,   :sorts &#x3D;&gt; \&quot;products.count desc 0\&quot;,   :limit &#x3D;&gt; \&quot;500\&quot;,   :query_timezone &#x3D;&gt; \&quot;America/Los_Angeles\&quot; } response &#x3D; ruby_sdk.run_url_encoded_query(&#x27;thelook&#x27;,&#x27;inventory_items&#x27;,&#x27;json&#x27;, query_params)  &#x60;&#x60;&#x60;  Again, it is generally easier to use the variant of this method that passes the full query in the POST body. This method is available for cases where other alternatives won&#x27;t fit the need.  Supported formats:  | result_format | Description | :-----------: | :--- | | json | Plain json | json_detail | Row data plus metadata describing the fields, pivots, table calcs, and other aspects of the query | csv | Comma separated values with a header | txt | Tab separated values with a header | html | Simple html | md | Simple markdown | xlsx | MS Excel spreadsheet | sql | Returns the generated SQL rather than running the query | png | A PNG image of the visualization of the query | jpg | A JPG image of the visualization of the query   
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void runUrlEncodedQueryTest() throws ApiException {
        String modelName = null;
        String viewName = null;
        String resultFormat = null;
        String response = api.runUrlEncodedQuery(modelName, viewName, resultFormat);

        // TODO: test validations
    }
}
