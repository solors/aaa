package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.inmobi.sdk.InMobiSdk;
import com.yandex.mobile.ads.impl.InterfaceC30107cp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.bp */
/* loaded from: classes8.dex */
public final class C30040bp {
    @NotNull

    /* renamed from: a */
    private final tl1 f77381a;

    public C30040bp(@NotNull tl1 requestHelper) {
        Intrinsics.checkNotNullParameter(requestHelper, "requestHelper");
        this.f77381a = requestHelper;
    }

    /* renamed from: a */
    public final void m35454a(@NotNull Context context, @NotNull Uri.Builder builder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builder, "builder");
        InterfaceC30107cp.f77696a.getClass();
        InterfaceC30107cp m35208a = InterfaceC30107cp.C30108a.m35208a(context);
        tl1 tl1Var = this.f77381a;
        C30262ep c30262ep = (C30262ep) m35208a;
        String mo34480a = c30262ep.mo34480a();
        tl1Var.getClass();
        tl1.m29106a(builder, "gdpr", mo34480a);
        tl1 tl1Var2 = this.f77381a;
        String mo34477b = c30262ep.mo34477b();
        tl1Var2.getClass();
        tl1.m29106a(builder, InMobiSdk.IM_GDPR_CONSENT_IAB, mo34477b);
        tl1 tl1Var3 = this.f77381a;
        String mo34476c = c30262ep.mo34476c();
        tl1Var3.getClass();
        tl1.m29106a(builder, "parsed_purpose_consents", mo34476c);
        tl1 tl1Var4 = this.f77381a;
        String m34473f = c30262ep.m34473f();
        tl1Var4.getClass();
        tl1.m29106a(builder, "parsed_vendor_consents", m34473f);
        tl1 tl1Var5 = this.f77381a;
        Integer valueOf = Integer.valueOf(c30262ep.m34474e() ? 1 : 0);
        tl1Var5.getClass();
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter("cmp_present", "key");
        tl1.m29106a(builder, "cmp_present", valueOf.toString());
    }
}
