package com.yandex.div.internal.widget;

import android.os.Build;
import android.widget.TextView;
import androidx.annotation.ChecksSdkIntAtLeast;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.yandex.div.internal.widget.i */
/* loaded from: classes8.dex */
public final class TextViews {
    @ChecksSdkIntAtLeast(api = 26)
    /* renamed from: a */
    public static final boolean m36352a() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final float m36351b(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return textView.getPaint().getFontMetrics(null);
    }

    /* renamed from: c */
    public static final int m36350c(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return textView.getPaint().getFontMetricsInt(null);
    }

    /* renamed from: d */
    public static final boolean m36349d(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (m36352a() && textView.getHyphenationFrequency() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final int m36348e(@NotNull TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (textView.getLayout() == null) {
            return 0;
        }
        return textView.getLayout().getLineForVertical(i);
    }

    /* renamed from: f */
    public static final int m36347f(@NotNull TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (textView.getLayout() == null) {
            return 0;
        }
        if (i <= 0) {
            return textView.getLayout().getHeight();
        }
        if (i > textView.getLayout().getLineCount()) {
            return textView.getLayout().getHeight();
        }
        return textView.getLayout().getLineTop(i) - textView.getLayout().getLineTop(0);
    }
}
