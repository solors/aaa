package com.facebook.ads.redexgen.p370X;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.redexgen.X.cz */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC13219cz implements InterfaceC108750B {
    public static byte[] A01;
    public static String[] A02 = {"4DAkvqHjWkdxtsENcWrDGdSG98sD", "CPIXB1o90MQiuPbP92eKhpVYkKPF", "DGtgBZoK51CqJxDDYeEGQpaHQi4s0SFq", "q2rpceA7xA4MlkiWDdlnsMZ7", "2r2XHRwXRNnyuB7hHeEjqCG0ly7MmAbM", "cNy8DIpXdd1zCdtjTt40y0Ha9veHBSdV", "PaSGUfk9UsvkFfO4ZJ4PfqMh8E4Xd1Uq", "2zViWo7DbInVze1qYqueOVIk3x"};
    public static final String A03;
    public final ExecutorService A00 = Executors.newSingleThreadExecutor();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private long A02(List<File> list) {
        long j = 0;
        for (File file : list) {
            j += file.length();
        }
        return j;
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[1].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "APyHxukBWXIF2vPxbwif9xgIaD7vOq8q";
            strArr2[6] = "ZPgmzBD45Cog9pfLf6p2hYnwtjTNY0Gq";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            byte b = (byte) ((copyOfRange[i4] - i3) - 56);
            if (A02[7].length() == 15) {
                throw new RuntimeException();
            }
            A02[3] = "glcddFxLpqFQC46fw4icMEpE";
            copyOfRange[i4] = b;
            i4++;
        }
    }

    public static void A04() {
        A01 = new byte[]{-115, -45, -36, -33, -115, -31, -33, -42, -38, -38, -42, -37, -44, -115, -48, -50, -48, -43, -46, Byte.MAX_VALUE, -56, -46, Byte.MAX_VALUE, -61, -60, -53, -60, -45, -60, -61, Byte.MAX_VALUE, -63, -60, -62, -64, -44, -46, -60, Byte.MAX_VALUE, -56, -45, Byte.MAX_VALUE, -60, -41, -62, -60, -60, -61, -46, Byte.MAX_VALUE, -62, -64, -62, -57, -60, Byte.MAX_VALUE, -53, -56, -52, -56, -45, -101, -71, -69, -64, -67, 120, -66, -63, -60, -67, 120, -39, 6, 6, 3, 6, -76, -8, -7, 0, -7, 8, -3, 2, -5, -76, -6, -3, 0, -7, -76};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A07(List<File> list) {
        long A022 = A02(list);
        int size = list.size();
        for (File file : list) {
            if (!A08(file, A022, size)) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    A022 -= length;
                    Log.i(A03, A03(61, 11, 32) + file + A03(19, 42, 39));
                } else {
                    Log.e(A03, A03(72, 20, 92) + file + A03(0, 19, 53));
                }
            }
        }
    }

    public abstract boolean A08(File file, long j, int i);

    static {
        A04();
        A03 = AbstractC13219cz.class.getSimpleName();
    }

    public static /* synthetic */ void A05(AbstractC13219cz abstractC13219cz, File file) throws IOException {
        abstractC13219cz.A06(file);
    }

    public void A06(File file) throws IOException {
        C108780E.A03(file);
        List<File> files = C108780E.A01(file.getParentFile());
        A07(files);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108750B
    public void AH9(File file) throws IOException {
        this.A00.submit(new Callable<Void>(file) { // from class: com.facebook.ads.redexgen.X.0F
            public final File A00;

            {
                this.A00 = file;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: A00 */
            public final Void call() throws Exception {
                AbstractC13219cz.A05(AbstractC13219cz.this, this.A00);
                return null;
            }
        });
    }
}
