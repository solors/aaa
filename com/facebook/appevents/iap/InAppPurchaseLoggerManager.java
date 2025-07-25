package com.facebook.appevents.iap;

import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: InAppPurchaseLoggerManager.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class InAppPurchaseLoggerManager {
    private static final int CACHE_CLEAR_TIME_LIMIT_SEC = 604800;
    @NotNull
    private static final String LAST_CLEARED_TIME = "LAST_CLEARED_TIME";
    @NotNull
    private static final String LAST_QUERY_PURCHASE_HISTORY_TIME = "LAST_QUERY_PURCHASE_HISTORY_TIME";
    @NotNull
    private static final String PRODUCT_DETAILS_STORE = "com.facebook.internal.iap.PRODUCT_DETAILS";
    @NotNull
    private static final String PURCHASE_DETAILS_SET = "PURCHASE_DETAILS_SET";
    private static final int PURCHASE_IN_CACHE_INTERVAL = 86400;
    @NotNull
    private static final String PURCHASE_TIME = "purchaseTime";
    private static SharedPreferences sharedPreferences;
    @NotNull
    public static final InAppPurchaseLoggerManager INSTANCE = new InAppPurchaseLoggerManager();
    @NotNull
    private static final Set<String> cachedPurchaseSet = new CopyOnWriteArraySet();
    @NotNull
    private static final Map<String, Long> cachedPurchaseMap = new ConcurrentHashMap();

    private InAppPurchaseLoggerManager() {
    }

    public static final boolean eligibleQueryPurchaseHistory() {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseLoggerManager.class)) {
            return false;
        }
        try {
            INSTANCE.readPurchaseCache();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 != null) {
                long j = sharedPreferences2.getLong(LAST_QUERY_PURCHASE_HISTORY_TIME, 0L);
                if (j != 0 && currentTimeMillis - j < 86400) {
                    return false;
                }
                SharedPreferences sharedPreferences3 = sharedPreferences;
                if (sharedPreferences3 != null) {
                    sharedPreferences3.edit().putLong(LAST_QUERY_PURCHASE_HISTORY_TIME, currentTimeMillis).apply();
                    return true;
                }
                Intrinsics.m17056y("sharedPreferences");
                throw null;
            }
            Intrinsics.m17056y("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseLoggerManager.class);
            return false;
        }
    }

    public static final void filterPurchaseLogging(@NotNull Map<String, JSONObject> purchaseDetailsMap, @NotNull Map<String, ? extends JSONObject> skuDetailsMap) {
        if (CrashShieldHandler.isObjectCrashing(InAppPurchaseLoggerManager.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            InAppPurchaseLoggerManager inAppPurchaseLoggerManager = INSTANCE;
            inAppPurchaseLoggerManager.readPurchaseCache();
            inAppPurchaseLoggerManager.logPurchases(inAppPurchaseLoggerManager.constructLoggingReadyMap$facebook_core_release(inAppPurchaseLoggerManager.cacheDeDupPurchase$facebook_core_release(purchaseDetailsMap), skuDetailsMap));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, InAppPurchaseLoggerManager.class);
        }
    }

    private final void logPurchases(Map<String, String> map) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    AutomaticAnalyticsLogger.logPurchase(key, value, false);
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void readPurchaseCache() {
        Set<String> set;
        List m16611C0;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences2 = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences3 = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences2.contains(LAST_CLEARED_TIME)) {
                sharedPreferences2.edit().clear().apply();
                sharedPreferences3.edit().clear().apply();
            }
            SharedPreferences sharedPreferences4 = FacebookSdk.getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences4, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            sharedPreferences = sharedPreferences4;
            Set<String> set2 = cachedPurchaseSet;
            if (sharedPreferences4 != null) {
                Set<String> stringSet = sharedPreferences4.getStringSet(PURCHASE_DETAILS_SET, new HashSet());
                if (stringSet == null) {
                    set = new HashSet<>();
                } else {
                    set = stringSet;
                }
                set2.addAll(set);
                for (String str : set2) {
                    m16611C0 = C37690r.m16611C0(str, new String[]{";"}, false, 2, 2, null);
                    cachedPurchaseMap.put(m16611C0.get(0), Long.valueOf(Long.parseLong((String) m16611C0.get(1))));
                }
                clearOutdatedProductInfoInCache$facebook_core_release();
                return;
            }
            Intrinsics.m17056y("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final Map<String, JSONObject> cacheDeDupPurchase$facebook_core_release(@NotNull Map<String, JSONObject> purchaseDetailsMap) {
        Map m17269y;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            m17269y = C37559r0.m17269y(purchaseDetailsMap);
            for (Map.Entry entry : m17269y.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has(SDKConstants.PARAM_PURCHASE_TOKEN)) {
                        String string = jSONObject.getString(SDKConstants.PARAM_PURCHASE_TOKEN);
                        if (cachedPurchaseMap.containsKey(string)) {
                            purchaseDetailsMap.remove(str);
                        } else {
                            Set<String> set = cachedPurchaseSet;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((Object) string);
                            sb2.append(';');
                            sb2.append(currentTimeMillis);
                            set.add(sb2.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putStringSet(PURCHASE_DETAILS_SET, cachedPurchaseSet).apply();
                return new HashMap(purchaseDetailsMap);
            }
            Intrinsics.m17056y("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @VisibleForTesting(otherwise = 2)
    public final void clearOutdatedProductInfoInCache$facebook_core_release() {
        Map m17269y;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 != null) {
                long j = sharedPreferences2.getLong(LAST_CLEARED_TIME, 0L);
                if (j == 0) {
                    SharedPreferences sharedPreferences3 = sharedPreferences;
                    if (sharedPreferences3 != null) {
                        sharedPreferences3.edit().putLong(LAST_CLEARED_TIME, currentTimeMillis).apply();
                        return;
                    } else {
                        Intrinsics.m17056y("sharedPreferences");
                        throw null;
                    }
                } else if (currentTimeMillis - j > TelemetryConfig.DEFAULT_EVENT_TTL_SEC) {
                    m17269y = C37559r0.m17269y(cachedPurchaseMap);
                    for (Map.Entry entry : m17269y.entrySet()) {
                        String str = (String) entry.getKey();
                        long longValue = ((Number) entry.getValue()).longValue();
                        if (currentTimeMillis - longValue > 86400) {
                            Set<String> set = cachedPurchaseSet;
                            set.remove(str + ';' + longValue);
                            cachedPurchaseMap.remove(str);
                        }
                    }
                    SharedPreferences sharedPreferences4 = sharedPreferences;
                    if (sharedPreferences4 != null) {
                        sharedPreferences4.edit().putStringSet(PURCHASE_DETAILS_SET, cachedPurchaseSet).putLong(LAST_CLEARED_TIME, currentTimeMillis).apply();
                        return;
                    } else {
                        Intrinsics.m17056y("sharedPreferences");
                        throw null;
                    }
                } else {
                    return;
                }
            }
            Intrinsics.m17056y("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final Map<String, String> constructLoggingReadyMap$facebook_core_release(@NotNull Map<String, ? extends JSONObject> purchaseDetailsMap, @NotNull Map<String, ? extends JSONObject> skuDetailsMap) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends JSONObject> entry : purchaseDetailsMap.entrySet()) {
                JSONObject value = entry.getValue();
                JSONObject jSONObject = skuDetailsMap.get(entry.getKey());
                if (value != null && value.has(PURCHASE_TIME)) {
                    try {
                        if (currentTimeMillis - (value.getLong(PURCHASE_TIME) / 1000) <= 86400 && jSONObject != null) {
                            String jSONObject2 = value.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject2, "purchaseDetail.toString()");
                            String jSONObject3 = jSONObject.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject3, "skuDetail.toString()");
                            linkedHashMap.put(jSONObject2, jSONObject3);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
