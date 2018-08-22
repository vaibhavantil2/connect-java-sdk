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
 * 
 */
@ApiModel(description = "")

public class ObtainTokenResponse {
  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("token_type")
  private String tokenType = null;

  @JsonProperty("expires_at")
  private String expiresAt = null;

  @JsonProperty("merchant_id")
  private String merchantId = null;

  @JsonProperty("subscription_id")
  private String subscriptionId = null;

  @JsonProperty("plan_id")
  private String planId = null;

  @JsonProperty("id_token")
  private String idToken = null;

  public ObtainTokenResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Your application's access token. You provide this token in a header with every request to Connect API endpoints. See [Request and response headers](https://docs.connect.squareup.com/api/connect/v2/#requestandresponseheaders) for the format of this header.
   * @return accessToken
  **/
  @ApiModelProperty(value = "Your application's access token. You provide this token in a header with every request to Connect API endpoints. See [Request and response headers](https://docs.connect.squareup.com/api/connect/v2/#requestandresponseheaders) for the format of this header.")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public ObtainTokenResponse tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * This value is always _bearer_.
   * @return tokenType
  **/
  @ApiModelProperty(value = "This value is always _bearer_.")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public ObtainTokenResponse expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The date when access_token expires, in [ISO 8601](http://www.iso.org/iso/home/standards/iso8601.htm) format.
   * @return expiresAt
  **/
  @ApiModelProperty(value = "The date when access_token expires, in [ISO 8601](http://www.iso.org/iso/home/standards/iso8601.htm) format.")
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public ObtainTokenResponse merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The ID of the authorizing merchant's business.
   * @return merchantId
  **/
  @ApiModelProperty(value = "The ID of the authorizing merchant's business.")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public ObtainTokenResponse subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * The ID of the merchant [subscription](https://docs.connect.squareup.com/api/connect/v1/#navsection-subscriptionmanagement) associated with the authorization. Only present if the merchant signed up for a subscription during authorization.
   * @return subscriptionId
  **/
  @ApiModelProperty(value = "The ID of the merchant [subscription](https://docs.connect.squareup.com/api/connect/v1/#navsection-subscriptionmanagement) associated with the authorization. Only present if the merchant signed up for a subscription during authorization.")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public ObtainTokenResponse planId(String planId) {
    this.planId = planId;
    return this;
  }

   /**
   * The ID of the [subscription](https://docs.connect.squareup.com/api/connect/v1/#navsection-subscriptionmanagement) plan the merchant signed up for. Only present if the merchant signed up for a subscription during authorization.
   * @return planId
  **/
  @ApiModelProperty(value = "The ID of the [subscription](https://docs.connect.squareup.com/api/connect/v1/#navsection-subscriptionmanagement) plan the merchant signed up for. Only present if the merchant signed up for a subscription during authorization.")
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public ObtainTokenResponse idToken(String idToken) {
    this.idToken = idToken;
    return this;
  }

   /**
   * Then OpenID token belonging to this this person. Only present if the OPENID scope is included in the authorize request.
   * @return idToken
  **/
  @ApiModelProperty(value = "Then OpenID token belonging to this this person. Only present if the OPENID scope is included in the authorize request.")
  public String getIdToken() {
    return idToken;
  }

  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObtainTokenResponse obtainTokenResponse = (ObtainTokenResponse) o;
    return Objects.equals(this.accessToken, obtainTokenResponse.accessToken) &&
        Objects.equals(this.tokenType, obtainTokenResponse.tokenType) &&
        Objects.equals(this.expiresAt, obtainTokenResponse.expiresAt) &&
        Objects.equals(this.merchantId, obtainTokenResponse.merchantId) &&
        Objects.equals(this.subscriptionId, obtainTokenResponse.subscriptionId) &&
        Objects.equals(this.planId, obtainTokenResponse.planId) &&
        Objects.equals(this.idToken, obtainTokenResponse.idToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType, expiresAt, merchantId, subscriptionId, planId, idToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObtainTokenResponse {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
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

