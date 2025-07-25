package com.facebook.ads.internal.exoplayer2.thirdparty.offline;

import android.net.Uri;
import com.facebook.ads.redexgen.p370X.C11710E4;
import com.facebook.ads.redexgen.p370X.C11723EQ;
import com.facebook.ads.redexgen.p370X.InterfaceC11722EP;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class DownloadAction {
    public static byte[] A05;
    public final int A00;
    public final Uri A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{81, 93, 34, 3, 76, 8, 9, 31, 9, 30, 5, 13, 0, 5, 22, 9, 30, 76, 10, 3, 25, 2, 8, 76, 10, 3, 30, 86};
    }

    public abstract InterfaceC11722EP A07(C11723EQ c11723eq);

    public abstract void A08(DataOutputStream dataOutputStream) throws IOException;

    public abstract boolean A09(DownloadAction downloadAction);

    /* loaded from: assets/audience_network.dex */
    public static abstract class Deserializer {
        public final int A00;
        public final String A01;

        public abstract DownloadAction A01(int i, DataInputStream dataInputStream) throws IOException;

        public Deserializer(String str, int i) {
            this.A01 = str;
            this.A00 = i;
        }
    }

    public DownloadAction(String str, int i, Uri uri, boolean z, byte[] bArr) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = uri;
        this.A03 = z;
        this.A04 = bArr == null ? new byte[0] : bArr;
    }

    public static DownloadAction A00(Deserializer[] deserializerArr, InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String readUTF = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        for (Deserializer deserializer : deserializerArr) {
            if (readUTF.equals(deserializer.A01) && deserializer.A00 >= readInt) {
                return deserializer.A01(readInt, dataInputStream);
            }
        }
        String type = A01(2, 26, 118) + readUTF + A01(0, 2, 103) + readInt;
        throw new C11710E4(type);
    }

    public static void A03(DownloadAction downloadAction, OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(downloadAction.A02);
        dataOutputStream.writeInt(downloadAction.A00);
        downloadAction.A08(dataOutputStream);
        dataOutputStream.flush();
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadAction downloadAction = (DownloadAction) obj;
        return this.A02.equals(downloadAction.A02) && this.A00 == downloadAction.A00 && this.A01.equals(downloadAction.A01) && this.A03 == downloadAction.A03 && Arrays.equals(this.A04, downloadAction.A04);
    }

    public int hashCode() {
        int result = this.A01.hashCode();
        int i = result * 31;
        int result2 = this.A03 ? 1 : 0;
        return ((i + result2) * 31) + Arrays.hashCode(this.A04);
    }
}
