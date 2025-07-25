package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzadz {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    @Nullable
    public static zzay zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = zzei.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzdo.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzafn.zzb(new zzdy(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    zzdo.zzg("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzahe(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzay(arrayList);
    }

    public static zzadw zzc(zzdy zzdyVar, boolean z, boolean z2) throws zzbc {
        if (z) {
            zzd(3, zzdyVar, false);
        }
        String zzB = zzdyVar.zzB((int) zzdyVar.zzs(), StandardCharsets.UTF_8);
        int length = zzB.length();
        long zzs = zzdyVar.zzs();
        String[] strArr = new String[(int) zzs];
        int i = length + 15;
        for (int i2 = 0; i2 < zzs; i2++) {
            String zzB2 = zzdyVar.zzB((int) zzdyVar.zzs(), StandardCharsets.UTF_8);
            strArr[i2] = zzB2;
            i = i + 4 + zzB2.length();
        }
        if (z2 && (zzdyVar.zzm() & 1) == 0) {
            throw zzbc.zza("framing bit expected to be set", null);
        }
        return new zzadw(zzB, strArr, i + 1);
    }

    public static boolean zzd(int i, zzdy zzdyVar, boolean z) throws zzbc {
        if (zzdyVar.zzb() < 7) {
            if (z) {
                return false;
            }
            int zzb = zzdyVar.zzb();
            throw zzbc.zza("too short header: " + zzb, null);
        } else if (zzdyVar.zzm() != i) {
            if (z) {
                return false;
            }
            throw zzbc.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        } else if (zzdyVar.zzm() == 118 && zzdyVar.zzm() == 111 && zzdyVar.zzm() == 114 && zzdyVar.zzm() == 98 && zzdyVar.zzm() == 105 && zzdyVar.zzm() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw zzbc.zza("expected characters 'vorbis'", null);
        }
    }
}
