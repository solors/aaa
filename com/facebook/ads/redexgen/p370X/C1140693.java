package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.SignedBytes;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.93 */
/* loaded from: assets/audience_network.dex */
public final class C1140693 implements Closeable {
    public static byte[] A03;
    public static String[] A04 = {"t11y9BgCyC0qQkG3mYUymtEDmEyKV4hc", "7ce9erzyyNrxlxET0sEMje4IREmhCp4i", "4ENs57XqgWmyHBJWN23MJhXXMCaaLz6e", "dr2xNsWDGhc5qlQtklfNqpJl8", "q35Tkz9qNjTEzRlngCIyL7KdK6wO30wH", "vPiuZupP6WnF44bZrTOwEQFi3wuHod3P", "O8XwwgRKslyLqfo5O4ZQvZ7SdPHYsu5Q", ""};
    public C1140794 A00;
    public boolean A01;
    public final RandomAccessFile A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{26, 76, 73, 74, 70, 73, 29, SignedBytes.MAX_POWER_OF_TWO, 67, 60, -9, SignedBytes.MAX_POWER_OF_TWO, 74, -9, 56, 67, 73, 60, 56, 59, 80, -9, 58, 67, 70, 74, 60, 59, 39, 76, 84, 63, 74, 71, 66, -2, 78, 77, 81, 71, 82, 71, 77, 76, 24, -2, 6, 3, 66, 10, 3, 66, 7, 32, 37, 33};
    }

    static {
        A02();
    }

    public C1140693(File file) throws IOException {
        this.A02 = new RandomAccessFile(file, A00(53, 3, 59));
        if (this.A02.length() != 8) {
            this.A02.setLength(8L);
            this.A00 = new C1140794(0, 0);
            A01();
            return;
        }
        int readInt = this.A02.readInt();
        int index = this.A02.readInt();
        if (readInt < 0 || index < 0) {
            readInt = 0;
            index = 0;
        }
        this.A00 = new C1140794(readInt, index);
    }

    private void A01() throws IOException {
        this.A02.seek(0L);
        this.A02.writeInt(this.A00.A02());
        this.A02.writeInt(this.A00.A03());
        this.A02.getFD().sync();
    }

    public final C1140794 A03() throws IOException {
        if (!this.A01) {
            return this.A00;
        }
        throw new IOException(A00(0, 28, 100));
    }

    public final void A04(C1140794 c1140794) throws IOException {
        if (!this.A01) {
            int A02 = c1140794.A02();
            String[] strArr = A04;
            if (strArr[6].charAt(3) == strArr[1].charAt(3)) {
                throw new RuntimeException();
            }
            A04[2] = "wZJ8kWRxyYeI3b89D2ZfjwX8MEoFWOZU";
            if (A02 >= 0 && c1140794.A03() >= 0) {
                this.A00 = c1140794;
                A01();
                return;
            }
            throw new IOException(String.format(Locale.US, A00(28, 25, 107), Integer.valueOf(c1140794.A02()), Integer.valueOf(c1140794.A03())));
        }
        throw new IOException(A00(0, 28, 100));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        this.A02.close();
    }
}
