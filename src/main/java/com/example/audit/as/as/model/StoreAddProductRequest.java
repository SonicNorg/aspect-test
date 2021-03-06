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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Модель запроса для операции storeAddProduct
 */
@ApiModel(description = "Модель запроса для операции storeAddProduct")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T17:20:45.982+03:00")
public class StoreAddProductRequest {
  @JsonProperty("common")
  private CommonParams common = null;

  @JsonProperty("special")
  private StoreAddProductRequestSpecial special = null;

  public StoreAddProductRequest common(CommonParams common) {
    this.common = common;
    return this;
  }

   /**
   * Get common
   * @return common
  **/
  @ApiModelProperty(required = true, value = "")
  public CommonParams getCommon() {
    return common;
  }

  public void setCommon(CommonParams common) {
    this.common = common;
  }

  public StoreAddProductRequest special(StoreAddProductRequestSpecial special) {
    this.special = special;
    return this;
  }

   /**
   * Get special
   * @return special
  **/
  @ApiModelProperty(required = true, value = "")
  public StoreAddProductRequestSpecial getSpecial() {
    return special;
  }

  public void setSpecial(StoreAddProductRequestSpecial special) {
    this.special = special;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreAddProductRequest storeAddProductRequest = (StoreAddProductRequest) o;
    return Objects.equals(this.common, storeAddProductRequest.common) &&
        Objects.equals(this.special, storeAddProductRequest.special);
  }

  @Override
  public int hashCode() {
    return Objects.hash(common, special);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreAddProductRequest {\n");

    sb.append("    common: ").append(toIndentedString(common)).append("\n");
    sb.append("    special: ").append(toIndentedString(special)).append("\n");
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

