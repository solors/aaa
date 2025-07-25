package io.bidmachine.media3.p729ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.google.common.base.Predicate;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.text.LanguageFeatureSpan;
import io.bidmachine.media3.common.util.Assertions;

/* renamed from: io.bidmachine.media3.ui.i0 */
/* loaded from: classes9.dex */
final class SubtitleViewUtils {
    private SubtitleViewUtils() {
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m19592a(Object obj) {
        return lambda$removeEmbeddedFontSizes$1(obj);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m19591b(Object obj) {
        return lambda$removeAllEmbeddedStyling$0(obj);
    }

    public static /* synthetic */ boolean lambda$removeAllEmbeddedStyling$0(Object obj) {
        return !(obj instanceof LanguageFeatureSpan);
    }

    public static /* synthetic */ boolean lambda$removeEmbeddedFontSizes$1(Object obj) {
        if (!(obj instanceof AbsoluteSizeSpan) && !(obj instanceof RelativeSizeSpan)) {
            return false;
        }
        return true;
    }

    public static void removeAllEmbeddedStyling(Cue.Builder builder) {
        builder.clearWindowColor();
        if (builder.getText() instanceof Spanned) {
            if (!(builder.getText() instanceof Spannable)) {
                builder.setText(SpannableString.valueOf(builder.getText()));
            }
            removeSpansIf((Spannable) Assertions.checkNotNull(builder.getText()), new Predicate() { // from class: io.bidmachine.media3.ui.h0
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return SubtitleViewUtils.m19591b(obj);
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
            removeSpansIf((Spannable) Assertions.checkNotNull(builder.getText()), new Predicate() { // from class: io.bidmachine.media3.ui.g0
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return SubtitleViewUtils.m19592a(obj);
                }
            });
        }
    }

    private static void removeSpansIf(Spannable spannable, Predicate<Object> predicate) {
        Object[] spans;
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (predicate.apply(obj)) {
                spannable.removeSpan(obj);
            }
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
