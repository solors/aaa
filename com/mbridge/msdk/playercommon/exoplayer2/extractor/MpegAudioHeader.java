package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;

/* loaded from: classes6.dex */
public final class MpegAudioHeader {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public int bitrate;
    public int channels;
    public int frameSize;
    public String mimeType;
    public int sampleRate;
    public int samplesPerFrame;
    public int version;
    private static final String[] MIME_TYPE_BY_LAYER = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] SAMPLING_RATE_V1 = {44100, 48000, 32000};
    private static final int[] BITRATE_V1_L1 = {32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};
    private static final int[] BITRATE_V2_L1 = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};
    private static final int[] BITRATE_V1_L2 = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};
    private static final int[] BITRATE_V1_L3 = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};
    private static final int[] BITRATE_V2 = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    public static int getFrameSize(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = SAMPLING_RATE_V1[i5];
        if (i2 == 2) {
            i8 /= 2;
        } else if (i2 == 0) {
            i8 /= 4;
        }
        int i9 = (i >>> 9) & 1;
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = BITRATE_V1_L1[i4 - 1];
            } else {
                i7 = BITRATE_V2_L1[i4 - 1];
            }
            return (((i7 * 12000) / i8) + i9) * 4;
        }
        if (i2 == 3) {
            if (i3 == 2) {
                i6 = BITRATE_V1_L2[i4 - 1];
            } else {
                i6 = BITRATE_V1_L3[i4 - 1];
            }
        } else {
            i6 = BITRATE_V2[i4 - 1];
        }
        int i10 = 144000;
        if (i2 == 3) {
            return ((i6 * 144000) / i8) + i9;
        }
        if (i3 == 1) {
            i10 = DefaultOggSeeker.MATCH_RANGE;
        }
        return ((i10 * i6) / i8) + i9;
    }

    public static boolean populateHeader(int i, MpegAudioHeader mpegAudioHeader) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i11 = SAMPLING_RATE_V1[i5];
        if (i2 == 2) {
            i11 /= 2;
        } else if (i2 == 0) {
            i11 /= 4;
        }
        int i12 = i11;
        int i13 = (i >>> 9) & 1;
        if (i3 == 3) {
            if (i2 == 3) {
                i6 = BITRATE_V1_L1[i4 - 1];
            } else {
                i6 = BITRATE_V2_L1[i4 - 1];
            }
            i9 = (((i6 * 12000) / i12) + i13) * 4;
            i8 = 384;
        } else {
            int i14 = 1152;
            if (i2 == 3) {
                if (i3 == 2) {
                    i6 = BITRATE_V1_L2[i4 - 1];
                } else {
                    i6 = BITRATE_V1_L3[i4 - 1];
                }
            } else {
                i6 = BITRATE_V2[i4 - 1];
                if (i3 == 1) {
                    i14 = 576;
                }
                if (i3 == 1) {
                    i7 = DefaultOggSeeker.MATCH_RANGE;
                    i8 = i14;
                    i9 = ((i7 * i6) / i12) + i13;
                }
            }
            i7 = 144000;
            i8 = i14;
            i9 = ((i7 * i6) / i12) + i13;
        }
        String str = MIME_TYPE_BY_LAYER[3 - i3];
        if (((i >> 6) & 3) == 3) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        mpegAudioHeader.setValues(i2, str, i9, i12, i10, i6 * 1000, i8);
        return true;
    }

    private void setValues(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.version = i;
        this.mimeType = str;
        this.frameSize = i2;
        this.sampleRate = i3;
        this.channels = i4;
        this.bitrate = i5;
        this.samplesPerFrame = i6;
    }
}
