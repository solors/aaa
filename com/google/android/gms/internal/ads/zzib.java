package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzib extends zzbd {
    public final int zzc;
    @Nullable
    public final String zzd;
    public final int zze;
    @Nullable
    public final zzab zzf;
    public final int zzg;
    @Nullable
    public final zzug zzh;
    final boolean zzi;

    static {
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    private zzib(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static zzib zzb(Throwable th, String str, int i, @Nullable zzab zzabVar, int i2, boolean z, int i3) {
        int i4;
        if (zzabVar == null) {
            i4 = 4;
        } else {
            i4 = i2;
        }
        return new zzib(1, th, null, i3, str, i, zzabVar, i4, z);
    }

    public static zzib zzc(IOException iOException, int i) {
        return new zzib(0, iOException, i);
    }

    public static zzib zzd(RuntimeException runtimeException, int i) {
        return new zzib(2, runtimeException, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CheckResult
    public final zzib zza(@Nullable zzug zzugVar) {
        String message = getMessage();
        int i = zzei.zza;
        return new zzib(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzugVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private zzib(int r14, @androidx.annotation.Nullable java.lang.Throwable r15, @androidx.annotation.Nullable java.lang.String r16, int r17, @androidx.annotation.Nullable java.lang.String r18, int r19, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzab r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            r8 = r21
            if (r4 == 0) goto L5f
            r0 = 1
            if (r4 == r0) goto Lf
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L65
        Lf:
            java.lang.String r1 = java.lang.String.valueOf(r20)
            int r2 = com.google.android.gms.internal.ads.zzei.zza
            if (r8 == 0) goto L34
            if (r8 == r0) goto L31
            r0 = 2
            if (r8 == r0) goto L2e
            r0 = 3
            if (r8 == r0) goto L2b
            r0 = 4
            if (r8 != r0) goto L25
            java.lang.String r0 = "YES"
            goto L36
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L2b:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L36
        L2e:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L36
        L31:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L36
        L34:
            java.lang.String r0 = "NO"
        L36:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", format_supported="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L65
        L5f:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L65:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L72
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L72:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzib.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.zzab, int, boolean):void");
    }

    private zzib(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable zzab zzabVar, int i4, @Nullable zzug zzugVar, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        int i5;
        boolean z2;
        if (z) {
            i5 = i2;
            if (i5 == 1) {
                i5 = 1;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            i5 = i2;
            z2 = true;
        }
        zzcw.zzd(z2);
        zzcw.zzd(th != null);
        this.zzc = i5;
        this.zzd = str2;
        this.zze = i3;
        this.zzf = zzabVar;
        this.zzg = i4;
        this.zzh = zzugVar;
        this.zzi = z;
    }
}
