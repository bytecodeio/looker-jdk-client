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
import com.looker.client.api.ProjectApi;
import com.looker.client.model.Error;
import com.looker.client.model.GitBranch;
import com.looker.client.model.GitConnectionTest;
import com.looker.client.model.GitConnectionTestResult;
import com.looker.client.model.Project;
import com.looker.client.model.ProjectFile;
import com.looker.client.model.ProjectValidation;
import com.looker.client.model.ProjectValidationCache;
import com.looker.client.model.ProjectWorkspace;
import com.looker.client.model.ValidationError;

import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectApi
 */
@Ignore
public class ProjectApiTest {

    private final ProjectApi api = new ProjectApi();

    /**
     * Get All Git Branches
     *
     * ### Get All Git Branches  Returns a list of git branches in the project repository 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allGitBranchesTest() throws ApiException {
        String projectId = null;
        List<GitBranch> response = api.allGitBranches(projectId);

        // TODO: test validations
    }
    /**
     * Get All Git Connection Tests
     *
     * ### Get All Git Connection Tests  Returns a list of tests which can be run against a project&#x27;s git connection. Call [Run Git Connection Test](#!/Project/run_git_connection_test) to execute each test in sequence.  Tests are ordered by increasing specificity. Tests should be run in the order returned because later tests require functionality tested by tests earlier in the test list.  For example, a late-stage test for write access is meaningless if connecting to the git server (an early test) is failing. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allGitConnectionTestsTest() throws ApiException {
        String projectId = null;
        List<GitConnectionTest> response = api.allGitConnectionTests(projectId);

        // TODO: test validations
    }
    /**
     * Get All Project Files
     *
     * ### Get All Project Files  Returns a list of the files in the project 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allProjectFilesTest() throws ApiException {
        String projectId = null;
        String fields = null;
        List<ProjectFile> response = api.allProjectFiles(projectId, fields);

        // TODO: test validations
    }
    /**
     * Get All Projects
     *
     * ### Get All Projects  Returns all projects visible to the current user 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void allProjectsTest() throws ApiException {
        String fields = null;
        List<Project> response = api.allProjects(fields);

        // TODO: test validations
    }
    /**
     * Checkout New Git Branch
     *
     * ### Create and Checkout a Git Branch  Creates and checks out a new branch in the given project repository Only allowed in development mode   - Call &#x60;update_session&#x60; to select the &#x27;dev&#x27; workspace.  Optionally specify a branch name, tag name or commit SHA as the start point in the ref field.   If no ref is specified, HEAD of the current branch will be used as the start point for the new branch.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGitBranchTest() throws ApiException {
        String projectId = null;
        GitBranch body = null;
        GitBranch response = api.createGitBranch(projectId, body);

        // TODO: test validations
    }
    /**
     * Create Deploy Key
     *
     * ### Create Git Deploy Key  Create a public/private key pair for authenticating ssh git requests from Looker to a remote git repository for a particular Looker project.  Returns the public key of the generated ssh key pair.  Copy this public key to your remote git repository&#x27;s ssh keys configuration so that the remote git service can validate and accept git requests from the Looker server. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGitDeployKeyTest() throws ApiException {
        String projectId = null;
        String response = api.createGitDeployKey(projectId);

        // TODO: test validations
    }
    /**
     * Create Project
     *
     * ### Create A Project  dev mode required. - Call &#x60;update_session&#x60; to select the &#x27;dev&#x27; workspace.  &#x60;name&#x60; is required. &#x60;git_remote_url&#x60; is not allowed. To configure Git for the newly created project, follow the instructions in &#x60;update_project&#x60;.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProjectTest() throws ApiException {
        Project body = null;
        Project response = api.createProject(body);

        // TODO: test validations
    }
    /**
     * Delete a Git Branch
     *
     * ### Delete the specified Git Branch  Delete git branch specified in branch_name path param from local and remote of specified project repository 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGitBranchTest() throws ApiException {
        String projectId = null;
        String branchName = null;
        String response = api.deleteGitBranch(projectId, branchName);

        // TODO: test validations
    }
    /**
     * Deploy To Production
     *
     * ### Deploy LookML from this Development Mode Project to Production  Git must have been configured, must be in dev mode and deploy permission required  Deploy is a two / three step process 1. Push commits in current branch of dev mode project to the production branch (origin/master).    Note a. This step is skipped in read-only projects.    Note b. If this step is unsuccessful for any reason (e.g. rejected non-fastforward because production branch has              commits not in current branch), subsequent steps will be skipped. 2. If this is the first deploy of this project, create the production project with git repository. 3. Pull the production branch into the production project.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deployToProductionTest() throws ApiException {
        String projectId = null;
        String response = api.deployToProduction(projectId);

        // TODO: test validations
    }
    /**
     * Find a Git Branch
     *
     * ### Get the specified Git Branch  Returns the git branch specified in branch_name path param if it exists in the given project repository 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findGitBranchTest() throws ApiException {
        String projectId = null;
        String branchName = null;
        GitBranch response = api.findGitBranch(projectId, branchName);

        // TODO: test validations
    }
    /**
     * Get Active Git Branch
     *
     * ### Get the Current Git Branch  Returns the git branch currently checked out in the given project repository 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void gitBranchTest() throws ApiException {
        String projectId = null;
        GitBranch response = api.gitBranch(projectId);

        // TODO: test validations
    }
    /**
     * Git Deploy Key
     *
     * ### Git Deploy Key  Returns the ssh public key previously created for a project&#x27;s git repository. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void gitDeployKeyTest() throws ApiException {
        String projectId = null;
        String response = api.gitDeployKey(projectId);

        // TODO: test validations
    }
    /**
     * Get Project
     *
     * ### Get A Project  Returns the project with the given project id 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectTest() throws ApiException {
        String projectId = null;
        String fields = null;
        Project response = api.project(projectId, fields);

        // TODO: test validations
    }
    /**
     * Get Project File
     *
     * ### Get Project File Info  Returns information about a file in the project 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectFileTest() throws ApiException {
        String projectId = null;
        String fileId = null;
        String fields = null;
        ProjectFile response = api.projectFile(projectId, fileId, fields);

        // TODO: test validations
    }
    /**
     * Cached Project Validation Results
     *
     * ### Get Cached Project Validation Results  Returns the cached results of a previous project validation calculation, if any. Returns http status 204 No Content if no validation results exist.  Validating the content of all the files in a project can be computationally intensive for large projects. Use this API to simply fetch the results of the most recent project validation rather than revalidating the entire project from scratch.  A value of &#x60;\&quot;stale\&quot;: true&#x60; in the response indicates that the project has changed since the cached validation results were computed. The cached validation results may no longer reflect the current state of the project. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectValidationResultsTest() throws ApiException {
        String projectId = null;
        String fields = null;
        ProjectValidationCache response = api.projectValidationResults(projectId, fields);

        // TODO: test validations
    }
    /**
     * Get Project Workspace
     *
     * ### Get Project Workspace  Returns information about the state of the project files in the currently selected workspace 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectWorkspaceTest() throws ApiException {
        String projectId = null;
        String fields = null;
        ProjectWorkspace response = api.projectWorkspace(projectId, fields);

        // TODO: test validations
    }
    /**
     * Reset To Production
     *
     * ### Reset a project to the revision of the project that is in production.  **DANGER** this will delete any changes that have not been pushed to a remote repository. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetProjectToProductionTest() throws ApiException {
        String projectId = null;
        String response = api.resetProjectToProduction(projectId);

        // TODO: test validations
    }
    /**
     * Reset To Remote
     *
     * ### Reset a project development branch to the revision of the project that is on the remote.  **DANGER** this will delete any changes that have not been pushed to a remote repository. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetProjectToRemoteTest() throws ApiException {
        String projectId = null;
        String response = api.resetProjectToRemote(projectId);

        // TODO: test validations
    }
    /**
     * Run Git Connection Test
     *
     * ### Run a git connection test  Run the named test on the git service used by this project and return the result. This is intended to help debug git connections when things do not work properly, to give more helpful information about why a git url is not working with Looker.  Tests should be run in the order they are returned by [Get All Git Connection Tests](#!/Project/all_git_connection_tests). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void runGitConnectionTestTest() throws ApiException {
        String projectId = null;
        String testId = null;
        GitConnectionTestResult response = api.runGitConnectionTest(projectId, testId);

        // TODO: test validations
    }
    /**
     * Update Project Git Branch
     *
     * ### Checkout and/or reset --hard an existing Git Branch  Only allowed in development mode   - Call &#x60;update_session&#x60; to select the &#x27;dev&#x27; workspace.  Checkout an existing branch if name field is different from the name of the currently checked out branch.  Optionally specify a branch name, tag name or commit SHA to which the branch should be reset.   **DANGER** hard reset will be force pushed to the remote. Unsaved changes and commits may be permanently lost.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGitBranchTest() throws ApiException {
        GitBranch body = null;
        String projectId = null;
        GitBranch response = api.updateGitBranch(body, projectId);

        // TODO: test validations
    }
    /**
     * Update Project
     *
     * ### Update Project Configuration  Apply changes to a project&#x27;s configuration.   #### Configuring Git for a Project  To set up a Looker project with a remote git repository, follow these steps:  1. Call &#x60;update_session&#x60; to select the &#x27;dev&#x27; workspace. 1. Call &#x60;create_git_deploy_key&#x60; to create a new deploy key for the project 1. Copy the deploy key text into the remote git repository&#x27;s ssh key configuration 1. Call &#x60;update_project&#x60; to set project&#x27;s &#x60;git_remote_url&#x60; ()and &#x60;git_service_name&#x60;, if necessary).  When you modify a project&#x27;s &#x60;git_remote_url&#x60;, Looker connects to the remote repository to fetch metadata. The remote git repository MUST be configured with the Looker-generated deploy key for this project prior to setting the project&#x27;s &#x60;git_remote_url&#x60;.  To set up a Looker project with a git repository residing on the Looker server (a &#x27;bare&#x27; git repo): 1. Call &#x60;update_session&#x60; to select the &#x27;dev&#x27; workspace. 1. Call &#x60;update_project&#x60; setting &#x60;git_remote_url&#x60; to nil and &#x60;git_service_name&#x60; to \&quot;bare\&quot;.  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProjectTest() throws ApiException {
        Project body = null;
        String projectId = null;
        String fields = null;
        Project response = api.updateProject(body, projectId, fields);

        // TODO: test validations
    }
    /**
     * Validate Project
     *
     * ### Validate Project  Performs lint validation of all lookml files in the project. Returns a list of errors found, if any.  Validating the content of all the files in a project can be computationally intensive for large projects. For best performance, call &#x60;validate_project(project_id)&#x60; only when you really want to recompute project validation. To quickly display the results of the most recent project validation (without recomputing), use &#x60;project_validation_results(project_id)&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateProjectTest() throws ApiException {
        String projectId = null;
        String fields = null;
        ProjectValidation response = api.validateProject(projectId, fields);

        // TODO: test validations
    }
}
