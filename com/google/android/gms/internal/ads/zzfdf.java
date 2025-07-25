package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfdf {
    @GuardedBy("LiteSdkInfoRetriever.class")
    private static zzfdf zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcw zzc;
    private final AtomicReference zzd = new AtomicReference();

    @VisibleForTesting
    zzfdf(Context context, com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zzb = context;
        this.zzc = zzcwVar;
    }

    @VisibleForTesting
    static com.google.android.gms.ads.internal.client.zzcw zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzcv.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzfdf zzd(Context context) {
        synchronized (zzfdf.class) {
            zzfdf zzfdfVar = zza;
            if (zzfdfVar != null) {
                return zzfdfVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbem.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcw zzcwVar = null;
            if (longValue > 0 && longValue <= 244410203) {
                zzcwVar = zza(applicationContext);
            }
            zzfdf zzfdfVar2 = new zzfdf(applicationContext, zzcwVar);
            zza = zzfdfVar2;
            return zzfdfVar2;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzfb zzg() {
        com.google.android.gms.ads.internal.client.zzcw zzcwVar = this.zzc;
        if (zzcwVar != null) {
            try {
                return zzcwVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbpe zzb() {
        return (zzbpe) this.zzd.get();
    }

    public final VersionInfoParcel zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.client.zzfb zzg;
        com.google.android.gms.ads.internal.zzv.zzq();
        boolean zzF = com.google.android.gms.ads.internal.util.zzs.zzF(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(244410000, i2, true, zzF);
        if (((Boolean) zzbem.zzc.zze()).booleanValue() && (zzg = zzg()) != null) {
            return new VersionInfoParcel(244410000, zzg.zza(), true, zzF);
        }
        return versionInfoParcel;
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzfb zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(com.google.android.gms.internal.ads.zzbpe r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbdv r0 = com.google.android.gms.internal.ads.zzbem.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L22
            com.google.android.gms.ads.internal.client.zzcw r0 = r3.zzc
            if (r0 != 0) goto L15
        L13:
            r0 = r1
            goto L19
        L15:
            com.google.android.gms.internal.ads.zzbpe r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L13
        L19:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 == 0) goto L1e
            r4 = r0
        L1e:
            com.google.android.gms.internal.ads.zzfde.zza(r2, r1, r4)
            return
        L22:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfde.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdf.zzf(com.google.android.gms.internal.ads.zzbpe):void");
    }
}
