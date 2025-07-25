package com.appsflyer.share;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1fSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFf1tSDK;
import com.appsflyer.internal.AFj1mSDK;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C20517nb;
import com.maticoo.sdk.utils.constant.KeyConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public class LinkGenerator {
    String AFInAppEventParameterName;
    private final String AFInAppEventType;
    private String AFKeystoreWrapper;
    private String AFLogger;
    private final Map<String, String> afInfoLog = new HashMap();

    /* renamed from: d */
    private String f13139d;

    /* renamed from: e */
    private String f13140e;
    private String force;
    private String registerClient;
    private String unregisterClient;
    private String valueOf;
    String values;

    /* renamed from: w */
    private String f13141w;

    /* loaded from: classes2.dex */
    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.AFInAppEventType = str;
    }

    private Map<String, String> AFInAppEventType() {
        HashMap hashMap = new HashMap();
        hashMap.put(KeyConstants.RequestBody.KEY_PID, this.AFInAppEventType);
        String str = this.AFLogger;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.AFKeystoreWrapper;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.unregisterClient;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.valueOf;
        if (str4 != null) {
            hashMap.put(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, str4);
        }
        String str5 = this.f13140e;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.registerClient;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.force != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.force);
            String str7 = this.f13139d;
            if (str7 != null) {
                String str8 = "";
                this.f13139d = str7.replaceFirst("^[/]", "");
                if (!this.force.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                    str8 = RemoteSettings.FORWARD_SLASH_STRING;
                }
                sb2.append(str8);
                sb2.append(this.f13139d);
            }
            hashMap.put("af_dp", sb2.toString());
        }
        for (Map.Entry<String, String> entry : this.afInfoLog.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFb1bSDK.valueOf(hashMap);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.afInfoLog.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.afInfoLog.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.values;
        if (str != null && str.startsWith("http")) {
            sb2.append(this.values);
        } else {
            sb2.append(String.format(AFj1mSDK.AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.AFInAppEventParameterName().getHostName()));
        }
        if (this.AFInAppEventParameterName != null) {
            sb2.append('/');
            sb2.append(this.AFInAppEventParameterName);
        }
        Map<String, String> AFInAppEventType = AFInAppEventType();
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry<String, String> entry : AFInAppEventType.entrySet()) {
            if (sb3.length() == 0) {
                sb3.append('?');
            } else {
                sb3.append('&');
            }
            sb3.append(entry.getKey());
            sb3.append(C20517nb.f52173T);
            sb3.append(entry.getValue());
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public String getBrandDomain() {
        return this.f13141w;
    }

    public String getCampaign() {
        return this.valueOf;
    }

    public String getChannel() {
        return this.AFKeystoreWrapper;
    }

    public String getMediaSource() {
        return this.AFInAppEventType;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.afInfoLog);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.force = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str != null && str.length() > 0) {
            this.values = String.format("https://%s/%s", (str2 == null || str2.length() < 5) ? "go.onelink.me" : "go.onelink.me", str);
        } else {
            this.values = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.AFInAppEventParameterName().getHostName()), str3);
        }
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.f13141w = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.valueOf = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.AFKeystoreWrapper = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.f13139d = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.unregisterClient = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.registerClient = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.f13140e = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.AFLogger = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String str = this.f13141w;
        Map<String, String> AFInAppEventType = AFInAppEventType();
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFb1rSDK.AFInAppEventParameterName().valueOf(context);
        AFd1fSDK AFInAppEventType2 = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType();
        AFf1tSDK aFf1tSDK = new AFf1tSDK(AFInAppEventType2, UUID.randomUUID(), string, AFInAppEventType, str, responseListener, this);
        AFe1aSDK mo92172w = AFInAppEventType2.mo92172w();
        mo92172w.AFInAppEventParameterName.execute(new AFe1aSDK.RunnableC62494(aFf1tSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.1
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
