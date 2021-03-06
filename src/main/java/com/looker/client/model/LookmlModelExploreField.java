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
import com.looker.client.model.LookmlModelExploreFieldEnumeration;
import com.looker.client.model.LookmlModelExploreFieldMapLayer;
import com.looker.client.model.LookmlModelExploreFieldSqlCase;
import com.looker.client.model.LookmlModelExploreFieldTimeInterval;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LookmlModelExploreField
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-15T12:39:13.185-08:00[America/Los_Angeles]")public class LookmlModelExploreField {

  @SerializedName("align")
  private String align = null;

  @SerializedName("can_filter")
  private Boolean canFilter = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("default_filter_value")
  private String defaultFilterValue = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("enumerations")
  private List<LookmlModelExploreFieldEnumeration> enumerations = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("field_group_label")
  private String fieldGroupLabel = null;

  @SerializedName("field_group_variant")
  private String fieldGroupVariant = null;

  @SerializedName("fill_style")
  private String fillStyle = null;

  @SerializedName("fiscal_month_offset")
  private Long fiscalMonthOffset = null;

  @SerializedName("has_allowed_values")
  private Boolean hasAllowedValues = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("is_filter")
  private Boolean isFilter = null;

  @SerializedName("is_fiscal")
  private Boolean isFiscal = null;

  @SerializedName("is_numeric")
  private Boolean isNumeric = null;

  @SerializedName("is_timeframe")
  private Boolean isTimeframe = null;

  @SerializedName("can_time_filter")
  private Boolean canTimeFilter = null;

  @SerializedName("time_interval")
  private LookmlModelExploreFieldTimeInterval timeInterval = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("label_from_parameter")
  private String labelFromParameter = null;

  @SerializedName("label_short")
  private String labelShort = null;

  @SerializedName("lookml_link")
  private String lookmlLink = null;

  @SerializedName("map_layer")
  private LookmlModelExploreFieldMapLayer mapLayer = null;

  @SerializedName("measure")
  private Boolean measure = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parameter")
  private Boolean parameter = null;

  @SerializedName("permanent")
  private Boolean permanent = null;

  @SerializedName("primary_key")
  private Boolean primaryKey = null;

  @SerializedName("project_name")
  private String projectName = null;

  @SerializedName("requires_refresh_on_sort")
  private Boolean requiresRefreshOnSort = null;

  @SerializedName("scope")
  private String scope = null;

  @SerializedName("sortable")
  private Boolean sortable = null;

  @SerializedName("source_file")
  private String sourceFile = null;

  @SerializedName("source_file_path")
  private String sourceFilePath = null;

  @SerializedName("sql")
  private String sql = null;

  @SerializedName("sql_case")
  private List<LookmlModelExploreFieldSqlCase> sqlCase = null;

  @SerializedName("suggest_dimension")
  private String suggestDimension = null;

  @SerializedName("suggest_explore")
  private String suggestExplore = null;

  @SerializedName("suggestable")
  private Boolean suggestable = null;

  @SerializedName("suggestions")
  private List<String> suggestions = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("user_attribute_filter_types")
  private List<String> userAttributeFilterTypes = null;

  @SerializedName("value_format")
  private String valueFormat = null;

  @SerializedName("view")
  private String view = null;

  @SerializedName("view_label")
  private String viewLabel = null;

  @SerializedName("dynamic")
  private Boolean dynamic = null;

  @SerializedName("week_start_day")
  private String weekStartDay = null;
  /**
  * The appropriate horizontal text alignment the values of this field shoud be displayed in. Valid values are: \&quot;left\&quot;, \&quot;right\&quot;.
  * @return align
  **/
  @Schema(description = "The appropriate horizontal text alignment the values of this field shoud be displayed in. Valid values are: \"left\", \"right\".")
  public String getAlign() {
    return align;
  }
  /**
  * Whether it&#x27;s possible to filter on this field.
  * @return canFilter
  **/
  @Schema(description = "Whether it's possible to filter on this field.")
  public Boolean isCanFilter() {
    return canFilter;
  }
  /**
  * Field category Valid values are: \&quot;parameter\&quot;, \&quot;filter\&quot;, \&quot;measure\&quot;, \&quot;dimension\&quot;.
  * @return category
  **/
  @Schema(description = "Field category Valid values are: \"parameter\", \"filter\", \"measure\", \"dimension\".")
  public String getCategory() {
    return category;
  }
  /**
  * The default value that this field uses when filtering. Null if there is no default value.
  * @return defaultFilterValue
  **/
  @Schema(description = "The default value that this field uses when filtering. Null if there is no default value.")
  public String getDefaultFilterValue() {
    return defaultFilterValue;
  }
  /**
  * Description
  * @return description
  **/
  @Schema(description = "Description")
  public String getDescription() {
    return description;
  }
  /**
  * An array enumerating all the possible values that this field can contain. When null, there is no limit to the set of possible values this field can contain.
  * @return enumerations
  **/
  @Schema(description = "An array enumerating all the possible values that this field can contain. When null, there is no limit to the set of possible values this field can contain.")
  public List<LookmlModelExploreFieldEnumeration> getEnumerations() {
    return enumerations;
  }
  /**
  * An error message indicating a problem with the definition of this field. If there are no errors, this will be null.
  * @return error
  **/
  @Schema(description = "An error message indicating a problem with the definition of this field. If there are no errors, this will be null.")
  public String getError() {
    return error;
  }
  /**
  * A label creating a grouping of fields. All fields with this label should be presented together when displayed in a UI.
  * @return fieldGroupLabel
  **/
  @Schema(description = "A label creating a grouping of fields. All fields with this label should be presented together when displayed in a UI.")
  public String getFieldGroupLabel() {
    return fieldGroupLabel;
  }
  /**
  * When presented in a field group via field_group_label, a shorter name of the field to be displayed in that context.
  * @return fieldGroupVariant
  **/
  @Schema(description = "When presented in a field group via field_group_label, a shorter name of the field to be displayed in that context.")
  public String getFieldGroupVariant() {
    return fieldGroupVariant;
  }
  /**
  * The style of dimension fill that is possible for this field. Null if no dimension fill is possible. Valid values are: \&quot;enumeration\&quot;, \&quot;range\&quot;.
  * @return fillStyle
  **/
  @Schema(description = "The style of dimension fill that is possible for this field. Null if no dimension fill is possible. Valid values are: \"enumeration\", \"range\".")
  public String getFillStyle() {
    return fillStyle;
  }
  /**
  * An offset (in months) from the calendar start month to the fiscal start month defined in the LookML model this field belongs to.
  * @return fiscalMonthOffset
  **/
  @Schema(description = "An offset (in months) from the calendar start month to the fiscal start month defined in the LookML model this field belongs to.")
  public Long getFiscalMonthOffset() {
    return fiscalMonthOffset;
  }
  /**
  * Whether this field has a set of allowed_values specified in LookML.
  * @return hasAllowedValues
  **/
  @Schema(description = "Whether this field has a set of allowed_values specified in LookML.")
  public Boolean isHasAllowedValues() {
    return hasAllowedValues;
  }
  /**
  * Whether this field should be hidden from the user interface.
  * @return hidden
  **/
  @Schema(description = "Whether this field should be hidden from the user interface.")
  public Boolean isHidden() {
    return hidden;
  }
  /**
  * Whether this field is a filter.
  * @return isFilter
  **/
  @Schema(description = "Whether this field is a filter.")
  public Boolean isIsFilter() {
    return isFilter;
  }
  /**
  * Whether this field represents a fiscal time value.
  * @return isFiscal
  **/
  @Schema(description = "Whether this field represents a fiscal time value.")
  public Boolean isIsFiscal() {
    return isFiscal;
  }
  /**
  * Whether this field is of a type that represents a numeric value.
  * @return isNumeric
  **/
  @Schema(description = "Whether this field is of a type that represents a numeric value.")
  public Boolean isIsNumeric() {
    return isNumeric;
  }
  /**
  * Whether this field is of a type that represents a time value.
  * @return isTimeframe
  **/
  @Schema(description = "Whether this field is of a type that represents a time value.")
  public Boolean isIsTimeframe() {
    return isTimeframe;
  }
  /**
  * Whether this field can be time filtered.
  * @return canTimeFilter
  **/
  @Schema(description = "Whether this field can be time filtered.")
  public Boolean isCanTimeFilter() {
    return canTimeFilter;
  }
  public LookmlModelExploreField timeInterval(LookmlModelExploreFieldTimeInterval timeInterval) {
    this.timeInterval = timeInterval;
    return this;
  }

  

  /**
  * Get timeInterval
  * @return timeInterval
  **/
  @Schema(description = "")
  public LookmlModelExploreFieldTimeInterval getTimeInterval() {
    return timeInterval;
  }
  public void setTimeInterval(LookmlModelExploreFieldTimeInterval timeInterval) {
    this.timeInterval = timeInterval;
  }
  /**
  * Fully-qualified human-readable label of the field.
  * @return label
  **/
  @Schema(description = "Fully-qualified human-readable label of the field.")
  public String getLabel() {
    return label;
  }
  /**
  * The name of the parameter that will provide a parameterized label for this field, if available in the current context.
  * @return labelFromParameter
  **/
  @Schema(description = "The name of the parameter that will provide a parameterized label for this field, if available in the current context.")
  public String getLabelFromParameter() {
    return labelFromParameter;
  }
  /**
  * The human-readable label of the field, without the view label.
  * @return labelShort
  **/
  @Schema(description = "The human-readable label of the field, without the view label.")
  public String getLabelShort() {
    return labelShort;
  }
  /**
  * A URL linking to the definition of this field in the LookML IDE.
  * @return lookmlLink
  **/
  @Schema(description = "A URL linking to the definition of this field in the LookML IDE.")
  public String getLookmlLink() {
    return lookmlLink;
  }
  public LookmlModelExploreField mapLayer(LookmlModelExploreFieldMapLayer mapLayer) {
    this.mapLayer = mapLayer;
    return this;
  }

  

  /**
  * Get mapLayer
  * @return mapLayer
  **/
  @Schema(description = "")
  public LookmlModelExploreFieldMapLayer getMapLayer() {
    return mapLayer;
  }
  public void setMapLayer(LookmlModelExploreFieldMapLayer mapLayer) {
    this.mapLayer = mapLayer;
  }
  /**
  * Whether this field is a measure.
  * @return measure
  **/
  @Schema(description = "Whether this field is a measure.")
  public Boolean isMeasure() {
    return measure;
  }
  /**
  * Fully-qualified name of the field.
  * @return name
  **/
  @Schema(description = "Fully-qualified name of the field.")
  public String getName() {
    return name;
  }
  /**
  * Whether this field is a parameter.
  * @return parameter
  **/
  @Schema(description = "Whether this field is a parameter.")
  public Boolean isParameter() {
    return parameter;
  }
  /**
  * Whether this field can be removed from a query.
  * @return permanent
  **/
  @Schema(description = "Whether this field can be removed from a query.")
  public Boolean isPermanent() {
    return permanent;
  }
  /**
  * Whether or not the field represents a primary key.
  * @return primaryKey
  **/
  @Schema(description = "Whether or not the field represents a primary key.")
  public Boolean isPrimaryKey() {
    return primaryKey;
  }
  /**
  * The name of the project this field is defined in.
  * @return projectName
  **/
  @Schema(description = "The name of the project this field is defined in.")
  public String getProjectName() {
    return projectName;
  }
  /**
  * When true, it&#x27;s not possible to re-sort this field&#x27;s values without re-running the SQL query, due to database logic that affects the sort.
  * @return requiresRefreshOnSort
  **/
  @Schema(description = "When true, it's not possible to re-sort this field's values without re-running the SQL query, due to database logic that affects the sort.")
  public Boolean isRequiresRefreshOnSort() {
    return requiresRefreshOnSort;
  }
  /**
  * The LookML scope this field belongs to. The scope is typically the field&#x27;s view.
  * @return scope
  **/
  @Schema(description = "The LookML scope this field belongs to. The scope is typically the field's view.")
  public String getScope() {
    return scope;
  }
  /**
  * Whether this field can be sorted.
  * @return sortable
  **/
  @Schema(description = "Whether this field can be sorted.")
  public Boolean isSortable() {
    return sortable;
  }
  /**
  * The path portion of source_file_path.
  * @return sourceFile
  **/
  @Schema(description = "The path portion of source_file_path.")
  public String getSourceFile() {
    return sourceFile;
  }
  /**
  * The fully-qualified path of the project file this field is defined in.
  * @return sourceFilePath
  **/
  @Schema(description = "The fully-qualified path of the project file this field is defined in.")
  public String getSourceFilePath() {
    return sourceFilePath;
  }
  /**
  * SQL expression as defined in the LookML model. The SQL syntax shown here is a representation intended for auditability, and is not neccessarily an exact match for what will ultimately be run in the database. It may contain special LookML syntax or annotations that are not valid SQL. This will be null if the current user does not have the see_lookml permission for the field&#x27;s model.
  * @return sql
  **/
  @Schema(description = "SQL expression as defined in the LookML model. The SQL syntax shown here is a representation intended for auditability, and is not neccessarily an exact match for what will ultimately be run in the database. It may contain special LookML syntax or annotations that are not valid SQL. This will be null if the current user does not have the see_lookml permission for the field's model.")
  public String getSql() {
    return sql;
  }
  /**
  * An array of conditions and values that make up a SQL Case expression, as defined in the LookML model. The SQL syntax shown here is a representation intended for auditability, and is not neccessarily an exact match for what will ultimately be run in the database. It may contain special LookML syntax or annotations that are not valid SQL. This will be null if the current user does not have the see_lookml permission for the field&#x27;s model.
  * @return sqlCase
  **/
  @Schema(description = "An array of conditions and values that make up a SQL Case expression, as defined in the LookML model. The SQL syntax shown here is a representation intended for auditability, and is not neccessarily an exact match for what will ultimately be run in the database. It may contain special LookML syntax or annotations that are not valid SQL. This will be null if the current user does not have the see_lookml permission for the field's model.")
  public List<LookmlModelExploreFieldSqlCase> getSqlCase() {
    return sqlCase;
  }
  /**
  * The name of the dimension to base suggest queries from.
  * @return suggestDimension
  **/
  @Schema(description = "The name of the dimension to base suggest queries from.")
  public String getSuggestDimension() {
    return suggestDimension;
  }
  /**
  * The name of the explore to base suggest queries from.
  * @return suggestExplore
  **/
  @Schema(description = "The name of the explore to base suggest queries from.")
  public String getSuggestExplore() {
    return suggestExplore;
  }
  /**
  * Whether or not suggestions are possible for this field.
  * @return suggestable
  **/
  @Schema(description = "Whether or not suggestions are possible for this field.")
  public Boolean isSuggestable() {
    return suggestable;
  }
  /**
  * If available, a list of suggestions for this field. For most fields, a suggest query is a more appropriate way to get an up-to-date list of suggestions. Or use enumerations to list all the possible values.
  * @return suggestions
  **/
  @Schema(description = "If available, a list of suggestions for this field. For most fields, a suggest query is a more appropriate way to get an up-to-date list of suggestions. Or use enumerations to list all the possible values.")
  public List<String> getSuggestions() {
    return suggestions;
  }
  /**
  * An array of arbitrary string tags provided in the model for this field.
  * @return tags
  **/
  @Schema(description = "An array of arbitrary string tags provided in the model for this field.")
  public List<String> getTags() {
    return tags;
  }
  /**
  * The LookML type of the field.
  * @return type
  **/
  @Schema(description = "The LookML type of the field.")
  public String getType() {
    return type;
  }
  /**
  * An array of user attribute types that are allowed to be used in filters on this field. Valid values are: \&quot;advanced_filter_string\&quot;, \&quot;advanced_filter_number\&quot;, \&quot;advanced_filter_datetime\&quot;, \&quot;string\&quot;, \&quot;number\&quot;, \&quot;datetime\&quot;, \&quot;yesno\&quot;, \&quot;zipcode\&quot;.
  * @return userAttributeFilterTypes
  **/
  @Schema(description = "An array of user attribute types that are allowed to be used in filters on this field. Valid values are: \"advanced_filter_string\", \"advanced_filter_number\", \"advanced_filter_datetime\", \"string\", \"number\", \"datetime\", \"yesno\", \"zipcode\".")
  public List<String> getUserAttributeFilterTypes() {
    return userAttributeFilterTypes;
  }
  /**
  * If specified, the LookML value format string for formatting values of this field.
  * @return valueFormat
  **/
  @Schema(description = "If specified, the LookML value format string for formatting values of this field.")
  public String getValueFormat() {
    return valueFormat;
  }
  /**
  * The name of the view this field belongs to.
  * @return view
  **/
  @Schema(description = "The name of the view this field belongs to.")
  public String getView() {
    return view;
  }
  /**
  * The human-readable label of the view the field belongs to.
  * @return viewLabel
  **/
  @Schema(description = "The human-readable label of the view the field belongs to.")
  public String getViewLabel() {
    return viewLabel;
  }
  /**
  * Whether this field was specified in \&quot;dynamic_fields\&quot; and is not part of the model.
  * @return dynamic
  **/
  @Schema(description = "Whether this field was specified in \"dynamic_fields\" and is not part of the model.")
  public Boolean isDynamic() {
    return dynamic;
  }
  /**
  * The name of the starting day of the week. Valid values are: \&quot;monday\&quot;, \&quot;tuesday\&quot;, \&quot;wednesday\&quot;, \&quot;thursday\&quot;, \&quot;friday\&quot;, \&quot;saturday\&quot;, \&quot;sunday\&quot;.
  * @return weekStartDay
  **/
  @Schema(description = "The name of the starting day of the week. Valid values are: \"monday\", \"tuesday\", \"wednesday\", \"thursday\", \"friday\", \"saturday\", \"sunday\".")
  public String getWeekStartDay() {
    return weekStartDay;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookmlModelExploreField lookmlModelExploreField = (LookmlModelExploreField) o;
    return Objects.equals(this.align, lookmlModelExploreField.align) &&
        Objects.equals(this.canFilter, lookmlModelExploreField.canFilter) &&
        Objects.equals(this.category, lookmlModelExploreField.category) &&
        Objects.equals(this.defaultFilterValue, lookmlModelExploreField.defaultFilterValue) &&
        Objects.equals(this.description, lookmlModelExploreField.description) &&
        Objects.equals(this.enumerations, lookmlModelExploreField.enumerations) &&
        Objects.equals(this.error, lookmlModelExploreField.error) &&
        Objects.equals(this.fieldGroupLabel, lookmlModelExploreField.fieldGroupLabel) &&
        Objects.equals(this.fieldGroupVariant, lookmlModelExploreField.fieldGroupVariant) &&
        Objects.equals(this.fillStyle, lookmlModelExploreField.fillStyle) &&
        Objects.equals(this.fiscalMonthOffset, lookmlModelExploreField.fiscalMonthOffset) &&
        Objects.equals(this.hasAllowedValues, lookmlModelExploreField.hasAllowedValues) &&
        Objects.equals(this.hidden, lookmlModelExploreField.hidden) &&
        Objects.equals(this.isFilter, lookmlModelExploreField.isFilter) &&
        Objects.equals(this.isFiscal, lookmlModelExploreField.isFiscal) &&
        Objects.equals(this.isNumeric, lookmlModelExploreField.isNumeric) &&
        Objects.equals(this.isTimeframe, lookmlModelExploreField.isTimeframe) &&
        Objects.equals(this.canTimeFilter, lookmlModelExploreField.canTimeFilter) &&
        Objects.equals(this.timeInterval, lookmlModelExploreField.timeInterval) &&
        Objects.equals(this.label, lookmlModelExploreField.label) &&
        Objects.equals(this.labelFromParameter, lookmlModelExploreField.labelFromParameter) &&
        Objects.equals(this.labelShort, lookmlModelExploreField.labelShort) &&
        Objects.equals(this.lookmlLink, lookmlModelExploreField.lookmlLink) &&
        Objects.equals(this.mapLayer, lookmlModelExploreField.mapLayer) &&
        Objects.equals(this.measure, lookmlModelExploreField.measure) &&
        Objects.equals(this.name, lookmlModelExploreField.name) &&
        Objects.equals(this.parameter, lookmlModelExploreField.parameter) &&
        Objects.equals(this.permanent, lookmlModelExploreField.permanent) &&
        Objects.equals(this.primaryKey, lookmlModelExploreField.primaryKey) &&
        Objects.equals(this.projectName, lookmlModelExploreField.projectName) &&
        Objects.equals(this.requiresRefreshOnSort, lookmlModelExploreField.requiresRefreshOnSort) &&
        Objects.equals(this.scope, lookmlModelExploreField.scope) &&
        Objects.equals(this.sortable, lookmlModelExploreField.sortable) &&
        Objects.equals(this.sourceFile, lookmlModelExploreField.sourceFile) &&
        Objects.equals(this.sourceFilePath, lookmlModelExploreField.sourceFilePath) &&
        Objects.equals(this.sql, lookmlModelExploreField.sql) &&
        Objects.equals(this.sqlCase, lookmlModelExploreField.sqlCase) &&
        Objects.equals(this.suggestDimension, lookmlModelExploreField.suggestDimension) &&
        Objects.equals(this.suggestExplore, lookmlModelExploreField.suggestExplore) &&
        Objects.equals(this.suggestable, lookmlModelExploreField.suggestable) &&
        Objects.equals(this.suggestions, lookmlModelExploreField.suggestions) &&
        Objects.equals(this.tags, lookmlModelExploreField.tags) &&
        Objects.equals(this.type, lookmlModelExploreField.type) &&
        Objects.equals(this.userAttributeFilterTypes, lookmlModelExploreField.userAttributeFilterTypes) &&
        Objects.equals(this.valueFormat, lookmlModelExploreField.valueFormat) &&
        Objects.equals(this.view, lookmlModelExploreField.view) &&
        Objects.equals(this.viewLabel, lookmlModelExploreField.viewLabel) &&
        Objects.equals(this.dynamic, lookmlModelExploreField.dynamic) &&
        Objects.equals(this.weekStartDay, lookmlModelExploreField.weekStartDay);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(align, canFilter, category, defaultFilterValue, description, enumerations, error, fieldGroupLabel, fieldGroupVariant, fillStyle, fiscalMonthOffset, hasAllowedValues, hidden, isFilter, isFiscal, isNumeric, isTimeframe, canTimeFilter, timeInterval, label, labelFromParameter, labelShort, lookmlLink, mapLayer, measure, name, parameter, permanent, primaryKey, projectName, requiresRefreshOnSort, scope, sortable, sourceFile, sourceFilePath, sql, sqlCase, suggestDimension, suggestExplore, suggestable, suggestions, tags, type, userAttributeFilterTypes, valueFormat, view, viewLabel, dynamic, weekStartDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookmlModelExploreField {\n");
    
    sb.append("    align: ").append(toIndentedString(align)).append("\n");
    sb.append("    canFilter: ").append(toIndentedString(canFilter)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    defaultFilterValue: ").append(toIndentedString(defaultFilterValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enumerations: ").append(toIndentedString(enumerations)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    fieldGroupLabel: ").append(toIndentedString(fieldGroupLabel)).append("\n");
    sb.append("    fieldGroupVariant: ").append(toIndentedString(fieldGroupVariant)).append("\n");
    sb.append("    fillStyle: ").append(toIndentedString(fillStyle)).append("\n");
    sb.append("    fiscalMonthOffset: ").append(toIndentedString(fiscalMonthOffset)).append("\n");
    sb.append("    hasAllowedValues: ").append(toIndentedString(hasAllowedValues)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    isFilter: ").append(toIndentedString(isFilter)).append("\n");
    sb.append("    isFiscal: ").append(toIndentedString(isFiscal)).append("\n");
    sb.append("    isNumeric: ").append(toIndentedString(isNumeric)).append("\n");
    sb.append("    isTimeframe: ").append(toIndentedString(isTimeframe)).append("\n");
    sb.append("    canTimeFilter: ").append(toIndentedString(canTimeFilter)).append("\n");
    sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    labelFromParameter: ").append(toIndentedString(labelFromParameter)).append("\n");
    sb.append("    labelShort: ").append(toIndentedString(labelShort)).append("\n");
    sb.append("    lookmlLink: ").append(toIndentedString(lookmlLink)).append("\n");
    sb.append("    mapLayer: ").append(toIndentedString(mapLayer)).append("\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    permanent: ").append(toIndentedString(permanent)).append("\n");
    sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    requiresRefreshOnSort: ").append(toIndentedString(requiresRefreshOnSort)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    sortable: ").append(toIndentedString(sortable)).append("\n");
    sb.append("    sourceFile: ").append(toIndentedString(sourceFile)).append("\n");
    sb.append("    sourceFilePath: ").append(toIndentedString(sourceFilePath)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
    sb.append("    sqlCase: ").append(toIndentedString(sqlCase)).append("\n");
    sb.append("    suggestDimension: ").append(toIndentedString(suggestDimension)).append("\n");
    sb.append("    suggestExplore: ").append(toIndentedString(suggestExplore)).append("\n");
    sb.append("    suggestable: ").append(toIndentedString(suggestable)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userAttributeFilterTypes: ").append(toIndentedString(userAttributeFilterTypes)).append("\n");
    sb.append("    valueFormat: ").append(toIndentedString(valueFormat)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    viewLabel: ").append(toIndentedString(viewLabel)).append("\n");
    sb.append("    dynamic: ").append(toIndentedString(dynamic)).append("\n");
    sb.append("    weekStartDay: ").append(toIndentedString(weekStartDay)).append("\n");
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
