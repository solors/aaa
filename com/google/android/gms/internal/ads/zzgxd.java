package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzgxd extends zzgxc {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgxc
    public final void zza(Object obj) {
        ((zzgxn) obj).zza.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgxc
    public final void zzb(zzhaw zzhawVar, Map.Entry entry) throws IOException {
        zzgxo zzgxoVar = (zzgxo) entry.getKey();
        if (zzgxoVar.zzc) {
            zzhau zzhauVar = zzhau.zza;
            switch (zzgxoVar.zzb.ordinal()) {
                case 0:
                    zzgzx.zzt(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                    return;
                case 1:
                    zzgzx.zzx(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                    return;
                case 2:
                    zzgzx.zzA(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                    return;
                case 3:
                    zzgzx.zzI(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                    return;
                case 4:
                    zzgzx.zzz(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                    return;
                case 5:
                    zzgzx.zzw(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                    return;
                case 6:
                    zzgzx.zzv(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                    return;
                case 7:
                    zzgzx.zzr(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                    return;
                case 8:
                    zzgzx.zzG(zzgxoVar.zza, (List) entry.getValue(), zzhawVar);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        zzgzx.zzy(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgzm.zza().zzb(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        zzgzx.zzB(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgzm.zza().zzb(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case 11:
                    zzgzx.zzs(zzgxoVar.zza, (List) entry.getValue(), zzhawVar);
                    return;
                case 12:
                    zzgzx.zzH(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                    return;
                case 13:
                    zzgzx.zzz(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                    return;
                case 14:
                    zzgzx.zzC(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                    return;
                case 15:
                    zzgzx.zzD(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                    return;
                case 16:
                    zzgzx.zzE(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                    return;
                case 17:
                    zzgzx.zzF(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                    return;
                default:
                    return;
            }
        }
        zzhau zzhauVar2 = zzhau.zza;
        switch (zzgxoVar.zzb.ordinal()) {
            case 0:
                zzhawVar.zzf(zzgxoVar.zza, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzhawVar.zzo(zzgxoVar.zza, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzhawVar.zzt(zzgxoVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzhawVar.zzK(zzgxoVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzhawVar.zzr(zzgxoVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzhawVar.zzm(zzgxoVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzhawVar.zzk(zzgxoVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzhawVar.zzb(zzgxoVar.zza, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzhawVar.zzG(zzgxoVar.zza, (String) entry.getValue());
                return;
            case 9:
                zzhawVar.zzq(zzgxoVar.zza, entry.getValue(), zzgzm.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzhawVar.zzv(zzgxoVar.zza, entry.getValue(), zzgzm.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzhawVar.zzd(zzgxoVar.zza, (zzgwj) entry.getValue());
                return;
            case 12:
                zzhawVar.zzI(zzgxoVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzhawVar.zzr(zzgxoVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzhawVar.zzx(zzgxoVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzhawVar.zzz(zzgxoVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzhawVar.zzB(zzgxoVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzhawVar.zzD(zzgxoVar.zza, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
