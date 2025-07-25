package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzarg;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzaus;
import com.google.android.gms.internal.ads.zzauv;
import com.google.android.gms.internal.ads.zzaux;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzfni;
import com.google.android.gms.internal.ads.zzfok;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzgch;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzk implements Runnable, zzauv {
    @VisibleForTesting
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfni zzi;
    private Context zzj;
    private final Context zzk;
    private VersionInfoParcel zzl;
    private final VersionInfoParcel zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = versionInfoParcel;
        this.zzm = versionInfoParcel;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzbe.zzc().zza(zzbcl.zzcy)).booleanValue();
        this.zzn = booleanValue;
        this.zzi = zzfni.zza(context, newCachedThreadPool, booleanValue);
        this.zzf = ((Boolean) zzbe.zzc().zza(zzbcl.zzcv)).booleanValue();
        this.zzg = ((Boolean) zzbe.zzc().zza(zzbcl.zzcz)).booleanValue();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcx)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzdA)).booleanValue()) {
            this.zza = zzi();
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzdu)).booleanValue()) {
            zzbzw.zza.execute(this);
            return;
        }
        zzbc.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzu()) {
            zzbzw.zza.execute(this);
        } else {
            run();
        }
    }

    @Nullable
    private final zzauv zzq() {
        if (zzm() == 2) {
            return (zzauv) this.zze.get();
        }
        return (zzauv) this.zzd.get();
    }

    private final void zzr() {
        List list = this.zzc;
        zzauv zzq = zzq();
        if (!list.isEmpty() && zzq != null) {
            for (Object[] objArr : this.zzc) {
                int length = objArr.length;
                if (length == 1) {
                    zzq.zzk((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzq.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.zzc.clear();
        }
    }

    private final void zzs(boolean z) {
        String str = this.zzl.afmaVersion;
        Context zzt = zzt(this.zzj);
        zzare zza = zzarg.zza();
        zza.zza(z);
        zza.zzb(str);
        this.zzd.set(zzauz.zzu(zzt, new zzaux((zzarg) zza.zzbr())));
    }

    private static final Context zzt(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    private static final zzaus zzu(Context context, VersionInfoParcel versionInfoParcel, boolean z, boolean z2) {
        zzare zza = zzarg.zza();
        zza.zza(z);
        zza.zzb(versionInfoParcel.afmaVersion);
        return zzaus.zza(zzt(context), (zzarg) zza.zzbr(), z2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.ads.internal.util.client.VersionInfoParcel, android.content.Context] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzdA)).booleanValue()) {
                this.zza = zzi();
            }
            boolean z = this.zzl.isClientJar;
            final boolean z2 = false;
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzbf)).booleanValue() && z) {
                z2 = true;
            }
            if (zzm() == 1) {
                zzs(z2);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        {
                            zzk.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzk.this.zzc(z2);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzaus zzu = zzu(this.zzj, this.zzl, z2, this.zzn);
                    this.zze.set(zzu);
                    if (this.zzg && !zzu.zzr()) {
                        this.zzo = 1;
                        zzs(z2);
                    }
                } catch (NullPointerException e) {
                    this.zzo = 1;
                    zzs(z2);
                    this.zzi.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
        } finally {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    public final String zzb(Context context, byte[] bArr) {
        zzauv zzq;
        if (zzj() && (zzq = zzq()) != null) {
            zzr();
            return zzq.zzf(zzt(context));
        }
        return "";
    }

    public final /* synthetic */ void zzc(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzu(this.zzk, this.zzm, z, this.zzn).zzp();
        } catch (NullPointerException e) {
            this.zzi.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zze(Context context, String str, View view, Activity activity) {
        if (zzj()) {
            zzauv zzq = zzq();
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzkz)).booleanValue()) {
                zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzK(view, 4, null);
            }
            if (zzq != null) {
                zzr();
                return zzq.zze(zzt(context), str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzf(Context context) {
        return zzb(context, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzg(final Context context) {
        try {
            return (String) zzgch.zzj(new Callable() { // from class: com.google.android.gms.ads.internal.zzh
                {
                    zzk.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzk.this.zzb(context, null);
                }
            }, this.zzh).get(((Integer) zzbe.zzc().zza(zzbcl.zzcP)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzauo.zza(context, this.zzm.afmaVersion, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzh(Context context, View view, Activity activity) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzky)).booleanValue()) {
            if (zzj()) {
                zzauv zzq = zzq();
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzkz)).booleanValue()) {
                    zzv.zzq();
                    com.google.android.gms.ads.internal.util.zzs.zzK(view, 2, null);
                }
                if (zzq != null) {
                    return zzq.zzh(context, view, activity);
                }
                return "";
            }
            return "";
        }
        zzauv zzq2 = zzq();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkz)).booleanValue()) {
            zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzK(view, 2, null);
        }
        if (zzq2 != null) {
            return zzq2.zzh(context, view, activity);
        }
        return "";
    }

    protected final boolean zzi() {
        Context context = this.zzj;
        zzj zzjVar = new zzj(this);
        zzfni zzfniVar = this.zzi;
        return new zzfpe(this.zzj, zzfok.zzb(context, zzfniVar), zzjVar, ((Boolean) zzbe.zzc().zza(zzbcl.zzcw)).booleanValue()).zzd(1);
    }

    public final boolean zzj() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzk(MotionEvent motionEvent) {
        zzauv zzq = zzq();
        if (zzq != null) {
            zzr();
            zzq.zzk(motionEvent);
            return;
        }
        this.zzc.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzl(int i, int i2, int i3) {
        zzauv zzq = zzq();
        if (zzq != null) {
            zzr();
            zzq.zzl(i, i2, i3);
            return;
        }
        this.zzc.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    protected final int zzm() {
        if (this.zzf && !this.zza) {
            return 1;
        }
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzauv zzq;
        zzauv zzq2;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcU)).booleanValue()) {
            if (this.zzb.getCount() == 0 && (zzq2 = zzq()) != null) {
                zzq2.zzn(stackTraceElementArr);
            }
        } else if (zzj() && (zzq = zzq()) != null) {
            zzq.zzn(stackTraceElementArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzo(View view) {
        zzauv zzq = zzq();
        if (zzq != null) {
            zzq.zzo(view);
        }
    }

    public final int zzp() {
        return this.zzo;
    }
}
