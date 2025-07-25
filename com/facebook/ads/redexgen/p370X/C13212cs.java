package com.facebook.ads.redexgen.p370X;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.cs */
/* loaded from: assets/audience_network.dex */
public class C13212cs implements InterfaceC108920S {
    public static byte[] A09;
    public static String[] A0A = {"IBjHvdAE4z3hQw4rxwkyNcKQ0ISAyia4", "k6JnbRLATBGW5JMH6xbwPTUsl0iwlrJc", "UfNjo0M2E3JYTqqfEgwKvI", "0cJpOp9GZhTbse6AR0KBqddAOnBBcxYH", "ToL0P04EQWC050ZStPfUW7", "dLQ1hyrIZ6bV252gpMlUXC0bj3", "6aHaE6Igu4j61t8wIMItohij1osEY7A", "YKpEvhrVN9bD9vQDF7gbtGGCU86bcHbh"};
    public final C13210cq A00;
    public final String A01;
    public final AtomicInteger A02;
    public final AtomicInteger A03;
    public final AtomicInteger A04;
    public final AtomicReference<String> A05;
    public final AtomicReference<String> A06;
    public final AtomicReference<String> A07;
    public final AtomicReference<EnumC109040e> A08;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{-87, -89, -69, -71, -85, -91, 119, -71, -70, -91, -87, -82, -89, -76, -76, -85, -78, -33, -35, -15, -17, -31, -37, -33, -21, -23, -20, -24, -31, -16, -31, -32, -34, -14, -16, -30, -36, -19, -34, -14, -16, -30, -43, -31, -32, -27, -26, -45, -32, -26, -47, -40, -34, -25, -27, -38, -47, -42, -37, -27, -45, -44, -34, -41, -42, 18, 30, 29, 34, 35, 16, 29, 35, 14, 21, 27, 36, 34, 23, 14, 20, 29, 16, 17, 27, 20, 19, -57, -38, -47, -63, -46, -50, -61, -37, -57, -44, 8, 23, 16, 16, 7, 14, 1, -6, 9, 2, 2, -7, 0, -13, 7, -7, 5, -64, -72, -73, -68, -76, -78, -61, -65, -76, -52, -72, -59};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A03(JSONObject jSONObject) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            try {
                jSONObject.put(A00(104, 10, 100), this.A04.getAndIncrement());
            } catch (JSONException unused) {
            }
            InterfaceC108990Z.A0X.A04(this.A01).A02(jSONObject);
            String str = this.A07.get();
            if (!TextUtils.isEmpty(str)) {
                InterfaceC108990Z.A0c.A04(str).A02(jSONObject);
            }
            String str2 = this.A06.get();
            if (!TextUtils.isEmpty(str2)) {
                InterfaceC108990Z.A0b.A04(str2).A02(jSONObject);
            }
            String str3 = this.A05.get();
            if (!TextUtils.isEmpty(str3)) {
                InterfaceC108990Z.A0a.A04(str3).A02(jSONObject);
            }
            EnumC109040e enumC109040e = this.A08.get();
            if (enumC109040e != null) {
                InterfaceC108990Z.A0I.A04(enumC109040e).A02(jSONObject);
            }
            int i = this.A02.get();
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0A[3] = "oDSQlSjNmcpmgzbcJtWHkjHlPwQZcL3R";
            if (i != -1) {
                InterfaceC108990Z.A0J.A04(Integer.valueOf(i)).A02(jSONObject);
            }
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    static {
        A01();
    }

    public C13212cs(C13210cq c13210cq) {
        this(c13210cq, UUID.randomUUID().toString());
    }

    public C13212cs(C13210cq c13210cq, String str) {
        this.A07 = new AtomicReference<>();
        this.A06 = new AtomicReference<>();
        this.A05 = new AtomicReference<>();
        this.A08 = new AtomicReference<>();
        this.A02 = new AtomicInteger(-1);
        this.A03 = new AtomicInteger(0);
        this.A01 = str;
        this.A00 = c13210cq;
        this.A04 = new AtomicInteger(1);
    }

