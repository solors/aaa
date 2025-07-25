package com.facebook.ads.redexgen.p370X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6G */
/* loaded from: assets/audience_network.dex */
public final class C112486G {
    public static byte[] A01;
    public SharedPreferences A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 44, 62, 45, 58, 60, 33, 59, 33, 38, 47, 1, 44, 80, 69, 69, 67, 88, 83, 68, 69, 88, 94, 95, 120, 85, 93, 95, 93, 86, 91, 106, 109, 24, 20, 22, 85, 29, 26, 24, 30, 25, 20, 20, 16, 85, 26, 31, 8, 85, 18, 31, 29, 26, 115, 118, 114, 118, 107, 94, 123, 75, 109, 126, 124, 116, 118, 113, 120};
    }

    public C112486G(C113257j c113257j) {
        this.A00 = c113257j.getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(33, 21, 4), c113257j), 0);
    }

    public final C112476F A02() {
        SharedPreferences sharedPreferences = this.A00;
        String A00 = A00(0, 13, 55);
        if (sharedPreferences.contains(A00)) {
            return new C112476F(this.A00.getString(A00, A00(0, 0, 75)), this.A00.getBoolean(A00(54, 15, 96), false), EnumC112466E.A08, this.A00.getLong(A00(26, 7, 65), -1L));
        }
        return C112476F.A00();
    }

    public final String A03() {
        return this.A00.getString(A00(13, 13, 78), A00(0, 0, 75));
    }

    public final void A04(C112476F c112476f) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putString(A00(0, 13, 55), c112476f.A03());
        edit.putBoolean(A00(54, 15, 96), c112476f.A04());
        edit.putLong(A00(26, 7, 65), c112476f.A01());
        edit.apply();
    }

    public final void A05(String str) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putString(A00(13, 13, 78), str);
        edit.apply();
    }
}
