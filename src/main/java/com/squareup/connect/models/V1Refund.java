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
import com.squareup.connect.models.V1Money;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * V1Refund
 */

public class V1Refund {
  /**
   * The type of refund 
   */
  public enum TypeEnum {
    FULL("FULL"),
    
    PARTIAL("PARTIAL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("refunded_money")
  private V1Money refundedMoney = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("processed_at")
  private String processedAt = null;

  @JsonProperty("payment_id")
  private String paymentId = null;

  @JsonProperty("merchant_id")
  private String merchantId = null;

  @JsonProperty("is_exchange")
  private Boolean isExchange = null;

  public V1Refund type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of refund 
   * @return type
  **/
  @ApiModelProperty(value = "The type of refund ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public V1Refund reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The merchant-specified reason for the refund.
   * @return reason
  **/
  @ApiModelProperty(value = "The merchant-specified reason for the refund.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1Refund refundedMoney(V1Money refundedMoney) {
    this.refundedMoney = refundedMoney;
    return this;
  }

   /**
   * The amount of money refunded. This amount is always negative.
   * @return refundedMoney
  **/
  @ApiModelProperty(value = "The amount of money refunded. This amount is always negative.")
  public V1Money getRefundedMoney() {
    return refundedMoney;
  }

  public void setRefundedMoney(V1Money refundedMoney) {
    this.refundedMoney = refundedMoney;
  }

  public V1Refund createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the merchant initiated the refund for Square to process, in ISO 8601 format.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time when the merchant initiated the refund for Square to process, in ISO 8601 format.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public V1Refund processedAt(String processedAt) {
    this.processedAt = processedAt;
    return this;
  }

   /**
   * The time when Square processed the refund on behalf of the merchant, in ISO 8601 format.
   * @return processedAt
  **/
  @ApiModelProperty(value = "The time when Square processed the refund on behalf of the merchant, in ISO 8601 format.")
  public String getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(String processedAt) {
    this.processedAt = processedAt;
  }

  public V1Refund paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * A Square-issued ID associated with the refund. For single-tender refunds, payment_id is the ID of the original payment ID. For split-tender refunds, payment_id is the ID of the original tender. For exchange-based refunds (is_exchange == true), payment_id is the ID of the original payment ID even if the payment includes other tenders.
   * @return paymentId
  **/
  @ApiModelProperty(value = "A Square-issued ID associated with the refund. For single-tender refunds, payment_id is the ID of the original payment ID. For split-tender refunds, payment_id is the ID of the original tender. For exchange-based refunds (is_exchange == true), payment_id is the ID of the original payment ID even if the payment includes other tenders.")
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public V1Refund merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * 
   * @return merchantId
  **/
  @ApiModelProperty(value = "")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public V1Refund isExchange(Boolean isExchange) {
    this.isExchange = isExchange;
    return this;
  }

   /**
   * Indicates whether or not the refund is associated with an exchange. If is_exchange is true, the refund reflects the value of goods returned in the exchange not the total money refunded.
   * @return isExchange
  **/
  @ApiModelProperty(value = "Indicates whether or not the refund is associated with an exchange. If is_exchange is true, the refund reflects the value of goods returned in the exchange not the total money refunded.")
  public Boolean getIsExchange() {
    return isExchange;
  }

  public void setIsExchange(Boolean isExchange) {
    this.isExchange = isExchange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Refund v1Refund = (V1Refund) o;
    return Objects.equals(this.type, v1Refund.type) &&
        Objects.equals(this.reason, v1Refund.reason) &&
        Objects.equals(this.refundedMoney, v1Refund.refundedMoney) &&
        Objects.equals(this.createdAt, v1Refund.createdAt) &&
        Objects.equals(this.processedAt, v1Refund.processedAt) &&
        Objects.equals(this.paymentId, v1Refund.paymentId) &&
        Objects.equals(this.merchantId, v1Refund.merchantId) &&
        Objects.equals(this.isExchange, v1Refund.isExchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, reason, refundedMoney, createdAt, processedAt, paymentId, merchantId, isExchange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Refund {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    refundedMoney: ").append(toIndentedString(refundedMoney)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    processedAt: ").append(toIndentedString(processedAt)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    isExchange: ").append(toIndentedString(isExchange)).append("\n");
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

