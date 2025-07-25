package com.google.android.gms.internal.play_billing;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
public final class zzcz {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzdd zzb;

    static {
        zzdd zzdeVar;
        int i = 0;
        while (true) {
            if (i < 2) {
                try {
                    zzdeVar = (zzdd) Class.forName(zza[i]).asSubclass(zzdd.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    zzdeVar = null;
                }
                if (zzdeVar != null) {
                    break;
                }
                i++;
            } else {
                zzdeVar = new zzde();
                break;
            }
        }
        zzb = zzdeVar;
    }

    @NullableDecl
    public static StackTraceElement zza(Class cls, int i) {
        zzda.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}
