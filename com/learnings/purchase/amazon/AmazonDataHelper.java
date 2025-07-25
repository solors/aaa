package com.learnings.purchase.amazon;

import android.text.TextUtils;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.learnings.purchase.Platform;
import com.learnings.purchase.ProductData;
import com.learnings.purchase.ProductDataManager;
import com.learnings.purchase.PurchaseData;
import com.p552ot.pubsub.p559g.C26549l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
class AmazonDataHelper {
    private static final Map<String, String> sCountryCurrencyMap;

    static {
        HashMap hashMap = new HashMap();
        sCountryCurrencyMap = hashMap;
        hashMap.put("AU", "AUD");
        hashMap.put("BR", "BRL");
        hashMap.put("CA", "CAD");
        hashMap.put(C26549l.f69547a, "CNY");
        hashMap.put("DE", "EUR");
        hashMap.put("ES", "EUR");
        hashMap.put("FR", "EUR");
        hashMap.put("GB", "GBP");
        hashMap.put("IN", "INR");
        hashMap.put("IT", "EUR");
        hashMap.put("JP", "JPY");
        hashMap.put("MX", "MXN");
        hashMap.put("US", "USD");
    }

    AmazonDataHelper() {
    }

    private static ProductData generate(Product product, UserData userData) {
        ProductData productData = new ProductData();
        productData.setSourceData(product);
        productData.setPlatform(Platform.AMAZON);
        productData.setProductId(product.getSku());
        productData.setType(ProductDataManager.get().getProductType(product.getSku()));
        productData.setTitle(product.getTitle());
        productData.setDescription(product.getDescription());
        productData.setDisplayPrice(product.getPrice());
        productData.setPriceAmountMicros(getPriceAmountMicros(product.getPrice()));
        productData.setPriceCurrencyCode(getCurrencyCode(userData));
        return productData;
    }

    private static String getCurrencyCode(UserData userData) {
        String str;
        if (userData != null) {
            str = userData.getMarketplace();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "USD";
        }
        String upperCase = str.toUpperCase();
        Map<String, String> map = sCountryCurrencyMap;
        if (!map.containsKey(upperCase)) {
            return "USD";
        }
        return map.get(upperCase);
    }

    private static double getPriceAmountMicros(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0.0d;
            }
            Matcher matcher = Pattern.compile("(\\d+(\\.\\d+)?)").matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            String group = matcher.group(1);
            if (TextUtils.isEmpty(group)) {
                return 0.0d;
            }
            return Double.parseDouble(group);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0d;
        }
    }

    public static List<ProductData> generate(Map<String, Product> map, UserData userData) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (String str : map.keySet()) {
                Product product = map.get(str);
                if (product != null) {
                    arrayList.add(generate(product, userData));
                }
            }
        }
        return arrayList;
    }

    public static List<PurchaseData> generate(List<Receipt> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Receipt receipt : list) {
                if (!receipt.isCanceled()) {
                    arrayList.add(generate(receipt));
                }
            }
        }
        return arrayList;
    }

    public static PurchaseData generate(Receipt receipt) {
        String sku = receipt.getSku();
        if (receipt.getProductType() == ProductType.SUBSCRIPTION) {
            sku = receipt.getTermSku();
        }
        PurchaseData purchaseData = new PurchaseData();
        purchaseData.setSourceData(receipt);
        purchaseData.setProductId(sku);
        purchaseData.setToken(receipt.getReceiptId());
        purchaseData.setOrderId(receipt.getReceiptId());
        purchaseData.setPurchaseTime(receipt.getPurchaseDate().getTime());
        return purchaseData;
    }
}
