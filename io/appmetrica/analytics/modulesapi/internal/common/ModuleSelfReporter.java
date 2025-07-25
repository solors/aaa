package io.appmetrica.analytics.modulesapi.internal.common;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public interface ModuleSelfReporter {

    @Metadata
    /* loaded from: classes9.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void reportError$default(ModuleSelfReporter moduleSelfReporter, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportError");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            moduleSelfReporter.reportError(str, th);
        }

        public static /* synthetic */ void reportError$default(ModuleSelfReporter moduleSelfReporter, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportError");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            moduleSelfReporter.reportError(str, str2);
        }
    }

    void reportError(@NotNull String str, @Nullable String str2);

    void reportError(@NotNull String str, @Nullable Throwable th);

    void reportEvent(int i, @NotNull String str, @Nullable String str2);

    void reportEvent(@NotNull String str);

    void reportEvent(@NotNull String str, @Nullable String str2);

    void reportEvent(@NotNull String str, @Nullable Map<String, ? extends Object> map);
}
