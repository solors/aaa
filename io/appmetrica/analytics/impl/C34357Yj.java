package io.appmetrica.analytics.impl;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p552ot.pubsub.p554b.C26517m;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Yj */
/* loaded from: classes9.dex */
public final class C34357Yj {

    /* renamed from: a */
    public final String f93844a;

    /* renamed from: b */
    public final String f93845b;

    /* renamed from: c */
    public final String f93846c;

    /* renamed from: d */
    public final String f93847d;

    /* renamed from: e */
    public final String f93848e;

    /* renamed from: f */
    public final int f93849f;

    /* renamed from: g */
    public final int f93850g;

    public C34357Yj(JSONObject jSONObject) {
        this.f93844a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f93845b = jSONObject.optString("kitBuildNumber", "");
        this.f93846c = jSONObject.optString(C26517m.f69374m, "");
        this.f93847d = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.APP_BUILD, "");
        this.f93848e = jSONObject.optString("osVer", "");
        this.f93849f = jSONObject.optInt("osApiLev", -1);
        this.f93850g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        return "SessionRequestParams(kitVersionName='" + this.f93844a + "', kitBuildNumber='" + this.f93845b + "', appVersion='" + this.f93846c + "', appBuild='" + this.f93847d + "', osVersion='" + this.f93848e + "', apiLevel=" + this.f93849f + ", attributionId=" + this.f93850g + ')';
    }
}
