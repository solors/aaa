package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgax;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
abstract class zzgbm extends zzgax.zzi {
    private static final zzgbi zzbe;
    private static final zzgcq zzbf = new zzgcq(zzgbm.class);
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzgbi zzgbkVar;
        Throwable th;
        try {
            zzgbkVar = new zzgbj(AtomicReferenceFieldUpdater.newUpdater(zzgbm.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzgbm.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzgbkVar = new zzgbk(null);
            th = th2;
        }
        zzbe = zzgbkVar;
        if (th != null) {
            zzbf.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbm(int i) {
        this.remaining = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzA() {
        return zzbe.zza(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zze(newSetFromMap);
            zzbe.zzb(this, null, newSetFromMap);
            Set<Throwable> set2 = this.seenExceptions;
            Objects.requireNonNull(set2);
            return set2;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzF() {
        this.seenExceptions = null;
    }

    abstract void zze(Set set);
}
