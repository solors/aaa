package com.facebook.ads.redexgen.p370X;

import android.graphics.Point;
import android.text.TextUtils;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.D1 */
/* loaded from: assets/audience_network.dex */
public final class C11649D1 extends AbstractC12865XB {
    public static byte[] A02;
    public static String[] A03 = {"Khlodgv4nm1JN7pvDudzhLshYnVFJMYj", "c7ah86gyOlUD", "JoZr7ruM8P1CDzAkdNZ", "HjL2B3NAdMNeR5iFqDiYNYNkxiWEx", "oQm2ks6hNiY41q9vro", "ayV7y67njefchB5PWBkMMUfanflb38Cr", "oO7X36UNtbffgy2V6l3ztlPOg46Wx", "Y52Q59EloTeftRYp1OS0iD4QyyXWfCYD"};
    public static final int[] A04;
    public final InterfaceC11857Gk A00;
    public final AtomicReference<DefaultTrackSelector$Parameters> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A03(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue = list.get(i6).intValue();
            if (A0L(trackGroup.A01(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    public static String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A02 = new byte[]{7, 28, 22};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0F(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!A0L(trackGroup.A01(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                list.remove(size);
            }
        }
    }

    static {
        A0E();
        A04 = new int[0];
    }

    public C11649D1() {
        this(null);
    }

    public C11649D1(InterfaceC11857Gk interfaceC11857Gk) {
        this.A00 = interfaceC11857Gk;
        this.A01 = new AtomicReference<>(DefaultTrackSelector$Parameters.A0J);
    }

    public static int A00(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        } else if (i2 == -1) {
            return 1;
        } else {
            return i - i2;
        }
    }

    public static int A01(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A04(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r4, int[] r5, com.facebook.ads.redexgen.p370X.C11850Gb r6) {
        /*
            r3 = 0
            r2 = 0
        L2:
            int r0 = r4.A01
            if (r2 >= r0) goto L17
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r1 = r4.A01(r2)
            r0 = r5[r2]
            boolean r0 = A0J(r1, r0, r6)
            if (r0 == 0) goto L14
            int r3 = r3 + 1
        L14:
            int r2 = r2 + 1
            goto L2
        L17:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11649D1.A04(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup, int[], com.facebook.ads.redexgen.X.Gb):int");
    }

    public static Point A05(boolean z, int tempViewportWidth, int i, int i2, int i3) {
        if (z) {
            if ((i2 > i3) != (tempViewportWidth > i)) {
                tempViewportWidth = i;
                i = tempViewportWidth;
            }
        }
        if (i2 * i >= i3 * tempViewportWidth) {
            return new Point(tempViewportWidth, AbstractC11953IK.A04(tempViewportWidth * i3, i2));
        }
        return new Point(AbstractC11953IK.A04(i * i2, i3), i);
    }

    private final C11630Ci A06(int i, TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C114469h {
        TrackGroup trackGroup = null;
        int trackIndex = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < trackGroupArray.A01; i3++) {
            TrackGroup trackGroup2 = trackGroupArray.A01(i3);
            int[] iArr2 = iArr[i3];
            for (int groupIndex = 0; groupIndex < trackGroup2.A01; groupIndex++) {
                if (A0H(iArr2[groupIndex], defaultTrackSelector$Parameters.A0B)) {
                    int selectedTrackScore = (trackGroup2.A01(groupIndex).A0D & 1) != 0 ? 2 : 1;
                    boolean isDefault = A0H(iArr2[groupIndex], false);
                    String[] strArr = A03;
                    if (strArr[6].length() != strArr[3].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A03;
                    strArr2[0] = "dNPOXoA5s2XMMA0mWcPJLidwRtPmHQYg";
                    strArr2[7] = "mpqhGybSHlFRTMufKuA4cMMwx1NmszYZ";
                    if (isDefault) {
                        selectedTrackScore += 1000;
                    }
                    if (selectedTrackScore > i2) {
                        trackGroup = trackGroup2;
                        trackIndex = groupIndex;
                        i2 = selectedTrackScore;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new C11630Ci(trackGroup, trackIndex);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (r1 <= r21.A02) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
        if (r15 < 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d0, code lost:
        if (r15 < 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
        r0 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.p370X.C11630Ci A07(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r19, int[][] r20, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r21) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11649D1.A07(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, int[][], com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters):com.facebook.ads.redexgen.X.Ci");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c7, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.p370X.C11630Ci A08(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r18, int[][] r19, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r20) throws com.facebook.ads.redexgen.p370X.C114469h {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11649D1.A08(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, int[][], com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters):com.facebook.ads.redexgen.X.Ci");
    }

    public static InterfaceC11858Gl A09(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, InterfaceC11857Gk interfaceC11857Gk) throws C114469h {
        int i2;
        if (defaultTrackSelector$Parameters.A0A) {
            i2 = 24;
        } else {
            i2 = 16;
        }
        boolean z = defaultTrackSelector$Parameters.A09 && (i & i2) != 0;
        for (int i3 = 0; i3 < trackGroupArray.A01; i3++) {
            TrackGroup A01 = trackGroupArray.A01(i3);
            int[] A0O = A0O(A01, iArr[i3], z, i2, defaultTrackSelector$Parameters.A03, defaultTrackSelector$Parameters.A02, defaultTrackSelector$Parameters.A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            if (A0O.length > 0) {
                return ((InterfaceC11857Gk) AbstractC11914Hf.A01(interfaceC11857Gk)).A5A(A01, A0O);
            }
        }
        return null;
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0032 */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.p370X.InterfaceC11858Gl A0A(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r11, int[][] r12, int r13, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r14, com.facebook.ads.redexgen.p370X.InterfaceC11857Gk r15) throws com.facebook.ads.redexgen.p370X.C114469h {
        /*
            r10 = this;
            r3 = -1
            r4 = -1
            r7 = 0
            r6 = 0
        L4:
            int r0 = r11.A01
            if (r6 >= r0) goto L5a
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r5 = r11.A01(r6)
            r9 = r12[r6]
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11649D1.A03
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L28
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L28:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11649D1.A03
            java.lang.String r1 = "5kgCAopkMsZg7F4ZV1xgY9"
            r0 = 4
            r2[r0] = r1
            r0 = 0
        L30:
            int r1 = r5.A01
            if (r0 >= r1) goto L57
            r2 = r9[r0]
            boolean r1 = r14.A0B
            boolean r1 = A0H(r2, r1)
            if (r1 == 0) goto L54
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r8 = r5.A01(r0)
            com.facebook.ads.redexgen.X.Gc r2 = new com.facebook.ads.redexgen.X.Gc
            r1 = r9[r0]
            r2.<init>(r8, r14, r1)
            if (r7 == 0) goto L51
            int r1 = r2.A00(r7)
            if (r1 <= 0) goto L54
        L51:
            r4 = r6
            r3 = r0
            r7 = r2
        L54:
            int r0 = r0 + 1
            goto L30
        L57:
            int r6 = r6 + 1
            goto L4
        L5a:
            r5 = -1
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11649D1.A03
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L75
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L75:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11649D1.A03
            java.lang.String r1 = "M5FLJD12PT3lmaOUQ9XFglzutSHDLZYg"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "9xRNKXhRIKwGRNoeZY9pf18L4ABxNHYN"
            r0 = 7
            r2[r0] = r1
            if (r4 != r5) goto L85
            r0 = 0
            return r0
        L85:
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r2 = r11.A01(r4)
            boolean r0 = r14.A0D
            if (r0 != 0) goto L9f
            if (r15 == 0) goto L9f
            r1 = r12[r4]
            boolean r0 = r14.A09
            int[] r1 = A0N(r2, r1, r0)
            int r0 = r1.length
            if (r0 <= 0) goto L9f
            com.facebook.ads.redexgen.X.Gl r0 = r15.A5A(r2, r1)
            return r0
        L9f:
            com.facebook.ads.redexgen.X.Ci r0 = new com.facebook.ads.redexgen.X.Ci
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11649D1.A0A(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, int[][], int, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters, com.facebook.ads.redexgen.X.Gk):com.facebook.ads.redexgen.X.Gl");
    }

    private final InterfaceC11858Gl A0B(TrackGroupArray trackGroupArray, int[][] iArr, int i, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, InterfaceC11857Gk interfaceC11857Gk) throws C114469h {
        InterfaceC11858Gl interfaceC11858Gl = null;
        if (!defaultTrackSelector$Parameters.A0D && interfaceC11857Gk != null) {
            interfaceC11858Gl = A09(trackGroupArray, iArr, i, defaultTrackSelector$Parameters, interfaceC11857Gk);
        }
        if (interfaceC11858Gl == null) {
            return A07(trackGroupArray, iArr, defaultTrackSelector$Parameters);
        }
        return interfaceC11858Gl;
    }

    public static List<Integer> A0D(TrackGroup trackGroup, int i, int i2, boolean z) {
        ArrayList arrayList = new ArrayList(trackGroup.A01);
        for (int i3 = 0; i3 < trackGroup.A01; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
            return arrayList;
        }
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < trackGroup.A01; i5++) {
            Format A01 = trackGroup.A01(i5);
            if (A03[1].length() == 16) {
                throw new RuntimeException();
            }
            A03[4] = "AsRc";
            if (A01.A0F > 0 && A01.A08 > 0) {
                Point A05 = A05(z, i, i2, A01.A0F, A01.A08);
                int i6 = A01.A0F * A01.A08;
                if (A01.A0F >= ((int) (A05.x * 0.98f)) && A01.A08 >= ((int) (A05.y * 0.98f)) && i6 < i4) {
                    i4 = i6;
                }
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            int size = arrayList.size();
            if (A03[2].length() != 19) {
                throw new RuntimeException();
            }
            A03[4] = "XusxMXAKD";
            for (int i7 = size - 1; i7 >= 0; i7--) {
                int i8 = ((Integer) arrayList.get(i7)).intValue();
                int maxVideoPixelsToRetain = trackGroup.A01(i8).A0E();
                if (maxVideoPixelsToRetain == -1 || maxVideoPixelsToRetain > i4) {
                    arrayList.remove(i7);
                }
            }
        }
        return arrayList;
    }

    public static void A0G(C11856Gj c11856Gj, int[][][] iArr, C11480AG[] c11480agArr, InterfaceC11858Gl[] interfaceC11858GlArr, int i) {
        if (i == 0) {
            return;
        }
        int i2 = -1;
        int i3 = -1;
        boolean z = true;
        int i4 = 0;
        while (true) {
            int tunnelingAudioRendererIndex = c11856Gj.A00();
            boolean z2 = true;
            if (i4 >= tunnelingAudioRendererIndex) {
                break;
            }
            int i5 = c11856Gj.A01(i4);
            InterfaceC11858Gl interfaceC11858Gl = interfaceC11858GlArr[i4];
            if ((i5 == 1 || i5 == 2) && interfaceC11858Gl != null) {
                boolean A0M = A0M(iArr[i4], c11856Gj.A02(i4), interfaceC11858Gl);
                int tunnelingVideoRendererIndex = A03[1].length();
                if (tunnelingVideoRendererIndex == 16) {
                    throw new RuntimeException();
                }
                A03[1] = "";
                if (!A0M) {
                    continue;
                } else if (i5 == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i4;
                } else if (i3 != -1) {
                    z = false;
                    break;
                } else {
                    i3 = i4;
                }
            }
            i4++;
        }
        if (z & ((i2 == -1 || i3 == -1) ? false : false)) {
            C11480AG c11480ag = new C11480AG(i);
            c11480agArr[i2] = c11480ag;
            c11480agArr[i3] = c11480ag;
        }
    }

    public static boolean A0H(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static boolean A0I(Format format) {
        return TextUtils.isEmpty(format.A0N) || A0K(format, A0C(0, 3, 61));
    }

    public static boolean A0J(Format format, int i, C11850Gb c11850Gb) {
        if (A0H(i, false) && format.A05 == c11850Gb.A00) {
            int i2 = format.A0C;
            String[] strArr = A03;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A03[5] = "i1Rv3RXs3qomVMYLbBToUnjZJyACCjVo";
            if (i2 == c11850Gb.A01) {
                return c11850Gb.A02 == null || TextUtils.equals(c11850Gb.A02, format.A0O);
            }
            return false;
        }
        return false;
    }

    public static boolean A0K(Format format, String str) {
        return str != null && TextUtils.equals(str, AbstractC11953IK.A0L(format.A0N));
    }

    public static boolean A0L(Format format, String str, int i, int i2, int i3, int i4, int i5) {
        if (!A0H(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str == null || AbstractC11953IK.A0g(format.A0O, str)) {
            if (format.A0F == -1 || format.A0F <= i3) {
                if (format.A08 == -1 || format.A08 <= i4) {
                    return format.A04 == -1 || format.A04 <= i5;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean A0M(int[][] iArr, TrackGroupArray trackGroupArray, InterfaceC11858Gl interfaceC11858Gl) {
        if (interfaceC11858Gl == null) {
            return false;
        }
        int A00 = trackGroupArray.A00(interfaceC11858Gl.A8Y());
        for (int i = 0; i < interfaceC11858Gl.length(); i++) {
            int trackGroupIndex = iArr[A00][interfaceC11858Gl.A7a(i)] & 32;
            if (trackGroupIndex != 32) {
                return false;
            }
        }
        int trackGroupIndex2 = A03[5].charAt(17);
        if (trackGroupIndex2 != 66) {
            throw new RuntimeException();
        }
        A03[5] = "tG1y1zDJKZkfF9elCBgE5pr6FloJMK6B";
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:23:0x0053 */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A0N(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r9, int[] r10, boolean r11) {
        /*
            r8 = 0
            r7 = 0
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r4 = 0
        L8:
            int r0 = r9.A01
            if (r4 >= r0) goto L4a
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r9.A01(r4)
            com.facebook.ads.redexgen.X.Gb r6 = new com.facebook.ads.redexgen.X.Gb
            int r2 = r0.A05
            int r1 = r0.A0C
            if (r11 == 0) goto L41
            r0 = 0
        L19:
            r6.<init>(r2, r1, r0)
            boolean r0 = r5.add(r6)
            if (r0 == 0) goto L3e
            int r3 = A04(r9, r10, r6)
            if (r3 <= r8) goto L3e
            r7 = r6
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.C11649D1.A03
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 30
            if (r1 == r0) goto L44
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11649D1.A03
            java.lang.String r1 = "QSRO8bxNHUTwbsCCzbG"
            r0 = 2
            r2[r0] = r1
            r8 = r3
        L3e:
            int r4 = r4 + 1
            goto L8
        L41:
            java.lang.String r0 = r0.A0O
            goto L19
        L44:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L4a:
            r0 = 1
            if (r8 <= r0) goto L70
            int[] r5 = new int[r8]
            r4 = 0
            r3 = 0
        L51:
            int r0 = r9.A01
            if (r3 >= r0) goto L6f
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r2 = r9.A01(r3)
            r1 = r10[r3]
            java.lang.Object r0 = com.facebook.ads.redexgen.p370X.AbstractC11914Hf.A01(r7)
            com.facebook.ads.redexgen.X.Gb r0 = (com.facebook.ads.redexgen.p370X.C11850Gb) r0
            boolean r0 = A0J(r2, r1, r0)
            if (r0 == 0) goto L6c
            int r0 = r4 + 1
            r5[r4] = r3
            r4 = r0
        L6c:
            int r3 = r3 + 1
            goto L51
        L6f:
            return r5
        L70:
            int[] r0 = com.facebook.ads.redexgen.p370X.C11649D1.A04
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11649D1.A0N(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup, int[], boolean):int[]");
    }

    public static int[] A0O(TrackGroup trackGroup, int[] iArr, boolean z, int i, int i2, int selectedMimeTypeTrackCount, int i3, int i4, int i5, boolean z2) {
        int countForMimeType;
        if (trackGroup.A01 >= 2) {
            List<Integer> A0D = A0D(trackGroup, i4, i5, z2);
            if (A0D.size() < 2) {
                return A04;
            }
            String selectedMimeType = null;
            if (!z) {
                HashSet hashSet = new HashSet();
                int i6 = 0;
                for (int selectedMimeTypeTrackCount2 = 0; selectedMimeTypeTrackCount2 < A0D.size(); selectedMimeTypeTrackCount2++) {
                    String str = trackGroup.A01(A0D.get(selectedMimeTypeTrackCount2).intValue()).A0O;
                    if (hashSet.add(str) && (countForMimeType = A03(trackGroup, iArr, i, str, i2, selectedMimeTypeTrackCount, i3, A0D)) > i6) {
                        selectedMimeType = str;
                        i6 = countForMimeType;
                    }
                }
            }
            A0F(trackGroup, iArr, i, selectedMimeType, i2, selectedMimeTypeTrackCount, i3, A0D);
            return A0D.size() < 2 ? A04 : AbstractC11953IK.A0j(A0D);
        }
        return A04;
    }

    private final InterfaceC11858Gl[] A0P(C11856Gj c11856Gj, int[][][] iArr, int[] iArr2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C114469h {
        int A00 = c11856Gj.A00();
        InterfaceC11858Gl[] interfaceC11858GlArr = new InterfaceC11858Gl[A00];
        boolean seenVideoRendererWithMappedTracks = false;
        boolean z = false;
        for (int i = 0; i < A00; i++) {
            if (2 == c11856Gj.A01(i)) {
                if (!z) {
                    interfaceC11858GlArr[i] = A0B(c11856Gj.A02(i), iArr[i], iArr2[i], defaultTrackSelector$Parameters, this.A00);
                    z = interfaceC11858GlArr[i] != null;
                }
                seenVideoRendererWithMappedTracks |= c11856Gj.A02(i).A01 > 0;
            }
        }
        boolean z2 = false;
        int rendererCount = 0;
        for (int i2 = 0; i2 < A00; i2++) {
            int A01 = c11856Gj.A01(i2);
            switch (A01) {
                case 1:
                    if (z2) {
                        break;
                    } else {
                        TrackGroupArray A022 = c11856Gj.A02(i2);
                        int[][] iArr3 = iArr[i2];
                        int i3 = iArr2[i2];
                        interfaceC11858GlArr[i2] = A0A(A022, iArr3, i3, defaultTrackSelector$Parameters, seenVideoRendererWithMappedTracks ? null : this.A00);
                        if (interfaceC11858GlArr[i2] != null) {
                            z2 = true;
                            break;
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                case 2:
                    break;
                case 3:
                    if (rendererCount == 0) {
                        interfaceC11858GlArr[i2] = A08(c11856Gj.A02(i2), iArr[i2], defaultTrackSelector$Parameters);
                        InterfaceC11858Gl interfaceC11858Gl = interfaceC11858GlArr[i2];
                        if (A03[4].length() != 30) {
                            A03[4] = "uYzutQ7tTIwb8kcWwqH9k";
                            if (interfaceC11858Gl != null) {
                                rendererCount = 1;
                                break;
                            } else {
                                rendererCount = 0;
                                break;
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        continue;
                    }
                default:
                    interfaceC11858GlArr[i2] = A06(A01, c11856Gj.A02(i2), iArr[i2], defaultTrackSelector$Parameters);
                    break;
            }
        }
        return interfaceC11858GlArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC12865XB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.facebook.ads.redexgen.p370X.C11480AG[], com.facebook.ads.redexgen.p370X.InterfaceC11858Gl[]> A0V(com.facebook.ads.redexgen.p370X.C11856Gj r12, int[][][] r13, int[] r14) throws com.facebook.ads.redexgen.p370X.C114469h {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11649D1.A0V(com.facebook.ads.redexgen.X.Gj, int[][][], int[]):android.util.Pair");
    }
}