    private void A02(int i, String str) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(97, 7, 114) + InterfaceC108990Z.A0Y.getName(), str);
            } catch (JSONException unused) {
            }
            A03(jSONObject);
            this.A00.A00().AAN(i, jSONObject);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    public final void A04(EnumC108950V type, C108980Y... params) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (C108980Y c108980y : params) {
                c108980y.A02(jSONObject);
            }
            A03(jSONObject);
            this.A00.A00().AA2(type, jSONObject, this.A03.get());
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[0].charAt(4) != strArr[7].charAt(4)) {
                throw new RuntimeException();
            }
            A0A[1] = "BGuBBhhr2vfc8YeoHKcuMelBM5cinHSr";
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A2y(String str, int reason, String viewType) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0X, InterfaceC108990Z.A0N.A04(Integer.valueOf(reason)), InterfaceC108990Z.A0T.A04(viewType));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A2z(String objectHash, String viewType) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0Y, InterfaceC108990Z.A0S.A04(objectHash), InterfaceC108990Z.A0T.A04(viewType));
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "CnHHOHbzAF39FbZ23oJPbX";
            strArr2[4] = "iCnDYwDfb9KHEDVJBca8IG";
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A30(String objectHash, String viewType) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0Z, InterfaceC108990Z.A0S.A04(objectHash), InterfaceC108990Z.A0T.A04(viewType));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A31(String objectHash, String viewType) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0a, InterfaceC108990Z.A0S.A04(objectHash), InterfaceC108990Z.A0T.A04(viewType));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A32(String objectHash, String viewType) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0b, InterfaceC108990Z.A0S.A04(objectHash), InterfaceC108990Z.A0T.A04(viewType));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A33(String objectHash, String viewType) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0c, InterfaceC108990Z.A0S.A04(objectHash), InterfaceC108990Z.A0T.A04(viewType));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A34(String objectHash, String viewType) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0d, InterfaceC108990Z.A0S.A04(objectHash), InterfaceC108990Z.A0T.A04(viewType));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A35() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0o, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A36() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A11, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A37(boolean listenerSet) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0f, InterfaceC108990Z.A01.A04(Boolean.valueOf(listenerSet)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A38(long loadTimeMs, int errorCode, String errorMessage) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A13, InterfaceC108990Z.A0K.A04(Integer.valueOf(errorCode)), InterfaceC108990Z.A0V.A04(errorMessage), InterfaceC108990Z.A0R.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            if (A0A[1].charAt(12) == 'T') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[0] = "ou1vvyDZqZWINuQgR45WlnH1G6V1u1ma";
            strArr[7] = "sF8Nv0lZkba8MOr3Cm9N7xOdNRIBEokF";
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A39() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A15, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3A() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A14, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "ghPrSTa04AlA3hlhWhKdOq";
            strArr2[4] = "J88k6JeMdFLh46seUcEYlS";
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3B() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A16, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3C(long loadTimeMs) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A17, InterfaceC108990Z.A0R.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3D(EnumC108900Q reason) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A30, InterfaceC108990Z.A00.A04(reason));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3E(String placementType, String placementId) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A06.set(placementType);
            this.A05.set(placementId);
            A04(EnumC108950V.A0g, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3F() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0h, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3G() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0i, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3H(long loadTimeMs, int errorCode, String errorMessage, boolean isPublic) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0j, InterfaceC108990Z.A0R.A04(Long.valueOf(loadTimeMs)), InterfaceC108990Z.A0K.A04(Integer.valueOf(errorCode)), InterfaceC108990Z.A0V.A04(errorMessage), InterfaceC108990Z.A09.A04(Boolean.valueOf(isPublic)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3I(long loadTimeMs) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0k, InterfaceC108990Z.A0R.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3J(boolean result) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1E, InterfaceC108990Z.A0G.A04(Boolean.valueOf(result)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3K() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1F, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3L(String errorMessage) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1K, InterfaceC108990Z.A0V.A04(errorMessage));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3M() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1L, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3N() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1M, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3O() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1N, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3P(int funnelVideoPauseReason) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1O, InterfaceC108990Z.A0N.A04(Integer.valueOf(funnelVideoPauseReason)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3Q() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1P, new C108980Y[0]);
        } catch (Throwable th) {
            if (A0A[1].charAt(12) == 'T') {
                throw new RuntimeException();
            }
            A0A[3] = "xPEMCdF1PT81VKplThmZJ0MgThXZkz9L";
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3R() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1S, new C108980Y[0]);
        } catch (Throwable th) {
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            A0A[1] = "rEmXoUEysLHPq8FZE3dOJNk5SzTI5ER4";
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3S() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1Q, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3T(int reason) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1R, InterfaceC108990Z.A0N.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3U() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1T, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3V(String uri) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1U, InterfaceC108990Z.A0Y.A04(uri));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3W() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1V, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3X() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1W, new C108980Y[0]);
        } catch (Throwable th) {
            if (A0A[1].charAt(12) == 'T') {
                throw new RuntimeException();
            }
            A0A[3] = "VHKTrZg04X3VOgoin19cBQHxK1SmZkil";
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3Y() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1X, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3Z() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1Y, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3a(int funnelVideoStartReason) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1Z, InterfaceC108990Z.A0N.A04(Integer.valueOf(funnelVideoStartReason)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "xMSVvfXgoFGAs8nDBunIn95v3O7z4ovy";
            strArr2[7] = "AGV4v0JDz2tNg1AGql8xEI5p6QAZ0vcQ";
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3b() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1a, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[0] = "8ZQmvOl7hzZw4gnCVFSM7Fjew1MxvIcb";
            strArr[7] = "zdDiv1uwuIXQArBlVybz6cyG0OKYRhqv";
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3c(int reason) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1b, InterfaceC108990Z.A0N.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3d() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A32, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3e() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A33, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3f(EnumC108900Q reason) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2z, InterfaceC108990Z.A00.A04(reason));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3g(int reason) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A31, InterfaceC108990Z.A0O.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A3h() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A34, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A4S(long loadTimeMs) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0m, InterfaceC108990Z.A0R.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A4T(long loadTimeMs, int chainedAdIndex) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0m, InterfaceC108990Z.A0R.A04(Long.valueOf(loadTimeMs)), InterfaceC108990Z.A0J.A04(Integer.valueOf(chainedAdIndex)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A4U(long loadTimeMs) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0n, InterfaceC108990Z.A0R.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A4V(long loadTimeMs, int chainedAdIndex) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0n, InterfaceC108990Z.A0R.A04(Long.valueOf(loadTimeMs)), InterfaceC108990Z.A0J.A04(Integer.valueOf(chainedAdIndex)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A4X(int reason) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0R, InterfaceC108990Z.A0N.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A4Y() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0S, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A4Z(String chainedParamsJson) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0T, InterfaceC108990Z.A0U.A04(chainedParamsJson));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A4a() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0U, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A4b() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0V, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A4c(int skipReason) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0W, InterfaceC108990Z.A0N.A04(Integer.valueOf(skipReason)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A4g() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0p, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5C() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0q, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5D() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0u, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5E(boolean isInvalidated) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0l, InterfaceC108990Z.A08.A04(Boolean.valueOf(isInvalidated)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5F(int errorCode, String errorMessage) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0v, InterfaceC108990Z.A0K.A04(Integer.valueOf(errorCode)), InterfaceC108990Z.A0V.A04(errorMessage));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5G(boolean hasBid) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0t, InterfaceC108990Z.A03.A04(Boolean.valueOf(hasBid)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5H() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0x, new C108980Y[0]);
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "rOShNeNq5fhncN4PBQe40u";
            strArr2[4] = "fkRpVb9hGxGD6wAnOJN4MT";
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5I() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0y, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5J() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A0z, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5K() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A10, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5b() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1f, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5c(String message) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1g, InterfaceC108990Z.A0Y.A04(message));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5d() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1h, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5e() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1i, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5f() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1j, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5g(String errorMessage) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1k, InterfaceC108990Z.A0V.A04(errorMessage));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5h(String errorMessage) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1l, InterfaceC108990Z.A0V.A04(errorMessage));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5i(String message) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1m, InterfaceC108990Z.A0Y.A04(message));
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0A[1] = "759deBEUdc0uh8isIDlD9YAtQ7qctZF0";
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5j(String errorMessage) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1o, InterfaceC108990Z.A0V.A04(errorMessage));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[0].charAt(4) != strArr[7].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "1zlmhlFzFVwgF9q0xmtSdu50kD";
            strArr2[6] = "2haF4NBMerbrCWfGasmmW9SqeFz7x8G";
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5k() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1p, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5l(String errorMessage) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1q, InterfaceC108990Z.A0V.A04(errorMessage));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5m(long loadTimeMs) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1r, InterfaceC108990Z.A0R.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A5n(String errorMessage) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1s, InterfaceC108990Z.A0V.A04(errorMessage));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A93() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1u, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A94(boolean isDisabledByGK) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1v, InterfaceC108990Z.A07.A04(Boolean.valueOf(isDisabledByGK)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A95() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1w, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A96(String error) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1x, InterfaceC108990Z.A0V.A04(error));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A97() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1y, new C108980Y[0]);
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0A[3] = "15jrFKu6wVZYTCIc5tz6T2aAbAvuKlIC";
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A98() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1z, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A99(String exception) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A20, InterfaceC108990Z.A0W.A04(exception));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void A9y(int code, String message) {
        if (AbstractC12078KQ.A02(this) || code < 11000 || code > 11099) {
            return;
        }
        try {
            A02(code, message);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AA4(String errorMessage) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1t, InterfaceC108990Z.A0V.A04(errorMessage));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAA(String provider) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A23, InterfaceC108990Z.A0Z.A04(provider));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAB(String provider) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A24, InterfaceC108990Z.A0Z.A04(provider));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAC(String provider) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A25, InterfaceC108990Z.A0Z.A04(provider));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAD(String provider) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A26, InterfaceC108990Z.A0Z.A04(provider));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAE(String provider) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A27, InterfaceC108990Z.A0Z.A04(provider));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAF(String provider) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A28, InterfaceC108990Z.A0Z.A04(provider));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAG() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A29, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAH(String provider) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2A, InterfaceC108990Z.A0Z.A04(provider));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAV(String errorMessage) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2v, InterfaceC108990Z.A0V.A04(errorMessage));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAW(int isLeftTopHalf) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2u, InterfaceC108990Z.A0L.A04(Integer.valueOf(isLeftTopHalf)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAX(boolean isSplitScreenSupportedInApp, boolean isSplitScreenFlagAdded, boolean supportsMultiWindow, boolean supportsSplitScreenMultiWindow, boolean appResizingSupported) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2w, InterfaceC108990Z.A0B.A04(Boolean.valueOf(isSplitScreenSupportedInApp)), InterfaceC108990Z.A0A.A04(Boolean.valueOf(isSplitScreenFlagAdded)), InterfaceC108990Z.A0F.A04(Boolean.valueOf(supportsMultiWindow)), InterfaceC108990Z.A0H.A04(Boolean.valueOf(supportsSplitScreenMultiWindow)), InterfaceC108990Z.A0D.A04(Boolean.valueOf(appResizingSupported)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAc() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A36, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAd() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A35, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAe(String falseReasonMessage) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A37, InterfaceC108990Z.A0e.A04(falseReasonMessage));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAf() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A38, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAg() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A39, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAr(String errorMessage) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A18, InterfaceC108990Z.A0V.A04(errorMessage));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAs(int reason) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A19, InterfaceC108990Z.A0O.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAt() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2B, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAu() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2C, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAv() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2D, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AAx() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1A, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void ADn(int actionMode) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1G, InterfaceC108990Z.A0M.A04(Integer.valueOf(actionMode)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AEw(String errorMessage) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1C, InterfaceC108990Z.A0V.A04(errorMessage));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AEx() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1D, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AF5() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2K, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AF6(int resultCode) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2L, InterfaceC108990Z.A0K.A04(Integer.valueOf(resultCode)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AF7() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2M, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AF8() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2N, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AF9() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2O, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFA() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2Q, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFB() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2R, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFC() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2S, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFD() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2T, new C108980Y[0]);
        } catch (Throwable th) {
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            A0A[1] = "wOU9EU8iwoFyJfRJJkX4aLHDWxmftefK";
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFE(RemoteException e) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2b, InterfaceC108990Z.A0V.A04(e.toString()));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFF() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2U, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFG() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2V, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFH() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2W, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFI() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2X, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFJ() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2Y, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "qlMIvHuIl0PpF5kBV9VQgOwtH5MinuqE";
            strArr2[7] = "xBNYvFKh7XBRvzLChNYnaiJhWQppxCKD";
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFK(int type) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2Z, InterfaceC108990Z.A0P.A04(Integer.valueOf(type)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFL() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2a, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFM() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2P, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFN() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2c, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFO() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2d, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFP() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2e, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFQ() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2f, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFR() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2g, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFS() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2h, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFT() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2i, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFU() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2j, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFV() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2k, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFW() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2l, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFX() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2m, new C108980Y[0]);
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0A[3] = "ytbGG59mSCQ98v8bmpcCcEmqTnAgI1JB";
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFY() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2n, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFy() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2t, InterfaceC108990Z.A0Y.A04(A00(65, 22, 127)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            String[] strArr = A0A;
            if (strArr[0].charAt(4) != strArr[7].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "ISt8aVbYkZ1528n3X0AMwO";
            strArr2[4] = "7zAIV0laY8ZUIjQSc0h82I";
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AFz() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2t, InterfaceC108990Z.A0Y.A04(A00(42, 23, 66)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AG0() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2x, InterfaceC108990Z.A0Y.A04(A00(87, 10, 50)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AG1() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2o, InterfaceC108990Z.A0Y.A04(A00(17, 14, 76)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AG2() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2o, InterfaceC108990Z.A0Y.A04(A00(0, 17, 22)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AG3() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2o, InterfaceC108990Z.A0Y.A04(A00(31, 11, 77)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AG4() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2x, InterfaceC108990Z.A0Y.A04(A00(114, 12, 35)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AGL(int index) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A02.set(index);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AGR(boolean value) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            if (value) {
                this.A03.set(1);
            } else {
                this.A03.set(2);
            }
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AGd(String str) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A07.set(str);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "yN2ek2pa9UH1g7DDMCyQyyX5rJ";
            strArr[6] = "oQTvUigTVOEtCxa6Wt9cejPgJdPQvss";
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AGg(EnumC109040e viewType) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A08.set(viewType);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHL() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1I, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHM(String viewableRatio) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A2y, InterfaceC108990Z.A0d.A04(viewableRatio));
        } catch (Throwable th) {
            String[] strArr = A0A;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[0] = "FEFzvX05qBdVAmKk8G0MI95qKtchV7LJ";
            strArr2[7] = "hT88vpHnpVYqM7dW4oE2C6WdduktsvVi";
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHN() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1c, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHR() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A3A, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHS(int code, String message) {
        if (AbstractC12078KQ.A02(this) || code < 12000 || code > 12099) {
            return;
        }
        try {
            A02(code, message);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHT() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A3B, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHU() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A3C, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHV() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A3D, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHW(boolean callIgnored) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A3E, InterfaceC108990Z.A02.A04(Boolean.valueOf(callIgnored)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHX() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A3F, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHY() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A3G, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHZ(int errorCode, String message) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A3H, InterfaceC108990Z.A0K.A04(Integer.valueOf(errorCode)), InterfaceC108990Z.A0V.A04(message));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHa(boolean hasWebview) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A3I, InterfaceC108990Z.A06.A04(Boolean.valueOf(hasWebview)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHb() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A3J, new C108980Y[0]);
        } catch (Throwable th) {
            if (A0A[3].charAt(31) == 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "tcZOAQ7ZICgkoIgoP9nUVanYjA";
            strArr[6] = "vX76sPpkkUT44d9ZVg7hUVWC8IWIUnC";
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHc(String error) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A3K, InterfaceC108990Z.A0V.A04(error));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHd(int i, String error) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A3L, InterfaceC108990Z.A0V.A04(error));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHe() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A3M, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHf(int visibility) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A3N, InterfaceC108990Z.A0Q.A04(Integer.valueOf(visibility)));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHk(String errorMessage) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1d, InterfaceC108990Z.A0V.A04(errorMessage));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void AHl(String errorMessage) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1e, InterfaceC108990Z.A0V.A04(errorMessage));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final String getId() {
        if (AbstractC12078KQ.A02(this)) {
            return null;
        }
        try {
            return this.A01;
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108920S
    public final void unregisterView() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A04(EnumC108950V.A1H, new C108980Y[0]);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
