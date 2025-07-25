package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
public enum zza {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);
    
    private static final zzai zzp;
    private final int zzr;

    static {
        zza[] values;
        zzah zzahVar = new zzah();
        for (zza zzaVar : values()) {
            zzahVar.zza(Integer.valueOf(zzaVar.zzr), zzaVar);
        }
        zzp = zzahVar.zzb();
    }

    zza(int i) {
        this.zzr = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zza zza(int i) {
        zzai zzaiVar = zzp;
        Integer valueOf = Integer.valueOf(i);
        if (!zzaiVar.containsKey(valueOf)) {
            return RESPONSE_CODE_UNSPECIFIED;
        }
        return (zza) zzaiVar.get(valueOf);
    }
}
