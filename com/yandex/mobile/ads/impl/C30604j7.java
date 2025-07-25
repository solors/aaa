package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.j7 */
/* loaded from: classes8.dex */
public final class C30604j7 {
    @NotNull

    /* renamed from: a */
    private final Context f80770a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC30613ja f80771b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC30372ga f80772c;
    @NotNull

    /* renamed from: d */
    private final as1 f80773d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30604j7(Context context, InterfaceC30613ja interfaceC30613ja, InterfaceC30372ga interfaceC30372ga) {
        this(context, interfaceC30613ja, interfaceC30372ga, as1.C29962a.m35776a());
        int i = as1.f76895l;
    }

    /* renamed from: a */
    public final boolean m33035a() {
        boolean mo33005b;
        yp1 m35796a = this.f80773d.m35796a(this.f80770a);
        if (m35796a != null && !m35796a.m26767b0()) {
            mo33005b = this.f80771b.mo33006a();
        } else {
            mo33005b = this.f80771b.mo33005b();
        }
        if (mo33005b && this.f80772c.mo26257a()) {
            return true;
        }
        return false;
    }

    public C30604j7(@NotNull Context context, @NotNull InterfaceC30613ja adVisibilityValidator, @NotNull InterfaceC30372ga adViewRenderingValidator, @NotNull as1 sdkSettings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adVisibilityValidator, "adVisibilityValidator");
        Intrinsics.checkNotNullParameter(adViewRenderingValidator, "adViewRenderingValidator");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f80770a = context;
        this.f80771b = adVisibilityValidator;
        this.f80772c = adViewRenderingValidator;
        this.f80773d = sdkSettings;
    }
}
