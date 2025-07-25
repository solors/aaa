package com.smaato.sdk.core.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.p574fi.Function;

/* loaded from: classes7.dex */
public final class UIUtils {
    private UIUtils() {
    }

    /* renamed from: a */
    public static /* synthetic */ Integer m39347a(DisplayMetrics displayMetrics) {
        return lambda$getDisplayWidthInDp$0(displayMetrics);
    }

    /* renamed from: b */
    public static /* synthetic */ Integer m39346b(DisplayMetrics displayMetrics) {
        return lambda$getDisplayHeightInDp$1(displayMetrics);
    }

    public static int dpToPx(float f, float f2) {
        return (int) ((f * f2) + 0.5f);
    }

    public static int getDisplayHeightInDp() {
        return scale(new Function() { // from class: com.smaato.sdk.core.util.o
            @Override // com.smaato.sdk.core.util.p574fi.Function
            public final Object apply(Object obj) {
                return UIUtils.m39346b((DisplayMetrics) obj);
            }
        });
    }

    @NonNull
    public static Size getDisplaySizeInDp(@NonNull Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new Size(pxToDp(context, displayMetrics.widthPixels), pxToDp(context, displayMetrics.heightPixels));
    }

    public static int getDisplayWidthInDp() {
        return scale(new Function() { // from class: com.smaato.sdk.core.util.p
            @Override // com.smaato.sdk.core.util.p574fi.Function
            public final Object apply(Object obj) {
                return UIUtils.m39347a((DisplayMetrics) obj);
            }
        });
    }

    public static float getNormalizedSize(@Nullable Float f) {
        if (f == null || f.floatValue() <= 0.0f) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public static /* synthetic */ Integer lambda$getDisplayHeightInDp$1(DisplayMetrics displayMetrics) {
        return Integer.valueOf(displayMetrics.heightPixels);
    }

    public static /* synthetic */ Integer lambda$getDisplayWidthInDp$0(DisplayMetrics displayMetrics) {
        return Integer.valueOf(displayMetrics.widthPixels);
    }

    public static int pxToDp(@NonNull Context context, float f) {
        return Math.round(f / context.getResources().getDisplayMetrics().density);
    }

    private static int scale(@NonNull Function<DisplayMetrics, Integer> function) {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return (int) (function.apply(displayMetrics).intValue() / displayMetrics.density);
    }

    public static int dpToPx(@NonNull Context context, float f) {
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }
}
