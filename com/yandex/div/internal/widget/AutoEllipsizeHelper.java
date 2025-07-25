package com.yandex.div.internal.widget;

import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.yandex.div.internal.widget.b */
/* loaded from: classes8.dex */
public final class AutoEllipsizeHelper {
    @NotNull

    /* renamed from: a */
    private final EllipsizedTextView f76118a;

    /* renamed from: b */
    private boolean f76119b;
    @Nullable

    /* renamed from: c */
    private ViewTreeObserver.OnPreDrawListener f76120c;

    public AutoEllipsizeHelper(@NotNull EllipsizedTextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        this.f76118a = textView;
    }

    /* renamed from: b */
    private final void m36380b() {
        if (this.f76120c != null) {
            return;
        }
        this.f76120c = new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.div.internal.widget.a
            {
                AutoEllipsizeHelper.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean m36379c;
                m36379c = AutoEllipsizeHelper.m36379c(AutoEllipsizeHelper.this);
                return m36379c;
            }
        };
        this.f76118a.getViewTreeObserver().addOnPreDrawListener(this.f76120c);
    }

    /* renamed from: c */
    public static final boolean m36379c(AutoEllipsizeHelper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.f76119b) {
            return true;
        }
        EllipsizedTextView ellipsizedTextView = this$0.f76118a;
        int height = (ellipsizedTextView.getHeight() - ellipsizedTextView.getCompoundPaddingTop()) - ellipsizedTextView.getCompoundPaddingBottom();
        int m36348e = TextViews.m36348e(ellipsizedTextView, height);
        int i = m36348e + 1;
        if (height >= TextViews.m36347f(ellipsizedTextView, i)) {
            m36348e = i;
        }
        if (m36348e < this$0.f76118a.getLineCount()) {
            this$0.f76118a.setMaxLines(m36348e);
            return false;
        }
        this$0.m36376f();
        return true;
    }

    /* renamed from: f */
    private final void m36376f() {
        if (this.f76120c != null) {
            this.f76118a.getViewTreeObserver().removeOnPreDrawListener(this.f76120c);
            this.f76120c = null;
        }
    }

    /* renamed from: d */
    public final void m36378d() {
        if (this.f76119b) {
            m36380b();
        }
    }

    /* renamed from: e */
    public final void m36377e() {
        m36376f();
    }

    /* renamed from: g */
    public final void m36375g(boolean z) {
        this.f76119b = z;
    }
}
