package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C21114v8;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
abstract class zzgaw extends zzgbx implements Runnable {
    ListenableFuture zza;
    Class zzb;
    Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgaw(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r9 = this;
            com.google.common.util.concurrent.ListenableFuture r0 = r9.zza
            java.lang.Class r1 = r9.zzb
            java.lang.Object r2 = r9.zzc
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lc
            r5 = r3
            goto Ld
        Lc:
            r5 = r4
        Ld:
            if (r1 != 0) goto L11
            r6 = r3
            goto L12
        L11:
            r6 = r4
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            goto L17
        L16:
            r3 = r4
        L17:
            r3 = r3 | r5
            if (r3 != 0) goto La5
            boolean r3 = r9.isCancelled()
            if (r3 == 0) goto L22
            goto La5
        L22:
            r3 = 0
            r9.zza = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgdl     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            if (r4 == 0) goto L31
            r4 = r0
            com.google.android.gms.internal.ads.zzgdl r4 = (com.google.android.gms.internal.ads.zzgdl) r4     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            java.lang.Throwable r4 = r4.zzl()     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 != 0) goto L3a
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzgch.zzp(r0)     // Catch: java.lang.Throwable -> L39 java.util.concurrent.ExecutionException -> L3c
            goto L78
        L39:
            r4 = move-exception
        L3a:
            r5 = r3
            goto L78
        L3c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L76
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Future type "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = " threw "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = " without a cause"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r5.<init>(r4)
        L76:
            r4 = r5
            goto L3a
        L78:
            if (r4 != 0) goto L7e
            r9.zzc(r5)
            return
        L7e:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto La2
            java.lang.Object r0 = r9.zze(r2, r4)     // Catch: java.lang.Throwable -> L90
            r9.zzb = r3
            r9.zzc = r3
            r9.zzf(r0)
            return
        L90:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzgda.zza(r0)     // Catch: java.lang.Throwable -> L9c
            r9.zzd(r0)     // Catch: java.lang.Throwable -> L9c
            r9.zzb = r3
            r9.zzc = r3
            return
        L9c:
            r0 = move-exception
            r9.zzb = r3
            r9.zzc = r3
            throw r0
        La2:
            r9.zzs(r0)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaw.run():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        String str;
        ListenableFuture listenableFuture = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zza = super.zza();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture.toString() + "], ";
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + C21114v8.C21123i.f54139e;
        } else if (zza != null) {
            return str.concat(zza);
        } else {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    abstract Object zze(Object obj, Throwable th) throws Exception;

    abstract void zzf(Object obj);
}
