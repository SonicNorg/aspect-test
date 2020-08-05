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
 * Модель запроса для операции storeChangeSimName
 */
@ApiModel(description = "Модель запроса для операции storeChangeSimName")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-19T17:20:45.982+03:00")
public class StoreChangeSimNameRequest {
  @JsonProperty("common")
  private CommonParams common = null;

  @JsonProperty("special")
  private StoreChangeSimNameRequestSpecial special = null;

  public StoreChangeSimNameRequest common(CommonParams common) {
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

  public StoreChangeSimNameRequest special(StoreChangeSimNameRequestSpecial special) {
    this.special = special;
    return this;
  }

   /**
   * Get special
   * @return special
  **/
  @ApiModelProperty(required = true, value = "")
  public StoreChangeSimNameRequestSpecial getSpecial() {
    return special;
  }

  public void setSpecial(StoreChangeSimNameRequestSpecial special) {
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
    StoreChangeSimNameRequest storeChangeSimNameRequest = (StoreChangeSimNameRequest) o;
    return Objects.equals(this.common, storeChangeSimNameRequest.common) &&
        Objects.equals(this.special, storeChangeSimNameRequest.special);
  }

  @Override
  public int hashCode() {
    return Objects.hash(common, special);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreChangeSimNameRequest {\n");

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

