package io.appmetrica.analytics.impl;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p552ot.pubsub.p554b.C26517m;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: io.appmetrica.analytics.impl.n7 */
/* loaded from: classes9.dex */
public final class C34744n7 {

    /* renamed from: a */
    public final String f94978a;

    /* renamed from: b */
    public final String f94979b;

    /* renamed from: c */
    public final String f94980c;

    /* renamed from: d */
    public final String f94981d;

    /* renamed from: e */
    public final String f94982e;

    /* renamed from: f */
    public final String f94983f;

    /* renamed from: g */
    public final String f94984g;

    /* renamed from: h */
    public final String f94985h;

    /* renamed from: i */
    public final String f94986i;

    /* renamed from: j */
    public final String f94987j;

    /* renamed from: k */
    public final String f94988k;

    /* renamed from: l */
    public final String f94989l;

    /* renamed from: m */
    public final String f94990m;

    /* renamed from: n */
    public final String f94991n;

    public C34744n7(C34424bb c34424bb) {
        this.f94978a = c34424bb.m21934b("dId");
        this.f94979b = c34424bb.m21934b("uId");
        this.f94980c = c34424bb.m21934b("analyticsSdkVersionName");
        this.f94981d = c34424bb.m21934b("kitBuildNumber");
        this.f94982e = c34424bb.m21934b("kitBuildType");
        this.f94983f = c34424bb.m21934b(C26517m.f69374m);
        this.f94984g = c34424bb.optString("app_debuggable", "0");
        this.f94985h = c34424bb.m21934b(RemoteConfigConstants.RequestFieldKey.APP_BUILD);
        this.f94986i = c34424bb.m21934b("osVer");
        this.f94988k = c34424bb.m21934b("lang");
        this.f94989l = c34424bb.m21934b("root");
        this.f94990m = c34424bb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int optInt = c34424bb.optInt("osApiLev", -1);
        this.f94987j = optInt == -1 ? null : String.valueOf(optInt);
        int optInt2 = c34424bb.optInt("attribution_id", 0);
        this.f94991n = optInt2 > 0 ? String.valueOf(optInt2) : null;
    }

    public final String toString() {
        return "DbNetworkTaskConfig{deviceId='" + this.f94978a + "', uuid='" + this.f94979b + "', analyticsSdkVersionName='" + this.f94980c + "', kitBuildNumber='" + this.f94981d + "', kitBuildType='" + this.f94982e + "', appVersion='" + this.f94983f + "', appDebuggable='" + this.f94984g + "', appBuildNumber='" + this.f94985h + "', osVersion='" + this.f94986i + "', osApiLevel='" + this.f94987j + "', locale='" + this.f94988k + "', deviceRootStatus='" + this.f94989l + "', appFramework='" + this.f94990m + "', attributionId='" + this.f94991n + "'}";
    }

    public C34744n7() {
        this.f94978a = null;
        this.f94979b = null;
        this.f94980c = null;
        this.f94981d = null;
        this.f94982e = null;
        this.f94983f = null;
        this.f94984g = null;
        this.f94985h = null;
        this.f94986i = null;
        this.f94987j = null;
        this.f94988k = null;
        this.f94989l = null;
        this.f94990m = null;
        this.f94991n = null;
    }
}
