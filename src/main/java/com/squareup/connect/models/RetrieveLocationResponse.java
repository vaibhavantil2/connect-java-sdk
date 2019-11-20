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
import com.squareup.connect.models.Error;
import com.squareup.connect.models.Location;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the fields that the [RetrieveLocation](#endpoint-retrievelocation) endpoint returns in a response.
 */
@ApiModel(description = "Defines the fields that the [RetrieveLocation](#endpoint-retrievelocation) endpoint returns in a response.")

public class RetrieveLocationResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("location")
  private Location location = null;

  public RetrieveLocationResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public RetrieveLocationResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Information on errors encountered during the request.
   * @return errors
  **/
  @ApiModelProperty(value = "Information on errors encountered during the request.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public RetrieveLocationResponse location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * The requested location.
   * @return location
  **/
  @ApiModelProperty(value = "The requested location.")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveLocationResponse retrieveLocationResponse = (RetrieveLocationResponse) o;
    return Objects.equals(this.errors, retrieveLocationResponse.errors) &&
        Objects.equals(this.location, retrieveLocationResponse.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveLocationResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

