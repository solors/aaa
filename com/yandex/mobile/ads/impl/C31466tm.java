package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.tm */
/* loaded from: classes8.dex */
public final class C31466tm implements lk0 {
    @Override // com.yandex.mobile.ads.impl.lk0
    /* renamed from: a */
    public final void mo27119a(@NotNull b62 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        View m35631c = uiElements.m35631c();
        TextView m35628f = uiElements.m35628f();
        ImageView m35627g = uiElements.m35627g();
        if (m35628f != null && m35628f.getVisibility() == 8 && m35627g != null && m35627g.getVisibility() == 8 && m35631c != null) {
            m35631c.setBackground(null);
        }
    }
}
