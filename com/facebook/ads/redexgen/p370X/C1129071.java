package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.sync.SyncModifiableBundle;
import com.google.common.primitives.UnsignedBytes;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.ads.redexgen.X.71 */
/* loaded from: assets/audience_network.dex */
public final class C1129071 implements InterfaceC12049Jw, InterfaceC12566SK {
    public static byte[] A0A;
    public static String[] A0B = {"IFN7jxPm5iUVHezzrmxS", "S0eu2eNSRgR", "zAFRaPaLH2briFok", "kmV", "0tQTfhSJ7", "pW9DdJxYDevwUXMYU", "23M9j", "tE9Nw4uJT9AR2sagm"};
    public final C113257j A00;
    public final InterfaceC1134280 A01;
    public final InterfaceC12536Rq A02;
    public final InterfaceC12567SL A03;
    public final C12575ST A04;
    public final InterfaceC12576SU A05;
    public final String A06;
    public final Map<EnumC12562SG, C12052Jz> A09 = new HashMap();
    public final Map<EnumC12562SG, AbstractC1129579> A08 = new HashMap();
    public final List<InterfaceC12580SY> A07 = new ArrayList();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A04() throws Throwable {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        synchronized (this) {
            for (C12052Jz c12052Jz : this.A09.values()) {
                if (c12052Jz.A9b()) {
                    hashMap.put(c12052Jz, EnumC12583Sb.A05);
                } else {
                    hashMap.put(c12052Jz, EnumC12583Sb.A04);
                }
            }
            new AtomicReference();
            new AtomicReference();
            Iterator<AbstractC1129579> it = this.A08.values().iterator();
            while (it.hasNext()) {
                it.next();
                InterfaceC12561SF interfaceC12561SF = null;
                if (interfaceC12561SF.A9b()) {
                    throw new NullPointerException(A01(349, 20, 51));
                }
            }
            Iterator<InterfaceC12580SY> it2 = this.A07.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw new NullPointerException(A01(424, 22, 120));
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        JSONObject A03 = A03(hashMap, hashMap2, hashMap3, hashMap4);
        String.format(Locale.US, A01(188, 33, 57), this.A06, A03.toString(2));
        this.A02.AET(this.A06, (A01(327, 8, 121) + URLEncoder.encode(A03.toString())).getBytes(), new C12046Jt(this, atomicReference, atomicReference2, countDownLatch));
        while (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this) {
            if (atomicReference2.get() != null) {
                throw ((Throwable) atomicReference2.get());
            }
            Set<InterfaceC12579SX> A02 = A02((JSONObject) atomicReference.get());
            HashMap hashMap5 = new HashMap();
            HashMap hashMap6 = new HashMap();
            for (InterfaceC12579SX interfaceC12579SX : A02) {
                interfaceC12579SX.A3v(hashMap5, hashMap6);
            }
            this.A03.A66(A00((JSONObject) atomicReference.get()));
            Iterator<InterfaceC12580SY> it3 = this.A07.iterator();
            if (it3.hasNext()) {
                it3.next();
                throw new NullPointerException(A01(401, 23, 20));
            }
        }
    }

    public static void A05() {
        A0A = new byte[]{102, -81, -71, 102, -72, -85, -71, -70, -72, -81, -87, -70, -85, -86, 116, 102, -103, -79, -81, -74, -74, -81, -76, -83, 102, -71, -65, -76, -87, -43, 4, 4, -76, -3, 2, -76, -10, -11, -9, -1, -5, 6, 3, 9, 2, -8, -62, -67, -37, -24, -24, -23, -18, -102, -35, -20, -33, -37, -18, -33, -102, -19, -33, -20, -16, -33, -20, -102, -36, -17, -24, -34, -26, -33, -102, -15, -29, -18, -30, -102, -24, -23, -24, -89, -19, -33, -20, -16, -33, -20, -102, -23, -15, -24, -33, -34, -102, -36, -17, -24, -34, -26, -33, -102, -61, -66, 123, -104, -85, -104, 87, -89, -87, -90, -102, -100, -86, -86, -96, -91, -98, 87, -90, -89, -85, -96, -90, -91, 87, -118, -81, -73, -94, -83, -86, -91, 97, -77, -90, -89, -77, -90, -76, -87, 97, -75, -86, -82, -90, 123, 97, 102, -91, -34, -11, 7, -80, 3, -11, 2, 6, -11, 2, -67, -1, 7, -2, -11, -12, -80, -14, 5, -2, -12, -4, -11, -80, -13, 2, -11, -15, 4, -11, -12, -54, -80, -75, 3, -95, -57, -68, -79, -74, -64, -67, -68, -73, -56, -81, -62, -73, -67, -68, 110, -64, -77, -65, -61, -77, -63, -62, 110, -62, -67, 110, 115, -63, -120, 88, 115, -63, -34, 4, -7, -18, -13, -3, -6, -7, -12, 5, -20, -1, -12, -6, -7, -85, -3, -16, -2, -5, -6, -7, -2, -16, -59, -107, -80, -2, -43, -5, -16, -27, -22, -12, -15, -16, -21, -4, -29, -10, -21, -15, -16, -94, -12, -9, -16, -94, -24, -29, -21, -18, -25, -26, -67, -94, -24, -15, -12, -27, -21, -16, -23, -94, -21, -16, -94, -89, -26, -94, -11, -25, -27, -15, -16, -26, -11, -28, -9, -16, -26, -18, -25, -11, -61, -49, -50, -44, -59, -40, -44, 124, 121, -116, 121, -90, -87, -82, -89, -91, -78, -80, -78, -87, -82, -76, -2, -17, 7, -6, -3, -17, -14, -53, -116, Byte.MAX_VALUE, UnsignedBytes.MAX_POWER_OF_TWO, -116, Byte.MAX_VALUE, -115, -126, -10, -23, -11, -7, -23, -9, -8, -70, -83, -71, -67, -79, -70, -83, -69, -101, -63, -74, -85, -119, -74, -84, -102, -83, -69, -83, -68, -69, -82, -68, -71, -72, -73, -68, -82, 0, -14, -1, 3, -14, -1, -36, 4, -5, -14, -15, -49, 2, -5, -15, -7, -14, -48, -1, -14, -18, 1, -14, -15, -100, -94, -105, -116, -111, -101, -104, -105, -110, -93, -118, -99, -110, -104, -105, 111, -110, -105, -110, -100, -111, -114, -115, 0, 6, -5, -16, -11, -1, -4, -5, -10, 7, -18, 1, -10, -4, -5, -32, 1, -18, -1, 1, -14, -15, -11, -30, -13, -24, -26, -11, -32, -13, -26, -25, -13, -26, -12, -23, -32, -12};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A08(Throwable th) {
        Iterator<InterfaceC12580SY> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            new HashMap();
            new HashMap();
            throw new NullPointerException(A01(401, 23, 20));
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12049Jw
    public final synchronized InterfaceC12561SF A54(EnumC12562SG enumC12562SG) {
        if (enumC12562SG.A03() == EnumC12564SI.A04) {
            if (this.A09.containsKey(enumC12562SG)) {
                return this.A09.get(enumC12562SG);
            }
            C12052Jz c12052Jz = new C12052Jz(enumC12562SG);
            this.A09.put(enumC12562SG, c12052Jz);
            Iterator<InterfaceC12580SY> it = this.A07.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A01(377, 24, 120));
            }
            String.format(Locale.US, A01(153, 35, 123), enumC12562SG);
            return c12052Jz;
        }
        throw new IllegalArgumentException(A01(47, 59, 101));
    }

    static {
        A05();
    }

    public C1129071(C113257j c113257j, InterfaceC1134280 interfaceC1134280, InterfaceC12536Rq interfaceC12536Rq, String str, InterfaceC12576SU interfaceC12576SU, C12575ST c12575st, InterfaceC12565SJ interfaceC12565SJ) {
        this.A00 = c113257j;
        this.A01 = interfaceC1134280;
        this.A02 = interfaceC12536Rq;
        this.A06 = str;
        this.A05 = interfaceC12576SU;
        this.A04 = c12575st;
        this.A03 = interfaceC12565SJ.A4r(this);
    }

    public static int A00(JSONObject jSONObject) throws JSONException {
        int time = jSONObject.getJSONObject(A01(335, 7, 5)).getInt(A01(446, 16, 108));
        if (time > 0) {
            return time;
        }
        throw new JSONException(String.format(Locale.US, A01(129, 24, 44), Integer.valueOf(time)));
    }

    private Set<InterfaceC12579SX> A02(JSONObject jSONObject) throws JSONException {
        HashSet hashSet = new HashSet();
        JSONObject jSONObject2 = jSONObject.getJSONObject(A01(369, 8, 52));
        JSONObject data = jSONObject.getJSONObject(A01(298, 7, 109));
        Iterator<C12052Jz> it = this.A09.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0B;
            if (strArr[6].length() != strArr[0].length()) {
                String[] strArr2 = A0B;
                strArr2[1] = "GiFNWD8Qhge";
                strArr2[3] = "8JT";
                if (hasNext) {
                    C12052Jz next = it.next();
                    switch (EnumC12584Sc.A00(jSONObject2.getString(next.A7Y().A04()))) {
                        case A03:
                            JSONObject fingerprint = data.getJSONObject(next.A7Y().A04()).getJSONObject(A01(312, 4, 3));
                            JSONObject responseObject = data.getJSONObject(next.A7Y().A04()).optJSONObject(A01(316, 11, 43));
                            hashSet.add(new AbstractC12044Jr(next, fingerprint, responseObject) { // from class: com.facebook.ads.redexgen.X.76
                                public final JSONObject A00;
                                public final JSONObject A01;

                                {
                                    EnumC12584Sc enumC12584Sc = EnumC12584Sc.A03;
                                    this.A00 = fingerprint;
                                    this.A01 = responseObject;
                                }

                                @Override // com.facebook.ads.redexgen.p370X.AbstractC12044Jr, com.facebook.ads.redexgen.p370X.InterfaceC12579SX
                                public final void A3v(Map<InterfaceC12561SF, EnumC12584Sc> map, Map<SyncModifiableBundle, EnumC12571SP> map2) {
                                    super.A00.A03(this.A00, this.A01);
                                    super.A3v(map, map2);
                                }
                            });
                            break;
                        case A04:
                            hashSet.add(new AbstractC12044Jr(next) { // from class: com.facebook.ads.redexgen.X.73
                                {
                                    EnumC12584Sc enumC12584Sc = EnumC12584Sc.A04;
                                }
                            });
                            break;
                        default:
                            throw new AssertionError();
                    }
                } else {
                    Iterator<AbstractC1129579> it2 = this.A08.values().iterator();
                    while (it2.hasNext()) {
                        it2.next();
                        InterfaceC12561SF interfaceC12561SF = null;
                        switch (EnumC12571SP.A00(jSONObject2.getString(interfaceC12561SF.A7Y().A04()))) {
                            case A03:
                                hashSet.add(new AbstractC12045Js(null) { // from class: com.facebook.ads.redexgen.X.77
                                    {
                                        EnumC12571SP enumC12571SP = EnumC12571SP.A03;
                                    }
                                });
                                break;
                            case A04:
                                hashSet.add(new AbstractC12045Js(null) { // from class: com.facebook.ads.redexgen.X.72
                                    public static byte[] A00;

                                    static {
                                        A01();
                                    }

                                    public static String A00(int i, int i2, int i3) {
                                        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
                                        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 102);
                                        }
                                        return new String(copyOfRange);
                                    }

                                    public static void A01() {
                                        A00 = new byte[]{48, 34, 49, 15, 34, 46, 50, 38, 47, 34, 48, 16, 54, 43, 32};
                                    }

                                    {
                                        EnumC12571SP enumC12571SP = EnumC12571SP.A04;
                                    }

                                    @Override // com.facebook.ads.redexgen.p370X.AbstractC12045Js, com.facebook.ads.redexgen.p370X.InterfaceC12579SX
                                    public final void A3v(Map<InterfaceC12561SF, EnumC12584Sc> map, Map<SyncModifiableBundle, EnumC12571SP> map2) {
                                        throw new NullPointerException(A00(0, 15, 87));
                                    }
                                });
                                break;
                            default:
                                throw new AssertionError();
                        }
                    }
                    return hashSet;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    private JSONObject A03(Map<InterfaceC12561SF, EnumC12583Sb> map, Map<SyncModifiableBundle, EnumC12570SO> map2, Map<SyncModifiableBundle, JSONObject> clientBundleData, Map<SyncModifiableBundle, JSONObject> clientBundleFingerprint) throws JSONException {
        String A01;
        JSONObject syncRequest = new JSONObject();
        for (Map.Entry<InterfaceC12561SF, EnumC12583Sb> entry : map.entrySet()) {
            syncRequest.put(entry.getKey().A7Y().A04(), entry.getValue().A03());
        }
        for (Map.Entry<SyncModifiableBundle, EnumC12570SO> entry2 : map2.entrySet()) {
            entry2.getKey();
            InterfaceC12561SF interfaceC12561SF = null;
            String A04 = interfaceC12561SF.A7Y().A04();
            String A03 = entry2.getValue().A03();
            String[] strArr = A0B;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0B[4] = "GjL9vB6wh";
            syncRequest.put(A04, A03);
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<Map.Entry<InterfaceC12561SF, EnumC12583Sb>> it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            A01 = A01(316, 11, 43);
            if (!hasNext) {
                break;
            }
            Map.Entry<InterfaceC12561SF, EnumC12583Sb> next = it.next();
            if (next.getValue() == EnumC12583Sb.A05) {
                JSONObject updateData = new JSONObject();
                InterfaceC12561SF key = next.getKey();
                jSONObject.put(key.A7Y().A04(), updateData);
                if (next.getKey().A7Y().A05()) {
                    JSONObject request = key.A7T();
                    updateData.put(A01, request);
                } else {
                    updateData.put(A01, JSONObject.NULL);
                }
                EnumC12562SG A7Y = key.A7Y();
                String[] strArr2 = A0B;
                if (strArr2[7].length() != strArr2[2].length()) {
                    String[] strArr3 = A0B;
                    strArr3[1] = "cfjTgROdu8b";
                    strArr3[3] = "qIs";
                    jSONObject.put(A7Y.A04(), updateData);
                } else {
                    A0B[4] = "vaTQWmMwm";
                    jSONObject.put(A7Y.A04(), updateData);
                }
            }
        }
        for (Map.Entry<SyncModifiableBundle, EnumC12570SO> entry3 : map2.entrySet()) {
            JSONObject updateData2 = new JSONObject();
            InterfaceC12561SF key2 = entry3.getKey();
            JSONObject request2 = clientBundleFingerprint.get(entry3.getKey());
            updateData2.put(A01, request2);
            if (entry3.getValue() == EnumC12570SO.A05) {
                String A012 = A01(312, 4, 3);
                JSONObject request3 = clientBundleData.get(key2);
                updateData2.put(A012, request3);
                jSONObject.put(key2.A7Y().A04(), updateData2);
            } else {
                jSONObject.put(key2.A7Y().A04(), updateData2);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry4 : this.A05.A7L().entrySet()) {
            if (entry4.getValue() != null) {
                jSONObject2.put(entry4.getKey(), entry4.getValue());
            }
        }
        JSONObject bundleData = new JSONObject();
        bundleData.put(A01(342, 7, 111), syncRequest);
        bundleData.put(A01(298, 7, 109), jSONObject);
        bundleData.put(A01(305, 7, 75), jSONObject2);
        return bundleData;
    }

    public static void A06(String str, AtomicReference<JSONObject> atomicReference, AtomicReference<Throwable> atomicReference2) {
        String.format(Locale.US, A01(221, 28, 118), str);
        try {
            atomicReference.set((JSONObject) new JSONTokener(str).nextValue());
        } catch (ClassCastException | JSONException e) {
            atomicReference2.set(e);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12049Jw, com.facebook.ads.redexgen.p370X.InterfaceC113317p
    public final void A68() {
        this.A03.A67();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12566SK
    public final void AFt() {
        if (this.A01.A9e()) {
            String str = A01(106, 23, 34) + this.A01.A76().A07() + A01(0, 29, 49);
            A08(new C12582Sa());
            return;
        }
        try {
            if (!C11979Im.A1x(this.A00) || this.A00.A03().A9T()) {
                A04();
                return;
            }
            throw new IllegalStateException(A01(29, 18, 127));
        } catch (Throwable th) {
            String.format(Locale.US, A01(249, 49, 109), Integer.valueOf(this.A04.A01()));
            A08(th);
            this.A03.A66(this.A04.A01());
        }
    }
}
