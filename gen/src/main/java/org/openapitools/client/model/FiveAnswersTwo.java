/*
 * FormOne API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 2. Какую сумму в месяц Вы тратите на логистику между странами ЕАЭС (Казахстан, Россия, Беларусь, Киргизия, Армения)?
 */
@ApiModel(description = "2. Какую сумму в месяц Вы тратите на логистику между странами ЕАЭС (Казахстан, Россия, Беларусь, Киргизия, Армения)?")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T14:41:30.215620881+06:00[Asia/Almaty]")
public class FiveAnswersTwo {
  public static final String SERIALIZED_NAME_ONE = "one";
  @SerializedName(SERIALIZED_NAME_ONE)
  private String one;

  public static final String SERIALIZED_NAME_TWO = "two";
  @SerializedName(SERIALIZED_NAME_TWO)
  private String two;

  public static final String SERIALIZED_NAME_THREE = "three";
  @SerializedName(SERIALIZED_NAME_THREE)
  private String three;

  public static final String SERIALIZED_NAME_FOUR = "four";
  @SerializedName(SERIALIZED_NAME_FOUR)
  private String four;

  public static final String SERIALIZED_NAME_FIVE = "five";
  @SerializedName(SERIALIZED_NAME_FIVE)
  private Boolean five;


  public FiveAnswersTwo one(String one) {
    
    this.one = one;
    return this;
  }

   /**
   * Казахстан-Россия, Россия-Казахстан
   * @return one
  **/
  @ApiModelProperty(required = true, value = "Казахстан-Россия, Россия-Казахстан")

  public String getOne() {
    return one;
  }


  public void setOne(String one) {
    this.one = one;
  }


  public FiveAnswersTwo two(String two) {
    
    this.two = two;
    return this;
  }

   /**
   * Казахстан-Киргизия, Киргизия-Казахстан
   * @return two
  **/
  @ApiModelProperty(required = true, value = "Казахстан-Киргизия, Киргизия-Казахстан")

  public String getTwo() {
    return two;
  }


  public void setTwo(String two) {
    this.two = two;
  }


  public FiveAnswersTwo three(String three) {
    
    this.three = three;
    return this;
  }

   /**
   * Казахстан-Беларусь, Беларусь-Казахстан
   * @return three
  **/
  @ApiModelProperty(required = true, value = "Казахстан-Беларусь, Беларусь-Казахстан")

  public String getThree() {
    return three;
  }


  public void setThree(String three) {
    this.three = three;
  }


  public FiveAnswersTwo four(String four) {
    
    this.four = four;
    return this;
  }

   /**
   * Казахстан-Армения, Армения-Казахстан
   * @return four
  **/
  @ApiModelProperty(required = true, value = "Казахстан-Армения, Армения-Казахстан")

  public String getFour() {
    return four;
  }


  public void setFour(String four) {
    this.four = four;
  }


  public FiveAnswersTwo five(Boolean five) {
    
    this.five = five;
    return this;
  }

   /**
   * Нету отправок по данным направлениям
   * @return five
  **/
  @ApiModelProperty(required = true, value = "Нету отправок по данным направлениям")

  public Boolean getFive() {
    return five;
  }


  public void setFive(Boolean five) {
    this.five = five;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiveAnswersTwo fiveAnswersTwo = (FiveAnswersTwo) o;
    return Objects.equals(this.one, fiveAnswersTwo.one) &&
        Objects.equals(this.two, fiveAnswersTwo.two) &&
        Objects.equals(this.three, fiveAnswersTwo.three) &&
        Objects.equals(this.four, fiveAnswersTwo.four) &&
        Objects.equals(this.five, fiveAnswersTwo.five);
  }

  @Override
  public int hashCode() {
    return Objects.hash(one, two, three, four, five);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiveAnswersTwo {\n");
    sb.append("    one: ").append(toIndentedString(one)).append("\n");
    sb.append("    two: ").append(toIndentedString(two)).append("\n");
    sb.append("    three: ").append(toIndentedString(three)).append("\n");
    sb.append("    four: ").append(toIndentedString(four)).append("\n");
    sb.append("    five: ").append(toIndentedString(five)).append("\n");
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

