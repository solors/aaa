package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.yandex.mobile.ads.C29880R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ej1<V extends ViewGroup> implements InterfaceC30890mz<V> {
    @NotNull

    /* renamed from: a */
    private final C30578is f78666a;
    @NotNull

    /* renamed from: b */
    private final fj1 f78667b;
    @NotNull

    /* renamed from: c */
    private final a11 f78668c;
    @NotNull

    /* renamed from: d */
    private final q11 f78669d;

    public ej1(@NotNull C30578is nativeAdAssets, @NotNull fj1 ratingFormatter, @NotNull a11 nativeAdAdditionalViewProvider, @NotNull q11 nativeAdContainerViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(ratingFormatter, "ratingFormatter");
        Intrinsics.checkNotNullParameter(nativeAdAdditionalViewProvider, "nativeAdAdditionalViewProvider");
        Intrinsics.checkNotNullParameter(nativeAdContainerViewProvider, "nativeAdContainerViewProvider");
        this.f78666a = nativeAdAssets;
        this.f78667b = ratingFormatter;
        this.f78668c = nativeAdAdditionalViewProvider;
        this.f78669d = nativeAdContainerViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(@NotNull V container) {
        String valueOf;
        Intrinsics.checkNotNullParameter(container, "container");
        this.f78669d.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        ViewGroup viewGroup = (ViewGroup) container.findViewById(C29880R.C29884id.rating_container);
        Float m33136k = this.f78666a.m33136k();
        if (m33136k != null) {
            this.f78668c.getClass();
            Intrinsics.checkNotNullParameter(container, "container");
            TextView textView = (TextView) container.findViewById(C29880R.C29884id.rating_text);
            if (textView != null) {
                fj1 fj1Var = this.f78667b;
                float floatValue = m33136k.floatValue();
                fj1Var.getClass();
                try {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                    decimalFormatSymbols.setDecimalSeparator(',');
                    valueOf = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME, decimalFormatSymbols).format(floatValue);
                    Intrinsics.m17074g(valueOf);
                } catch (RuntimeException unused) {
                    valueOf = String.valueOf(floatValue);
                }
                textView.setText(valueOf);
            }
        } else if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
    }
}
