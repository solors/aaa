package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;

/* renamed from: com.chartboost.sdk.impl.r5 */
/* loaded from: classes3.dex */
public final class C10164r5 {

    /* renamed from: a */
    public final C10063n5 f23047a;

    /* renamed from: b */
    public final C10209t0 f23048b;

    /* renamed from: c */
    public final String f23049c;

    public C10164r5(C10063n5 googleAdvertisingId, C10209t0 amazonAdvertisingId, String manufacturer) {
        Intrinsics.checkNotNullParameter(googleAdvertisingId, "googleAdvertisingId");
        Intrinsics.checkNotNullParameter(amazonAdvertisingId, "amazonAdvertisingId");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        this.f23047a = googleAdvertisingId;
        this.f23048b = amazonAdvertisingId;
        this.f23049c = manufacturer;
    }

    /* renamed from: a */
    public final C10158r0 m80686a() {
        try {
            if (m80684b()) {
                return this.f23048b.m80561b();
            }
            return this.f23047a.m81038b();
        } catch (Exception e) {
            C9763c7.m81920b("getAdvertisingId error", e);
            return new C10158r0(EnumC10170ra.f23054c, "");
        }
    }

    /* renamed from: b */
    public final boolean m80684b() {
        boolean m16615y;
        m16615y = StringsJVM.m16615y("Amazon", this.f23049c, true);
        return m16615y;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C10164r5(com.chartboost.sdk.impl.C10063n5 r1, com.chartboost.sdk.impl.C10209t0 r2, java.lang.String r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "MANUFACTURER"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
        Lb:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C10164r5.<init>(com.chartboost.sdk.impl.n5, com.chartboost.sdk.impl.t0, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: a */
    public final String m80685a(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        String m82132a = AbstractC9670a4.m82132a(context, z);
        Intrinsics.checkNotNullExpressionValue(m82132a, "getUniqueId(...)");
        return m82132a;
    }
}
