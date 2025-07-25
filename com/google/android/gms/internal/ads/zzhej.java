package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzhej {
    public static zzhej zzb(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzhee(cls.getSimpleName());
        }
        return new zzheg(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
