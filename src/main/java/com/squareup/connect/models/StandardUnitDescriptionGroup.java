/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.StandardUnitDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Group of standard measurement units.
 */
@ApiModel(description = "Group of standard measurement units.")

public class StandardUnitDescriptionGroup {
  @JsonProperty("standard_unit_descriptions")
  private List<StandardUnitDescription> standardUnitDescriptions = new ArrayList<StandardUnitDescription>();

  @JsonProperty("language_code")
  private String languageCode = null;

  public StandardUnitDescriptionGroup standardUnitDescriptions(List<StandardUnitDescription> standardUnitDescriptions) {
    this.standardUnitDescriptions = standardUnitDescriptions;
    return this;
  }

  public StandardUnitDescriptionGroup addStandardUnitDescriptionsItem(StandardUnitDescription standardUnitDescriptionsItem) {
    this.standardUnitDescriptions.add(standardUnitDescriptionsItem);
    return this;
  }

   /**
   * List of standard (non-custom) measurement units in this description group.
   * @return standardUnitDescriptions
  **/
  @ApiModelProperty(value = "List of standard (non-custom) measurement units in this description group.")
  public List<StandardUnitDescription> getStandardUnitDescriptions() {
    return standardUnitDescriptions;
  }

  public void setStandardUnitDescriptions(List<StandardUnitDescription> standardUnitDescriptions) {
    this.standardUnitDescriptions = standardUnitDescriptions;
  }

  public StandardUnitDescriptionGroup languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

   /**
   * IETF language tag.
   * @return languageCode
  **/
  @ApiModelProperty(value = "IETF language tag.")
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardUnitDescriptionGroup standardUnitDescriptionGroup = (StandardUnitDescriptionGroup) o;
    return Objects.equals(this.standardUnitDescriptions, standardUnitDescriptionGroup.standardUnitDescriptions) &&
        Objects.equals(this.languageCode, standardUnitDescriptionGroup.languageCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standardUnitDescriptions, languageCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardUnitDescriptionGroup {\n");
    
    sb.append("    standardUnitDescriptions: ").append(toIndentedString(standardUnitDescriptions)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
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

