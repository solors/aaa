package com.facebook.ads.redexgen.p370X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.X1 */
/* loaded from: assets/audience_network.dex */
public final class C12855X1 implements InterfaceC11872Gz {
    public static byte[] A05;
    public static String[] A06 = {"aq4IliIWDDncC3AYch6yko", "K", "7WihoyLotnvTQHZz2idft8ZXTVKY4zx7", "gI1erRXXD147Xe9Gq10kF", "pKYfB4E7PRZj7oqyTjC", "XBwEDGx62tHxzBOzLhjigx6FF1XIbcg4", "Gmgd", "152cUSbY7JMQW"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;
    public final InterfaceC11894HL<? super C12855X1> A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{15};
    }

    static {
        A01();
    }

    public C12855X1() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public C12855X1(InterfaceC11894HL<? super C12855X1> interfaceC11894HL) {
        this.A04 = interfaceC11894HL;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final Uri A8c() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final long AEE(C11876H3 c11876h3) throws C11879H6 {
        try {
            this.A01 = c11876h3.A04;
            this.A02 = new RandomAccessFile(c11876h3.A04.getPath(), A00(0, 1, 46));
            this.A02.seek(c11876h3.A03);
            this.A00 = c11876h3.A02 == -1 ? this.A02.length() - c11876h3.A03 : c11876h3.A02;
            if (this.A00 >= 0) {
                this.A03 = true;
                if (this.A04 != null) {
                    InterfaceC11894HL<? super C12855X1> interfaceC11894HL = this.A04;
                    if (A06[3].length() == 0) {
                        throw new RuntimeException();
                    }
                    A06[4] = "kaTpwzrFHguK6C5ilEAmkkkNX";
                    interfaceC11894HL.ADs(this, c11876h3);
                }
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C11879H6(e);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final void close() throws C11879H6 {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e) {
                throw new C11879H6(e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                if (this.A04 != null) {
                    this.A04.ADr(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final int read(byte[] bArr, int i, int i2) throws C11879H6 {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            if (A06[3].length() != 0) {
                A06[3] = "SS1vrryUNPm";
                return -1;
            }
            throw new RuntimeException();
        }
        try {
            int read = this.A02.read(bArr, i, (int) Math.min(this.A00, i2));
            if (read > 0) {
                this.A00 -= read;
                if (this.A04 != null) {
                    this.A04.ABS(this, read);
                }
            }
            return read;
        } catch (IOException e) {
            throw new C11879H6(e);
        }
    }
}
