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
import com.squareup.connect.models.Merchant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * The response object returned by the [ListMerchant](#endpoint-listmerchant) endpoint.
 */
@ApiModel(description = "The response object returned by the [ListMerchant](#endpoint-listmerchant) endpoint.")

public class ListMerchantsResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("merchant")
  private List<Merchant> merchant = new ArrayList<Merchant>();

  @JsonProperty("cursor")
  private Integer cursor = null;

  public ListMerchantsResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ListMerchantsResponse addErrorsItem(Error errorsItem) {
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

  public ListMerchantsResponse merchant(List<Merchant> merchant) {
    this.merchant = merchant;
    return this;
  }

  public ListMerchantsResponse addMerchantItem(Merchant merchantItem) {
    this.merchant.add(merchantItem);
    return this;
  }

   /**
   * The requested `Merchant` entities.
   * @return merchant
  **/
  @ApiModelProperty(value = "The requested `Merchant` entities.")
  public List<Merchant> getMerchant() {
    return merchant;
  }

  public void setMerchant(List<Merchant> merchant) {
    this.merchant = merchant;
  }

  public ListMerchantsResponse cursor(Integer cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * If the  response is truncated, the cursor to use in next  request to fetch next set of objects.
   * @return cursor
  **/
  @ApiModelProperty(value = "If the  response is truncated, the cursor to use in next  request to fetch next set of objects.")
  public Integer getCursor() {
    return cursor;
  }

  public void setCursor(Integer cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListMerchantsResponse listMerchantsResponse = (ListMerchantsResponse) o;
    return Objects.equals(this.errors, listMerchantsResponse.errors) &&
        Objects.equals(this.merchant, listMerchantsResponse.merchant) &&
        Objects.equals(this.cursor, listMerchantsResponse.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, merchant, cursor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMerchantsResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

