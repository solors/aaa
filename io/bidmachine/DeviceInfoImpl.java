package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.models.DataRestrictions;

/* renamed from: io.bidmachine.t2 */
/* loaded from: classes9.dex */
class DeviceInfoImpl implements io.bidmachine.models.DeviceInfo {
    @NonNull
    private final DataRestrictions dataRestrictions;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeviceInfoImpl(@NonNull DataRestrictions dataRestrictions) {
        this.dataRestrictions = dataRestrictions;
    }

    @Override // io.bidmachine.models.DeviceInfo
    @Nullable
    public String getHttpAgent(@NonNull Context context) {
        if (this.dataRestrictions.canSendDeviceInfo()) {
            return UserAgentProvider.getUserAgent(context);
        }
        return null;
    }

    @Override // io.bidmachine.models.DeviceInfo
    @Nullable
    public String getIfa(@NonNull Context context) {
        return AdvertisingDataManager.getAdvertisingId(context, !this.dataRestrictions.canSendIfa());
    }

    @Override // io.bidmachine.models.DeviceInfo
    public boolean isLimitAdTrackingEnabled() {
        return AdvertisingDataManager.isLimitAdTrackingEnabled();
    }
}
