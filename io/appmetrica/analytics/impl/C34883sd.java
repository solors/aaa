package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;

/* renamed from: io.appmetrica.analytics.impl.sd */
/* loaded from: classes9.dex */
public final class C34883sd implements PermissionStrategy {
    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@NonNull String str) {
        return false;
    }

    public final String toString() {
        return "AlwaysAskForPermissionStrategy{always allow permission}";
    }
}
