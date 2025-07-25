package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbwz implements RewardItem {
    private final zzbwm zza;

    public zzbwz(zzbwm zzbwmVar) {
        this.zza = zzbwmVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbwm zzbwmVar = this.zza;
        if (zzbwmVar != null) {
            try {
                return zzbwmVar.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    @Nullable
    public final String getType() {
        zzbwm zzbwmVar = this.zza;
        if (zzbwmVar != null) {
            try {
                return zzbwmVar.zzf();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
