package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzazv implements Comparator {
    public zzazv(zzazw zzazwVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazk zzazkVar = (zzazk) obj;
        zzazk zzazkVar2 = (zzazk) obj2;
        if (zzazkVar.zzd() < zzazkVar2.zzd()) {
            return -1;
        }
        if (zzazkVar.zzd() <= zzazkVar2.zzd()) {
            if (zzazkVar.zzb() < zzazkVar2.zzb()) {
                return -1;
            }
            if (zzazkVar.zzb() <= zzazkVar2.zzb()) {
                float zza = (zzazkVar.zza() - zzazkVar.zzd()) * (zzazkVar.zzc() - zzazkVar.zzb());
                float zza2 = (zzazkVar2.zza() - zzazkVar2.zzd()) * (zzazkVar2.zzc() - zzazkVar2.zzb());
                if (zza > zza2) {
                    return -1;
                }
                if (zza >= zza2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
