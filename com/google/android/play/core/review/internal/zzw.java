package com.google.android.play.core.review.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public final class zzw {

    /* renamed from: a */
    private static final zzi f39256a = new zzi("PhoneskyVerificationUtils");

    public static boolean zza(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (r0 = signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        String zza = zzv.zza(signature.toByteArray());
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(zza)) {
                            if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(zza)) {
                                return true;
                            }
                        } else {
                            return true;
                        }
                    }
                } else {
                    f39256a.zze("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
