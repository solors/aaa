package com.learnings.unity.purchase;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.learnings.purchase.ProductData;
import com.learnings.purchase.PurchaseData;
import com.learnings.purchase.PurchaseError;
import com.learnings.purchase.PurchaseManager;
import com.learnings.purchase.google.GoogleEventBuilder;
import com.learnings.purchase.restore.p404db.RestorePurchaseEntity;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.player.UnityPlayer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Utils {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getErrorJsonString(PurchaseError purchaseError) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", purchaseError.getCode());
            jSONObject.put("errorMessage", purchaseError.getMsg());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    static JSONObject getProductDataJson(ProductData productData) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", productData.getPlatform().getValue());
            jSONObject.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, productData.getProductId());
            jSONObject.put("type", productData.getType().getValue());
            jSONObject.put("title", productData.getTitle());
            jSONObject.put("description", productData.getDescription());
            jSONObject.put("displayPrice", productData.getDisplayPrice());
            jSONObject.put("priceAmountMicros", productData.getPriceAmountMicros());
            jSONObject.put("priceCurrencyCode", productData.getPriceCurrencyCode());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getProductDataJsonArrayString() {
        Map<String, ProductData> allProductData = PurchaseManager.getAllProductData();
        JSONArray jSONArray = new JSONArray();
        try {
            for (String str : allProductData.keySet()) {
                jSONArray.put(getProductDataJson(allProductData.get(str)));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONArray.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ProductData.ProductType getProductTypeByString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2102111499:
                if (str.equals("entitled")) {
                    c = 0;
                    break;
                }
                break;
            case -166371741:
                if (str.equals(RestorePurchaseEntity.RESTORE_TYPE_CONSUMABLE)) {
                    c = 1;
                    break;
                }
                break;
            case 341203229:
                if (str.equals(GoogleEventBuilder.PRODUCT_TYPE_SUB)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return ProductData.ProductType.ENTITLED;
            case 1:
                return ProductData.ProductType.CONSUMABLE;
            case 2:
                return ProductData.ProductType.SUBSCRIPTION;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject getPurchaseDataJson(PurchaseData purchaseData) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, purchaseData.getProductId());
            jSONObject.put("token", purchaseData.getToken());
            jSONObject.put("orderId", purchaseData.getOrderId());
            jSONObject.put("purchaseTime", purchaseData.getPurchaseTime());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getPurchaseDataJsonArrayString(List<PurchaseData> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (PurchaseData purchaseData : list) {
                jSONArray.put(getPurchaseDataJson(purchaseData));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONArray.toString();
    }

    static String getPurchaseJson(List<Purchase> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (Purchase purchase : list) {
                JSONObject jSONObject = new JSONObject(purchase.getOriginalJson());
                jSONObject.put("signature", purchase.getSignature());
                jSONArray.put(jSONObject);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONArray.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void runOnUiThread(Runnable runnable) {
        UnityPlayer.currentActivity.runOnUiThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle transformJsonToBundle(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    bundle.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                } else if (obj instanceof Long) {
                    bundle.putLong(next, ((Long) obj).longValue());
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getProductDataJsonArrayString(List<ProductData> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (ProductData productData : list) {
                jSONArray.put(getProductDataJson(productData));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONArray.toString();
    }
}
