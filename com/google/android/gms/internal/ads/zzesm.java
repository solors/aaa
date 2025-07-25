package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzesm implements zzetq {
    private zzfra zza;
    private zzfra zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze = false;
    private final boolean zzf;

    public zzesm(zzfra zzfraVar, zzfra zzfraVar2, boolean z, boolean z2, boolean z3) {
        this.zza = zzfraVar;
        this.zzb = zzfraVar2;
        this.zzc = z;
        this.zzd = z2;
        this.zzf = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdg)).booleanValue() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r5.zza.zzc() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        r1.putString("paidv1_id_android", r5.zza.zzb());
        r1.putLong("paidv1_creation_time_android", r5.zza.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdf)).booleanValue() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdh)).booleanValue() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        if (r5.zzb.zzc() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
        r1.putString("paidv2_id_android", r5.zzb.zzb());
        r1.putLong("paidv2_creation_time_android", r5.zzb.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
        r1.putBoolean("paidv2_pub_option_android", r5.zzc);
        r1.putBoolean("paidv2_user_option_android", r5.zzd);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzde)).booleanValue() == false) goto L28;
     */
    @Override // com.google.android.gms.internal.ads.zzetq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzcuv r6 = (com.google.android.gms.internal.ads.zzcuv) r6
            android.os.Bundle r6 = r6.zza
            boolean r0 = r5.zze
            if (r0 == 0) goto La
            goto Lbb
        La:
            java.lang.String r0 = "pii"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.zzfcx.zza(r6, r0)
            boolean r2 = r5.zzf
            if (r2 != 0) goto L26
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzde
            com.google.android.gms.internal.ads.zzbcj r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L3c
        L26:
            boolean r2 = r5.zzf
            if (r2 == 0) goto L5a
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzdg
            com.google.android.gms.internal.ads.zzbcj r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L5a
        L3c:
            com.google.android.gms.internal.ads.zzfra r2 = r5.zza
            boolean r2 = r2.zzc()
            if (r2 == 0) goto L5a
            com.google.android.gms.internal.ads.zzfra r2 = r5.zza
            java.lang.String r2 = r2.zzb()
            java.lang.String r3 = "paidv1_id_android"
            r1.putString(r3, r2)
            com.google.android.gms.internal.ads.zzfra r2 = r5.zza
            long r2 = r2.zza()
            java.lang.String r4 = "paidv1_creation_time_android"
            r1.putLong(r4, r2)
        L5a:
            boolean r2 = r5.zzf
            if (r2 != 0) goto L70
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzdf
            com.google.android.gms.internal.ads.zzbcj r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L86
        L70:
            boolean r2 = r5.zzf
            if (r2 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzdh
            com.google.android.gms.internal.ads.zzbcj r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lb2
        L86:
            com.google.android.gms.internal.ads.zzfra r2 = r5.zzb
            boolean r2 = r2.zzc()
            if (r2 == 0) goto La4
            com.google.android.gms.internal.ads.zzfra r2 = r5.zzb
            java.lang.String r2 = r2.zzb()
            java.lang.String r3 = "paidv2_id_android"
            r1.putString(r3, r2)
            com.google.android.gms.internal.ads.zzfra r2 = r5.zzb
            long r2 = r2.zza()
            java.lang.String r4 = "paidv2_creation_time_android"
            r1.putLong(r4, r2)
        La4:
            boolean r2 = r5.zzc
            java.lang.String r3 = "paidv2_pub_option_android"
            r1.putBoolean(r3, r2)
            boolean r2 = r5.zzd
            java.lang.String r3 = "paidv2_user_option_android"
            r1.putBoolean(r3, r2)
        Lb2:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lbb
            r6.putBundle(r0, r1)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesm.zzb(java.lang.Object):void");
    }

    public zzesm(boolean z) {
        this.zzf = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }
}
