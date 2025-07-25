package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdw {
    @Nullable
    private static zzdw zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    @GuardedBy("networkTypeLock")
    private int zze = 0;

    private zzdw(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzdu(this, null), intentFilter);
    }

    public static synchronized zzdw zzb(Context context) {
        zzdw zzdwVar;
        synchronized (zzdw.class) {
            if (zza == null) {
                zza = new zzdw(context);
            }
            zzdwVar = zza;
        }
        return zzdwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzc(zzdw zzdwVar, int i) {
        synchronized (zzdwVar.zzd) {
            if (zzdwVar.zze == i) {
                return;
            }
            zzdwVar.zze = i;
            Iterator it = zzdwVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zzyl zzylVar = (zzyl) weakReference.get();
                if (zzylVar != null) {
                    zzylVar.zza.zzl(i);
                } else {
                    zzdwVar.zzc.remove(weakReference);
                }
            }
        }
    }

    public final int zza() {
        int i;
        synchronized (this.zzd) {
            i = this.zze;
        }
        return i;
    }

    public final void zzd(final zzyl zzylVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzylVar));
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzds
            @Override // java.lang.Runnable
            public final void run() {
                zzylVar.zza.zzl(zzdw.this.zza());
            }
        });
    }
}
