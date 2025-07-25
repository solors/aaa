package io.bidmachine;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.bidmachine.s3 */
/* loaded from: classes9.dex */
final class HwInfoCache {
    @NonNull
    private static final String KEY_HW = Build.MANUFACTURER + Build.MODEL;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public String read(@NonNull Context context, @NonNull String str) {
        return BidMachineSharedPreference.getHwInfo(context, str + KEY_HW);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void store(@NonNull Context context, @NonNull String str, @Nullable String str2) {
        BidMachineSharedPreference.setHwInfo(context, str + KEY_HW, str2);
    }
}
