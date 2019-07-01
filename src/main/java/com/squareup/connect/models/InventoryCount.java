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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents Square&#39;s estimated quantity of items in a particular state at a particular location based on the known history of physical counts and inventory adjustments
 */
@ApiModel(description = "Represents Square's estimated quantity of items in a particular state at a particular location based on the known history of physical counts and inventory adjustments")

public class InventoryCount {
  @JsonProperty("catalog_object_id")
  private String catalogObjectId = null;

  @JsonProperty("catalog_object_type")
  private String catalogObjectType = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("location_id")
  private String locationId = null;

  @JsonProperty("quantity")
  private String quantity = null;

  @JsonProperty("calculated_at")
  private String calculatedAt = null;

  public InventoryCount catalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
    return this;
  }

   /**
   * The Square generated ID of the [CatalogObject](#type-catalogobject) being tracked.
   * @return catalogObjectId
  **/
  @ApiModelProperty(value = "The Square generated ID of the [CatalogObject](#type-catalogobject) being tracked.")
  public String getCatalogObjectId() {
    return catalogObjectId;
  }

  public void setCatalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
  }

  public InventoryCount catalogObjectType(String catalogObjectType) {
    this.catalogObjectType = catalogObjectType;
    return this;
  }

   /**
   * The [CatalogObjectType](#type-catalogobjecttype) of the [CatalogObject](#type-catalogobject) being tracked. Tracking is only supported for the `ITEM_VARIATION` type.
   * @return catalogObjectType
  **/
  @ApiModelProperty(value = "The [CatalogObjectType](#type-catalogobjecttype) of the [CatalogObject](#type-catalogobject) being tracked. Tracking is only supported for the `ITEM_VARIATION` type.")
  public String getCatalogObjectType() {
    return catalogObjectType;
  }

  public void setCatalogObjectType(String catalogObjectType) {
    this.catalogObjectType = catalogObjectType;
  }

  public InventoryCount state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The current [InventoryState](#type-inventorystate) for the related quantity of items. See [InventoryState](#type-inventorystate) for possible values
   * @return state
  **/
  @ApiModelProperty(value = "The current [InventoryState](#type-inventorystate) for the related quantity of items. See [InventoryState](#type-inventorystate) for possible values")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public InventoryCount locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The Square ID of the [Location](#type-location) where the related quantity of items are being tracked.
   * @return locationId
  **/
  @ApiModelProperty(value = "The Square ID of the [Location](#type-location) where the related quantity of items are being tracked.")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public InventoryCount quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of items in the count as a decimal string. Can support up to 5 digits after the decimal point.  _Important_: The Point of Sale app and Dashboard do not currently support decimal quantities. If a Point of Sale app or Dashboard attempts to read a decimal quantity on inventory counts or adjustments, the quantity will be rounded down to the nearest integer. For example, `2.5` will become `2`, and `-2.5` will become `-3`. Read [Decimal Quantities (BETA)](/more-apis/inventory/overview#decimal-quantities-beta) for more information.
   * @return quantity
  **/
  @ApiModelProperty(value = "The number of items in the count as a decimal string. Can support up to 5 digits after the decimal point.  _Important_: The Point of Sale app and Dashboard do not currently support decimal quantities. If a Point of Sale app or Dashboard attempts to read a decimal quantity on inventory counts or adjustments, the quantity will be rounded down to the nearest integer. For example, `2.5` will become `2`, and `-2.5` will become `-3`. Read [Decimal Quantities (BETA)](/more-apis/inventory/overview#decimal-quantities-beta) for more information.")
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public InventoryCount calculatedAt(String calculatedAt) {
    this.calculatedAt = calculatedAt;
    return this;
  }

   /**
   * A read-only timestamp in RFC 3339 format that indicates when Square received the most recent physical count or adjustment that had an affect on the estimated count.
   * @return calculatedAt
  **/
  @ApiModelProperty(value = "A read-only timestamp in RFC 3339 format that indicates when Square received the most recent physical count or adjustment that had an affect on the estimated count.")
  public String getCalculatedAt() {
    return calculatedAt;
  }

  public void setCalculatedAt(String calculatedAt) {
    this.calculatedAt = calculatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryCount inventoryCount = (InventoryCount) o;
    return Objects.equals(this.catalogObjectId, inventoryCount.catalogObjectId) &&
        Objects.equals(this.catalogObjectType, inventoryCount.catalogObjectType) &&
        Objects.equals(this.state, inventoryCount.state) &&
        Objects.equals(this.locationId, inventoryCount.locationId) &&
        Objects.equals(this.quantity, inventoryCount.quantity) &&
        Objects.equals(this.calculatedAt, inventoryCount.calculatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogObjectId, catalogObjectType, state, locationId, quantity, calculatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryCount {\n");

    sb.append("    catalogObjectId: ").append(toIndentedString(catalogObjectId)).append("\n");
    sb.append("    catalogObjectType: ").append(toIndentedString(catalogObjectType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    calculatedAt: ").append(toIndentedString(calculatedAt)).append("\n");
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

