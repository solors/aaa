package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbbp {
    @VisibleForTesting
    zzayf zza;
    @VisibleForTesting
    boolean zzb;
    private final ExecutorService zzc;

    public zzbbp() {
        this.zzc = com.google.android.gms.ads.internal.util.client.zzb.zzb;
    }

    public zzbbp(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
        this.zzc = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbk
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeW)).booleanValue();
                zzbbp zzbbpVar = zzbbp.this;
                Context context2 = context;
                if (booleanValue) {
                    try {
                        zzbbpVar.zza = (zzayf) com.google.android.gms.ads.internal.util.client.zzs.zzb(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzbbl
                            @Override // com.google.android.gms.ads.internal.util.client.zzq
                            public final Object zza(Object obj) {
                                return zzaye.zzb((IBinder) obj);
                            }
                        });
                        zzbbpVar.zza.zze(ObjectWrapper.wrap(context2), "GMA_SDK");
                        zzbbpVar.zzb = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.zze("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
