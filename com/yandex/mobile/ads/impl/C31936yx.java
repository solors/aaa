package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.yx */
/* loaded from: classes8.dex */
public final class C31936yx implements InterfaceC31616ux {
    @NotNull

    /* renamed from: a */
    private final Context f88603a;

    public C31936yx(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f88603a = context;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31616ux
    @NotNull
    /* renamed from: a */
    public final C31034of<?> mo26543a() {
        CharSequence text = this.f88603a.getResources().getText(C29880R.C29886string.monetization_ads_internal_instream_call_to_action);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return new C31034of<>("call_to_action", "string", text, null, true, true);
    }
}
