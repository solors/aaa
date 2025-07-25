package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.sm */
/* loaded from: classes8.dex */
public final class C31379sm implements lk0 {
    @Nullable

    /* renamed from: a */
    private final C31034of<?> f85306a;
    @NotNull

    /* renamed from: b */
    private final C31382sn f85307b;

    public C31379sm(@Nullable C31034of<?> c31034of, @NotNull C31382sn clickControlConfigurator) {
        Intrinsics.checkNotNullParameter(clickControlConfigurator, "clickControlConfigurator");
        this.f85306a = c31034of;
        this.f85307b = clickControlConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.lk0
    /* renamed from: a */
    public final void mo27119a(@NotNull b62 uiElements) {
        Object obj;
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView m35629e = uiElements.m35629e();
        ImageView m35630d = uiElements.m35630d();
        if (m35629e != null) {
            C31034of<?> c31034of = this.f85306a;
            if (c31034of != null) {
                obj = c31034of.m31041d();
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                m35629e.setVisibility(0);
                m35629e.setText((CharSequence) obj);
            } else {
                m35629e.setVisibility(8);
            }
            this.f85307b.m29580a(m35629e);
        }
        if (m35630d != null) {
            this.f85307b.m29580a(m35630d);
        }
    }
}
