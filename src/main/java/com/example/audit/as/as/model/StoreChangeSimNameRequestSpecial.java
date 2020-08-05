/*
 * Audit Service
 * Сервис для аудита действий пользователя в ЛК
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.example.audit.as.as.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * StoreChangeSimNameRequestSpecial
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T17:20:45.982+03:00")
public class StoreChangeSimNameRequestSpecial {
  @JsonProperty("oldSimName")
  private String oldSimName = null;

  @JsonProperty("newSimName")
  private String newSimName = null;

  @JsonProperty("iccid")
  private String iccid = null;

  public StoreChangeSimNameRequestSpecial oldSimName(String oldSimName) {
    this.oldSimName = oldSimName;
    return this;
  }

   /**
   * Get oldSimName
   * @return oldSimName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOldSimName() {
    return oldSimName;
  }

  public void setOldSimName(String oldSimName) {
    this.oldSimName = oldSimName;
  }

  public StoreChangeSimNameRequestSpecial newSimName(String newSimName) {
    this.newSimName = newSimName;
    return this;
  }

   /**
   * Get newSimName
   * @return newSimName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNewSimName() {
    return newSimName;
  }

  public void setNewSimName(String newSimName) {
    this.newSimName = newSimName;
  }

  public StoreChangeSimNameRequestSpecial iccid(String iccid) {
    this.iccid = iccid;
    return this;
  }

   /**
   * Get iccid
   * @return iccid
  **/
  @ApiModelProperty(required = true, value = "")
  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreChangeSimNameRequestSpecial storeChangeSimNameRequestSpecial = (StoreChangeSimNameRequestSpecial) o;
    return Objects.equals(this.oldSimName, storeChangeSimNameRequestSpecial.oldSimName) &&
        Objects.equals(this.newSimName, storeChangeSimNameRequestSpecial.newSimName) &&
        Objects.equals(this.iccid, storeChangeSimNameRequestSpecial.iccid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldSimName, newSimName, iccid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreChangeSimNameRequestSpecial {\n");

    sb.append("    oldSimName: ").append(toIndentedString(oldSimName)).append("\n");
    sb.append("    newSimName: ").append(toIndentedString(newSimName)).append("\n");
    sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

