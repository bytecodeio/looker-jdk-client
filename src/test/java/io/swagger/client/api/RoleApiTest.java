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
import com.looker.client.api.RoleApi;
import com.looker.client.model.Error;
import com.looker.client.model.Group;
import com.looker.client.model.ModelSet;
import com.looker.client.model.Permission;
import com.looker.client.model.PermissionSet;
import com.looker.client.model.Role;
import com.looker.client.model.User;
import com.looker.client.model.ValidationError;

import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoleApi
 */
@Ignore
public class RoleApiTest {

    private final RoleApi api = new RoleApi();

    /**
     * Get All Model Sets
     *
     * ### Get information about all model sets. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allModelSetsTest() throws ApiException {
        String fields = null;
        List<ModelSet> response = api.allModelSets(fields);

        // TODO: test validations
    }
    /**
     * Get All Permission Sets
     *
     * ### Get information about all permission sets. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allPermissionSetsTest() throws ApiException {
        String fields = null;
        List<PermissionSet> response = api.allPermissionSets(fields);

        // TODO: test validations
    }
    /**
     * Get All Permissions
     *
     * ### Get all supported permissions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allPermissionsTest() throws ApiException {
        List<Permission> response = api.allPermissions();

        // TODO: test validations
    }
    /**
     * Get All Roles
     *
     * ### Get information about all roles. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allRolesTest() throws ApiException {
        String fields = null;
        List<Long> ids = null;
        List<Role> response = api.allRoles(fields, ids);

        // TODO: test validations
    }
    /**
     * Create Model Set
     *
     * ### Create a model set with the specified information. Model sets are used by Roles. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createModelSetTest() throws ApiException {
        ModelSet body = null;
        ModelSet response = api.createModelSet(body);

        // TODO: test validations
    }
    /**
     * Create Permission Set
     *
     * ### Create a permission set with the specified information. Permission sets are used by Roles. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPermissionSetTest() throws ApiException {
        PermissionSet body = null;
        PermissionSet response = api.createPermissionSet(body);

        // TODO: test validations
    }
    /**
     * Create Role
     *
     * ### Create a role with the specified information. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRoleTest() throws ApiException {
        Role body = null;
        Role response = api.createRole(body);

        // TODO: test validations
    }
    /**
     * Delete Model Set
     *
     * ### Delete the model set with a specific id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteModelSetTest() throws ApiException {
        Integer modelSetId = null;
        String response = api.deleteModelSet(modelSetId);

        // TODO: test validations
    }
    /**
     * Delete Permission Set
     *
     * ### Delete the permission set with a specific id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePermissionSetTest() throws ApiException {
        Integer permissionSetId = null;
        String response = api.deletePermissionSet(permissionSetId);

        // TODO: test validations
    }
    /**
     * Delete Role
     *
     * ### Delete the role with a specific id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRoleTest() throws ApiException {
        Integer roleId = null;
        String response = api.deleteRole(roleId);

        // TODO: test validations
    }
    /**
     * Get Model Set
     *
     * ### Get information about the model set with a specific id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelSetTest() throws ApiException {
        Integer modelSetId = null;
        String fields = null;
        ModelSet response = api.modelSet(modelSetId, fields);

        // TODO: test validations
    }
    /**
     * Get Permission Set
     *
     * ### Get information about the permission set with a specific id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void permissionSetTest() throws ApiException {
        Integer permissionSetId = null;
        String fields = null;
        PermissionSet response = api.permissionSet(permissionSetId, fields);

        // TODO: test validations
    }
    /**
     * Get Role
     *
     * ### Get information about the role with a specific id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void roleTest() throws ApiException {
        Integer roleId = null;
        Role response = api.role(roleId);

        // TODO: test validations
    }
    /**
     * Get Role Groups
     *
     * ### Get information about all the groups with the role that has a specific id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void roleGroupsTest() throws ApiException {
        Integer roleId = null;
        String fields = null;
        List<Group> response = api.roleGroups(roleId, fields);

        // TODO: test validations
    }
    /**
     * Get Role Users
     *
     * ### Get information about all the users with the role that has a specific id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void roleUsersTest() throws ApiException {
        Integer roleId = null;
        String fields = null;
        Boolean directAssociationOnly = null;
        List<User> response = api.roleUsers(roleId, fields, directAssociationOnly);

        // TODO: test validations
    }
    /**
     * Update Role Groups
     *
     * ### Set all groups for a role, removing all existing group associations from that role. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setRoleGroupsTest() throws ApiException {
        List<Long> body = null;
        Integer roleId = null;
        List<Group> response = api.setRoleGroups(body, roleId);

        // TODO: test validations
    }
    /**
     * Update Role Users
     *
     * ### Set all the users of the role with a specific id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setRoleUsersTest() throws ApiException {
        List<Long> body = null;
        Integer roleId = null;
        List<User> response = api.setRoleUsers(body, roleId);

        // TODO: test validations
    }
    /**
     * Update Model Set
     *
     * ### Update information about the model set with a specific id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateModelSetTest() throws ApiException {
        ModelSet body = null;
        Integer modelSetId = null;
        ModelSet response = api.updateModelSet(body, modelSetId);

        // TODO: test validations
    }
    /**
     * Update Permission Set
     *
     * ### Update information about the permission set with a specific id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePermissionSetTest() throws ApiException {
        PermissionSet body = null;
        Integer permissionSetId = null;
        PermissionSet response = api.updatePermissionSet(body, permissionSetId);

        // TODO: test validations
    }
    /**
     * Update Role
     *
     * ### Update information about the role with a specific id. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRoleTest() throws ApiException {
        Role body = null;
        Integer roleId = null;
        Role response = api.updateRole(body, roleId);

        // TODO: test validations
    }
}
