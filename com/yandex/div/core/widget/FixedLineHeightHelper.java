package com.yandex.div.core.widget;

import android.os.Build;
import android.widget.TextView;
import com.yandex.div.internal.widget.TextViews;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.yandex.div.core.widget.h */
/* loaded from: classes8.dex */
public final class FixedLineHeightHelper {
    @NotNull

    /* renamed from: a */
    private final TextView f76014a;

    /* renamed from: b */
    private int f76015b;

    /* renamed from: c */
    private int f76016c;

    /* renamed from: d */
    private int f76017d;

    public FixedLineHeightHelper(@NotNull TextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f76014a = view;
        this.f76017d = -1;
        view.setIncludeFontPadding(false);
    }

    /* renamed from: d */
    private final void m36520d(int i) {
        if (i == -1) {
            m36515i();
            return;
        }
        int m36350c = i - TextViews.m36350c(this.f76014a);
        if (m36350c < 0) {
            int i2 = m36350c / 2;
            this.f76015b = i2;
            this.f76016c = m36350c - i2;
        } else {
            int i3 = m36350c / 2;
            this.f76016c = i3;
            this.f76015b = m36350c - i3;
        }
        this.f76014a.setLineSpacing(i - TextViews.m36351b(this.f76014a), 1.0f);
        m36514j(false);
    }

    /* renamed from: i */
    private final void m36515i() {
        this.f76015b = 0;
        this.f76016c = 0;
        this.f76014a.setLineSpacing(0.0f, 1.0f);
        m36514j(true);
    }

    /* renamed from: j */
    private final void m36514j(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f76014a.setFallbackLineSpacing(z);
        }
    }

    /* renamed from: e */
    public final int m36519e() {
        return this.f76016c;
    }

    /* renamed from: f */
    public final int m36518f() {
        return this.f76015b;
    }

    /* renamed from: g */
    public final int m36517g() {
        return this.f76017d;
    }

    /* renamed from: h */
    public final void m36516h() {
        m36520d(this.f76017d);
    }

    /* renamed from: k */
    public final void m36513k(int i) {
        if (this.f76017d == i) {
            return;
        }
        this.f76017d = i;
        m36520d(i);
    }
}
