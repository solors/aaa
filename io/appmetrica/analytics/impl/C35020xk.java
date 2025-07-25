package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;

/* renamed from: io.appmetrica.analytics.impl.xk */
/* loaded from: classes9.dex */
public final class C35020xk implements PermissionExtractor {

    /* renamed from: b */
    public static final String f95616b = "[SimplePermissionExtractor]";

    /* renamed from: a */
    public final PermissionStrategy f95617a;

    public C35020xk(@NonNull PermissionStrategy permissionStrategy) {
        this.f95617a = permissionStrategy;
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public final PermissionStrategy m20767a() {
        return this.f95617a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(@NonNull Context context, @NonNull String str) {
        if (this.f95617a.forbidUsePermission(str)) {
            return false;
        }
        try {
            if (context.checkCallingOrSelfPermission(str) != 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
