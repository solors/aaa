package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzbc extends IOException {
    public final boolean zza;
    public final int zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbc(@Nullable String str, @Nullable Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzbc zza(@Nullable String str, @Nullable Throwable th) {
        return new zzbc(str, th, true, 1);
    }

    public static zzbc zzb(@Nullable String str, @Nullable Throwable th) {
        return new zzbc(str, th, true, 0);
    }

    public static zzbc zzc(@Nullable String str) {
        return new zzbc(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    @Nullable
    public final String getMessage() {
        String message = super.getMessage();
        return message + " {contentIsMalformed=" + this.zza + ", dataType=" + this.zzb + "}";
    }
}
