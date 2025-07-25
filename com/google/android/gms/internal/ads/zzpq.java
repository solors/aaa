package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.Nullable;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzpq {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private zzcx zzI;
    private final zzpp zza;
    private final long[] zzb;
    @Nullable
    private AudioTrack zzc;
    private int zzd;
    @Nullable
    private zzpo zze;
    private int zzf;
    private boolean zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    @Nullable
    private Method zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzpq(zzpp zzppVar) {
        this.zza = zzppVar;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzI = zzcx.zza;
    }

    private final long zzl() {
        long zzb = this.zzI.zzb();
        int i = 2;
        if (this.zzx != -9223372036854775807L) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.zzz;
            }
            return Math.min(this.zzA, this.zzz + zzei.zzp(zzei.zzq(zzei.zzs(zzb) - this.zzx, this.zzi), this.zzf));
        }
        if (zzb - this.zzr >= 5) {
            AudioTrack audioTrack2 = this.zzc;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                long j = 0;
                if (this.zzg) {
                    if (playState == 2) {
                        if (playbackHeadPosition == 0) {
                            this.zzu = this.zzs;
                        }
                    } else {
                        i = playState;
                    }
                    playbackHeadPosition += this.zzu;
                    playState = i;
                }
                if (zzei.zza <= 29) {
                    if (playbackHeadPosition == 0) {
                        if (this.zzs > 0 && playState == 3) {
                            if (this.zzy == -9223372036854775807L) {
                                this.zzy = zzb;
                            }
                        }
                    } else {
                        j = playbackHeadPosition;
                    }
                    this.zzy = -9223372036854775807L;
                    playbackHeadPosition = j;
                }
                if (this.zzs > playbackHeadPosition) {
                    this.zzt++;
                }
                this.zzs = playbackHeadPosition;
            }
            this.zzr = zzb;
        }
        return this.zzs + this.zzH + (this.zzt << 32);
    }

    private final long zzm() {
        return zzei.zzt(zzl(), this.zzf);
    }

    private final void zzn() {
        this.zzk = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzl = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzj = false;
    }

    public final long zza(boolean z) {
        long zzq;
        long j;
        int i;
        Method method;
        AudioTrack audioTrack;
        AudioTrack audioTrack2 = this.zzc;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long zzc = this.zzI.zzc() / 1000;
            if (zzc - this.zzl >= 30000) {
                long zzm = zzm();
                if (zzm != 0) {
                    this.zzb[this.zzv] = zzei.zzr(zzm, this.zzi) - zzc;
                    this.zzv = (this.zzv + 1) % 10;
                    int i2 = this.zzw;
                    if (i2 < 10) {
                        this.zzw = i2 + 1;
                    }
                    this.zzl = zzc;
                    this.zzk = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.zzw;
                        if (i3 >= i4) {
                            break;
                        }
                        this.zzk += this.zzb[i3] / i4;
                        i3++;
                    }
                }
            }
            if (!this.zzg) {
                zzpo zzpoVar = this.zze;
                zzpoVar.getClass();
                if (!zzpoVar.zzg(zzc)) {
                    i = 0;
                } else {
                    long zzb = zzpoVar.zzb();
                    long zza = zzpoVar.zza();
                    long zzm2 = zzm();
                    if (Math.abs(zzb - zzc) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                        i = 0;
                        this.zza.zzd(zza, zzb, zzc, zzm2);
                        zzpoVar.zzd();
                    } else {
                        i = 0;
                        if (Math.abs(zzei.zzt(zza, this.zzf) - zzm2) > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                            this.zza.zzc(zza, zzb, zzc, zzm2);
                            zzpoVar.zzd();
                        } else {
                            zzpoVar.zzc();
                        }
                    }
                }
                if (this.zzp && (method = this.zzm) != null && zzc - this.zzq >= 500000) {
                    try {
                        this.zzc.getClass();
                        int i5 = zzei.zza;
                        long intValue = (((Integer) method.invoke(audioTrack, new Object[i])).intValue() * 1000) - this.zzh;
                        this.zzn = intValue;
                        long max = Math.max(intValue, 0L);
                        this.zzn = max;
                        if (max > DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US) {
                            this.zza.zza(max);
                            this.zzn = 0L;
                        }
                    } catch (Exception unused) {
                        this.zzm = null;
                    }
                    this.zzq = zzc;
                }
            }
        }
        long zzc2 = this.zzI.zzc() / 1000;
        zzpo zzpoVar2 = this.zze;
        zzpoVar2.getClass();
        boolean zzf = zzpoVar2.zzf();
        if (zzf) {
            j = zzei.zzt(zzpoVar2.zza(), this.zzf) + zzei.zzq(zzc2 - zzpoVar2.zzb(), this.zzi);
        } else {
            if (this.zzw == 0) {
                zzq = zzm();
            } else {
                zzq = zzei.zzq(this.zzk + zzc2, this.zzi);
            }
            if (!z) {
                j = Math.max(0L, zzq - this.zzn);
            } else {
                j = zzq;
            }
        }
        if (this.zzD != zzf) {
            this.zzF = this.zzC;
            this.zzE = this.zzB;
        }
        long j2 = zzc2 - this.zzF;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (this.zzE + zzei.zzq(j2, this.zzi)))) / 1000;
        }
        if (!this.zzj) {
            long j4 = this.zzB;
            if (j > j4) {
                this.zzj = true;
                int i6 = zzei.zza;
                this.zza.zzb(this.zzI.zza() - zzei.zzv(zzei.zzr(zzei.zzv(j - j4), this.zzi)));
            }
        }
        this.zzC = zzc2;
        this.zzB = j;
        this.zzD = zzf;
        return j;
    }

    public final void zzb(long j) {
        this.zzz = zzl();
        this.zzx = zzei.zzs(this.zzI.zzb());
        this.zzA = j;
    }

    public final void zzc() {
        zzn();
        this.zzc = null;
        this.zze = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.zzc = r3
            r2.zzd = r7
            com.google.android.gms.internal.ads.zzpo r0 = new com.google.android.gms.internal.ads.zzpo
            r0.<init>(r3)
            r2.zze = r0
            int r3 = r3.getSampleRate()
            r2.zzf = r3
            r3 = 0
            if (r4 == 0) goto L23
            int r4 = com.google.android.gms.internal.ads.zzei.zza
            r0 = 23
            if (r4 >= r0) goto L23
            r4 = 5
            r0 = 1
            if (r5 == r4) goto L24
            r4 = 6
            if (r5 != r4) goto L23
            r5 = r4
            goto L24
        L23:
            r0 = r3
        L24:
            r2.zzg = r0
            boolean r4 = com.google.android.gms.internal.ads.zzei.zzJ(r5)
            r2.zzp = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r7 = r7 / r6
            long r4 = (long) r7
            int r6 = r2.zzf
            long r4 = com.google.android.gms.internal.ads.zzei.zzt(r4, r6)
            goto L3d
        L3c:
            r4 = r0
        L3d:
            r2.zzh = r4
            r4 = 0
            r2.zzs = r4
            r2.zzt = r4
            r2.zzG = r3
            r2.zzH = r4
            r2.zzu = r4
            r2.zzo = r3
            r2.zzx = r0
            r2.zzy = r0
            r2.zzq = r4
            r2.zzn = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.zzi = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpq.zzd(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zze(zzcx zzcxVar) {
        this.zzI = zzcxVar;
    }

    public final void zzf() {
        if (this.zzx != -9223372036854775807L) {
            this.zzx = zzei.zzs(this.zzI.zzb());
        }
        zzpo zzpoVar = this.zze;
        zzpoVar.getClass();
        zzpoVar.zze();
    }

    public final boolean zzg(long j) {
        if (j <= zzei.zzp(zza(false), this.zzf)) {
            if (this.zzg) {
                AudioTrack audioTrack = this.zzc;
                audioTrack.getClass();
                if (audioTrack.getPlayState() == 2 && zzl() == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            return true;
        }
        return false;
    }

    public final boolean zzi(long j) {
        if (this.zzy != -9223372036854775807L && j > 0 && this.zzI.zzb() - this.zzy >= 200) {
            return true;
        }
        return false;
    }

    public final boolean zzj(long j) {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzg) {
            if (playState == 2) {
                this.zzo = false;
                return false;
            } else if (playState == 1) {
                if (zzl() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzo;
        boolean zzg = zzg(j);
        this.zzo = zzg;
        if (z && !zzg && playState != 1) {
            this.zza.zze(this.zzd, zzei.zzv(this.zzh));
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx == -9223372036854775807L) {
            zzpo zzpoVar = this.zze;
            zzpoVar.getClass();
            zzpoVar.zze();
            return true;
        }
        this.zzz = zzl();
        return false;
    }
}
