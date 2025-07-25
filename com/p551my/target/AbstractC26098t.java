package com.p551my.target;

import android.content.Context;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.p551my.target.AbstractC26098t;
import com.p551my.target.RunnableC25980o5;
import com.p551my.target.common.CustomParams;
import com.p551my.target.common.MyTargetConfig;
import com.p551my.target.common.MyTargetManager;
import com.p551my.target.common.MyTargetPrivacy;
import com.p551my.target.common.MyTargetVersion;
import com.p551my.target.mediation.AdNetworkConfig;
import com.p551my.target.mediation.AdNetworkLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.t */
/* loaded from: classes7.dex */
public abstract class AbstractC26098t {

    /* renamed from: com.my.target.t$a */
    /* loaded from: classes7.dex */
    public static class C26099a extends AbstractC26098t {

        /* renamed from: a */
        public RunnableC25980o5 f67877a;

        @Override // com.p551my.target.AbstractC26098t
        /* renamed from: a */
        public void mo42882a(final String str, final C25832j c25832j, final C26084s5 c26084s5, final Context context, final InterfaceC26100b interfaceC26100b) {
            int cachePolicy = c25832j.getCachePolicy();
            boolean z = false;
            AbstractC25755f9.m43906a(cachePolicy == 0 || cachePolicy == 1);
            AbstractC25755f9.m43903b((cachePolicy == 0 || cachePolicy == 2) ? true : true);
            ArrayList arrayList = new ArrayList();
            for (AdNetworkConfig adNetworkConfig : c25832j.getAdNetworkConfigs()) {
                AdNetworkLoader loader = adNetworkConfig.getLoader();
                if (loader != null) {
                    arrayList.add(loader);
                }
            }
            if (arrayList.isEmpty()) {
                AbstractC25846ja.m43680a("DefaultAdServiceBuilder: no AdNetworkLoaders, direct call result");
                m42880a(str, c25832j, new HashMap(), c26084s5, context, interfaceC26100b);
                return;
            }
            AbstractC25846ja.m43680a("DefaultAdServiceBuilder: loading mediation params");
            RunnableC25980o5 runnableC25980o5 = new RunnableC25980o5(c25832j.getFormat(), arrayList, context, new RunnableC25980o5.InterfaceC25981a() { // from class: com.my.target.ye
                {
                    AbstractC26098t.C26099a.this = this;
                }

                @Override // com.p551my.target.RunnableC25980o5.InterfaceC25981a
                /* renamed from: a */
                public final void mo42282a(Map map) {
                    AbstractC26098t.C26099a.this.m42881a(str, c25832j, c26084s5, context, interfaceC26100b, map);
                }
            });
            this.f67877a = runnableC25980o5;
            runnableC25980o5.m43264b();
        }

        /* renamed from: b */
        public final /* synthetic */ void m42879b(String str, C25832j c25832j, Map map, C26084s5 c26084s5, Context context, InterfaceC26100b interfaceC26100b) {
            AbstractC25846ja.m43680a("DefaultAdServiceBuilder: mediation params is loaded");
            m42880a(str, c25832j, map, c26084s5, context, interfaceC26100b);
        }

        /* renamed from: a */
        public final void m42880a(String str, C25832j c25832j, Map map, C26084s5 c26084s5, Context context, InterfaceC26100b interfaceC26100b) {
            this.f67877a = null;
            map.putAll(mo42584a(c25832j, c26084s5, context));
            interfaceC26100b.mo42878a(C26073s.m42997a(str + c25832j.getSlotId() + RemoteSettings.FORWARD_SLASH_STRING, AbstractC25925n1.m43421a(map)), null);
        }

        /* renamed from: a */
        public int mo42585a(C25832j c25832j, Context context) {
            return AbstractC25755f9.m43908a();
        }

