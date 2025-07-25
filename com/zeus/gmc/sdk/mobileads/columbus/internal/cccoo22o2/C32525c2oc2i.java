package com.zeus.gmc.sdk.mobileads.columbus.internal.cccoo22o2;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cccoo22o2.c2oc2i */
/* loaded from: classes8.dex */
public class C32525c2oc2i {
    private static final String coo2iico = "DigestUtil";
    private static final char[] coi222o222 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] c2oc2i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String coo2iico(byte[] bArr, boolean z) {
        return new String(coo2iico(bArr, z ? coi222o222 : c2oc2i));
    }

    private static char[] coo2iico(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b & 240) >>> 4];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return cArr2;
    }
}
