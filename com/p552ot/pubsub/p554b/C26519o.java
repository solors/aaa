package com.p552ot.pubsub.p554b;

import android.text.TextUtils;
import com.p552ot.pubsub.Configuration;
import com.p552ot.pubsub.p555c.C26521a;
import com.p552ot.pubsub.util.C26580e;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26599t;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.b.o */
/* loaded from: classes7.dex */
public class C26519o {

    /* renamed from: a */
    private static final String f69379a = "ConfigEntityManager";

    /* renamed from: c */
    private static volatile C26519o f69380c;

    /* renamed from: b */
    private ConcurrentHashMap<String, Configuration> f69381b = new ConcurrentHashMap<>();

    /* renamed from: d */
    private String f69382d = "project_id";

    /* renamed from: e */
    private String f69383e = "private_key_id";

    /* renamed from: f */
    private String f69384f = "app_id";

    /* renamed from: g */
    private String f69385g = "international";

    /* renamed from: h */
    private String f69386h = "region";

    /* renamed from: i */
    private String f69387i = "override_miui_region_setting";

    /* renamed from: j */
    private String f69388j = "need_gzip_and_encrypt";

    private C26519o() {
    }

    /* renamed from: a */
    public static C26519o m41380a() {
        if (f69380c == null) {
            synchronized (C26519o.class) {
                if (f69380c == null) {
                    f69380c = new C26519o();
                }
            }
        }
        return f69380c;
    }

    /* renamed from: b */
    private Configuration m41375b(String str) {
        JSONObject optJSONObject;
        try {
            String m40984c = C26599t.m40984c();
            if (TextUtils.isEmpty(m40984c) || (optJSONObject = new JSONObject(C26521a.m41363c(m40984c, C26521a.f69392a)).optJSONObject(str)) == null) {
                return null;
            }
            return new Configuration.Builder().setAppId(optJSONObject.optString(this.f69384f)).setProjectId(optJSONObject.optString(this.f69382d)).setPrivateKeyId(optJSONObject.optString(this.f69383e)).setInternational(optJSONObject.optBoolean(this.f69385g)).setRegion(optJSONObject.optString(this.f69386h)).setOverrideMiuiRegionSetting(optJSONObject.optBoolean(this.f69387i)).setNeedGzipAndEncrypt(optJSONObject.optBoolean(this.f69388j)).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Configuration m41378a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Configuration configuration = this.f69381b.get(str);
        return configuration == null ? m41375b(str) : configuration;
    }

    /* renamed from: a */
    public void m41379a(Configuration configuration) {
        if (configuration == null || TextUtils.isEmpty(configuration.getProjectId())) {
            return;
        }
        this.f69381b.put(configuration.getProjectId(), configuration);
        m41377a(configuration.getProjectId(), configuration);
    }

    /* renamed from: a */
    private void m41377a(String str, Configuration configuration) {
        try {
            if (!TextUtils.isEmpty(str) && configuration != null) {
                C26580e.m41105a(new RunnableC26520p(this, configuration, str));
            }
        } catch (Exception e) {
            C26586j.m41080a(f69379a, "putProjectIdConfigBySP Exception:" + e.getMessage());
        }
    }

    /* renamed from: b */
    public JSONObject m41376b(Configuration configuration) {
        if (configuration == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(this.f69384f, configuration.getAppId());
            jSONObject.put(this.f69382d, configuration.getProjectId());
            jSONObject.put(this.f69383e, configuration.getPrivateKeyId());
            jSONObject.put(this.f69385g, configuration.isInternational());
            jSONObject.put(this.f69386h, configuration.getRegion());
            jSONObject.put(this.f69387i, configuration.isOverrideMiuiRegionSetting());
            jSONObject.put(this.f69388j, configuration.isNeedGzipAndEncrypt());
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
