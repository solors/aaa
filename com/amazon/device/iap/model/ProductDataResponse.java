package com.amazon.device.iap.model;

import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.p047a.p048a.p071o.Validator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ProductDataResponse {
    private static final String PRODUCT_DATA = "productData";
    private static final String REQUEST_ID = "requestId";
    private static final String REQUEST_STATUS = "requestStatus";
    private static final String TO_STRING_FORMAT = "(%s, requestId: \"%s\", unavailableSkus: %s, requestStatus: \"%s\", productData: %s)";
    private static final String UNAVAILABLE_SKUS = "UNAVAILABLE_SKUS";
    private final Map<String, Product> productData;
    private final RequestId requestId;
    private final RequestStatus requestStatus;
    private final Set<String> unavailableSkus;

    /* loaded from: classes2.dex */
    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        NOT_SUPPORTED
    }

    public ProductDataResponse(ProductDataResponseBuilder productDataResponseBuilder) {
        Validator.m102807a(productDataResponseBuilder.getRequestId(), "requestId");
        Validator.m102807a(productDataResponseBuilder.getRequestStatus(), "requestStatus");
        if (productDataResponseBuilder.getUnavailableSkus() == null) {
            productDataResponseBuilder.setUnavailableSkus(new HashSet());
        }
        if (RequestStatus.SUCCESSFUL == productDataResponseBuilder.getRequestStatus()) {
            Validator.m102807a(productDataResponseBuilder.getProductData(), PRODUCT_DATA);
        } else {
            productDataResponseBuilder.setProductData(new HashMap());
        }
        this.requestId = productDataResponseBuilder.getRequestId();
        this.requestStatus = productDataResponseBuilder.getRequestStatus();
        this.unavailableSkus = productDataResponseBuilder.getUnavailableSkus();
        this.productData = productDataResponseBuilder.getProductData();
    }

    public Map<String, Product> getProductData() {
        return this.productData;
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public Set<String> getUnavailableSkus() {
        return this.unavailableSkus;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestId", this.requestId);
        jSONObject.put(UNAVAILABLE_SKUS, this.unavailableSkus);
        jSONObject.put("requestStatus", this.requestStatus);
        JSONObject jSONObject2 = new JSONObject();
        Map<String, Product> map = this.productData;
        if (map != null) {
            for (String str : map.keySet()) {
                jSONObject2.put(str, this.productData.get(str).toJSON());
            }
        }
        jSONObject.put(PRODUCT_DATA, jSONObject2);
        return jSONObject;
    }

    public String toString() {
        String str;
        String str2;
        Object[] objArr = new Object[5];
        objArr[0] = super.toString();
        objArr[1] = this.requestId;
        Set<String> set = this.unavailableSkus;
        String str3 = "null";
        if (set == null) {
            str = "null";
        } else {
            str = set.toString();
        }
        objArr[2] = str;
        RequestStatus requestStatus = this.requestStatus;
        if (requestStatus == null) {
            str2 = "null";
        } else {
            str2 = requestStatus.toString();
        }
        objArr[3] = str2;
        Map<String, Product> map = this.productData;
        if (map != null) {
            str3 = map.toString();
        }
        objArr[4] = str3;
        return String.format(TO_STRING_FORMAT, objArr);
    }
}
