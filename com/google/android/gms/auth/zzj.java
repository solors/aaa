package com.google.android.gms.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes4.dex */
public final class zzj implements zzk {
    final /* synthetic */ String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(String str) {
        this.zza = str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: com.google.android.gms.auth.zzl.zzd(java.lang.Object):java.lang.Object
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
        Caused by: java.lang.NullPointerException
        */
    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ java.lang.Object zza(android.os.IBinder r5) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        /*
            r4 = this;
            com.google.android.gms.internal.auth.zzf r5 = com.google.android.gms.internal.auth.zze.zzb(r5)
            java.lang.String r0 = r4.zza
            android.os.Bundle r5 = r5.zzg(r0)
            com.google.android.gms.auth.zzl.zzd(r5)
            java.lang.String r0 = "Error"
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r1 = "userRecoveryIntent"
            android.os.Parcelable r5 = r5.getParcelable(r1)
            android.content.Intent r5 = (android.content.Intent) r5
            com.google.android.gms.internal.auth.zzby r1 = com.google.android.gms.internal.auth.zzby.zza(r0)
            com.google.android.gms.internal.auth.zzby r2 = com.google.android.gms.internal.auth.zzby.SUCCESS
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L2a
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L2a:
            boolean r2 = com.google.android.gms.internal.auth.zzby.zzb(r1)
            if (r2 == 0) goto L4a
            com.google.android.gms.common.logging.Logger r2 = com.google.android.gms.auth.zzl.zzc()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "isUserRecoverableError status: "
            java.lang.String r1 = r3.concat(r1)
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.m72304w(r1, r3)
            com.google.android.gms.auth.UserRecoverableAuthException r1 = new com.google.android.gms.auth.UserRecoverableAuthException
            r1.<init>(r0, r5)
            throw r1
        L4a:
            com.google.android.gms.auth.GoogleAuthException r5 = new com.google.android.gms.auth.GoogleAuthException
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.zzj.zza(android.os.IBinder):java.lang.Object");
    }
}
