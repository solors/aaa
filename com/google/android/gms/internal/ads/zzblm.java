package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzblm implements zzapf {
    private volatile zzbkz zza;
    private final Context zzb;

    public zzblm(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzblm zzblmVar) {
        if (zzblmVar.zza == null) {
            return;
        }
        zzblmVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzapf
    @Nullable
    public final zzapi zza(zzapm zzapmVar) throws zzapv {
        Parcelable.Creator<zzbla> creator = zzbla.CREATOR;
        Map zzl = zzapmVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbla zzblaVar = new zzbla(zzapmVar.zzk(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        try {
            zzcab zzcabVar = new zzcab();
            this.zza = new zzbkz(this.zzb, com.google.android.gms.ads.internal.zzv.zzu().zzb(), new zzblk(this, zzcabVar), new zzbll(this, zzcabVar));
            this.zza.checkAvailabilityAndConnect();
            zzbli zzbliVar = new zzbli(this, zzblaVar);
            zzgcs zzgcsVar = zzbzw.zza;
            ListenableFuture zzo = zzgch.zzo(zzgch.zzn(zzcabVar, zzbliVar, zzgcsVar), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzey)).intValue(), TimeUnit.MILLISECONDS, zzbzw.zzd);
            zzo.addListener(new zzblj(this), zzgcsVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - elapsedRealtime) + "ms");
            zzblc zzblcVar = (zzblc) new zzbvi(parcelFileDescriptor).zza(zzblc.CREATOR);
            if (zzblcVar == null) {
                return null;
            }
            if (!zzblcVar.zza) {
                if (zzblcVar.zze.length != zzblcVar.zzf.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzblcVar.zze;
                    if (i < strArr3.length) {
                        hashMap.put(strArr3[i], zzblcVar.zzf[i]);
                        i++;
                    } else {
                        return new zzapi(zzblcVar.zzc, zzblcVar.zzd, hashMap, zzblcVar.zzg, zzblcVar.zzh);
                    }
                }
            } else {
                throw new zzapv(zzblcVar.zzb);
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
