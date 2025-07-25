package io.appmetrica.analytics.modulesapi.internal.common;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public interface ModulePreferences {

    @Metadata
    /* loaded from: classes9.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ int getInt$default(ModulePreferences modulePreferences, String str, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = 0;
                }
                return modulePreferences.getInt(str, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
        }

        public static /* synthetic */ long getLong$default(ModulePreferences modulePreferences, String str, long j, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    j = 0;
                }
                return modulePreferences.getLong(str, j);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
        }

        public static /* synthetic */ String getString$default(ModulePreferences modulePreferences, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                return modulePreferences.getString(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
    }

    boolean getBoolean(@NotNull String str, boolean z);

    int getInt(@NotNull String str, int i);

    long getLong(@NotNull String str, long j);

    @Nullable
    String getString(@NotNull String str, @Nullable String str2);

    void putBoolean(@NotNull String str, boolean z);

    void putInt(@NotNull String str, int i);

    void putLong(@NotNull String str, long j);

    void putString(@NotNull String str, @Nullable String str2);
}
