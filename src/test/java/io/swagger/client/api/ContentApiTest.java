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
import com.looker.client.api.ContentApi;
import com.looker.client.model.ContentFavorite;
import com.looker.client.model.ContentMeta;
import com.looker.client.model.ContentMetaGroupUser;
import com.looker.client.model.ContentView;
import com.looker.client.model.Error;
import com.looker.client.model.ValidationError;

import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContentApi
 */
@Ignore
public class ContentApiTest {

    private final ContentApi api = new ContentApi();

    /**
     * Get All Content Metadata Accesss
     *
     * ### All content metadata access records for a content metadata item. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allContentMetadataAccesssTest() throws ApiException {
        Integer contentMetadataId = null;
        String fields = null;
        List<ContentMetaGroupUser> response = api.allContentMetadataAccesss(contentMetadataId, fields);

        // TODO: test validations
    }
    /**
     * Get All Content Metadatas
     *
     * ### Get information about all content metadata in a space. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allContentMetadatasTest() throws ApiException {
        Integer parentId = null;
        String fields = null;
        List<ContentMeta> response = api.allContentMetadatas(parentId, fields);

        // TODO: test validations
    }
    /**
     * Get Favorite Content
     *
     * ### Get favorite content by its id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentFavoriteTest() throws ApiException {
        Integer contentFavoriteId = null;
        String fields = null;
        ContentFavorite response = api.contentFavorite(contentFavoriteId, fields);

        // TODO: test validations
    }
    /**
     * Get Content Metadata
     *
     * ### Get information about an individual content metadata record. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contentMetadataTest() throws ApiException {
        Integer contentMetadataId = null;
        String fields = null;
        ContentMeta response = api.contentMetadata(contentMetadataId, fields);

        // TODO: test validations
    }
    /**
     * Create Favorite Content
     *
     * ### Create favorite content
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createContentFavoriteTest() throws ApiException {
        ContentFavorite body = null;
        ContentFavorite response = api.createContentFavorite(body);

        // TODO: test validations
    }
    /**
     * Create Content Metadata Access
     *
     * ### Create content metadata access. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createContentMetadataAccessTest() throws ApiException {
        ContentMetaGroupUser body = null;
        ContentMetaGroupUser response = api.createContentMetadataAccess(body);

        // TODO: test validations
    }
    /**
     * Delete Favorite Content
     *
     * ### Delete favorite content
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteContentFavoriteTest() throws ApiException {
        Integer contentFavoriteId = null;
        String response = api.deleteContentFavorite(contentFavoriteId);

        // TODO: test validations
    }
    /**
     * Delete Content Metadata Access
     *
     * ### Remove content metadata access. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteContentMetadataAccessTest() throws ApiException {
        Integer contentMetadataAccessId = null;
        String response = api.deleteContentMetadataAccess(contentMetadataAccessId);

        // TODO: test validations
    }
    /**
     * Search Favorite Contents
     *
     * ### Search Favorite Content 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchContentFavoritesTest() throws ApiException {
        Integer userId = null;
        Integer limit = null;
        Integer offset = null;
        String sorts = null;
        String fields = null;
        List<ContentFavorite> response = api.searchContentFavorites(userId, limit, offset, sorts, fields);

        // TODO: test validations
    }
    /**
     * Search Content Views
     *
     * ### Search Content View 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchContentViewsTest() throws ApiException {
        Integer viewCount = null;
        Integer groupId = null;
        String lookId = null;
        String dashboardId = null;
        Integer contentMetadataId = null;
        String startOfWeekDate = null;
        Boolean allTime = null;
        Integer userId = null;
        Integer limit = null;
        Integer offset = null;
        String sorts = null;
        String fields = null;
        List<ContentView> response = api.searchContentViews(viewCount, groupId, lookId, dashboardId, contentMetadataId, startOfWeekDate, allTime, userId, limit, offset, sorts, fields);

        // TODO: test validations
    }
    /**
     * Update Content Metadata
     *
     * ### Move a piece of content. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateContentMetadataTest() throws ApiException {
        ContentMeta body = null;
        Integer contentMetadataId = null;
        ContentMeta response = api.updateContentMetadata(body, contentMetadataId);

        // TODO: test validations
    }
    /**
     * Update Content Metadata Access
     *
     * ### Update type of access for content metadata. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateContentMetadataAccessTest() throws ApiException {
        ContentMetaGroupUser body = null;
        Integer contentMetadataAccessId = null;
        ContentMetaGroupUser response = api.updateContentMetadataAccess(body, contentMetadataAccessId);

        // TODO: test validations
    }
}
