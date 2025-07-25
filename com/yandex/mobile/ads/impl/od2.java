package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import com.monetization.ads.fullscreen.template.view.ExtendedTextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class od2 implements lk0 {
    @Nullable

    /* renamed from: a */
    private final C31034of<?> f83460a;
    @NotNull

    /* renamed from: b */
    private final C31349sf f83461b;

    public od2(@Nullable C31034of<?> c31034of, @NotNull C31349sf assetClickConfigurator) {
        Intrinsics.checkNotNullParameter(assetClickConfigurator, "assetClickConfigurator");
        this.f83460a = c31034of;
        this.f83461b = assetClickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.lk0
    /* renamed from: a */
    public final void mo27119a(@NotNull b62 uiElements) {
        Object obj;
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        TextView m35617q = uiElements.m35617q();
        C31034of<?> c31034of = this.f83460a;
        if (c31034of != null) {
            obj = c31034of.m31041d();
        } else {
            obj = null;
        }
        if ((m35617q instanceof ExtendedTextView) && (obj instanceof String)) {
            x80 x80Var = new x80(uiElements.m35633a());
            ExtendedTextView extendedTextView = (ExtendedTextView) m35617q;
            extendedTextView.setText((CharSequence) obj);
            extendedTextView.setVisibility(0);
            extendedTextView.setAutoSizeTextType(1);
            extendedTextView.setMeasureSpecProvider(x80Var);
            this.f83461b.m29633a(m35617q, this.f83460a);
        } else if (m35617q != null) {
            m35617q.setVisibility(8);
        }
    }
}
