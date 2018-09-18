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

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Indicates the state of a tracked item quantity in the lifecycle of goods.
 */
public enum InventoryState {
  
  CUSTOM("CUSTOM"),
  
  IN_STOCK("IN_STOCK"),
  
  SOLD("SOLD"),
  
  RETURNED_BY_CUSTOMER("RETURNED_BY_CUSTOMER"),
  
  RESERVED_FOR_SALE("RESERVED_FOR_SALE"),
  
  SOLD_ONLINE("SOLD_ONLINE"),
  
  ORDERED_FROM_VENDOR("ORDERED_FROM_VENDOR"),
  
  RECEIVED_FROM_VENDOR("RECEIVED_FROM_VENDOR"),
  
  IN_TRANSIT_TO("IN_TRANSIT_TO"),
  
  NONE("NONE"),
  
  WASTE("WASTE"),
  
  UNLINKED_RETURN("UNLINKED_RETURN");

  private String value;

  InventoryState(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static InventoryState fromValue(String text) {
    for (InventoryState b : InventoryState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

