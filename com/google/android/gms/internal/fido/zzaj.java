package com.google.android.gms.internal.fido;

import com.ironsource.C20517nb;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes5.dex */
public final class zzaj {
    private final String zza;
    private final zzah zzb;
    private zzah zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaj(String str, zzai zzaiVar) {
        zzah zzahVar = new zzah(null);
        this.zzb = zzahVar;
        this.zzc = zzahVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzah zzahVar = this.zzb.zzc;
        String str = "";
        while (zzahVar != null) {
            Object obj = zzahVar.zzb;
            boolean z = zzahVar instanceof zzaf;
            sb2.append(str);
            String str2 = zzahVar.zza;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append(C20517nb.f52173T);
            }
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb2.append(obj);
            }
            zzahVar = zzahVar.zzc;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzaj zza(String str, int i) {
        String valueOf = String.valueOf(i);
        zzaf zzafVar = new zzaf(null);
        this.zzc.zzc = zzafVar;
        this.zzc = zzafVar;
        zzafVar.zzb = valueOf;
        zzafVar.zza = "errorCode";
        return this;
    }

    public final zzaj zzb(String str, Object obj) {
        zzah zzahVar = new zzah(null);
        this.zzc.zzc = zzahVar;
        this.zzc = zzahVar;
        zzahVar.zzb = obj;
        zzahVar.zza = str;
        return this;
    }
}
