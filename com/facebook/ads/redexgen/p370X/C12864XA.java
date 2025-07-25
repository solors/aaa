package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.XA */
/* loaded from: assets/audience_network.dex */
public final class C12864XA implements InterfaceC11872Gz {
    public static byte[] A06;
    public static String[] A07 = {"dBAoZLypinVieBiN6OmOrWglm0mkw7Th", "n", "cmJJD6tZYhQ1wcbsHE5vIxhw0qQZwo02", "X8ZVpNsLQVQ2kLhXMp5QNPazaYxfqolh", "NaudB7RRuuobxIxQA39JuxlozKEnLkCL", "rXbUFyh56idg3rSuJ4tJQtpYdGaFTF2y", "zDvFriMjZpoGqxlueWcDzXzIguNkUtNl", "sVEOjn8EJonDcZfN7QRvAJKGT0zqZa3R"};
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;
    public final InterfaceC11894HL<? super C12864XA> A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 101;
            if (A07[1].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[0] = "n6owUrHV0UlTalMNOYWSyyNAru5hM8Vx";
            strArr[7] = "gByYkjtEEdTZs51Nu13z1IN8evpdXlXB";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {106, 90, 20, 27, 17, 7, 26, 28, 17, 42, 20, 6, 6, 16, 1, 90};
        if (A07[6].charAt(24) != 'g') {
            throw new RuntimeException();
        }
        A07[4] = "9ywXzXhCM32rn3RSs826HxV6thYomWUI";
        A06 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final long AEE(C11876H3 c11876h3) throws C11865Gs {
        try {
            this.A01 = c11876h3.A04;
            String path = this.A01.getPath();
            if (path.startsWith(A00(1, 15, 16))) {
                path = path.substring(15);
            } else if (path.startsWith(A00(0, 1, 32))) {
                path = path.substring(1);
            }
            this.A02 = this.A04.open(path, 1);
            if (this.A02.skip(c11876h3.A03) >= c11876h3.A03) {
                if (c11876h3.A02 != -1) {
                    this.A00 = c11876h3.A02;
                } else {
                    this.A00 = this.A02.available();
                    if (this.A00 == 2147483647L) {
                        this.A00 = -1L;
                    }
                }
                this.A03 = true;
                if (this.A05 != null) {
                    this.A05.ADs(this, c11876h3);
                }
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C11865Gs(e);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.AssetDataSource> */
    public C12864XA(Context context, InterfaceC11894HL<? super C12864XA> interfaceC11894HL) {
        this.A04 = context.getAssets();
        this.A05 = interfaceC11894HL;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final Uri A8c() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final void close() throws C11865Gs {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e) {
                throw new C11865Gs(e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                if (this.A05 != null) {
                    this.A05.ADr(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11872Gz
    public final int read(byte[] bArr, int i, int i2) throws C11865Gs {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        try {
            if (this.A00 != -1) {
                i2 = (int) Math.min(this.A00, i2);
            }
            int read = this.A02.read(bArr, i, i2);
            if (read == -1) {
                int bytesRead = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
                if (bytesRead == 0) {
                    return -1;
                }
                throw new C11865Gs(new EOFException());
            }
            int bytesRead2 = (this.A00 > (-1L) ? 1 : (this.A00 == (-1L) ? 0 : -1));
            if (bytesRead2 != 0) {
                this.A00 -= read;
            }
            if (this.A05 != null) {
                this.A05.ABS(this, read);
            }
            return read;
        } catch (IOException e) {
            throw new C11865Gs(e);
        }
    }
}
