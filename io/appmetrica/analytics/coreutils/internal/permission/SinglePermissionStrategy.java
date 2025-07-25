package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class SinglePermissionStrategy implements PermissionResolutionStrategy {

    /* renamed from: a */
    private final PermissionExtractor f92431a;

    /* renamed from: b */
    private final String f92432b;

    public SinglePermissionStrategy(@NotNull PermissionExtractor permissionExtractor, @NotNull String str) {
        this.f92431a = permissionExtractor;
        this.f92432b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(@NotNull Context context) {
        return this.f92431a.hasPermission(context, this.f92432b);
    }
}
