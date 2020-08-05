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
 * StoreChangePhoneEmailRequestSpecial
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T17:20:45.982+03:00")
public class StoreChangePhoneEmailRequestSpecial {
  @JsonProperty("oldEmail")
  private String oldEmail = null;

  @JsonProperty("newEmail")
  private String newEmail = null;

  @JsonProperty("oldMsisdn")
  private String oldMsisdn = null;

  @JsonProperty("newMsisdn")
  private String newMsisdn = null;

  public StoreChangePhoneEmailRequestSpecial oldEmail(String oldEmail) {
    this.oldEmail = oldEmail;
    return this;
  }

   /**
   * Заполняется только при изменении email
   * @return oldEmail
  **/
  @ApiModelProperty(value = "Заполняется только при изменении email")
  public String getOldEmail() {
    return oldEmail;
  }

  public void setOldEmail(String oldEmail) {
    this.oldEmail = oldEmail;
  }

  public StoreChangePhoneEmailRequestSpecial newEmail(String newEmail) {
    this.newEmail = newEmail;
    return this;
  }

   /**
   * Заполняется только при изменении email
   * @return newEmail
  **/
  @ApiModelProperty(value = "Заполняется только при изменении email")
  public String getNewEmail() {
    return newEmail;
  }

  public void setNewEmail(String newEmail) {
    this.newEmail = newEmail;
  }

  public StoreChangePhoneEmailRequestSpecial oldMsisdn(String oldMsisdn) {
    this.oldMsisdn = oldMsisdn;
    return this;
  }

   /**
   * Заполняется только при изменении msisdn
   * @return oldMsisdn
  **/
  @ApiModelProperty(value = "Заполняется только при изменении msisdn")
  public String getOldMsisdn() {
    return oldMsisdn;
  }

  public void setOldMsisdn(String oldMsisdn) {
    this.oldMsisdn = oldMsisdn;
  }

  public StoreChangePhoneEmailRequestSpecial newMsisdn(String newMsisdn) {
    this.newMsisdn = newMsisdn;
    return this;
  }

   /**
   * Заполняется только при изменении msisdn
   * @return newMsisdn
  **/
  @ApiModelProperty(value = "Заполняется только при изменении msisdn")
  public String getNewMsisdn() {
    return newMsisdn;
  }

  public void setNewMsisdn(String newMsisdn) {
    this.newMsisdn = newMsisdn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreChangePhoneEmailRequestSpecial storeChangePhoneEmailRequestSpecial = (StoreChangePhoneEmailRequestSpecial) o;
    return Objects.equals(this.oldEmail, storeChangePhoneEmailRequestSpecial.oldEmail) &&
        Objects.equals(this.newEmail, storeChangePhoneEmailRequestSpecial.newEmail) &&
        Objects.equals(this.oldMsisdn, storeChangePhoneEmailRequestSpecial.oldMsisdn) &&
        Objects.equals(this.newMsisdn, storeChangePhoneEmailRequestSpecial.newMsisdn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldEmail, newEmail, oldMsisdn, newMsisdn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreChangePhoneEmailRequestSpecial {\n");

    sb.append("    oldEmail: ").append(toIndentedString(oldEmail)).append("\n");
    sb.append("    newEmail: ").append(toIndentedString(newEmail)).append("\n");
    sb.append("    oldMsisdn: ").append(toIndentedString(oldMsisdn)).append("\n");
    sb.append("    newMsisdn: ").append(toIndentedString(newMsisdn)).append("\n");
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

