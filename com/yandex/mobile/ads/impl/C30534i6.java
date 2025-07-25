package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import com.yandex.mobile.ads.C29880R;
import java.util.Arrays;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.i6 */
/* loaded from: classes8.dex */
public final class C30534i6 implements lk0 {

    /* renamed from: c */
    private static final int f80328c = C29880R.C29886string.monetization_ads_internal_instream_ad_position;

    /* renamed from: a */
    private final int f80329a;

    /* renamed from: b */
    private final int f80330b;

    public C30534i6(int i, int i2) {
        this.f80329a = i;
        this.f80330b = i2;
    }

    @Override // com.yandex.mobile.ads.impl.lk0
    /* renamed from: a */
    public final void mo27119a(@NotNull b62 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView m35632b = uiElements.m35632b();
        if (m35632b != null) {
            String string = m35632b.getContext().getResources().getString(f80328c);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            C37612s0 c37612s0 = C37612s0.f99333a;
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f80329a), Integer.valueOf(this.f80330b)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            m35632b.setText(format);
        }
    }
}
