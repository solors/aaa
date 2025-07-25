package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfuh {
    private final String zza;
    private final zzfug zzb;
    private zzfug zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfuh(String str, zzfui zzfuiVar) {
        zzfug zzfugVar = new zzfug();
        this.zzb = zzfugVar;
        this.zzc = zzfugVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzfug zzfugVar = this.zzb.zzb;
        String str = "";
        while (zzfugVar != null) {
            Object obj = zzfugVar.zza;
            sb2.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb2.append(obj);
            }
            zzfugVar = zzfugVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzfuh zza(Object obj) {
        zzfug zzfugVar = new zzfug();
        this.zzc.zzb = zzfugVar;
        this.zzc = zzfugVar;
        zzfugVar.zza = obj;
        return this;
    }
}
