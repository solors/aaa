package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzfkh {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzbpe zzd;
    protected com.google.android.gms.ads.internal.client.zzft zze;
    private final com.google.android.gms.ads.internal.client.zzcf zzg;
    private final zzfjg zzi;
    private final ScheduledExecutorService zzk;
    private zzfjp zzn;
    private final Clock zzo;
    private final ConcurrentLinkedQueue zzh = new ConcurrentLinkedQueue();
    protected final AtomicBoolean zzf = new AtomicBoolean(true);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    private final AtomicBoolean zzl = new AtomicBoolean(true);
    private final AtomicBoolean zzm = new AtomicBoolean(false);

    public zzfkh(ClientApi clientApi, Context context, int i, zzbpe zzbpeVar, @NonNull com.google.android.gms.ads.internal.client.zzft zzftVar, @NonNull com.google.android.gms.ads.internal.client.zzcf zzcfVar, @NonNull ScheduledExecutorService scheduledExecutorService, zzfjg zzfjgVar, Clock clock) {
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzbpeVar;
        this.zze = zzftVar;
        this.zzg = zzcfVar;
        this.zzk = scheduledExecutorService;
        this.zzi = zzfjgVar;
        this.zzo = clock;
    }

    public final synchronized void zzA(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.set(false);
        int i = zzeVar.zza;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            zzC(true);
            return;
        }
        com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
        int i2 = zzftVar.zzb;
        String str = zzftVar.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Preloading " + i2 + ", for adUnitId:" + str + ", Ad load failed. Stop preloading due to non-retriable error:");
        this.zzf.set(false);
    }

    private final synchronized void zzB() {
        Iterator it = this.zzh.iterator();
        while (it.hasNext()) {
            if (((zzfjx) it.next()).zzc()) {
                it.remove();
            }
        }
    }

    private final synchronized void zzC(boolean z) {
        if (!this.zzi.zze()) {
            if (z) {
                this.zzi.zzb();
            }
            this.zzk.schedule(new zzfjy(this), this.zzi.zza(), TimeUnit.MILLISECONDS);
        }
    }

    private static final Optional zzD(Optional optional) {
        return optional.filter(new Predicate() { // from class: com.google.android.gms.internal.ads.zzfjz
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return r1.isInstance((com.google.android.gms.ads.internal.client.zzdy) obj);
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.zzfka
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (zzcvm) r1.cast((com.google.android.gms.ads.internal.client.zzdy) obj);
            }
        }).map(new Function() { // from class: com.google.android.gms.internal.ads.zzfkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((zzcvm) obj).zzk();
            }
        });
    }

    private final synchronized void zzu(Object obj) {
        zzfjx zzfjxVar = new zzfjx(obj, this.zzo);
        this.zzh.add(zzfjxVar);
        Clock clock = this.zzo;
        final Optional zzb = zzb(obj);
        final long currentTimeMillis = clock.currentTimeMillis();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkc
            {
                zzfkh.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzfkh.this.zzx();
            }
        });
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkd
            {
                zzfkh.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzfkh.this.zzm(currentTimeMillis, zzb);
            }
        });
        this.zzk.schedule(new zzfjy(this), zzfjxVar.zza(), TimeUnit.MILLISECONDS);
    }

    public final synchronized void zzv(Throwable th) {
        this.zzj.set(false);
        if ((th instanceof zzfjc) && ((zzfjc) th).zza() == 0) {
            throw null;
        }
        zzC(true);
    }

    public final synchronized void zzw(Object obj) {
        boolean z = false;
        this.zzj.set(false);
        if (obj != null) {
            this.zzi.zzc();
            this.zzm.set(true);
            zzu(obj);
        }
        if (obj == null) {
            z = true;
        }
        zzC(z);
    }

    public final synchronized void zzx() {
        if (this.zzl.get()) {
            try {
                this.zzg.zze(this.zze);
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call onAdsAvailable");
            }
        }
    }

    public final synchronized void zzy() {
        if (this.zzl.get()) {
            try {
                this.zzg.zzf(this.zze);
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call onAdsExhausted");
            }
        }
    }

    private final synchronized void zzz() {
        if (this.zzm.get() && this.zzh.isEmpty()) {
            this.zzm.set(false);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfke
                {
                    zzfkh.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzfkh.this.zzy();
                }
            });
            this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkf
                {
                    zzfkh.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzfkh.this.zzn();
                }
            });
        }
    }

    protected abstract ListenableFuture zza();

    protected abstract Optional zzb(Object obj);

    public final synchronized zzfkh zzc() {
        this.zzk.submit(new zzfjy(this));
        return this;
    }

    @Nullable
    protected final synchronized Object zzd() {
        zzfjx zzfjxVar = (zzfjx) this.zzh.peek();
        if (zzfjxVar == null) {
            return null;
        }
        return zzfjxVar.zzb();
    }

    @Nullable
    public final synchronized Object zze() {
        boolean z;
        this.zzi.zzc();
        zzfjx zzfjxVar = (zzfjx) this.zzh.poll();
        if (zzfjxVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.zzm.set(z);
        zzl();
        if (zzfjxVar == null) {
            return null;
        }
        return zzfjxVar.zzb();
    }

    public final synchronized Optional zzf() {
        Optional zzb;
        Object zzd = zzd();
        if (zzd == null) {
            zzb = Optional.empty();
        } else {
            zzb = zzb(zzd);
        }
        return zzD(zzb);
    }

    public final synchronized void zzl() {
        zzB();
        zzz();
        if (!this.zzj.get() && this.zzf.get() && this.zzh.size() < this.zze.zzd) {
            this.zzj.set(true);
            zzgch.zzr(zza(), new zzfkg(this), this.zzk);
        }
    }

    public final /* synthetic */ void zzm(long j, Optional optional) {
        zzfjp zzfjpVar = this.zzn;
        if (zzfjpVar != null) {
            zzfjpVar.zzb(AdFormat.getAdFormat(this.zze.zzb), j, zzD(optional));
        }
    }

    public final /* synthetic */ void zzn() {
        zzfjp zzfjpVar = this.zzn;
        if (zzfjpVar != null) {
            zzfjpVar.zzc(AdFormat.getAdFormat(this.zze.zzb), this.zzo.currentTimeMillis());
        }
    }

    public final synchronized void zzo(int i) {
        boolean z;
        if (i >= 5) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.zzi.zzd(i);
    }

    public final synchronized void zzp() {
        this.zzf.set(true);
        this.zzl.set(true);
        this.zzk.submit(new zzfjy(this));
    }

    public final void zzq(zzfjp zzfjpVar) {
        this.zzn = zzfjpVar;
    }

    public final void zzr() {
        this.zzf.set(false);
        this.zzl.set(false);
    }

    public final synchronized void zzs(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
        String str = zzftVar.zza;
        int i2 = zzftVar.zzb;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzftVar.zzc;
        if (i <= 0) {
            i = zzftVar.zzd;
        }
        this.zze = new com.google.android.gms.ads.internal.client.zzft(str, i2, zzmVar, i);
    }

    public final synchronized boolean zzt() {
        zzB();
        if (!this.zzh.isEmpty()) {
            return true;
        }
        return false;
    }
}
