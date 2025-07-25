package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class MpegAudioUtil {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public static final int MAX_RATE_BYTES_PER_SECOND = 40000;

    /* renamed from: a */
    private static final String[] f32556a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    private static final int[] f32557b = {44100, 48000, 32000};

    /* renamed from: c */
    private static final int[] f32558c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    private static final int[] f32559d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    private static final int[] f32560e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    private static final int[] f32561f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    private static final int[] f32562g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* loaded from: classes4.dex */
    public static final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;
        @Nullable
        public String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        public boolean setForHeaderData(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            if (!MpegAudioUtil.m74934k(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.version = i2;
            this.mimeType = MpegAudioUtil.f32556a[3 - i3];
            int i8 = MpegAudioUtil.f32557b[i5];
            this.sampleRate = i8;
            int i9 = 2;
            if (i2 == 2) {
                this.sampleRate = i8 / 2;
            } else if (i2 == 0) {
                this.sampleRate = i8 / 4;
            }
            int i10 = (i >>> 9) & 1;
            this.samplesPerFrame = MpegAudioUtil.m74935j(i2, i3);
            if (i3 == 3) {
                if (i2 == 3) {
                    i7 = MpegAudioUtil.f32558c[i4 - 1];
                } else {
                    i7 = MpegAudioUtil.f32559d[i4 - 1];
                }
                this.bitrate = i7;
                this.frameSize = (((i7 * 12) / this.sampleRate) + i10) * 4;
            } else {
                int i11 = 144;
                if (i2 == 3) {
                    if (i3 == 2) {
                        i6 = MpegAudioUtil.f32560e[i4 - 1];
                    } else {
                        i6 = MpegAudioUtil.f32561f[i4 - 1];
                    }
                    this.bitrate = i6;
                    this.frameSize = ((i6 * 144) / this.sampleRate) + i10;
                } else {
                    int i12 = MpegAudioUtil.f32562g[i4 - 1];
                    this.bitrate = i12;
                    if (i3 == 1) {
                        i11 = 72;
                    }
                    this.frameSize = ((i11 * i12) / this.sampleRate) + i10;
                }
            }
            if (((i >> 6) & 3) == 3) {
                i9 = 1;
            }
            this.channels = i9;
            return true;
        }
    }

    private MpegAudioUtil() {
    }

    public static int getFrameSize(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!m74934k(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = f32557b[i5];
        if (i2 == 2) {
            i8 /= 2;
        } else if (i2 == 0) {
            i8 /= 4;
        }
        int i9 = (i >>> 9) & 1;
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = f32558c[i4 - 1];
            } else {
                i7 = f32559d[i4 - 1];
            }
            return (((i7 * 12) / i8) + i9) * 4;
        }
        if (i2 == 3) {
            if (i3 == 2) {
                i6 = f32560e[i4 - 1];
            } else {
                i6 = f32561f[i4 - 1];
            }
        } else {
            i6 = f32562g[i4 - 1];
        }
        int i10 = 144;
        if (i2 == 3) {
            return ((i6 * 144) / i8) + i9;
        }
        if (i3 == 1) {
            i10 = 72;
        }
        return ((i10 * i6) / i8) + i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static int m74935j(int i, int i2) {
        if (i2 != 1) {
            if (i2 == 2) {
                return 1152;
            }
            if (i2 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else if (i == 3) {
            return 1152;
        } else {
            return 576;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static boolean m74934k(int i) {
        if ((i & (-2097152)) == -2097152) {
            return true;
        }
        return false;
    }

    public static int parseMpegAudioFrameSampleCount(int i) {
        int i2;
        int i3;
        if (!m74934k(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m74935j(i2, i3);
    }
}
