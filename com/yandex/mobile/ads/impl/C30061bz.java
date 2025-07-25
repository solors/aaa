package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.bz */
/* loaded from: classes8.dex */
public final class C30061bz implements InterfaceC31616ux {
    @NotNull

    /* renamed from: a */
    private final Context f77451a;

    public C30061bz(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77451a = context;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31616ux
    @NotNull
    /* renamed from: a */
    public final C31034of<?> mo26543a() {
        CharSequence text = this.f77451a.getResources().getText(C29880R.C29886string.monetization_ads_internal_instream_sponsored_social);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return new C31034of<>("sponsored", "string", text, null, false, true);
    }
}
