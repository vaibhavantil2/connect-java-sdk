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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.squareup.connect.models.Address;
import com.squareup.connect.models.Card;
import com.squareup.connect.models.CustomerGroupInfo;
import com.squareup.connect.models.CustomerPreferences;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents one of a business&#39;s customers, which can have one or more cards on file associated with it.
 */
@ApiModel(description = "Represents one of a business's customers, which can have one or more cards on file associated with it.")

public class Customer {
  @SerializedName("id")
  private String id = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("cards")
  private List<Card> cards = new ArrayList<Card>();

  @SerializedName("given_name")
  private String givenName = null;

  @SerializedName("family_name")
  private String familyName = null;

  @SerializedName("nickname")
  private String nickname = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("email_address")
  private String emailAddress = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("reference_id")
  private String referenceId = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("preferences")
  private CustomerPreferences preferences = null;

  @SerializedName("groups")
  private List<CustomerGroupInfo> groups = new ArrayList<CustomerGroupInfo>();

  public Customer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The customer's unique ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The customer's unique ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Customer createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the customer was created, in RFC 3339 format.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The time when the customer was created, in RFC 3339 format.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Customer updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time when the customer was last updated, in RFC 3339 format.
   * @return updatedAt
  **/
  @ApiModelProperty(required = true, value = "The time when the customer was last updated, in RFC 3339 format.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Customer cards(List<Card> cards) {
    this.cards = cards;
    return this;
  }

  public Customer addCardsItem(Card cardsItem) {
    this.cards.add(cardsItem);
    return this;
  }

   /**
   * The non-confidential details of the customer's cards on file.
   * @return cards
  **/
  @ApiModelProperty(value = "The non-confidential details of the customer's cards on file.")
  public List<Card> getCards() {
    return cards;
  }

  public void setCards(List<Card> cards) {
    this.cards = cards;
  }

  public Customer givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * The customer's given (i.e., first) name.
   * @return givenName
  **/
  @ApiModelProperty(value = "The customer's given (i.e., first) name.")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public Customer familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * The customer's family (i.e., last) name.
   * @return familyName
  **/
  @ApiModelProperty(value = "The customer's family (i.e., last) name.")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public Customer nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * The customer's nickname.
   * @return nickname
  **/
  @ApiModelProperty(value = "The customer's nickname.")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public Customer companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * The name of the customer's company.
   * @return companyName
  **/
  @ApiModelProperty(value = "The name of the customer's company.")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Customer emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The customer's email address.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The customer's email address.")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Customer address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * The customer's physical address.
   * @return address
  **/
  @ApiModelProperty(value = "The customer's physical address.")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Customer phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The customer's phone number.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The customer's phone number.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Customer referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * A second ID you can set to associate the customer with an entity in another system.
   * @return referenceId
  **/
  @ApiModelProperty(value = "A second ID you can set to associate the customer with an entity in another system.")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public Customer note(String note) {
    this.note = note;
    return this;
  }

   /**
   * A note to associate with the customer.
   * @return note
  **/
  @ApiModelProperty(value = "A note to associate with the customer.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Customer preferences(CustomerPreferences preferences) {
    this.preferences = preferences;
    return this;
  }

   /**
   * The customer's preferences.
   * @return preferences
  **/
  @ApiModelProperty(value = "The customer's preferences.")
  public CustomerPreferences getPreferences() {
    return preferences;
  }

  public void setPreferences(CustomerPreferences preferences) {
    this.preferences = preferences;
  }

  public Customer groups(List<CustomerGroupInfo> groups) {
    this.groups = groups;
    return this;
  }

  public Customer addGroupsItem(CustomerGroupInfo groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * The groups the customer belongs to.
   * @return groups
  **/
  @ApiModelProperty(value = "The groups the customer belongs to.")
  public List<CustomerGroupInfo> getGroups() {
    return groups;
  }

  public void setGroups(List<CustomerGroupInfo> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.createdAt, customer.createdAt) &&
        Objects.equals(this.updatedAt, customer.updatedAt) &&
        Objects.equals(this.cards, customer.cards) &&
        Objects.equals(this.givenName, customer.givenName) &&
        Objects.equals(this.familyName, customer.familyName) &&
        Objects.equals(this.nickname, customer.nickname) &&
        Objects.equals(this.companyName, customer.companyName) &&
        Objects.equals(this.emailAddress, customer.emailAddress) &&
        Objects.equals(this.address, customer.address) &&
        Objects.equals(this.phoneNumber, customer.phoneNumber) &&
        Objects.equals(this.referenceId, customer.referenceId) &&
        Objects.equals(this.note, customer.note) &&
        Objects.equals(this.preferences, customer.preferences) &&
        Objects.equals(this.groups, customer.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, updatedAt, cards, givenName, familyName, nickname, companyName, emailAddress, address, phoneNumber, referenceId, note, preferences, groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

