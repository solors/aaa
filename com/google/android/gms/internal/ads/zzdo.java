package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.net.UnknownHostException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdo {
    private static final Object zza = new Object();

    public static String zza(String str, @Nullable Throwable th) {
        String replace;
        if (th == null) {
            replace = null;
        } else {
            synchronized (zza) {
                Throwable th2 = th;
                while (true) {
                    if (th2 != null) {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                            break;
                        }
                        th2 = th2.getCause();
                    } else {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            String replace2 = replace.replace("\n", "\n  ");
            return str + "\n  " + replace2 + "\n";
        }
        return str;
    }

    public static void zzb(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.d(str, zza(str2, null));
        }
    }

    public static void zzc(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.e(str, zza(str2, null));
        }
    }

    public static void zzd(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (zza) {
            Log.e(str, zza(str2, th));
        }
    }

    public static void zze(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.i(str, zza(str2, null));
        }
    }

    public static void zzf(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            Log.w(str, zza(str2, null));
        }
    }

    public static void zzg(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (zza) {
            Log.w(str, zza(str2, th));
        }
    }
}
