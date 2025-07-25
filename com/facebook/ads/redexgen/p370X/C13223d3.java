package com.facebook.ads.redexgen.p370X;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.d3 */
/* loaded from: assets/audience_network.dex */
public final class C13223d3 implements InterfaceC1086703<Bitmap> {
    public static byte[] A06;
    public final int A00;
    public final int A01;
    public final String A02 = C13223d3.class.getSimpleName();
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-110, -40, -47, -44, 3, 42, 53, 46, 34, 49, -31, 42, 52, -31, 47, 54, 45, 45, -55, -4, -25, -23, -12, -8, -19, -13, -14, -92, -24, -7, -10, -19, -14, -21, -92, -22, -19, -16, -23, -92, -25, -13, -15, -12, -10, -23, -9, -9, -19, -13, -14};
    }

    public C13223d3(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = z3;
    }

    public static C1086602<Bitmap> A00(Throwable th) {
        return new C1086602<>(false, null, th);
    }

    private void A03(File file, Bitmap bitmap) throws IOException {
        if (bitmap == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            ByteArrayOutputStream compressedBitmapOS = new ByteArrayOutputStream();
            byteArrayOutputStream = compressedBitmapOS;
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= 3145728) {
                return;
            }
            String str = file.getCanonicalPath() + A01(0, 4, 25);
            File file2 = new File(str);
            file2.createNewFile();
            fileOutputStream = new FileOutputStream(str);
            byteArrayOutputStream.writeTo(fileOutputStream);
            fileOutputStream.flush();
            fileInputStream = new FileInputStream(str);
            fileOutputStream2 = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream2.write(bArr, 0, read);
                } else {
                    file2.delete();
                    return;
                }
            }
        } finally {
            AbstractC108860M.A07(byteArrayOutputStream);
            AbstractC108860M.A07(fileOutputStream);
            AbstractC108860M.A07(fileInputStream);
            AbstractC108860M.A07(fileOutputStream2);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1086703
    public final C1086602<Bitmap> A3i(File file, InterfaceC108850L interfaceC108850L) {
        if (!this.A04) {
            return new C1086602<>(true, null);
        }
        try {
            Bitmap A03 = AbstractC108860M.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
            if (A03 != null) {
                return new C1086602<>(true, A03);
            }
            interfaceC108850L.A9u(new C13217cx(A01(4, 14, 118)));
            return A00(null);
        } catch (Throwable t) {
            file.delete();
            interfaceC108850L.A9u(t);
            return A00(t);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1086703
    public final void A4q(File file, InterfaceC108850L interfaceC108850L) throws C13217cx {
        if (this.A03) {
            try {
                Bitmap bitmap = AbstractC108860M.A03(file.getCanonicalPath(), this.A01, this.A00, this.A05);
                if (bitmap != null) {
                    A03(file, bitmap);
                } else {
                    file.delete();
                    throw new C13217cx(A01(4, 14, 118));
                }
            } catch (C13217cx e) {
                interfaceC108850L.AA5(e);
                throw e;
            } catch (Throwable th) {
                interfaceC108850L.AA5(th);
                Throwable t = new C13217cx(A01(18, 33, 57), th);
                throw t;
            }
        }
    }
}
