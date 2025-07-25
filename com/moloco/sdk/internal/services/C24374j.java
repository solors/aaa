package com.moloco.sdk.internal.services;

import android.content.Context;
import com.moloco.sdk.common_adapter_internal.C23862a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.C25378o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.j */
/* loaded from: classes7.dex */
public final class C24374j implements InterfaceC24356h {
    @NotNull

    /* renamed from: a */
    public final Context f63105a;

    public C24374j(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f63105a = context;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24356h
    @NotNull
    /* renamed from: a */
    public C24354g mo46523a() {
        C23862a invoke = C25378o.m44653a(this.f63105a).invoke();
        float m47596e = invoke.m47596e();
        return new C24354g(invoke.m47595f(), m47596e, invoke.m47598c(), invoke.m47599b(), invoke.m47597d(), invoke.m47600a(), this.f63105a.getResources().getDisplayMetrics().xdpi, this.f63105a.getResources().getDisplayMetrics().ydpi);
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24356h
    @NotNull
    /* renamed from: b */
    public EnumC24376l mo46522b() {
        int i = this.f63105a.getResources().getConfiguration().orientation;
        if (i != 1) {
            if (i != 2) {
                return EnumC24376l.UNKNOWN;
            }
            return EnumC24376l.LANDSCAPE;
        }
        return EnumC24376l.PORTRAIT;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24356h
    @NotNull
    public C24354g invoke() {
        return mo46523a();
    }
}
