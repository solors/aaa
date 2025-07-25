package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.vungle.ads.internal.util.w */
/* loaded from: classes7.dex */
public final class ViewUtility {
    @NotNull
    public static final ViewUtility INSTANCE = new ViewUtility();

    private ViewUtility() {
    }

    public final int dpToPixels(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @NotNull
    public final Tuples<Integer, Integer> getDeviceWidthAndHeightWithOrientation(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getApplicationContext().getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i2 = resources.getConfiguration().orientation;
        if (i == 0) {
            i = i2;
        }
        if (i == i2) {
            return new Tuples<>(Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density)));
        }
        return new Tuples<>(Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)));
    }

    @NotNull
    public final WebView getWebView(@NotNull Context context) throws InstantiationException {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return new WebView(context);
        } catch (Resources.NotFoundException e) {
            throw new InstantiationException("Cannot instantiate WebView due to Resources.NotFoundException: " + e + ".message");
        } catch (Exception e2) {
            throw new InstantiationException(e2.getMessage());
        }
    }
}
