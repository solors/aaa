package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfki {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ScheduledExecutorService zzc;
    private final ClientApi zzd = new ClientApi();
    private zzbpe zze;
    private final Clock zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfki(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzf = clock;
    }

    private static zzfjg zzc() {
        return new zzfjg(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzw)).longValue(), 2.0d, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzx)).longValue(), 0.2d);
    }

    @Nullable
    public final zzfkh zza(com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat != null) {
            int ordinal = adFormat.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 5) {
                        return null;
                    }
                    return new zzfjf(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzftVar, zzcfVar, this.zzc, zzc(), this.zzf);
                }
                return new zzfkl(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzftVar, zzcfVar, this.zzc, zzc(), this.zzf);
            }
            return new zzfji(this.zzd, this.zza, this.zzb.clientJarVersion, this.zze, zzftVar, zzcfVar, this.zzc, zzc(), this.zzf);
        }
        return null;
    }

    public final void zzb(zzbpe zzbpeVar) {
        this.zze = zzbpeVar;
    }
}
