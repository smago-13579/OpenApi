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
 * Form filled y/n
 */
@ApiModel(description = "Form filled y/n")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T14:41:30.215620881+06:00[Asia/Almaty]")
public class Form {
  public static final String SERIALIZED_NAME_FORM_FOUND = "formFound";
  @SerializedName(SERIALIZED_NAME_FORM_FOUND)
  private Boolean formFound;


  public Form formFound(Boolean formFound) {
    
    this.formFound = formFound;
    return this;
  }

   /**
   * true means that the form has already been filled out and submitted
   * @return formFound
  **/
  @ApiModelProperty(required = true, value = "true means that the form has already been filled out and submitted")

  public Boolean getFormFound() {
    return formFound;
  }


  public void setFormFound(Boolean formFound) {
    this.formFound = formFound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Form form = (Form) o;
    return Objects.equals(this.formFound, form.formFound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formFound);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Form {\n");
    sb.append("    formFound: ").append(toIndentedString(formFound)).append("\n");
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

