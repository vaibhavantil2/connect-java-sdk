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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The line item discount being returned.
 */
@ApiModel(description = "The line item discount being returned.")

public class OrderReturnDiscount {
  @JsonProperty("uid")
  private String uid = null;

  @JsonProperty("source_discount_uid")
  private String sourceDiscountUid = null;

  @JsonProperty("catalog_object_id")
  private String catalogObjectId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("percentage")
  private String percentage = null;

  @JsonProperty("amount_money")
  private Money amountMoney = null;

  @JsonProperty("applied_money")
  private Money appliedMoney = null;

  @JsonProperty("scope")
  private String scope = null;

  public OrderReturnDiscount uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Unique ID that identifies the return discount only within this order.  This field is read-only.
   * @return uid
  **/
  @ApiModelProperty(value = "Unique ID that identifies the return discount only within this order.  This field is read-only.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public OrderReturnDiscount sourceDiscountUid(String sourceDiscountUid) {
    this.sourceDiscountUid = sourceDiscountUid;
    return this;
  }

   /**
   * `uid` of the Discount from the Order which contains the original application of this discount.
   * @return sourceDiscountUid
  **/
  @ApiModelProperty(value = "`uid` of the Discount from the Order which contains the original application of this discount.")
  public String getSourceDiscountUid() {
    return sourceDiscountUid;
  }

  public void setSourceDiscountUid(String sourceDiscountUid) {
    this.sourceDiscountUid = sourceDiscountUid;
  }

  public OrderReturnDiscount catalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
    return this;
  }

   /**
   * The catalog object id referencing [CatalogDiscount](#type-catalogdiscount).
   * @return catalogObjectId
  **/
  @ApiModelProperty(value = "The catalog object id referencing [CatalogDiscount](#type-catalogdiscount).")
  public String getCatalogObjectId() {
    return catalogObjectId;
  }

  public void setCatalogObjectId(String catalogObjectId) {
    this.catalogObjectId = catalogObjectId;
  }

  public OrderReturnDiscount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The discount's name.
   * @return name
  **/
  @ApiModelProperty(value = "The discount's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderReturnDiscount type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the discount. If it is created by API, it would be either `FIXED_PERCENTAGE` or `FIXED_AMOUNT`.  VARIABLE_* is not supported in API because the order is created at the time of sale and either percentage or amount has to be specified. See [OrderLineItemDiscountType](#type-orderlineitemdiscounttype) for possible values
   * @return type
  **/
  @ApiModelProperty(value = "The type of the discount. If it is created by API, it would be either `FIXED_PERCENTAGE` or `FIXED_AMOUNT`.  VARIABLE_* is not supported in API because the order is created at the time of sale and either percentage or amount has to be specified. See [OrderLineItemDiscountType](#type-orderlineitemdiscounttype) for possible values")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderReturnDiscount percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * The percentage of the tax, as a string representation of a decimal number. A value of `7.25` corresponds to a percentage of 7.25%.  The percentage won't be set for an amount-based discount.
   * @return percentage
  **/
  @ApiModelProperty(value = "The percentage of the tax, as a string representation of a decimal number. A value of `7.25` corresponds to a percentage of 7.25%.  The percentage won't be set for an amount-based discount.")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  public OrderReturnDiscount amountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
    return this;
  }

   /**
   * The total monetary amount of the applicable discount. If it is at order level, it is the value of the order level discount. If it is at line item level, it is the value of the line item level discount.  The amount_money won't be set for a percentage-based discount.
   * @return amountMoney
  **/
  @ApiModelProperty(value = "The total monetary amount of the applicable discount. If it is at order level, it is the value of the order level discount. If it is at line item level, it is the value of the line item level discount.  The amount_money won't be set for a percentage-based discount.")
  public Money getAmountMoney() {
    return amountMoney;
  }

  public void setAmountMoney(Money amountMoney) {
    this.amountMoney = amountMoney;
  }

  public OrderReturnDiscount appliedMoney(Money appliedMoney) {
    this.appliedMoney = appliedMoney;
    return this;
  }

   /**
   * The amount of discount actually applied to this line item. When an amount-based discount is at order-level, this value is different from `amount_money` because the discount is distributed across the line items.
   * @return appliedMoney
  **/
  @ApiModelProperty(value = "The amount of discount actually applied to this line item. When an amount-based discount is at order-level, this value is different from `amount_money` because the discount is distributed across the line items.")
  public Money getAppliedMoney() {
    return appliedMoney;
  }

  public void setAppliedMoney(Money appliedMoney) {
    this.appliedMoney = appliedMoney;
  }

  public OrderReturnDiscount scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Indicates the level at which the discount applies. This field is set by the server. If set in a CreateOrder request, it will be ignored on write. See [OrderLineItemDiscountScope](#type-orderlineitemdiscountscope) for possible values
   * @return scope
  **/
  @ApiModelProperty(value = "Indicates the level at which the discount applies. This field is set by the server. If set in a CreateOrder request, it will be ignored on write. See [OrderLineItemDiscountScope](#type-orderlineitemdiscountscope) for possible values")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderReturnDiscount orderReturnDiscount = (OrderReturnDiscount) o;
    return Objects.equals(this.uid, orderReturnDiscount.uid) &&
        Objects.equals(this.sourceDiscountUid, orderReturnDiscount.sourceDiscountUid) &&
        Objects.equals(this.catalogObjectId, orderReturnDiscount.catalogObjectId) &&
        Objects.equals(this.name, orderReturnDiscount.name) &&
        Objects.equals(this.type, orderReturnDiscount.type) &&
        Objects.equals(this.percentage, orderReturnDiscount.percentage) &&
        Objects.equals(this.amountMoney, orderReturnDiscount.amountMoney) &&
        Objects.equals(this.appliedMoney, orderReturnDiscount.appliedMoney) &&
        Objects.equals(this.scope, orderReturnDiscount.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, sourceDiscountUid, catalogObjectId, name, type, percentage, amountMoney, appliedMoney, scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderReturnDiscount {\n");

    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    sourceDiscountUid: ").append(toIndentedString(sourceDiscountUid)).append("\n");
    sb.append("    catalogObjectId: ").append(toIndentedString(catalogObjectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    amountMoney: ").append(toIndentedString(amountMoney)).append("\n");
    sb.append("    appliedMoney: ").append(toIndentedString(appliedMoney)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

