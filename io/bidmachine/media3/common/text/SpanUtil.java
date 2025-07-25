package io.bidmachine.media3.common.text;

import android.text.Spannable;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public final class SpanUtil {
    private SpanUtil() {
    }

    public static void addOrReplaceSpan(Spannable spannable, Object obj, int i, int i2, int i3) {
        Object[] spans;
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == i3) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i2, i3);
    }
}
