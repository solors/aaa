package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfxl extends zzfvn {
    private final zzfxn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxl(zzfxn zzfxnVar, int i) {
        super(zzfxnVar.size(), i);
        this.zza = zzfxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
