package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzgbh extends zzgbm {
    private static final zzgcq zza = new zzgcq(zzgbh.class);
    private zzfxi zzb;
    private final boolean zzc;
    private final boolean zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbh(zzfxi zzfxiVar, boolean z, boolean z2) {
        super(zzfxiVar.size());
        this.zzb = zzfxiVar;
        this.zzc = z;
        this.zzf = z2;
    }

    private final void zzG(int i, Future future) {
        try {
            zzf(i, zzgdk.zza(future));
        } catch (ExecutionException e) {
            zzI(e.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH */
    public final void zzx(zzfxi zzfxiVar) {
        boolean z;
        int zzA = zzA();
        int i = 0;
        if (zzA >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzfun.zzm(z, "Less than 0 remaining futures");
        if (zzA == 0) {
            if (zzfxiVar != null) {
                zzfzt it = zzfxiVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private final void zzI(Throwable th) {
        th.getClass();
        if (this.zzc && !zzd(th) && zzL(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        String str;
        if (true != (th instanceof Error)) {
            str = "Got more than one input Future failure. Logging failures after the first";
        } else {
            str = "Input Future failed with Error";
        }
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzK */
    public final void zzw(int i, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, listenableFuture);
            }
        } finally {
            zzx(null);
        }
    }

    private static boolean zzL(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        zzfxi zzfxiVar = this.zzb;
        if (zzfxiVar != null) {
            return "futures=".concat(zzfxiVar.toString());
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        zzfxi zzfxiVar = this.zzb;
        boolean z = true;
        zzy(1);
        boolean isCancelled = isCancelled();
        if (zzfxiVar == null) {
            z = false;
        }
        if (z & isCancelled) {
            boolean zzt = zzt();
            zzfzt it = zzfxiVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzt);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    final void zze(Set set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable zzl = zzl();
            Objects.requireNonNull(zzl);
            zzL(set, zzl);
        }
    }

    abstract void zzf(int i, Object obj);

    abstract void zzu();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzv() {
        final zzfxi zzfxiVar;
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzu();
        } else if (this.zzc) {
            zzfzt it = this.zzb.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) it.next();
                int i2 = i + 1;
                if (listenableFuture.isDone()) {
                    zzw(i, listenableFuture);
                } else {
                    listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgbf
                        {
                            zzgbh.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzgbh.this.zzw(i, listenableFuture);
                        }
                    }, zzgbv.INSTANCE);
                }
                i = i2;
            }
        } else {
            if (this.zzf) {
                zzfxiVar = this.zzb;
            } else {
                zzfxiVar = null;
            }
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgbg
                {
                    zzgbh.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzgbh.this.zzx(zzfxiVar);
                }
            };
            zzfzt it2 = this.zzb.iterator();
            while (it2.hasNext()) {
                ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
                if (listenableFuture2.isDone()) {
                    zzx(zzfxiVar);
                } else {
                    listenableFuture2.addListener(runnable, zzgbv.INSTANCE);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzy(int i) {
        this.zzb = null;
    }
}
