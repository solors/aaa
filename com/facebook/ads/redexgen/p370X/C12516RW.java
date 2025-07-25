package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import com.google.common.primitives.SignedBytes;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.RW */
/* loaded from: assets/audience_network.dex */
public final class C12516RW {
    public static C12516RW A09;
    public static byte[] A0A;
    public static final DownloadAction.Deserializer[] A0B;
    public C11721EL A00;
    public InterfaceC11898HP A01;
    public File A02;
    public boolean A03;
    public final C13028Zr A06;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final SparseArray<C12514RU> A05 = new SparseArray<>();
    public final Runnable A08 = new RunnableC12513RT(this);
    public final InterfaceC11716EE A07 = new C12160Lm(this);

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 5);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0A = new byte[]{11, 105, 82, 95, 78, 88, 17, 11, 55, 117, 110, 99, 114, 100, 55, 31, 52, 44, 53, 55, 52, 58, 63, 62, 63, 117, 123, 8, 47, 58, 47, 62, 97, 123, 70, 113, 113, 108, 113, 45, 35, 80, 119, 98, 119, 102, 57, 35, 85, 96, 114, 106, 72, 77, 71, 94, 4, 72, 74, 93, SignedBytes.MAX_POWER_OF_TWO, 70, 71, 90, 60, 57, 51, 42, 112, 57, 50, 42, 51, 49, 50, 60, 57, 46, 26, 31, 8, 89, 91, 89, 82, 95};
    }

    static {
        A0C();
        A0B = new DownloadAction.Deserializer[]{C12893Xd.A02};
    }

    public C12516RW(C13028Zr c13028Zr, C11721EL c11721el) {
        this.A06 = c13028Zr;
        if (c11721el != null) {
            this.A00 = c11721el;
            c11721el.A0R(this.A07);
        }
        A01().A0Q();
    }

    private synchronized C11721EL A01() {
        if (this.A00 == null) {
            this.A00 = new C11721EL(new C11723EQ(A03(), A02()), 10, 5, new File(A06(), A07(52, 12, 44)), A0B);
            this.A00.A0R(this.A07);
        }
        return this.A00;
    }

    private C1111041 A02() {
        return new C1111041(A07(78, 3, 126), null);
    }

    private final synchronized InterfaceC11898HP A03() {
        if (this.A01 == null) {
            this.A01 = new C12839Wl(new File(A06(), A07(64, 14, 88)), new C11620CY(C11979Im.A0R(this.A06)));
        }
        return this.A01;
    }

    public static C12842Wo A04(C12858X4 c12858x4, InterfaceC11898HP interfaceC11898HP) {
        return new C12842Wo(interfaceC11898HP, c12858x4, new C12854X0(), null, 2, null);
    }

    public static synchronized C12516RW A05(C13028Zr c13028Zr) {
        C12516RW c12516rw;
        synchronized (C12516RW.class) {
            if (A09 == null) {
                A09 = new C12516RW(c13028Zr, null);
            }
            c12516rw = A09;
        }
        return c12516rw;
    }

    private File A06() {
        if (this.A02 == null) {
            this.A02 = this.A06.getCacheDir();
        }
        return this.A02;
    }

    public static String A08(C13028Zr c13028Zr, Uri uri) {
        try {
            if (!C11979Im.A1m(c13028Zr)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e) {
            c13028Zr.A07().AA0(A07(81, 5, 63), AbstractC113568E.A0u, new C113578F(e));
            return null;
        }
    }

    public void A09() {
        C11720EK[] A0T;
        for (C11720EK c11720ek : A01().A0T()) {
            int taskId = c11720ek.A02;
            C12514RU c12514ru = this.A05.get(taskId);
            if (c12514ru != null) {
                int i = c11720ek.A01;
                if (i == 2 || c11720ek.A03 > c12514ru.A00) {
                    String str = A07(15, 19, 94) + i + A07(0, 8, 46) + c11720ek.A03;
                    c12514ru.A01.ABm(c12514ru.A02);
                    this.A05.remove(taskId);
                } else if (i == 4 || i == 3) {
                    String str2 = A07(34, 14, 6) + i;
                    c12514ru.A01.ABu(c11720ek.A05);
                    this.A05.remove(taskId);
                }
            }
            String str3 = A07(48, 4, 4) + taskId + A07(8, 7, 18) + c11720ek.A03;
        }
    }

    private void A0A() {
        if (!this.A03) {
            this.A03 = true;
            this.A04.post(this.A08);
        }
    }

    public void A0B() {
        this.A04.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final C12842Wo A0F(Context context) {
        return A04(new C12858X4(context, (InterfaceC11894HL<? super InterfaceC11872Gz>) null, A02()), A03());
    }

    public final void A0G(Uri uri, InterfaceC12515RV interfaceC12515RV, long j) {
        String A08 = A08(this.A06, uri);
        if (A08 == null) {
            A08 = uri.toString();
        }
        boolean A0H = A0H(A08);
        this.A05.put(A01().A0P(new C12893Xd(uri, false, null, A08)), new C12514RU(interfaceC12515RV, j, A0H, null));
        A0A();
    }

    public final boolean A0H(String str) {
        return A03().A6e(str, 0L, 1L) > 0;
    }
}
