package com.google.android.gms.internal.play_billing;

import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
final class zzce extends zzby {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicLong zzb = new AtomicLong();
    private static final ConcurrentLinkedQueue zzc = new ConcurrentLinkedQueue();
    private volatile zzbf zzd;

    private zzce(String str) {
        super(str);
        boolean z;
        boolean z2;
        String str2 = Build.FINGERPRINT;
        boolean z3 = true;
        if (str2 != null && !"robolectric".equals(str2)) {
            z = false;
        } else {
            z = true;
        }
        String str3 = Build.HARDWARE;
        if (!"goldfish".equals(str3) && !"ranchu".equals(str3)) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str4 = Build.TYPE;
        if (!"eng".equals(str4) && !"userdebug".equals(str4)) {
            z3 = false;
        }
        if (!z && !z2) {
            if (z3) {
                this.zzd = zzck.zzc().zzb(false).zza(zza());
                return;
            } else {
                this.zzd = null;
                return;
            }
        }
        this.zzd = new zzbz().zza(zza());
    }

    public static zzbf zzb(String str) {
        AtomicReference atomicReference = zza;
        if (atomicReference.get() != null) {
            return ((zzca) atomicReference.get()).zza(str);
        }
        zzce zzceVar = new zzce(str.replace('$', '.'));
        zzcc.zza.offer(zzceVar);
        if (atomicReference.get() != null) {
            while (true) {
                zzce zzceVar2 = (zzce) zzcc.zza.poll();
                if (zzceVar2 == null) {
                    break;
                }
                zzceVar2.zzd = ((zzca) zza.get()).zza(zzceVar2.zza());
            }
            if (((zzcd) zzc.poll()) != null) {
                zzb.getAndDecrement();
                throw null;
            }
        }
        return zzceVar;
    }
}
