package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes5.dex */
public final class zzys extends Handler implements Runnable {
    final /* synthetic */ zzyy zza;
    private final zzyt zzb;
    private final long zzc;
    @Nullable
    private zzyq zzd;
    @Nullable
    private IOException zze;
    private int zzf;
    @Nullable
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzys(zzyy zzyyVar, Looper looper, zzyt zzytVar, zzyq zzyqVar, int i, long j) {
        super(looper);
        this.zza = zzyyVar;
        this.zzb = zzytVar;
        this.zzd = zzyqVar;
        this.zzc = j;
    }

    private final void zzd() {
        zzzg zzzgVar;
        zzys zzysVar;
        SystemClock.elapsedRealtime();
        this.zzd.getClass();
        this.zze = null;
        zzyy zzyyVar = this.zza;
        zzzgVar = zzyyVar.zzc;
        zzysVar = zzyyVar.zzd;
        zzysVar.getClass();
        zzzgVar.execute(zzysVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        long min;
        if (!this.zzi) {
            int i4 = message.what;
            if (i4 == 1) {
                zzd();
            } else if (i4 != 4) {
                this.zza.zzd = null;
                long j2 = this.zzc;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - j2;
                zzyq zzyqVar = this.zzd;
                zzyqVar.getClass();
                if (this.zzh) {
                    zzyqVar.zzJ(this.zzb, elapsedRealtime, j3, false);
                    return;
                }
                int i5 = message.what;
                if (i5 != 2) {
                    if (i5 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.zze = iOException;
                        int i6 = this.zzf + 1;
                        this.zzf = i6;
                        zzyr zzu = zzyqVar.zzu(this.zzb, elapsedRealtime, j3, iOException, i6);
                        i = zzu.zza;
                        if (i != 3) {
                            i2 = zzu.zza;
                            if (i2 != 2) {
                                i3 = zzu.zza;
                                if (i3 == 1) {
                                    this.zzf = 1;
                                }
                                j = zzu.zzb;
                                if (j != -9223372036854775807L) {
                                    min = zzu.zzb;
                                } else {
                                    min = Math.min((this.zzf - 1) * 1000, 5000);
                                }
                                zzc(min);
                                return;
                            }
                            return;
                        }
                        this.zza.zze = this.zze;
                        return;
                    }
                    return;
                }
                try {
                    zzyqVar.zzK(this.zzb, elapsedRealtime, j3);
                } catch (RuntimeException e) {
                    zzdo.zzd("LoadTask", "Unexpected exception handling load completed", e);
                    this.zza.zze = new zzyw(e);
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z) {
                Trace.beginSection("load:" + this.zzb.getClass().getSimpleName());
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (!this.zzi) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.zzi) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e2) {
            if (!this.zzi) {
                zzdo.zzd("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(3, new zzyw(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.zzi) {
                zzdo.zzd("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(3, new zzyw(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.zzi) {
                zzdo.zzd("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzd = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzyq zzyqVar = this.zzd;
            zzyqVar.getClass();
            zzyqVar.zzJ(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzys zzysVar;
        boolean z;
        zzysVar = this.zza.zzd;
        if (zzysVar == null) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        this.zza.zzd = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            zzd();
        }
    }
}
