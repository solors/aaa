package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
final class zzde implements zzdd {
    @Override // com.google.android.gms.internal.play_billing.zzdd
    public final StackTraceElement zza(Class cls, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = cls.getName();
        int i2 = 3;
        boolean z = false;
        while (true) {
            if (i2 < stackTrace.length) {
                if (stackTrace[i2].getClassName().equals(name)) {
                    z = true;
                } else if (z) {
                    break;
                } else {
                    z = false;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 != -1) {
            return stackTrace[i2];
        }
        return null;
    }
}
