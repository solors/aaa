package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.SignedBytes;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Wm */
/* loaded from: assets/audience_network.dex */
public final class C12840Wm implements InterfaceC11908HZ {
    public static byte[] A02;
    public static String[] A03 = {"Lc6ZOpuSjj1IHjH2AmdfZtL4EvSihTxE", "IELx2s2BPgCyTaxK8MOl1UNvPdICN", "VyVHRG1xUDuOqri22aozQUHlXh3udCdp", "xQTxbie1EDs9qNLRcg8m2j5qa6BjCdLv", "YtJ3b", "RvEZ7gkpXF5RUk3l1kihsAxfWlQybyIP", "tRVDeAYq1jPcmMGohTMj2AD5wcAJrX0H", "cEMi7KsqJ6Y68dGPnFARRJAd4Z3ugaKF"};
    public static final C12840Wm A04;
    public int A00;
    public final Map<String, byte[]> A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 125);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{68, 99, 123, 108, 97, 100, 105, 45, 123, 108, 97, 120, 104, 45, 126, 100, 119, 104, 55, 45, 122, 70, 75, 14, 93, 71, 84, 75, 14, 65, 72, 14, 11, 93, 14, 6, 11, 74, 7, 14, 71, 93, 14, 73, 92, 75, 79, 90, 75, 92, 14, 90, 70, 79, SignedBytes.MAX_POWER_OF_TWO, 14, 67, 79, 86, 71, 67, 91, 67, 14, 79, 66, 66, 65, 89, 75, 74, 20, 14, 11, 74, 104, 105, 123, 16, 5};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A05(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (String str : map.keySet()) {
            byte[] A07 = A07(map.get(str));
            if (A07.length > 10485760) {
                throw new IllegalArgumentException(String.format(A01(20, 55, 83), str, Integer.valueOf(A07.length), 10485760));
            }
            hashMap.put(str, A07);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A06(Map<String, byte[]> map) {
        if (this.A01.size() != map.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : this.A01.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    static {
        A03();
        A04 = new C12840Wm(Collections.emptyMap());
    }

    public C12840Wm(Map<String, byte[]> metadata) {
        this.A01 = Collections.unmodifiableMap(metadata);
    }

    public static C12840Wm A00(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int valueSize = dataInputStream.readInt();
            if (valueSize >= 0 && valueSize <= 10485760) {
                byte[] bArr = new byte[valueSize];
                dataInputStream.readFully(bArr);
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException(A01(0, 20, 112) + valueSize);
            }
        }
        return new C12840Wm(hashMap);
    }

    public static Map<String, byte[]> A02(Map<String, byte[]> otherMetadata, C11910Hb c11910Hb) {
        HashMap hashMap = new HashMap(otherMetadata);
        A04(hashMap, c11910Hb.A04());
        A05(hashMap, c11910Hb.A05());
        return hashMap;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A04(java.util.HashMap<java.lang.String, byte[]> r2, java.util.List<java.lang.String> r3) {
        /*
            r1 = 0
        L1:
            int r0 = r3.size()
            if (r1 >= r0) goto L11
            java.lang.Object r0 = r3.get(r1)
            r2.remove(r0)
            int r1 = r1 + 1
            goto L1
        L11:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12840Wm.A04(java.util.HashMap, java.util.List):void");
    }

    public static byte[] A07(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName(A01(75, 5, 64)));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public final C12840Wm A08(C11910Hb c11910Hb) {
        Map<String, byte[]> A022 = A02(this.A01, c11910Hb);
        if (A06(A022)) {
            return this;
        }
        return new C12840Wm(A022);
    }

    public final void A09(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A01.size());
        for (Map.Entry<String, byte[]> entry : this.A01.entrySet()) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11908HZ
    public final long A6B(String str, long j) {
        if (this.A01.containsKey(str)) {
            byte[] bytes = this.A01.get(str);
            return ByteBuffer.wrap(bytes).getLong();
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11908HZ
    public final String A6D(String str, String str2) {
        if (this.A01.containsKey(str)) {
            return new String(this.A01.get(str), Charset.forName(A01(75, 5, 64)));
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            if (A03[5].charAt(22) != 'A') {
                A03[0] = "dWllOszLC286Wa2jG7unkbyNU8fMVO47";
                return false;
            }
            throw new RuntimeException();
        }
        Map<String, byte[]> map = ((C12840Wm) obj).A01;
        String[] strArr = A03;
        if (strArr[6].charAt(20) != strArr[3].charAt(20)) {
            throw new RuntimeException();
        }
        A03[0] = "y2cTPgBEZJ0CQAPDGqNYJyLCowU9mkWr";
        return A06(map);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i = 0;
            for (Map.Entry<String, byte[]> entry : this.A01.entrySet()) {
                int hashCode = entry.getKey().hashCode();
                int result = Arrays.hashCode(entry.getValue());
                i += hashCode ^ result;
            }
            this.A00 = i;
        }
        int result2 = this.A00;
        return result2;
    }
}
