package com.facebook.ads.redexgen.p370X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Pm */
/* loaded from: assets/audience_network.dex */
public final class C12408Pm {
    public static byte[] A08;
    public static String[] A09 = {"wHWy6mJnObE4TdegwzR1XIqaiMp2qzo2", "2kKTv183xGQoCJ4bH8MOQBKEcrYPubr8", "yAnU2m0QEWVpmJNiipOenY", "2CWVvRtjqdC7", "Y1Dj6sRIbzGHXk3FXnyOisKccxY5ExT7", "AAUb4pYdx4XqEM8CotKihUFr9wNvuug2", "KLTFv3N2v474XPM9CBPbC4npqkPjZQN", "uonDorlDhYGoL6YzDZYQroxkAXvFfbHU"};
    public WeakReference<C12397Pb> A00;
    public WeakReference<InterfaceC12678U9> A01 = new WeakReference<>(null);
    public boolean A02 = false;
    public final C13029Zs A03;
    public final C12384PO A04;
    public final String A05;
    public final String A06;
    public final WeakReference<InterfaceC12000J7> A07;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-121, -109, -111, -111, -123, -110, -120, -110, -109, -108, -113, -93, -102, -94, 112, Byte.MAX_VALUE, 120, 107, -93, -78, -85, -85, -94, -87, -100, -96, -84, -95, -94, -86, -71, -78, -78, -87, -80, -93, -79, -87, -73, -73, -91, -85, -87, -15, 0, -7, -7, -16, -9, -22, -1, 4, -5, -16, -18, -24, -4, -56, -55, -72, -62, -67, -127, 114, -122, -124, 118, 117, 83, -118, 102, -124, 118, -125, -31, -30, -49, -32, -30, -45, -46, -80, -25, -61, -31, -45, -32, -14, -13, -32, -13, -28, -39, -42, -48, -81, -55, -35, -84, -105, -94, -85, -101};
        if (A09[5].charAt(6) == '8') {
            throw new RuntimeException();
        }
        A09[3] = "q8I1zS5uUBp9u7UYsB3eM38aYjAC";
        A08 = bArr;
    }

    static {
        A09();
    }

    public C12408Pm(C13029Zs c13029Zs, C12397Pb c12397Pb, InterfaceC12000J7 interfaceC12000J7, C12384PO c12384po, String str, String str2) {
        this.A03 = c13029Zs;
        this.A00 = new WeakReference<>(c12397Pb);
        this.A07 = new WeakReference<>(interfaceC12000J7);
        this.A04 = c12384po;
        this.A05 = str;
        this.A06 = str2;
    }

    public static Map<String, String> A03(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    private void A04() {
        InterfaceC12678U9 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.close();
        if (A09[3].length() == 20) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[2] = "rLuDNCDiUJCt8jrcDw8nHa";
        strArr[6] = "w5dFeIXZRXYPRcNf7kYaeIakMq27def";
    }

    private void A05() {
        InterfaceC12678U9 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A8v();
    }

    private void A06() {
        InterfaceC12678U9 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.A9j();
    }

    private void A07() {
        this.A03.A0E().A5b();
        this.A02 = true;
        InterfaceC12678U9 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        uxListener.AGz();
        if (C11979Im.A1p(this.A03)) {
            this.A03.A0A().ABh();
        }
    }

    private void A08() {
        InterfaceC12678U9 uxActionsJavascriptListener = this.A01.get();
        if (uxActionsJavascriptListener == null) {
            return;
        }
        uxActionsJavascriptListener.AC2();
    }

    private void A0A(C12397Pb c12397Pb, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        SharedPreferences A00 = AbstractC12071KJ.A00(this.A03);
        String A01 = A01(57, 5, 77);
        String A012 = A01(0, 0, 53);
        String storageValue = jSONObject.optString(A01, A012);
        String key = jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34));
        String string = A00.getString(A01(14, 4, 0) + key, A012);
        if (string != null) {
            A012 = string;
        }
        c12397Pb.A0g(storageValue, A012);
    }

    private void A0B(C12397Pb c12397Pb, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String A01 = A01(98, 5, 42);
        String A012 = A01(0, 0, 53);
        String optString = jSONObject.optString(A01, A012);
        String optString2 = jSONObject.optString(A01(57, 5, 77), A012);
        AbstractC12071KJ.A00(this.A03).edit().putString(A01(14, 4, 0) + jSONObject.optString(A01(54, 3, 119), A01(7, 7, 34)), optString).apply();
        c12397Pb.A0f(optString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(EnumC12406Pk enumC12406Pk, String str) throws JSONException {
        switch (C12405Pj.A00[enumC12406Pk.ordinal()]) {
            case 1:
                A0I(new JSONObject(str));
                break;
            case 2:
                A06();
                break;
            case 3:
                A04();
                break;
            case 4:
                A07();
                break;
            case 5:
                A0K(new JSONObject(str));
                break;
            case 6:
                A0L(new JSONObject(str));
                break;
            case 7:
                boolean isDebug = BuildConfigApi.isDebug();
                String[] strArr = A09;
                if (strArr[2].length() == strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A09;
                strArr2[7] = "ti0FJd6QzsmsCUgFEJNk2tGDtWFDX3UL";
                strArr2[0] = "2bsL1IjRD3bcdVR1Mvy0yjSySADV0GcP";
                if (isDebug) {
                }
                break;
            case 8:
                A05();
            case 9:
                this.A03.A0E().A5n(str);
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                A0D(enumC12406Pk, str);
                break;
            case 15:
                A0J(new JSONObject(str));
                break;
            case 16:
                A08();
                break;
            case 17:
                A0M(new JSONObject(str));
                break;
        }
        C12397Pb c12397Pb = this.A00.get();
        if (c12397Pb == null) {
            return;
        }
        switch (C12405Pj.A00[enumC12406Pk.ordinal()]) {
            case 19:
                c12397Pb.A0S();
                return;
            case 20:
                c12397Pb.A0R();
                return;
            case 21:
                A0B(c12397Pb, str);
                return;
            case 22:
                A0A(c12397Pb, str);
                return;
            case 23:
                c12397Pb.A0i(A03(new JSONObject(str)));
                return;
            default:
                return;
        }
    }

    private void A0D(EnumC12406Pk enumC12406Pk, String str) throws JSONException {
        InterfaceC12678U9 interfaceC12678U9 = this.A01.get();
        if (interfaceC12678U9 == null) {
            return;
        }
        switch (C12405Pj.A00[enumC12406Pk.ordinal()]) {
            case 10:
                interfaceC12678U9.AC6();
                return;
            case 11:
                interfaceC12678U9.ADb();
                return;
            case 12:
                A0G(interfaceC12678U9, str);
                return;
            case 13:
                A0F(interfaceC12678U9, str);
                return;
            case 14:
                A0E(interfaceC12678U9, str);
                return;
            default:
                return;
        }
    }

    private void A0E(InterfaceC12678U9 interfaceC12678U9, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STATE_KEY = A01(87, 5, 115);
        interfaceC12678U9.ACm(jSONObject.optBoolean(STATE_KEY, false));
    }

    private void A0F(InterfaceC12678U9 interfaceC12678U9, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String PAUSED_BY_USER_KEY = A01(62, 12, 5);
        interfaceC12678U9.AE5(jSONObject.optBoolean(PAUSED_BY_USER_KEY, false));
    }

    private void A0G(InterfaceC12678U9 interfaceC12678U9, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String STARTED_BY_USER_KEY = A01(74, 13, 98);
        interfaceC12678U9.AE7(jSONObject.optBoolean(STARTED_BY_USER_KEY, false));
    }

    private void A0I(JSONObject jSONObject) {
        InterfaceC12678U9 interfaceC12678U9 = this.A01.get();
        if (interfaceC12678U9 == null) {
            return;
        }
        String productUrl = jSONObject.optString(A01(0, 7, 24));
        if (TextUtils.isEmpty(productUrl)) {
            interfaceC12678U9.A8q();
        } else {
            interfaceC12678U9.A8r(productUrl);
        }
    }

    private void A0J(JSONObject jSONObject) {
        InterfaceC12678U9 uxListener = this.A01.get();
        if (uxListener == null) {
            return;
        }
        jSONObject.optString(A01(0, 7, 24));
    }

    private void A0K(JSONObject jSONObject) {
        InterfaceC12000J7 interfaceC12000J7 = this.A07.get();
        if (interfaceC12000J7 == null) {
            return;
        }
        if (A09[3].length() == 20) {
            throw new RuntimeException();
        }
        A09[3] = "hDImTkFK3KoL7AYoPxXIP";
        String key = jSONObject.optString(A01(43, 11, 127));
        if (TextUtils.isEmpty(key)) {
            return;
        }
        C12008JF handler = new C12008JF(this.A06, interfaceC12000J7);
        handler.A05(key, A03(jSONObject));
    }

    private void A0L(JSONObject jSONObject) {
        int optInt = jSONObject.optInt(A01(18, 11, 49), -1);
        if (optInt == -1) {
            return;
        }
        String message = jSONObject.optString(A01(29, 14, 56));
        if (TextUtils.isEmpty(message)) {
            return;
        }
        this.A03.A0E().A9y(optInt, message);
        String[] strArr = A09;
        String message2 = strArr[2];
        String str = strArr[6];
        int length = message2.length();
        int code = str.length();
        if (length == code) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "NCNoRnun1G3dlwmqoYaN2uZPLfccAkgr";
        strArr2[0] = "12RLbgldZ9TmNXvaOMkOvzOeimlYTJg9";
    }

    private void A0M(JSONObject jSONObject) {
        InterfaceC12678U9 interfaceC12678U9 = this.A01.get();
        if (interfaceC12678U9 == null) {
            return;
        }
        String A01 = A01(92, 6, 88);
        String[] strArr = A09;
        if (strArr[2].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[7] = "rydiERFHLfFXOcJD9tadKbqyFej0NUPk";
        strArr2[0] = "tiiagSBkZ4Sc0Tn3kexlzzs5G1JfuHdZ";
        String optString = jSONObject.optString(A01);
        if (optString == null) {
            return;
        }
        interfaceC12678U9.AEK(optString);
    }

    public final void A0N(InterfaceC12678U9 interfaceC12678U9) {
        this.A01 = new WeakReference<>(interfaceC12678U9);
    }

    public final boolean A0O() {
        return this.A02;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        ExecutorC12171Lx.A00(new RunnableC12404Pi(this, str));
    }
}
