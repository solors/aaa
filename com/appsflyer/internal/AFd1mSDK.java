package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.google.android.exoplayer2.C15633C;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AFd1mSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long AFInAppEventParameterName = 0;
    private static char[] AFInAppEventType = null;
    private static int registerClient = 1;
    private static int valueOf;
    private final Context AFKeystoreWrapper;
    private final Map<String, Object> values;

    /* loaded from: classes2.dex */
    public static class AFa1zSDK {
        static byte[] AFInAppEventParameterName(@NonNull byte[] bArr) throws Exception {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
            }
            return bArr;
        }

        @NonNull
        static byte[] values(@NonNull String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }
    }

    static {
        boolean z;
        AFInAppEventType();
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getGlobalActionKeyTimeout();
        ViewConfiguration.getZoomControlsTimeout();
        int i = valueOf + 19;
        registerClient = i % 128;
        if (i % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        throw null;
    }

    public AFd1mSDK(Map<String, Object> map, Context context) {
        this.values = map;
        this.AFKeystoreWrapper = context;
        put(AFInAppEventParameterName(), valueOf());
    }

    @NonNull
    private String AFInAppEventParameterName() {
        char c;
        char c2;
        int i = registerClient + 95;
        valueOf = i % 128;
        int i2 = i % 2;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.values;
            Object[] objArr = new Object[1];
            m92171a(false, new int[]{0, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", objArr);
            String obj = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.values;
            Object[] objArr2 = new Object[1];
            m92170b("퉹殴ꇀ￢㔋", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 47581, objArr2);
            String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj2 == null) {
                int i3 = registerClient + 113;
                valueOf = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr3 = new Object[1];
                m92170b("퉕柷뤂\uf2b0Ӆ幵鎇┪", 46499 - TextUtils.indexOf("", "", 0), objArr3);
                obj2 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb2 = new StringBuilder(obj);
            sb2.reverse();
            StringBuilder AFKeystoreWrapper = AFKeystoreWrapper(num, obj2, sb2.toString());
            int length = AFKeystoreWrapper.length();
            if (length > 4) {
                c = 'Z';
            } else {
                c = ']';
            }
            if (c != 'Z') {
                while (true) {
                    if (length < 4) {
                        c2 = 'b';
                    } else {
                        c2 = 'L';
                    }
                    if (c2 != 'b') {
                        break;
                    }
                    length++;
                    AFKeystoreWrapper.append('1');
                }
            } else {
                int i5 = registerClient + 125;
                valueOf = i5 % 128;
                int i6 = i5 % 2;
                AFKeystoreWrapper.delete(4, length);
            }
            Object[] objArr4 = new Object[1];
            m92170b("퉰軃欇", 23741 - KeyEvent.getDeadChar(0, 0), objArr4);
            AFKeystoreWrapper.insert(0, ((String) objArr4[0]).intern());
            return AFKeystoreWrapper.toString();
        } catch (Exception e) {
            Object[] objArr5 = new Object[1];
            m92171a(true, new int[]{12, 40, 0, 8}, "\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            m92170b("퉽\u1ccd伜빒\ue8a2\udbecੱ畽\ua7c6阚션㎴拮괤鱰컌㤌栜媮藫\uf431✸ᇊ䀏덊\ufde4⳺Ἷ乫룈\ueb49\uda57҃矯\ua630酮쏓㈁絞꾔麹쥴", TextUtils.indexOf("", "", 0) + 52919, objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(e);
            AFLogger.afRDLog(sb3.toString());
            Object[] objArr7 = new Object[1];
            m92171a(true, new int[]{52, 7, 0, 7}, "\u0001\u0000\u0000\u0000\u0001\u0001\u0000", objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    static void AFInAppEventType() {
        AFInAppEventType = new char[]{4590, 4541, 4540, 4535, 4528, 4533, 4535, 4530, 4525, 4532, 4537, 4528, 4588, 4486, 4576, 4506, 4539, 4530, 4536, 4509, 4506, 4528, 4528, 4526, 4501, 4498, 4529, 4534, 4507, 4509, 4539, 4534, 4507, 4509, 4532, 4533, 4528, 4532, 4535, 4533, 4535, 4535, 4536, 4509, 4508, 4538, 4534, 4532, 4539, 4541, 4509, 4498, 4546, 4583, 4583, 4583, 4497, 4539, 4534, 4543, 4373, 4371, 4376, 4374, 4368, 4365, 4362, 4383, 4457, 4370, 4364, 4375, 4376, 4457, 4489, 4467, 4464, 4465, 4466, 4465, 4515, 4390, 4392, 4392, 4412, 4375, 4379, 4376, 4415, 4414, 4372, 4413, 4353, 4377, 4375, 4377, 4353, 4390, 4594, 4487, 4485, 4481, 4482, 4487, 4484, 4536, 4527, 4532, 4542, 4543, 4535, 4481, 4488, 4499, 4541, 4445, 4447, 4445, 4446, 4521, 4482, 4536, 4440, 4512, 4447, 4440, 4446, 4542, 4480, 4517, 4447, 4443, 4446, 4512, 4514, 4488, 4468, 4469, 4468, 4477, 4472, 4519, 4373, 4589, 4536, 4530, 4539, 4506, 4506, 4485, 4536, 4526, 4531, 4508, 4508, 4533, 4524, 4526, 4526, 4584, 4537, 4532, 4528, 4539, 4500, 4588, 4495, 4494, 4494, 4494, 4495, 4494, 4494, 4494, 4501};
        AFInAppEventParameterName = 2876202008483560423L;
    }

    private static StringBuilder AFKeystoreWrapper(@NonNull String... strArr) throws Exception {
        char c;
        char c2;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < 3) {
            arrayList.add(Integer.valueOf(strArr[i].length()));
            i++;
            int i2 = registerClient + 125;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb2 = new StringBuilder();
        int i4 = registerClient + 117;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (true) {
            if (i6 < intValue) {
                c = '*';
            } else {
                c = '#';
            }
            if (c != '#') {
                Integer num = null;
                for (int i7 = 0; i7 < 3; i7++) {
                    int i8 = valueOf + 103;
                    registerClient = i8 % 128;
                    if (i8 % 2 != 0) {
                        int charAt = strArr[i7].charAt(i6);
                        if (num == null) {
                            c2 = 'Y';
                        } else {
                            c2 = ':';
                        }
                        if (c2 != 'Y') {
                            charAt ^= num.intValue();
                        } else {
                            int i9 = registerClient + 65;
                            valueOf = i9 % 128;
                            int i10 = i9 % 2;
                        }
                        num = Integer.valueOf(charAt);
                    } else {
                        strArr[i7].charAt(i6);
                        throw null;
                    }
                }
                sb2.append(Integer.toHexString(num.intValue()));
                i6++;
            } else {
                return sb2;
            }
        }
    }

    /* renamed from: a */
    private static void m92171a(boolean z, int[] iArr, String str, Object[] objArr) {
        char c;
        int i;
        boolean z2;
        char c2;
        char c3;
        char c4;
        int i2;
        boolean z3;
        char c5;
        String str2 = str;
        int i3 = $11;
        int i4 = i3 + 87;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        byte[] bArr = str2;
        if (str2 != null) {
            int i6 = i3 + 121;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                c5 = ' ';
            } else {
                c5 = 'U';
            }
            if (c5 != ' ') {
                byte[] bytes = str2.getBytes(C15633C.ISO88591_NAME);
                int i7 = $11 + 17;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                bArr = bytes;
            } else {
                str2.getBytes(C15633C.ISO88591_NAME);
                throw null;
            }
        }
        byte[] bArr2 = bArr;
        AFj1dSDK aFj1dSDK = new AFj1dSDK();
        int i9 = iArr[0];
        boolean z4 = true;
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        char[] cArr = AFInAppEventType;
        if (cArr != null) {
            c = 25;
        } else {
            c = 2;
        }
        if (c != 2) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (true) {
                if (i13 < length) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (z3) {
                    break;
                }
                cArr2[i13] = (char) (cArr[i13] ^ (-6858333183171620386L));
                i13++;
                i12 = i12;
            }
            i = i12;
            cArr = cArr2;
        } else {
            i = i12;
        }
        char[] cArr3 = new char[i10];
        System.arraycopy(cArr, i9, cArr3, 0, i10);
        if (bArr2 != null) {
            char[] cArr4 = new char[i10];
            aFj1dSDK.valueOf = 0;
            char c6 = 0;
            while (true) {
                int i14 = aFj1dSDK.valueOf;
                if (i14 < i10) {
                    c3 = 20;
                } else {
                    c3 = 17;
                }
                if (c3 != 20) {
                    break;
                }
                if (bArr2[i14] == 1) {
                    c4 = '`';
                } else {
                    c4 = '-';
                }
                if (c4 != '`') {
                    cArr4[i14] = (char) ((cArr3[i14] * 2) - c6);
                    i2 = $10 + 29;
                    $11 = i2 % 128;
                } else {
                    cArr4[i14] = (char) (((cArr3[i14] * 2) + 1) - c6);
                    i2 = $11 + 79;
                    $10 = i2 % 128;
                }
                int i15 = i2 % 2;
                c6 = cArr4[i14];
                aFj1dSDK.valueOf = i14 + 1;
            }
            cArr3 = cArr4;
        }
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            char[] cArr5 = new char[i10];
            System.arraycopy(cArr3, 0, cArr5, 0, i10);
            int i16 = i10 - i;
            int i17 = i;
            System.arraycopy(cArr5, 0, cArr3, i16, i17);
            System.arraycopy(cArr5, i17, cArr3, 0, i16);
        }
        if (z) {
            c2 = 3;
        } else {
            c2 = '\'';
        }
        if (c2 != '\'') {
            char[] cArr6 = new char[i10];
            aFj1dSDK.valueOf = 0;
            while (true) {
                int i18 = aFj1dSDK.valueOf;
                if (i18 >= i10) {
                    break;
                }
                cArr6[i18] = cArr3[(i10 - i18) - 1];
                aFj1dSDK.valueOf = i18 + 1;
            }
            cArr3 = cArr6;
        }
        if (i11 <= 0) {
            z4 = false;
        }
        if (z4) {
            aFj1dSDK.valueOf = 0;
            int i19 = $11 + 3;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            while (true) {
                int i21 = aFj1dSDK.valueOf;
                if (i21 >= i10) {
                    break;
                }
                cArr3[i21] = (char) (cArr3[i21] - iArr[2]);
                aFj1dSDK.valueOf = i21 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (r0 != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
        r1 = r1 + 103;
        com.appsflyer.internal.AFd1mSDK.$11 = r1 % 128;
        r1 = r1 % 2;
        r11 = r11.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != true) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1, types: [char[]] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m92170b(java.lang.String r11, int r12, java.lang.Object[] r13) {
        /*
            int r0 = com.appsflyer.internal.AFd1mSDK.$11
            int r0 = r0 + 25
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1mSDK.$10 = r1
            int r0 = r0 % 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1b
            r0 = 12
            int r0 = r0 / r3
            if (r11 == 0) goto L15
            r0 = r3
            goto L16
        L15:
            r0 = r2
        L16:
            if (r0 == r2) goto L2f
            goto L23
        L19:
            r11 = move-exception
            throw r11
        L1b:
            if (r11 == 0) goto L1f
            r0 = r2
            goto L20
        L1f:
            r0 = r3
        L20:
            if (r0 == r2) goto L23
            goto L2f
        L23:
            int r1 = r1 + 103
            int r0 = r1 % 128
            com.appsflyer.internal.AFd1mSDK.$11 = r0
            int r1 = r1 % 2
            char[] r11 = r11.toCharArray()
        L2f:
            char[] r11 = (char[]) r11
            com.appsflyer.internal.AFk1xSDK r0 = new com.appsflyer.internal.AFk1xSDK
            r0.<init>()
            r0.AFInAppEventType = r12
            int r12 = r11.length
            long[] r1 = new long[r12]
            r0.values = r3
        L3d:
            int r2 = r0.values
            int r4 = r11.length
            if (r2 >= r4) goto L6d
            int r4 = com.appsflyer.internal.AFd1mSDK.$11
            int r5 = r4 + 23
            int r6 = r5 % 128
            com.appsflyer.internal.AFd1mSDK.$10 = r6
            int r5 = r5 % 2
            char r5 = r11[r2]
            long r5 = (long) r5
            long r7 = (long) r2
            int r9 = r0.AFInAppEventType
            long r9 = (long) r9
            long r7 = r7 * r9
            long r5 = r5 ^ r7
            long r7 = com.appsflyer.internal.AFd1mSDK.AFInAppEventParameterName
            r9 = -6362143322652431876(0xa7b5205b2b2da9fc, double:-2.094435621236843E-117)
            long r7 = r7 ^ r9
            long r5 = r5 ^ r7
            r1[r2] = r5
            int r2 = r2 + 1
            r0.values = r2
            int r4 = r4 + 117
            int r2 = r4 % 128
            com.appsflyer.internal.AFd1mSDK.$10 = r2
            int r4 = r4 % 2
            goto L3d
        L6d:
            char[] r12 = new char[r12]
            r0.values = r3
        L71:
            int r2 = r0.values
            int r4 = r11.length
            if (r2 >= r4) goto L93
            int r4 = com.appsflyer.internal.AFd1mSDK.$11
            int r5 = r4 + 103
            int r6 = r5 % 128
            com.appsflyer.internal.AFd1mSDK.$10 = r6
            int r5 = r5 % 2
            r5 = r1[r2]
            int r5 = (int) r5
            char r5 = (char) r5
            r12[r2] = r5
            int r2 = r2 + 1
            r0.values = r2
            int r4 = r4 + 3
            int r2 = r4 % 128
            com.appsflyer.internal.AFd1mSDK.$10 = r2
            int r4 = r4 % 2
            goto L71
        L93:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r12)
            r13[r3] = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1mSDK.m92170b(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String valueOf() {
        /*
            Method dump skipped, instructions count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1mSDK.valueOf():java.lang.String");
    }
}
