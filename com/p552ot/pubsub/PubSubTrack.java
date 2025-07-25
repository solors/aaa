package com.p552ot.pubsub;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.p552ot.pubsub.p553a.C26487d;
import com.p552ot.pubsub.p554b.C26519o;
import com.p552ot.pubsub.p559g.C26546i;
import com.p552ot.pubsub.util.C26577b;
import com.p552ot.pubsub.util.C26580e;
import com.p552ot.pubsub.util.C26586j;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ot.pubsub.PubSubTrack */
/* loaded from: classes7.dex */
public class PubSubTrack {

    /* renamed from: a */
    private static final String f69176a = "PubSubAnalytics";

    /* renamed from: b */
    private static volatile PubSubTrack f69177b = null;

    /* renamed from: c */
    private static volatile boolean f69178c = false;

    /* renamed from: d */
    private Configuration f69179d;

    /* renamed from: e */
    private C26487d f69180e;

    /* renamed from: com.ot.pubsub.PubSubTrack$ICommonPropertyProvider */
    /* loaded from: classes7.dex */
    public interface ICommonPropertyProvider {
        Map<String, Object> getDynamicProperty(String str);
    }

    /* renamed from: com.ot.pubsub.PubSubTrack$IEventHook */
    /* loaded from: classes7.dex */
    public interface IEventHook {
        boolean isCustomDauEvent(String str);

        boolean isRecommendEvent(String str);
    }

    /* renamed from: com.ot.pubsub.PubSubTrack$NetType */
    /* loaded from: classes7.dex */
    public enum NetType {
        NOT_CONNECTED(InterfaceC32663coo2iico.cco22),
        MOBILE_2G("2G"),
        MOBILE_3G("3G"),
        MOBILE_4G("4G"),
        MOBILE_5G("5G"),
        WIFI(InterfaceC32663coo2iico.coo2iico),
        ETHERNET("ETHERNET"),
        UNKNOWN("UNKNOWN");
        

        /* renamed from: a */
        private String f69183a;

        NetType(String str) {
            this.f69183a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f69183a;
        }
    }

    private PubSubTrack(Context context, Configuration configuration) {
        this.f69179d = configuration;
        C26519o.m41380a().m41379a(configuration);
        C26577b.m41120a(context.getApplicationContext());
        this.f69180e = new C26487d(context, configuration);
    }

    /* renamed from: a */
    private static void m41480a(Context context) {
        if (context != null) {
            C26577b.m41120a(context.getApplicationContext());
            return;
        }
        throw new IllegalStateException("context is null!");
    }

    public static PubSubTrack createInstance(Context context, Configuration configuration) {
        if (configuration == null || TextUtils.isEmpty(configuration.getProjectId()) || TextUtils.isEmpty(configuration.getPrivateKeyId())) {
            if (!C26586j.f69734a) {
                Log.e(f69176a, "PubSubAnalytics init error ,Configuration , ProjectId , PrivateKeyId can't null !!!");
            } else {
                throw new IllegalStateException("PubSubAnalytics init error Configuration , ProjectId , PrivateKeyId can't null !!!");
            }
        }
        return new PubSubTrack(context, configuration);
    }

    public static boolean isDisable() {
        return f69178c;
    }

    public static void setAccessNetworkEnable(Context context, final boolean z) {
        m41480a(context);
        C26580e.m41105a(new Runnable() { // from class: com.ot.pubsub.PubSubTrack.1
            @Override // java.lang.Runnable
            public void run() {
                C26546i.m41245a(z);
            }
        });
    }

    public static void setDebugMode(boolean z) {
        C26586j.m41076a(z);
    }

    public static void setDisable(boolean z) {
        f69178c = z;
    }

    public static void setTestMode(boolean z) {
        C26586j.m41071b(z);
    }

    public void clearCommonProperty() {
        this.f69180e.m41478a();
    }

    public String getInstanceId() throws PubSubMainThreadException {
        return this.f69180e.m41466b();
    }

    @Deprecated
    public void publish(String str, String str2) {
        publish(str, str2, new HashMap());
    }

    public void removeCommonProperty(String str) {
        this.f69180e.m41471a(str);
    }

    public void setCommonProperty(Map<String, Object> map) {
        this.f69180e.m41468a(map);
    }

    public void setCustomPrivacyPolicyAccepted(boolean z) {
        this.f69180e.m41467a(z);
    }

    public void setDynamicCommonProperty(ICommonPropertyProvider iCommonPropertyProvider) {
        this.f69180e.m41475a(iCommonPropertyProvider);
    }

    public void setEventHook(IEventHook iEventHook) {
        this.f69180e.m41474a(iEventHook);
    }

    public void setInstanceId(String str) {
        this.f69180e.m41463b(str);
    }

    public void setUploadInterval(int i) {
        this.f69180e.m41477a(i);
    }

    public void track(String str, String str2, Map<String, Object> map) {
        track(str, str2, map, new HashMap());
    }

    @Deprecated
    public void publish(String str, String str2, Map<String, String> map) {
        Configuration configuration = this.f69179d;
        if (configuration != null && this.f69180e != null && !TextUtils.isEmpty(configuration.getProjectId()) && !TextUtils.isEmpty(this.f69179d.getPrivateKeyId()) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !isDisable()) {
            if (map == null) {
                map = new HashMap<>();
            }
            this.f69180e.m41469a(this.f69179d.getProjectId(), str, str2, map, this.f69179d.isNeedGzipAndEncrypt());
            return;
        }
        C26586j.m41080a(f69176a, "The Configuration or ProjectId or PrivateKeyId or Topic or data is empty, skip it!");
    }

    public void track(String str, String str2, Map<String, Object> map, Map<String, String> map2) {
        Configuration configuration = this.f69179d;
        if (configuration != null && this.f69180e != null && !TextUtils.isEmpty(configuration.getAppId()) && !TextUtils.isEmpty(this.f69179d.getProjectId()) && !TextUtils.isEmpty(this.f69179d.getPrivateKeyId()) && !TextUtils.isEmpty(str) && !isDisable()) {
            if (map == null) {
                map = new HashMap<>();
            }
            Map<String, Object> map3 = map;
            if (map2 == null) {
                map2 = new HashMap<>();
            }
            this.f69180e.m41470a(this.f69179d.getProjectId(), str, str2, map3, map2);
            return;
        }
        C26586j.m41080a(f69176a, "The Configuration or ProjectId or PrivateKeyId or AppId or Topic or data is empty, skip it!");
    }
}
