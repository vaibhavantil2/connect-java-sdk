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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1EmployeeRole
 */

public class V1EmployeeRole {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets permissions
   */
  public enum PermissionsEnum {
    @SerializedName("REGISTER_ACCESS_SALES_HISTORY")
    ACCESS_SALES_HISTORY("REGISTER_ACCESS_SALES_HISTORY"),
    
    @SerializedName("REGISTER_APPLY_RESTRICTED_DISCOUNTS")
    APPLY_RESTRICTED_DISCOUNTS("REGISTER_APPLY_RESTRICTED_DISCOUNTS"),
    
    @SerializedName("REGISTER_CHANGE_SETTINGS")
    CHANGE_SETTINGS("REGISTER_CHANGE_SETTINGS"),
    
    @SerializedName("REGISTER_EDIT_ITEM")
    EDIT_ITEM("REGISTER_EDIT_ITEM"),
    
    @SerializedName("REGISTER_ISSUE_REFUNDS")
    ISSUE_REFUNDS("REGISTER_ISSUE_REFUNDS"),
    
    @SerializedName("REGISTER_OPEN_CASH_DRAWER_OUTSIDE_SALE")
    OPEN_CASH_DRAWER_OUTSIDE_SALE("REGISTER_OPEN_CASH_DRAWER_OUTSIDE_SALE"),
    
    @SerializedName("REGISTER_VIEW_SUMMARY_REPORTS")
    VIEW_SUMMARY_REPORTS("REGISTER_VIEW_SUMMARY_REPORTS");

    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("permissions")
  private List<PermissionsEnum> permissions = new ArrayList<PermissionsEnum>();

  @SerializedName("is_owner")
  private Boolean isOwner = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

   /**
   * The role's unique ID, Can only be set by Square.
   * @return id
  **/
  @ApiModelProperty(value = "The role's unique ID, Can only be set by Square.")
  public String getId() {
    return id;
  }

  public V1EmployeeRole name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The role's merchant-defined name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The role's merchant-defined name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1EmployeeRole permissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
    return this;
  }

  public V1EmployeeRole addPermissionsItem(PermissionsEnum permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * The role's permissions.
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "The role's permissions.")
  public List<PermissionsEnum> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
  }

  public V1EmployeeRole isOwner(Boolean isOwner) {
    this.isOwner = isOwner;
    return this;
  }

   /**
   * If true, employees with this role have all permissions, regardless of the values indicated in permissions.
   * @return isOwner
  **/
  @ApiModelProperty(value = "If true, employees with this role have all permissions, regardless of the values indicated in permissions.")
  public Boolean getIsOwner() {
    return isOwner;
  }

  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }

   /**
   * The time when the employee entity was created, in ISO 8601 format. Is set by Square when the Role is created.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time when the employee entity was created, in ISO 8601 format. Is set by Square when the Role is created.")
  public String getCreatedAt() {
    return createdAt;
  }

   /**
   * The time when the employee entity was most recently updated, in ISO 8601 format. Is set by Square when the Role updated.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "The time when the employee entity was most recently updated, in ISO 8601 format. Is set by Square when the Role updated.")
  public String getUpdatedAt() {
    return updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EmployeeRole v1EmployeeRole = (V1EmployeeRole) o;
    return Objects.equals(this.id, v1EmployeeRole.id) &&
        Objects.equals(this.name, v1EmployeeRole.name) &&
        Objects.equals(this.permissions, v1EmployeeRole.permissions) &&
        Objects.equals(this.isOwner, v1EmployeeRole.isOwner) &&
        Objects.equals(this.createdAt, v1EmployeeRole.createdAt) &&
        Objects.equals(this.updatedAt, v1EmployeeRole.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, permissions, isOwner, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EmployeeRole {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

