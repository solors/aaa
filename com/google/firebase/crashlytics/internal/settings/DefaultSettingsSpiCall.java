package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import com.ironsource.C19897f5;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class DefaultSettingsSpiCall implements SettingsSpiCall {

    /* renamed from: a */
    private final String f42950a;

    /* renamed from: b */
    private final HttpRequestFactory f42951b;

    /* renamed from: c */
    private final Logger f42952c;

    public DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory) {
        this(str, httpRequestFactory, Logger.getLogger());
    }

    /* renamed from: a */
    private HttpGetRequest m66896a(HttpGetRequest httpGetRequest, SettingsRequest settingsRequest) {
        m66895b(httpGetRequest, "X-CRASHLYTICS-GOOGLE-APP-ID", settingsRequest.googleAppId);
        m66895b(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m66895b(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-VERSION", CrashlyticsCore.getVersion());
        m66895b(httpGetRequest, "Accept", "application/json");
        m66895b(httpGetRequest, "X-CRASHLYTICS-DEVICE-MODEL", settingsRequest.deviceModel);
        m66895b(httpGetRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", settingsRequest.osBuildVersion);
        m66895b(httpGetRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", settingsRequest.osDisplayVersion);
        m66895b(httpGetRequest, "X-CRASHLYTICS-INSTALLATION-ID", settingsRequest.installIdProvider.getInstallIds().getCrashlyticsInstallId());
        return httpGetRequest;
    }

    /* renamed from: b */
    private void m66895b(HttpGetRequest httpGetRequest, String str, String str2) {
        if (str2 != null) {
            httpGetRequest.header(str, str2);
        }
    }

    /* renamed from: d */
    private JSONObject m66893d(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            Logger logger = this.f42952c;
            logger.m67207w("Failed to parse settings JSON from " + this.f42950a, e);
            Logger logger2 = this.f42952c;
            logger2.m67208w("Settings response " + str);
            return null;
        }
    }

    /* renamed from: e */
    private Map<String, String> m66892e(SettingsRequest settingsRequest) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", settingsRequest.buildVersion);
        hashMap.put("display_version", settingsRequest.displayVersion);
        hashMap.put("source", Integer.toString(settingsRequest.source));
        String str = settingsRequest.instanceId;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(C19897f5.f50013o, str);
        }
        return hashMap;
    }

    /* renamed from: c */
    protected HttpGetRequest m66894c(Map<String, String> map) {
        HttpGetRequest buildHttpGetRequest = this.f42951b.buildHttpGetRequest(this.f42950a, map);
        return buildHttpGetRequest.header("User-Agent", "Crashlytics Android SDK/" + CrashlyticsCore.getVersion()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* renamed from: f */
    JSONObject m66891f(HttpResponse httpResponse) {
        int code = httpResponse.code();
        Logger logger = this.f42952c;
        logger.m67210v("Settings response code was: " + code);
        if (m66890g(code)) {
            return m66893d(httpResponse.body());
        }
        Logger logger2 = this.f42952c;
        logger2.m67214e("Settings request failed; (status: " + code + ") from " + this.f42950a);
        return null;
    }

    /* renamed from: g */
    boolean m66890g(int i) {
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            return false;
        }
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsSpiCall
    public JSONObject invoke(SettingsRequest settingsRequest, boolean z) {
        if (z) {
            try {
                Map<String, String> m66892e = m66892e(settingsRequest);
                HttpGetRequest m66896a = m66896a(m66894c(m66892e), settingsRequest);
                Logger logger = this.f42952c;
                logger.m67216d("Requesting settings from " + this.f42950a);
                Logger logger2 = this.f42952c;
                logger2.m67210v("Settings query params were: " + m66892e);
                return m66891f(m66896a.execute());
            } catch (IOException e) {
                this.f42952c.m67213e("Settings request failed.", e);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory, Logger logger) {
        if (str != null) {
            this.f42952c = logger;
            this.f42951b = httpRequestFactory;
            this.f42950a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
