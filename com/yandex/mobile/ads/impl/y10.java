package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class y10 implements lk0 {
    @Nullable

    /* renamed from: a */
    private final C31034of<?> f87993a;
    @NotNull

    /* renamed from: b */
    private final C31349sf f87994b;

    public y10(@Nullable C31034of<?> c31034of, @NotNull C31349sf clickConfigurator) {
        Intrinsics.checkNotNullParameter(clickConfigurator, "clickConfigurator");
        this.f87993a = c31034of;
        this.f87994b = clickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.lk0
    /* renamed from: a */
    public final void mo27119a(@NotNull b62 uiElements) {
        Object obj;
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView m35628f = uiElements.m35628f();
        C31034of<?> c31034of = this.f87993a;
        if (c31034of != null) {
            obj = c31034of.m31041d();
        } else {
            obj = null;
        }
        if (m35628f != null) {
            if (obj instanceof String) {
                m35628f.setText((CharSequence) obj);
                m35628f.setVisibility(0);
                this.f87994b.m29633a(m35628f, this.f87993a);
                return;
            }
            m35628f.setVisibility(8);
        }
    }
}
