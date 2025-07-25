package io.appmetrica.analytics.coreutils.internal.services;

import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DoNotInline
@Metadata
@TargetApi(33)
/* loaded from: classes9.dex */
public final class PackageManagerUtilsTiramisu {
    @NotNull
    public static final PackageManagerUtilsTiramisu INSTANCE = new PackageManagerUtilsTiramisu();
    @NotNull

    /* renamed from: a */
    private static final String f92446a = "[PackageManagerUtilsTiramisu]";

    private PackageManagerUtilsTiramisu() {
    }

    @Nullable
    public final ProviderInfo resolveContentProvider(@NotNull PackageManager packageManager, @NotNull String str) {
        try {
            return packageManager.resolveContentProvider(str, PackageManager.ComponentInfoFlags.of(8L));
        } catch (Throwable unused) {
            return null;
        }
    }
}
