package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.fl1;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class d01 {
    @NotNull

    /* renamed from: a */
    private final C30149d8<?> f77818a;
    @NotNull

    /* renamed from: b */
    private final nx0 f77819b;

    /* renamed from: c */
    private boolean f77820c;

    /* renamed from: d */
    private boolean f77821d;

    /* renamed from: e */
    private boolean f77822e;

    public d01(@NotNull Context context, @NotNull C30149d8<?> adResponse, @NotNull C30359g3 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f77818a = adResponse;
        adConfiguration.m33949q().mo30594e();
        lh2 lh2Var = lh2.f81817a;
        adConfiguration.m33949q().getClass();
        this.f77819b = C31644vc.m28371a(context, lh2Var, qf2.f84329a);
        this.f77820c = true;
        this.f77821d = true;
        this.f77822e = true;
    }

    /* renamed from: a */
    public final void m35127a() {
        if (this.f77822e) {
            m35126a("first_auto_swipe");
            this.f77822e = false;
        }
    }

    /* renamed from: b */
    public final void m35125b() {
        if (this.f77820c) {
            m35126a("first_click_on_controls");
            this.f77820c = false;
        }
    }

    /* renamed from: c */
    public final void m35124c() {
        if (this.f77821d) {
            m35126a("first_user_swipe");
            this.f77821d = false;
        }
    }

    /* renamed from: a */
    private final void m35126a(String str) {
        HashMap reportData;
        Map m17285D;
        fl1.EnumC30324b reportType = fl1.EnumC30324b.f79128P;
        reportData = C37559r0.m17282l(C38513v.m14532a("event_type", str));
        C30280f m35068a = this.f77818a.m35068a();
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        String m34119a = reportType.m34119a();
        m17285D = C37559r0.m17285D(reportData);
        this.f77819b.mo27968a(new fl1(m34119a, m17285D, m35068a));
    }
}
