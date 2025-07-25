package com.google.android.gms.internal.auth;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes5.dex */
final class zzcd extends zzda {
    private final Context zza;
    private final zzdj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcd(Context context, zzdj zzdjVar) {
        if (context != null) {
            this.zza = context;
            this.zzb = zzdjVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final boolean equals(Object obj) {
        zzdj zzdjVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzda) {
            zzda zzdaVar = (zzda) obj;
            if (this.zza.equals(zzdaVar.zza()) && ((zzdjVar = this.zzb) != null ? zzdjVar.equals(zzdaVar.zzb()) : zzdaVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzdj zzdjVar = this.zzb;
        if (zzdjVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzdjVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        String obj = this.zza.toString();
        String valueOf = String.valueOf(this.zzb);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.zzda
    public final Context zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.zzda
    public final zzdj zzb() {
        return this.zzb;
    }
}
