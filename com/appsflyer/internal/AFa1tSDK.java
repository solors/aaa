package com.appsflyer.internal;

import com.google.android.exoplayer2.C15633C;
import java.util.Map;

/* loaded from: classes2.dex */
public class AFa1tSDK {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static Object AFLogger$LogLevel;
    private static Object AFPurchaseDetails;
    private static final Map<String, Object> afErrorLogForExcManagerOnly;
    private static byte[] afLogForce;
    public static final Map<Integer, Object> afVerboseLog;
    private static long getCurrency;
    private static byte[] getLevel;
    private static int getPurchaseToken;

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:24:0x006e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, byte r9, short r10) {
        /*
            int r0 = com.appsflyer.internal.AFa1tSDK.$10
            r1 = r0 ^ 73
            r2 = r0 & 73
            r3 = 1
            int r2 = r2 << r3
            int r1 = r1 + r2
            int r2 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.$11 = r2
            int r1 = r1 % 2
            int r9 = -r9
            r1 = r9 | 119(0x77, float:1.67E-43)
            int r1 = r1 << r3
            r9 = r9 ^ 119(0x77, float:1.67E-43)
            int r1 = r1 - r9
            int r9 = -r10
            r10 = r9 & 983(0x3d7, float:1.377E-42)
            r9 = r9 | 983(0x3d7, float:1.377E-42)
            int r10 = r10 + r9
            byte[] r9 = com.appsflyer.internal.AFa1tSDK.$$a
            int r8 = -r8
            int r8 = ~r8
            int r8 = 36 - r8
            int r8 = r8 - r3
            byte[] r2 = new byte[r8]
            r4 = 0
            if (r9 != 0) goto L2a
            r5 = r4
            goto L2b
        L2a:
            r5 = r3
        L2b:
            if (r5 == r3) goto L54
            r5 = r0 | 1
            int r5 = r5 << r3
            r0 = r0 ^ r3
            int r5 = r5 - r0
            int r0 = r5 % 128
            com.appsflyer.internal.AFa1tSDK.$11 = r0
            int r5 = r5 % 2
            r6 = 90
            if (r5 != 0) goto L3f
            r5 = 29
            goto L40
        L3f:
            r5 = r6
        L40:
            if (r5 == r6) goto L48
            r5 = 81
            int r5 = r5 / r4
            goto L48
        L46:
            r8 = move-exception
            throw r8
        L48:
            int r0 = r0 + 77
            int r5 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.$10 = r5
            int r0 = r0 % 2
            r5 = r1
            r0 = r4
            r1 = r10
            goto L6e
        L54:
            r0 = r4
        L55:
            byte r5 = (byte) r1
            r2[r0] = r5
            int r0 = r0 + r3
            if (r0 != r8) goto L61
            java.lang.String r8 = new java.lang.String
            r8.<init>(r2, r4)
            return r8
        L61:
            r5 = r9[r10]
            int r6 = com.appsflyer.internal.AFa1tSDK.$11
            int r6 = r6 + 46
            int r6 = r6 - r3
            int r7 = r6 % 128
            com.appsflyer.internal.AFa1tSDK.$10 = r7
            int r6 = r6 % 2
        L6e:
            r6 = r10 ^ 27
            r10 = r10 & 27
            int r10 = r10 << r3
            int r6 = r6 + r10
            r10 = r6 & (-26)
            r6 = r6 | (-26)
            int r10 = r10 + r6
            r6 = r1 & r5
            r1 = r1 | r5
            int r1 = r1 + r6
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.$$c(int, byte, short):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:714:0x14bc
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            Method dump skipped, instructions count: 6410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.<clinit>():void");
    }

    private AFa1tSDK() {
    }

    public static int AFInAppEventParameterName(int i) {
        char c;
        int i2 = $11;
        int i3 = ((i2 | 123) << 1) - (i2 ^ 123);
        int i4 = i3 % 128;
        $10 = i4;
        if (i3 % 2 != 0) {
            c = 22;
        } else {
            c = '$';
        }
        if (c == '$') {
            Object obj = AFPurchaseDetails;
            int i5 = (i4 + 110) - 1;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr = {Integer.valueOf(i)};
                byte[] bArr = $$a;
                byte b = bArr[11];
                int intValue = ((Integer) Class.forName($$c(bArr[69], b, (short) ((b ^ 137) | (b & 137))), true, (ClassLoader) AFLogger$LogLevel).getMethod($$c(bArr[154], (byte) (-bArr[109]), (short) 632), Integer.TYPE).invoke(obj, objArr)).intValue();
                int i7 = $10;
                int i8 = (i7 & 115) + (i7 | 115);
                $11 = i8 % 128;
                int i9 = i8 % 2;
                return intValue;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        throw null;
    }

    public static int AFInAppEventType(Object obj) {
        boolean z;
        char c;
        int i = $11;
        int i2 = (i & 85) + (i | 85);
        int i3 = i2 % 128;
        $10 = i3;
        if (i2 % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Object obj2 = AFPurchaseDetails;
            int i4 = i3 + 77;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr = {obj};
                byte[] bArr = $$a;
                byte b = bArr[11];
                int intValue = ((Integer) Class.forName($$c(bArr[69], b, (short) (b | 137)), true, (ClassLoader) AFLogger$LogLevel).getMethod($$c(bArr[154], (byte) (-bArr[109]), (short) 632), Object.class).invoke(obj2, objArr)).intValue();
                int i6 = $10;
                int i7 = ((i6 | 85) << 1) - (i6 ^ 85);
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    c = 19;
                } else {
                    c = '`';
                }
                if (c != '`') {
                    int i8 = 4 / 0;
                    return intValue;
                }
                return intValue;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        throw null;
    }

    static void init$0() {
        int i = $10;
        int i2 = (i & 77) + (i | 77);
        $11 = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = new byte[1001];
        System.arraycopy("WÕj#÷\u0015ëÍ;\u0006¿\u00143ñ\u0000ÿ\róÿå%\u0002\u0005ÿß!þóü\f÷\u0015ëÍ>õ\rùÇ%&ú\u0001ñ\b\u0012ý\u0000ó\t\u0006Í/\u0000üýúþ\u0013õ\u0006ÿþ\u000fÙ\"õ\u0005ý\u0003ü\rÛ\u0018\u000fíò!í\u0013ñè\u0014\u0012ø÷\u0015ëÍ@û\u0006¿\u00147ûñÝ3ñ\u0000ÿ\r\rö\u000eýúûÊA\u0004»\u00143ô\u0003øÀ2ï\r\u0001ö\u0006ÿ÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ð%\u0002\u0005ÿß!þóü\fý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u001b%ß\u0018\b\u0002\u0003\u0007Ë!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\róü\u0003â/÷\u0000\r\u0001\u0003ûô\u000bý\u0011ëè\u0018\u000fíò!í\u0013ñþ\u000fÒ#\u0003ù\u000eÑ%\tû÷\u000bñþ\u000fÏ\u001e\u0002\u0005ýß%\tóü\u0003ý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0016!\u0013Î#\u0003ù\fõ\u0001ú\u0004þ\u0002\u0005ýý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0014\u001f\u0012òß!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\rþ\u000fÏ,õ\u0001Þ\u001e\u0002\u0005ýß%\t\u0006õõë\u0007é\bF\u0001±Fû\u000b\u0000öÿ\u0002\b\b\u00adLù\u0001\u000eµë\u0006ê\bë\u0004ì\bë\bè\b\u0005\u0003%Ó/\u0000Õ1ï\t\u0006Ü\u0011\u0011ï\fø\u000fñ\rÜ\u0013\fø÷\u0015ëÍ>õ\rùÇ\u0015)õ\u0012\u0000Ù#ò\u0003\u0001\r\rö\u000eýúûÊ3\u000f\u0000¾\u0013/\u0000×%\u0003óÿ\u000b\u0007ò\u000fÞ\u0013ü\u0003ë\u001fþ\r4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ3Ë÷\u0015ëÍ;\u0006¿\u0016\u001d\u0013íè%\u0002\u0005ÿß!þóü\f\u0003ò\u0003à!\u0013\rö\u000eýúûÊHóü\u0012·\u001d\u001a\u0014Ì1ï\t\u0006÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ö&ÿü\u0005ÿß!þóü\fë\u000b\tð\u000e\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0012\u0005\u001bÐCßñ\u0007ÙSøþ\u0007þ\u000fÏ)õ\u0012\u0000Ù#ò\u0003\u0001\r5ý\u0013íÎ5ý\u0013íÎ\u0001\u0007ù\u000fñ\u0005\u0005\u001a\u0014ú\u0001û\u0003óò\u001bï\u000f\u0000õ\rþ\u000fÒþñ\u0007\u0014ê\u0005\u0006ó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007×\u0011\u0013ôÝ'ù\bø\t\u0006ÿ\t\u0003\u0004ò4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ2Ì÷\u0015ëÍ;\u0006¿Fù\u0003ô\u0005\tþ\u000fÜ\"ý\u0001õ\r\u0002\u0005þ\u000fÍ!\u0011üý\tÿñë\u0011\u0013ô\rö\u000eýúûÊ3\u000f\u0000¾\u0013\"\u0011õ\ró\u000b\u0005Û\u0014\nóü\u0003÷\u0015ëÍ;\u0006¿\u0018#\u0003ùê&ÿü\u0005ÿß!þóü\fþ\ré\u001b÷\u000bñ÷\u0015ëÍ;\u0006¿\u001b\u0006ö3ë\u0002\u000b\u0004õ\u0006ÿñ\u0013ôä\u001d\n\u0001þ\u000fÕ%û\u000bõø\u000bÕ/\u0000üýúþ\u0013õ\u0006ÿ÷\u0015ëÍ;\u0006¿\u0018#\u0003ùë\u0003í\b\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r¼;\u0005\u0006ñ\rüó\u000bÂ\u0013\u0005\u001bÐEÝñ\u0007Ù\u0000\u0012ý\u0000ó\t\u0006à\u0015\u0004øè\u001c\u0003\u0000ý\n÷\u0015ëÍ;\u0006¿\u0018#\u0003ùß!\u000eð\u000f÷\u0007\u0004û\u0003ûÓ7ûñÜ1\u0000ï\u0018\u0003ò\u0003ß)õ\u0012\u0000\fþÁ3\u000f\u0000\u0003ó\u0006\rì\rûï\u000f\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0012\u0005\u001bÐEÝñ\u0007Ù\u0000ó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007Ë%\tóþ\u0011û\u0003÷ü\u000e÷\u0015ëÍ;\u0006¿\u001b%\u0002\u0005ÿß!þóü\f".getBytes(C15633C.ISO88591_NAME), 0, bArr, 0, 1001);
        $$a = bArr;
        $$b = 142;
        int i4 = $10;
        int i5 = ((i4 | 99) << 1) - (i4 ^ 99);
        $11 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static Object valueOf(int i, int i2, char c) {
        byte[] bArr;
        int i3 = $11;
        boolean z = true;
        int i4 = (i3 ^ 61) + ((i3 & 61) << 1);
        int i5 = i4 % 128;
        $10 = i5;
        int i6 = i4 % 2;
        Object obj = AFPurchaseDetails;
        int i7 = i5 + 33;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = (i5 + 120) - 1;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c)};
            byte b = $$a[11];
            Class<?> cls = Class.forName($$c(bArr[69], b, (short) ((b ^ 137) | (b & 137))), true, (ClassLoader) AFLogger$LogLevel);
            String $$c = $$c(bArr[230], bArr[42], (short) 456);
            Class<?> cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i11 = $11 + 119;
            $10 = i11 % 128;
            if (i11 % 2 == 0) {
                z = true;
            }
            if (z) {
                return invoke;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
