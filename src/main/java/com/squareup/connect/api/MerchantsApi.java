package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.ApiClient;
import com.squareup.connect.Configuration;
import com.squareup.connect.Pair;
import com.squareup.connect.CompleteResponse;

import javax.ws.rs.core.GenericType;

import com.squareup.connect.models.ListMerchantsResponse;
import com.squareup.connect.models.RetrieveMerchantResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MerchantsApi {
  private ApiClient apiClient;

  public MerchantsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MerchantsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * ListMerchants
   * Returns &#x60;Merchant&#x60; information for a given access token.  If you don&#39;t know a &#x60;Merchant&#x60; ID, you can use this endpoint to retrieve the merchant ID for an access token. You can specify your personal access token to get your own merchant information or specify an OAuth token to get the information for the  merchant that granted you access.  If you know the merchant ID, you can also use the [RetrieveMerchant](#endpoint-merchants-retrievemerchant)  endpoint to get the merchant information.
   * @return ListMerchantsResponse
   * @throws ApiException if fails to make API call
   */
  public ListMerchantsResponse listMerchants() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/merchants";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-10-23");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<ListMerchantsResponse> localVarReturnType = new GenericType<ListMerchantsResponse>() {};
    CompleteResponse<ListMerchantsResponse> completeResponse = (CompleteResponse<ListMerchantsResponse>)apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return completeResponse.getData();
      }

  /**
   * ListMerchants
   * Returns &#x60;Merchant&#x60; information for a given access token.  If you don&#39;t know a &#x60;Merchant&#x60; ID, you can use this endpoint to retrieve the merchant ID for an access token. You can specify your personal access token to get your own merchant information or specify an OAuth token to get the information for the  merchant that granted you access.  If you know the merchant ID, you can also use the [RetrieveMerchant](#endpoint-merchants-retrievemerchant)  endpoint to get the merchant information.
   * @return CompleteResponse<ListMerchantsResponse>
   * @throws ApiException if fails to make API call
   */
  public CompleteResponse<ListMerchantsResponse>listMerchantsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v2/merchants";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-10-23");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<ListMerchantsResponse> localVarReturnType = new GenericType<ListMerchantsResponse>() {};
    return (CompleteResponse<ListMerchantsResponse>)apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
  /**
   * RetrieveMerchant
   * Retrieve a &#x60;Merchant&#x60; object for the given &#x60;merchant_id&#x60;.
   * @param merchantId The ID of the merchant to retrieve. (required)
   * @return RetrieveMerchantResponse
   * @throws ApiException if fails to make API call
   */
  public RetrieveMerchantResponse retrieveMerchant(String merchantId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'merchantId' is set
    if (merchantId == null) {
      throw new ApiException(400, "Missing the required parameter 'merchantId' when calling retrieveMerchant");
    }
    
    // create path and map variables
    String localVarPath = "/v2/merchants/{merchant_id}"
      .replaceAll("\\{" + "merchant_id" + "\\}", apiClient.escapeString(merchantId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-10-23");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<RetrieveMerchantResponse> localVarReturnType = new GenericType<RetrieveMerchantResponse>() {};
    CompleteResponse<RetrieveMerchantResponse> completeResponse = (CompleteResponse<RetrieveMerchantResponse>)apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return completeResponse.getData();
      }

  /**
   * RetrieveMerchant
   * Retrieve a &#x60;Merchant&#x60; object for the given &#x60;merchant_id&#x60;.
   * @param merchantId The ID of the merchant to retrieve. (required)
   * @return CompleteResponse<RetrieveMerchantResponse>
   * @throws ApiException if fails to make API call
   */
  public CompleteResponse<RetrieveMerchantResponse>retrieveMerchantWithHttpInfo(String merchantId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'merchantId' is set
    if (merchantId == null) {
      throw new ApiException(400, "Missing the required parameter 'merchantId' when calling retrieveMerchant");
    }
    
    // create path and map variables
    String localVarPath = "/v2/merchants/{merchant_id}"
      .replaceAll("\\{" + "merchant_id" + "\\}", apiClient.escapeString(merchantId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    localVarHeaderParams.put("Square-Version", "2019-10-23");

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<RetrieveMerchantResponse> localVarReturnType = new GenericType<RetrieveMerchantResponse>() {};
    return (CompleteResponse<RetrieveMerchantResponse>)apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
