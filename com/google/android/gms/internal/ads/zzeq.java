package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzeq {
    public final int zzd;

    public static String zze(int i) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) ((i >> 24) & 255));
        sb2.append((char) ((i >> 16) & 255));
        sb2.append((char) ((i >> 8) & 255));
        sb2.append((char) (i & 255));
        return sb2.toString();
    }

    public String toString() {
        return zze(this.zzd);
    }
}
