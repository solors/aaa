package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.cU */
/* loaded from: assets/audience_network.dex */
public class C13188cU implements InterfaceC109100k, InterfaceC109140p {
    public static byte[] A0C;
    public static String[] A0D = {"axrzCdv0FVVdCRJ2G5bzsKW6gzdnjkd", "bTiRlDodVRVUvI5asAv5OrmPjdR2kQoL", "0F0kzsbgf", "9OhtkIX5JTQzZAf31yyS0L6RFdCICf7G", "a5UohLNEI7iVSyxaj4LiJgBVL6R7sy1L", "7foeJoxu0TAivWs2uWCvQbVxkZa0ERHH", "EHJaWrfXkxbvFmDXjSXoaOL8kiGJisUm", "EwwWMCMqNj"};
    public static final String A0E;
    public int A00;
    public C13176cI A01;
    public InterfaceC1092914 A02;
    public C1093015 A03;
    public InterfaceC12022JT A04;
    public List<C12799W7> A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C13029Zs A0A;
    public final String A0B;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 27);
            if (A0D[0].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[4] = "ypXQoKhxcHRWJrqojmqi5sMtZ7xfThaX";
            strArr[6] = "2LOy6kLjroQDrfbojOuFHdbjLd88ORkx";
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{55, 18, 23, 6, 2, 19, 4, 86, 23, 26, 4, 19, 23, 18, 15, 86, 26, 25, 23, 18, 19, 18, 86, 18, 23, 2, 23, 2, 45, 40, 34, 42, 97, 41, 32, 49, 49, 36, 47, 36, 37, 97, 46, 47, 97, 45, 46, 34, 42, 50, 34, 51, 36, 36, 47, 97, 32, 37, 87, 120, 125, 119, Byte.MAX_VALUE, 52, 120, 123, 115, 115, 113, 112, 119, 117, 120, 120, 113, 102, SignedBytes.MAX_POWER_OF_TWO, 109, 100, 113, 46, 44, 63, 41, 46, 35, 57, 85, 87, 68, 82, 95, 88, 82, 114, 101, 50, 61, 56, 32, 49, 38, 49, 48, 11, 55, 56, 61, 55, 63, 11, 48, 49, 56, 53, 45, 11, 57, 39, 22, 12, 32, 28, 13, 26, 30, 11, 22, 9, 26, 32, 30, 12, 32, 28, 11, 30, 32, 9, 77, Byte.MAX_VALUE, 112, 101, 120, 103, 116, 36, 57, 54, 39, 36, 63, 56, 35, 106, 113, 118, 110, 106, 122, 86, 123, 10, 21, 25, 11};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(Map<String, String> map, Map<String, String> map2) {
        try {
            new Handler().postDelayed(new C13189cV(this, map2, A03(map)), this.A01.A07() * 1000);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A0M(Map<String, String> map) {
        boolean z;
        if (A0R()) {
            if (C11979Im.A1w(this.A0A) && C12178M4.A03(map)) {
                Log.e(A0E, A02(27, 31, 90));
                return;
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (this.A01.A0e()) {
                hashMap.put(A02(87, 7, 45), String.valueOf(A0E().A04()));
                hashMap.put(A02(80, 7, 86), String.valueOf(A0E().A03()));
            }
            hashMap.put(A02(70, 10, 15), AdPlacementType.NATIVE.name());
            hashMap.put(A02(154, 8, 4), this.A0B);
            if (this.A01.A0C() != null) {
                hashMap.put(A02(119, 21, 100), String.valueOf(this.A01.A0C().A17()));
                hashMap.put(A02(96, 23, 79), String.valueOf(this.A01.A0C().A0U()));
            }
            AbstractC109070h A00 = C109080i.A00(this.A0A, this.A0A.A09(), this.A01.A6r(), this.A01.A0B(), hashMap, this.A01.A0C() != null ? this.A01.A0C().A1Q() : null);
            EnumC109060g enumC109060g = EnumC109060g.A09;
            if (A00 != null) {
                enumC109060g = A00.A0C();
            }
            if ((A00 instanceof C11839GQ) || (A00 instanceof C11853Gf)) {
                boolean A0g = AbstractC12177M3.A0g(this.A0A, enumC109060g, hashMap);
                String[] strArr = A0D;
                if (strArr[4].charAt(16) != strArr[6].charAt(16)) {
                    throw new RuntimeException();
                }
                A0D[5] = "kwfiBSqx7XAKe0021CxmCpt6QDry9hKe";
                if (A0g) {
                    z = true;
                    if (!z || enumC109060g == EnumC109060g.A06) {
                    }
                    AbstractC12124LC.A04(this.A0A, A02(58, 12, 15));
                    if (this.A02 != null) {
                        InterfaceC1092914 interfaceC1092914 = this.A02;
                        String[] strArr2 = A0D;
                        if (strArr2[4].charAt(16) != strArr2[6].charAt(16)) {
                            interfaceC1092914.ACn(this);
                            return;
                        }
                        A0D[0] = "IDlncozxZ6Zb4pDO4gSYUoZYwzxF1Fi";
                        interfaceC1092914.ACn(this);
                        return;
                    }
                    return;
                }
            }
            z = false;
            if (z) {
            }
        }
    }

    static {
        A04();
        A0E = C13188cU.class.getSimpleName();
    }

    public C13188cU(C13029Zs c13029Zs) {
        this(c13029Zs, new C13176cI());
    }

    public C13188cU(C13029Zs c13029Zs, C13176cI c13176cI) {
        this.A0B = UUID.randomUUID().toString();
        this.A00 = 200;
        this.A01 = c13176cI;
        this.A0A = c13029Zs;
    }

    private Map<String, String> A03(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        String A02 = A02(162, 4, 103);
        if (map.containsKey(A02)) {
            hashMap.put(A02, map.get(A02));
        }
        String A022 = A02(146, 8, 76);
        if (map.containsKey(A022)) {
            hashMap.put(A022, map.get(A022));
        }
        return hashMap;
    }

    private void A05(C13176cI c13176cI) {
        if (!this.A06) {
            this.A01 = c13176cI;
            List<C13176cI> A0c = this.A01.A0c();
            if (A0c != null && A0c.size() > 0) {
                int size = A0c.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    C13188cU adapter = new C13188cU(this.A0A);
                    adapter.A05(A0c.get(i));
                    arrayList.add(new C12799W7(this.A0A, adapter, (C113758X) null, this.A04));
                }
                this.A05 = arrayList;
            }
            this.A06 = true;
            this.A07 = A07();
            return;
        }
        throw new IllegalStateException(A02(0, 27, 109));
    }

    private boolean A07() {
        return (!(this.A01.A0e() || TextUtils.isEmpty(this.A01.A0V())) || (!TextUtils.isEmpty(this.A01.A0S()) && this.A01.A0e())) && (this.A01.A0F() != null || this.A01.A0e()) && (this.A01.A0E() != null || A82() == AdPlacementType.NATIVE_BANNER);
    }

    public final int A08() {
        return this.A01.A02();
    }

    public final int A09() {
        return this.A01.A05();
    }

    public final int A0A() {
        int A06 = this.A01.A06();
        if (A06 < 0 || A06 > 100) {
            return 0;
        }
        return A06;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01.A08();
    }

    public final int A0D() {
        return this.A01.A09();
    }

    public final C13176cI A0E() {
        return this.A01;
    }

    public final InterfaceC1092914 A0F() {
        return this.A02;
    }

    public final String A0G() {
        return this.A01.A0Y();
    }

    public final List<C12799W7> A0H() {
        if (!A0R()) {
            return null;
        }
        return this.A05;
    }

    public final void A0I() {
        if (!this.A09) {
            String A0Z = A0E().A0Z();
            if (A0Z != null) {
                InterfaceC12000J7 A09 = this.A0A.A09();
                String[] strArr = A0D;
                if (strArr[1].charAt(25) != strArr[3].charAt(25)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[4] = "MHNGbcOaMZIG61BxjY7eI95TuiNlx0Gr";
                strArr2[6] = "kvjKrlZQ6RBIZv1Jj5ESJw4vFB55PB3z";
                A09.AEU(A0Z);
            }
            this.A09 = true;
        }
    }

    public final void A0J() {
        if (this.A05 != null && !this.A05.isEmpty()) {
            for (C12799W7 c12799w7 : this.A05) {
                c12799w7.unregisterView();
            }
        }
    }

    public final void A0K(InterfaceC1092914 interfaceC1092914) {
        this.A02 = interfaceC1092914;
    }

    public final void A0L(C13029Zs c13029Zs, InterfaceC1092914 interfaceC1092914, InterfaceC12000J7 interfaceC12000J7, C109811u c109811u, InterfaceC12022JT interfaceC12022JT) {
        int i;
        this.A02 = interfaceC1092914;
        this.A04 = interfaceC12022JT;
        JSONObject A03 = c109811u.A03();
        C113758X A01 = c109811u.A01();
        if (A01 != null) {
            i = A01.A06();
        } else {
            i = 200;
        }
        this.A00 = i;
        A05(AbstractC1093116.A00(c13029Zs, A03, AbstractC12143LV.A02(A03, A02(94, 2, 10))));
        if (AbstractC109110l.A06(c13029Zs, this, interfaceC12000J7)) {
            c13029Zs.A0E().A4g();
            interfaceC1092914.ACr(this, C12034Jg.A00(AdErrorType.NO_FILL));
            return;
        }
        if (interfaceC1092914 != null) {
            interfaceC1092914.ACo(this);
        }
        this.A03 = new C1093015(c13029Zs, this.A0B, this, interfaceC1092914);
        this.A03.A02();
    }

    public final void A0N(Map<String, String> extraData) {
        this.A0A.A09().A9w(this.A01.A6r(), extraData);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0103, code lost:
        if (r4 != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0O(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C13188cU.A0O(java.util.Map):void");
    }

    public final boolean A0P() {
        return true;
    }

    public final boolean A0Q() {
        return A0R() && this.A01.A0B() != null;
    }

    public final boolean A0R() {
        return this.A06 && this.A07;
    }

    public final boolean A0S() {
        return this.A01.A0d();
    }

    public final boolean A0T() {
        return C11979Im.A1R(this.A0A) && A0R() && this.A01.A0f();
    }

    public final boolean A0U() {
        return C11979Im.A1R(this.A0A) && A0R() && this.A01.A0g();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109100k
    public final String A6r() {
        return this.A01.A6r();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109100k
    public final Collection<String> A7B() {
        return A0E().A7B();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109100k
    public final EnumC109090j A7c() {
        return A0E().A7c();
    }

    public AdPlacementType A82() {
        return AdPlacementType.NATIVE;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109140p
    public final boolean AH5() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC109140p
    public final void onDestroy() {
        if (this.A03 != null) {
            C1093015 c1093015 = this.A03;
            String[] strArr = A0D;
            if (strArr[4].charAt(16) != strArr[6].charAt(16)) {
                throw new RuntimeException();
            }
            A0D[7] = "xLZjaQWgus";
            c1093015.A03();
        }
    }
}
