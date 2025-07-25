package io.appmetrica.analytics.coreapi.internal.system;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface PermissionExtractor {
    boolean hasPermission(@NotNull Context context, @NotNull String str);
}
