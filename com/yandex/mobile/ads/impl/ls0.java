package com.yandex.mobile.ads.impl;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C21114v8;
import com.yandex.mobile.ads.impl.ts0;

/* loaded from: classes8.dex */
public final class ls0 {

    /* renamed from: i */
    private static final ms0 f81918i = ii1.m33269e();

    /* renamed from: a */
    public final String f81919a;

    /* renamed from: b */
    public final String f81920b;

    /* renamed from: c */
    public final String f81921c;
    @Nullable

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f81922d;

    /* renamed from: e */
    public final boolean f81923e;

    /* renamed from: f */
    public final boolean f81924f;

    /* renamed from: g */
    public final boolean f81925g;

    /* renamed from: h */
    private final boolean f81926h;

    @VisibleForTesting
    ls0(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        this.f81919a = (String) C30937nf.m31570a(str);
        this.f81920b = str2;
        this.f81921c = str3;
        this.f81922d = codecCapabilities;
        this.f81925g = z;
        this.f81923e = z2;
        this.f81924f = z3;
        this.f81926h = rx0.m29897f(str2);
    }

    @Nullable
    @RequiresApi(21)
    /* renamed from: a */
    public final Point m32204a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f81922d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = y32.f88010a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    /* renamed from: b */
    public final boolean m32198b(v90 v90Var) {
        if (this.f81926h) {
            return this.f81923e;
        }
        Pair<Integer, Integer> m29060b = ts0.m29060b(v90Var);
        if (m29060b != null && ((Integer) m29060b.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f81919a;
    }

    /* renamed from: a */
    public final C30585ix m32201a(v90 v90Var, v90 v90Var2) {
        int i = !y32.m27076a(v90Var.f86623m, v90Var2.f86623m) ? 8 : 0;
        if (this.f81926h) {
            if (v90Var.f86631u != v90Var2.f86631u) {
                i |= 1024;
            }
            if (!this.f81923e && (v90Var.f86628r != v90Var2.f86628r || v90Var.f86629s != v90Var2.f86629s)) {
                i |= 512;
            }
            if (!y32.m27076a(v90Var.f86635y, v90Var2.f86635y)) {
                i |= 2048;
            }
            String str = this.f81919a;
            String str2 = y32.f88013d;
            ms0 ms0Var = f81918i;
            if (str2.startsWith(ms0Var.m31859i()) && ms0Var.m31861g().equals(str) && !v90Var.m28483a(v90Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new C30585ix(this.f81919a, v90Var, v90Var2, v90Var.m28483a(v90Var2) ? 3 : 2, 0);
            }
        } else {
            if (v90Var.f86636z != v90Var2.f86636z) {
                i |= 4096;
            }
            if (v90Var.f86605A != v90Var2.f86605A) {
                i |= 8192;
            }
            if (v90Var.f86606B != v90Var2.f86606B) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f81920b)) {
                Pair<Integer, Integer> m29060b = ts0.m29060b(v90Var);
                Pair<Integer, Integer> m29060b2 = ts0.m29060b(v90Var2);
                if (m29060b != null && m29060b2 != null) {
                    int intValue = ((Integer) m29060b.first).intValue();
                    int intValue2 = ((Integer) m29060b2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C30585ix(this.f81919a, v90Var, v90Var2, 3, 0);
                    }
                }
            }
            if (!v90Var.m28483a(v90Var2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.f81920b)) {
                i |= 2;
            }
            if (i == 0) {
                return new C30585ix(this.f81919a, v90Var, v90Var2, 1, 0);
            }
        }
        return new C30585ix(this.f81919a, v90Var, v90Var2, 0, i);
    }

    /* renamed from: a */
    public final boolean m32202a(v90 v90Var) throws ts0.C31480b {
        int i;
        Pair<Integer, Integer> m29060b;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (this.f81920b.equals(v90Var.f86623m) || this.f81920b.equals(ts0.m29066a(v90Var))) {
            int i2 = 16;
            if (v90Var.f86620j != null && (m29060b = ts0.m29060b(v90Var)) != null) {
                int intValue = ((Integer) m29060b.first).intValue();
                int intValue2 = ((Integer) m29060b.second).intValue();
                int i3 = 8;
                if ("video/dolby-vision".equals(v90Var.f86623m)) {
                    if ("video/avc".equals(this.f81920b)) {
                        intValue2 = 0;
                        intValue = 8;
                    } else if ("video/hevc".equals(this.f81920b)) {
                        intValue2 = 0;
                        intValue = 2;
                    }
                }
                if (this.f81926h || intValue == 42) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.f81922d;
                    if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (y32.f88010a <= 23 && "video/x-vnd.on2.vp9".equals(this.f81920b) && codecProfileLevelArr.length == 0) {
                        MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f81922d;
                        int intValue3 = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                        if (intValue3 >= 180000000) {
                            i3 = 1024;
                        } else if (intValue3 >= 120000000) {
                            i3 = 512;
                        } else if (intValue3 >= 60000000) {
                            i3 = 256;
                        } else if (intValue3 >= 30000000) {
                            i3 = 128;
                        } else if (intValue3 >= 18000000) {
                            i3 = 64;
                        } else if (intValue3 >= 12000000) {
                            i3 = 32;
                        } else if (intValue3 >= 7200000) {
                            i3 = 16;
                        } else if (intValue3 < 3600000) {
                            i3 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                        }
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel.profile = 1;
                        codecProfileLevel.level = i3;
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                        if (codecProfileLevel2.profile == intValue && codecProfileLevel2.level >= intValue2) {
                            if ("video/hevc".equals(this.f81920b) && 2 == intValue) {
                                ms0 ms0Var = f81918i;
                                String m31858j = ms0Var.m31858j();
                                String str = y32.f88011b;
                                if (!m31858j.equals(str) && !ms0Var.m31867a().equals(str)) {
                                }
                            }
                        }
                    }
                    m32200a("codec.profileLevel, " + v90Var.f86620j + ", " + this.f81921c);
                    return false;
                }
            }
            if (this.f81926h) {
                int i4 = v90Var.f86628r;
                if (i4 <= 0 || (i = v90Var.f86629s) <= 0) {
                    return true;
                }
                if (y32.f88010a >= 21) {
                    return m32203a(i4, i, v90Var.f86630t);
                }
                boolean z = i4 * i <= ts0.m29074a();
                if (!z) {
                    m32200a("legacyFrameSize, " + v90Var.f86628r + "x" + v90Var.f86629s);
                }
                return z;
            }
            int i5 = y32.f88010a;
            if (i5 >= 21) {
                int i6 = v90Var.f86605A;
                if (i6 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f81922d;
                    if (codecCapabilities3 == null) {
                        m32200a("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        m32200a("sampleRate.aCaps");
                        return false;
                    } else if (!audioCapabilities.isSampleRateSupported(i6)) {
                        m32200a(C31736wd.m27978a("sampleRate.support, ", i6));
                        return false;
                    }
                }
                int i7 = v90Var.f86636z;
                if (i7 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities4 = this.f81922d;
                    if (codecCapabilities4 == null) {
                        m32200a("channelCount.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities4.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        m32200a("channelCount.aCaps");
                        return false;
                    }
                    String str2 = this.f81919a;
                    String str3 = this.f81920b;
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((i5 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str3) && !"audio/3gpp".equals(str3) && !"audio/amr-wb".equals(str3) && !"audio/mp4a-latm".equals(str3) && !"audio/vorbis".equals(str3) && !"audio/opus".equals(str3) && !"audio/raw".equals(str3) && !"audio/flac".equals(str3) && !"audio/g711-alaw".equals(str3) && !"audio/g711-mlaw".equals(str3) && !"audio/gsm".equals(str3))) {
                        if ("audio/ac3".equals(str3)) {
                            i2 = 6;
                        } else if (!"audio/eac3".equals(str3)) {
                            i2 = 30;
                        }
                        gq0.m33792d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str2 + ", [" + maxInputChannelCount + " to " + i2 + C21114v8.C21123i.f54139e);
                        maxInputChannelCount = i2;
                    }
                    if (maxInputChannelCount < i7) {
                        m32200a(C31736wd.m27978a("channelCount.support, ", i7));
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @RequiresApi(21)
    /* renamed from: a */
    public final boolean m32203a(int i, int i2, double d) {
        boolean isSizeSupported;
        boolean isSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f81922d;
        if (codecCapabilities == null) {
            m32200a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m32200a("sizeAndRate.vCaps");
            return false;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = y32.f88010a;
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i4 = point.x;
        int i5 = point.y;
        int i6 = (d > (-1.0d) ? 1 : (d == (-1.0d) ? 0 : -1));
        if (i6 != 0 && d >= 1.0d) {
            isSizeSupported = videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
        } else {
            isSizeSupported = videoCapabilities.isSizeSupported(i4, i5);
        }
        if (!isSizeSupported) {
            if (i < i2) {
                String str = this.f81919a;
                ms0 ms0Var = f81918i;
                if (!ms0Var.m31860h().equals(str) || !ms0Var.m31866b().equals(y32.f88011b)) {
                    int widthAlignment2 = videoCapabilities.getWidthAlignment();
                    int heightAlignment2 = videoCapabilities.getHeightAlignment();
                    Point point2 = new Point((((i2 + widthAlignment2) - 1) / widthAlignment2) * widthAlignment2, (((i + heightAlignment2) - 1) / heightAlignment2) * heightAlignment2);
                    int i7 = point2.x;
                    int i8 = point2.y;
                    if (i6 != 0 && d >= 1.0d) {
                        isSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i7, i8, Math.floor(d));
                    } else {
                        isSizeSupported2 = videoCapabilities.isSizeSupported(i7, i8);
                    }
                    if (isSizeSupported2) {
                        gq0.m33798a("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d) + "] [" + this.f81919a + ", " + this.f81920b + "] [" + y32.f88014e + C21114v8.C21123i.f54139e);
                    }
                }
            }
            m32200a("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r1.m31865c().equals(r3) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r1.m31862f().equals(r8) == false) goto L17;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.ls0 m32199a(java.lang.String r8, java.lang.String r9, java.lang.String r10, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            com.yandex.mobile.ads.impl.ls0 r13 = new com.yandex.mobile.ads.impl.ls0
            r14 = 1
            r0 = 0
            if (r11 == 0) goto L47
            int r1 = com.yandex.mobile.ads.impl.y32.f88010a
            r2 = 19
            if (r1 < r2) goto L47
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L47
            r2 = 22
            if (r1 > r2) goto L45
            com.yandex.mobile.ads.impl.ms0 r1 = com.yandex.mobile.ads.impl.ls0.f81918i
            java.lang.String r2 = r1.m31864d()
            java.lang.String r3 = com.yandex.mobile.ads.impl.y32.f88013d
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L30
            java.lang.String r2 = r1.m31865c()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L45
        L30:
            java.lang.String r2 = r1.m31863e()
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L47
            java.lang.String r1 = r1.m31862f()
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L45
            goto L47
        L45:
            r6 = r14
            goto L48
        L47:
            r6 = r0
        L48:
            r1 = 21
            if (r11 == 0) goto L55
            int r2 = com.yandex.mobile.ads.impl.y32.f88010a
            if (r2 < r1) goto L55
            java.lang.String r2 = "tunneled-playback"
            r11.isFeatureSupported(r2)
        L55:
            if (r15 != 0) goto L68
            if (r11 == 0) goto L66
            int r15 = com.yandex.mobile.ads.impl.y32.f88010a
            if (r15 < r1) goto L66
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L66
            goto L68
        L66:
            r7 = r0
            goto L69
        L68:
            r7 = r14
        L69:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ls0.m32199a(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):com.yandex.mobile.ads.impl.ls0");
    }

    /* renamed from: a */
    public final boolean m32205a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (y32.f88010a >= 29 && "video/x-vnd.on2.vp9".equals(this.f81920b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f81922d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m32200a(String str) {
        gq0.m33798a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f81919a + ", " + this.f81920b + "] [" + y32.f88014e + C21114v8.C21123i.f54139e);
    }
}
