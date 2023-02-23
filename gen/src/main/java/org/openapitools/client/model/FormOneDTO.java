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
import org.openapitools.client.model.FiveAnswersOne;
import org.openapitools.client.model.FiveAnswersTwo;
import org.openapitools.client.model.NineAnswersOne;
import org.openapitools.client.model.NineAnswersTwo;

/**
 * answers to questions
 */
@ApiModel(description = "answers to questions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T14:41:30.215620881+06:00[Asia/Almaty]")
public class FormOneDTO {
  public static final String SERIALIZED_NAME_ONE = "one";
  @SerializedName(SERIALIZED_NAME_ONE)
  private FiveAnswersOne one;

  public static final String SERIALIZED_NAME_TWO = "two";
  @SerializedName(SERIALIZED_NAME_TWO)
  private FiveAnswersTwo two;

  public static final String SERIALIZED_NAME_THREE = "three";
  @SerializedName(SERIALIZED_NAME_THREE)
  private String three;

  public static final String SERIALIZED_NAME_FOUR = "four";
  @SerializedName(SERIALIZED_NAME_FOUR)
  private String four;

  public static final String SERIALIZED_NAME_FOUR_ONE = "fourOne";
  @SerializedName(SERIALIZED_NAME_FOUR_ONE)
  private String fourOne;

  public static final String SERIALIZED_NAME_FIVE = "five";
  @SerializedName(SERIALIZED_NAME_FIVE)
  private Integer five;

  public static final String SERIALIZED_NAME_SIX = "six";
  @SerializedName(SERIALIZED_NAME_SIX)
  private NineAnswersOne six;

  public static final String SERIALIZED_NAME_SEVEN = "seven";
  @SerializedName(SERIALIZED_NAME_SEVEN)
  private String seven;

  public static final String SERIALIZED_NAME_EIGHT = "eight";
  @SerializedName(SERIALIZED_NAME_EIGHT)
  private NineAnswersTwo eight;

  public static final String SERIALIZED_NAME_NINE = "nine";
  @SerializedName(SERIALIZED_NAME_NINE)
  private String nine;

  public static final String SERIALIZED_NAME_TEN = "ten";
  @SerializedName(SERIALIZED_NAME_TEN)
  private Integer ten;


  public FormOneDTO one(FiveAnswersOne one) {
    
    this.one = one;
    return this;
  }

   /**
   * Get one
   * @return one
  **/
  @ApiModelProperty(required = true, value = "")

  public FiveAnswersOne getOne() {
    return one;
  }


  public void setOne(FiveAnswersOne one) {
    this.one = one;
  }


  public FormOneDTO two(FiveAnswersTwo two) {
    
    this.two = two;
    return this;
  }

   /**
   * Get two
   * @return two
  **/
  @ApiModelProperty(required = true, value = "")

  public FiveAnswersTwo getTwo() {
    return two;
  }


  public void setTwo(FiveAnswersTwo two) {
    this.two = two;
  }


  public FormOneDTO three(String three) {
    
    this.three = three;
    return this;
  }

   /**
   * 3. Какие виды товаров Вы отправляете между странами ЕАЭС (Казахстан, Россия, Беларусь, Киргизия, Армения)?
   * @return three
  **/
  @ApiModelProperty(required = true, value = "3. Какие виды товаров Вы отправляете между странами ЕАЭС (Казахстан, Россия, Беларусь, Киргизия, Армения)?")

  public String getThree() {
    return three;
  }


  public void setThree(String three) {
    this.three = three;
  }


  public FormOneDTO four(String four) {
    
    this.four = four;
    return this;
  }

   /**
   * 4. Требуется ли Вам дополнительные услуги по закупке товара в странах ЕАЭС (Казахстан, Россия, Беларусь, Киргизия, Армения) и продаже в Казахстане от казахстанского юр. лица?
   * @return four
  **/
  @ApiModelProperty(required = true, value = "4. Требуется ли Вам дополнительные услуги по закупке товара в странах ЕАЭС (Казахстан, Россия, Беларусь, Киргизия, Армения) и продаже в Казахстане от казахстанского юр. лица?")

  public String getFour() {
    return four;
  }


  public void setFour(String four) {
    this.four = four;
  }


  public FormOneDTO fourOne(String fourOne) {
    
    this.fourOne = fourOne;
    return this;
  }

   /**
   * 4.1. Укажите количество закупок и сумму товара для закупки в месяц.
   * @return fourOne
  **/
  @ApiModelProperty(required = true, value = "4.1. Укажите количество закупок и сумму товара для закупки в месяц.")

  public String getFourOne() {
    return fourOne;
  }


  public void setFourOne(String fourOne) {
    this.fourOne = fourOne;
  }


  public FormOneDTO five(Integer five) {
    
    this.five = five;
    return this;
  }

