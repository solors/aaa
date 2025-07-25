package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class AnyOfPermissionStrategy extends MultiplePermissionBaseStrategy {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AnyOfPermissionStrategy(@org.jetbrains.annotations.NotNull io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor r1, @org.jetbrains.annotations.NotNull java.lang.String... r2) {
        /*
            r0 = this;
            java.util.List r2 = kotlin.collections.C37551l.m17482D0(r2)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.coreutils.internal.permission.AnyOfPermissionStrategy.<init>(io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor, java.lang.String[]):void");
    }

    @Override // io.appmetrica.analytics.coreutils.internal.permission.MultiplePermissionBaseStrategy
    public boolean hasNecessaryPermissions(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull List<String> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str : list) {
                if (permissionExtractor.hasPermission(context, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
