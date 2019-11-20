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
 * Defines the fields that are included in the response body of a request to the __ListLocations__ endpoint.  One of &#x60;errors&#x60; or &#x60;locations&#x60; is present in a given response (never both).
 */
@ApiModel(description = "Defines the fields that are included in the response body of a request to the __ListLocations__ endpoint.  One of `errors` or `locations` is present in a given response (never both).")

public class ListLocationsResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("locations")
  private List<Location> locations = new ArrayList<Location>();

  public ListLocationsResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ListLocationsResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Any errors that occurred during the request.
   * @return errors
  **/
  @ApiModelProperty(value = "Any errors that occurred during the request.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public ListLocationsResponse locations(List<Location> locations) {
    this.locations = locations;
    return this;
  }

  public ListLocationsResponse addLocationsItem(Location locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * The business locations.
   * @return locations
  **/
  @ApiModelProperty(value = "The business locations.")
  public List<Location> getLocations() {
    return locations;
  }

  public void setLocations(List<Location> locations) {
    this.locations = locations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListLocationsResponse listLocationsResponse = (ListLocationsResponse) o;
    return Objects.equals(this.errors, listLocationsResponse.errors) &&
        Objects.equals(this.locations, listLocationsResponse.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, locations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListLocationsResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