   /**
   * 5. Насколько Вам нравится дизайн мобильного приложения SLQ и сайта SLQ.KZ? По шкале от 1 до 10, где 1 – совершенно не нравится, 10 – всё идеально?
   * @return five
  **/
  @ApiModelProperty(required = true, value = "5. Насколько Вам нравится дизайн мобильного приложения SLQ и сайта SLQ.KZ? По шкале от 1 до 10, где 1 – совершенно не нравится, 10 – всё идеально?")

  public Integer getFive() {
    return five;
  }


  public void setFive(Integer five) {
    this.five = five;
  }


  public FormOneDTO six(NineAnswersOne six) {
    
    this.six = six;
    return this;
  }

   /**
   * Get six
   * @return six
  **/
  @ApiModelProperty(required = true, value = "")

  public NineAnswersOne getSix() {
    return six;
  }


  public void setSix(NineAnswersOne six) {
    this.six = six;
  }


  public FormOneDTO seven(String seven) {
    
    this.seven = seven;
    return this;
  }

   /**
   * 7. Что необходимо добавить или убрать в мобильном приложения SLQ или на сайте SLQ.KZ, чтобы повысить вероятность его использования сервиса Вами?
   * @return seven
  **/
  @ApiModelProperty(required = true, value = "7. Что необходимо добавить или убрать в мобильном приложения SLQ или на сайте SLQ.KZ, чтобы повысить вероятность его использования сервиса Вами?")

  public String getSeven() {
    return seven;
  }


  public void setSeven(String seven) {
    this.seven = seven;
  }


  public FormOneDTO eight(NineAnswersTwo eight) {
    
    this.eight = eight;
    return this;
  }

   /**
   * Get eight
   * @return eight
  **/
  @ApiModelProperty(required = true, value = "")

  public NineAnswersTwo getEight() {
    return eight;
  }


  public void setEight(NineAnswersTwo eight) {
    this.eight = eight;
  }


  public FormOneDTO nine(String nine) {
    
    this.nine = nine;
    return this;
  }

   /**
   * 9. Чем Вам удобнее пользоваться для оформления заказа на доставку?
   * @return nine
  **/
  @ApiModelProperty(required = true, value = "9. Чем Вам удобнее пользоваться для оформления заказа на доставку?")

  public String getNine() {
    return nine;
  }


  public void setNine(String nine) {
    this.nine = nine;
  }


  public FormOneDTO ten(Integer ten) {
    
    this.ten = ten;
    return this;
  }

   /**
   * 10. Порекомендуете ли Вы наш сервис своим друзьям/знакомым/партнерам? По шкале от 1 до 10, где 1 – буду молчать или даже отговаривать, 10 – конечно, ведь я менеджер по продажам SLQ.
   * @return ten
  **/
  @ApiModelProperty(required = true, value = "10. Порекомендуете ли Вы наш сервис своим друзьям/знакомым/партнерам? По шкале от 1 до 10, где 1 – буду молчать или даже отговаривать, 10 – конечно, ведь я менеджер по продажам SLQ.")

  public Integer getTen() {
    return ten;
  }


  public void setTen(Integer ten) {
    this.ten = ten;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormOneDTO formOneDTO = (FormOneDTO) o;
    return Objects.equals(this.one, formOneDTO.one) &&
        Objects.equals(this.two, formOneDTO.two) &&
        Objects.equals(this.three, formOneDTO.three) &&
        Objects.equals(this.four, formOneDTO.four) &&
        Objects.equals(this.fourOne, formOneDTO.fourOne) &&
        Objects.equals(this.five, formOneDTO.five) &&
        Objects.equals(this.six, formOneDTO.six) &&
        Objects.equals(this.seven, formOneDTO.seven) &&
        Objects.equals(this.eight, formOneDTO.eight) &&
        Objects.equals(this.nine, formOneDTO.nine) &&
        Objects.equals(this.ten, formOneDTO.ten);
  }

  @Override
  public int hashCode() {
    return Objects.hash(one, two, three, four, fourOne, five, six, seven, eight, nine, ten);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormOneDTO {\n");
    sb.append("    one: ").append(toIndentedString(one)).append("\n");
    sb.append("    two: ").append(toIndentedString(two)).append("\n");
    sb.append("    three: ").append(toIndentedString(three)).append("\n");
    sb.append("    four: ").append(toIndentedString(four)).append("\n");
    sb.append("    fourOne: ").append(toIndentedString(fourOne)).append("\n");
    sb.append("    five: ").append(toIndentedString(five)).append("\n");
    sb.append("    six: ").append(toIndentedString(six)).append("\n");
    sb.append("    seven: ").append(toIndentedString(seven)).append("\n");
    sb.append("    eight: ").append(toIndentedString(eight)).append("\n");
    sb.append("    nine: ").append(toIndentedString(nine)).append("\n");
    sb.append("    ten: ").append(toIndentedString(ten)).append("\n");
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

