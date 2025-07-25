package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzaou;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzaqt;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzcab;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzbo {
    private static zzapp zza;
    private static final Object zzb = new Object();

    public zzbo(Context context) {
        zzapp zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            if (zza == null) {
                zzbcl.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzew)).booleanValue()) {
                        zza2 = zzaz.zzb(context);
                        zza = zza2;
                    }
                }
                zza2 = zzaqt.zza(context, null);
                zza = zza2;
            }
        }
    }

    public final ListenableFuture zza(String str) {
        zzcab zzcabVar = new zzcab();
        zza.zza(new zzbm(str, null, zzcabVar));
        return zzcabVar;
    }

    public final ListenableFuture zzb(int i, String str, @Nullable Map map, @Nullable byte[] bArr) {
        zzbk zzbkVar = new zzbk(null);
        zzbi zzbiVar = new zzbi(this, str, zzbkVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbj zzbjVar = new zzbj(this, i, str, zzbkVar, zzbiVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            try {
                zzlVar.zzd(str, "GET", zzbjVar.zzl(), zzbjVar.zzx());
            } catch (zzaou e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj(e.getMessage());
            }
        }
        zza.zza(zzbjVar);
        return zzbkVar;
    }
}
