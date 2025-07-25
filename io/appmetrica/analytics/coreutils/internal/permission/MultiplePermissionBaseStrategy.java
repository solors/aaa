package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public abstract class MultiplePermissionBaseStrategy implements PermissionResolutionStrategy {

    /* renamed from: a */
    private final PermissionExtractor f92429a;

    /* renamed from: b */
    private final List f92430b;

    public MultiplePermissionBaseStrategy(@NotNull PermissionExtractor permissionExtractor, @NotNull List<String> list) {
        this.f92429a = permissionExtractor;
        this.f92430b = list;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(@NotNull Context context) {
        if (!this.f92430b.isEmpty() && !hasNecessaryPermissions(context, this.f92429a, this.f92430b)) {
            return false;
        }
        return true;
    }

    public abstract boolean hasNecessaryPermissions(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull List<String> list);
}
