package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcq {
    private static final String zza = Integer.toString(0, 36);
    private static final String zzb = Integer.toString(1, 36);
    private static final String zzc = Integer.toString(2, 36);
    private static final String zzd = Integer.toString(3, 36);
    private static final String zze = Integer.toString(4, 36);

    public static ArrayList zza(Spanned spanned) {
        zzcs[] zzcsVarArr;
        zzcu[] zzcuVarArr;
        zzcv[] zzcvVarArr;
        ArrayList arrayList = new ArrayList();
        for (zzcs zzcsVar : (zzcs[]) spanned.getSpans(0, spanned.length(), zzcs.class)) {
            arrayList.add(zzb(spanned, zzcsVar, 1, zzcsVar.zza()));
        }
        for (zzcu zzcuVar : (zzcu[]) spanned.getSpans(0, spanned.length(), zzcu.class)) {
            arrayList.add(zzb(spanned, zzcuVar, 2, zzcuVar.zza()));
        }
        for (zzcr zzcrVar : (zzcr[]) spanned.getSpans(0, spanned.length(), zzcr.class)) {
            arrayList.add(zzb(spanned, zzcrVar, 3, null));
        }
        for (zzcv zzcvVar : (zzcv[]) spanned.getSpans(0, spanned.length(), zzcv.class)) {
            arrayList.add(zzb(spanned, zzcvVar, 4, zzcvVar.zza()));
        }
        return arrayList;
    }

    private static Bundle zzb(Spanned spanned, Object obj, int i, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(zza, spanned.getSpanStart(obj));
        bundle2.putInt(zzb, spanned.getSpanEnd(obj));
        bundle2.putInt(zzc, spanned.getSpanFlags(obj));
        bundle2.putInt(zzd, i);
        if (bundle != null) {
            bundle2.putBundle(zze, bundle);
        }
        return bundle2;
    }
}
