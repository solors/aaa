package com.google.android.exoplayer2.p380ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.span.LanguageFeatureSpan;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Predicate;

/* renamed from: com.google.android.exoplayer2.ui.SubtitleViewUtils */
/* loaded from: classes4.dex */
final class SubtitleViewUtils {
    private SubtitleViewUtils() {
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m72841a(Object obj) {
        return m72839c(obj);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m72840b(Object obj) {
        return m72838d(obj);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m72839c(Object obj) {
        return !(obj instanceof LanguageFeatureSpan);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m72838d(Object obj) {
        if (!(obj instanceof AbsoluteSizeSpan) && !(obj instanceof RelativeSizeSpan)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static void m72837e(Spannable spannable, Predicate<Object> predicate) {
        Object[] spans;
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (predicate.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static void removeAllEmbeddedStyling(Cue.Builder builder) {
        builder.clearWindowColor();
        if (builder.getText() instanceof Spanned) {
            if (!(builder.getText() instanceof Spannable)) {
                builder.setText(SpannableString.valueOf(builder.getText()));
            }
            m72837e((Spannable) Assertions.checkNotNull(builder.getText()), new Predicate() { // from class: com.google.android.exoplayer2.ui.e0
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return SubtitleViewUtils.m72841a(obj);
                }
            });
        }
        removeEmbeddedFontSizes(builder);
    }

    public static void removeEmbeddedFontSizes(Cue.Builder builder) {
        builder.setTextSize(-3.4028235E38f, Integer.MIN_VALUE);
        if (builder.getText() instanceof Spanned) {
            if (!(builder.getText() instanceof Spannable)) {
                builder.setText(SpannableString.valueOf(builder.getText()));
            }
            m72837e((Spannable) Assertions.checkNotNull(builder.getText()), new Predicate() { // from class: com.google.android.exoplayer2.ui.d0
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return SubtitleViewUtils.m72840b(obj);
                }
            });
        }
    }

    public static float resolveTextSize(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        } else {
            f2 = i3;
        }
        return f * f2;
    }
}
