package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.I7 */
/* loaded from: classes9.dex */
public final class C33962I7 {

    /* renamed from: a */
    public final Map f93015a;

    /* renamed from: b */
    public final String f93016b;

    /* renamed from: c */
    public final String f93017c;

    public C33962I7(String str, HashMap hashMap, String str2) {
        this.f93016b = str;
        this.f93015a = hashMap;
        this.f93017c = str2;
    }

    public final String toString() {
        return "DeferredDeeplinkState{mParameters=" + this.f93015a + ", mDeeplink='" + this.f93016b + "', mUnparsedReferrer='" + this.f93017c + "'}";
    }
}
