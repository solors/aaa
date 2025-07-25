package p005a4;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import java.util.HashMap;
import java.util.Map;
import p027b4.AnalyzeLog;
import p1007v3.BaseAnalyze;
import p1007v3.CountryUtils;
import p1007v3.IAnalyze;
import p1007v3.UUIDManager;
import p1020w3.C44574a;
import p992u3.LogLevel;

/* renamed from: a4.b */
/* loaded from: classes6.dex */
public class AppsflyerAnalyze extends BaseAnalyze {

    /* renamed from: c */
    private final Context f55c;

    /* renamed from: d */
    private final AppsflyerCallback f56d;

    /* renamed from: e */
    private final String f57e;

    /* renamed from: f */
    private final IAnalyze[] f58f;

    /* compiled from: AppsflyerAnalyze.java */
    /* renamed from: a4.b$a */
    /* loaded from: classes6.dex */
    class C0006a implements AppsFlyerConversionListener {
        C0006a() {
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onAppOpenAttribution(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                LogLevel logLevel = LogLevel.DEBUG;
                AnalyzeLog.m103949a(logLevel, "appsflyer init callback. onAppOpenAttribution  :" + entry.getKey() + ":" + entry.getValue());
            }
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onAttributionFailure(String str) {
            LogLevel logLevel = LogLevel.DEBUG;
            AnalyzeLog.m103949a(logLevel, "appsflyer init callback. error onAttributionFailure : " + str);
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onConversionDataFail(String str) {
            LogLevel logLevel = LogLevel.WARN;
            AnalyzeLog.m103949a(logLevel, "appsflyer init callback. error getting conversion data: " + str);
            if (AppsflyerAnalyze.this.f56d != null) {
                AppsflyerAnalyze.this.f56d.onConversionDataFail(str);
            }
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public void onConversionDataSuccess(Map<String, Object> map) {
            if (map != null && map.size() != 0) {
                AnalyzeLog.m103949a(LogLevel.DEBUG, "appsflyer init callback. onConversionDataSuccess conversionDataSize:" + map.size());
                Map<String, String> m105874n = AppsflyerAnalyze.this.m105874n(map);
                if (AppsflyerAnalyze.this.f58f != null) {
                    for (IAnalyze iAnalyze : AppsflyerAnalyze.this.f58f) {
                        iAnalyze.mo2688e(m105874n);
                    }
                }
                HashMap hashMap = new HashMap(map.size());
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                if (AppsflyerAnalyze.this.f56d != null) {
                    AppsflyerAnalyze.this.f56d.onConversionDataSuccess(hashMap);
                    return;
                }
                return;
            }
            AnalyzeLog.m103949a(LogLevel.WARN, "appsflyer init callback. onConversionDataSuccess is null");
            if (AppsflyerAnalyze.this.f56d != null) {
                AppsflyerAnalyze.this.f56d.onConversionDataFail("appsflyer init callback. onConversionDataSuccess is null");
            }
        }
    }

    public AppsflyerAnalyze(@NonNull Context context, IAnalyze[] iAnalyzeArr, @Nullable AppsflyerCallback appsflyerCallback, @Nullable String str) {
        this.f55c = context;
        if (TextUtils.isEmpty(str)) {
            this.f57e = "qNsTSFixbaPufCv5sQ6yJV";
        } else {
            this.f57e = str;
        }
        this.f56d = appsflyerCallback;
        this.f58f = iAnalyzeArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    /* renamed from: n */
    public Map<String, String> m105874n(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        Object obj = map.get("af_status");
        LogLevel logLevel = LogLevel.DEBUG;
        AnalyzeLog.m103949a(logLevel, "obtain af_status " + obj);
        if (obj == null) {
            hashMap.put("af_status", "");
        } else {
            hashMap.put("af_status", obj.toString());
        }
        Object obj2 = map.get("media_source");
        AnalyzeLog.m103949a(logLevel, "obtain media_source " + obj2);
        if (obj2 == null) {
            hashMap.put("media_source", "");
        } else {
            hashMap.put("media_source", obj2.toString());
        }
        Object obj3 = map.get("campaign_id");
        AnalyzeLog.m103949a(logLevel, "obtain campaign_id " + obj3);
        if (obj3 == null) {
            obj3 = map.get("af_c_id");
        }
        if (obj3 != null) {
            hashMap.put("campaign_id", obj3.toString());
        } else {
            hashMap.put("campaign_id", "");
        }
        Object obj4 = map.get("campaign");
        AnalyzeLog.m103949a(logLevel, "obtain campaign " + obj4);
        if (obj4 == null) {
            hashMap.put("campaign_name", "");
        } else {
            hashMap.put("campaign_name", obj4.toString());
        }
        return hashMap;
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: b */
    public void mo2691b(@NonNull C44574a c44574a) {
        HashMap hashMap;
        if (!mo2697j(c44574a)) {
            return;
        }
        Bundle m2372f = c44574a.m2372f();
        if (m2372f != null) {
            hashMap = new HashMap(m2372f.size());
            for (String str : m2372f.keySet()) {
                if (str != null && m2372f.containsKey(str)) {
                    try {
                        hashMap.put(str, m2372f.get(str));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            hashMap = null;
        }
        AppsFlyerLib.getInstance().logEvent(this.f55c, c44574a.m2371g(), hashMap);
        if (AnalyzeLog.m103943g()) {
            AnalyzeLog.m103947c(LogLevel.INFO, mo2684i(), c44574a.m2371g(), hashMap);
        }
        super.mo2691b(c44574a);
    }

    @Override // p1007v3.IAnalyze
    @NonNull
    /* renamed from: i */
    public String mo2684i() {
        return AnalyzePlatform.f51c.m105878a();
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    public void init() {
        AppsFlyerConsent forNonGDPRUser;
        AppsFlyerLib.getInstance().setDebugLog(AnalyzeLog.m103943g());
        AppsFlyerLib.getInstance().setCustomerUserId(UUIDManager.m2681a().m2680b(this.f55c));
        AppsFlyerLib.getInstance().init(this.f57e, new C0006a(), this.f55c);
        AnalyzeLog.m103949a(LogLevel.DEBUG, "appsflyer init.");
        if (CountryUtils.m2695b(CountryUtils.m2696a(this.f55c))) {
            forNonGDPRUser = AppsFlyerConsent.forGDPRUser(true, true);
        } else {
            forNonGDPRUser = AppsFlyerConsent.forNonGDPRUser();
        }
        AppsFlyerLib.getInstance().setConsentData(forNonGDPRUser);
        AppsFlyerLib.getInstance().start(this.f55c);
        super.init();
    }
}
