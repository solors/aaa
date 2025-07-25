package io.appmetrica.analytics.coreutils.internal;

import android.annotation.SuppressLint;
import android.os.Build;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class AndroidUtils {
    @NotNull
    public static final AndroidUtils INSTANCE = new AndroidUtils();

    private AndroidUtils() {
    }

    @SuppressLint({"AnnotateVersionCheck"})
    public static final boolean isApiAchieved(int i) {
        if (Build.VERSION.SDK_INT >= i) {
            return true;
        }
        return false;
    }
}
