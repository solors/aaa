package io.appmetrica.analytics.locationapi.internal;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface LocationReceiverProvider extends Identifiable {
    @NotNull
    LocationReceiver getLocationReceiver(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener);
}
