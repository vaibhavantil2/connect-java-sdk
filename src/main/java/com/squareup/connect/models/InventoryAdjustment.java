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
import com.squareup.connect.models.Money;
import com.squareup.connect.models.SourceApplication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a change in state or quantity of product inventory at a particular time and location.
 */
@ApiModel(description = "Represents a change in state or quantity of product inventory at a particular time and location.")

public class InventoryAdjustment {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("reference_id")
  private String referenceId = null;

  /**
   * The [InventoryState](#type-inventorystate) of the related quantity of items before the adjustment.
   */
  public enum FromStateEnum {
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

    FromStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FromStateEnum fromValue(String text) {
      for (FromStateEnum b : FromStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("from_state")
  private FromStateEnum fromState = null;

  /**
   * The [InventoryState](#type-inventorystate) of the related quantity of items after the adjustment.
   */
  public enum ToStateEnum {
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

    ToStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ToStateEnum fromValue(String text) {
      for (ToStateEnum b : ToStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("to_state")
  private ToStateEnum toState = null;

  @JsonProperty("location_id")
  private String locationId = null;

  @JsonProperty("catalog_object_id")
  private String catalogObjectId = null;

  @JsonProperty("catalog_object_type")
  private String catalogObjectType = null;

  @JsonProperty("quantity")
  private String quantity = null;

  @JsonProperty("total_price_money")
  private Money totalPriceMoney = null;

  @JsonProperty("occurred_at")
  private String occurredAt = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("source")
  private SourceApplication source = null;

  @JsonProperty("employee_id")
  private String employeeId = null;

  @JsonProperty("transaction_id")
  private String transactionId = null;

  @JsonProperty("refund_id")
  private String refundId = null;

  @JsonProperty("purchase_order_id")
  private String purchaseOrderId = null;

  @JsonProperty("goods_receipt_id")
  private String goodsReceiptId = null;

  public InventoryAdjustment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique ID generated by Square for the [InventoryAdjustment](#type-inventoryadjustment).
   * @return id
  **/
  @ApiModelProperty(value = "A unique ID generated by Square for the [InventoryAdjustment](#type-inventoryadjustment).")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InventoryAdjustment referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * An optional ID provided by the application to tie the [InventoryAdjustment](#type-inventoryadjustment) to an external system.
   * @return referenceId
  **/
  @ApiModelProperty(value = "An optional ID provided by the application to tie the [InventoryAdjustment](#type-inventoryadjustment) to an external system.")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public InventoryAdjustment fromState(FromStateEnum fromState) {
    this.fromState = fromState;
    return this;
  }

   /**
   * The [InventoryState](#type-inventorystate) of the related quantity of items before the adjustment.
   * @return fromState
  **/
  @ApiModelProperty(value = "The [InventoryState](#type-inventorystate) of the related quantity of items before the adjustment.")
  public FromStateEnum getFromState() {
    return fromState;
  }

  public void setFromState(FromStateEnum fromState) {
    this.fromState = fromState;
  }

  public InventoryAdjustment toState(ToStateEnum toState) {
    this.toState = toState;
    return this;
  }

   /**
   * The [InventoryState](#type-inventorystate) of the related quantity of items after the adjustment.
   * @return toState
  **/
  @ApiModelProperty(value = "The [InventoryState](#type-inventorystate) of the related quantity of items after the adjustment.")
  public ToStateEnum getToState() {
    return toState;
  }

  public void setToState(ToStateEnum toState) {
    this.toState = toState;
  }

  public InventoryAdjustment locationId(String locationId) {
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

  public InventoryAdjustment catalogObjectId(String catalogObjectId) {
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

  public InventoryAdjustment catalogObjectType(String catalogObjectType) {
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

  public InventoryAdjustment quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of items affected by the adjustment as a decimal string. Fractional quantities are not supported.
   * @return quantity
  **/
  @ApiModelProperty(value = "The number of items affected by the adjustment as a decimal string. Fractional quantities are not supported.")
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public InventoryAdjustment totalPriceMoney(Money totalPriceMoney) {
    this.totalPriceMoney = totalPriceMoney;
    return this;
  }

   /**
   * The read-only total price paid for goods associated with the adjustment. Present if and only if `to_state` is `SOLD`. Always non-negative.
   * @return totalPriceMoney
  **/
  @ApiModelProperty(value = "The read-only total price paid for goods associated with the adjustment. Present if and only if `to_state` is `SOLD`. Always non-negative.")
  public Money getTotalPriceMoney() {
    return totalPriceMoney;
  }

  public void setTotalPriceMoney(Money totalPriceMoney) {
    this.totalPriceMoney = totalPriceMoney;
  }

  public InventoryAdjustment occurredAt(String occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

   /**
   * A client-generated timestamp in RFC 3339 format that indicates when the adjustment took place. For write actions, the `occurred_at` timestamp cannot be older than 24 hours or in the future relative to the time of the request.
   * @return occurredAt
  **/
  @ApiModelProperty(value = "A client-generated timestamp in RFC 3339 format that indicates when the adjustment took place. For write actions, the `occurred_at` timestamp cannot be older than 24 hours or in the future relative to the time of the request.")
  public String getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(String occurredAt) {
    this.occurredAt = occurredAt;
  }

  public InventoryAdjustment createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * A read-only timestamp in RFC 3339 format that indicates when Square received the adjustment.
   * @return createdAt
  **/
  @ApiModelProperty(value = "A read-only timestamp in RFC 3339 format that indicates when Square received the adjustment.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public InventoryAdjustment source(SourceApplication source) {
    this.source = source;
    return this;
  }

   /**
   * Read-only information about the application that caused the inventory adjustment.
   * @return source
  **/
  @ApiModelProperty(value = "Read-only information about the application that caused the inventory adjustment.")
  public SourceApplication getSource() {
    return source;
  }

  public void setSource(SourceApplication source) {
    this.source = source;
  }

  public InventoryAdjustment employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

   /**
   * The Square ID of the [Employee](#type-employee) responsible for the inventory adjustment.
   * @return employeeId
  **/
  @ApiModelProperty(value = "The Square ID of the [Employee](#type-employee) responsible for the inventory adjustment.")
  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public InventoryAdjustment transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The read-only Square ID of the [Transaction][#type-transaction] that caused the adjustment. Only relevant for payment-related state transitions.
   * @return transactionId
  **/
  @ApiModelProperty(value = "The read-only Square ID of the [Transaction][#type-transaction] that caused the adjustment. Only relevant for payment-related state transitions.")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public InventoryAdjustment refundId(String refundId) {
    this.refundId = refundId;
    return this;
  }

   /**
   * The read-only Square ID of the [Refund][#type-refund] that caused the adjustment. Only relevant for refund-related state transitions.
   * @return refundId
  **/
  @ApiModelProperty(value = "The read-only Square ID of the [Refund][#type-refund] that caused the adjustment. Only relevant for refund-related state transitions.")
  public String getRefundId() {
    return refundId;
  }

  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }

  public InventoryAdjustment purchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
    return this;
  }

   /**
   * The read-only Square ID of the purchase order that caused the adjustment. Only relevant for state transitions from the Square for Retail app.
   * @return purchaseOrderId
  **/
  @ApiModelProperty(value = "The read-only Square ID of the purchase order that caused the adjustment. Only relevant for state transitions from the Square for Retail app.")
  public String getPurchaseOrderId() {
    return purchaseOrderId;
  }

  public void setPurchaseOrderId(String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
  }

  public InventoryAdjustment goodsReceiptId(String goodsReceiptId) {
    this.goodsReceiptId = goodsReceiptId;
    return this;
  }

   /**
   * The read-only Square ID of the Square goods receipt that caused the adjustment. Only relevant for state transitions from the Square for Retail app.
   * @return goodsReceiptId
  **/
  @ApiModelProperty(value = "The read-only Square ID of the Square goods receipt that caused the adjustment. Only relevant for state transitions from the Square for Retail app.")
  public String getGoodsReceiptId() {
    return goodsReceiptId;
  }

  public void setGoodsReceiptId(String goodsReceiptId) {
    this.goodsReceiptId = goodsReceiptId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryAdjustment inventoryAdjustment = (InventoryAdjustment) o;
    return Objects.equals(this.id, inventoryAdjustment.id) &&
        Objects.equals(this.referenceId, inventoryAdjustment.referenceId) &&
        Objects.equals(this.fromState, inventoryAdjustment.fromState) &&
        Objects.equals(this.toState, inventoryAdjustment.toState) &&
        Objects.equals(this.locationId, inventoryAdjustment.locationId) &&
        Objects.equals(this.catalogObjectId, inventoryAdjustment.catalogObjectId) &&
        Objects.equals(this.catalogObjectType, inventoryAdjustment.catalogObjectType) &&
        Objects.equals(this.quantity, inventoryAdjustment.quantity) &&
        Objects.equals(this.totalPriceMoney, inventoryAdjustment.totalPriceMoney) &&
        Objects.equals(this.occurredAt, inventoryAdjustment.occurredAt) &&
        Objects.equals(this.createdAt, inventoryAdjustment.createdAt) &&
        Objects.equals(this.source, inventoryAdjustment.source) &&
        Objects.equals(this.employeeId, inventoryAdjustment.employeeId) &&
        Objects.equals(this.transactionId, inventoryAdjustment.transactionId) &&
        Objects.equals(this.refundId, inventoryAdjustment.refundId) &&
        Objects.equals(this.purchaseOrderId, inventoryAdjustment.purchaseOrderId) &&
        Objects.equals(this.goodsReceiptId, inventoryAdjustment.goodsReceiptId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, referenceId, fromState, toState, locationId, catalogObjectId, catalogObjectType, quantity, totalPriceMoney, occurredAt, createdAt, source, employeeId, transactionId, refundId, purchaseOrderId, goodsReceiptId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryAdjustment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    fromState: ").append(toIndentedString(fromState)).append("\n");
    sb.append("    toState: ").append(toIndentedString(toState)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    catalogObjectId: ").append(toIndentedString(catalogObjectId)).append("\n");
    sb.append("    catalogObjectType: ").append(toIndentedString(catalogObjectType)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    totalPriceMoney: ").append(toIndentedString(totalPriceMoney)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    purchaseOrderId: ").append(toIndentedString(purchaseOrderId)).append("\n");
    sb.append("    goodsReceiptId: ").append(toIndentedString(goodsReceiptId)).append("\n");
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

