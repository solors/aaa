package net.pubnative.lite.sdk.vpaid.helpers;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class AndroidBmpUtil {
    private final int BMP_WIDTH_OF_TIMES = 4;
    private final int BYTE_PER_PIXEL = 3;

    private boolean isBitmapWidthLastPixcel(int i, int i2) {
        if (i2 > 0 && i2 % (i - 1) == 0) {
            return true;
        }
        return false;
    }

    private boolean isBmpWidth4Times(int i) {
        if (i % 4 > 0) {
            return true;
        }
        return false;
    }

    private byte[] write24BitForPixcel(int i) throws IOException {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((i & 16711680) >> 16)};
    }

    private byte[] writeInt(int i) throws IOException {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((16711680 & i) >> 16), (byte) ((i & ViewCompat.MEASURED_STATE_MASK) >> 24)};
    }

    private byte[] writeShort(short s) throws IOException {
        return new byte[]{(byte) (s & 255), (byte) ((s & 65280) >> 8)};
    }

    public boolean save(Bitmap bitmap, String str) {
        int i;
        boolean z;
        byte[] bArr;
        if (bitmap == null || str == null) {
            return false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (isBmpWidth4Times(width)) {
            i = 4 - (width % 4);
            int i2 = i * 3;
            byte[] bArr2 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                bArr2[i3] = -1;
            }
            bArr = bArr2;
            z = true;
        } else {
            i = 0;
            z = false;
            bArr = null;
        }
        int i4 = width * height;
        int[] iArr = new int[i4];
        int i5 = (i4 * 3) + (i * height * 3);
        int i6 = i5 + 54;
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        ByteBuffer allocate = ByteBuffer.allocate(i6);
        try {
            allocate.put((byte) 66);
            allocate.put((byte) 77);
            allocate.put(writeInt(i6));
            allocate.put(writeShort((short) 0));
            allocate.put(writeShort((short) 0));
            allocate.put(writeInt(54));
            allocate.put(writeInt(40));
            allocate.put(writeInt(width));
            allocate.put(writeInt(height));
            allocate.put(writeShort((short) 1));
            allocate.put(writeShort((short) 24));
            allocate.put(writeInt(0));
            allocate.put(writeInt(i5));
            allocate.put(writeInt(0));
            allocate.put(writeInt(0));
            allocate.put(writeInt(0));
            allocate.put(writeInt(0));
            while (height > 0) {
                int i7 = height * width;
                for (int i8 = (height - 1) * width; i8 < i7; i8++) {
                    allocate.put(write24BitForPixcel(iArr[i8]));
                    if (z && isBitmapWidthLastPixcel(width, i8)) {
                        allocate.put(bArr);
                    }
                }
                height--;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(allocate.array());
            fileOutputStream.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
