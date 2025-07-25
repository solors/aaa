package com.facebook.ads.redexgen.p370X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.GC */
/* loaded from: assets/audience_network.dex */
public final class C11825GC {
    public static byte[] A07;
    public static String[] A08 = {"8ynjxGuvqhEK6HfwGz4huo4aEJumTbl9", "NQLxoEekrmTrbdkQbYiEmw9U8A", "A7wePrDRFUe5oDe3z7CQumm14hMskdd5", "dWtbDx1", "U1JmOT8CtllLd5omv4HbWcgryxPwPNTJ", "82VKBP1", "VTB1AgJpGnH13J8WHYKYhxqoccEXo0Al", "jD6Ac3Tj6h7jGdKoRkcqzsP79IKcaoo7"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02 = new Paint();
    public final Paint A03;
    public final C11817G4 A04;
    public final C11818G5 A05;
    public final C11824GB A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C11817G4 A04(C11938I3 c11938i3, int i) {
        int A04;
        int A042;
        int A043;
        int A044;
        int i2 = 8;
        int A045 = c11938i3.A04(8);
        c11938i3.A08(8);
        int i3 = i - 2;
        int[] A0F = A0F();
        int[] A0G = A0G();
        int[] A0H = A0H();
        while (i3 > 0) {
            int A046 = c11938i3.A04(i2);
            int A047 = c11938i3.A04(i2);
            int i4 = i3 - 2;
            int[] iArr = (A047 & 128) != 0 ? A0F : (A047 & 64) != 0 ? A0G : A0H;
            if ((A047 & 1) != 0) {
                A04 = c11938i3.A04(i2);
                A042 = c11938i3.A04(i2);
                A043 = c11938i3.A04(i2);
                A044 = c11938i3.A04(i2);
                i3 = i4 - 4;
            } else {
                A04 = c11938i3.A04(6) << 2;
                A042 = c11938i3.A04(4) << 4;
                A043 = c11938i3.A04(4) << 4;
                A044 = c11938i3.A04(2) << 6;
                i3 = i4 - 2;
            }
            if (A04 == 0) {
                A042 = 0;
                A043 = 0;
                A044 = 255;
            }
            iArr[A046] = A00((byte) (255 - (A044 & 255)), AbstractC11953IK.A06((int) (A04 + ((A042 - 128) * 1.402d)), 0, 255), AbstractC11953IK.A06((int) ((A04 - ((A043 - 128) * 0.34414d)) - ((A042 - 128) * 0.71414d)), 0, 255), AbstractC11953IK.A06((int) (A04 + ((A043 - 128) * 1.772d)), 0, 255));
            i2 = 8;
        }
        return new C11817G4(A045, A0F, A0G, A0H);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C11818G5 A05(C11938I3 c11938i3) {
        int i;
        int i2;
        int i3;
        int i4;
        c11938i3.A08(4);
        boolean A0F = c11938i3.A0F();
        c11938i3.A08(3);
        int A04 = c11938i3.A04(16);
        int A042 = c11938i3.A04(16);
        if (A0F) {
            i = c11938i3.A04(16);
            i4 = c11938i3.A04(16);
            i2 = c11938i3.A04(16);
            i3 = c11938i3.A04(16);
        } else {
            i = 0;
            i2 = 0;
            i3 = A042;
            i4 = A04;
        }
        return new C11818G5(A04, A042, i, i4, i2, i3);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C11822G9 A08(C11938I3 c11938i3, int i) {
        int i2 = 8;
        int A04 = c11938i3.A04(8);
        c11938i3.A08(4);
        boolean A0F = c11938i3.A0F();
        c11938i3.A08(3);
        int A042 = c11938i3.A04(16);
        int A043 = c11938i3.A04(16);
        int A044 = c11938i3.A04(3);
        int A045 = c11938i3.A04(3);
        c11938i3.A08(2);
        int A046 = c11938i3.A04(8);
        int A047 = c11938i3.A04(8);
        int A048 = c11938i3.A04(4);
        int A049 = c11938i3.A04(2);
        c11938i3.A08(2);
        int i3 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int A0410 = c11938i3.A04(16);
            int A0411 = c11938i3.A04(2);
            int A0412 = c11938i3.A04(2);
            int A0413 = c11938i3.A04(12);
            c11938i3.A08(4);
            int A0414 = c11938i3.A04(12);
            i3 -= 6;
            int i4 = 0;
            int i5 = 0;
            if (A0411 == 1 || A0411 == 2) {
                i4 = c11938i3.A04(i2);
                i5 = c11938i3.A04(i2);
                i3 -= 2;
                String[] strArr = A08;
                if (strArr[5].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                A08[1] = "TVBzy0qXZAp8MmoWSjJzaLxcgs";
            }
            sparseArray.put(A0410, new C11823GA(A0411, A0412, A0413, A0414, i4, i5));
            i2 = 8;
        }
        return new C11822G9(A04, A0F, A042, A043, A044, A045, A046, A047, A048, A049, sparseArray);
    }

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{121, -106, -87, -106, 85, -101, -98, -102, -95, -103, 85, -95, -102, -93, -100, -87, -99, 85, -102, -83, -104, -102, -102, -103, -88, 85, -95, -98, -94, -98, -87, -74, -24, -44, -62, -45, -28, -27, -41, -28};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final List<C11805Fs> A0I(byte[] bArr, int i) {
        C11938I3 c11938i3 = new C11938I3(bArr, i);
        while (c11938i3.A01() >= 48 && c11938i3.A04(8) == 15) {
            A0C(c11938i3, this.A06);
        }
        if (this.A06.A01 == null) {
            return Collections.emptyList();
        }
        C11818G5 c11818g5 = this.A06.A00 != null ? this.A06.A00 : this.A05;
        if (this.A00 == null || c11818g5.A05 + 1 != this.A00.getWidth() || c11818g5.A00 + 1 != this.A00.getHeight()) {
            this.A00 = Bitmap.createBitmap(c11818g5.A05 + 1, c11818g5.A00 + 1, Bitmap.Config.ARGB_8888);
            this.A01.setBitmap(this.A00);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C11821G8> sparseArray = this.A06.A01.A03;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            C11821G8 valueAt = sparseArray.valueAt(i2);
            C11822G9 c11822g9 = this.A06.A08.get(sparseArray.keyAt(i2));
            int i3 = valueAt.A00 + c11818g5.A02;
            int i4 = valueAt.A01 + c11818g5.A04;
            int min = Math.min(c11822g9.A08 + i3, c11818g5.A01);
            int i5 = c11822g9.A02 + i4;
            int i6 = c11818g5.A03;
            if (A08[4].charAt(24) == 'N') {
                throw new RuntimeException();
            }
            A08[4] = "3k1bLSmeVMMbgOcaW30zy1SdV300Zn1R";
            this.A01.clipRect(i3, i4, min, Math.min(i5, i6), Region.Op.REPLACE);
            C11817G4 c11817g4 = this.A06.A06.get(c11822g9.A00);
            if (c11817g4 == null && (c11817g4 = this.A06.A04.get(c11822g9.A00)) == null) {
                c11817g4 = this.A04;
            }
            SparseArray<C11823GA> sparseArray2 = c11822g9.A09;
            String[] strArr = A08;
            if (strArr[5].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A08[1] = "JjoMguGs1qt7GN1pTvjIzDQaCf";
            int i7 = 0;
            while (i7 < sparseArray2.size()) {
                int keyAt = sparseArray2.keyAt(i7);
                C11823GA valueAt2 = sparseArray2.valueAt(i7);
                C11819G6 c11819g6 = this.A06.A07.get(keyAt);
                if (c11819g6 == null) {
                    c11819g6 = this.A06.A05.get(keyAt);
                }
                if (c11819g6 != null) {
                    A0B(c11819g6, c11817g4, c11822g9.A01, i3 + valueAt2.A02, i4 + valueAt2.A05, c11819g6.A01 ? null : this.A02, this.A01);
                }
                i7++;
                if (A08[2].charAt(19) != '3') {
                    String[] strArr2 = A08;
                    strArr2[5] = "xSTCNLC";
                    strArr2[3] = "SHujbXn";
                } else {
                    A08[6] = "3gGlAGYtRyGpn5rL0vQCRHGDsmQahIPQ";
                }
            }
            if (c11822g9.A0A) {
                this.A03.setColor(c11822g9.A01 == 3 ? c11817g4.A03[c11822g9.A07] : c11822g9.A01 == 2 ? c11817g4.A02[c11822g9.A06] : c11817g4.A01[c11822g9.A05]);
                this.A01.drawRect(i3, i4, c11822g9.A08 + i3, c11822g9.A02 + i4, this.A03);
            }
            arrayList.add(new C11805Fs(Bitmap.createBitmap(this.A00, i3, i4, c11822g9.A08, c11822g9.A02), i3 / c11818g5.A05, 0, i4 / c11818g5.A00, 0, c11822g9.A08 / c11818g5.A05, c11822g9.A02 / c11818g5.A00));
            this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, 15};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public C11825GC(int i, int i2) {
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        this.A03 = new Paint();
        this.A03.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new C11818G5(719, 575, 0, 719, 0, 575);
        this.A04 = new C11817G4(0, A0F(), A0G(), A0H());
        this.A06 = new C11824GB(i, i2);
    }

    public static int A00(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int A01(C11938I3 c11938i3, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3 = i;
        boolean z = false;
        do {
            int i4 = 0;
            byte A04 = c11938i3.A04(2);
            if (A08[4].charAt(24) != 'N') {
                A08[4] = "HrbNpNFlv98dQSYIGN1QikeC8F3JgSwg";
                if (A04 != 0) {
                    i4 = 1;
                } else if (c11938i3.A0F()) {
                    i4 = c11938i3.A04(3) + 3;
                    A04 = c11938i3.A04(2);
                } else if (c11938i3.A0F()) {
                    i4 = 1;
                    if (A08[2].charAt(19) != '3') {
                        A08[4] = "HLIBFdOcBcQ13vsz9vC4X3h7S8RvBqZM";
                        A04 = 0;
                    }
                } else {
                    switch (c11938i3.A04(2)) {
                        case 0:
                            z = true;
                            A04 = 0;
                            break;
                        case 1:
                            i4 = 2;
                            A04 = 0;
                            break;
                        case 2:
                            i4 = c11938i3.A04(4) + 12;
                            A04 = c11938i3.A04(2);
                            break;
                        case 3:
                            i4 = c11938i3.A04(8) + 29;
                            A04 = c11938i3.A04(2);
                            break;
                        default:
                            A04 = 0;
                            break;
                    }
                }
                if (i4 != 0 && paint != null) {
                    if (bArr != null) {
                        A04 = bArr[A04];
                    }
                    paint.setColor(iArr[A04]);
                    canvas.drawRect(i3, i2, i3 + i4, i2 + 1, paint);
                }
                i3 += i4;
            }
            throw new RuntimeException();
        } while (!z);
        return i3;
    }

    public static int A02(C11938I3 c11938i3, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int i3 = i;
        boolean z = false;
        do {
            int peek = 0;
            byte A04 = c11938i3.A04(4);
            if (A04 != 0) {
                peek = 1;
            } else if (!c11938i3.A0F()) {
                int A042 = c11938i3.A04(3);
                if (A042 != 0) {
                    peek = A042 + 2;
                    A04 = 0;
                } else {
                    z = true;
                    A04 = 0;
                }
            } else if (!c11938i3.A0F()) {
                peek = c11938i3.A04(2) + 4;
                A04 = c11938i3.A04(4);
            } else {
                switch (c11938i3.A04(2)) {
                    case 0:
                        peek = 1;
                        A04 = 0;
                        break;
                    case 1:
                        peek = 2;
                        A04 = 0;
                        break;
                    case 2:
                        peek = c11938i3.A04(4) + 9;
                        A04 = c11938i3.A04(4);
                        break;
                    case 3:
                        peek = c11938i3.A04(8) + 25;
                        A04 = c11938i3.A04(4);
                        break;
                    default:
                        A04 = 0;
                        break;
                }
            }
            if (peek != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                int i4 = iArr[A04];
                String[] strArr = A08;
                if (strArr[5].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                A08[6] = "99qTAMz5ObSXEsnosFsE0iIiJXmhlgSb";
                paint.setColor(i4);
                canvas.drawRect(i3, i2, i3 + peek, i2 + 1, paint);
            }
            i3 += peek;
        } while (!z);
        return i3;
    }

    public static int A03(C11938I3 c11938i3, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int A04;
        boolean z = false;
        do {
            byte A042 = c11938i3.A04(8);
            if (A042 != 0) {
                A04 = 1;
            } else if (!c11938i3.A0F()) {
                A04 = c11938i3.A04(7);
                if (A04 != 0) {
                    A042 = 0;
                } else {
                    z = true;
                    A04 = 0;
                    A042 = 0;
                }
            } else {
                A04 = c11938i3.A04(7);
                A042 = c11938i3.A04(8);
            }
            if (A04 != 0 && paint != null) {
                if (bArr != null) {
                    A042 = bArr[A042];
                }
                paint.setColor(iArr[A042]);
                canvas.drawRect(i, i2, i + A04, i2 + 1, paint);
            }
            i += A04;
            if (A08[2].charAt(19) == '3') {
                throw new RuntimeException();
            }
            A08[6] = "VUlHAiRwnKVSYNNIm22gyVEFvpJ5tK4N";
        } while (!z);
        return i;
    }

    public static C11819G6 A06(C11938I3 c11938i3) {
        int A04 = c11938i3.A04(16);
        c11938i3.A08(4);
        int objectCodingMethod = c11938i3.A04(2);
        boolean A0F = c11938i3.A0F();
        c11938i3.A08(1);
        byte[] bottomFieldData = null;
        byte[] bArr = null;
        if (objectCodingMethod == 1) {
            int numberOfCodes = c11938i3.A04(8);
            c11938i3.A08(numberOfCodes * 16);
        } else if (objectCodingMethod == 0) {
            int A042 = c11938i3.A04(16);
            int topFieldDataLength = c11938i3.A04(16);
            if (A042 > 0) {
                bottomFieldData = new byte[A042];
                int objectId = A08[2].charAt(19);
                if (objectId == 51) {
                    throw new RuntimeException();
                }
                A08[6] = "RKYJA8yEMhap3nvsTUFIJMEemn1r9hAW";
                c11938i3.A0E(bottomFieldData, 0, A042);
            }
            if (topFieldDataLength > 0) {
                bArr = new byte[topFieldDataLength];
                c11938i3.A0E(bArr, 0, topFieldDataLength);
            } else {
                bArr = bottomFieldData;
            }
        }
        return new C11819G6(A04, A0F, bottomFieldData, bArr);
    }

    public static C11820G7 A07(C11938I3 c11938i3, int i) {
        int A04 = c11938i3.A04(8);
        int A042 = c11938i3.A04(4);
        int A043 = c11938i3.A04(2);
        c11938i3.A08(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int remainingLength = c11938i3.A04(8);
            c11938i3.A08(8);
            int version = c11938i3.A04(16);
            int timeoutSecs = c11938i3.A04(16);
            i2 -= 6;
            sparseArray.put(remainingLength, new C11821G8(version, timeoutSecs));
        }
        return new C11820G7(A04, A042, A043, sparseArray);
    }

    public static void A0B(C11819G6 c11819g6, C11817G4 c11817g4, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = c11817g4.A03;
        } else if (i == 2) {
            iArr = c11817g4.A02;
        } else {
            iArr = c11817g4.A01;
        }
        A0D(c11819g6.A03, iArr, i, i2, i3, paint, canvas);
        A0D(c11819g6.A02, iArr, i, i2, i3 + 1, paint, canvas);
    }

    public static void A0C(C11938I3 c11938i3, C11824GB c11824gb) {
        int pageId = c11938i3.A04(8);
        int A04 = c11938i3.A04(16);
        int A042 = c11938i3.A04(16);
        int dataFieldLimit = c11938i3.A02() + A042;
        int dataFieldLength = A042 * 8;
        int segmentType = c11938i3.A01();
        if (dataFieldLength > segmentType) {
            Log.w(A09(31, 9, 112), A09(0, 31, 51));
            int segmentType2 = c11938i3.A01();
            c11938i3.A08(segmentType2);
            return;
        }
        switch (pageId) {
            case 16:
                int segmentType3 = c11824gb.A03;
                if (A04 == segmentType3) {
                    C11820G7 c11820g7 = c11824gb.A01;
                    C11820G7 A072 = A07(c11938i3, A042);
                    int segmentType4 = A072.A00;
                    if (segmentType4 != 0) {
                        c11824gb.A01 = A072;
                        c11824gb.A08.clear();
                        c11824gb.A06.clear();
                        c11824gb.A07.clear();
                        break;
                    } else if (c11820g7 != null) {
                        int dataFieldLength2 = c11820g7.A02;
                        int segmentType5 = A072.A02;
                        if (dataFieldLength2 != segmentType5) {
                            c11824gb.A01 = A072;
                            break;
                        }
                    }
                }
                break;
            case 17:
                C11820G7 pageComposition = c11824gb.A01;
                int i = c11824gb.A03;
                String[] strArr = A08;
                String str = strArr[5];
                String str2 = strArr[3];
                int dataFieldLength3 = str.length();
                int segmentType6 = str2.length();
                if (dataFieldLength3 == segmentType6) {
                    A08[4] = "q1WJVeOMaGnpbtvlIttdST2Iz5tS8l4c";
                    if (A04 == i && pageComposition != null) {
                        C11822G9 A082 = A08(c11938i3, A042);
                        int segmentType7 = pageComposition.A00;
                        if (segmentType7 == 0) {
                            SparseArray<C11822G9> sparseArray = c11824gb.A08;
                            int segmentType8 = A082.A03;
                            A082.A00(sparseArray.get(segmentType8));
                        }
                        SparseArray<C11822G9> sparseArray2 = c11824gb.A08;
                        int segmentType9 = A082.A03;
                        sparseArray2.put(segmentType9, A082);
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
                break;
            case 18:
                int segmentType10 = c11824gb.A03;
                if (A04 == segmentType10) {
                    C11817G4 A043 = A04(c11938i3, A042);
                    SparseArray<C11817G4> sparseArray3 = c11824gb.A06;
                    int segmentType11 = A043.A00;
                    sparseArray3.put(segmentType11, A043);
                    break;
                } else {
                    int segmentType12 = c11824gb.A02;
                    if (A04 == segmentType12) {
                        C11817G4 A044 = A04(c11938i3, A042);
                        SparseArray<C11817G4> sparseArray4 = c11824gb.A04;
                        int segmentType13 = A044.A00;
                        sparseArray4.put(segmentType13, A044);
                        break;
                    }
                }
                break;
            case 19:
                int segmentType14 = c11824gb.A03;
                if (A04 == segmentType14) {
                    C11819G6 A06 = A06(c11938i3);
                    SparseArray<C11819G6> sparseArray5 = c11824gb.A07;
                    int segmentType15 = A06.A00;
                    sparseArray5.put(segmentType15, A06);
                    break;
                } else {
                    int segmentType16 = c11824gb.A02;
                    if (A04 == segmentType16) {
                        C11819G6 A062 = A06(c11938i3);
                        SparseArray<C11819G6> sparseArray6 = c11824gb.A05;
                        int segmentType17 = A062.A00;
                        sparseArray6.put(segmentType17, A062);
                        break;
                    }
                }
                break;
            case 20:
                int segmentType18 = c11824gb.A03;
                if (A04 == segmentType18) {
                    c11824gb.A00 = A05(c11938i3);
                    break;
                }
                break;
        }
        int segmentType19 = c11938i3.A02();
        c11938i3.A09(dataFieldLimit - segmentType19);
    }

    public static void A0D(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] clutMapTable4To8;
        byte[] clutMapTable4To82;
        int line = i3;
        C11938I3 c11938i3 = new C11938I3(bArr);
        byte[] clutMapTable2To8 = null;
        byte[] clutMapTable2To4 = null;
        int column = i2;
        while (c11938i3.A01() != 0) {
            switch (c11938i3.A04(8)) {
                case 16:
                    if (i == 3) {
                        clutMapTable4To8 = clutMapTable2To4 == null ? A0A : clutMapTable2To4;
                    } else if (i == 2) {
                        clutMapTable4To8 = clutMapTable2To8 == null ? A09 : clutMapTable2To8;
                    } else {
                        clutMapTable4To8 = null;
                    }
                    column = A01(c11938i3, iArr, clutMapTable4To8, column, line, paint, canvas);
                    c11938i3.A05();
                    break;
                case 17:
                    if (i == 3) {
                        clutMapTable4To82 = 0 == 0 ? A0B : null;
                    } else {
                        clutMapTable4To82 = null;
                    }
                    column = A02(c11938i3, iArr, clutMapTable4To82, column, line, paint, canvas);
                    c11938i3.A05();
                    break;
                case 18:
                    column = A03(c11938i3, iArr, null, column, line, paint, canvas);
                    break;
                case 32:
                    clutMapTable2To8 = A0E(4, 4, c11938i3);
                    break;
                case 33:
                    clutMapTable2To4 = A0E(4, 8, c11938i3);
                    break;
                case 34:
                    clutMapTable2To4 = A0E(16, 8, c11938i3);
                    break;
                case 240:
                    line += 2;
                    column = i2;
                    break;
            }
        }
    }

    public static byte[] A0E(int i, int i2, C11938I3 c11938i3) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c11938i3.A04(i2);
        }
        return bArr;
    }

    public static int[] A0F() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < iArr.length; i++) {
            if (i < 8) {
                int i2 = (i & 1) != 0 ? 255 : 0;
                iArr[i] = A00(255, i2, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i3 = (i & 1) != 0 ? 127 : 0;
                iArr[i] = A00(255, i3, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x016b, code lost:
        if (r9 != 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x016f, code lost:
        if ((r5 & 64) == 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0171, code lost:
        r6[r5] = A00(255, r8, r7, r3 + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0179, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x017b, code lost:
        if (r9 != 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x017e, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0191, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0191, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
        if (r9 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
        r1 = 43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c0, code lost:
        if (r9 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c3, code lost:
        r1 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A0H() {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11825GC.A0H():int[]");
    }

    public final void A0J() {
        this.A06.A00();
    }
}
