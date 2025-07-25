package com.facebook.ads.redexgen.p370X;

import android.util.Pair;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hj */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11918Hj {
    public static byte[] A00;
    public static String[] A01 = {"hgkv3K5D7LUdfYtfghp3vny7W6PJ75x1", "5OxuqdKIp2nP9LR2zHzFDLENZioxECvO", "CAnbNdwyZNAIqQCRG3atCxjTS11tGtep", "nI9Q0c0eZRrT7faNpsYhcG", "wvdDgPhEetLkfVyUXU5OqcDmpJOXplEG", "lkGhosMNtvxo3OcAc0XPmTZNlf43dohM", "7WCwK6uLOSx7G5D82H1RtAFjcLrdRlkB", "N3LI1K8U1EAyrNNyoXaRNfYZq4euqJJf"};
    public static final byte[] A02;
    public static final int[] A03;
    public static final int[] A04;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[3].length() == 9) {
                throw new RuntimeException();
            }
            A01[0] = "te1WrCSgggsWDMNxGrks3ULWi6FlwITL";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
            i4++;
        }
    }

    public static void A05() {
        A00 = new byte[]{53, 14, 19, 21, 16, 16, 15, 18, 20, 5, 4, SignedBytes.MAX_POWER_OF_TWO, 1, 21, 4, 9, 15, SignedBytes.MAX_POWER_OF_TWO, 15, 2, 10, 5, 3, 20, SignedBytes.MAX_POWER_OF_TWO, 20, 25, 16, 5, 90, SignedBytes.MAX_POWER_OF_TWO, 113, 74, 87, 81, 84, 84, 75, 86, 80, 65, SignedBytes.MAX_POWER_OF_TWO, 4, 65, 84, 103, 75, 74, 66, 77, 67, 30, 4};
    }

    static {
        A05();
        A02 = new byte[]{0, 0, 0, 1};
        A04 = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        A03 = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int A00(C11938I3 c11938i3) {
        int A042 = c11938i3.A04(5);
        if (A042 == 31) {
            int audioObjectType = c11938i3.A04(6);
            return audioObjectType + 32;
        }
        return A042;
    }

    public static int A01(C11938I3 c11938i3) {
        int A042 = c11938i3.A04(4);
        if (A042 == 15) {
            int frequencyIndex = c11938i3.A04(24);
            return frequencyIndex;
        }
        AbstractC11914Hf.A03(A042 < 13);
        int frequencyIndex2 = A04[A042];
        return frequencyIndex2;
    }

    public static Pair<Integer, Integer> A02(C11938I3 c11938i3, boolean z) throws C11464A0 {
        int A002 = A00(c11938i3);
        int channelConfiguration = A01(c11938i3);
        int sampleRate = c11938i3.A04(4);
        if (A002 == 5 || A002 == 29) {
            channelConfiguration = A01(c11938i3);
            A002 = A00(c11938i3);
            if (A002 == 22) {
                sampleRate = c11938i3.A04(4);
            }
        }
        if (z) {
            switch (A002) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    A06(c11938i3, A002, sampleRate);
                    switch (A002) {
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            int epConfig = c11938i3.A04(2);
                            if (epConfig == 2 || epConfig == 3) {
                                throw new C11464A0(A04(31, 22, 16) + epConfig);
                            }
                            break;
                    }
                case 5:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 18:
                default:
                    throw new C11464A0(A04(0, 31, 84) + A002);
            }
        }
        int channelCount = A03[sampleRate];
        AbstractC11914Hf.A03(channelCount != -1);
        return Pair.create(Integer.valueOf(channelConfiguration), Integer.valueOf(channelCount));
    }

    public static Pair<Integer, Integer> A03(byte[] bArr) throws C11464A0 {
        return A02(new C11938I3(bArr), false);
    }

    public static void A06(C11938I3 c11938i3, int i, int i2) {
        c11938i3.A08(1);
        if (c11938i3.A0F()) {
            c11938i3.A08(14);
        }
        boolean dependsOnCoreDecoder = c11938i3.A0F();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                c11938i3.A08(3);
            }
            if (dependsOnCoreDecoder) {
                if (i == 22) {
                    c11938i3.A08(16);
                }
                if (A01[1].charAt(24) != 'Z') {
                    throw new RuntimeException();
                }
                A01[3] = "4px";
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    c11938i3.A08(3);
                }
                c11938i3.A08(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[] A07(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static byte[] A08(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[A02.length + i2];
        byte[] bArr3 = A02;
        byte[] nalUnit = A02;
        System.arraycopy(bArr3, 0, bArr2, 0, nalUnit.length);
        byte[] nalUnit2 = A02;
        System.arraycopy(bArr, i, bArr2, nalUnit2.length, i2);
        return bArr2;
    }
}
