package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1aSDK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFc1tSDK {
    public String AFInAppEventParameterName;
    public Intent AFInAppEventType;
    public Map<String, String> AFKeystoreWrapper;
    @Nullable
    public String[] AFLogger;

    /* renamed from: d */
    public final AFd1fSDK f12973d;
    public long unregisterClient;
    @Nullable
    public DeepLinkListener valueOf;
    @NonNull
    public List<List<String>> values = new ArrayList();
    @NonNull

    /* renamed from: e */
    public final List<String> f12974e = new ArrayList();

    public AFc1tSDK(@NonNull AFd1fSDK aFd1fSDK) {
        this.f12973d = aFd1fSDK;
    }

    private static void valueOf(Map<String, String> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb2 = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb2.append(map.toString());
                AFLogger.afDebugLog(sb2.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    @Nullable
    private Uri values(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e);
                return null;
            }
        }
        return null;
    }

    public final void AFInAppEventParameterName(AFc1oSDK aFc1oSDK, Intent intent, Context context) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) this.f12973d;
        if (context != null) {
            aFd1kSDK.values.AFKeystoreWrapper = context.getApplicationContext();
        }
        if (!AFInAppEventType(intent, context, aFc1oSDK) && this.valueOf != null && this.f12973d.valueOf().values.valueOf("appsFlyerCount", 0) == 0 && !this.f12973d.AFInAppEventType().AFKeystoreWrapper("ddl_sent")) {
            AFc1qSDK aFc1qSDK = new AFc1qSDK();
            AFe1aSDK mo92172w = this.f12973d.mo92172w();
            mo92172w.AFInAppEventParameterName.execute(new AFe1aSDK.RunnableC62494(new AFf1iSDK(aFc1qSDK, this.f12973d)));
        }
        this.f12973d.AFInAppEventType().AFKeystoreWrapper("ddl_sent", true);
    }

    public final void AFInAppEventType(String str, DeepLinkResult.Error error) {
        if (this.valueOf != null) {
            AFLogger.INSTANCE.m92154d(AFg1bSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            AFInAppEventParameterName(new DeepLinkResult(null, error));
            return;
        }
        values(str);
    }

    public final void AFKeystoreWrapper(Context context, AFc1oSDK aFc1oSDK, Uri uri) {
        AFf1hSDK aFf1hSDK = new AFf1hSDK(context, aFc1oSDK, uri, this.f12974e);
        AFe1aSDK mo92172w = this.f12973d.mo92172w();
        mo92172w.AFInAppEventParameterName.execute(new AFe1aSDK.RunnableC62494(aFf1hSDK));
        this.AFInAppEventType = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0075 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean AFInAppEventType(android.content.Intent r9, android.content.Context r10, com.appsflyer.internal.AFc1oSDK r11) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1tSDK.AFInAppEventType(android.content.Intent, android.content.Context, com.appsflyer.internal.AFc1oSDK):boolean");
    }

    private static void values(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    public final void AFInAppEventParameterName(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.valueOf != null) {
            try {
                try {
                    DeepLink values = DeepLink.values(map);
                    values.AFInAppEventParameterName.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(values, null);
                } catch (JSONException e) {
                    AFLogger.INSTANCE.m92152e(AFg1bSDK.DDL, "Error occurred", e, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                AFInAppEventParameterName(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFInAppEventParameterName(new DeepLinkResult(null, null));
                throw th;
            }
        }
        valueOf(map);
    }

    public final void AFInAppEventParameterName(DeepLinkResult deepLinkResult) {
        if (this.valueOf != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1bSDK aFg1bSDK = AFg1bSDK.DDL;
            StringBuilder sb2 = new StringBuilder("Calling onDeepLinking with:\n");
            sb2.append(deepLinkResult.toString());
            aFLogger.m92154d(aFg1bSDK, sb2.toString());
            try {
                this.valueOf.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
                return;
            }
        }
        AFLogger.INSTANCE.m92154d(AFg1bSDK.DDL, "skipping, no callback registered");
    }
}
