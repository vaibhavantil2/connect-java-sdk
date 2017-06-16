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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;


/**
 * Indicates the card transaction's current status.
 */
public enum TenderCardDetailsStatus {
  
  @SerializedName("AUTHORIZED")
  AUTHORIZED("AUTHORIZED"),
  
  @SerializedName("CAPTURED")
  CAPTURED("CAPTURED"),
  
  @SerializedName("VOIDED")
  VOIDED("VOIDED"),
  
  @SerializedName("FAILED")
  FAILED("FAILED");

  private String value;

  TenderCardDetailsStatus(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

