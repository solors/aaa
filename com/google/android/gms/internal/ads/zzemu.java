package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.common.util.concurrent.ListenableFuture;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzemu implements zzetr {
    private final Context zza;
    private final zzgcs zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemu(zzgcs zzgcsVar, Context context) {
        this.zzb = zzgcsVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmJ)).booleanValue()) {
            return zzgch.zzh(new zzemv(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        if (contentResolver == null) {
            return zzgch.zzh(new zzemv(null, false));
        }
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ContentResolver contentResolver2 = contentResolver;
                String string = Settings.Secure.getString(contentResolver2, "advertising_id");
                boolean z = false;
                if (Settings.Secure.getInt(contentResolver2, CommonUrlParts.LIMIT_AD_TRACKING, 0) == 1) {
                    z = true;
                }
                return new zzemv(string, z);
            }
        });
    }
}
