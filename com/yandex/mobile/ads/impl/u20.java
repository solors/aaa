package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class u20 implements InterfaceC31568ub {
    @Override // com.yandex.mobile.ads.impl.lk0
    /* renamed from: a */
    public final void mo27119a(@NotNull b62 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView m35620n = uiElements.m35620n();
        if (m35620n != null) {
            m35620n.setVisibility(8);
        }
        ImageView m35621m = uiElements.m35621m();
        if (m35621m != null) {
            m35621m.setVisibility(8);
        }
    }
}