        /* renamed from: a */
        public Map mo42584a(C25832j c25832j, C26084s5 c26084s5, Context context) {
            String str;
            HashMap hashMap = new HashMap();
            hashMap.put("formats", c25832j.getFormat());
            hashMap.put("adman_ver", MyTargetVersion.VERSION);
            hashMap.put("sdk_ver_int", MyTargetVersion.VERSION_INT);
            MyTargetPrivacy currentPrivacy = MyTargetPrivacy.currentPrivacy();
            Boolean bool = currentPrivacy.userConsent;
            if (bool != null) {
                hashMap.put("user_consent", bool.booleanValue() ? "1" : "0");
            }
            Boolean bool2 = currentPrivacy.ccpaUserConsent;
            if (bool2 != null) {
                hashMap.put("ccpa_user_consent", bool2.booleanValue() ? "1" : "0");
            }
            Boolean bool3 = currentPrivacy.iabUserConsent;
            if (bool3 != null) {
                hashMap.put("iab_user_consent", bool3.booleanValue() ? "1" : "0");
            }
            if (currentPrivacy.userAgeRestricted) {
                hashMap.put("user_age_restricted", "1");
            }
            if (c25832j.getCachePolicy() == 0 || c25832j.getCachePolicy() == 2) {
                hashMap.put("preloadvideo", "1");
            }
            int bannersCount = c25832j.getBannersCount();
            if (bannersCount > 0) {
                hashMap.put("count", Integer.toString(bannersCount));
            }
            String bidId = c25832j.getBidId();
            if (bidId != null) {
                hashMap.put("bid_id", bidId);
            }
            CustomParams customParams = c25832j.getCustomParams();
            if (currentPrivacy.isConsent()) {
                customParams.putDataTo(hashMap);
            } else {
                customParams.putCustomDataToMap(hashMap);
            }
            MyTargetConfig sdkConfig = MyTargetManager.getSdkConfig();
            try {
                hashMap.putAll(C26051r1.m43090b().m43092a(sdkConfig, currentPrivacy, c26084s5, context));
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("AdServiceBuilder: Error collecting data - " + th);
            }
            String lang = customParams.getLang();
            if (lang != null) {
                hashMap.put("lang", lang);
            }
            int mo42585a = mo42585a(c25832j, context);
            if (mo42585a >= 0) {
                hashMap.put("sdk_flags", String.valueOf(mo42585a));
            }
            String[] strArr = sdkConfig.testDevices;
            String str2 = hashMap.get("instance_id");
            if (str2 == null) {
                return hashMap;
            }
            if (strArr == null || !AbstractC25651b0.m44193a(strArr, str2)) {
                str = "AdServiceBuilder: Device instanceId is " + str2 + ". Use this value in adInstance.withTestDevices() to enable test mode on this device.";
            } else {
                hashMap.put("test_mode", "1");
                str = "DefaultAdServiceBuilder: Test mode is enabled on current device";
            }
            AbstractC25846ja.m43680a(str);
            return hashMap;
        }

        /* renamed from: a */
        public final /* synthetic */ void m42881a(final String str, final C25832j c25832j, final C26084s5 c26084s5, final Context context, final InterfaceC26100b interfaceC26100b, final Map map) {
            AbstractC25671c0.m44127a(new Runnable() { // from class: com.my.target.xe
                {
                    AbstractC26098t.C26099a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC26098t.C26099a.this.m42879b(str, c25832j, map, c26084s5, context, interfaceC26100b);
                }
            });
        }
    }

    /* renamed from: com.my.target.t$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC26100b {
        /* renamed from: a */
        void mo42878a(C26073s c26073s, String str);
    }

    /* renamed from: a */
    public final C26073s m42883a(String str, C25832j c25832j, String str2) {
        return C26073s.m42997a(str + c25832j.getSlotId() + RemoteSettings.FORWARD_SLASH_STRING, str2);
    }

    /* renamed from: a */
    public abstract void mo42882a(String str, C25832j c25832j, C26084s5 c26084s5, Context context, InterfaceC26100b interfaceC26100b);

    /* renamed from: a */
    public static AbstractC26098t m42884a() {
        return new C26099a();
    }
}
