package com.learnings.purchase.google;

import android.text.TextUtils;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.learnings.purchase.Platform;
import com.learnings.purchase.ProductData;
import com.learnings.purchase.ProductDataManager;
import com.learnings.purchase.PurchaseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public class GoogleDataHelper {
    public static ProductData generate(ProductDetails productDetails) {
        ProductData productData = new ProductData();
        productData.setSourceData(productDetails);
        productData.setProductId(productDetails.getProductId());
        productData.setPlatform(Platform.GOOGLE);
        productData.setType(ProductDataManager.get().getProductType(productDetails.getProductId()));
        productData.setTitle(productDetails.getTitle());
        productData.setDescription(productDetails.getDescription());
        productData.setDisplayPrice(getPriceByProductDetails(productDetails));
        productData.setPriceAmountMicros(getPriceAmountMicrosByProductDetails(productDetails));
        productData.setPriceCurrencyCode(getPriceCurrencyCodeByProductDetails(productDetails));
        return productData;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:3:0x0002, B:20:0x0041, B:18:0x0030, B:19:0x0039, B:8:0x0016, B:11:0x0020), top: B:25:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static double getPriceAmountMicrosByProductDetails(com.android.billingclient.api.ProductDetails r6) {
        /*
            r0 = 0
            java.lang.String r2 = r6.getProductType()     // Catch: java.lang.Throwable -> L4f
            int r3 = r2.hashCode()     // Catch: java.lang.Throwable -> L4f
            r4 = 3541555(0x360a33, float:4.962776E-39)
            r5 = 1
            if (r3 == r4) goto L20
            r4 = 100343516(0x5fb1edc, float:2.3615263E-35)
            if (r3 == r4) goto L16
            goto L2a
        L16:
            java.lang.String r3 = "inapp"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L2a
            r2 = 0
            goto L2b
        L20:
            java.lang.String r3 = "subs"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L2a
            r2 = r5
            goto L2b
        L2a:
            r2 = -1
        L2b:
            if (r2 == 0) goto L39
            if (r2 == r5) goto L30
            goto L41
        L30:
            com.android.billingclient.api.ProductDetails$PricingPhase r6 = getSubsPricingPhase(r6)     // Catch: java.lang.Throwable -> L4f
            long r0 = r6.getPriceAmountMicros()     // Catch: java.lang.Throwable -> L4f
            goto L41
        L39:
            com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails r6 = r6.getOneTimePurchaseOfferDetails()     // Catch: java.lang.Throwable -> L4f
            long r0 = r6.getPriceAmountMicros()     // Catch: java.lang.Throwable -> L4f
        L41:
            float r6 = (float) r0     // Catch: java.lang.Throwable -> L4f
            r2 = 1232348160(0x49742400, float:1000000.0)
            float r6 = r6 / r2
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L4f
            double r0 = java.lang.Double.parseDouble(r6)     // Catch: java.lang.Throwable -> L4f
            return r0
        L4f:
            r6 = move-exception
            r6.printStackTrace()
            double r0 = (double) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.learnings.purchase.google.GoogleDataHelper.getPriceAmountMicrosByProductDetails(com.android.billingclient.api.ProductDetails):double");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0002, B:18:0x0030, B:19:0x0039, B:8:0x0016, B:11:0x0020), top: B:24:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getPriceByProductDetails(com.android.billingclient.api.ProductDetails r5) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = r5.getProductType()     // Catch: java.lang.Throwable -> L42
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L42
            r3 = 3541555(0x360a33, float:4.962776E-39)
            r4 = 1
            if (r2 == r3) goto L20
            r3 = 100343516(0x5fb1edc, float:2.3615263E-35)
            if (r2 == r3) goto L16
            goto L2a
        L16:
            java.lang.String r2 = "inapp"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L2a
            r1 = 0
            goto L2b
        L20:
            java.lang.String r2 = "subs"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L2a
            r1 = r4
            goto L2b
        L2a:
            r1 = -1
        L2b:
            if (r1 == 0) goto L39
            if (r1 == r4) goto L30
            goto L46
        L30:
            com.android.billingclient.api.ProductDetails$PricingPhase r5 = getSubsPricingPhase(r5)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r5.getFormattedPrice()     // Catch: java.lang.Throwable -> L42
            goto L46
        L39:
            com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails r5 = r5.getOneTimePurchaseOfferDetails()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r5.getFormattedPrice()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r5 = move-exception
            r5.printStackTrace()
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.learnings.purchase.google.GoogleDataHelper.getPriceByProductDetails(com.android.billingclient.api.ProductDetails):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0002, B:18:0x0030, B:19:0x0039, B:8:0x0016, B:11:0x0020), top: B:24:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String getPriceCurrencyCodeByProductDetails(com.android.billingclient.api.ProductDetails r5) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = r5.getProductType()     // Catch: java.lang.Throwable -> L42
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L42
            r3 = 3541555(0x360a33, float:4.962776E-39)
            r4 = 1
            if (r2 == r3) goto L20
            r3 = 100343516(0x5fb1edc, float:2.3615263E-35)
            if (r2 == r3) goto L16
            goto L2a
        L16:
            java.lang.String r2 = "inapp"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L2a
            r1 = 0
            goto L2b
        L20:
            java.lang.String r2 = "subs"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L2a
            r1 = r4
            goto L2b
        L2a:
            r1 = -1
        L2b:
            if (r1 == 0) goto L39
            if (r1 == r4) goto L30
            goto L46
        L30:
            com.android.billingclient.api.ProductDetails$PricingPhase r5 = getSubsPricingPhase(r5)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r5.getPriceCurrencyCode()     // Catch: java.lang.Throwable -> L42
            goto L46
        L39:
            com.android.billingclient.api.ProductDetails$OneTimePurchaseOfferDetails r5 = r5.getOneTimePurchaseOfferDetails()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r5.getPriceCurrencyCode()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r5 = move-exception
            r5.printStackTrace()
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.learnings.purchase.google.GoogleDataHelper.getPriceCurrencyCodeByProductDetails(com.android.billingclient.api.ProductDetails):java.lang.String");
    }

    static String getProductIdByPurchase(Purchase purchase) {
        try {
            return purchase.getProducts().get(0);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static ProductDetails.PricingPhase getSubsPricingPhase(ProductDetails productDetails) {
        try {
            for (ProductDetails.PricingPhase pricingPhase : productDetails.getSubscriptionOfferDetails().get(0).getPricingPhases().getPricingPhaseList()) {
                if (pricingPhase.getPriceAmountMicros() > 0) {
                    return pricingPhase;
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static boolean isFreeTrial(ProductDetails productDetails) {
        ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails;
        try {
            subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails().get(0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (TextUtils.equals("freetrial", subscriptionOfferDetails.getOfferId().toLowerCase(Locale.US))) {
            return true;
        }
        Iterator<ProductDetails.PricingPhase> it = subscriptionOfferDetails.getPricingPhases().getPricingPhaseList().iterator();
        while (it.hasNext()) {
            if (it.next().getPriceAmountMicros() == 0) {
                return true;
            }
        }
        return false;
    }

    public static List<PurchaseData> generate(List<Purchase> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (Purchase purchase : list) {
                arrayList.add(generate(purchase));
            }
        }
        return arrayList;
    }

    public static PurchaseData generate(Purchase purchase) {
        PurchaseData purchaseData = new PurchaseData();
        purchaseData.setSourceData(purchase);
        purchaseData.setProductId(getProductIdByPurchase(purchase));
        purchaseData.setPurchaseTime(purchase.getPurchaseTime());
        purchaseData.setOrderId(purchase.getOrderId());
        purchaseData.setToken(purchase.getPurchaseToken());
        return purchaseData;
    }
}
