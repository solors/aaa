package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.r5 */
/* loaded from: classes9.dex */
public final class C34849r5 implements PermissionStrategy {

    /* renamed from: a */
    public final PermissionStrategy[] f95266a;

    public C34849r5(@NotNull PermissionStrategy... permissionStrategyArr) {
        this.f95266a = permissionStrategyArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@NotNull String str) {
        for (PermissionStrategy permissionStrategy : this.f95266a) {
            if (permissionStrategy.forbidUsePermission(str)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String toString() {
        return "CompositePermissionStrategy(strategies=" + Arrays.toString(this.f95266a) + ')';
    }
}
