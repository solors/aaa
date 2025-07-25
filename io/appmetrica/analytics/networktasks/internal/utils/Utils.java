package io.appmetrica.analytics.networktasks.internal.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class Utils {
    @NotNull
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    public static final boolean isBadRequest(int i) {
        if (i == 400) {
            return true;
        }
        return false;
    }
}
