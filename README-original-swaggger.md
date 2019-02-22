# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ApiAuthApi;

import java.io.File;
import java.util.*;

public class ApiAuthApiExample {

    public static void main(String[] args) {
        
        ApiAuthApi apiInstance = new ApiAuthApi();
        String clientId = "clientId_example"; // String | client_id part of API3 Key.
        String clientSecret = "clientSecret_example"; // String | client_secret part of API3 Key.
        try {
            AccessToken result = apiInstance.login(clientId, clientSecret);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiAuthApi#login");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://bytecode.looker.com:19999/api/3.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiAuthApi* | [**login**](docs/ApiAuthApi.md#login) | **POST** /login | Login
*ApiAuthApi* | [**loginUser**](docs/ApiAuthApi.md#loginUser) | **POST** /login/{user_id} | Login user
*ApiAuthApi* | [**logout**](docs/ApiAuthApi.md#logout) | **DELETE** /logout | Logout
*AuthApi* | [**createOidcTestConfig**](docs/AuthApi.md#createOidcTestConfig) | **POST** /oidc_test_configs | Create OIDC Test Configuration
*AuthApi* | [**createSamlTestConfig**](docs/AuthApi.md#createSamlTestConfig) | **POST** /saml_test_configs | Create SAML Test Configuration
*AuthApi* | [**deleteOidcTestConfig**](docs/AuthApi.md#deleteOidcTestConfig) | **DELETE** /oidc_test_configs/{test_slug} | Delete OIDC Test Configuration
*AuthApi* | [**deleteSamlTestConfig**](docs/AuthApi.md#deleteSamlTestConfig) | **DELETE** /saml_test_configs/{test_slug} | Delete SAML Test Configuration
*AuthApi* | [**fetchAndParseSamlIdpMetadata**](docs/AuthApi.md#fetchAndParseSamlIdpMetadata) | **POST** /fetch_and_parse_saml_idp_metadata | Parse SAML IdP Url
*AuthApi* | [**ldapConfig**](docs/AuthApi.md#ldapConfig) | **GET** /ldap_config | Get LDAP Configuration
*AuthApi* | [**oidcConfig**](docs/AuthApi.md#oidcConfig) | **GET** /oidc_config | Get OIDC Configuration
*AuthApi* | [**oidcTestConfig**](docs/AuthApi.md#oidcTestConfig) | **GET** /oidc_test_configs/{test_slug} | Get OIDC Test Configuration
*AuthApi* | [**parseSamlIdpMetadata**](docs/AuthApi.md#parseSamlIdpMetadata) | **POST** /parse_saml_idp_metadata | Parse SAML IdP XML
*AuthApi* | [**samlConfig**](docs/AuthApi.md#samlConfig) | **GET** /saml_config | Get SAML Configuration
*AuthApi* | [**samlTestConfig**](docs/AuthApi.md#samlTestConfig) | **GET** /saml_test_configs/{test_slug} | Get SAML Test Configuration
*AuthApi* | [**testLdapConfigAuth**](docs/AuthApi.md#testLdapConfigAuth) | **PUT** /ldap_config/test_auth | Test LDAP Auth
*AuthApi* | [**testLdapConfigConnection**](docs/AuthApi.md#testLdapConfigConnection) | **PUT** /ldap_config/test_connection | Test LDAP Connection
*AuthApi* | [**testLdapConfigUserAuth**](docs/AuthApi.md#testLdapConfigUserAuth) | **PUT** /ldap_config/test_user_auth | Test LDAP User Auth
*AuthApi* | [**testLdapConfigUserInfo**](docs/AuthApi.md#testLdapConfigUserInfo) | **PUT** /ldap_config/test_user_info | Test LDAP User Info
*AuthApi* | [**updateLdapConfig**](docs/AuthApi.md#updateLdapConfig) | **PATCH** /ldap_config | Update LDAP Configuration
*AuthApi* | [**updateOidcConfig**](docs/AuthApi.md#updateOidcConfig) | **PATCH** /oidc_config | Update OIDC Configuration
*AuthApi* | [**updateSamlConfig**](docs/AuthApi.md#updateSamlConfig) | **PATCH** /saml_config | Update SAML Configuration
*ConfigApi* | [**allLegacyFeatures**](docs/ConfigApi.md#allLegacyFeatures) | **GET** /legacy_features | Get All Legacy Features
*ConfigApi* | [**allTimezones**](docs/ConfigApi.md#allTimezones) | **GET** /timezones | Get All Timezones
*ConfigApi* | [**backupConfiguration**](docs/ConfigApi.md#backupConfiguration) | **GET** /backup_configuration | Get Backup Configuration
*ConfigApi* | [**legacyFeature**](docs/ConfigApi.md#legacyFeature) | **GET** /legacy_features/{legacy_feature_id} | Get Legacy Feature
*ConfigApi* | [**updateBackupConfiguration**](docs/ConfigApi.md#updateBackupConfiguration) | **PATCH** /backup_configuration | Update Backup Configuration
*ConfigApi* | [**updateLegacyFeature**](docs/ConfigApi.md#updateLegacyFeature) | **PATCH** /legacy_features/{legacy_feature_id} | Update Legacy Feature
*ConfigApi* | [**updateWhitelabelConfiguration**](docs/ConfigApi.md#updateWhitelabelConfiguration) | **PUT** /whitelabel_configuration | Update Whitelabel configuration
*ConfigApi* | [**versions**](docs/ConfigApi.md#versions) | **GET** /versions | Get ApiVersion
*ConfigApi* | [**whitelabelConfiguration**](docs/ConfigApi.md#whitelabelConfiguration) | **GET** /whitelabel_configuration | Get Whitelabel configuration
*ConnectionApi* | [**allConnections**](docs/ConnectionApi.md#allConnections) | **GET** /connections | Get All Connections
*ConnectionApi* | [**allDialectInfos**](docs/ConnectionApi.md#allDialectInfos) | **GET** /dialect_info | Get All Dialect Infos
*ConnectionApi* | [**connection**](docs/ConnectionApi.md#connection) | **GET** /connections/{connection_name} | Get Connection
*ConnectionApi* | [**createConnection**](docs/ConnectionApi.md#createConnection) | **POST** /connections | Create Connection
*ConnectionApi* | [**deleteConnection**](docs/ConnectionApi.md#deleteConnection) | **DELETE** /connections/{connection_name} | Delete Connection
*ConnectionApi* | [**deleteConnectionOverride**](docs/ConnectionApi.md#deleteConnectionOverride) | **DELETE** /connections/{connection_name}/connection_override/{override_context} | Delete Connection
*ConnectionApi* | [**testConnection**](docs/ConnectionApi.md#testConnection) | **PUT** /connections/{connection_name}/test | Test Connection
*ConnectionApi* | [**testConnectionConfig**](docs/ConnectionApi.md#testConnectionConfig) | **PUT** /connections/test | Test Connection Configuration
*ConnectionApi* | [**updateConnection**](docs/ConnectionApi.md#updateConnection) | **PATCH** /connections/{connection_name} | Update Connection
*ContentApi* | [**allContentMetadataAccesss**](docs/ContentApi.md#allContentMetadataAccesss) | **GET** /content_metadata_access | Get All Content Metadata Accesss
*ContentApi* | [**allContentMetadatas**](docs/ContentApi.md#allContentMetadatas) | **GET** /content_metadata | Get All Content Metadatas
*ContentApi* | [**contentFavorite**](docs/ContentApi.md#contentFavorite) | **GET** /content_favorite/{content_favorite_id} | Get Favorite Content
*ContentApi* | [**contentMetadata**](docs/ContentApi.md#contentMetadata) | **GET** /content_metadata/{content_metadata_id} | Get Content Metadata
*ContentApi* | [**createContentFavorite**](docs/ContentApi.md#createContentFavorite) | **POST** /content_favorite | Create Favorite Content
*ContentApi* | [**createContentMetadataAccess**](docs/ContentApi.md#createContentMetadataAccess) | **POST** /content_metadata_access | Create Content Metadata Access
*ContentApi* | [**deleteContentFavorite**](docs/ContentApi.md#deleteContentFavorite) | **DELETE** /content_favorite/{content_favorite_id} | Delete Favorite Content
*ContentApi* | [**deleteContentMetadataAccess**](docs/ContentApi.md#deleteContentMetadataAccess) | **DELETE** /content_metadata_access/{content_metadata_access_id} | Delete Content Metadata Access
*ContentApi* | [**searchContentFavorites**](docs/ContentApi.md#searchContentFavorites) | **GET** /content_favorite/search | Search Favorite Contents
*ContentApi* | [**searchContentViews**](docs/ContentApi.md#searchContentViews) | **GET** /content_view/search | Search Content Views
*ContentApi* | [**updateContentMetadata**](docs/ContentApi.md#updateContentMetadata) | **PATCH** /content_metadata/{content_metadata_id} | Update Content Metadata
*ContentApi* | [**updateContentMetadataAccess**](docs/ContentApi.md#updateContentMetadataAccess) | **PUT** /content_metadata_access/{content_metadata_access_id} | Update Content Metadata Access
*DashboardApi* | [**allDashboards**](docs/DashboardApi.md#allDashboards) | **GET** /dashboards | Get All Dashboards
*DashboardApi* | [**createDashboard**](docs/DashboardApi.md#createDashboard) | **POST** /dashboards | Create Dashboard
*DashboardApi* | [**createDashboardPrefetch**](docs/DashboardApi.md#createDashboardPrefetch) | **POST** /dashboards/{dashboard_id}/prefetch | Create Dashboard Prefetch
*DashboardApi* | [**dashboard**](docs/DashboardApi.md#dashboard) | **GET** /dashboards/{dashboard_id} | Get Dashboard
*DashboardApi* | [**dashboardPrefetch**](docs/DashboardApi.md#dashboardPrefetch) | **GET** /dashboards/{dashboard_id}/prefetch | Get Dashboard Prefetch
*DashboardApi* | [**deleteDashboard**](docs/DashboardApi.md#deleteDashboard) | **DELETE** /dashboards/{dashboard_id} | Delete Dashboard
*DashboardApi* | [**importLookmlDashboard**](docs/DashboardApi.md#importLookmlDashboard) | **POST** /dashboards/{lookml_dashboard_id}/import/{space_id} | Create Dashboard
*DashboardApi* | [**searchDashboards**](docs/DashboardApi.md#searchDashboards) | **GET** /dashboards/search | Search Dashboards
*DashboardApi* | [**syncLookmlDashboard**](docs/DashboardApi.md#syncLookmlDashboard) | **PATCH** /dashboards/{lookml_dashboard_id}/sync | Update Dashboard
*DashboardApi* | [**updateDashboard**](docs/DashboardApi.md#updateDashboard) | **PATCH** /dashboards/{dashboard_id} | Update Dashboard
*DataActionApi* | [**fetchRemoteDataActionForm**](docs/DataActionApi.md#fetchRemoteDataActionForm) | **POST** /data_actions/form | Fetch Remote Data Action Form
*DataActionApi* | [**performDataAction**](docs/DataActionApi.md#performDataAction) | **POST** /data_actions | Send a Data Action
*DatagroupApi* | [**allDatagroups**](docs/DatagroupApi.md#allDatagroups) | **GET** /datagroups | Get All Datagroups
*DatagroupApi* | [**datagroup**](docs/DatagroupApi.md#datagroup) | **GET** /datagroups/{datagroup_id} | Get Datagroup
*DatagroupApi* | [**updateDatagroup**](docs/DatagroupApi.md#updateDatagroup) | **PATCH** /datagroups/{datagroup_id} | Update Datagroup
*GroupApi* | [**addGroupGroup**](docs/GroupApi.md#addGroupGroup) | **POST** /groups/{group_id}/groups | Add a Group to Group
*GroupApi* | [**addGroupUser**](docs/GroupApi.md#addGroupUser) | **POST** /groups/{group_id}/users | Add a User to Group
*GroupApi* | [**allGroupGroups**](docs/GroupApi.md#allGroupGroups) | **GET** /groups/{group_id}/groups | Get All Groups in Group
*GroupApi* | [**allGroupUsers**](docs/GroupApi.md#allGroupUsers) | **GET** /groups/{group_id}/users | Get All Users in Group
*GroupApi* | [**allGroups**](docs/GroupApi.md#allGroups) | **GET** /groups | Get All Groups
*GroupApi* | [**createGroup**](docs/GroupApi.md#createGroup) | **POST** /groups | Create Group
*GroupApi* | [**deleteGroup**](docs/GroupApi.md#deleteGroup) | **DELETE** /groups/{group_id} | Delete Group
*GroupApi* | [**deleteGroupFromGroup**](docs/GroupApi.md#deleteGroupFromGroup) | **DELETE** /groups/{group_id}/groups/{deleting_group_id} | Deletes a Group from Group
*GroupApi* | [**deleteGroupUser**](docs/GroupApi.md#deleteGroupUser) | **DELETE** /groups/{group_id}/users/{user_id} | Remove a User from Group
*GroupApi* | [**deleteUserAttributeGroupValue**](docs/GroupApi.md#deleteUserAttributeGroupValue) | **DELETE** /groups/{group_id}/attribute_values/{user_attribute_id} | Delete User Attribute Group Value
*GroupApi* | [**group**](docs/GroupApi.md#group) | **GET** /groups/{group_id} | Get Group
*GroupApi* | [**updateGroup**](docs/GroupApi.md#updateGroup) | **PATCH** /groups/{group_id} | Update Group
*GroupApi* | [**updateUserAttributeGroupValue**](docs/GroupApi.md#updateUserAttributeGroupValue) | **PATCH** /groups/{group_id}/attribute_values/{user_attribute_id} | Set User Attribute Group Value
*HomepageApi* | [**allHomepageItems**](docs/HomepageApi.md#allHomepageItems) | **GET** /homepage_items | Get All Homepage Items
*HomepageApi* | [**allHomepageSections**](docs/HomepageApi.md#allHomepageSections) | **GET** /homepage_sections | Get All Homepage sections
*HomepageApi* | [**createHomepageItem**](docs/HomepageApi.md#createHomepageItem) | **POST** /homepage_items | Create Homepage Item
*HomepageApi* | [**createHomepageSection**](docs/HomepageApi.md#createHomepageSection) | **POST** /homepage_sections | Create Homepage section
*HomepageApi* | [**deleteHomepageItem**](docs/HomepageApi.md#deleteHomepageItem) | **DELETE** /homepage_items/{homepage_item_id} | Delete Homepage Item
*HomepageApi* | [**deleteHomepageSection**](docs/HomepageApi.md#deleteHomepageSection) | **DELETE** /homepage_sections/{homepage_section_id} | Delete Homepage section
*HomepageApi* | [**homepageItem**](docs/HomepageApi.md#homepageItem) | **GET** /homepage_items/{homepage_item_id} | Get Homepage Item
*HomepageApi* | [**homepageSection**](docs/HomepageApi.md#homepageSection) | **GET** /homepage_sections/{homepage_section_id} | Get Homepage section
*HomepageApi* | [**updateHomepageItem**](docs/HomepageApi.md#updateHomepageItem) | **PATCH** /homepage_items/{homepage_item_id} | Update Homepage Item
*HomepageApi* | [**updateHomepageSection**](docs/HomepageApi.md#updateHomepageSection) | **PATCH** /homepage_sections/{homepage_section_id} | Update Homepage section
*IntegrationApi* | [**acceptIntegrationHubLegalAgreement**](docs/IntegrationApi.md#acceptIntegrationHubLegalAgreement) | **POST** /integration_hubs/{integration_hub_id}/accept_legal_agreement | Accept Integration Hub Legal Agreement
*IntegrationApi* | [**allIntegrationHubs**](docs/IntegrationApi.md#allIntegrationHubs) | **GET** /integration_hubs | Get All Integration Hubs
*IntegrationApi* | [**allIntegrations**](docs/IntegrationApi.md#allIntegrations) | **GET** /integrations | Get All Integrations
*IntegrationApi* | [**createIntegrationHub**](docs/IntegrationApi.md#createIntegrationHub) | **POST** /integration_hubs | Create Integration Hub
*IntegrationApi* | [**deleteIntegrationHub**](docs/IntegrationApi.md#deleteIntegrationHub) | **DELETE** /integration_hubs/{integration_hub_id} | Delete Integration Hub
*IntegrationApi* | [**fetchIntegrationForm**](docs/IntegrationApi.md#fetchIntegrationForm) | **POST** /integrations/{integration_id}/form | Fetch Remote Integration Form
*IntegrationApi* | [**integration**](docs/IntegrationApi.md#integration) | **GET** /integrations/{integration_id} | Get Integration
*IntegrationApi* | [**integrationHub**](docs/IntegrationApi.md#integrationHub) | **GET** /integration_hubs/{integration_hub_id} | Get Integration Hub
*IntegrationApi* | [**testIntegration**](docs/IntegrationApi.md#testIntegration) | **POST** /integrations/{integration_id}/test | Test integration
*IntegrationApi* | [**updateIntegration**](docs/IntegrationApi.md#updateIntegration) | **PATCH** /integrations/{integration_id} | Update Integration
*IntegrationApi* | [**updateIntegrationHub**](docs/IntegrationApi.md#updateIntegrationHub) | **PATCH** /integration_hubs/{integration_hub_id} | Update Integration Hub
*LookApi* | [**allLooks**](docs/LookApi.md#allLooks) | **GET** /looks | Get All Looks
*LookApi* | [**createLook**](docs/LookApi.md#createLook) | **POST** /looks | Create Look
*LookApi* | [**deleteLook**](docs/LookApi.md#deleteLook) | **DELETE** /looks/{look_id} | Delete Look
*LookApi* | [**look**](docs/LookApi.md#look) | **GET** /looks/{look_id} | Get Look
*LookApi* | [**runLook**](docs/LookApi.md#runLook) | **GET** /looks/{look_id}/run/{result_format} | Run Look
*LookApi* | [**searchLooks**](docs/LookApi.md#searchLooks) | **GET** /looks/search | Search Looks
*LookApi* | [**updateLook**](docs/LookApi.md#updateLook) | **PATCH** /looks/{look_id} | Update Look
*LookmlModelApi* | [**allLookmlModels**](docs/LookmlModelApi.md#allLookmlModels) | **GET** /lookml_models | Get All LookML Models
*LookmlModelApi* | [**createLookmlModel**](docs/LookmlModelApi.md#createLookmlModel) | **POST** /lookml_models | Create LookML Model
*LookmlModelApi* | [**deleteLookmlModel**](docs/LookmlModelApi.md#deleteLookmlModel) | **DELETE** /lookml_models/{lookml_model_name} | Delete LookML Model
*LookmlModelApi* | [**lookmlModel**](docs/LookmlModelApi.md#lookmlModel) | **GET** /lookml_models/{lookml_model_name} | Get LookML Model
*LookmlModelApi* | [**lookmlModelExplore**](docs/LookmlModelApi.md#lookmlModelExplore) | **GET** /lookml_models/{lookml_model_name}/explores/{explore_name} | Get LookML Model Explore
*LookmlModelApi* | [**updateLookmlModel**](docs/LookmlModelApi.md#updateLookmlModel) | **PATCH** /lookml_models/{lookml_model_name} | Update LookML Model
*ProjectApi* | [**allGitBranches**](docs/ProjectApi.md#allGitBranches) | **GET** /projects/{project_id}/git_branches | Get All Git Branches
*ProjectApi* | [**allGitConnectionTests**](docs/ProjectApi.md#allGitConnectionTests) | **GET** /projects/{project_id}/git_connection_tests | Get All Git Connection Tests
*ProjectApi* | [**allProjectFiles**](docs/ProjectApi.md#allProjectFiles) | **GET** /projects/{project_id}/files | Get All Project Files
*ProjectApi* | [**allProjects**](docs/ProjectApi.md#allProjects) | **GET** /projects | Get All Projects
*ProjectApi* | [**createGitBranch**](docs/ProjectApi.md#createGitBranch) | **POST** /projects/{project_id}/git_branch | Checkout New Git Branch
*ProjectApi* | [**createGitDeployKey**](docs/ProjectApi.md#createGitDeployKey) | **POST** /projects/{project_id}/git/deploy_key | Create Deploy Key
*ProjectApi* | [**createProject**](docs/ProjectApi.md#createProject) | **POST** /projects | Create Project
*ProjectApi* | [**deleteGitBranch**](docs/ProjectApi.md#deleteGitBranch) | **DELETE** /projects/{project_id}/git_branch/{branch_name} | Delete a Git Branch
*ProjectApi* | [**deployToProduction**](docs/ProjectApi.md#deployToProduction) | **POST** /projects/{project_id}/deploy_to_production | Deploy To Production
*ProjectApi* | [**findGitBranch**](docs/ProjectApi.md#findGitBranch) | **GET** /projects/{project_id}/git_branch/{branch_name} | Find a Git Branch
*ProjectApi* | [**gitBranch**](docs/ProjectApi.md#gitBranch) | **GET** /projects/{project_id}/git_branch | Get Active Git Branch
*ProjectApi* | [**gitDeployKey**](docs/ProjectApi.md#gitDeployKey) | **GET** /projects/{project_id}/git/deploy_key | Git Deploy Key
*ProjectApi* | [**project**](docs/ProjectApi.md#project) | **GET** /projects/{project_id} | Get Project
*ProjectApi* | [**projectFile**](docs/ProjectApi.md#projectFile) | **GET** /projects/{project_id}/files/file | Get Project File
*ProjectApi* | [**projectValidationResults**](docs/ProjectApi.md#projectValidationResults) | **GET** /projects/{project_id}/validate | Cached Project Validation Results
*ProjectApi* | [**projectWorkspace**](docs/ProjectApi.md#projectWorkspace) | **GET** /projects/{project_id}/current_workspace | Get Project Workspace
*ProjectApi* | [**resetProjectToProduction**](docs/ProjectApi.md#resetProjectToProduction) | **POST** /projects/{project_id}/reset_to_production | Reset To Production
*ProjectApi* | [**resetProjectToRemote**](docs/ProjectApi.md#resetProjectToRemote) | **POST** /projects/{project_id}/reset_to_remote | Reset To Remote
*ProjectApi* | [**runGitConnectionTest**](docs/ProjectApi.md#runGitConnectionTest) | **GET** /projects/{project_id}/git_connection_tests/{test_id} | Run Git Connection Test
*ProjectApi* | [**updateGitBranch**](docs/ProjectApi.md#updateGitBranch) | **PUT** /projects/{project_id}/git_branch | Update Project Git Branch
*ProjectApi* | [**updateProject**](docs/ProjectApi.md#updateProject) | **PATCH** /projects/{project_id} | Update Project
*ProjectApi* | [**validateProject**](docs/ProjectApi.md#validateProject) | **POST** /projects/{project_id}/validate | Validate Project
*QueryApi* | [**createQuery**](docs/QueryApi.md#createQuery) | **POST** /queries | Create Query
*QueryApi* | [**createQueryTask**](docs/QueryApi.md#createQueryTask) | **POST** /query_tasks | Run Query Async
*QueryApi* | [**query**](docs/QueryApi.md#query) | **GET** /queries/{query_id} | Get Query
*QueryApi* | [**queryForSlug**](docs/QueryApi.md#queryForSlug) | **GET** /queries/slug/{slug} | Get Query for Slug
*QueryApi* | [**queryTask**](docs/QueryApi.md#queryTask) | **GET** /query_tasks/{query_task_id} | Get Async Query Info
*QueryApi* | [**queryTaskMultiResults**](docs/QueryApi.md#queryTaskMultiResults) | **GET** /query_tasks/multi_results | Get Multiple Async Query Results
*QueryApi* | [**queryTaskResults**](docs/QueryApi.md#queryTaskResults) | **GET** /query_tasks/{query_task_id}/results | Get Async Query Results
*QueryApi* | [**runInlineQuery**](docs/QueryApi.md#runInlineQuery) | **POST** /queries/run/{result_format} | Run Inline Query
*QueryApi* | [**runQuery**](docs/QueryApi.md#runQuery) | **GET** /queries/{query_id}/run/{result_format} | Run Query
*QueryApi* | [**runUrlEncodedQuery**](docs/QueryApi.md#runUrlEncodedQuery) | **GET** /queries/models/{model_name}/views/{view_name}/run/{result_format} | Run Url Encoded Query
*RenderTaskApi* | [**createDashboardRenderTask**](docs/RenderTaskApi.md#createDashboardRenderTask) | **POST** /render_tasks/dashboards/{dashboard_id}/{result_format} | Create Dashboard Render Task
*RenderTaskApi* | [**createLookRenderTask**](docs/RenderTaskApi.md#createLookRenderTask) | **POST** /render_tasks/looks/{look_id}/{result_format} | Create Look Render Task
*RenderTaskApi* | [**createLookmlDashboardRenderTask**](docs/RenderTaskApi.md#createLookmlDashboardRenderTask) | **POST** /render_tasks/lookml_dashboards/{dashboard_id}/{result_format} | Create Lookml Dashboard Render Task
*RenderTaskApi* | [**createQueryRenderTask**](docs/RenderTaskApi.md#createQueryRenderTask) | **POST** /render_tasks/queries/{query_id}/{result_format} | Create Query Render Task
*RenderTaskApi* | [**renderTask**](docs/RenderTaskApi.md#renderTask) | **GET** /render_tasks/{render_task_id} | Get Render Task
*RenderTaskApi* | [**renderTaskResults**](docs/RenderTaskApi.md#renderTaskResults) | **GET** /render_tasks/{render_task_id}/results | Render Task Results
*RoleApi* | [**allModelSets**](docs/RoleApi.md#allModelSets) | **GET** /model_sets | Get All Model Sets
*RoleApi* | [**allPermissionSets**](docs/RoleApi.md#allPermissionSets) | **GET** /permission_sets | Get All Permission Sets
*RoleApi* | [**allPermissions**](docs/RoleApi.md#allPermissions) | **GET** /permissions | Get All Permissions
*RoleApi* | [**allRoles**](docs/RoleApi.md#allRoles) | **GET** /roles | Get All Roles
*RoleApi* | [**createModelSet**](docs/RoleApi.md#createModelSet) | **POST** /model_sets | Create Model Set
*RoleApi* | [**createPermissionSet**](docs/RoleApi.md#createPermissionSet) | **POST** /permission_sets | Create Permission Set
*RoleApi* | [**createRole**](docs/RoleApi.md#createRole) | **POST** /roles | Create Role
*RoleApi* | [**deleteModelSet**](docs/RoleApi.md#deleteModelSet) | **DELETE** /model_sets/{model_set_id} | Delete Model Set
*RoleApi* | [**deletePermissionSet**](docs/RoleApi.md#deletePermissionSet) | **DELETE** /permission_sets/{permission_set_id} | Delete Permission Set
*RoleApi* | [**deleteRole**](docs/RoleApi.md#deleteRole) | **DELETE** /roles/{role_id} | Delete Role
*RoleApi* | [**modelSet**](docs/RoleApi.md#modelSet) | **GET** /model_sets/{model_set_id} | Get Model Set
*RoleApi* | [**permissionSet**](docs/RoleApi.md#permissionSet) | **GET** /permission_sets/{permission_set_id} | Get Permission Set
*RoleApi* | [**role**](docs/RoleApi.md#role) | **GET** /roles/{role_id} | Get Role
*RoleApi* | [**roleGroups**](docs/RoleApi.md#roleGroups) | **GET** /roles/{role_id}/groups | Get Role Groups
*RoleApi* | [**roleUsers**](docs/RoleApi.md#roleUsers) | **GET** /roles/{role_id}/users | Get Role Users
*RoleApi* | [**setRoleGroups**](docs/RoleApi.md#setRoleGroups) | **PUT** /roles/{role_id}/groups | Update Role Groups
*RoleApi* | [**setRoleUsers**](docs/RoleApi.md#setRoleUsers) | **PUT** /roles/{role_id}/users | Update Role Users
*RoleApi* | [**updateModelSet**](docs/RoleApi.md#updateModelSet) | **PATCH** /model_sets/{model_set_id} | Update Model Set
*RoleApi* | [**updatePermissionSet**](docs/RoleApi.md#updatePermissionSet) | **PATCH** /permission_sets/{permission_set_id} | Update Permission Set
*RoleApi* | [**updateRole**](docs/RoleApi.md#updateRole) | **PATCH** /roles/{role_id} | Update Role
*RunningQueriesApi* | [**allRunningQueries**](docs/RunningQueriesApi.md#allRunningQueries) | **GET** /running_queries | Get All Running Queries
*RunningQueriesApi* | [**killQuery**](docs/RunningQueriesApi.md#killQuery) | **DELETE** /running_queries/{query_task_id} | Kill Running Query
*ScheduledPlanApi* | [**allScheduledPlans**](docs/ScheduledPlanApi.md#allScheduledPlans) | **GET** /scheduled_plans | Get All Scheduled Plans
*ScheduledPlanApi* | [**createScheduledPlan**](docs/ScheduledPlanApi.md#createScheduledPlan) | **POST** /scheduled_plans | Create Scheduled Plan
*ScheduledPlanApi* | [**deleteScheduledPlan**](docs/ScheduledPlanApi.md#deleteScheduledPlan) | **DELETE** /scheduled_plans/{scheduled_plan_id} | Delete Scheduled Plan
*ScheduledPlanApi* | [**scheduledPlan**](docs/ScheduledPlanApi.md#scheduledPlan) | **GET** /scheduled_plans/{scheduled_plan_id} | Get Scheduled Plan
*ScheduledPlanApi* | [**scheduledPlanRunOnce**](docs/ScheduledPlanApi.md#scheduledPlanRunOnce) | **POST** /scheduled_plans/run_once | Run Scheduled Plan Once
*ScheduledPlanApi* | [**scheduledPlansForDashboard**](docs/ScheduledPlanApi.md#scheduledPlansForDashboard) | **GET** /scheduled_plans/dashboard/{dashboard_id} | Scheduled Plans for Dashboard
*ScheduledPlanApi* | [**scheduledPlansForLook**](docs/ScheduledPlanApi.md#scheduledPlansForLook) | **GET** /scheduled_plans/look/{look_id} | Scheduled Plans for Look
*ScheduledPlanApi* | [**scheduledPlansForLookmlDashboard**](docs/ScheduledPlanApi.md#scheduledPlansForLookmlDashboard) | **GET** /scheduled_plans/lookml_dashboard/{lookml_dashboard_id} | Scheduled Plans for LookML Dashboard
*ScheduledPlanApi* | [**scheduledPlansForSpace**](docs/ScheduledPlanApi.md#scheduledPlansForSpace) | **GET** /scheduled_plans/space/{space_id} | Scheduled Plans for Space
*ScheduledPlanApi* | [**updateScheduledPlan**](docs/ScheduledPlanApi.md#updateScheduledPlan) | **PATCH** /scheduled_plans/{scheduled_plan_id} | Update Scheduled Plan
*SessionApi* | [**session**](docs/SessionApi.md#session) | **GET** /session | Get Session
*SessionApi* | [**updateSession**](docs/SessionApi.md#updateSession) | **PATCH** /session | Update Session
*SpaceApi* | [**allSpaces**](docs/SpaceApi.md#allSpaces) | **GET** /spaces | Get All Spaces
*SpaceApi* | [**createSpace**](docs/SpaceApi.md#createSpace) | **POST** /spaces | Create Space
*SpaceApi* | [**deleteSpace**](docs/SpaceApi.md#deleteSpace) | **DELETE** /spaces/{space_id} | Delete Space
*SpaceApi* | [**searchSpaces**](docs/SpaceApi.md#searchSpaces) | **GET** /spaces/search | Search Spaces
*SpaceApi* | [**space**](docs/SpaceApi.md#space) | **GET** /spaces/{space_id} | Get Space
*SpaceApi* | [**spaceAncestors**](docs/SpaceApi.md#spaceAncestors) | **GET** /spaces/{space_id}/ancestors | Get Space Ancestors
*SpaceApi* | [**spaceChildren**](docs/SpaceApi.md#spaceChildren) | **GET** /spaces/{space_id}/children | Get Space Children
*SpaceApi* | [**spaceChildrenSearch**](docs/SpaceApi.md#spaceChildrenSearch) | **GET** /spaces/{space_id}/children/search | Search Space Children
*SpaceApi* | [**spaceDashboards**](docs/SpaceApi.md#spaceDashboards) | **GET** /spaces/{space_id}/dashboards | Get Space Dashboards
*SpaceApi* | [**spaceLooks**](docs/SpaceApi.md#spaceLooks) | **GET** /spaces/{space_id}/looks | Get Space Looks
*SpaceApi* | [**spaceParent**](docs/SpaceApi.md#spaceParent) | **GET** /spaces/{space_id}/parent | Get Space Parent
*SpaceApi* | [**updateSpace**](docs/SpaceApi.md#updateSpace) | **PATCH** /spaces/{space_id} | Update Space
*SqlQueryApi* | [**createSqlQuery**](docs/SqlQueryApi.md#createSqlQuery) | **POST** /sql_queries | Create SQL Runner Query
*SqlQueryApi* | [**sqlQuery**](docs/SqlQueryApi.md#sqlQuery) | **GET** /sql_queries/{slug} | Get SQL Runner Query
*UserApi* | [**allUserAccessFilters**](docs/UserApi.md#allUserAccessFilters) | **GET** /users/{user_id}/access_filters | Get All Access Filters
*UserApi* | [**allUserCredentialsApi3s**](docs/UserApi.md#allUserCredentialsApi3s) | **GET** /users/{user_id}/credentials_api3 | Get All API 3 Credentials
*UserApi* | [**allUserCredentialsEmbeds**](docs/UserApi.md#allUserCredentialsEmbeds) | **GET** /users/{user_id}/credentials_embed | Get All Embedding Credentials
*UserApi* | [**allUserSessions**](docs/UserApi.md#allUserSessions) | **GET** /users/{user_id}/sessions | Get All Web Login Sessions
*UserApi* | [**allUsers**](docs/UserApi.md#allUsers) | **GET** /users | Get All Users
*UserApi* | [**createUser**](docs/UserApi.md#createUser) | **POST** /users | Create User
*UserApi* | [**createUserAccessFilter**](docs/UserApi.md#createUserAccessFilter) | **POST** /users/{user_id}/access_filters | Create Access Filter
*UserApi* | [**createUserCredentialsApi**](docs/UserApi.md#createUserCredentialsApi) | **POST** /users/{user_id}/credentials_api | Create API Credential
*UserApi* | [**createUserCredentialsApi3**](docs/UserApi.md#createUserCredentialsApi3) | **POST** /users/{user_id}/credentials_api3 | Create API 3 Credential
*UserApi* | [**createUserCredentialsEmail**](docs/UserApi.md#createUserCredentialsEmail) | **POST** /users/{user_id}/credentials_email | Create Email/Password Credential
*UserApi* | [**createUserCredentialsEmailPasswordReset**](docs/UserApi.md#createUserCredentialsEmailPasswordReset) | **POST** /users/{user_id}/credentials_email/password_reset | Create Password Reset Token
*UserApi* | [**createUserCredentialsTotp**](docs/UserApi.md#createUserCredentialsTotp) | **POST** /users/{user_id}/credentials_totp | Create Two-Factor Credential
*UserApi* | [**deleteUser**](docs/UserApi.md#deleteUser) | **DELETE** /users/{user_id} | Delete User
*UserApi* | [**deleteUserAccessFilter**](docs/UserApi.md#deleteUserAccessFilter) | **DELETE** /users/{user_id}/access_filters/{access_filter_id} | Delete Access Filter
*UserApi* | [**deleteUserAttributeUserValue**](docs/UserApi.md#deleteUserAttributeUserValue) | **DELETE** /users/{user_id}/attribute_values/{user_attribute_id} | Delete User Attribute User Value
*UserApi* | [**deleteUserCredentialsApi**](docs/UserApi.md#deleteUserCredentialsApi) | **DELETE** /users/{user_id}/credentials_api | Delete API Credential
*UserApi* | [**deleteUserCredentialsApi3**](docs/UserApi.md#deleteUserCredentialsApi3) | **DELETE** /users/{user_id}/credentials_api3/{credentials_api3_id} | Delete API 3 Credential
*UserApi* | [**deleteUserCredentialsEmail**](docs/UserApi.md#deleteUserCredentialsEmail) | **DELETE** /users/{user_id}/credentials_email | Delete Email/Password Credential
*UserApi* | [**deleteUserCredentialsEmbed**](docs/UserApi.md#deleteUserCredentialsEmbed) | **DELETE** /users/{user_id}/credentials_embed/{credentials_embed_id} | Delete Embedding Credential
*UserApi* | [**deleteUserCredentialsGoogle**](docs/UserApi.md#deleteUserCredentialsGoogle) | **DELETE** /users/{user_id}/credentials_google | Delete Google Auth Credential
*UserApi* | [**deleteUserCredentialsLdap**](docs/UserApi.md#deleteUserCredentialsLdap) | **DELETE** /users/{user_id}/credentials_ldap | Delete LDAP Credential
*UserApi* | [**deleteUserCredentialsLookerOpenid**](docs/UserApi.md#deleteUserCredentialsLookerOpenid) | **DELETE** /users/{user_id}/credentials_looker_openid | Delete Looker OpenId Credential
*UserApi* | [**deleteUserCredentialsOidc**](docs/UserApi.md#deleteUserCredentialsOidc) | **DELETE** /users/{user_id}/credentials_oidc | Delete OIDC Auth Credential
*UserApi* | [**deleteUserCredentialsSaml**](docs/UserApi.md#deleteUserCredentialsSaml) | **DELETE** /users/{user_id}/credentials_saml | Delete Saml Auth Credential
*UserApi* | [**deleteUserCredentialsTotp**](docs/UserApi.md#deleteUserCredentialsTotp) | **DELETE** /users/{user_id}/credentials_totp | Delete Two-Factor Credential
*UserApi* | [**deleteUserSession**](docs/UserApi.md#deleteUserSession) | **DELETE** /users/{user_id}/sessions/{session_id} | Delete Web Login Session
*UserApi* | [**me**](docs/UserApi.md#me) | **GET** /user | Get Current User
*UserApi* | [**searchUsers**](docs/UserApi.md#searchUsers) | **GET** /users/search | Search Users
*UserApi* | [**searchUsersNames**](docs/UserApi.md#searchUsersNames) | **GET** /users/search/names/{pattern} | Search User Names
*UserApi* | [**setUserAttributeUserValue**](docs/UserApi.md#setUserAttributeUserValue) | **PATCH** /users/{user_id}/attribute_values/{user_attribute_id} | Set User Attribute User Value
*UserApi* | [**setUserRoles**](docs/UserApi.md#setUserRoles) | **PUT** /users/{user_id}/roles | Set User Roles
*UserApi* | [**updateUser**](docs/UserApi.md#updateUser) | **PATCH** /users/{user_id} | Update User
*UserApi* | [**updateUserAccessFilter**](docs/UserApi.md#updateUserAccessFilter) | **PATCH** /users/{user_id}/access_filters/{access_filter_id} | Update Access Filter
*UserApi* | [**updateUserCredentialsEmail**](docs/UserApi.md#updateUserCredentialsEmail) | **PATCH** /users/{user_id}/credentials_email | Update Email/Password Credential
*UserApi* | [**user**](docs/UserApi.md#user) | **GET** /users/{user_id} | Get User by Id
*UserApi* | [**userAccessFilter**](docs/UserApi.md#userAccessFilter) | **GET** /users/{user_id}/access_filters/{access_filter_id} | Get Access Filter
*UserApi* | [**userAttributeUserValues**](docs/UserApi.md#userAttributeUserValues) | **GET** /users/{user_id}/attribute_values | Get User Attribute Values
*UserApi* | [**userCredentialsApi**](docs/UserApi.md#userCredentialsApi) | **GET** /users/{user_id}/credentials_api | Get API Credential
*UserApi* | [**userCredentialsApi3**](docs/UserApi.md#userCredentialsApi3) | **GET** /users/{user_id}/credentials_api3/{credentials_api3_id} | Get API 3 Credential
*UserApi* | [**userCredentialsEmail**](docs/UserApi.md#userCredentialsEmail) | **GET** /users/{user_id}/credentials_email | Get Email/Password Credential
*UserApi* | [**userCredentialsEmbed**](docs/UserApi.md#userCredentialsEmbed) | **GET** /users/{user_id}/credentials_embed/{credentials_embed_id} | Get Embedding Credential
*UserApi* | [**userCredentialsGoogle**](docs/UserApi.md#userCredentialsGoogle) | **GET** /users/{user_id}/credentials_google | Get Google Auth Credential
*UserApi* | [**userCredentialsLdap**](docs/UserApi.md#userCredentialsLdap) | **GET** /users/{user_id}/credentials_ldap | Get LDAP Credential
*UserApi* | [**userCredentialsLookerOpenid**](docs/UserApi.md#userCredentialsLookerOpenid) | **GET** /users/{user_id}/credentials_looker_openid | Get Looker OpenId Credential
*UserApi* | [**userCredentialsOidc**](docs/UserApi.md#userCredentialsOidc) | **GET** /users/{user_id}/credentials_oidc | Get OIDC Auth Credential
*UserApi* | [**userCredentialsSaml**](docs/UserApi.md#userCredentialsSaml) | **GET** /users/{user_id}/credentials_saml | Get Saml Auth Credential
*UserApi* | [**userCredentialsTotp**](docs/UserApi.md#userCredentialsTotp) | **GET** /users/{user_id}/credentials_totp | Get Two-Factor Credential
*UserApi* | [**userForCredential**](docs/UserApi.md#userForCredential) | **GET** /users/credential/{credential_type}/{credential_id} | Get User by Credential Id
*UserApi* | [**userRoles**](docs/UserApi.md#userRoles) | **GET** /users/{user_id}/roles | Get User Roles
*UserApi* | [**userSession**](docs/UserApi.md#userSession) | **GET** /users/{user_id}/sessions/{session_id} | Get Web Login Session
*UserAttributeApi* | [**allUserAttributeGroupValues**](docs/UserAttributeApi.md#allUserAttributeGroupValues) | **GET** /user_attributes/{user_attribute_id}/group_values | Get User Attribute Group Values
*UserAttributeApi* | [**allUserAttributes**](docs/UserAttributeApi.md#allUserAttributes) | **GET** /user_attributes | Get All User Attributes
*UserAttributeApi* | [**createUserAttribute**](docs/UserAttributeApi.md#createUserAttribute) | **POST** /user_attributes | Create User Attribute
*UserAttributeApi* | [**deleteUserAttribute**](docs/UserAttributeApi.md#deleteUserAttribute) | **DELETE** /user_attributes/{user_attribute_id} | Delete User Attribute
*UserAttributeApi* | [**setUserAttributeGroupValues**](docs/UserAttributeApi.md#setUserAttributeGroupValues) | **POST** /user_attributes/{user_attribute_id}/group_values | Set User Attribute Group Values
*UserAttributeApi* | [**updateUserAttribute**](docs/UserAttributeApi.md#updateUserAttribute) | **PATCH** /user_attributes/{user_attribute_id} | Update User Attribute
*UserAttributeApi* | [**userAttribute**](docs/UserAttributeApi.md#userAttribute) | **GET** /user_attributes/{user_attribute_id} | Get User Attribute
*WorkspaceApi* | [**allWorkspaces**](docs/WorkspaceApi.md#allWorkspaces) | **GET** /workspaces | Get All Workspaces
*WorkspaceApi* | [**workspace**](docs/WorkspaceApi.md#workspace) | **GET** /workspaces/{workspace_id} | Get Workspace

## Documentation for Models

 - [AccessFilter](docs/AccessFilter.md)
 - [AccessToken](docs/AccessToken.md)
 - [ApiSession](docs/ApiSession.md)
 - [ApiVersion](docs/ApiVersion.md)
 - [ApiVersionElement](docs/ApiVersionElement.md)
 - [BackupConfiguration](docs/BackupConfiguration.md)
 - [ContentFavorite](docs/ContentFavorite.md)
 - [ContentMeta](docs/ContentMeta.md)
 - [ContentMetaGroupUser](docs/ContentMetaGroupUser.md)
 - [ContentView](docs/ContentView.md)
 - [CreateDashboardRenderTask](docs/CreateDashboardRenderTask.md)
 - [CreateQueryTask](docs/CreateQueryTask.md)
 - [CredentialsApi](docs/CredentialsApi.md)
 - [CredentialsApi3](docs/CredentialsApi3.md)
 - [CredentialsEmail](docs/CredentialsEmail.md)
 - [CredentialsEmbed](docs/CredentialsEmbed.md)
 - [CredentialsGoogle](docs/CredentialsGoogle.md)
 - [CredentialsLDAP](docs/CredentialsLDAP.md)
 - [CredentialsLookerOpenid](docs/CredentialsLookerOpenid.md)
 - [CredentialsOIDC](docs/CredentialsOIDC.md)
 - [CredentialsSaml](docs/CredentialsSaml.md)
 - [CredentialsTotp](docs/CredentialsTotp.md)
 - [DBConnection](docs/DBConnection.md)
 - [DBConnectionBase](docs/DBConnectionBase.md)
 - [DBConnectionOverride](docs/DBConnectionOverride.md)
 - [DBConnectionTestResult](docs/DBConnectionTestResult.md)
 - [Dashboard](docs/Dashboard.md)
 - [DashboardBase](docs/DashboardBase.md)
 - [DashboardElement](docs/DashboardElement.md)
 - [DashboardFilter](docs/DashboardFilter.md)
 - [DashboardLayout](docs/DashboardLayout.md)
 - [DashboardLayoutComponent](docs/DashboardLayoutComponent.md)
 - [DataActionForm](docs/DataActionForm.md)
 - [DataActionFormField](docs/DataActionFormField.md)
 - [DataActionFormSelectOption](docs/DataActionFormSelectOption.md)
 - [DataActionRequest](docs/DataActionRequest.md)
 - [DataActionResponse](docs/DataActionResponse.md)
 - [DataActionUserState](docs/DataActionUserState.md)
 - [Datagroup](docs/Datagroup.md)
 - [Dialect](docs/Dialect.md)
 - [DialectInfo](docs/DialectInfo.md)
 - [DialectInfoOptions](docs/DialectInfoOptions.md)
 - [Error](docs/Error.md)
 - [GitBranch](docs/GitBranch.md)
 - [GitConnectionTest](docs/GitConnectionTest.md)
 - [GitConnectionTestResult](docs/GitConnectionTestResult.md)
 - [GitStatus](docs/GitStatus.md)
 - [Group](docs/Group.md)
 - [GroupIdForGroupInclusion](docs/GroupIdForGroupInclusion.md)
 - [GroupIdForGroupUserInclusion](docs/GroupIdForGroupUserInclusion.md)
 - [HomepageItem](docs/HomepageItem.md)
 - [HomepageSection](docs/HomepageSection.md)
 - [Integration](docs/Integration.md)
 - [IntegrationHub](docs/IntegrationHub.md)
 - [IntegrationParam](docs/IntegrationParam.md)
 - [IntegrationRequiredField](docs/IntegrationRequiredField.md)
 - [IntegrationTestResult](docs/IntegrationTestResult.md)
 - [LDAPConfig](docs/LDAPConfig.md)
 - [LDAPConfigTestIssue](docs/LDAPConfigTestIssue.md)
 - [LDAPConfigTestResult](docs/LDAPConfigTestResult.md)
 - [LDAPGroupRead](docs/LDAPGroupRead.md)
 - [LDAPGroupWrite](docs/LDAPGroupWrite.md)
 - [LDAPUser](docs/LDAPUser.md)
 - [LDAPUserAttributeRead](docs/LDAPUserAttributeRead.md)
 - [LDAPUserAttributeWrite](docs/LDAPUserAttributeWrite.md)
 - [LegacyFeature](docs/LegacyFeature.md)
 - [Look](docs/Look.md)
 - [LookBasic](docs/LookBasic.md)
 - [LookModel](docs/LookModel.md)
 - [LookWithDashboards](docs/LookWithDashboards.md)
 - [LookWithQuery](docs/LookWithQuery.md)
 - [LookmlModel](docs/LookmlModel.md)
 - [LookmlModelExplore](docs/LookmlModelExplore.md)
 - [LookmlModelExploreAccessFilter](docs/LookmlModelExploreAccessFilter.md)
 - [LookmlModelExploreAlias](docs/LookmlModelExploreAlias.md)
 - [LookmlModelExploreAlwaysFilter](docs/LookmlModelExploreAlwaysFilter.md)
 - [LookmlModelExploreConditionallyFilter](docs/LookmlModelExploreConditionallyFilter.md)
 - [LookmlModelExploreError](docs/LookmlModelExploreError.md)
 - [LookmlModelExploreField](docs/LookmlModelExploreField.md)
 - [LookmlModelExploreFieldEnumeration](docs/LookmlModelExploreFieldEnumeration.md)
 - [LookmlModelExploreFieldMapLayer](docs/LookmlModelExploreFieldMapLayer.md)
 - [LookmlModelExploreFieldSqlCase](docs/LookmlModelExploreFieldSqlCase.md)
 - [LookmlModelExploreFieldTimeInterval](docs/LookmlModelExploreFieldTimeInterval.md)
 - [LookmlModelExploreFieldset](docs/LookmlModelExploreFieldset.md)
 - [LookmlModelExploreJoins](docs/LookmlModelExploreJoins.md)
 - [LookmlModelExploreSet](docs/LookmlModelExploreSet.md)
 - [LookmlModelExploreSupportedMeasureType](docs/LookmlModelExploreSupportedMeasureType.md)
 - [LookmlModelNavExplore](docs/LookmlModelNavExplore.md)
 - [ModelSet](docs/ModelSet.md)
 - [ModelsNotValidated](docs/ModelsNotValidated.md)
 - [OIDCConfig](docs/OIDCConfig.md)
 - [OIDCGroupRead](docs/OIDCGroupRead.md)
 - [OIDCGroupWrite](docs/OIDCGroupWrite.md)
 - [OIDCUserAttributeRead](docs/OIDCUserAttributeRead.md)
 - [OIDCUserAttributeWrite](docs/OIDCUserAttributeWrite.md)
 - [Permission](docs/Permission.md)
 - [PermissionSet](docs/PermissionSet.md)
 - [Prefetch](docs/Prefetch.md)
 - [PrefetchAccessFilterValue](docs/PrefetchAccessFilterValue.md)
 - [PrefetchDashboardFilterValue](docs/PrefetchDashboardFilterValue.md)
 - [PrefetchDashboardRequest](docs/PrefetchDashboardRequest.md)
 - [Project](docs/Project.md)
 - [ProjectError](docs/ProjectError.md)
 - [ProjectFile](docs/ProjectFile.md)
 - [ProjectValidation](docs/ProjectValidation.md)
 - [ProjectValidationCache](docs/ProjectValidationCache.md)
 - [ProjectWorkspace](docs/ProjectWorkspace.md)
 - [Query](docs/Query.md)
 - [QueryTask](docs/QueryTask.md)
 - [RenderTask](docs/RenderTask.md)
 - [ResultMakerFilterables](docs/ResultMakerFilterables.md)
 - [ResultMakerFilterablesListen](docs/ResultMakerFilterablesListen.md)
 - [ResultMakerWithIdVisConfigAndDynamicFields](docs/ResultMakerWithIdVisConfigAndDynamicFields.md)
 - [Role](docs/Role.md)
 - [RunningQueries](docs/RunningQueries.md)
 - [SamlConfig](docs/SamlConfig.md)
 - [SamlGroupRead](docs/SamlGroupRead.md)
 - [SamlGroupWrite](docs/SamlGroupWrite.md)
 - [SamlMetadataParseResult](docs/SamlMetadataParseResult.md)
 - [SamlUserAttributeRead](docs/SamlUserAttributeRead.md)
 - [SamlUserAttributeWrite](docs/SamlUserAttributeWrite.md)
 - [ScheduledPlan](docs/ScheduledPlan.md)
 - [ScheduledPlanDestination](docs/ScheduledPlanDestination.md)
 - [Session](docs/Session.md)
 - [Snippet](docs/Snippet.md)
 - [Space](docs/Space.md)
 - [SpaceBase](docs/SpaceBase.md)
 - [SqlQuery](docs/SqlQuery.md)
 - [SqlQueryCreate](docs/SqlQueryCreate.md)
 - [Timezone](docs/Timezone.md)
 - [User](docs/User.md)
 - [UserAttribute](docs/UserAttribute.md)
 - [UserAttributeGroupValue](docs/UserAttributeGroupValue.md)
 - [UserAttributeWithValue](docs/UserAttributeWithValue.md)
 - [UserIdOnly](docs/UserIdOnly.md)
 - [UserPublic](docs/UserPublic.md)
 - [ValidationError](docs/ValidationError.md)
 - [ValidationErrorDetail](docs/ValidationErrorDetail.md)
 - [WhitelabelConfiguration](docs/WhitelabelConfiguration.md)
 - [Workspace](docs/Workspace.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@looker.com
