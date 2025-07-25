package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class zu1 {
    @NotNull

    /* renamed from: a */
    private final ik0 f89126a;
    @NotNull

    /* renamed from: b */
    private final gk0 f89127b;

    public zu1(@NotNull ik0 viewHolderManager) {
        Intrinsics.checkNotNullParameter(viewHolderManager, "viewHolderManager");
        this.f89126a = viewHolderManager;
        this.f89127b = new gk0();
    }

    /* renamed from: a */
    public final void m25984a() {
        b62 b62Var;
        b62 b62Var2;
        h50 instreamAdView;
        h50 instreamAdView2;
        hk0 m33219a = this.f89126a.m33219a();
        if (m33219a == null || (instreamAdView2 = m33219a.m33540b()) == null) {
            b62Var = null;
        } else {
            this.f89127b.getClass();
            Intrinsics.checkNotNullParameter(instreamAdView2, "instreamAdView");
            b62Var = instreamAdView2.getAdUiElements();
        }
        TextView m35623k = b62Var != null ? b62Var.m35623k() : null;
        if (m35623k != null) {
            m35623k.setVisibility(8);
        }
        hk0 m33219a2 = this.f89126a.m33219a();
        if (m33219a2 == null || (instreamAdView = m33219a2.m33540b()) == null) {
            b62Var2 = null;
        } else {
            this.f89127b.getClass();
            Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
            b62Var2 = instreamAdView.getAdUiElements();
        }
        View m35622l = b62Var2 != null ? b62Var2.m35622l() : null;
        if (m35622l != null) {
            m35622l.setVisibility(0);
            m35622l.setEnabled(true);
        }
    }

    /* renamed from: a */
    public final void m25983a(long j, long j2) {
        b62 b62Var;
        h50 instreamAdView;
        hk0 m33219a = this.f89126a.m33219a();
        if (m33219a == null || (instreamAdView = m33219a.m33540b()) == null) {
            b62Var = null;
        } else {
            this.f89127b.getClass();
            Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
            b62Var = instreamAdView.getAdUiElements();
        }
        TextView m35623k = b62Var != null ? b62Var.m35623k() : null;
        int i = ((int) ((j - j2) / 1000)) + 1;
        if (m35623k != null) {
            m35623k.setText(String.valueOf(i));
            m35623k.setVisibility(0);
        }
    }
}
