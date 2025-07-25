package com.zeus.gmc.sdk.mobileads.msa.adjump.common;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes8.dex */
public class Base64Encoder extends FilterOutputStream {
    private static final char[] jujujpjjp = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private int jjuuju;
    private int uppjpjj;

    public Base64Encoder(OutputStream outputStream) {
        super(outputStream);
    }

    public static String encode(String str) {
        byte[] bArr = new byte[0];
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        return encode(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = this.uppjpjj % 3;
        if (i == 1) {
            ((FilterOutputStream) this).out.write(jujujpjjp[(this.jjuuju << 4) & 63]);
            ((FilterOutputStream) this).out.write(61);
            ((FilterOutputStream) this).out.write(61);
        } else if (i == 2) {
            ((FilterOutputStream) this).out.write(jujujpjjp[(this.jjuuju << 2) & 63]);
            ((FilterOutputStream) this).out.write(61);
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        if (i < 0) {
            i += 256;
        }
        int i2 = this.uppjpjj % 3;
        if (i2 == 0) {
            this.jjuuju = i & 3;
            ((FilterOutputStream) this).out.write(jujujpjjp[i >> 2]);
        } else if (i2 == 1) {
            this.jjuuju = i & 15;
            ((FilterOutputStream) this).out.write(jujujpjjp[((this.jjuuju << 4) + (i >> 4)) & 63]);
        } else if (i2 == 2) {
            OutputStream outputStream = ((FilterOutputStream) this).out;
            char[] cArr = jujujpjjp;
            outputStream.write(cArr[((this.jjuuju << 2) + (i >> 6)) & 63]);
            ((FilterOutputStream) this).out.write(cArr[i & 63]);
            this.jjuuju = 0;
        }
        this.uppjpjj++;
    }

    public static String encode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) (bArr.length * 1.37d));
        Base64Encoder base64Encoder = new Base64Encoder(byteArrayOutputStream);
        try {
            base64Encoder.write(bArr);
            base64Encoder.close();
            return byteArrayOutputStream.toString("UTF-8");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            write(bArr[i + i3]);
        }
    }
}
