package io.appmetrica.analytics.coreapi.internal.permission;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface PermissionResolutionStrategy {
    boolean hasNecessaryPermissions(@NonNull Context context);
}
