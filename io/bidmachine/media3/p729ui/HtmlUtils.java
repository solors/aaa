package io.bidmachine.media3.p729ui;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import io.bidmachine.media3.common.util.Util;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.bidmachine.media3.ui.c */
/* loaded from: classes9.dex */
public final class HtmlUtils {
    private HtmlUtils() {
    }

    public static String cssAllClassDescendantsSelector(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String toCssRgba(@ColorInt int i) {
        return Util.formatInvariant("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d));
    }
}
