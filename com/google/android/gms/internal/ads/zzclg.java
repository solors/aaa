package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzclg implements zzcla {
    private final zzduv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzclg(zzduv zzduvVar) {
        this.zza = zzduvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map) {
        char c;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("flick")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                this.zza.zzm(zzdur.NONE);
                return;
            } else {
                this.zza.zzm(zzdur.FLICK);
                return;
            }
        }
        this.zza.zzm(zzdur.SHAKE);
    }
}
