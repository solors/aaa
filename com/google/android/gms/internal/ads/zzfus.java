package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfus extends zzful {
    private final Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfus(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfus) {
            return this.zza.equals(((zzfus) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "Optional.of(" + obj + ")";
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final zzful zza(zzfuc zzfucVar) {
        Object apply = zzfucVar.apply(this.zza);
        zzfun.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfus(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
