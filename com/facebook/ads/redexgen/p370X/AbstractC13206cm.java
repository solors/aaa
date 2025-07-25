package com.facebook.ads.redexgen.p370X;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cm */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC13206cm extends AbstractC109070h {
    public static String A03;
    public static String A04;
    public static String A05;
    public static byte[] A06;
    public static String[] A07 = {"yKsrGZvRhlHO", "9EputwQvm", "xy4ysuU", "7AjoeEFyRFUmAcGguWz5skIE39kXLiT8", "yw7hkrjnug4F5v8JlqxYlpspwNYrqeOP", "YdvcKbM", "Mv5W7ZjuxpjDlIvwBIaHg3eS9AlP", "wZHnfIG7rJSoOb"};
    public final boolean A00;
    public final C109130o A01;
    public final boolean A02;

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 48);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        byte[] bArr = {60, 19, 22, 28, 20, 95, 19, 16, 24, 24, 26, 27, 24, 23, 29, 11, 22, 16, 29, 87, 16, 23, 13, 28, 23, 13, 87, 24, 26, 13, 16, 22, 23, 87, 47, 48, 60, 46, 17, 18, 16, 24, 44, 7, 26, 30, 22, 35, 42, 46, 57, 42, 16, 59, 38, 34, 42, 34, 56, 57, 46, 34, 32, 40, 41, 47, 57, 57, 63, 41, 41, 65, 90, 93, 66, 81, 70, 71, 85, 88, 107, 88, 93, 90, 95, 20, 18, 4, 19, 62, 21, 19, 0, 2, 10, 4, 19, 62, 8, 18, 62, 15, 14, 21, 62, 15, 20, 13, 13, 5, 19, 6, 17, 26, 45, 19, 28, 22, 45, 16, 0, 29, 5, 1, 23};
        if (A07[1].length() != 9) {
            throw new RuntimeException();
        }
        A07[7] = "E0qxoPtldo8saq";
        A06 = bArr;
    }

    public abstract EnumC109060g A0D();

    static {
        A0B();
        A03 = A0A(64, 7, 106);
        A04 = A0A(85, 24, 81);
        A05 = A0A(109, 16, 66);
    }

    public AbstractC13206cm(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, String str, C109130o c109130o, boolean z) {
        this(c13029Zs, interfaceC12000J7, str, c109130o, z, false);
    }

    public AbstractC13206cm(C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, String str, C109130o c109130o, boolean z, boolean z2) {
        super(c13029Zs, interfaceC12000J7, str);
        this.A01 = c109130o;
        this.A02 = z;
        this.A00 = z2;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109070h
    public final EnumC109060g A0C() {
        if (this.A01 != null) {
            this.A01.A07(super.A02);
        }
        C13029Zs c13029Zs = super.A00;
        if (A07[7].length() != 14) {
            throw new RuntimeException();
        }
        A07[3] = "9d6GoSvBACG6VCN4qR5bPjffs9IY5LAp";
        if (C12315OH.A03(c13029Zs)) {
            return EnumC109060g.A06;
        }
        return A0D();
    }

    public final void A0E(Map<String, String> extraData, EnumC109060g enumC109060g) {
        if (!TextUtils.isEmpty(super.A02)) {
            if (this instanceof C11853Gf) {
                super.A01.AAY(super.A02, extraData);
            } else {
                super.A01.AA9(super.A02, extraData);
            }
            boolean A02 = EnumC109060g.A02(enumC109060g);
            boolean z = this.A01 != null;
            boolean isError = C11979Im.A2J(super.A00);
            if (isError) {
                Map<String, String> navigationDataMap = new HashMap<>();
                boolean isError2 = !A02;
                navigationDataMap.put(A03, Boolean.toString(isError2));
                navigationDataMap.put(A04, Boolean.toString(z));
                String str = A05;
                boolean isError3 = this.A00;
                navigationDataMap.put(str, Boolean.toString(isError3));
                super.A01.AAI(super.A02, navigationDataMap);
            }
            if (this.A01 != null) {
                this.A01.A06(enumC109060g);
                if (A02) {
                    this.A01.A05();
                }
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(A0A(47, 10, 127), Long.toString(-1L));
                hashMap.put(A0A(38, 9, 67), Long.toString(-1L));
                hashMap.put(A0A(57, 7, 125), EnumC109060g.A05.name());
                super.A01.AAZ(super.A02, hashMap);
            }
        }
        AbstractC12124LC.A04(super.A00, A0A(0, 12, 79));
    }

    public final boolean A0F(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter(A0A(71, 14, 4));
            boolean redirectedToApp = TextUtils.isEmpty(queryParameter);
            if (redirectedToApp) {
                return false;
            }
            Intent intent = new Intent(A0A(12, 26, 73), AbstractC12117L5.A00(queryParameter));
            intent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 30) {
                intent.addFlags(1024);
            }
            return C12104Kq.A0C(super.A00, intent);
        } catch (C12102Ko unused) {
            return false;
        }
    }
}
