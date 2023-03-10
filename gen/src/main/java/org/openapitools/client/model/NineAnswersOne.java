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
 * 6. Что мешает Вам оформить заказ на доставку в мобильном приложения SLQ или на сайте SLQ.KZ?
 */
@ApiModel(description = "6. Что мешает Вам оформить заказ на доставку в мобильном приложения SLQ или на сайте SLQ.KZ?")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T14:41:30.215620881+06:00[Asia/Almaty]")
public class NineAnswersOne {
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
  private String five;

  public static final String SERIALIZED_NAME_SIX = "six";
  @SerializedName(SERIALIZED_NAME_SIX)
  private String six;

  public static final String SERIALIZED_NAME_SEVEN = "seven";
  @SerializedName(SERIALIZED_NAME_SEVEN)
  private String seven;

  public static final String SERIALIZED_NAME_EIGHT = "eight";
  @SerializedName(SERIALIZED_NAME_EIGHT)
  private String eight;

  public static final String SERIALIZED_NAME_NINE = "nine";
  @SerializedName(SERIALIZED_NAME_NINE)
  private String nine;


  public NineAnswersOne one(String one) {
    
    this.one = one;
    return this;
  }

   /**
   * Неудобный калькулятор (напишите, что именно неудобно)
   * @return one
  **/
  @ApiModelProperty(required = true, value = "Неудобный калькулятор (напишите, что именно неудобно)")

  public String getOne() {
    return one;
  }


  public void setOne(String one) {
    this.one = one;
  }


  public NineAnswersOne two(String two) {
    
    this.two = two;
    return this;
  }

   /**
   * Непонятно, как выбрать вариант доставки
   * @return two
  **/
  @ApiModelProperty(required = true, value = "Непонятно, как выбрать вариант доставки")

  public String getTwo() {
    return two;
  }


  public void setTwo(String two) {
    this.two = two;
  }


  public NineAnswersOne three(String three) {
    
    this.three = three;
    return this;
  }

   /**
   * Много заполнять (напишите, что именно заполнять много)
   * @return three
  **/
  @ApiModelProperty(required = true, value = "Много заполнять (напишите, что именно заполнять много)")

  public String getThree() {
    return three;
  }


  public void setThree(String three) {
    this.three = three;
  }


  public NineAnswersOne four(String four) {
    
    this.four = four;
    return this;
  }

   /**
   * Плохой поиск по населенному пункту (напишите, что именно не устраивает в поиске)
   * @return four
  **/
  @ApiModelProperty(required = true, value = "Плохой поиск по населенному пункту (напишите, что именно не устраивает в поиске)")

  public String getFour() {
    return four;
  }


  public void setFour(String four) {
    this.four = four;
  }


  public NineAnswersOne five(String five) {
    
    this.five = five;
    return this;
  }

   /**
   * Нет выбора адреса по карте
   * @return five
  **/
  @ApiModelProperty(required = true, value = "Нет выбора адреса по карте")

  public String getFive() {
    return five;
  }


  public void setFive(String five) {
    this.five = five;
  }


  public NineAnswersOne six(String six) {
    
    this.six = six;
    return this;
  }

   /**
   * Непонятно, что такое платный вес
   * @return six
  **/
  @ApiModelProperty(required = true, value = "Непонятно, что такое платный вес")

  public String getSix() {
    return six;
  }


  public void setSix(String six) {
    this.six = six;
  }


  public NineAnswersOne seven(String seven) {
    
    this.seven = seven;
    return this;
  }

   /**
   * Непонятно, что такое объявленная ценность
   * @return seven
  **/
  @ApiModelProperty(required = true, value = "Непонятно, что такое объявленная ценность")

  public String getSeven() {
    return seven;
  }


  public void setSeven(String seven) {
    this.seven = seven;
  }


  public NineAnswersOne eight(String eight) {
    
    this.eight = eight;
    return this;
  }

   /**
   * Проблемы с оплатой (напишите, какие именно)
   * @return eight
  **/
  @ApiModelProperty(required = true, value = "Проблемы с оплатой (напишите, какие именно)")

  public String getEight() {
    return eight;
  }


  public void setEight(String eight) {
    this.eight = eight;
  }


  public NineAnswersOne nine(String nine) {
    
    this.nine = nine;
    return this;
  }

   /**
   * Не доверяю (напишите, что нужно, чтобы возникло доверие)
   * @return nine
  **/
  @ApiModelProperty(required = true, value = "Не доверяю (напишите, что нужно, чтобы возникло доверие)")

  public String getNine() {
    return nine;
  }


  public void setNine(String nine) {
    this.nine = nine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NineAnswersOne nineAnswersOne = (NineAnswersOne) o;
    return Objects.equals(this.one, nineAnswersOne.one) &&
        Objects.equals(this.two, nineAnswersOne.two) &&
        Objects.equals(this.three, nineAnswersOne.three) &&
        Objects.equals(this.four, nineAnswersOne.four) &&
        Objects.equals(this.five, nineAnswersOne.five) &&
        Objects.equals(this.six, nineAnswersOne.six) &&
        Objects.equals(this.seven, nineAnswersOne.seven) &&
        Objects.equals(this.eight, nineAnswersOne.eight) &&
        Objects.equals(this.nine, nineAnswersOne.nine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(one, two, three, four, five, six, seven, eight, nine);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NineAnswersOne {\n");
    sb.append("    one: ").append(toIndentedString(one)).append("\n");
    sb.append("    two: ").append(toIndentedString(two)).append("\n");
    sb.append("    three: ").append(toIndentedString(three)).append("\n");
    sb.append("    four: ").append(toIndentedString(four)).append("\n");
    sb.append("    five: ").append(toIndentedString(five)).append("\n");
    sb.append("    six: ").append(toIndentedString(six)).append("\n");
    sb.append("    seven: ").append(toIndentedString(seven)).append("\n");
    sb.append("    eight: ").append(toIndentedString(eight)).append("\n");
    sb.append("    nine: ").append(toIndentedString(nine)).append("\n");
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

