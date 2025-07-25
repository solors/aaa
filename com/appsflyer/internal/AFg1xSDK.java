package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes2.dex */
public final class AFg1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 0;
    private static byte[] AFInAppEventType = null;
    private static short[] AFKeystoreWrapper = null;

    /* renamed from: e */
    private static int f13061e = 1;
    private static int registerClient;
    private static int valueOf;
    private static int values;

    static {
        AFKeystoreWrapper();
        Color.rgb(0, 0, 0);
        SystemClock.elapsedRealtime();
        TextUtils.getOffsetBefore("", 0);
        SystemClock.elapsedRealtimeNanos();
        View.combineMeasuredStates(0, 0);
        int i = f13061e + 95;
        registerClient = i % 128;
        int i2 = i % 2;
    }

    @NonNull
    private static AFi1ySDK AFInAppEventParameterName(@NonNull AFh1aSDK aFh1aSDK, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        AFh1cSDK aFh1cSDK;
        boolean z = true;
        if (str == null) {
            if (aFh1aSDK.AFKeystoreWrapper != AFh1gSDK.DEFAULT) {
                z = false;
            }
            return new AFi1ySDK(z, AFh1cSDK.NA);
        }
        Object[] objArr = new Object[1];
        m92133a(Color.rgb(0, 0, 0) + 16777155, (short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (-1901123894) - ImageFormat.getBitsPerPixel(0), (-910605926) - View.MeasureSpec.getMode(0), objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFh1aSDK.AFKeystoreWrapper == AFh1gSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = "";
            str3 = intern;
        }
        boolean equals = values(new StringBuilder(str3).reverse().toString(), aFh1aSDK.AFInAppEventType, "android", "v1", str4).equals(str);
        if (equals) {
            aFh1cSDK = AFh1cSDK.SUCCESS;
        } else {
            aFh1cSDK = AFh1cSDK.FAILURE;
        }
        return new AFi1ySDK(equals, aFh1cSDK);
    }

    static void AFKeystoreWrapper() {
        AFInAppEventParameterName = 508919704;
        values = 672383426;
        valueOf = 1497569430;
        AFInAppEventType = new byte[]{-6, -15, 1, 1, 1, -3, 15, -12, -8, 1, 5, -2, -2, -6, 1, 3, -3, -1, -4, 4, 8, -14, 14, -15, 1, -4, 10, -11, -4, 1, 1, -2, -5, 2, -4, 3, 12, -18, -6, 2, 2, -6, 5, -7, 3, -1, 0, -6, -2, 0, -2, -4, 7, -4, 0, -8, 3, 1, -1, -3, -2, 2, -6, -2};
    }

    /* renamed from: a */
    private static void m92133a(int i, short s, byte b, int i2, int i3, Object[] objArr) {
        char c;
        boolean z;
        char c2;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        int length;
        byte[] bArr;
        int i7;
        char c3;
        boolean z5;
        int length2;
        byte[] bArr2;
        boolean z6;
        AFj1bSDK aFj1bSDK = new AFj1bSDK();
        StringBuilder sb2 = new StringBuilder();
        int i8 = ((int) (values ^ (-1575393930485972482L))) + i;
        if (i8 == -1) {
            c = '`';
        } else {
            c = 27;
        }
        if (c != 27) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c2 = 3;
        } else {
            c2 = 30;
        }
        if (c2 == 3) {
            byte[] bArr3 = AFInAppEventType;
            if (bArr3 != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                int i9 = $10 + 25;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    length2 = bArr3.length;
                    bArr2 = new byte[length2];
                } else {
                    length2 = bArr3.length;
                    bArr2 = new byte[length2];
                }
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (z6) {
                        break;
                    }
                    bArr2[i10] = (byte) (bArr3[i10] ^ (-1575393930485972482L));
                    i10++;
                }
                bArr3 = bArr2;
            }
            if (bArr3 != null) {
                i8 = (byte) (((byte) (AFInAppEventType[i3 + ((int) (AFInAppEventParameterName ^ (-1575393930485972482L)))] ^ (-1575393930485972482L))) + ((int) (values ^ (-1575393930485972482L))));
            } else {
                i8 = (short) (((short) (AFKeystoreWrapper[i3 + ((int) (AFInAppEventParameterName ^ (-1575393930485972482L)))] ^ (-1575393930485972482L))) + ((int) (values ^ (-1575393930485972482L))));
            }
        }
        if (i8 > 0) {
            int i11 = ((i3 + i8) - 2) + ((int) (AFInAppEventParameterName ^ (-1575393930485972482L)));
            if (z) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            aFj1bSDK.AFInAppEventType = i11 + i4;
            char c4 = (char) (i2 + ((int) (valueOf ^ (-1575393930485972482L))));
            aFj1bSDK.valueOf = c4;
            sb2.append(c4);
            aFj1bSDK.AFKeystoreWrapper = aFj1bSDK.valueOf;
            byte[] bArr4 = AFInAppEventType;
            if (bArr4 != null) {
                int i12 = $10 + 43;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i7 = 1;
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i7 = 0;
                }
                while (true) {
                    if (i7 < length) {
                        c3 = '\r';
                    } else {
                        c3 = 'B';
                    }
                    if (c3 == 'B') {
                        break;
                    }
                    bArr[i7] = (byte) (bArr4[i7] ^ (-1575393930485972482L));
                    i7++;
                }
                bArr4 = bArr;
            }
            if (bArr4 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            aFj1bSDK.values = 1;
            while (true) {
                if (aFj1bSDK.values < i8) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4) {
                    break;
                }
                int i13 = $11;
                int i14 = i13 + 97;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                if (z3) {
                    byte[] bArr5 = AFInAppEventType;
                    aFj1bSDK.AFInAppEventType = aFj1bSDK.AFInAppEventType - 1;
                    aFj1bSDK.valueOf = (char) (aFj1bSDK.AFKeystoreWrapper + (((byte) (((byte) (bArr5[i6] ^ (-1575393930485972482L))) + s)) ^ b));
                } else {
                    short[] sArr = AFKeystoreWrapper;
                    aFj1bSDK.AFInAppEventType = aFj1bSDK.AFInAppEventType - 1;
                    aFj1bSDK.valueOf = (char) (aFj1bSDK.AFKeystoreWrapper + (((short) (((short) (sArr[i5] ^ (-1575393930485972482L))) + s)) ^ b));
                    int i16 = i13 + 37;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                }
                sb2.append(aFj1bSDK.valueOf);
                aFj1bSDK.AFKeystoreWrapper = aFj1bSDK.valueOf;
                aFj1bSDK.values++;
            }
        }
        objArr[0] = sb2.toString();
    }

    @VisibleForTesting
    private static String values(String str, String str2, String str3, String str4, String str5) {
        boolean z;
        boolean z2;
        String AFInAppEventParameterName2 = AFb1mSDK.AFInAppEventParameterName(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (AFInAppEventParameterName2.length() < 12) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int i = f13061e + 123;
            registerClient = i % 128;
            int i2 = i % 2;
            return AFInAppEventParameterName2;
        }
        String substring = AFInAppEventParameterName2.substring(0, 12);
        int i3 = f13061e + 63;
        registerClient = i3 % 128;
        if (i3 % 2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return substring;
        }
        int i4 = 42 / 0;
        return substring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
        if (r2 != false) goto L13;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFi1ySDK valueOf(@androidx.annotation.NonNull com.appsflyer.internal.AFh1aSDK r6, @androidx.annotation.Nullable java.lang.String r7, @androidx.annotation.NonNull java.lang.String r8, @androidx.annotation.NonNull java.lang.String r9) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            if (r2 == r1) goto L2e
            int r2 = com.appsflyer.internal.AFg1xSDK.f13061e
            int r2 = r2 + 79
            int r3 = r2 % 128
            com.appsflyer.internal.AFg1xSDK.registerClient = r3
            int r2 = r2 % 2
            r2 = 95
            if (r8 == 0) goto L19
            r4 = r2
            goto L1b
        L19:
            r4 = 77
        L1b:
            if (r4 == r2) goto L1e
            goto L2e
        L1e:
            int r3 = r3 + 9
            int r2 = r3 % 128
            com.appsflyer.internal.AFg1xSDK.f13061e = r2
            int r3 = r3 % 2
            if (r9 == 0) goto L2a
            r2 = r1
            goto L2b
        L2a:
            r2 = r0
        L2b:
            if (r2 == 0) goto L2e
            goto L2f
        L2e:
            r1 = r0
        L2f:
            if (r1 != 0) goto L39
            com.appsflyer.internal.AFi1ySDK r6 = new com.appsflyer.internal.AFi1ySDK
            com.appsflyer.internal.AFh1cSDK r7 = com.appsflyer.internal.AFh1cSDK.INTERNAL_ERROR
            r6.<init>(r0, r7)
            return r6
        L39:
            com.appsflyer.internal.AFi1ySDK r6 = AFInAppEventParameterName(r6, r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1xSDK.valueOf(com.appsflyer.internal.AFh1aSDK, java.lang.String, java.lang.String, java.lang.String):com.appsflyer.internal.AFi1ySDK");
    }
}
