package com.facebook.ads.redexgen.p370X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.WQ */
/* loaded from: assets/audience_network.dex */
public final class C12818WQ implements InterfaceC12013JK {
    public static byte[] A01;
    public final C13029Zs A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 12);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{94, 89, 91, 76, 77, 89, 84, 103, 76, 81, 85, 93, 75, 76, 89, 85, 72, SignedBytes.MAX_POWER_OF_TWO, 79, 74, 70, 77, 87, 124, 66, 83, 74, 124, 85, 70, 81, 80, 74, 76, 77, 101, 105, 104, 114, 99, 104, 114, 60, 41, 41, 5, 2, 31, 24, 13, 0, 0, 51, 30, 9, 10, 9, 30, 30, 9, 30, 68, 94, 114, 78, 89, 57, 40, 42, 34, 40, 46, 44, 22, 39, 40, 36, 44};
    }

    public C12818WQ(C13029Zs c13029Zs) {
        this.A00 = c13029Zs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A03(String str, boolean z, String str2, String str3, String str4, long j) {
        this.A00.A0E().AAA(str);
        PackageManager packageManager = this.A00.getPackageManager();
        if (packageManager == null) {
            this.A00.A0E().AAF(str);
            return false;
        }
        ContentResolver contentResolver = this.A00.getContentResolver();
        if (contentResolver == null) {
            this.A00.A0E().AAC(str);
            return false;
        } else if (packageManager.resolveContentProvider(str, 0) == null) {
            this.A00.A0E().AAB(str);
            return false;
        } else {
            Uri parse = Uri.parse(A00(35, 10, 10) + str + A00(0, 1, 125) + str2);
            ContentValues values = new ContentValues();
            values.put(A00(17, 18, 47), (Integer) 1);
            values.put(A00(61, 5, 33), Boolean.valueOf(z));
            values.put(A00(45, 16, 96), str3);
            values.put(A00(66, 12, 69), str4);
            values.put(A00(1, 16, 52), Long.valueOf(j));
            try {
                contentResolver.insert(parse, values);
                this.A00.A0E().AAH(str);
                return true;
            } catch (UnsupportedOperationException unused) {
                this.A00.A0E().AAE(str);
                return false;
            } catch (Exception unused2) {
                this.A00.A0E().AAD(str);
                return false;
            }
        }
    }

    public final void A04(boolean z, String str, String str2, String str3, long j, boolean z2) {
        this.A00.A0E().AAG();
        ExecutorC12182M8.A06.execute(new C12819WR(this, z, str, str2, str3, j, z2));
    }
}
