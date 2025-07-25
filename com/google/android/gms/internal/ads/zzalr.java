package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzalr {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzalr(String str, int i, String str2, Set set) {
        this.zzb = i;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzalr zza(String str, int i) {
        String str2;
        String trim = str.trim();
        zzcw.zzd(!trim.isEmpty());
        int indexOf = trim.indexOf(" ");
        if (indexOf == -1) {
            str2 = "";
        } else {
            String trim2 = trim.substring(indexOf).trim();
            trim = trim.substring(0, indexOf);
            str2 = trim2;
        }
        int i2 = zzei.zza;
        String[] split = trim.split("\\.", -1);
        String str3 = split[0];
        HashSet hashSet = new HashSet();
        for (int i3 = 1; i3 < split.length; i3++) {
            hashSet.add(split[i3]);
        }
        return new zzalr(str3, i, str2, hashSet);
    }

    public static zzalr zzb() {
        return new zzalr("", 0, "", Collections.emptySet());
    }
}
