package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.fl1;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class u72 {
    @Nullable

    /* renamed from: a */
    private final C30149d8<?> f86145a;
    @NotNull

    /* renamed from: b */
    private final nx0 f86146b;
    @NotNull

    /* renamed from: c */
    private final t72 f86147c;
    @Nullable

    /* renamed from: d */
    private InterfaceC31556a f86148d;
    @Nullable

    /* renamed from: e */
    private InterfaceC31557b f86149e;
    @Nullable

    /* renamed from: f */
    private Map<String, ? extends Object> f86150f;

    /* renamed from: com.yandex.mobile.ads.impl.u72$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC31556a {
        @NotNull
        /* renamed from: a */
        Map<String, Object> mo28857a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.u72$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC31557b {
        @NotNull
        /* renamed from: a */
        gl1 mo28856a();
    }

    public u72(@NotNull Context context, @NotNull C30359g3 adConfiguration, @Nullable C30149d8<?> c30149d8, @NotNull C31952z4 adLoadingPhasesManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f86145a = c30149d8;
        adConfiguration.m33949q().mo30594e();
        lh2 lh2Var = lh2.f81817a;
        adConfiguration.m33949q().getClass();
        this.f86146b = C31644vc.m28371a(context, lh2Var, qf2.f84329a);
        this.f86147c = new t72(adLoadingPhasesManager);
    }

    /* renamed from: a */
    public final void m28860a(@NotNull String failureReason, @NotNull String errorMessage) {
        Map<String, Object> m17279o;
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        m17279o = C37559r0.m17279o(C38513v.m14532a("status", "error"), C38513v.m14532a("failure_reason", failureReason), C38513v.m14532a("error_message", errorMessage));
        m28859a(m17279o);
    }

    /* renamed from: b */
    public final void m28858b(@Nullable Map<String, ? extends Object> map) {
        this.f86150f = map;
    }

    /* renamed from: a */
    private final void m28859a(Map<String, Object> reportData) {
        Map m17285D;
        Map<String, ? extends Object> map = this.f86150f;
        if (map == null) {
            map = C37559r0.m17284j();
        }
        reportData.putAll(map);
        InterfaceC31556a interfaceC31556a = this.f86148d;
        Map<String, Object> mo28857a = interfaceC31556a != null ? interfaceC31556a.mo28857a() : null;
        if (mo28857a == null) {
            mo28857a = C37559r0.m17284j();
        }
        reportData.putAll(mo28857a);
        InterfaceC31557b interfaceC31557b = this.f86149e;
        Map<String, Object> m33815b = interfaceC31557b != null ? interfaceC31557b.mo28856a().m33815b() : null;
        if (m33815b == null) {
            m33815b = C37559r0.m17284j();
        }
        reportData.putAll(m33815b);
        fl1.EnumC30324b reportType = fl1.EnumC30324b.f79127O;
        C30149d8<?> c30149d8 = this.f86145a;
        C30280f m35068a = c30149d8 != null ? c30149d8.m35068a() : null;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        String m34119a = reportType.m34119a();
        m17285D = C37559r0.m17285D(reportData);
        this.f86146b.mo27968a(new fl1(m34119a, m17285D, m35068a));
    }

    /* renamed from: a */
    public final void m28863a() {
        Map<String, Object> m17279o;
        m17279o = C37559r0.m17279o(C38513v.m14532a("status", "success"), C38513v.m14532a("durations", this.f86147c.mo29261a()));
        m28859a(m17279o);
    }

    /* renamed from: a */
    public final void m28861a(@Nullable InterfaceC31557b interfaceC31557b) {
        this.f86149e = interfaceC31557b;
    }

    /* renamed from: a */
    public final void m28862a(@Nullable InterfaceC31556a interfaceC31556a) {
        this.f86148d = interfaceC31556a;
    }
}
