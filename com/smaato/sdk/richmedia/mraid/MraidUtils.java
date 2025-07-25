package com.smaato.sdk.richmedia.mraid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class MraidUtils {
    private MraidUtils() {
    }

    @NonNull
    public static String format(@NonNull String str, @NonNull Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    @Nullable
    public static Float parseOptFloat(@NonNull String str) {
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
