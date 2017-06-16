/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.api;

import com.squareup.connect.ApiCallback;
import com.squareup.connect.ApiClient;
import com.squareup.connect.ApiException;
import com.squareup.connect.ApiResponse;
import com.squareup.connect.Configuration;
import com.squareup.connect.Pair;
import com.squareup.connect.ProgressRequestBody;
import com.squareup.connect.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.squareup.connect.models.CreateCheckoutRequest;
import com.squareup.connect.models.CreateCheckoutResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckoutApi {
    private ApiClient apiClient;

    public CheckoutApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CheckoutApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createCheckout
     * @param locationId The ID of the business location to associate the checkout with. (required)
     * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCheckoutCall(String locationId, CreateCheckoutRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v2/locations/{location_id}/checkouts"
            .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createCheckoutValidateBeforeCall(String locationId, CreateCheckoutRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new ApiException("Missing the required parameter 'locationId' when calling createCheckout(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createCheckout(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createCheckoutCall(locationId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * CreateCheckout
     * Creates a [Checkout](#type-checkout) response that links a &#x60;checkoutId&#x60; and &#x60;checkout_page_url&#x60; that customers can be directed to in order to provide their payment information using a payment processing workflow hosted on connect.squareup.com.
     * @param locationId The ID of the business location to associate the checkout with. (required)
     * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
     * @return CreateCheckoutResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateCheckoutResponse createCheckout(String locationId, CreateCheckoutRequest body) throws ApiException {
        ApiResponse<CreateCheckoutResponse> resp = createCheckoutWithHttpInfo(locationId, body);
        return resp.getData();
    }

    /**
     * CreateCheckout
     * Creates a [Checkout](#type-checkout) response that links a &#x60;checkoutId&#x60; and &#x60;checkout_page_url&#x60; that customers can be directed to in order to provide their payment information using a payment processing workflow hosted on connect.squareup.com.
     * @param locationId The ID of the business location to associate the checkout with. (required)
     * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
     * @return ApiResponse&lt;CreateCheckoutResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateCheckoutResponse> createCheckoutWithHttpInfo(String locationId, CreateCheckoutRequest body) throws ApiException {
        com.squareup.okhttp.Call call = createCheckoutValidateBeforeCall(locationId, body, null, null);
        Type localVarReturnType = new TypeToken<CreateCheckoutResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * CreateCheckout (asynchronously)
     * Creates a [Checkout](#type-checkout) response that links a &#x60;checkoutId&#x60; and &#x60;checkout_page_url&#x60; that customers can be directed to in order to provide their payment information using a payment processing workflow hosted on connect.squareup.com.
     * @param locationId The ID of the business location to associate the checkout with. (required)
     * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createCheckoutAsync(String locationId, CreateCheckoutRequest body, final ApiCallback<CreateCheckoutResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createCheckoutValidateBeforeCall(locationId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateCheckoutResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
