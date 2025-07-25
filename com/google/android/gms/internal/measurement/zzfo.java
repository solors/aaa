package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
public enum zzfo implements zzjp {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);
    
    private final int zzh;

    zzfo(int i) {
        this.zzh = i;
    }

    public static zzjo zzb() {
        return zzfq.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzfo.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
    }

    @Override // com.google.android.gms.internal.measurement.zzjp
    public final int zza() {
        return this.zzh;
    }

    public static zzfo zza(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
                        }
                        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
                    }
                    return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
                }
                return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
            }
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
    }
}
