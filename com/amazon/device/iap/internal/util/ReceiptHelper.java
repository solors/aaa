package com.amazon.device.iap.internal.util;

import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.p096a.ReceiptParsingException;
import com.amazon.device.iap.internal.p096a.ReceiptVerificationException;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import com.amazon.p047a.AppstoreSDK;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.amazon.p047a.p048a.p071o.Validator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amazon.device.iap.internal.util.c */
/* loaded from: classes2.dex */
public class ReceiptHelper {

    /* renamed from: a */
    private static final String f3328a = "c";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReceiptHelper.java */
    /* renamed from: com.amazon.device.iap.internal.util.c$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C37231 {

        /* renamed from: a */
        static final /* synthetic */ int[] f3329a;

        static {
            int[] iArr = new int[ReceiptVersion.values().length];
            f3329a = iArr;
            try {
                iArr[ReceiptVersion.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3329a[ReceiptVersion.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3329a[ReceiptVersion.V2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3329a[ReceiptVersion.V3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static Receipt m102367a(JSONObject jSONObject, String str, String str2) throws ReceiptParsingException, ReceiptVerificationException, IllegalArgumentException {
        int i = C37231.f3329a[m102364b(jSONObject).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return m102360e(jSONObject, str, str2);
                }
                return m102361d(jSONObject, str, str2);
            }
            return m102363b(jSONObject, str, str2);
        }
        return m102362c(jSONObject, str, str2);
    }

    /* renamed from: b */
    private static Receipt m102363b(JSONObject jSONObject, String str, String str2) throws ReceiptParsingException, ReceiptVerificationException {
        String optString = jSONObject.optString("signature");
        if (!Validator.m102806a(optString)) {
            try {
                Receipt m102368a = m102368a(jSONObject);
                String str3 = str + "-" + m102368a.getReceiptId();
                boolean m103231a = AppstoreSDK.m103231a(str3, optString);
                C3722b.m102376a(f3328a, "stringToVerify/legacy:\n" + str3 + "\nsignature:\n" + optString);
                if (m103231a) {
                    return m102368a;
                }
                MetricsHelper.submitReceiptVerificationFailureMetrics(str2, str3, optString);
                throw new ReceiptVerificationException(str2, str3, optString);
            } catch (JSONException e) {
                throw new ReceiptParsingException(str2, jSONObject.toString(), e);
            }
        }
        C3722b.m102374b(f3328a, "a signature was not found in the receipt for request ID " + str2);
        MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString);
        throw new ReceiptVerificationException(str2, null, optString);
    }

    /* renamed from: c */
    private static Receipt m102362c(JSONObject jSONObject, String str, String str2) throws ReceiptParsingException, ReceiptVerificationException {
        Date date;
        String optString = jSONObject.optString(KiwiConstants.f2694Z);
        String optString2 = jSONObject.optString("signature");
        Date date2 = null;
        if (!Validator.m102806a(optString2)) {
            try {
                Receipt m102368a = m102368a(jSONObject);
                Object[] objArr = new Object[9];
                objArr[0] = PurchasingService.SDK_VERSION;
                objArr[1] = str;
                objArr[2] = optString;
                objArr[3] = m102368a.getProductType();
                objArr[4] = m102368a.getSku();
                objArr[5] = m102368a.getReceiptId();
                objArr[6] = str2;
                ProductType productType = ProductType.SUBSCRIPTION;
                if (productType == m102368a.getProductType()) {
                    date = m102368a.getPurchaseDate();
                } else {
                    date = null;
                }
                objArr[7] = date;
                if (productType == m102368a.getProductType()) {
                    date2 = m102368a.getCancelDate();
                }
                objArr[8] = date2;
                String format = String.format("%s|%s|%s|%s|%s|%s|%s|%tQ|%tQ", objArr);
                C3722b.m102376a(f3328a, "stringToVerify/v1:\n" + format + "\nsignature:\n" + optString2);
                if (AppstoreSDK.m103231a(format, optString2)) {
                    return m102368a;
                }
                MetricsHelper.submitReceiptVerificationFailureMetrics(str2, format, optString2);
                throw new ReceiptVerificationException(str2, format, optString2);
            } catch (JSONException e) {
                throw new ReceiptParsingException(str2, jSONObject.toString(), e);
            }
        }
        C3722b.m102374b(f3328a, "a signature was not found in the receipt for request ID " + str2);
        MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
        throw new ReceiptVerificationException(str2, null, optString2);
    }

    /* renamed from: d */
    private static Receipt m102361d(JSONObject jSONObject, String str, String str2) throws ReceiptParsingException, ReceiptVerificationException {
        Date m102365b;
        String optString = jSONObject.optString(KiwiConstants.f2694Z);
        String optString2 = jSONObject.optString("signature");
        Date date = null;
        if (!Validator.m102806a(optString2)) {
            try {
                String string = jSONObject.getString(KiwiConstants.f2673E);
                String string2 = jSONObject.getString("sku");
                ProductType valueOf = ProductType.valueOf(jSONObject.getString(KiwiConstants.f2724k).toUpperCase());
                String optString3 = jSONObject.optString(KiwiConstants.f2685Q);
                if (m102370a(optString3)) {
                    m102365b = null;
                } else {
                    m102365b = m102365b(optString3);
                }
                String optString4 = jSONObject.optString(KiwiConstants.f2718e);
                if (!m102370a(optString4)) {
                    date = m102365b(optString4);
                }
                Receipt build = new ReceiptBuilder().setReceiptId(string).setSku(string2).setProductType(valueOf).setPurchaseDate(m102365b).setCancelDate(date).build();
                String format = String.format("%s|%s|%s|%s|%s|%tQ|%tQ", str, optString, build.getProductType(), build.getSku(), build.getReceiptId(), build.getPurchaseDate(), build.getCancelDate());
                C3722b.m102376a(f3328a, "stringToVerify/v2:\n" + format + "\nsignature:\n" + optString2);
                if (AppstoreSDK.m103231a(format, optString2)) {
                    return build;
                }
                MetricsHelper.submitReceiptVerificationFailureMetrics(str2, format, optString2);
                throw new ReceiptVerificationException(str2, format, optString2);
            } catch (JSONException e) {
                throw new ReceiptParsingException(str2, jSONObject.toString(), e);
            }
        }
        C3722b.m102374b(f3328a, "a signature was not found in the receipt for request ID " + str2);
        MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
        throw new ReceiptVerificationException(str2, null, optString2);
    }

    /* renamed from: e */
    private static Receipt m102360e(JSONObject jSONObject, String str, String str2) throws ReceiptParsingException, ReceiptVerificationException {
        Date m102365b;
        Date m102365b2;
        String optString = jSONObject.optString(KiwiConstants.f2694Z);
        String optString2 = jSONObject.optString("signature");
        Date date = null;
        if (!Validator.m102806a(optString2)) {
            try {
                String string = jSONObject.getString(KiwiConstants.f2673E);
                String string2 = jSONObject.getString("sku");
                String optString3 = jSONObject.optString(KiwiConstants.f2680L, null);
                String optString4 = jSONObject.optString(KiwiConstants.f2681M, null);
                ProductType valueOf = ProductType.valueOf(jSONObject.getString(KiwiConstants.f2724k).toUpperCase());
                String optString5 = jSONObject.optString(KiwiConstants.f2685Q);
                if (m102370a(optString5)) {
                    m102365b = null;
                } else {
                    m102365b = m102365b(optString5);
                }
                String optString6 = jSONObject.optString(KiwiConstants.f2718e);
                if (m102370a(optString6)) {
                    m102365b2 = null;
                } else {
                    m102365b2 = m102365b(optString6);
                }
                String optString7 = jSONObject.optString(KiwiConstants.f2686R);
                if (!m102370a(optString7)) {
                    date = m102365b(optString7);
                }
                Receipt build = new ReceiptBuilder().setReceiptId(string).setSku(string2).setProductType(valueOf).setPurchaseDate(m102365b).setCancelDate(m102365b2).setDeferredDate(date).setDeferredSku(optString4).setTermSku(optString3).build();
                String format = String.format("%s|%s|%s|%s|%s|%s|%s|%tQ|%tQ|%tQ", str, optString, build.getProductType(), build.getSku(), build.getReceiptId(), build.getDeferredSku(), build.getTermSku(), build.getPurchaseDate(), build.getCancelDate(), build.getDeferredDate());
                C3722b.m102376a(f3328a, "stringToVerify/v3:\n" + format + "\nsignature:\n" + optString2);
                if (AppstoreSDK.m103231a(format, optString2)) {
                    return build;
                }
                MetricsHelper.submitReceiptVerificationFailureMetrics(str2, format, optString2);
                throw new ReceiptVerificationException(str2, format, optString2);
            } catch (JSONException e) {
                throw new ReceiptParsingException(str2, jSONObject.toString(), e);
            }
        }
        C3722b.m102374b(f3328a, "a signature was not found in the receipt for request ID " + str2);
        MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
        throw new ReceiptVerificationException(str2, null, optString2);
    }

    /* renamed from: a */
    private static Receipt m102368a(JSONObject jSONObject) throws JSONException {
        String optString = jSONObject.optString("token");
        String string = jSONObject.getString("sku");
        ProductType valueOf = ProductType.valueOf(jSONObject.getString(KiwiConstants.f2724k).toUpperCase());
        String optString2 = jSONObject.optString(KiwiConstants.f2684P);
        Date m102365b = m102370a(optString2) ? null : m102365b(optString2);
        String optString3 = jSONObject.optString(KiwiConstants.f2717d);
        return new ReceiptBuilder().setReceiptId(optString).setSku(string).setProductType(valueOf).setPurchaseDate(m102365b).setCancelDate(m102370a(optString3) ? null : m102365b(optString3)).build();
    }

    /* renamed from: b */
    protected static Date m102365b(String str) throws JSONException {
        try {
            Date parse = new SimpleDateFormat(KiwiConstants.f2703ah).parse(str);
            if (0 == parse.getTime()) {
                return null;
            }
            return parse;
        } catch (ParseException e) {
            throw new JSONException(e.getMessage());
        }
    }

    /* renamed from: b */
    private static ReceiptVersion m102364b(JSONObject jSONObject) {
        String optString = jSONObject.optString(KiwiConstants.f2694Z);
        String optString2 = jSONObject.optString(KiwiConstants.f2673E);
        String optString3 = jSONObject.optString(KiwiConstants.f2682N);
        if (!Validator.m102806a(optString3)) {
            ReceiptVersion receiptVersion = ReceiptVersion.V3;
            if (optString3.equals(receiptVersion.name())) {
                return receiptVersion;
            }
        }
        if (!Validator.m102806a(optString2)) {
            return ReceiptVersion.V2;
        }
        if (Validator.m102806a(optString)) {
            return ReceiptVersion.LEGACY;
        }
        return ReceiptVersion.V1;
    }

    /* renamed from: a */
    protected static boolean m102370a(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* renamed from: a */
    protected static JSONObject m102371a(Receipt receipt, String str) {
        JSONObject jSONObject = new JSONObject();
        if (receipt != null && !Validator.m102806a(str)) {
            try {
                jSONObject.put(KiwiConstants.f2673E, receipt.getReceiptId());
                jSONObject.put("sku", receipt.getSku());
                jSONObject.put(KiwiConstants.f2724k, receipt.getProductType());
                jSONObject.put(KiwiConstants.f2685Q, receipt.getPurchaseDate());
                jSONObject.put(KiwiConstants.f2717d, receipt.getCancelDate());
                jSONObject.put("signature", str);
            } catch (JSONException unused) {
                String str2 = f3328a;
                C3722b.m102374b(str2, "Failure during toJsonInternal: " + receipt + ", signature:" + str);
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static String m102366b(Receipt receipt, String str) {
        try {
            return m102371a(receipt, str).toString(4);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static List<Receipt> m102369a(String str, String str2, String str3) throws JSONException, ReceiptParsingException, ReceiptVerificationException, IllegalArgumentException {
        if (str2 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str2);
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(m102367a(jSONArray.getJSONObject(i), str, str3));
            } catch (ReceiptParsingException e) {
                String str4 = f3328a;
                C3722b.m102374b(str4, "fail to parse receipt, requestId:" + e.m102455a());
                throw e;
            } catch (ReceiptVerificationException e2) {
                String str5 = f3328a;
                C3722b.m102374b(str5, "fail to verify receipt, requestId:" + e2.m102450a());
                throw e2;
            } catch (Throwable th) {
                String str6 = f3328a;
                C3722b.m102374b(str6, "fail to verify receipt, requestId:" + th.getMessage());
                throw th;
            }
        }
        return arrayList;
    }
}
