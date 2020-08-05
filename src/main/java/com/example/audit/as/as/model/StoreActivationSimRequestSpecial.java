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
 * StoreActivationSimRequestSpecial
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T17:20:45.982+03:00")
public class StoreActivationSimRequestSpecial {
  @JsonProperty("iccid")
  private String iccid = null;

  @JsonProperty("msisdn")
  private String msisdn = null;

  @JsonProperty("productId")
  private String productId = null;

  @JsonProperty("region")
  private String region = null;

  public StoreActivationSimRequestSpecial iccid(String iccid) {
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

  public StoreActivationSimRequestSpecial msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

   /**
   * Get msisdn
   * @return msisdn
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public StoreActivationSimRequestSpecial productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public StoreActivationSimRequestSpecial region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreActivationSimRequestSpecial storeActivationSimRequestSpecial = (StoreActivationSimRequestSpecial) o;
    return Objects.equals(this.iccid, storeActivationSimRequestSpecial.iccid) &&
        Objects.equals(this.msisdn, storeActivationSimRequestSpecial.msisdn) &&
        Objects.equals(this.productId, storeActivationSimRequestSpecial.productId) &&
        Objects.equals(this.region, storeActivationSimRequestSpecial.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iccid, msisdn, productId, region);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreActivationSimRequestSpecial {\n");

    sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
