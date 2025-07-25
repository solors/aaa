package io.bidmachine.models;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public interface DeviceInfo {
    @Nullable
    String getHttpAgent(@NonNull Context context);

    @Nullable
    String getIfa(@NonNull Context context);

    boolean isLimitAdTrackingEnabled();
}
