package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzanv {
    public final int zza;
    @Nullable
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzanv(int i, @Nullable String str, int i2, @Nullable List list, byte[] bArr) {
        List unmodifiableList;
        this.zza = i;
        this.zzb = str;
        this.zzc = i2;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.zzd = unmodifiableList;
        this.zze = bArr;
    }

    public final int zza() {
        int i = this.zzc;
        if (i != 2) {
            if (i != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }
}
