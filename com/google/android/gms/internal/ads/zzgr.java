package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgr extends zzgp {
    public final int zzc;

    public zzgr(int i, @Nullable String str, @Nullable IOException iOException, Map map, zzgd zzgdVar, byte[] bArr) {
        super("Response code: " + i, iOException, zzgdVar, 2004, 1);
        this.zzc = i;
    }
}
