package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.a3 */
/* loaded from: assets/audience_network.dex */
public final class C13040a3 implements InterfaceC1124169 {
    public static byte[] A03;
    public static String[] A04 = {"1hpByTARN6eOnQ", "46DvCO0dFj9d90pc7Bl3Va1pW3afVu0G", "LtfSHnVMNf9jD1VPw2QJdb6akNXb3KRw", "UXeRQ2HNaneiXsHAoGvRBzblNiVPPyfq", "WcHPi3i27m6LdaHLnkH9ENRpFxyJu3g8", "FTcDokCppzFM6olvGfJVNXVubstDZ8VZ", "v3Z7C81p3UBYKX6nY0MAEeka3DNz7RKw", "vwYfKziuTy1RLYscQHjTEDI4uYjWuvBq"};
    public final InterfaceC12561SF A01;
    public Set<InterfaceC112446C> A00 = new HashSet();
    public final List<InterfaceC112436B> A02 = new ArrayList();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{75, 75, 78, 24, 81, 75, 78, 24, 39, 53, 53, 35, 50, 53};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public synchronized void A03() {
        if (!this.A01.A9b()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<InterfaceC112446C> A01 = A01(this.A01.A75());
        if (!this.A00.equals(A01) && A01 != null) {
            this.A00 = A01;
            for (InterfaceC112436B interfaceC112436B : this.A02) {
                interfaceC112436B.A3z();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (InterfaceC112446C interfaceC112446C : this.A00) {
                String.format(Locale.US, A00(0, 8, 58), interfaceC112446C.A8b(), interfaceC112446C.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public C13040a3(InterfaceC12049Jw interfaceC12049Jw) {
        this.A01 = interfaceC12049Jw.A54(EnumC12562SG.A0B);
        this.A01.A3n(new C13041a4(this));
        A03();
    }

    public static Set<InterfaceC112446C> A01(JSONObject jSONObject) {
        C13039a2 A00;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(8, 6, 23));
        if (optJSONArray == null) {
            return null;
        }
        int i = 0;
        while (true) {
            int i2 = optJSONArray.length();
            if (A04[2].charAt(7) != 'M') {
                throw new RuntimeException();
            }
            A04[0] = "HjevAVNXdTQxpc55Yqf8Zim5Y";
            if (i < i2) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null || (A00 = C13039a2.A00(optJSONObject)) == null) {
                    return null;
                }
                hashSet.add(A00);
                i++;
            } else {
                return hashSet;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1124169
    public final void A3l(InterfaceC112436B interfaceC112436B) {
        this.A02.add(interfaceC112436B);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC1124169
    public final synchronized Set<InterfaceC112446C> A6Q() {
        return new HashSet(this.A00);
    }
}
