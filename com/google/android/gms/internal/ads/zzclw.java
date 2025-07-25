package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.annotation.Nullable;
import com.ironsource.C20517nb;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzclw implements zzcla {
    @Nullable
    private final CookieManager zza;

    public zzclw(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzv.zzr().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map) {
        String cookie;
        if (this.zza != null) {
            if (((String) map.get("clear")) != null) {
                String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaY);
                CookieManager cookieManager = this.zza;
                if (cookieManager != null && (cookie = cookieManager.getCookie(str)) != null) {
                    List zzf = zzfvc.zzb(zzfty.zzc(';')).zzf(cookie);
                    for (int i = 0; i < zzf.size(); i++) {
                        CookieManager cookieManager2 = this.zza;
                        Iterator it = zzfvc.zzb(zzfty.zzc(C20517nb.f52173T)).zzd((String) zzf.get(i)).iterator();
                        it.getClass();
                        if (it.hasNext()) {
                            cookieManager2.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaK))));
                        } else {
                            throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                        }
                    }
                    return;
                }
                return;
            }
            String str2 = (String) map.get("cookie");
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.zza.setCookie((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaY), str2);
        }
    }
}
