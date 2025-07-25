package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
final class zzes implements zzga {
    private static final zzes zza = new zzes();

    private zzes() {
    }

    public static zzes zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzga
    public final zzfz zzb(Class cls) {
        if (zzex.class.isAssignableFrom(cls)) {
            try {
                return (zzfz) zzex.zzh(cls.asSubclass(zzex.class)).zzu(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.zzga
    public final boolean zzc(Class cls) {
        return zzex.class.isAssignableFrom(cls);
    }
}
