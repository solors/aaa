package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzdt extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzdw zza;

    public zzdt(zzdw zzdwVar) {
        this.zza = zzdwVar;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z = false;
        } else {
            z = true;
        }
        zzdw zzdwVar = this.zza;
        if (true == z) {
            i = 10;
        }
        zzdw.zzc(zzdwVar, i);
    }
}
