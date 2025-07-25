package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzgp extends zzfz {
    public final int zzb;

    public zzgp(zzgd zzgdVar, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzgp zza(IOException iOException, zzgd zzgdVar, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && zzftt.zza(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        } else {
            i2 = 2001;
        }
        if (i2 == 2007) {
            return new zzgo(iOException, zzgdVar);
        }
        return new zzgp(iOException, zzgdVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        if (i == 2000) {
            if (i2 != 1) {
                return 2000;
            }
            return 2001;
        }
        return i;
    }

    public zzgp(IOException iOException, zzgd zzgdVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = i2;
    }

    public zzgp(String str, zzgd zzgdVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = i2;
    }

    public zzgp(String str, @Nullable IOException iOException, zzgd zzgdVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = i2;
    }
}
