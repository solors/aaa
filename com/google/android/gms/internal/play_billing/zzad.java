package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
public final class zzad extends zzz {
    private final zzaf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzad(zzaf zzafVar, int i) {
        super(zzafVar.size(), i);
        this.zza = zzafVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzz
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
