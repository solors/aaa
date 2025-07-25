package com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atntntntanaan;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atntntntanaan.atnntnannta */
/* loaded from: classes8.dex */
public class C32817atnntnannta extends FilterInputStream {
    private static final char[] atnntnannta = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static final int[] atntntntanaan = new int[128];
    private int atnaaata;
    private int atntaanaa;

    static {
        for (int i = 0; i < 64; i++) {
            atntntntanaan[atnntnannta[i]] = i;
        }
    }

    public C32817atnntnannta(InputStream inputStream) {
        super(inputStream);
    }

    public static String atnntnannta(String str) {
        return new String(atntntntanaan(str));
    }

    public static byte[] atntntntanaan(String str) {
        byte[] bArr = new byte[0];
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        C32817atnntnannta c32817atnntnannta = new C32817atnntnannta(new ByteArrayInputStream(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) (bArr.length * 0.67d));
        try {
            byte[] bArr2 = new byte[4096];
            while (true) {
                int read = c32817atnntnannta.read(bArr2);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read;
        do {
            read = ((FilterInputStream) this).in.read();
            if (read == -1) {
                return -1;
            }
        } while (Character.isWhitespace((char) read));
        int i = this.atntaanaa + 1;
        this.atntaanaa = i;
        if (read == 61) {
            return -1;
        }
        int i2 = atntntntanaan[read];
        int i3 = (i - 1) % 4;
        if (i3 == 0) {
            this.atnaaata = i2 & 63;
            return read();
        } else if (i3 == 1) {
            int i4 = ((this.atnaaata << 2) + (i2 >> 4)) & 255;
            this.atnaaata = i2 & 15;
            return i4;
        } else if (i3 == 2) {
            int i5 = ((this.atnaaata << 4) + (i2 >> 2)) & 255;
            this.atnaaata = i2 & 3;
            return i5;
        } else if (i3 == 3) {
            return ((this.atnaaata << 6) + i2) & 255;
        } else {
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr.length < (i2 + i) - 1) {
            throw new IOException("The input buffer is too small: " + i2 + " bytes requested starting at offset " + i + " while the buffer  is only " + bArr.length + " bytes long.");
        }
        int i3 = 0;
        while (i3 < i2) {
            int read = read();
            if (read == -1 && i3 == 0) {
                return -1;
            }
            if (read == -1) {
                break;
            }
            bArr[i + i3] = (byte) read;
            i3++;
        }
        return i3;
    }
}
