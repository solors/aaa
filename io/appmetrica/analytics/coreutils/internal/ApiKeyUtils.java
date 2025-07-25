package io.appmetrica.analytics.coreutils.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class ApiKeyUtils {
    @NotNull
    public static final ApiKeyUtils INSTANCE = new ApiKeyUtils();

    private ApiKeyUtils() {
    }

    @NotNull
    public static final String createPartialApiKey(@Nullable String str) {
        if (str != null && str.length() == 36) {
            StringBuilder sb2 = new StringBuilder(str);
            sb2.replace(8, str.length() - 4, "-xxxx-xxxx-xxxx-xxxxxxxx");
            return sb2.toString();
        }
        return "undefined";
    }
}
