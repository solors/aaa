package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzaxq {
    private final zzawd zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzaxq(zzawd zzawdVar, String str, String str2, Class... clsArr) {
        this.zza = zzawdVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzawdVar.zzk().submit(new zzaxp(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(zzaxq zzaxqVar) {
        try {
            zzawd zzawdVar = zzaxqVar.zza;
            Class<?> loadClass = zzawdVar.zzi().loadClass(zzaxqVar.zzc(zzawdVar.zzu(), zzaxqVar.zzb));
            if (loadClass != null) {
                zzaxqVar.zzd = loadClass.getMethod(zzaxqVar.zzc(zzaxqVar.zza.zzu(), zzaxqVar.zzc), zzaxqVar.zze);
            }
        } catch (zzavh | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            zzaxqVar.zzf.countDown();
            throw th;
        }
        zzaxqVar.zzf.countDown();
    }

    private final String zzc(byte[] bArr, String str) throws zzavh, UnsupportedEncodingException {
        return new String(this.zza.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (!this.zzf.await(2L, TimeUnit.SECONDS)) {
                return null;
            }
            return this.zzd;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
