package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.CircularIntArray;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@RequiresApi(23)
/* loaded from: classes5.dex */
public final class zzrt extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    @Nullable
    @GuardedBy("lock")
    private MediaFormat zzh;
    @Nullable
    @GuardedBy("lock")
    private MediaFormat zzi;
    @Nullable
    @GuardedBy("lock")
    private MediaCodec.CodecException zzj;
    @Nullable
    @GuardedBy("lock")
    private MediaCodec.CryptoException zzk;
    @GuardedBy("lock")
    private long zzl;
    @GuardedBy("lock")
    private boolean zzm;
    @Nullable
    @GuardedBy("lock")
    private IllegalStateException zzn;
    @Nullable
    @GuardedBy("lock")
    private zzsc zzo;
    private final Object zza = new Object();
    @GuardedBy("lock")
    private final CircularIntArray zzd = new CircularIntArray();
    @GuardedBy("lock")
    private final CircularIntArray zze = new CircularIntArray();
    @GuardedBy("lock")
    private final ArrayDeque zzf = new ArrayDeque();
    @GuardedBy("lock")
    private final ArrayDeque zzg = new ArrayDeque();

    public zzrt(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    public static /* synthetic */ void zzd(zzrt zzrtVar) {
        synchronized (zzrtVar.zza) {
            if (zzrtVar.zzm) {
                return;
            }
            long j = zzrtVar.zzl - 1;
            zzrtVar.zzl = j;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                return;
            }
            if (i < 0) {
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (zzrtVar.zza) {
                    zzrtVar.zzn = illegalStateException;
                }
                return;
            }
            zzrtVar.zzj();
        }
    }

    @GuardedBy("lock")
    private final void zzi(MediaFormat mediaFormat) {
        this.zze.addLast(-2);
        this.zzg.add(mediaFormat);
    }

    @GuardedBy("lock")
    private final void zzj() {
        if (!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat) this.zzg.getLast();
        }
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
    }

    @GuardedBy("lock")
    private final void zzk() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException == null) {
            MediaCodec.CodecException codecException = this.zzj;
            if (codecException == null) {
                MediaCodec.CryptoException cryptoException = this.zzk;
                if (cryptoException == null) {
                    return;
                }
                this.zzk = null;
                throw cryptoException;
            }
            this.zzj = null;
            throw codecException;
        }
        this.zzn = null;
        throw illegalStateException;
    }

    @GuardedBy("lock")
    private final boolean zzl() {
        if (this.zzl <= 0 && !this.zzm) {
            return false;
        }
        return true;
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        zzli zzliVar;
        zzli zzliVar2;
        synchronized (this.zza) {
            this.zzd.addLast(i);
            zzsc zzscVar = this.zzo;
            if (zzscVar != null) {
                zzsn zzsnVar = ((zzsk) zzscVar).zza;
                zzliVar = zzsnVar.zzo;
                if (zzliVar != null) {
                    zzliVar2 = zzsnVar.zzo;
                    zzliVar2.zza();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        zzli zzliVar;
        zzli zzliVar2;
        synchronized (this.zza) {
            MediaFormat mediaFormat = this.zzi;
            if (mediaFormat != null) {
                zzi(mediaFormat);
                this.zzi = null;
            }
            this.zze.addLast(i);
            this.zzf.add(bufferInfo);
            zzsc zzscVar = this.zzo;
            if (zzscVar != null) {
                zzsn zzsnVar = ((zzsk) zzscVar).zza;
                zzliVar = zzsnVar.zzo;
                if (zzliVar != null) {
                    zzliVar2 = zzsnVar.zzo;
                    zzliVar2.zza();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzi(mediaFormat);
            this.zzi = null;
        }
    }

    public final int zza() {
        synchronized (this.zza) {
            zzk();
            int i = -1;
            if (zzl()) {
                return -1;
            }
            if (!this.zzd.isEmpty()) {
                i = this.zzd.popFirst();
            }
            return i;
        }
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            zzk();
            if (zzl()) {
                return -1;
            }
            if (this.zze.isEmpty()) {
                return -1;
            }
            int popFirst = this.zze.popFirst();
            if (popFirst >= 0) {
                zzcw.zzb(this.zzh);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (popFirst == -2) {
                this.zzh = (MediaFormat) this.zzg.remove();
                popFirst = -2;
            }
            return popFirst;
        }
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            mediaFormat = this.zzh;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            int i = zzei.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrs
                {
                    zzrt.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzrt.zzd(zzrt.this);
                }
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        boolean z;
        if (this.zzc == null) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        this.zzb.start();
        Handler handler = new Handler(this.zzb.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg(zzsc zzscVar) {
        synchronized (this.zza) {
            this.zzo = zzscVar;
        }
    }

    public final void zzh() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }
}
