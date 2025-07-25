package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfun {
    public static int zza(int i, int i2, String str) {
        String zzb;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            }
            zzb = zzfve.zzb("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            zzb = zzfve.zzb("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(zzb);
    }

    public static int zzb(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(zzn(i, i2, FirebaseAnalytics.Param.INDEX));
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfve.zzb(str, obj2));
    }

    public static void zze(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void zzf(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void zzg(boolean z, String str, char c) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzfve.zzb(str, Character.valueOf(c)));
    }

    public static void zzh(boolean z, String str, long j) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzfve.zzb(str, Long.valueOf(j)));
    }

    public static void zzi(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzfve.zzb(str, obj));
    }

    public static void zzj(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzfve.zzb(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void zzk(int i, int i2, int i3) {
        String zzn;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                zzn = zzfve.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                zzn = zzn(i2, i3, "end index");
            }
        } else {
            zzn = zzn(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(zzn);
    }

    public static void zzl(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void zzm(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    private static String zzn(int i, int i2, String str) {
        if (i < 0) {
            return zzfve.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzfve.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
