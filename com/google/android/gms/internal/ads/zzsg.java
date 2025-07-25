package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C21114v8;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzsg {
    public final String zza;
    public final String zzb;
    public final String zzc;
    @Nullable
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;

    @VisibleForTesting
    zzsg(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = z7;
        this.zzi = zzbb.zzi(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if ("Nexus 10".equals(r3) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r13) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzsg zzc(java.lang.String r13, java.lang.String r14, java.lang.String r15, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21) {
        /*
            r1 = r13
            r4 = r16
            com.google.android.gms.internal.ads.zzsg r12 = new com.google.android.gms.internal.ads.zzsg
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3c
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L3c
            int r3 = com.google.android.gms.internal.ads.zzei.zza
            r5 = 22
            if (r3 > r5) goto L3a
            java.lang.String r3 = com.google.android.gms.internal.ads.zzei.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L29
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3a
        L29:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L3c
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L3a
            goto L3c
        L3a:
            r8 = r0
            goto L3d
        L3c:
            r8 = r2
        L3d:
            if (r4 == 0) goto L49
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L49
            r9 = r0
            goto L4a
        L49:
            r9 = r2
        L4a:
            if (r21 != 0) goto L59
            if (r4 == 0) goto L57
            java.lang.String r3 = "secure-playback"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L57
            goto L59
        L57:
            r10 = r2
            goto L5a
        L59:
            r10 = r0
        L5a:
            int r3 = com.google.android.gms.internal.ads.zzei.zza
            r5 = 35
            if (r3 < r5) goto L6c
            if (r4 == 0) goto L6c
            java.lang.String r3 = "detached-surface"
            boolean r3 = r4.isFeatureSupported(r3)
            if (r3 == 0) goto L6c
            r11 = r0
            goto L6d
        L6c:
            r11 = r2
        L6d:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsg.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzsg");
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = zzei.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = zzei.zze;
        zzdo.zzb("MediaCodecInfo", "NoSupport [" + str + "] [" + this.zza + ", " + this.zzb + "] [" + str2 + C21114v8.C21123i.f54139e);
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzi = zzi(videoCapabilities, i, i2);
        int i3 = zzi.x;
        int i4 = zzi.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    private final boolean zzl(zzab zzabVar, boolean z) {
        int i;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i2 = zzta.zza;
        Pair zza = zzcy.zza(zzabVar);
        String str = zzabVar.zzo;
        if (str != null && str.equals("video/mv-hevc") && this.zzc.equals("video/hevc")) {
            String zzg = zzfk.zzg(zzabVar.zzr);
            if (zzg == null) {
                zza = null;
            } else {
                String trim = zzg.trim();
                int i3 = zzei.zza;
                zza = zzcy.zzb(zzg, trim.split("\\.", -1), zzabVar.zzC);
            }
        }
        if (zza != null) {
            int intValue = ((Integer) zza.first).intValue();
            int intValue2 = ((Integer) zza.second).intValue();
            int i4 = 8;
            if ("video/dolby-vision".equals(zzabVar.zzo)) {
                if ("video/avc".equals(this.zzb)) {
                    intValue = 8;
                } else if ("video/hevc".equals(this.zzb)) {
                    intValue = 2;
                }
                intValue2 = 0;
            }
            if (!this.zzi) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] zzh = zzh();
            if (zzei.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzh.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                    i = videoCapabilities.getBitrateRange().getUpper().intValue();
                } else {
                    i = 0;
                }
                if (i >= 180000000) {
                    i4 = 1024;
                } else if (i >= 120000000) {
                    i4 = 512;
                } else if (i >= 60000000) {
                    i4 = 256;
                } else if (i >= 30000000) {
                    i4 = 128;
                } else if (i >= 18000000) {
                    i4 = 64;
                } else if (i >= 12000000) {
                    i4 = 32;
                } else if (i >= 7200000) {
                    i4 = 16;
                } else if (i < 3600000) {
                    if (i >= 1800000) {
                        i4 = 4;
                    } else if (i >= 800000) {
                        i4 = 2;
                    } else {
                        i4 = 1;
                    }
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i4;
                zzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzh) {
                if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z)) {
                    if ("video/hevc".equals(this.zzb) && intValue == 2) {
                        String str2 = zzei.zzb;
                        if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                        }
                    }
                }
            }
            zzj("codec.profileLevel, " + zzabVar.zzk + ", " + this.zzc);
            return false;
        }
        return true;
    }

    private final boolean zzm(zzab zzabVar) {
        if (!this.zzb.equals(zzabVar.zzo) && !this.zzb.equals(zzta.zzb(zzabVar))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.zza;
    }

    @Nullable
    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            return zzi(videoCapabilities, i, i2);
        }
        return null;
    }

    public final zzht zzb(zzab zzabVar, zzab zzabVar2) {
        int i;
        int i2;
        if (true != Objects.equals(zzabVar.zzo, zzabVar2.zzo)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.zzi) {
            if (zzabVar.zzy != zzabVar2.zzy) {
                i |= 1024;
            }
            if (!this.zze && (zzabVar.zzv != zzabVar2.zzv || zzabVar.zzw != zzabVar2.zzw)) {
                i |= 512;
            }
            if ((!zzk.zzg(zzabVar.zzC) || !zzk.zzg(zzabVar2.zzC)) && !Objects.equals(zzabVar.zzC, zzabVar2.zzC)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzei.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzabVar.zzd(zzabVar2)) {
                i |= 2;
            }
            if (i == 0) {
                String str2 = this.zza;
                if (true != zzabVar.zzd(zzabVar2)) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                return new zzht(str2, zzabVar, zzabVar2, i2, 0);
            }
        } else {
            if (zzabVar.zzD != zzabVar2.zzD) {
                i |= 4096;
            }
            if (zzabVar.zzE != zzabVar2.zzE) {
                i |= 8192;
            }
            if (zzabVar.zzF != zzabVar2.zzF) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                int i3 = zzta.zza;
                Pair zza = zzcy.zza(zzabVar);
                Pair zza2 = zzcy.zza(zzabVar2);
                if (zza != null && zza2 != null) {
                    int intValue = ((Integer) zza.first).intValue();
                    int intValue2 = ((Integer) zza2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzht(this.zza, zzabVar, zzabVar2, 3, 0);
                    }
                }
            }
            if (!zzabVar.zzd(zzabVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzht(this.zza, zzabVar, zzabVar2, 1, 0);
            }
        }
        return new zzht(this.zza, zzabVar, zzabVar2, 0, i);
    }

    public final boolean zzd(zzab zzabVar) {
        if (!zzm(zzabVar) || !zzl(zzabVar, false)) {
            return false;
        }
        return true;
    }

    public final boolean zze(zzab zzabVar) throws zzsu {
        int i;
        int i2;
        if (!zzm(zzabVar) || !zzl(zzabVar, true)) {
            return false;
        }
        if (this.zzi) {
            int i3 = zzabVar.zzv;
            if (i3 <= 0 || (i2 = zzabVar.zzw) <= 0) {
                return true;
            }
            return zzg(i3, i2, zzabVar.zzx);
        }
        int i4 = zzabVar.zzE;
        if (i4 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzj("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzj("sampleRate.aCaps");
                return false;
            } else if (!audioCapabilities.isSampleRateSupported(i4)) {
                zzj("sampleRate.support, " + i4);
                return false;
            }
        }
        int i5 = zzabVar.zzD;
        if (i5 == -1) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
        if (codecCapabilities2 == null) {
            zzj("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
        if (audioCapabilities2 == null) {
            zzj("channelCount.aCaps");
            return false;
        }
        String str = this.zza;
        String str2 = this.zzb;
        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((zzei.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i = 6;
            } else if ("audio/eac3".equals(str2)) {
                i = 16;
            } else {
                i = 30;
            }
            zzdo.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + C21114v8.C21123i.f54139e);
            maxInputChannelCount = i;
        }
        if (maxInputChannelCount >= i5) {
            return true;
        }
        zzj("channelCount.support, " + i5);
        return false;
    }

    public final boolean zzf(zzab zzabVar) {
        if (this.zzi) {
            return this.zze;
        }
        int i = zzta.zza;
        Pair zza = zzcy.zza(zzabVar);
        if (zza != null && ((Integer) zza.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean zzg(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzei.zza >= 29) {
            int zza = zzsi.zza(videoCapabilities, i, i2, d);
            if (zza != 2) {
                if (zza == 1) {
                    zzj("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                    return false;
                }
            }
            return true;
        }
        if (!zzk(videoCapabilities, i, i2, d)) {
            if (i < i2 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) || !"mcv5a".equals(zzei.zzb)) && zzk(videoCapabilities, i2, i, d))) {
                zzdo.zzb("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d) + "] [" + this.zza + ", " + this.zzb + "] [" + zzei.zze + C21114v8.C21123i.f54139e);
            } else {
                zzj("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return codecProfileLevelArr;
    }
}
