package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzerz implements zzetr {
    @Nullable
    private static String zza;
    private final zzgcs zzb;
    private final Context zzc;
    private final Set zzd;

    public zzerz(zzgcs zzgcsVar, Context context, Set set) {
        this.zzb = zzgcsVar;
        this.zzc = context;
        this.zzd = set;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzery
            {
                zzerz.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerz.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r0.contains("banner") == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzesa zzc() throws java.lang.Exception {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzfc
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L80
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzfn
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L46
            java.util.Set r0 = r3.zzd
            java.lang.String r1 = "rewarded"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "interstitial"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "native"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = "banner"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L80
        L46:
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzfo
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
            java.lang.String r0 = com.google.android.gms.internal.ads.zzerz.zza
            if (r0 != 0) goto L68
            android.content.Context r0 = r3.zzc
            com.google.android.gms.internal.ads.zzecm r1 = com.google.android.gms.ads.internal.zzv.zzB()
            java.lang.String r0 = r1.zzf(r0)
            com.google.android.gms.internal.ads.zzerz.zza = r0
        L68:
            com.google.android.gms.internal.ads.zzesa r0 = new com.google.android.gms.internal.ads.zzesa
            java.lang.String r1 = com.google.android.gms.internal.ads.zzerz.zza
            r0.<init>(r1)
            return r0
        L70:
            android.content.Context r0 = r3.zzc
            com.google.android.gms.internal.ads.zzesa r1 = new com.google.android.gms.internal.ads.zzesa
            com.google.android.gms.internal.ads.zzecm r2 = com.google.android.gms.ads.internal.zzv.zzB()
            java.lang.String r0 = r2.zzf(r0)
            r1.<init>(r0)
            return r1
        L80:
            com.google.android.gms.internal.ads.zzesa r0 = new com.google.android.gms.internal.ads.zzesa
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzerz.zzc():com.google.android.gms.internal.ads.zzesa");
    }
}
