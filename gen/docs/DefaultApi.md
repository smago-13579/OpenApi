# DefaultApi

All URIs are relative to *https://178.89.107.227*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderProtectedOpinionIdGet**](DefaultApi.md#orderProtectedOpinionIdGet) | **GET** /order/protected/opinion/{id} | 
[**orderProtectedOpinionIdPost**](DefaultApi.md#orderProtectedOpinionIdPost) | **POST** /order/protected/opinion/{id} | 


<a name="orderProtectedOpinionIdGet"></a>
# **orderProtectedOpinionIdGet**
> Form orderProtectedOpinionIdGet(id)



Check that the form has already been filled out and sent

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://178.89.107.227");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer id = 1; // Integer | 
    try {
      Form result = apiInstance.orderProtectedOpinionIdGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#orderProtectedOpinionIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**Form**](Form.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Need to check the body of the response |  -  |
**401** | Access token is missing or invalid |  -  |

<a name="orderProtectedOpinionIdPost"></a>
# **orderProtectedOpinionIdPost**
> orderProtectedOpinionIdPost(id, formOneDTO)



Submit a new form

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://178.89.107.227");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer id = 1; // Integer | 
    FormOneDTO formOneDTO = new FormOneDTO(); // FormOneDTO | Users form with answers
    try {
      apiInstance.orderProtectedOpinionIdPost(id, formOneDTO);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#orderProtectedOpinionIdPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **formOneDTO** | [**FormOneDTO**](FormOneDTO.md)| Users form with answers | [optional]

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. The form has been sent |  -  |
**401** | Access token is missing or invalid |  -  |
**409** | The user has already submitted the form |  -  |

