package com.amazon.device.iap.internal.p106c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.PurchasingManager;
import com.amazon.device.iap.internal.RequestHandler;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.internal.util.C3722b;
import com.amazon.device.iap.internal.util.CursorUtil;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.amazon.p047a.p048a.p071o.Validator;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SandboxRequestHandler.java */
/* renamed from: com.amazon.device.iap.internal.c.e */
/* loaded from: classes2.dex */
public final class C3720e implements RequestHandler {

    /* renamed from: a */
    private static final String f3311a = "e";

    /* renamed from: b */
    private static final String f3312b = "com.amazon.sdktestclient";

    /* renamed from: c */
    private static final String f3313c = "com.amazon.sdktestclient.command.CommandBroker";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* renamed from: b */
    private PurchaseUpdatesResponse m102406b(Intent intent) {
        UserData userData;
        ArrayList arrayList;
        Exception e;
        RequestId requestId;
        boolean z;
        boolean z2;
        JSONObject jSONObject;
        PurchaseUpdatesResponse.RequestStatus requestStatus = PurchaseUpdatesResponse.RequestStatus.FAILED;
        ArrayList arrayList2 = null;
        int i = 0;
        try {
            jSONObject = new JSONObject(intent.getStringExtra("purchaseUpdatesOutput"));
            requestId = RequestId.fromString(jSONObject.optString("requestId"));
            try {
                requestStatus = PurchaseUpdatesResponse.RequestStatus.valueOf(jSONObject.optString("status"));
                z2 = jSONObject.optBoolean("isMore");
                try {
                    userData = new UserDataBuilder().setUserId(jSONObject.optString("userId")).setMarketplace(jSONObject.optString(KiwiConstants.f2726m)).build();
                    try {
                        z = z2;
                    } catch (Exception e2) {
                        e = e2;
                        arrayList = null;
                        e = e;
                        i = z2;
                        Log.e(f3311a, "Error parsing purchase updates output", e);
                        z2 = i;
                        arrayList2 = arrayList;
                        z = z2;
                        return new PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipts(arrayList2).setHasMore(z).build();
                    }
                } catch (Exception e3) {
                    e = e3;
                    userData = null;
                    arrayList = null;
                }
            } catch (Exception e4) {
                userData = null;
                arrayList = null;
                e = e4;
            }
        } catch (Exception e5) {
            userData = null;
            arrayList = null;
            e = e5;
            requestId = null;
        }
        if (requestStatus == PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL) {
            arrayList = new ArrayList();
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray(KiwiConstants.f2675G);
                if (optJSONArray != null) {
                    while (i < optJSONArray.length()) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        try {
                            arrayList.add(m102407a(optJSONObject));
                        } catch (Exception unused) {
                            Log.e(f3311a, "Failed to parse receipt from json:" + optJSONObject);
                        }
                        i++;
                    }
                }
            } catch (Exception e6) {
                e = e6;
                i = z2;
                Log.e(f3311a, "Error parsing purchase updates output", e);
                z2 = i;
                arrayList2 = arrayList;
                z = z2;
                return new PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipts(arrayList2).setHasMore(z).build();
            }
            arrayList2 = arrayList;
            z = z2;
        }
        return new PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipts(arrayList2).setHasMore(z).build();
    }

    /* renamed from: c */
    private void m102405c(Intent intent) {
        m102412a(m102404d(intent));
    }

    /* renamed from: d */
    private ProductDataResponse m102404d(Intent intent) {
        LinkedHashSet linkedHashSet;
        HashMap hashMap;
        Exception e;
        RequestId requestId;
        ProductDataResponse.RequestStatus requestStatus;
        LinkedHashSet linkedHashSet2;
        ProductDataResponse.RequestStatus requestStatus2 = ProductDataResponse.RequestStatus.FAILED;
        LinkedHashSet linkedHashSet3 = null;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("itemDataOutput"));
            requestId = RequestId.fromString(jSONObject.optString("requestId"));
            try {
                requestStatus = ProductDataResponse.RequestStatus.valueOf(jSONObject.optString("status"));
                if (requestStatus != requestStatus2) {
                    try {
                        linkedHashSet2 = new LinkedHashSet();
                        try {
                            hashMap = new HashMap();
                        } catch (Exception e2) {
                            hashMap = null;
                            e = e2;
                        }
                    } catch (Exception e3) {
                        linkedHashSet = null;
                        hashMap = null;
                        e = e3;
                    }
                    try {
                        JSONArray optJSONArray = jSONObject.optJSONArray("unavailableSkus");
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                linkedHashSet2.add(optJSONArray.getString(i));
                            }
                        }
                        JSONObject optJSONObject = jSONObject.optJSONObject(FirebaseAnalytics.Param.ITEMS);
                        if (optJSONObject != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                hashMap.put(next, m102409a(next, optJSONObject.optJSONObject(next)));
                            }
                        }
                        linkedHashSet3 = linkedHashSet2;
                    } catch (Exception e4) {
                        e = e4;
                        linkedHashSet = linkedHashSet2;
                        requestStatus2 = requestStatus;
                        Log.e(f3311a, "Error parsing item data output", e);
                        requestStatus = requestStatus2;
                        linkedHashSet3 = linkedHashSet;
                        return new ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(hashMap).setUnavailableSkus(linkedHashSet3).build();
                    }
                } else {
                    hashMap = null;
                }
            } catch (Exception e5) {
                hashMap = null;
                e = e5;
                linkedHashSet = null;
            }
        } catch (Exception e6) {
            linkedHashSet = null;
            hashMap = null;
            e = e6;
            requestId = null;
        }
        return new ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(hashMap).setUnavailableSkus(linkedHashSet3).build();
    }

    /* renamed from: e */
    private void m102403e(Intent intent) {
        JSONObject jSONObject;
        UserDataResponse m102402f = m102402f(intent);
        RequestId requestId = m102402f.getRequestId();
        String stringExtra = intent.getStringExtra("userInput");
        try {
            jSONObject = new JSONObject(stringExtra);
        } catch (JSONException e) {
            String str = f3311a;
            Log.e(str, "Unable to parse request data: " + stringExtra, e);
            jSONObject = null;
        }
        if (requestId != null && jSONObject != null) {
            if (!jSONObject.optBoolean(C3718b.f3281at, false)) {
                m102412a(m102402f);
                return;
            } else if (m102402f.getUserData() != null && !Validator.m102806a(m102402f.getUserData().getUserId())) {
                String str2 = f3311a;
                Log.i(str2, "sendGetPurchaseUpdates with user id" + m102402f.getUserData().getUserId());
                m102410a(requestId.toString(), m102402f.getUserData().getUserId(), jSONObject.optBoolean(C3718b.f3282au, true));
                return;
            } else {
                String str3 = f3311a;
                Log.e(str3, "No Userid found in userDataResponse" + m102402f);
                m102412a(new PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.FAILED).setUserData(m102402f.getUserData()).setReceipts(new ArrayList()).setHasMore(false).build());
                return;
            }
        }
        m102412a(m102402f);
    }

    /* renamed from: f */
    private UserDataResponse m102402f(Intent intent) {
        RequestId requestId;
        UserDataResponse.RequestStatus requestStatus = UserDataResponse.RequestStatus.FAILED;
        UserData userData = null;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("userOutput"));
            requestId = RequestId.fromString(jSONObject.optString("requestId"));
            try {
                requestStatus = UserDataResponse.RequestStatus.valueOf(jSONObject.optString("status"));
                if (requestStatus == UserDataResponse.RequestStatus.SUCCESSFUL) {
                    userData = new UserDataBuilder().setUserId(jSONObject.optString("userId")).setMarketplace(jSONObject.optString(KiwiConstants.f2726m)).build();
                }
            } catch (Exception e) {
                e = e;
                Log.e(f3311a, "Error parsing userid output", e);
                return new UserDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).build();
            }
        } catch (Exception e2) {
            e = e2;
            requestId = null;
        }
        return new UserDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).build();
    }

    /* renamed from: g */
    private void m102401g(Intent intent) {
        m102412a(m102400h(intent));
    }

    /* renamed from: h */
    private PurchaseResponse m102400h(Intent intent) {
        RequestId requestId;
        UserData userData;
        PurchaseResponse.RequestStatus requestStatus = PurchaseResponse.RequestStatus.FAILED;
        Receipt receipt = null;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("purchaseOutput"));
            requestId = RequestId.fromString(jSONObject.optString("requestId"));
            try {
                userData = new UserDataBuilder().setUserId(jSONObject.optString("userId")).setMarketplace(jSONObject.optString(KiwiConstants.f2726m)).build();
                try {
                    requestStatus = PurchaseResponse.RequestStatus.safeValueOf(jSONObject.optString("purchaseStatus"));
                    JSONObject optJSONObject = jSONObject.optJSONObject(KiwiConstants.f2672D);
                    if (optJSONObject != null) {
                        receipt = m102407a(optJSONObject);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e(f3311a, "Error parsing purchase output", e);
                    return new PurchaseResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipt(receipt).build();
                }
            } catch (Exception e2) {
                e = e2;
                userData = null;
            }
        } catch (Exception e3) {
            e = e3;
            requestId = null;
            userData = null;
        }
        return new PurchaseResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipt(receipt).build();
    }

    @Override // com.amazon.device.iap.internal.RequestHandler
    /* renamed from: a */
    public void mo102384a(RequestId requestId) {
        C3722b.m102376a(f3311a, "sendGetUserDataRequest");
        m102408a(requestId.toString(), false, false);
    }

    /* renamed from: a */
    private void m102408a(String str, boolean z, boolean z2) {
        try {
            Context m102392b = PurchasingManager.m102387g().m102392b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", str);
            jSONObject.put("packageName", m102392b.getPackageName());
            jSONObject.put("sdkVersion", PurchasingService.SDK_VERSION);
            jSONObject.put(C3718b.f3281at, z);
            jSONObject.put(C3718b.f3282au, z2);
            bundle.putString("userInput", jSONObject.toString());
            Intent m102411a = m102411a("com.amazon.testclient.iap.appUserId");
            m102411a.addFlags(268435456);
            m102411a.putExtras(bundle);
            m102392b.startService(m102411a);
        } catch (JSONException unused) {
            C3722b.m102374b(f3311a, "Error in sendGetUserDataRequest.");
        }
    }

    @Override // com.amazon.device.iap.internal.RequestHandler
    /* renamed from: a */
    public void mo102383a(RequestId requestId, String str) {
        C3722b.m102376a(f3311a, "sendPurchaseRequest");
        try {
            Context m102392b = PurchasingManager.m102387g().m102392b();
            boolean m102390d = PurchasingManager.m102387g().m102390d();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sku", str);
            jSONObject.put(KiwiConstants.f2698ac, m102390d);
            jSONObject.put("requestId", requestId.toString());
            jSONObject.put("packageName", m102392b.getPackageName());
            jSONObject.put("sdkVersion", PurchasingService.SDK_VERSION);
            bundle.putString("purchaseInput", jSONObject.toString());
            Intent m102411a = m102411a("com.amazon.testclient.iap.purchase");
            m102411a.addFlags(268435456);
            m102411a.putExtras(bundle);
            m102392b.startService(m102411a);
        } catch (JSONException unused) {
            C3722b.m102374b(f3311a, "Error in sendPurchaseRequest.");
        }
    }

    @Override // com.amazon.device.iap.internal.RequestHandler
    /* renamed from: a */
    public void mo102381a(RequestId requestId, Set<String> set) {
        C3722b.m102376a(f3311a, "sendItemDataRequest");
        try {
            Context m102392b = PurchasingManager.m102387g().m102392b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray((Collection) set);
            jSONObject.put("requestId", requestId.toString());
            jSONObject.put("packageName", m102392b.getPackageName());
            jSONObject.put(KiwiConstants.f2683O, jSONArray);
            jSONObject.put("sdkVersion", PurchasingService.SDK_VERSION);
            bundle.putString("itemDataInput", jSONObject.toString());
            Intent m102411a = m102411a("com.amazon.testclient.iap.itemData");
            m102411a.addFlags(268435456);
            m102411a.putExtras(bundle);
            m102392b.startService(m102411a);
        } catch (JSONException unused) {
            C3722b.m102374b(f3311a, "Error in sendItemDataRequest.");
        }
    }

    @Override // com.amazon.device.iap.internal.RequestHandler
    /* renamed from: a */
    public void mo102380a(RequestId requestId, boolean z) {
        if (requestId == null) {
            requestId = new RequestId();
        }
        String str = f3311a;
        C3722b.m102376a(str, "sendPurchaseUpdatesRequest/sendGetUserData first:" + requestId);
        m102408a(requestId.toString(), true, z);
    }

    @Override // com.amazon.device.iap.internal.RequestHandler
    /* renamed from: a */
    public void mo102382a(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        C3722b.m102376a(f3311a, "sendNotifyPurchaseFulfilled");
        try {
            Context m102392b = PurchasingManager.m102387g().m102392b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", requestId.toString());
            jSONObject.put("packageName", m102392b.getPackageName());
            jSONObject.put(KiwiConstants.f2673E, str);
            jSONObject.put("fulfillmentResult", fulfillmentResult);
            jSONObject.put("sdkVersion", PurchasingService.SDK_VERSION);
            bundle.putString("purchaseFulfilledInput", jSONObject.toString());
            Intent m102411a = m102411a("com.amazon.testclient.iap.purchaseFulfilled");
            m102411a.addFlags(268435456);
            m102411a.putExtras(bundle);
            m102392b.startService(m102411a);
        } catch (JSONException unused) {
            C3722b.m102374b(f3311a, "Error in sendNotifyPurchaseFulfilled.");
        }
    }

    @Override // com.amazon.device.iap.internal.RequestHandler
    /* renamed from: a */
    public void mo102385a(Context context, Intent intent) {
        C3722b.m102376a(f3311a, "handleResponse");
        intent.setComponent(new ComponentName(f3312b, f3313c));
        try {
            String string = intent.getExtras().getString("responseType");
            if (string.equalsIgnoreCase("com.amazon.testclient.iap.purchase")) {
                m102401g(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.appUserId")) {
                m102403e(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.itemData")) {
                m102405c(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.purchaseUpdates")) {
                m102413a(intent);
            }
        } catch (Exception e) {
            Log.e(f3311a, "Error handling response.", e);
        }
    }

    /* renamed from: a */
    private Intent m102411a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(f3312b, f3313c));
        return intent;
    }

    /* renamed from: a */
    protected void m102412a(final Object obj) {
        Validator.m102807a(obj, "response");
        Context m102392b = PurchasingManager.m102387g().m102392b();
        final PurchasingListener m102399a = PurchasingManager.m102387g().m102399a();
        if (m102392b != null && m102399a != null) {
            new Handler(m102392b.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.iap.internal.c.e.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof ProductDataResponse) {
                            m102399a.onProductDataResponse((ProductDataResponse) obj2);
                        } else if (obj2 instanceof UserDataResponse) {
                            m102399a.onUserDataResponse((UserDataResponse) obj2);
                        } else if (obj2 instanceof PurchaseUpdatesResponse) {
                            m102399a.onPurchaseUpdatesResponse((PurchaseUpdatesResponse) obj2);
                        } else if (!(obj2 instanceof PurchaseResponse)) {
                            String str = C3720e.f3311a;
                            C3722b.m102374b(str, "Unknown response type:" + obj.getClass().getName());
                        } else {
                            m102399a.onPurchaseResponse((PurchaseResponse) obj2);
                        }
                    } catch (Exception e) {
                        String str2 = C3720e.f3311a;
                        C3722b.m102374b(str2, "Error in sendResponse: " + e);
                    }
                }
            });
            return;
        }
        String str = f3311a;
        C3722b.m102376a(str, "PurchasingListener is not set. Dropping response: " + obj);
    }

    /* renamed from: a */
    private void m102413a(Intent intent) throws JSONException {
        PurchaseUpdatesResponse m102406b = m102406b(intent);
        if (m102406b.getRequestStatus() == PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL) {
            String optString = new JSONObject(intent.getStringExtra("purchaseUpdatesOutput")).optString("offset");
            String str = f3311a;
            Log.i(str, "Offset for PurchaseUpdatesResponse:" + optString);
            CursorUtil.m102378a(m102406b.getUserData().getUserId(), optString);
        }
        m102412a(m102406b);
    }

    /* renamed from: a */
    private Product m102409a(String str, JSONObject jSONObject) throws JSONException {
        String str2;
        ProductType valueOf = ProductType.valueOf(jSONObject.optString(KiwiConstants.f2724k));
        JSONObject optJSONObject = jSONObject.optJSONObject(KiwiConstants.f2738y);
        if (optJSONObject == null || optJSONObject == JSONObject.NULL) {
            str2 = null;
        } else {
            Currency currency = Currency.getInstance(optJSONObject.optString("currency"));
            str2 = currency.getSymbol() + optJSONObject.optString("value");
        }
        String optString = jSONObject.optString("title");
        String optString2 = jSONObject.optString("description");
        String optString3 = jSONObject.optString("smallIconUrl");
        int optInt = jSONObject.optInt(KiwiConstants.f2688T, 0);
        return new ProductBuilder().setSku(str).setProductType(valueOf).setDescription(optString2).setPrice(str2).setSmallIconUrl(optString3).setTitle(optString).setCoinsRewardAmount(optInt).setSubscriptionPeriod(jSONObject.isNull(FirebaseAnalytics.Param.TERM) ? null : jSONObject.getString(FirebaseAnalytics.Param.TERM)).setFreeTrialPeriod(jSONObject.isNull(KiwiConstants.f2729p) ? null : jSONObject.getString(KiwiConstants.f2729p)).setPromotions(jSONObject.isNull(KiwiConstants.f2730q) ? null : C3717a.m102418a(jSONObject)).build();
    }

    /* renamed from: a */
    private void m102410a(String str, String str2, boolean z) {
        try {
            Context m102392b = PurchasingManager.m102387g().m102392b();
            String m102379a = CursorUtil.m102379a(str2);
            String str3 = f3311a;
            Log.i(str3, "send PurchaseUpdates with user id:" + str2 + ";reset flag:" + z + ", local cursor:" + m102379a + ", parsed from old requestId:" + str);
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", str.toString());
            if (z) {
                m102379a = null;
            }
            jSONObject.put("offset", m102379a);
            jSONObject.put("sdkVersion", PurchasingService.SDK_VERSION);
            jSONObject.put("packageName", m102392b.getPackageName());
            bundle.putString("purchaseUpdatesInput", jSONObject.toString());
            Intent m102411a = m102411a("com.amazon.testclient.iap.purchaseUpdates");
            m102411a.addFlags(268435456);
            m102411a.putExtras(bundle);
            m102392b.startService(m102411a);
        } catch (JSONException unused) {
            C3722b.m102374b(f3311a, "Error in sendPurchaseUpdatesRequest.");
        }
    }

    /* renamed from: a */
    private Receipt m102407a(JSONObject jSONObject) throws ParseException {
        String optString = jSONObject.optString(KiwiConstants.f2673E);
        String optString2 = jSONObject.optString("sku");
        ProductType valueOf = ProductType.valueOf(jSONObject.optString(KiwiConstants.f2724k));
        String optString3 = jSONObject.optString(KiwiConstants.f2685Q);
        DateFormat dateFormat = C3718b.f3279ar;
        Date parse = dateFormat.parse(optString3);
        String optString4 = jSONObject.optString(KiwiConstants.f2718e);
        Date parse2 = (optString4 == null || optString4.length() == 0) ? null : dateFormat.parse(optString4);
        String optString5 = jSONObject.optString(KiwiConstants.f2686R);
        return new ReceiptBuilder().setReceiptId(optString).setSku(optString2).setProductType(valueOf).setPurchaseDate(parse).setCancelDate(parse2).setDeferredSku(jSONObject.optString(KiwiConstants.f2681M, null)).setDeferredDate((optString5 == null || optString5.length() == 0) ? null : dateFormat.parse(optString5)).setTermSku(jSONObject.optString(KiwiConstants.f2680L, null)).build();
    }
}
