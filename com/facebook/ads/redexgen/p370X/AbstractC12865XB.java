package com.facebook.ads.redexgen.p370X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.XB */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12865XB extends AbstractC11861Go {
    public static String[] A01 = {"345", "FfDXMYzxXX", "vOpcwtbjBUDLg7W", "vwl6", "8z1", "veIKYNosptAQN6qLcG3", "gZDMPK8cRuT1y1gEfTueAQyhJzVpTsF6", "gXo"};
    public C11856Gj A00;

    public abstract Pair<C11480AG[], InterfaceC11858Gl[]> A0V(C11856Gj c11856Gj, int[][][] iArr, int[] iArr2) throws C114469h;

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A0Q(com.facebook.ads.redexgen.p370X.InterfaceC11479AF[] r6, com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r7) throws com.facebook.ads.redexgen.p370X.C114469h {
        /*
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L3:
            int r0 = r6.length
            if (r3 >= r0) goto L25
            r2 = r6[r3]
            r1 = 0
        L9:
            int r0 = r7.A01
            if (r1 >= r0) goto L22
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r7.A01(r1)
            int r0 = r2.AH6(r0)
            r0 = r0 & 7
            if (r0 <= r4) goto L1f
            r5 = r3
            r4 = r0
            r0 = 4
            if (r4 != r0) goto L1f
            return r5
        L1f:
            int r1 = r1 + 1
            goto L9
        L22:
            int r3 = r3 + 1
            goto L3
        L25:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.AbstractC12865XB.A0Q(com.facebook.ads.redexgen.X.AF[], com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup):int");
    }

    public static int[] A0R(InterfaceC11479AF interfaceC11479AF, TrackGroup trackGroup) throws C114469h {
        int[] iArr = new int[trackGroup.A01];
        for (int i = 0; i < trackGroup.A01; i++) {
            iArr[i] = interfaceC11479AF.AH6(trackGroup.A01(i));
        }
        return iArr;
    }

    public static int[] A0S(InterfaceC11479AF[] interfaceC11479AFArr) throws C114469h {
        int[] iArr = new int[interfaceC11479AFArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = interfaceC11479AFArr[i].AH8();
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11861Go
    public final C11862Gp A0T(InterfaceC11479AF[] interfaceC11479AFArr, TrackGroupArray trackGroupArray) throws C114469h {
        int[] A0R;
        int[] iArr = new int[interfaceC11479AFArr.length + 1];
        TrackGroup[][] rendererTrackGroups = new TrackGroup[interfaceC11479AFArr.length + 1];
        int[][][] iArr2 = new int[interfaceC11479AFArr.length + 1][];
        for (int i = 0; i < rendererTrackGroups.length; i++) {
            rendererTrackGroups[i] = new TrackGroup[trackGroupArray.A01];
            iArr2[i] = new int[trackGroupArray.A01];
        }
        int[] A0S = A0S(interfaceC11479AFArr);
        for (int rendererIndex = 0; rendererIndex < trackGroupArray.A01; rendererIndex++) {
            TrackGroup group = trackGroupArray.A01(rendererIndex);
            int groupIndex = A0Q(interfaceC11479AFArr, group);
            if (groupIndex == interfaceC11479AFArr.length) {
                int i2 = group.A01;
                if (A01[1].length() == 20) {
                    throw new RuntimeException();
                }
                A01[1] = "Qr8HrRU9lFqgPA0W8kPuONAnzw";
                A0R = new int[i2];
            } else {
                InterfaceC11479AF interfaceC11479AF = interfaceC11479AFArr[groupIndex];
                String[] strArr = A01;
                if (strArr[7].length() != strArr[4].length()) {
                    A0R = A0R(interfaceC11479AF, group);
                } else {
                    A01[6] = "EvETe5B0Bd5mG8cCaH8U5OecDBUSnDnc";
                    A0R = A0R(interfaceC11479AF, group);
                }
            }
            int i3 = iArr[groupIndex];
            rendererTrackGroups[groupIndex][i3] = group;
            iArr2[groupIndex][i3] = A0R;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[interfaceC11479AFArr.length];
        int[] iArr3 = new int[interfaceC11479AFArr.length];
        for (int i4 = 0; i4 < interfaceC11479AFArr.length; i4++) {
            int i5 = iArr[i4];
            trackGroupArrayArr[i4] = new TrackGroupArray((TrackGroup[]) AbstractC11953IK.A0k(rendererTrackGroups[i4], i5));
            iArr2[i4] = (int[][]) AbstractC11953IK.A0k(iArr2[i4], i5);
            iArr3[i4] = interfaceC11479AFArr[i4].A8a();
        }
        C11856Gj c11856Gj = new C11856Gj(iArr3, trackGroupArrayArr, A0S, iArr2, new TrackGroupArray((TrackGroup[]) AbstractC11953IK.A0k(rendererTrackGroups[interfaceC11479AFArr.length], iArr[interfaceC11479AFArr.length])));
        Pair<C11480AG[], InterfaceC11858Gl[]> A0V = A0V(c11856Gj, iArr2, A0S);
        return new C11862Gp((C11480AG[]) A0V.first, (InterfaceC11858Gl[]) A0V.second, c11856Gj);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11861Go
    public final void A0U(Object obj) {
        this.A00 = (C11856Gj) obj;
    }
}
