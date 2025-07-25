package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfja {
    private final Context zza;
    private final Executor zzb;
    private final zzgct zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzfir zze;
    private final zzfhk zzf;

    public zzfja(Context context, Executor executor, zzgct zzgctVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfir zzfirVar, zzfhk zzfhkVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgctVar;
        this.zzd = zzuVar;
        this.zze = zzfirVar;
        this.zzf = zzfhkVar;
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zza(String str) throws Exception {
        return this.zzd.zza(str);
    }

    @VisibleForTesting
    public final ListenableFuture zzc(final String str, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (zzvVar != null) {
            return new zzfiq(zzvVar.zzb(), this.zzd, this.zzc, this.zze).zzd(str);
        }
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfix
            {
                zzfja.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfja.this.zza(str);
            }
        });
    }

    public final void zzd(final String str, @Nullable final com.google.android.gms.ads.internal.util.client.zzv zzvVar, @Nullable zzfhh zzfhhVar) {
        if (zzfhk.zza() && ((Boolean) zzbee.zzd.zze()).booleanValue()) {
            zzfgw zza = zzfgv.zza(this.zza, 14);
            zza.zzi();
            zzgch.zzr(zzc(str, zzvVar), new zzfiz(this, zza, zzfhhVar), this.zzb);
            return;
        }
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfiy
            {
                zzfja.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzfja.this.zzc(str, zzvVar);
            }
        });
    }

    public final void zze(List list, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzd((String) it.next(), zzvVar, null);
        }
    }
}
