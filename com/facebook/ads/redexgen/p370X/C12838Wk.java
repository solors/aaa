package com.facebook.ads.redexgen.p370X;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Wk */
/* loaded from: assets/audience_network.dex */
public final class C12838Wk extends C11902HT {
    public static byte[] A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C12838Wk A00(File file, C11906HX c11906hx) {
        String name = file.getName();
        if (!name.endsWith(A06(1, 7, 72))) {
            file = A05(file, c11906hx);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        Matcher matcher = A03.matcher(name);
        if (matcher.matches()) {
            long length = file.length();
            String A0C = c11906hx.A0C(Integer.parseInt(matcher.group(1)));
            if (A0C == null) {
                return null;
            }
            return new C12838Wk(A0C, Long.parseLong(matcher.group(2)), length, Long.parseLong(matcher.group(3)), file);
        }
        return null;
    }

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{60, 123, 35, 102, 123, 48, 45, 58, 69, 51, 53, 48, 50, 71, 53, 51, 71, Byte.MAX_VALUE, 48, 50, 71, 53, 51, 71, Byte.MAX_VALUE, 48, 50, 71, 53, 109, 42, 71, 53, 126, 99, 116, 63, 112, 6, 0, 5, 7, 114, 0, 6, 114, 74, 5, 7, 114, 0, 6, 114, 74, 5, 7, 114, 0, 88, 28, 114, 0, 75, 86, 65, 10, 99, 21, 97, 89, 22, 20, 97, 19, 21, 97, 89, 22, 20, 97, 19, 21, 97, 89, 22, 20, 97, 19, 75, 14, 97, 19, 88, 69, 82, 25};
    }

    static {
        A07();
        A01 = Pattern.compile(A06(8, 29, 6), 32);
        A02 = Pattern.compile(A06(37, 29, 51), 32);
        A03 = Pattern.compile(A06(66, 30, 32), 32);
    }

    public C12838Wk(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    public static C12838Wk A01(String str, long j) {
        return new C12838Wk(str, j, -1L, -9223372036854775807L, null);
    }

    public static C12838Wk A02(String str, long j) {
        return new C12838Wk(str, j, -1L, -9223372036854775807L, null);
    }

    public static C12838Wk A03(String str, long j, long j2) {
        return new C12838Wk(str, j, j2, -9223372036854775807L, null);
    }

    public static File A04(File file, int i, long j, long j2) {
        StringBuilder append = new StringBuilder().append(i);
        String A06 = A06(0, 1, 15);
        return new File(file, append.append(A06).append(j).append(A06).append(j2).append(A06(1, 7, 72)).toString());
    }

    public static File A05(File file, C11906HX c11906hx) {
        String filename;
        String name = file.getName();
        Matcher matcher = A02.matcher(name);
        if (matcher.matches()) {
            String filename2 = matcher.group(1);
            filename = AbstractC11953IK.A0O(filename2);
            if (filename == null) {
                return null;
            }
        } else {
            matcher = A01.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            filename = matcher.group(1);
        }
        File parentFile = file.getParentFile();
        int A08 = c11906hx.A08(filename);
        String filename3 = matcher.group(2);
        long parseLong = Long.parseLong(filename3);
        String filename4 = matcher.group(3);
        File A04 = A04(parentFile, A08, parseLong, Long.parseLong(filename4));
        if (file.renameTo(A04)) {
            return A04;
        }
        return null;
    }

    public final C12838Wk A08(int i) {
        AbstractC11914Hf.A04(this.A05);
        long currentTimeMillis = System.currentTimeMillis();
        return new C12838Wk(this.A04, this.A02, this.A01, currentTimeMillis, A04(this.A03.getParentFile(), i, this.A02, currentTimeMillis));
    }
}
