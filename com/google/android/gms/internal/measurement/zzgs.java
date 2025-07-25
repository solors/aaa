package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.core.content.PermissionChecker;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzgs implements zzgn {
    @GuardedBy("GservicesLoader.class")
    private static zzgs zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzgs() {
        this.zzb = null;
        this.zzc = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgs zza(Context context) {
        zzgs zzgsVar;
        synchronized (zzgs.class) {
            if (zza == null) {
                zza = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzgs(context) : new zzgs();
            }
            zzgsVar = zza;
        }
        return zzgsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzgn
    /* renamed from: zzc */
    public final String zza(final String str) {
        Context context = this.zzb;
        if (context != null && !zzgi.zza(context)) {
            try {
                return (String) zzgq.zza(new zzgp() { // from class: com.google.android.gms.internal.measurement.zzgr
                    @Override // com.google.android.gms.internal.measurement.zzgp
                    public final Object zza() {
                        return zzgs.this.zzb(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzb(String str) {
        return zzfv.zza(this.zzb.getContentResolver(), str, null);
    }

    private zzgs(Context context) {
        this.zzb = context;
        zzgu zzguVar = new zzgu(this, null);
        this.zzc = zzguVar;
        context.getContentResolver().registerContentObserver(zzfy.zza, true, zzguVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zza() {
        Context context;
        synchronized (zzgs.class) {
            zzgs zzgsVar = zza;
            if (zzgsVar != null && (context = zzgsVar.zzb) != null && zzgsVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }
}
