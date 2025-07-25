package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzbxu;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    @Nullable
    private final zzbxu zzc;
    private final zzbus zzd = new zzbus(false, Collections.emptyList());

    public zzb(Context context, @Nullable zzbxu zzbxuVar, @Nullable zzbus zzbusVar) {
        this.zza = context;
        this.zzc = zzbxuVar;
    }

    private final boolean zzd() {
        zzbxu zzbxuVar = this.zzc;
        if ((zzbxuVar != null && zzbxuVar.zza().zzf) || this.zzd.zza) {
            return true;
        }
        return false;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(@Nullable String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzbxu zzbxuVar = this.zzc;
            if (zzbxuVar != null) {
                zzbxuVar.zzd(str, null, 3);
                return;
            }
            zzbus zzbusVar = this.zzd;
            if (zzbusVar.zza && (list = zzbusVar.zzb) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        Context context = this.zza;
                        zzv.zzq();
                        com.google.android.gms.ads.internal.util.zzs.zzM(context, "", replace);
                    }
                }
            }
        }
    }

    public final boolean zzc() {
        if (zzd() && !this.zzb) {
            return false;
        }
        return true;
    }
}
