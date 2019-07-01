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
import com.squareup.connect.models.OrderFulfillmentPickupDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains details on how to fulfill this order.
 */
@ApiModel(description = "Contains details on how to fulfill this order.")

public class OrderFulfillment {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("pickup_details")
  private OrderFulfillmentPickupDetails pickupDetails = null;

  public OrderFulfillment type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the fulfillment. See [OrderFulfillmentType](#type-orderfulfillmenttype) for possible values
   * @return type
  **/
  @ApiModelProperty(value = "The type of the fulfillment. See [OrderFulfillmentType](#type-orderfulfillmenttype) for possible values")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderFulfillment state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the fulfillment. See [OrderFulfillmentState](#type-orderfulfillmentstate) for possible values
   * @return state
  **/
  @ApiModelProperty(value = "The state of the fulfillment. See [OrderFulfillmentState](#type-orderfulfillmentstate) for possible values")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public OrderFulfillment pickupDetails(OrderFulfillmentPickupDetails pickupDetails) {
    this.pickupDetails = pickupDetails;
    return this;
  }

   /**
   * Contains pickup-specific details. Required when fulfillment type is `PICKUP`.
   * @return pickupDetails
  **/
  @ApiModelProperty(value = "Contains pickup-specific details. Required when fulfillment type is `PICKUP`.")
  public OrderFulfillmentPickupDetails getPickupDetails() {
    return pickupDetails;
  }

  public void setPickupDetails(OrderFulfillmentPickupDetails pickupDetails) {
    this.pickupDetails = pickupDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderFulfillment orderFulfillment = (OrderFulfillment) o;
    return Objects.equals(this.type, orderFulfillment.type) &&
        Objects.equals(this.state, orderFulfillment.state) &&
        Objects.equals(this.pickupDetails, orderFulfillment.pickupDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, state, pickupDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFulfillment {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    pickupDetails: ").append(toIndentedString(pickupDetails)).append("\n");
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

