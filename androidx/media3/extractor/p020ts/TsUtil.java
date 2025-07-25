package androidx.media3.extractor.p020ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* renamed from: androidx.media3.extractor.ts.TsUtil */
/* loaded from: classes2.dex */
public final class TsUtil {
    private TsUtil() {
    }

    public static int findSyncBytePosition(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static boolean isStartOfTsPacket(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * 188) + i3;
            if (i6 >= i && i6 < i2 && bArr[i6] == 71) {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            } else {
                i4 = 0;
            }
        }
        return false;
    }

    public static long readPcrFromPacket(ParsableByteArray parsableByteArray, int i, int i2) {
        boolean z;
        parsableByteArray.setPosition(i);
        if (parsableByteArray.bytesLeft() < 5) {
            return -9223372036854775807L;
        }
        int readInt = parsableByteArray.readInt();
        if ((8388608 & readInt) != 0 || ((2096896 & readInt) >> 8) != i2) {
            return -9223372036854775807L;
        }
        boolean z2 = true;
        if ((readInt & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && parsableByteArray.readUnsignedByte() >= 7 && parsableByteArray.bytesLeft() >= 7) {
            if ((parsableByteArray.readUnsignedByte() & 16) != 16) {
                z2 = false;
            }
            if (z2) {
                byte[] bArr = new byte[6];
                parsableByteArray.readBytes(bArr, 0, 6);
                return readPcrValueFromPcrBytes(bArr);
            }
        }
        return -9223372036854775807L;
    }

    private static long readPcrValueFromPcrBytes(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
