package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.internal.androidx.support.p369v7.widget.RecyclerView$SavedState;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.FL */
/* loaded from: assets/audience_network.dex */
public class C11774FL extends ViewGroup implements InterfaceC110583A {
    public static byte[] A18;
    public static String[] A19 = {"EVtiEz0XwzmAcv0NfW8PxL5EkbzIoYic", "JvoTrXnfxJUplw5tP56Ros2T7Gsfofpu", "CB3RTx10Tt9OnvYftpvuMygLYd0xmG3f", "iCoGDb0mnoj0sn99iJ8fx9KF0Zt33I3a", "ipdvxhFfLLm3eGkYLsOkZJNxKW1ljoxp", "EVaiAhpvjrLt8PNqQrclR8roKXj174Mb", "AK1oSCSoqExnNm9Bojb7ErrkRophOnjO", ExifInterface.GPS_MEASUREMENT_INTERRUPTED};
    public static final Interpolator A1A;
    public static final boolean A1B;
    public static final boolean A1C;
    public static final boolean A1D;
    public static final boolean A1E;
    public static final boolean A1F;
    public static final boolean A1G;
    public static final int[] A1H;
    public static final int[] A1I;
    public static final Class<?>[] A1J;
    public C13093av A00;
    public C111214C A01;
    public C13092au A02;
    public RunnableC111344P A03;
    public AbstractC111464c A04;
    public AbstractC111544k A05;
    public AbstractC111584o A06;
    public InterfaceC111674x A07;
    public RunnableC1117555 A08;
    public C13079ag A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public float A0L;
    public float A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public VelocityTracker A0Y;
    public EdgeEffect A0Z;
    public EdgeEffect A0a;
    public EdgeEffect A0b;
    public EdgeEffect A0c;
    public C110593B A0d;
    public InterfaceC111494f A0e;
    public InterfaceC111524i A0f;
    public AbstractC111614r A0g;
    public InterfaceC111624s A0h;
    public AbstractC111634t A0i;
    public RecyclerView$SavedState A0j;
    public Runnable A0k;
    public List<RecyclerView.OnChildAttachStateChangeListener> A0l;
    public List<AbstractC111634t> A0m;
    public boolean A0n;
    public boolean A0o;
    public final Rect A0p;
    public final RectF A0q;
    public final C111664w A0r;
    public final C1117353 A0s;
    public final C111845E A0t;
    public final Runnable A0u;
    public final ArrayList<RecyclerView.ItemDecoration> A0v;
    public final List<AbstractC1117656> A0w;
    public final int A0x;
    public final int A0y;
    public final Rect A0z;
    public final AccessibilityManager A10;
    public final C13081aj A11;
    public final InterfaceC111835D A12;
    public final ArrayList<InterfaceC111624s> A13;
    public final int[] A14;
    public final int[] A15;
    public final int[] A16;
    public final int[] A17;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C11774FL A0H(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof C11774FL) {
                return (C11774FL) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C11774FL A0H = A0H(viewGroup.getChildAt(i));
                if (A0H != null) {
                    return A0H;
                }
            }
            return null;
        }
        return null;
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A18, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A19[1] = "u7dEJjISLATYPJ53p8QeJMuNBCdH6OYt";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 27);
            i4++;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0N() {
        this.A0s.A04(4);
        A1J();
        A1K();
        this.A0s.A04 = 1;
        if (this.A0s.A0C) {
            for (int A05 = this.A01.A05() - 1; A05 >= 0; A05--) {
                AbstractC1117656 A0F = A0F(this.A01.A09(A05));
                if (!A0F.A0f()) {
                    long A0C = A0C(A0F);
                    C111534j A08 = this.A05.A08(this.A0s, A0F);
                    AbstractC1117656 A052 = this.A0t.A05(A0C);
                    if (A052 == null || A052.A0f()) {
                        this.A0t.A0E(A0F, A08);
                    } else {
                        boolean A0H = this.A0t.A0H(A052);
                        boolean A0H2 = this.A0t.A0H(A0F);
                        if (A0H && A052 == A0F) {
                            this.A0t.A0E(A0F, A08);
                        } else {
                            C111534j A04 = this.A0t.A04(A052);
                            this.A0t.A0E(A0F, A08);
                            C111534j A03 = this.A0t.A03(A0F);
                            if (A04 == null) {
                                A0m(A0C, A0F, A052);
                            } else {
                                A0t(A052, A0F, A04, A03, A0H, A0H2);
                            }
                        }
                    }
                }
            }
            this.A0t.A0G(this.A12);
        }
        this.A06.A1G(this.A0r);
        this.A0s.A05 = this.A0s.A03;
        this.A0C = false;
        this.A0s.A0C = false;
        this.A0s.A0B = false;
        this.A06.A09 = false;
        if (this.A0r.A02 != null) {
            this.A0r.A02.clear();
        }
        if (this.A06.A08) {
            this.A06.A00 = 0;
            this.A06.A08 = false;
            this.A0r.A0O();
        }
        this.A06.A1v(this.A0s);
        A1L();
        A1n(false);
        this.A0t.A06();
        if (A11(this.A14[0], this.A14[1])) {
            A1b(0, 0);
        }
        A0Q();
        A0S();
    }

    public static void A0W() {
        A18 = new byte[]{82, 68, 46, 68, 122, -115, -119, -101, 68, 108, -109, -112, -120, -119, -106, 68, 86, 94, -80, -13, -15, -2, -2, -1, 4, -80, -14, -11, -80, -10, -1, 5, -2, -12, -80, -14, 5, 4, -80, -7, 4, -80, -7, 3, -80, -2, -11, -13, -11, 3, 3, -15, 2, 9, -80, -10, -1, 2, -80, -73, 0, 10, -73, -8, 3, 9, -4, -8, -5, 16, -73, -8, 11, 11, -8, -6, -1, -4, -5, -73, 11, 6, -73, -8, -73, -23, -4, -6, 16, -6, 3, -4, 9, -19, 0, -4, 14, -47, 97, -86, -76, 97, -81, -80, -75, 97, -94, 97, -91, -86, -77, -90, -92, -75, 97, -92, -87, -86, -83, -91, 97, -80, -89, 97, -95, -17, -16, -11, -95, -25, -16, -10, -17, -27, -81, -95, -59, -22, -27, -95, -30, -17, -6, -95, -50, -16, -11, -22, -16, -17, -58, -9, -26, -17, -11, -12, -95, -24, -26, -11, -95, -12, -20, -22, -15, -15, -26, -27, -64, -98, -110, -45, -42, -45, -30, -26, -41, -28, -84, -66, -78, -11, 1, 0, 6, -9, 10, 6, -52, -99, -111, -35, -46, -22, -32, -26, -27, -85, -82, -109, -24, -26, -36, -31, -38, -109, -41, -40, -39, -44, -24, -33, -25, -109, -23, -44, -33, -24, -40, -78, -48, -37, -37, -44, -45, -113, -31, -44, -36, -34, -27, -44, -77, -44, -29, -48, -46, -41, -44, -45, -59, -40, -44, -26, -113, -26, -40, -29, -41, -113, -48, -113, -27, -40, -44, -26, -113, -26, -41, -40, -46, -41, -113, -40, -30, -113, -35, -34, -29, -113, -43, -37, -48, -42, -42, -44, -45, -113, -48, -30, -113, -29, -36, -33, -113, -45, -44, -29, -48, -46, -41, -44, -45, -99, -69, -39, -26, -26, -25, -20, -104, -37, -39, -28, -28, -104, -20, -32, -31, -21, -104, -27, -35, -20, -32, -25, -36, -104, -31, -26, -104, -39, -104, -21, -37, -22, -25, -28, -28, -104, -37, -39, -28, -28, -38, -39, -37, -29, -90, -104, -53, -37, -22, -25, -28, -28, -104, -37, -39, -28, -28, -38, -39, -37, -29, -21, -104, -27, -31, -33, -32, -20, -38, -35, -104, -22, -19, -26, -104, -36, -19, -22, -31, -26, -33, -104, -39, -104, -27, -35, -39, -21, -19, -22, -35, -104, -98, -104, -28, -39, -15, -25, -19, -20, -104, -24, -39, -21, -21, -104, -17, -32, -35, -22, -35, -104, -15, -25, -19, -104, -37, -39, -26, -26, -25, -20, -104, -37, -32, -39, -26, -33, -35, -104, -20, -32, -35, -54, -35, -37, -15, -37, -28, -35, -22, -50, -31, -35, -17, -104, -36, -39, -20, -39, -90, -104, -71, -26, -15, -104, -27, -35, -20, -32, -25, -36, -104, -37, -39, -28, -28, -104, -20, -32, -39, -20, -104, -27, -31, -33, -32, -20, -104, -37, -32, -39, -26, -33, -35, -104, -20, -32, -35, -104, -21, -20, -22, -19, -37, -20, -19, -22, -35, -25, -34, -104, -20, -32, -35, -104, -54, -35, -37, -15, -37, -28, -35, -22, -50, -31, -35, -17, -104, -25, -22, -104, -20, -32, -35, -104, -39, -36, -39, -24, -20, -35, -22, -104, -37, -25, -26, -20, -35, -26, -20, -21, -104, -21, -32, -25, -19, -28, -36, -104, -38, -35, -104, -24, -25, -21, -20, -24, -25, -26, -35, -36, -104, -20, -25, -20, -32, -35, -104, -26, -35, -16, -20, -104, -34, -22, -39, -27, -35, -90, -59, -29, -16, -16, -15, -10, -94, -27, -29, -18, -18, -94, -10, -22, -21, -11, -94, -17, -25, -10, -22, -15, -26, -94, -7, -22, -21, -18, -25, -94, -44, -25, -27, -5, -27, -18, -25, -12, -40, -21, -25, -7, -94, -21, -11, -94, -27, -15, -17, -14, -9, -10, -21, -16, -23, -94, -29, -94, -18, -29, -5, -15, -9, -10, -94, -15, -12, -94, -11, -27, -12, -15, -18, -18, -21, -16, -23, -52, -22, -9, -9, -8, -3, -87, -17, -11, -14, -9, -16, -87, 0, -14, -3, -15, -8, -2, -3, -87, -22, -87, -43, -22, 2, -8, -2, -3, -42, -22, -9, -22, -16, -18, -5, -87, -4, -18, -3, -73, -87, -52, -22, -11, -11, -87, -4, -18, -3, -43, -22, 2, -8, -2, -3, -42, -22, -9, -22, -16, -18, -5, -87, 0, -14, -3, -15, -87, -22, -87, -9, -8, -9, -74, -9, -2, -11, -11, -87, -22, -5, -16, -2, -10, -18, -9, -3, -73, 106, -120, -107, -107, -106, -101, 71, -102, -118, -103, -106, -109, -109, 71, -101, -106, 71, -105, -106, -102, -112, -101, -112, -106, -107, 71, -120, 71, 115, -120, -96, -106, -100, -101, 116, -120, -107, -120, -114, -116, -103, 71, -102, -116, -101, 85, 71, 106, -120, -109, -109, 71, -102, -116, -101, 115, -120, -96, -106, -100, -101, 116, -120, -107, -120, -114, -116, -103, 71, -98, -112, -101, -113, 71, -120, 71, -107, -106, -107, 84, -107, -100, -109, -109, 71, -120, -103, -114, -100, -108, -116, -107, -101, 85, -114, -84, -71, -71, -70, -65, 107, -66, -82, -67, -70, -73, -73, 107, -62, -76, -65, -77, -70, -64, -65, 107, -84, 107, -105, -84, -60, -70, -64, -65, -104, -84, -71, -84, -78, -80, -67, 107, -66, -80, -65, 121, 107, -114, -84, -73, -73, 107, -66, -80, -65, -105, -84, -60, -70, -64, -65, -104, -84, -71, -84, -78, -80, -67, 107, -62, -76, -65, -77, 107, -84, 107, -71, -70, -71, 120, -71, -64, -73, -73, 107, -84, -67, -78, -64, -72, -80, -71, -65, 121, -43, -13, 0, 0, 1, 6, -78, 5, -1, 1, 1, 6, -6, -78, 5, -11, 4, 1, -2, -2, -78, 9, -5, 6, -6, 1, 7, 6, -78, -13, -78, -34, -13, 11, 1, 7, 6, -33, -13, 0, -13, -7, -9, 4, -78, 5, -9, 6, -64, -78, -43, -13, -2, -2, -78, 5, -9, 6, -34, -13, 11, 1, 7, 6, -33, -13, 0, -13, -7, -9, 4, -78, 9, -5, 6, -6, 
        -78, -13, -78, 0, 1, 0, -65, 0, 7, -2, -2, -78, -13, 4, -7, 7, -1, -9, 0, 6, -64, 96, -117, 60, -118, -117, -112, 60, -113, -127, -112, 104, 125, -107, -117, -111, -112, 98, -114, -117, -106, -127, -118, 60, -123, -118, 60, -120, 125, -107, -117, -111, -112, 60, -117, -114, 60, -113, Byte.MAX_VALUE, -114, -117, -120, -120, -94, -49, -49, -52, -49, 125, -51, -49, -52, -64, -62, -48, -48, -58, -53, -60, 125, -48, -64, -49, -52, -55, -55, -104, 125, -51, -52, -58, -53, -47, -62, -49, 125, -58, -53, -63, -62, -43, 125, -61, -52, -49, 125, -58, -63, 125, -111, -90, -66, -76, -70, -71, -110, -90, -77, -90, -84, -86, -73, 101, 119, -104, 73, -118, -115, -118, -103, -99, -114, -101, 73, -118, -99, -99, -118, -116, -111, -114, -115, 100, 73, -100, -108, -110, -103, -103, -110, -105, -112, 73, -107, -118, -94, -104, -98, -99, 110, -113, SignedBytes.MAX_POWER_OF_TWO, -116, -127, -103, -113, -107, -108, SignedBytes.MAX_POWER_OF_TWO, -115, -127, -114, -127, -121, -123, -110, SignedBytes.MAX_POWER_OF_TWO, -127, -108, -108, -127, -125, -120, -123, -124, 91, SignedBytes.MAX_POWER_OF_TWO, -109, -117, -119, -112, -112, -119, -114, -121, SignedBytes.MAX_POWER_OF_TWO, -116, -127, -103, -113, -107, -108, -98, -64, -67, -80, -70, -77, -69, 110, -59, -74, -73, -70, -77, 110, -69, -81, -62, -79, -74, -73, -68, -75, 110, -79, -74, -81, -68, -75, -77, -78, 110, -60, -73, -77, -59, 110, -74, -67, -70, -78, -77, -64, -63, 110, -59, -73, -62, -74, 110, -62, -74, -77, 110, -68, -77, -59, -67, -68, -77, -63, 124, 110, -94, -74, -77, 110, -66, -64, -77, 123, -70, -81, -57, -67, -61, -62, 110, -73, -68, -76, -67, -64, -69, -81, -62, -73, -67, -68, 110, -76, -67, -64, 110, -62, -74, -77, 110, -79, -74, -81, -68, -75, -77, 110, -74, -67, -70, -78, -77, -64, 110, -84, -80, 122, -96, -49, -58, -58, -93, -56, -48, -69, -58, -61, -66, -69, -50, -65, -113, -109, 93, -116, -85, -119, -98, -74, -84, -78, -79, -103, -99, 103, -105, -88, -71, -69, -80, -88, -77, -112, -75, -67, -88, -77, -80, -85, -88, -69, -84, -96, -92, 110, -95, -79, -64, -67, -70, -70, -108, -89, -91, -69, -91, -82, -89, -76, -104, -85, -89, -71, -90, -71, -73, -51, -73, -64, -71, -58, -86, -67, -71, -53, 116, -72, -61, -71, -57, 116, -62, -61, -56, 116, -57, -55, -60, -60, -61, -58, -56, 116, -57, -73, -58, -61, -64, -64, -67, -62, -69, 116, -56, -61, 116, -75, -62, 116, -75, -74, -57, -61, -64, -55, -56, -71, 116, -60, -61, -57, -67, -56, -67, -61, -62, -126, 116, -87, -57, -71, 116, -57, -73, -58, -61, -64, -64, -88, -61, -92, -61, -57, -67, -56, -67, -61, -62, 116, -67, -62, -57, -56, -71, -75, -72, -88, -69, -71, -49, -71, -62, -69, -56, -84, -65, -69, -51, 118, -66, -73, -55, 118, -60, -59, 118, -94, -73, -49, -59, -53, -54, -93, -73, -60, -73, -67, -69, -56, -102, -67, -75, 102, -86, -81, -84, -84, -85, -72, -85, -76, -70, 102, -100, -81, -85, -67, -114, -75, -78, -86, -85, -72, -71, 102, -82, -89, -68, -85, 102, -70, -82, -85, 102, -71, -89, -77, -85, 102, -87, -82, -89, -76, -83, -85, 102, -113, -118, 116, 102, -102, -82, -81, -71, 102, -77, -81, -83, -82, -70, 102, -82, -89, -74, -74, -85, -76, 102, -86, -69, -85, 102, -70, -75, 102, -81, -76, -87, -75, -76, -71, -81, -71, -70, -85, -76, -70, 102, -121, -86, -89, -74, -70, -85, -72, 102, -69, -74, -86, -89, -70, -85, 102, -85, -68, -85, -76, -70, -71, 102, -75, -72, 102, -81, -84, 102, -70, -82, -85, 102, -110, -89, -65, -75, -69, -70, -109, -89, -76, -89, -83, -85, -72, 102, -78, -89, -65, -71, 102, -75, -69, -70, 102, -70, -82, -85, 102, -71, -89, -77, -85, 102, -100, -81, -85, -67, 102, -77, -69, -78, -70, -81, -74, -78, -85, 102, -70, -81, -77, -85, -71, 116, 80, 102, -100, -81, -85, -67, -114, -75, -78, -86, -85, -72, 102, 119, UnsignedBytes.MAX_POWER_OF_TWO, 126, -95, -103, 74, -114, -109, -112, -112, -113, -100, -113, -104, -98, 74, UnsignedBytes.MAX_POWER_OF_TWO, -109, -113, -95, 114, -103, -106, -114, -113, -100, -99, 74, -110, -117, -96, -113, 74, -98, -110, -113, 74, -99, -117, -105, -113, 74, -99, -98, -117, -116, -106, -113, 74, 115, 110, 88, 74, 125, -98, -117, -116, -106, -113, 74, 115, 110, -99, 74, -109, -104, 74, -93, -103, -97, -100, 74, -117, -114, -117, -102, -98, -113, -100, 74, 119, Byte.MAX_VALUE, 125, 126, 74, 108, 111, 74, -97, -104, -109, -101, -97, -113, 74, -117, -104, -114, 74, 125, 114, 121, Byte.MAX_VALUE, 118, 110, 74, 120, 121, 126, 74, -115, -110, -117, -104, -111, -113, 88, 52, 74, UnsignedBytes.MAX_POWER_OF_TWO, -109, -113, -95, 114, -103, -106, -114, -113, -100, 74, 91, 100, -102, -83, -87, -69, 100, -111, -109, -109, -107, -93, -93, -103, -110, -103, -100, -103, -92, -87, -44, -39, -30, -43, -45, -28, -39, -33, -34, -112, -35, -27, -29, -28, -112, -46, -43, -112, -47, -46, -29, -33, -36, -27, -28, -43, -98, -112, -30, -43, -45, -43, -39, -26, -43, -44, -86, -14, -16, -1, -44, -1, -16, -8, -38, -15, -15, -2, -16, -1, -2, -51, -52, -95, -58, -57, -54, -62, -76, -57, -61, -43, -97, -46, -46, -65, -63, -58, -61, -62, -78, -51, -75, -57, -52, -62, -51, -43, -78, -79, -122, -85, -84, -81, -89, -103, -84, -88, -70, -121, -88, -73, -92, -90, -85, -88, -89, -119, -75, -78, -80, -102, -84, -79, -89, -78, -70, -102, -103, 114, -112, -97, 110, -109, -108, -105, -113, 111, -99, -116, -94, -108, -103, -110, 122, -99, -113, -112, -99, -72, -73, -110, -73, -67, -82, -69, -84, -82, -71, -67, -99, -72, -66, -84, -79, -114, -65, -82, -73, -67, -16, -30, -15, -48, -32, -17, 
        -20, -23, -23, -26, -21, -28, -47, -20, -14, -32, -27, -48, -23, -20, -19, -91, -90, -73, -99, -33, -34, -31, -99, -34, -17, -28, -14, -22, -30, -21, -15, -99, -32, -20, -21, -16, -15, -34, -21, -15, -99};
    }

    static {
        A0W();
        A1I = new int[]{16843830};
        A1H = new int[]{16842987};
        A1C = Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20;
        A1B = Build.VERSION.SDK_INT >= 23;
        A1D = Build.VERSION.SDK_INT >= 16;
        A1E = Build.VERSION.SDK_INT >= 21;
        A1F = Build.VERSION.SDK_INT <= 15;
        A1G = Build.VERSION.SDK_INT <= 15;
        Class<?> cls = Integer.TYPE;
        A1J = new Class[]{Context.class, AttributeSet.class, cls, cls};
        A1A = new Interpolator() { // from class: com.facebook.ads.redexgen.X.4b
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
    }

    public C11774FL(Context context) {
        this(context, null);
    }

    public C11774FL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C11774FL(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A11 = new C13081aj(this);
        this.A0r = new C111664w(this);
        this.A0t = new C111845E();
        this.A0u = new Runnable() { // from class: com.facebook.ads.redexgen.X.4Z
            public static String[] A01 = {"awShR6rB9hHqIMmEUL0mwXA0Gw52kO", "0DSPYtvGuEhIQI6AF9KMD", "9DdmIjaq0QhBq1nPNAcV72ZM8h0mgj2M", "HfTiJ4VVSMi3nAZk7bTv9mblSiAuey3", "debYtkaMAwIZQZjx6lxSS", "4WrPcoFjyZ6X9UuQXP", "Cz1Bv0fV", "irRdqOAQiRC5NgL3TGbl1LssmB7DQYK"};

            {
                C11774FL.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (C11774FL.this.A0D) {
                    C11774FL c11774fl = C11774FL.this;
                    String[] strArr = A01;
                    if (strArr[7].length() != strArr[3].length()) {
                        throw new RuntimeException();
                    }
                    A01[2] = "whIRPRaeSzbq6WxYyrgvwj4itopbsVJt";
                    if (c11774fl.isLayoutRequested()) {
                        return;
                    }
                    if (!C11774FL.this.A0F) {
                        C11774FL.this.requestLayout();
                    } else if (C11774FL.this.A0I) {
                        C11774FL.this.A0J = true;
                    } else {
                        C11774FL.this.A1I();
                    }
                }
            }
        };
        this.A0p = new Rect();
        this.A0z = new Rect();
        this.A0q = new RectF();
        this.A0v = new ArrayList<>();
        this.A13 = new ArrayList<>();
        this.A0O = 0;
        this.A0C = false;
        this.A0U = 0;
        this.A0N = 0;
        this.A05 = new C11780FT();
        this.A0W = 0;
        this.A0V = -1;
        this.A0L = Float.MIN_VALUE;
        this.A0M = Float.MIN_VALUE;
        this.A0o = true;
        this.A08 = new RunnableC1117555(this);
        this.A02 = A1E ? new C13092au() : null;
        this.A0s = new C1117353();
        this.A0G = false;
        this.A0H = false;
        this.A0f = new C13084am(this);
        this.A0K = false;
        this.A14 = new int[2];
        this.A17 = new int[2];
        this.A16 = new int[2];
        this.A15 = new int[2];
        this.A0w = new ArrayList();
        this.A0k = new Runnable() { // from class: com.facebook.ads.redexgen.X.4a
            {
                C11774FL.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (C11774FL.this.A05 != null) {
                    C11774FL.this.A05.A0J();
                }
                C11774FL.this.A0K = false;
            }
        };
        this.A12 = new C13087ap(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1H, i, 0);
            this.A0B = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.A0B = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0X = viewConfiguration.getScaledTouchSlop();
        this.A0L = AbstractC110783U.A00(viewConfiguration, context);
        this.A0M = AbstractC110783U.A01(viewConfiguration, context);
        this.A0y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0x = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.A05.A0B(this.A0f);
        A0e();
        A0O();
        if (AbstractC110773T.A00(this) == 0) {
            AbstractC110773T.A09(this, 1);
        }
        this.A10 = (AccessibilityManager) getContext().getSystemService(A0I(1831, 13, 21));
        setAccessibilityDelegateCompat(new C13079ag(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    private int A0B(View view) {
        int id2 = view.getId();
        while (true) {
            boolean isFocused = view.isFocused();
            String[] strArr = A19;
            String str = strArr[0];
            String str2 = strArr[6];
            int charAt = str.charAt(14);
            int lastKnownId = str2.charAt(14);
            if (charAt == lastKnownId) {
                throw new RuntimeException();
            }
            A19[1] = "skNAKCm7G9cheB5S1YDp1BKl7DhhyUWu";
            if (isFocused || !(view instanceof ViewGroup) || !view.hasFocus()) {
                break;
            }
            view = ((ViewGroup) view).getFocusedChild();
            int id3 = view.getId();
            if (id3 != -1) {
                id2 = view.getId();
            }
        }
    }

    private final long A0C(AbstractC1117656 abstractC1117656) {
        return this.A04.A0A() ? abstractC1117656.A0K() : abstractC1117656.A03;
    }

    private View A0D() {
        AbstractC1117656 A1F2;
        int i = this.A0s.A01 != -1 ? this.A0s.A01 : 0;
        int A03 = this.A0s.A03();
        if (A19[1].charAt(14) != '5') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[0] = "7qfeZgEkVtoAThUnrGXSh94SPjREp60d";
        strArr[6] = "LKFRBKGk6g3UCUNb2omEsqPfgI9kqX1N";
        for (int startFocusSearchIndex = i; startFocusSearchIndex < A03; startFocusSearchIndex++) {
            AbstractC1117656 A1F3 = A1F(startFocusSearchIndex);
            if (A1F3 == null) {
                break;
            } else if (A1F3.A0H.hasFocusable()) {
                return A1F3.A0H;
            }
        }
        int startFocusSearchIndex2 = Math.min(A03, i);
        for (int limit = startFocusSearchIndex2 - 1; limit >= 0 && (A1F2 = A1F(limit)) != null; limit--) {
            if (A1F2.A0H.hasFocusable()) {
                return A1F2.A0H;
            }
        }
        return null;
    }

    private final AbstractC1117656 A0E(long j) {
        if (this.A04 == null || !this.A04.A0A()) {
            return null;
        }
        int A06 = this.A01.A06();
        AbstractC1117656 abstractC1117656 = null;
        for (int i = 0; i < A06; i++) {
            AbstractC1117656 holder = A0F(this.A01.A0A(i));
            if (holder != null && !holder.A0a()) {
                int childCount = (holder.A0K() > j ? 1 : (holder.A0K() == j ? 0 : -1));
                if (childCount != 0) {
                    continue;
                } else if (this.A01.A0K(holder.A0H)) {
                    abstractC1117656 = holder;
                } else {
                    return holder;
                }
            }
        }
        return abstractC1117656;
    }

    public static AbstractC1117656 A0F(View view) {
        if (view == null) {
            return null;
        }
        return ((C111594p) view.getLayoutParams()).A00;
    }

    private final AbstractC1117656 A0G(View view) {
        View itemView = A1E(view);
        if (itemView == null) {
            return null;
        }
        return A1G(itemView);
    }

    private void A0J() {
        A0T();
        setScrollState(0);
    }

    private void A0K() {
        int i = this.A0P;
        this.A0P = 0;
        if (i != 0 && A1o()) {
            AccessibilityEvent event = AccessibilityEvent.obtain();
            event.setEventType(2048);
            AbstractC110953m.A01(event, i);
            sendAccessibilityEventUnchecked(event);
        }
    }

    private void A0L() {
        boolean z = true;
        this.A0s.A04(1);
        A1h(this.A0s);
        this.A0s.A0A = false;
        A1J();
        this.A0t.A06();
        A1K();
        A0P();
        A0U();
        this.A0s.A0E = (this.A0s.A0C && this.A0H) ? false : false;
        this.A0H = false;
        this.A0G = false;
        this.A0s.A09 = this.A0s.A0B;
        this.A0s.A03 = this.A04.A0E();
        A0x(this.A14);
        if (this.A0s.A0C) {
            int A05 = this.A01.A05();
            for (int i = 0; i < A05; i++) {
                AbstractC1117656 holder = A0F(this.A01.A09(i));
                if (!holder.A0f() && (!holder.A0Z() || this.A04.A0A())) {
                    AbstractC111544k abstractC111544k = this.A05;
                    C1117353 c1117353 = this.A0s;
                    int i2 = AbstractC111544k.A00(holder);
                    this.A0t.A0F(holder, abstractC111544k.A09(c1117353, holder, i2, holder.A0L()));
                    if (this.A0s.A0E && holder.A0d() && !holder.A0a() && !holder.A0f() && !holder.A0Z()) {
                        this.A0t.A08(A0C(holder), holder);
                    }
                }
            }
        }
        if (this.A0s.A0B) {
            A0i();
            boolean z2 = this.A0s.A0D;
            this.A0s.A0D = false;
            this.A06.A1u(this.A0r, this.A0s);
            this.A0s.A0D = z2;
            for (int i3 = 0; i3 < this.A01.A05(); i3++) {
                AbstractC1117656 A0F = A0F(this.A01.A09(i3));
                boolean didStructureChange = A0F.A0f();
                if (!didStructureChange) {
                    boolean didStructureChange2 = this.A0t.A0I(A0F);
                    if (!didStructureChange2) {
                        int A00 = AbstractC111544k.A00(A0F);
                        boolean A0i = A0F.A0i(8192);
                        if (!A0i) {
                            A00 |= 4096;
                        }
                        C111534j A09 = this.A05.A09(this.A0s, A0F, A00, A0F.A0L());
                        if (A0i) {
                            A1i(A0F, A09);
                        } else {
                            this.A0t.A0D(A0F, A09);
                        }
                    }
                }
            }
            A0X();
        } else {
            A0X();
        }
        A1L();
        A1n(false);
        this.A0s.A04 = 2;
    }

    private void A0M() {
        A1J();
        A1K();
        this.A0s.A04(6);
        this.A00.A07();
        this.A0s.A03 = this.A04.A0E();
        this.A0s.A00 = 0;
        this.A0s.A09 = false;
        this.A06.A1u(this.A0r, this.A0s);
        this.A0s.A0D = false;
        this.A0j = null;
        this.A0s.A0C = this.A0s.A0C && this.A05 != null;
        this.A0s.A04 = 4;
        A1L();
        A1n(false);
    }

    private void A0O() {
        this.A01 = new C111214C(new C13086ao(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0037, code lost:
        if (r0 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0063, code lost:
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0P() {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11774FL.A0P():void");
    }

    private void A0Q() {
        View viewToFocus;
        if (this.A0o && this.A04 != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() == 131072 && isFocused()) {
                return;
            }
            if (!isFocused()) {
                View focusedChild = getFocusedChild();
                if (A1G && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                    if (this.A01.A05() == 0) {
                        requestFocus();
                        return;
                    }
                } else if (!this.A01.A0K(focusedChild)) {
                    return;
                }
            }
            AbstractC1117656 abstractC1117656 = null;
            long j = this.A0s.A08;
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A19[1] = "kf1DBtA0T6eQEv5OJ0aXYpUf8VxTHKxU";
            if (j != -1 && this.A04.A0A()) {
                abstractC1117656 = A0E(this.A0s.A08);
            }
            View view = null;
            if (abstractC1117656 == null || this.A01.A0K(abstractC1117656.A0H) || !abstractC1117656.A0H.hasFocusable()) {
                if (this.A01.A05() > 0) {
                    view = A0D();
                }
            } else {
                view = abstractC1117656.A0H;
            }
            if (view != null) {
                if (this.A0s.A02 != -1 && (viewToFocus = view.findViewById(this.A0s.A02)) != null && viewToFocus.isFocusable()) {
                    view = viewToFocus;
                }
                view.requestFocus();
            }
        }
    }

    private void A0R() {
        boolean z = false;
        if (this.A0a != null) {
            this.A0a.onRelease();
            z = this.A0a.isFinished();
        }
        if (this.A0c != null) {
            this.A0c.onRelease();
            boolean needsInvalidate = this.A0c.isFinished();
            z |= needsInvalidate;
        }
        if (this.A0b != null) {
            this.A0b.onRelease();
            boolean needsInvalidate2 = this.A0b.isFinished();
            z |= needsInvalidate2;
        }
        EdgeEffect edgeEffect = this.A0Z;
        if (A19[1].charAt(14) != '5') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[4] = "DUYzAwLS0Yoz3H0mkub2uXfjKU6irrBR";
        strArr[5] = "haWSXRvp1CmnNAQfK1MdvfBgKkr4J9QQ";
        if (edgeEffect != null) {
            this.A0Z.onRelease();
            boolean needsInvalidate3 = this.A0Z.isFinished();
            z |= needsInvalidate3;
        }
        if (z) {
            AbstractC110773T.A07(this);
        }
    }

    private void A0S() {
        this.A0s.A08 = -1L;
        this.A0s.A01 = -1;
        this.A0s.A02 = -1;
    }

    private void A0T() {
        if (this.A0Y != null) {
            this.A0Y.clear();
        }
        A1X(0);
        A0R();
    }

    private void A0U() {
        int A0G;
        View view = null;
        if (this.A0o && hasFocus()) {
            AbstractC111464c abstractC111464c = this.A04;
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A19[7] = "5";
            if (abstractC111464c != null) {
                view = getFocusedChild();
            }
        }
        AbstractC1117656 A0G2 = view == null ? null : A0G(view);
        if (A0G2 == null) {
            A0S();
            return;
        }
        this.A0s.A08 = this.A04.A0A() ? A0G2.A0K() : -1L;
        C1117353 c1117353 = this.A0s;
        if (this.A0C) {
            A0G = -1;
        } else {
            A0G = A0G2.A0a() ? A0G2.A01 : A0G2.A0G();
        }
        c1117353.A01 = A0G;
        C1117353 c11173532 = this.A0s;
        View child = A0G2.A0H;
        c11173532.A02 = A0B(child);
    }

    private void A0V() {
        this.A08.A08();
        if (this.A06 != null) {
            this.A06.A0x();
        }
    }

    private final void A0X() {
        int A06 = this.A01.A06();
        for (int i = 0; i < A06; i++) {
            AbstractC1117656 A0F = A0F(this.A01.A0A(i));
            if (!A0F.A0f()) {
                A0F.A0M();
            }
        }
        this.A0r.A0K();
    }

    private final void A0Y() {
        AbstractC111464c abstractC111464c = this.A04;
        String A0I = A0I(1370, 12, 39);
        if (abstractC111464c == null) {
            Log.e(A0I, A0I(1123, 36, 14));
        } else if (this.A06 == null) {
            Log.e(A0I, A0I(1159, 43, 5));
        } else {
            this.A0s.A0A = false;
            if (this.A0s.A04 == 1) {
                A0L();
                this.A06.A1O(this);
                A0M();
            } else if (this.A00.A0C() || this.A06.A0h() != getWidth() || this.A06.A0X() != getHeight()) {
                this.A06.A1O(this);
                A0M();
            } else {
                this.A06.A1O(this);
            }
            A0N();
        }
    }

    private final void A0Z() {
        int state;
        for (int size = this.A0w.size() - 1; size >= 0; size--) {
            AbstractC1117656 abstractC1117656 = this.A0w.get(size);
            if (abstractC1117656.A0H.getParent() == this && !abstractC1117656.A0f() && (state = abstractC1117656.A02) != -1) {
                AbstractC110773T.A09(abstractC1117656.A0H, state);
                abstractC1117656.A02 = -1;
            }
        }
        this.A0w.clear();
    }

    private final void A0a() {
        if (this.A0Z != null) {
            return;
        }
        this.A0Z = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0Z.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            this.A0Z.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    private final void A0b() {
        if (this.A0a != null) {
            return;
        }
        this.A0a = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            this.A0a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    private final void A0c() {
        if (this.A0b != null) {
            return;
        }
        this.A0b = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0b.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            return;
        }
        EdgeEffect edgeEffect = this.A0b;
        int measuredHeight = getMeasuredHeight();
        if (A19[7].length() != 1) {
            throw new RuntimeException();
        }
        A19[1] = "cbkJKTW5fmkF4V5GELAthVoRFDIiLVou";
        edgeEffect.setSize(measuredHeight, getMeasuredWidth());
    }

    private final void A0d() {
        if (this.A0c != null) {
            return;
        }
        this.A0c = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0c.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        EdgeEffect edgeEffect = this.A0c;
        int measuredWidth = getMeasuredWidth();
        if (A19[7].length() != 1) {
            throw new RuntimeException();
        }
        A19[7] = "g";
        edgeEffect.setSize(measuredWidth, getMeasuredHeight());
    }

    private final void A0e() {
        this.A00 = new C13093av(new C13085an(this));
    }

    private final void A0f() {
        this.A0Z = null;
        this.A0c = null;
        this.A0b = null;
        this.A0a = null;
    }

    private final void A0g() {
        int A06 = this.A01.A06();
        for (int i = 0; i < A06; i++) {
            ((C111594p) this.A01.A0A(i).getLayoutParams()).A01 = true;
        }
        this.A0r.A0M();
    }

    private final void A0h() {
        int A06 = this.A01.A06();
        for (int i = 0; i < A06; i++) {
            AbstractC1117656 A0F = A0F(this.A01.A0A(i));
            if (A0F != null && !A0F.A0f()) {
                A0F.A0T(6);
            }
        }
        A0g();
        this.A0r.A0N();
    }

    private final void A0i() {
        int A06 = this.A01.A06();
        for (int i = 0; i < A06; i++) {
            AbstractC1117656 A0F = A0F(this.A01.A0A(i));
            if (!A0F.A0f()) {
                A0F.A0R();
            }
        }
    }

    private void A0j(float f, float f2, float f3, float f4) {
        boolean z = false;
        if (f2 < 0.0f) {
            A0b();
            AbstractC1111243.A00(this.A0a, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
            z = true;
        } else if (f2 > 0.0f) {
            A0c();
            AbstractC1111243.A00(this.A0b, f2 / getWidth(), f3 / getHeight());
            z = true;
        }
        if (f4 < 0.0f) {
            A0d();
            AbstractC1111243.A00(this.A0c, (-f4) / getHeight(), f / getWidth());
            z = true;
        } else if (f4 > 0.0f) {
            A0a();
            AbstractC1111243.A00(this.A0Z, f4 / getHeight(), 1.0f - (f / getWidth()));
            z = true;
        }
        if (!z && f2 == 0.0f) {
            int i = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[0] = "SiLEOgLe53s9c6khchOb02AHEH0FRuha";
            strArr[6] = "5HcivrXWoCNvsp5G28hhclxyRqnGBHgf";
            if (i == 0) {
                return;
            }
        }
        AbstractC110773T.A07(this);
    }

    private final void A0k(int i) {
        AbstractC111584o abstractC111584o = this.A06;
        if (this.A0i != null) {
            this.A0i.A0L(this, i);
        }
        if (this.A0m != null) {
            for (int size = this.A0m.size() - 1; size >= 0; size--) {
                this.A0m.get(size).A0L(this, i);
                String[] strArr = A19;
                String str = strArr[3];
                String str2 = strArr[2];
                int charAt = str.charAt(2);
                int i2 = str2.charAt(2);
                if (charAt == i2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A19;
                strArr2[4] = "wNO3zluUeYau1J5tWYXYTZjLKyZssSra";
                strArr2[5] = "exw9q3ETOdRCiu35xcNaFWLlKD0n1alI";
            }
        }
    }

    private final void A0l(int i, int i2, Interpolator interpolator) {
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(924, 97, 119));
        } else if (this.A0I) {
        } else {
            if (!this.A06.A20()) {
                i = 0;
            }
            boolean A21 = this.A06.A21();
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            A19[1] = "Tqmtltgb2GXtzJ5pgFbL4REJzj4lGX6R";
            if (!A21) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                this.A08.A0D(i, i2, interpolator);
            }
        }
    }

    private void A0m(long j, AbstractC1117656 abstractC1117656, AbstractC1117656 abstractC11176562) {
        int A05 = this.A01.A05();
        for (int i = 0; i < A05; i++) {
            AbstractC1117656 other = A0F(this.A01.A09(i));
            if (other != abstractC1117656) {
                int childCount = (A0C(other) > j ? 1 : (A0C(other) == j ? 0 : -1));
                if (childCount == 0) {
                    AbstractC111464c abstractC111464c = this.A04;
                    String[] strArr = A19;
                    String str = strArr[0];
                    String str2 = strArr[6];
                    int i2 = str.charAt(14);
                    int childCount2 = str2.charAt(14);
                    if (i2 == childCount2) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A19;
                    strArr2[3] = "juwPw4JUkqCkrA4IuHnNpcgybF39inA5";
                    strArr2[2] = "0NBeszRVzWCIaFL2RR4GryyHu33afAAx";
                    String A0I = A0I(1, 17, 9);
                    if (abstractC111464c != null && this.A04.A0A()) {
                        throw new IllegalStateException(A0I(1696, 130, 15) + other + A0I + abstractC1117656 + A1H());
                    }
                    throw new IllegalStateException(A0I(1508, 188, 43) + other + A0I + abstractC1117656 + A1H());
                }
            }
        }
        Log.e(A0I(1370, 12, 39), A0I(1202, 111, 51) + abstractC11176562 + A0I(18, 41, 117) + abstractC1117656 + A1H());
    }

    private void A0n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int actionIndex2 = this.A0V;
        if (pointerId != actionIndex2) {
            return;
        }
        int i = actionIndex == 0 ? 1 : 0;
        int actionIndex3 = motionEvent.getPointerId(i);
        this.A0V = actionIndex3;
        int actionIndex4 = (int) (motionEvent.getX(i) + 0.5f);
        this.A0S = actionIndex4;
        this.A0Q = actionIndex4;
        int actionIndex5 = (int) (motionEvent.getY(i) + 0.5f);
        this.A0T = actionIndex5;
        this.A0R = actionIndex5;
    }

    public static void A0o(View view, Rect rect) {
        C111594p c111594p = (C111594p) view.getLayoutParams();
        Rect rect2 = c111594p.A03;
        rect.set((view.getLeft() - rect2.left) - c111594p.leftMargin, (view.getTop() - rect2.top) - c111594p.topMargin, view.getRight() + rect2.right + c111594p.rightMargin, view.getBottom() + rect2.bottom + c111594p.bottomMargin);
    }

    private void A0p(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.A0p.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C111594p) {
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            A19[1] = "MS6MXnJil8kPq55ThMmX90CfGz9dq6Ir";
            C111594p c111594p = (C111594p) layoutParams;
            if (!c111594p.A01) {
                Rect insets = c111594p.A03;
                this.A0p.left -= insets.left;
                this.A0p.right += insets.right;
                this.A0p.top -= insets.top;
                this.A0p.bottom += insets.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.A0p);
            offsetRectIntoDescendantCoords(view, this.A0p);
        }
        this.A06.A1a(this, view, this.A0p, !this.A0D, view2 == null);
    }

    private void A0q(AbstractC111464c abstractC111464c, boolean z, boolean z2) {
        if (this.A04 != null) {
            this.A04.A08(this.A11);
        }
        if (!z || z2) {
            A1N();
        }
        this.A00.A09();
        AbstractC111464c abstractC111464c2 = this.A04;
        this.A04 = abstractC111464c;
        if (abstractC111464c != null) {
            abstractC111464c.A07(this.A11);
        }
        AbstractC111584o abstractC111584o = this.A06;
        C111664w c111664w = this.A0r;
        AbstractC111464c oldAdapter = this.A04;
        c111664w.A0U(abstractC111464c2, oldAdapter, z);
        this.A0s.A0D = true;
        A1P();
    }

    private void A0r(AbstractC1117656 abstractC1117656) {
        View view = abstractC1117656.A0H;
        boolean z = view.getParent() == this;
        this.A0r.A0Y(A1G(view));
        boolean A0c = abstractC1117656.A0c();
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[3] = "TiCmVlWwgQ6VOJfmkNnlNNx0y9AVJwa2";
        strArr2[2] = "F9jx2AB6s4oeG4sqKvJHQ7CgJaKOJBvs";
        if (A0c) {
            this.A01.A0H(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.A01.A0J(view, true);
        } else {
            this.A01.A0E(view);
        }
    }

    public static void A0s(AbstractC1117656 abstractC1117656) {
        if (abstractC1117656.A09 != null) {
            C11774FL c11774fl = abstractC1117656.A09.get();
            while (c11774fl != null) {
                View item = abstractC1117656.A0H;
                if (c11774fl == item) {
                    return;
                }
                ViewParent parent = c11774fl.getParent();
                if (parent instanceof View) {
                    c11774fl = (View) parent;
                } else {
                    c11774fl = null;
                }
            }
            abstractC1117656.A09 = null;
        }
    }

    private void A0t(AbstractC1117656 abstractC1117656, AbstractC1117656 abstractC11176562, C111534j c111534j, C111534j c111534j2, boolean z, boolean z2) {
        abstractC1117656.A0X(false);
        if (z) {
            A0r(abstractC1117656);
        }
        if (abstractC1117656 != abstractC11176562) {
            if (z2) {
                A0r(abstractC11176562);
            }
            abstractC1117656.A06 = abstractC11176562;
            A0r(abstractC1117656);
            this.A0r.A0Y(abstractC1117656);
            abstractC11176562.A0X(false);
            abstractC11176562.A07 = abstractC1117656;
        }
        if (this.A05.A0H(abstractC1117656, abstractC11176562, c111534j, c111534j2)) {
            A1M();
        }
    }

    private void A0x(int[] iArr) {
        int A05 = this.A01.A05();
        if (A05 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int maxPositionPreLayout = Integer.MAX_VALUE;
        int minPositionPreLayout = Integer.MIN_VALUE;
        for (int i = 0; i < A05; i++) {
            AbstractC1117656 A0F = A0F(this.A01.A09(i));
            if (!A0F.A0f()) {
                int count = A0F.A0I();
                if (count < maxPositionPreLayout) {
                    maxPositionPreLayout = count;
                }
                if (count > minPositionPreLayout) {
                    minPositionPreLayout = count;
                }
            }
        }
        iArr[0] = maxPositionPreLayout;
        iArr[1] = minPositionPreLayout;
    }

    private boolean A0y() {
        int A05 = this.A01.A05();
        for (int i = 0; i < A05; i++) {
            AbstractC1117656 A0F = A0F(this.A01.A09(i));
            if (A0F != null && !A0F.A0f()) {
                boolean A0d = A0F.A0d();
                int i2 = A19[7].length();
                if (i2 != 1) {
                    throw new RuntimeException();
                }
                A19[1] = "5mbkKWt0hxhFdp5kkkYwhOUPEf80vh4b";
                if (A0d) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean A0z() {
        return this.A05 != null && this.A06.A22();
    }

    private boolean A11(int i, int i2) {
        A0x(this.A14);
        return (this.A14[0] == i && this.A14[1] == i2) ? false : true;
    }

    private final boolean A12(int i, int i2) {
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(651, 89, 110));
            return false;
        } else if (this.A0I) {
            return false;
        } else {
            boolean A20 = this.A06.A20();
            boolean canScroll = this.A06.A21();
            i = (!A20 || Math.abs(i) < this.A0y) ? 0 : 0;
            i2 = (!canScroll || Math.abs(i2) < this.A0y) ? 0 : 0;
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = i;
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "ReiKJWWZUipUJIZKdTnth4O85KfdJzFe";
            strArr2[2] = "VE75UicjWgpvWTg6gZrF4R3BQlGAuEv7";
            boolean canScrollHorizontal = dispatchNestedPreFling(f, i2);
            if (!canScrollHorizontal) {
                boolean canScrollVertical = A20 || canScroll;
                dispatchNestedFling(i, i2, canScrollVertical);
                if (this.A0g != null) {
                    boolean canScrollHorizontal2 = this.A0g.A0B(i, i2);
                    if (canScrollHorizontal2) {
                        return true;
                    }
                }
                if (canScrollVertical) {
                    int i3 = 0;
                    if (A20) {
                        i3 = 0 | 1;
                    }
                    if (canScroll) {
                        i3 |= 2;
                    }
                    A1s(i3, 1);
                    int nestedScrollAxis = -this.A0x;
                    int max = Math.max(nestedScrollAxis, Math.min(i, this.A0x));
                    int nestedScrollAxis2 = -this.A0x;
                    this.A08.A09(max, Math.max(nestedScrollAxis2, Math.min(i2, this.A0x)));
                    return true;
                }
            }
            return false;
        }
    }

    private final boolean A13(int consumedX, int consumedY, MotionEvent motionEvent) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        A1I();
        if (this.A04 != null) {
            A1J();
            A1K();
            AbstractC110392q.A01(A0I(1361, 9, 51));
            A1h(this.A0s);
            if (consumedX != 0) {
                i3 = this.A06.A1d(consumedX, this.A0r, this.A0s);
                i = consumedX - i3;
            }
            if (consumedY != 0) {
                i4 = this.A06.A1e(consumedY, this.A0r, this.A0s);
                i2 = consumedY - i4;
            }
            AbstractC110392q.A00();
            A1O();
            A1L();
            A1n(false);
        }
        if (!this.A0v.isEmpty()) {
            invalidate();
        }
        if (A1t(i3, i4, i, i2, this.A17, 0)) {
            this.A0S -= this.A17[0];
            this.A0T -= this.A17[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation(this.A17[0], this.A17[1]);
            }
            int[] iArr = this.A15;
            iArr[0] = iArr[0] + this.A17[0];
            int[] iArr2 = this.A15;
            iArr2[1] = iArr2[1] + this.A17[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AbstractC1105739.A00(motionEvent, 8194)) {
                A0j(motionEvent.getX(), i, motionEvent.getY(), i2);
            }
            A1Z(consumedX, consumedY);
        }
        if (i3 != 0 || i4 != 0) {
            A1b(i3, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i3 == 0 && i4 == 0) ? false : true;
    }

    private boolean A14(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (0 != 0) {
            if (action == 0) {
                this.A0h = null;
            } else {
                if (action == 3 || action == 1) {
                    this.A0h = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int action2 = this.A13.size();
            if (0 < action2) {
                this.A13.get(0);
                throw new NullPointerException(A0I(1973, 21, 46));
            }
            return false;
        }
        return false;
    }

    private boolean A15(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.A0h = null;
        }
        int action2 = this.A13.size();
        if (0 < action2) {
            this.A13.get(0);
            throw new NullPointerException(A0I(1973, 21, 46));
        }
        return false;
    }

    private boolean A16(View view, View view2, int i) {
        int absHorizontal;
        if (view2 == null || view2 == this) {
            return false;
        }
        if (view == null) {
            return true;
        }
        if (i == 2 || i == 1) {
            boolean absHorizontal2 = this.A06.A0a() == 1;
            boolean rtl = i == 2;
            if (rtl ^ absHorizontal2) {
                absHorizontal = 66;
            } else {
                absHorizontal = 17;
            }
            if (A17(view, view2, absHorizontal)) {
                return true;
            }
            if (i == 2) {
                return A17(view, view2, 130);
            }
            String[] strArr = A19;
            String str = strArr[0];
            String str2 = strArr[6];
            int charAt = str.charAt(14);
            int absHorizontal3 = str2.charAt(14);
            if (charAt != absHorizontal3) {
                String[] strArr2 = A19;
                strArr2[3] = "Ohwc1756uTT166t9FAn6vugoi7AJfc0c";
                strArr2[2] = "5J1fVRqaKzeN2XjLKxMOi2uJr88KN7aK";
                return A17(view, view2, 33);
            }
            throw new RuntimeException();
        }
        return A17(view, view2, i);
    }

    private boolean A17(View view, View view2, int i) {
        this.A0p.set(0, 0, view.getWidth(), view.getHeight());
        this.A0z.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.A0p);
        offsetDescendantRectToMyCoords(view2, this.A0z);
        switch (i) {
            case 17:
                return (this.A0p.right > this.A0z.right || this.A0p.left >= this.A0z.right) && this.A0p.left > this.A0z.left;
            case 33:
                return (this.A0p.bottom > this.A0z.bottom || this.A0p.top >= this.A0z.bottom) && this.A0p.top > this.A0z.top;
            case 66:
                return (this.A0p.left < this.A0z.left || this.A0p.right <= this.A0z.left) && this.A0p.right < this.A0z.right;
            case 130:
                if (this.A0p.top >= this.A0z.top) {
                    Rect rect = this.A0p;
                    String[] strArr = A19;
                    if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A19;
                    strArr2[0] = "mOrDrwN7qo6GKKMJ6G3US4mLdoh2ETut";
                    strArr2[6] = "IWP4ZqDDS1db9pl2oaFrT53kmkniKDfl";
                    if (rect.bottom > this.A0z.top) {
                        return false;
                    }
                }
                return this.A0p.bottom < this.A0z.bottom;
            default:
                throw new IllegalArgumentException(A0I(1844, 37, 85) + i + A1H());
        }
    }

    private final boolean A18(AccessibilityEvent accessibilityEvent) {
        if (A1q()) {
            int i = 0;
            if (accessibilityEvent != null) {
                i = AbstractC110953m.A00(accessibilityEvent);
            }
            if (i == 0) {
                i = 0;
            }
            int type = this.A0P;
            this.A0P = type | i;
            return true;
        }
        return false;
    }

    public final int A1B(View view) {
        AbstractC1117656 holder = A0F(view);
        if (holder != null) {
            return holder.A0I();
        }
        return -1;
    }

    public final int A1C(AbstractC1117656 abstractC1117656) {
        if (abstractC1117656.A0i(IronSourceError.ERROR_PLACEMENT_CAPPED) || !abstractC1117656.A0Y()) {
            return -1;
        }
        return this.A00.A05(abstractC1117656.A03);
    }

    public final Rect A1D(View view) {
        C111594p c111594p = (C111594p) view.getLayoutParams();
        if (!c111594p.A01) {
            return c111594p.A03;
        }
        if (this.A0s.A07()) {
            boolean A01 = c111594p.A01();
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[0] = "RfoZAoElzPqJKaUzlOfJ9JNtEQb3r4Q3";
            strArr[6] = "IQCpaJiMXE8HuUJ13qJ8cPkLmMUIWIfQ";
            if (A01 || c111594p.A03()) {
                return c111594p.A03;
            }
        }
        Rect rect = c111594p.A03;
        rect.set(0, 0, 0, 0);
        if (0 < this.A0v.size()) {
            this.A0p.set(0, 0, 0, 0);
            this.A0v.get(0);
            throw new NullPointerException(A0I(1881, 14, 112));
        }
        c111594p.A01 = false;
        return rect;
    }

    public final View A1E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this) {
            boolean z = parent instanceof View;
            if (A19[7].length() == 1) {
                String[] strArr = A19;
                strArr[3] = "J9ctOc3byknHaiu8XEstSyzOEyaFCb7S";
                strArr[2] = "QOdc34hkOqsfpHVshThNFi46vThKtwkT";
                if (!z) {
                    break;
                }
                view = (View) parent;
                parent = view.getParent();
            } else {
                throw new RuntimeException();
            }
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final AbstractC1117656 A1F(int i) {
        if (this.A0C) {
            return null;
        }
        int A06 = this.A01.A06();
        AbstractC1117656 hidden = null;
        for (int i2 = 0; i2 < A06; i2++) {
            AbstractC1117656 A0F = A0F(this.A01.A0A(i2));
            if (A0F != null && !A0F.A0a()) {
                int childCount = A1C(A0F);
                if (childCount != i) {
                    continue;
                } else if (this.A01.A0K(A0F.A0H)) {
                    hidden = A0F;
                } else {
                    return A0F;
                }
            }
        }
        return hidden;
    }

    public final AbstractC1117656 A1G(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return A0F(view);
        }
        throw new IllegalArgumentException(A0I(1826, 5, 41) + view + A0I(98, 26, 38) + this);
    }

    public final String A1H() {
        return A0I(0, 1, 23) + super.toString() + A0I(169, 10, 87) + this.A04 + A0I(189, 9, 86) + this.A06 + A0I(179, 10, 119) + getContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x008d, code lost:
        if (r3 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x008f, code lost:
        A0Y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a8, code lost:
        if (r3 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ab, code lost:
        r5.A00.A06();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1I() {
        /*
            r5 = this;
            boolean r3 = r5.A0D
            r2 = 1313(0x521, float:1.84E-42)
            r1 = 17
            r0 = 63
            java.lang.String r4 = A0I(r2, r1, r0)
            if (r3 == 0) goto L12
            boolean r0 = r5.A0C
            if (r0 == 0) goto L1c
        L12:
            com.facebook.ads.redexgen.p370X.AbstractC110392q.A01(r4)
            r5.A0Y()
            com.facebook.ads.redexgen.p370X.AbstractC110392q.A00()
            return
        L1c:
            com.facebook.ads.redexgen.X.av r0 = r5.A00
            boolean r0 = r0.A0B()
            if (r0 != 0) goto L25
            return
        L25:
            com.facebook.ads.redexgen.X.av r3 = r5.A00
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11774FL.A19
            r0 = 0
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 14
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La2
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11774FL.A19
            java.lang.String r1 = "cmOs2ngvAj3urs5G14jP2yS9Pox4PNUI"
            r0 = 1
            r2[r0] = r1
            r0 = 4
            boolean r0 = r3.A0D(r0)
            if (r0 == 0) goto Lb1
            com.facebook.ads.redexgen.X.av r1 = r5.A00
            r0 = 11
            boolean r0 = r1.A0D(r0)
            if (r0 != 0) goto Lb1
            r2 = 1341(0x53d, float:1.879E-42)
            r1 = 20
            r0 = 44
            java.lang.String r0 = A0I(r2, r1, r0)
            com.facebook.ads.redexgen.p370X.AbstractC110392q.A01(r0)
            r5.A1J()
            r5.A1K()
            com.facebook.ads.redexgen.X.av r0 = r5.A00
            r0.A08()
            boolean r0 = r5.A0J
            if (r0 != 0) goto L92
            boolean r3 = r5.A0y()
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11774FL.A19
            r0 = 3
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 2
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto La8
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11774FL.A19
            java.lang.String r1 = "a"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto Lab
        L8f:
            r5.A0Y()
        L92:
            r0 = 1
            r5.A1n(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.p370X.C11774FL.A19
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto Lc3
        La2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        La8:
            if (r3 == 0) goto Lab
            goto L8f
        Lab:
            com.facebook.ads.redexgen.X.av r0 = r5.A00
            r0.A06()
            goto L92
        Lb1:
            com.facebook.ads.redexgen.X.av r0 = r5.A00
            boolean r0 = r0.A0B()
            if (r0 == 0) goto Ld5
            com.facebook.ads.redexgen.p370X.AbstractC110392q.A01(r4)
            r5.A0Y()
            com.facebook.ads.redexgen.p370X.AbstractC110392q.A00()
            goto Ld5
        Lc3:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C11774FL.A19
            java.lang.String r1 = "rQ0jmwctWvIOIioOAlLcoJlzUDkcSysz"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "N5NmD2ge71vhim7LrdB83J9iYpsRCLkc"
            r0 = 2
            r2[r0] = r1
            r5.A1L()
            com.facebook.ads.redexgen.p370X.AbstractC110392q.A00()
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11774FL.A1I():void");
    }

    public final void A1J() {
        this.A0O++;
        if (this.A0O == 1 && !this.A0I) {
            this.A0J = false;
        }
    }

    public final void A1K() {
        this.A0U++;
    }

    public final void A1L() {
        A1m(true);
    }

    public final void A1M() {
        if (!this.A0K && this.A0F) {
            AbstractC110773T.A0D(this, this.A0k);
            this.A0K = true;
        }
    }

    public final void A1N() {
        if (this.A05 != null) {
            this.A05.A0I();
        }
        if (this.A06 != null) {
            this.A06.A1I(this.A0r);
            this.A06.A1G(this.A0r);
        }
        this.A0r.A0P();
    }

    public final void A1O() {
        int A05 = this.A01.A05();
        for (int left = 0; left < A05; left++) {
            View view = this.A01.A09(left);
            AbstractC1117656 A1G2 = A1G(view);
            if (A1G2 != null && A1G2.A07 != null) {
                View shadowingView = A1G2.A07.A0H;
                int left2 = view.getLeft();
                int top = view.getTop();
                int count = shadowingView.getLeft();
                if (left2 == count) {
                    int count2 = shadowingView.getTop();
                    if (top == count2) {
                    }
                }
                int i = shadowingView.getWidth();
                int count3 = shadowingView.getHeight();
                shadowingView.layout(left2, top, i + left2, count3 + top);
            }
        }
    }

    public final void A1P() {
        this.A0C = true;
        A0h();
    }

    public final void A1Q() {
        if (this.A0m != null) {
            this.A0m.clear();
        }
    }

    public final void A1R() {
        setScrollState(0);
        A0V();
    }

    public final void A1S(int i) {
        if (this.A06 == null) {
            return;
        }
        this.A06.A1p(i);
        awakenScrollBars();
    }

    public final void A1T(int i) {
        int A05 = this.A01.A05();
        for (int i2 = 0; i2 < A05; i2++) {
            this.A01.A09(i2).offsetLeftAndRight(i);
        }
    }

    public final void A1U(int i) {
        int A05 = this.A01.A05();
        for (int i2 = 0; i2 < A05; i2++) {
            this.A01.A09(i2).offsetTopAndBottom(i);
        }
    }

    public final void A1V(int i) {
        if (this.A0I) {
            return;
        }
        A1R();
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(740, 94, 12));
            return;
        }
        this.A06.A1p(i);
        awakenScrollBars();
    }

    public final void A1W(int i) {
        if (this.A0I) {
            return;
        }
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(924, 97, 119));
        } else {
            this.A06.A1x(this, this.A0s, i);
        }
    }

    public final void A1X(int i) {
        getScrollingChildHelper().A03(i);
    }

    public final void A1Y(int i, int i2) {
        if (i < 0) {
            A0b();
            this.A0a.onAbsorb(-i);
        } else if (i > 0) {
            A0c();
            this.A0b.onAbsorb(i);
        }
        if (i2 < 0) {
            A0d();
            this.A0c.onAbsorb(-i2);
        } else if (i2 > 0) {
            A0a();
            String[] strArr = A19;
            if (strArr[3].charAt(2) == strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[0] = "Kq4j6FG7zvFvwW4vRC6zLjapwuK9WjkP";
            strArr2[6] = "2Xczf707pBdLKDJ5NVr429bRaPx31sq0";
            this.A0Z.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            AbstractC110773T.A07(this);
        }
    }

    public final void A1Z(int i, int i2) {
        boolean z = false;
        if (this.A0a != null) {
            boolean needsInvalidate = this.A0a.isFinished();
            if (!needsInvalidate && i > 0) {
                this.A0a.onRelease();
                z = this.A0a.isFinished();
            }
        }
        if (this.A0b != null) {
            boolean needsInvalidate2 = this.A0b.isFinished();
            if (!needsInvalidate2 && i < 0) {
                this.A0b.onRelease();
                boolean needsInvalidate3 = this.A0b.isFinished();
                z |= needsInvalidate3;
            }
        }
        EdgeEffect edgeEffect = this.A0c;
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[0] = "hv7OcE78gRUWXZIBx5R2VkE7fvviVqXd";
        strArr2[6] = "NFDR0brV2INlGIZxgJE16fqqg8Mw1YR1";
        if (edgeEffect != null) {
            boolean needsInvalidate4 = this.A0c.isFinished();
            if (!needsInvalidate4 && i2 > 0) {
                this.A0c.onRelease();
                boolean needsInvalidate5 = this.A0c.isFinished();
                z |= needsInvalidate5;
            }
        }
        if (this.A0Z != null) {
            boolean needsInvalidate6 = this.A0Z.isFinished();
            if (!needsInvalidate6 && i2 < 0) {
                this.A0Z.onRelease();
                boolean needsInvalidate7 = this.A0Z.isFinished();
                z |= needsInvalidate7;
            }
        }
        if (z) {
            AbstractC110773T.A07(this);
        }
    }

    public final void A1a(int i, int i2) {
        int A00 = AbstractC111584o.A00(i, getPaddingLeft() + getPaddingRight(), AbstractC110773T.A03(this));
        int paddingTop = getPaddingTop();
        int width = getPaddingBottom();
        int i3 = paddingTop + width;
        int width2 = AbstractC110773T.A02(this);
        setMeasuredDimension(A00, AbstractC111584o.A00(i2, i3, width2));
    }

    public final void A1b(int i, int i2) {
        this.A0N++;
        int scrollY = getScrollX();
        int scrollX = getScrollY();
        onScrollChanged(scrollY, scrollX, scrollY, scrollX);
        if (this.A0i != null) {
            this.A0i.A0M(this, i, i2);
        }
        if (this.A0m != null) {
            for (int scrollY2 = this.A0m.size() - 1; scrollY2 >= 0; scrollY2--) {
                this.A0m.get(scrollY2).A0M(this, i, i2);
            }
        }
        this.A0N--;
    }

    public final void A1c(int i, int i2) {
        A0l(i, i2, null);
    }

    public final void A1d(View view) {
        int cnt;
        A0F(view);
        AbstractC111464c abstractC111464c = this.A04;
        if (this.A0l != null && this.A0l.size() - 1 >= 0) {
            this.A0l.get(cnt);
            throw new NullPointerException(A0I(1895, 27, 67));
        }
    }

    public final void A1e(View view) {
        A0F(view);
        AbstractC111464c abstractC111464c = this.A04;
        if (this.A0l != null) {
            List<RecyclerView.OnChildAttachStateChangeListener> list = this.A0l;
            String[] strArr = A19;
            if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[4] = "Ju6zs0r9efzkyV7LXILEyjCEKckziCxk";
            strArr2[5] = "xtNh9wS4idAx9IKZVnTROlGUKiewUtpM";
            int size = list.size() - 1;
            if (size >= 0) {
                this.A0l.get(size);
                throw new NullPointerException(A0I(1922, 29, 40));
            }
        }
    }

    public final void A1f(AbstractC111634t abstractC111634t) {
        if (this.A0m == null) {
            this.A0m = new ArrayList();
        }
        this.A0m.add(abstractC111634t);
    }

    public final void A1g(AbstractC111634t abstractC111634t) {
        if (this.A0m != null) {
            List<AbstractC111634t> list = this.A0m;
            if (A19[7].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "sOoQs3X4dS853ZpkNjZwaQi0LuRyF7Hc";
            strArr[2] = "YQ1nAsE5QOTVY911s6plJSU2g6bxQXkh";
            list.remove(abstractC111634t);
        }
    }

    public final void A1h(C1117353 c1117353) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A08.A01;
            c1117353.A06 = overScroller.getFinalX() - overScroller.getCurrX();
            c1117353.A07 = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        c1117353.A06 = 0;
        c1117353.A07 = 0;
    }

    public final void A1i(AbstractC1117656 abstractC1117656, C111534j c111534j) {
        abstractC1117656.A0U(0, 8192);
        if (this.A0s.A0E) {
            boolean A0d = abstractC1117656.A0d();
            if (A19[1].charAt(14) != '5') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[0] = "SaiGfOi3tH24E262D5BQaQwya8XqTMou";
            strArr[6] = "ZNTGZnAbt95d53NkHsORUVfXJkKP7CFB";
            if (A0d && !abstractC1117656.A0a() && !abstractC1117656.A0f()) {
                this.A0t.A08(A0C(abstractC1117656), abstractC1117656);
            }
        }
        this.A0t.A0F(abstractC1117656, c111534j);
    }

    public final void A1j(AbstractC1117656 abstractC1117656, C111534j c111534j, C111534j c111534j2) {
        abstractC1117656.A0X(false);
        if (this.A05.A0E(abstractC1117656, c111534j, c111534j2)) {
            A1M();
        }
    }

    public final void A1k(AbstractC1117656 abstractC1117656, C111534j c111534j, C111534j c111534j2) {
        A0r(abstractC1117656);
        abstractC1117656.A0X(false);
        if (this.A05.A0F(abstractC1117656, c111534j, c111534j2)) {
            A1M();
        }
    }

    public final void A1l(String str) {
        if (A1q()) {
            if (str == null) {
                throw new IllegalStateException(A0I(574, 77, 103) + A1H());
            }
            throw new IllegalStateException(str);
        } else if (this.A0N > 0) {
            Log.w(A0I(1370, 12, 39), A0I(294, 280, 93), new IllegalStateException(A0I(0, 0, 122) + A1H()));
        }
    }

    public final void A1m(boolean z) {
        this.A0U--;
        if (this.A0U < 1) {
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[4] = "VgsuIcXtp0FweJIL4JjeIuHXK9vcALAx";
            strArr2[5] = "AVlqmC2HCSNpSWUvoITeU6SwKS4OLgxH";
            this.A0U = 0;
            if (z) {
                A0K();
                A0Z();
            }
        }
    }

    public final void A1n(boolean z) {
        if (this.A0O < 1) {
            this.A0O = 1;
        }
        if (!z) {
            this.A0J = false;
        }
        if (this.A0O == 1) {
            if (z && this.A0J) {
                boolean z2 = this.A0I;
                if (A19[1].charAt(14) != '5') {
                    throw new RuntimeException();
                }
                A19[7] = "k";
                if (!z2 && this.A06 != null && this.A04 != null) {
                    A0Y();
                }
            }
            if (!this.A0I) {
                this.A0J = false;
            }
        }
        this.A0O--;
    }

    public final boolean A1o() {
        return this.A10 != null && this.A10.isEnabled();
    }

    public final boolean A1p() {
        if (this.A0D) {
            boolean z = this.A0C;
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            A19[7] = "K";
            if (!z && !this.A00.A0B()) {
                return false;
            }
        }
        return true;
    }

    public final boolean A1q() {
        return this.A0U > 0;
    }

    public final boolean A1r(int i) {
        return getScrollingChildHelper().A09(i);
    }

    public final boolean A1s(int i, int i2) {
        return getScrollingChildHelper().A0B(i, i2);
    }

    public final boolean A1t(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().A0D(i, i2, i3, i4, iArr, i5);
    }

    public final boolean A1u(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().A0F(i, i2, iArr, iArr2, i3);
    }

    public final boolean A1v(View view) {
        A1J();
        boolean A0L = this.A01.A0L(view);
        if (A0L) {
            AbstractC1117656 viewHolder = A0F(view);
            this.A0r.A0Y(viewHolder);
            this.A0r.A0X(viewHolder);
        }
        boolean removed = !A0L;
        A1n(removed);
        return A0L;
    }

    public final boolean A1w(AbstractC1117656 abstractC1117656) {
        return this.A05 == null || this.A05.A0M(abstractC1117656, abstractC1117656.A0L());
    }

    public final boolean A1x(AbstractC1117656 abstractC1117656, int i) {
        if (A1q()) {
            abstractC1117656.A02 = i;
            this.A0w.add(abstractC1117656);
            return false;
        }
        AbstractC110773T.A09(abstractC1117656.A0H, i);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> views, int i, int i2) {
        if (this.A06 == null || !this.A06.A1c(this, views, i, i2)) {
            super.addFocusables(views, i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C111594p) && this.A06.A1Y((C111594p) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        if (this.A06 != null && this.A06.A20()) {
            return this.A06.A1f(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        if (this.A06 != null && this.A06.A20()) {
            return this.A06.A1g(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        if (this.A06 != null && this.A06.A20()) {
            return this.A06.A1h(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        if (this.A06 != null && this.A06.A21()) {
            AbstractC111584o abstractC111584o = this.A06;
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "OwG4fgggKq7icgaaysnCa6zBD064f6Q4";
            strArr2[2] = "UojYTgk0EBa2sJrZvEgoz68xRxvrHNBO";
            return abstractC111584o.A1i(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        if (this.A06 != null && this.A06.A21()) {
            return this.A06.A1j(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        if (this.A06 != null && this.A06.A21()) {
            return this.A06.A1k(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().A08(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().A07(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A0E(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().A0C(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        dispatchThawSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        dispatchFreezeSelfOnly(container);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x002a, code lost:
        throw new java.lang.RuntimeException();
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11774FL.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0061, code lost:
        if (r8 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0064, code lost:
        if (r12 == 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0066, code lost:
        if (r12 != 1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0068, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006f, code lost:
        if (r10.A06.A21() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0071, code lost:
        if (r12 != 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0073, code lost:
        r8 = 130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0075, code lost:
        r9 = r5.findNextFocus(r10, r11, r8);
        r2 = com.facebook.ads.redexgen.p370X.C11774FL.A19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x008b, code lost:
        if (r2[0].charAt(14) == r2[6].charAt(14)) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x008d, code lost:
        r2 = com.facebook.ads.redexgen.p370X.C11774FL.A19;
        r2[0] = "PHUXCSvj0qVt4bMkXhuKdS2TL18qx3jZ";
        r2[6] = "9Uo8CmEd6ZAjo9pPUWDw01n4G5SCE1PJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0099, code lost:
        if (r9 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x009b, code lost:
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x009e, code lost:
        if (com.facebook.ads.redexgen.p370X.C11774FL.A1F == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00a0, code lost:
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00a1, code lost:
        if (r2 != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00a9, code lost:
        if (r10.A06.A20() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00b1, code lost:
        if (r10.A06.A0a() != 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00b3, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00b4, code lost:
        if (r12 != 2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00b6, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00b8, code lost:
        if ((r0 ^ r1) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00ba, code lost:
        r1 = 66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00c0, code lost:
        if (r5.findNextFocus(r10, r11, r1) != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00c2, code lost:
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00c5, code lost:
        if (com.facebook.ads.redexgen.p370X.C11774FL.A1F == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00c7, code lost:
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00c8, code lost:
        if (r2 == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00ca, code lost:
        A1I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00d1, code lost:
        if (A1E(r11) != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00d3, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00d4, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00d6, code lost:
        r1 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x00d9, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x00db, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x00dd, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x00df, code lost:
        r8 = 33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x00e9, code lost:
        if (r8 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x00f0, code lost:
        A1J();
        r10.A06.A1n(r11, r12, r10.A0r, r10.A0s);
        A1n(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x00ff, code lost:
        r5 = r5.findNextFocus(r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0104, code lost:
        r5 = r5.findNextFocus(r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0108, code lost:
        if (r5 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x010a, code lost:
        if (r8 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x010c, code lost:
        A1I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0113, code lost:
        if (A1E(r11) != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0115, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0116, code lost:
        A1J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0123, code lost:
        if (com.facebook.ads.redexgen.p370X.C11774FL.A19[7].length() == 1) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x012a, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x012b, code lost:
        com.facebook.ads.redexgen.p370X.C11774FL.A19[7] = "d";
        r5 = r10.A06.A1n(r11, r12, r10.A0r, r10.A0s);
        A1n(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x013f, code lost:
        if (r5 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0145, code lost:
        if (r5.hasFocusable() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0147, code lost:
        r4 = getFocusedChild();
        r2 = com.facebook.ads.redexgen.p370X.C11774FL.A19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x015c, code lost:
        if (r2[3].charAt(2) == r2[2].charAt(2)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x015e, code lost:
        com.facebook.ads.redexgen.p370X.C11774FL.A19[1] = "b9MIeYXaHVfTdq5nKFyUZKSBlIH2M87t";
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0165, code lost:
        if (r4 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x016b, code lost:
        return super.focusSearch(r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x016c, code lost:
        if (r4 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x016f, code lost:
        A0p(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0172, code lost:
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0177, code lost:
        if (A16(r11, r5, r12) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0179, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:?, code lost:
        return super.focusSearch(r11, r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00e2  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r11, int r12) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11774FL.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.A06 != null) {
            return this.A06.A1o();
        }
        throw new IllegalStateException(A0I(1475, 33, 59) + A1H());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.A06 != null) {
            return this.A06.A0v(getContext(), attributeSet);
        }
        throw new IllegalStateException(A0I(1475, 33, 59) + A1H());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this.A06 != null) {
            return this.A06.A0w(layoutParams);
        }
        throw new IllegalStateException(A0I(1475, 33, 59) + A1H());
    }

    public AbstractC111464c getAdapter() {
        return this.A04;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.A06 != null) {
            return this.A06.A0V();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        if (0 == 0) {
            return super.getChildDrawingOrder(i, i2);
        }
        throw new NullPointerException(A0I(1951, 22, 16));
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.A0B;
    }

    public C13079ag getCompatAccessibilityDelegate() {
        return this.A09;
    }

    public AbstractC111544k getItemAnimator() {
        return this.A05;
    }

    public AbstractC111584o getLayoutManager() {
        return this.A06;
    }

    public int getMaxFlingVelocity() {
        return this.A0x;
    }

    public int getMinFlingVelocity() {
        return this.A0y;
    }

    public long getNanoTime() {
        if (A1E) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC111614r getOnFlingListener() {
        return this.A0g;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0o;
    }

    public C111654v getRecycledViewPool() {
        return this.A0r.A0H();
    }

    public int getScrollState() {
        return this.A0W;
    }

    private C110593B getScrollingChildHelper() {
        if (this.A0d == null) {
            this.A0d = new C110593B(this);
        }
        return this.A0d;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().A05();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.A0F;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A06();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0U = 0;
        boolean z = true;
        this.A0F = true;
        this.A0D = (!this.A0D || isLayoutRequested()) ? false : false;
        if (this.A06 != null) {
            this.A06.A1N(this);
        }
        this.A0K = false;
        if (A1E) {
            this.A03 = RunnableC111344P.A07.get();
            RunnableC111344P runnableC111344P = this.A03;
            String[] strArr = A19;
            if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[4] = "C0ehsoOGkHH4Yo5xO6QtGogVKP7uVX9B";
            strArr2[5] = "76wleFUxgdDs3CwSlu7sJ9vYK22l9wck";
            if (runnableC111344P == null) {
                this.A03 = new RunnableC111344P();
                Display A04 = AbstractC110773T.A04(this);
                float f = 60.0f;
                if (!isInEditMode() && A04 != null) {
                    float refreshRate = A04.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                this.A03.A00 = 1.0E9f / f;
                RunnableC111344P.A07.set(this.A03);
            }
            this.A03.A09(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A05 != null) {
            this.A05.A0I();
        }
        A1R();
        this.A0F = false;
        if (this.A06 != null) {
            this.A06.A1Q(this, this.A0r);
        }
        this.A0w.clear();
        removeCallbacks(this.A0k);
        this.A0t.A07();
        if (A1E && this.A03 != null) {
            this.A03.A0A(this);
            this.A03 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.A0v.size();
        for (int i = 0; i < size; i++) {
            this.A0v.get(i);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float vScroll;
        float f;
        if (this.A06 == null || this.A0I) {
            return false;
        }
        int action = motionEvent.getAction();
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[4] = "SqJdYhJCWRyNUdRTYMkhoX0xKlvJTIzq";
        strArr2[5] = "dLZEV46oohOd8c5dsstKZ2mmKWuZBEje";
        if (action == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.A06.A21()) {
                    vScroll = -motionEvent.getAxisValue(9);
                } else {
                    vScroll = 0.0f;
                }
                if (this.A06.A20()) {
                    f = motionEvent.getAxisValue(10);
                } else {
                    f = 0.0f;
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                f = motionEvent.getAxisValue(26);
                if (this.A06.A21()) {
                    vScroll = -f;
                    f = 0.0f;
                } else if (this.A06.A20()) {
                    vScroll = 0.0f;
                } else {
                    vScroll = 0.0f;
                    f = 0.0f;
                }
            } else {
                vScroll = 0.0f;
                f = 0.0f;
            }
            if (vScroll != 0.0f || f != 0.0f) {
                float hScroll = this.A0L;
                A13((int) (hScroll * f), (int) (this.A0M * vScroll), motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0I) {
            return false;
        }
        if (A15(motionEvent)) {
            A0J();
            return true;
        } else if (this.A06 == null) {
            return false;
        } else {
            boolean A20 = this.A06.A20();
            boolean startScroll = this.A06.A21();
            if (this.A0Y == null) {
                this.A0Y = VelocityTracker.obtain();
            }
            this.A0Y.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            switch (actionMasked) {
                case 0:
                    boolean canScrollHorizontally = this.A0n;
                    if (canScrollHorizontally) {
                        this.A0n = false;
                    }
                    this.A0V = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.A0S = x;
                    this.A0Q = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.A0T = y;
                    this.A0R = y;
                    if (this.A0W == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        String[] strArr = A19;
                        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                            String[] strArr2 = A19;
                            strArr2[4] = "M5UY6PcxpnTLVPVued5fx0ZBKGPv0DD6";
                            strArr2[5] = "epX9q1DqtqLsT3WNVlKQ1OkRKfkr8qoW";
                            setScrollState(1);
                        } else {
                            String[] strArr3 = A19;
                            strArr3[3] = "mz0Spg27ESm6n2CBfiNuhIq158jNl3XC";
                            strArr3[2] = "LXDJrUlN0pxLgDChp5qc6Quk8NcN491z";
                            setScrollState(1);
                        }
                    }
                    int[] iArr = this.A15;
                    this.A15[1] = 0;
                    iArr[0] = 0;
                    int i = 0;
                    if (A20) {
                        i = 0 | 1;
                    }
                    if (startScroll) {
                        i |= 2;
                    }
                    A1s(i, 0);
                    break;
                case 1:
                    this.A0Y.clear();
                    A1X(0);
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.A0V);
                    if (findPointerIndex >= 0) {
                        int index = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        if (this.A0W != 1) {
                            int i2 = index - this.A0Q;
                            int dy = y2 - this.A0R;
                            int dx = 0;
                            if (A20) {
                                int x2 = Math.abs(i2);
                                int actionIndex2 = this.A0X;
                                if (A19[1].charAt(14) != '5') {
                                    throw new RuntimeException();
                                }
                                A19[1] = "KTspDQ6S4I31ss5nDId9o94814z1kYXz";
                                if (x2 > actionIndex2) {
                                    this.A0S = index;
                                    dx = 1;
                                }
                            }
                            if (startScroll && Math.abs(dy) > this.A0X) {
                                this.A0T = y2;
                                dx = 1;
                            }
                            if (dx != 0) {
                                setScrollState(1);
                                break;
                            }
                        }
                    } else {
                        Log.e(A0I(1370, 12, 39), A0I(1063, 46, 66) + this.A0V + A0I(124, 45, 102));
                        return false;
                    }
                    break;
                case 3:
                    A0J();
                    break;
                case 5:
                    this.A0V = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.A0S = x3;
                    this.A0Q = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.A0T = y3;
                    this.A0R = y3;
                    break;
                case 6:
                    A0n(motionEvent);
                    break;
            }
            return this.A0W == 1;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC110392q.A01(A0I(1330, 11, 34));
        A0Y();
        AbstractC110392q.A00();
        this.A0D = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.A06 == null) {
            A1a(i, i2);
            return;
        }
        boolean z = this.A06.A06;
        String[] strArr = A19;
        if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[3] = "7ZSgCyrANqbSR0bOMUGXtewOYYl5EtQ7";
        strArr2[2] = "EtNqJr4QhL0ASxhb1XseUjRgOzTVtavV";
        int heightMode = 0;
        if (z) {
            int mode = View.MeasureSpec.getMode(i);
            int widthMode = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 && widthMode == 1073741824) {
                heightMode = 1;
            }
            this.A06.A1J(this.A0r, this.A0s, i, i2);
            if (heightMode != 0 || this.A04 == null) {
                return;
            }
            int widthMode2 = this.A0s.A04;
            if (widthMode2 == 1) {
                A0L();
            }
            this.A06.A11(i, i2);
            this.A0s.A0A = true;
            A0M();
            this.A06.A12(i, i2);
            if (this.A06.A1z()) {
                AbstractC111584o abstractC111584o = this.A06;
                int widthMode3 = getMeasuredWidth();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(widthMode3, 1073741824);
                int widthMode4 = getMeasuredHeight();
                abstractC111584o.A11(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(widthMode4, 1073741824));
                this.A0s.A0A = true;
                A0M();
                if (A19[1].charAt(14) != '5') {
                    this.A06.A12(i, i2);
                    return;
                }
                String[] strArr3 = A19;
                strArr3[3] = "2scJF4Z4oabFWuCQusikCL010xDMrwfy";
                strArr3[2] = "adt4S0RTiAMMvoy66yYvZbK2iUPJlD04";
                this.A06.A12(i, i2);
            }
        } else if (this.A0E) {
            this.A06.A1J(this.A0r, this.A0s, i, i2);
        } else {
            if (this.A0A) {
                A1J();
                A1K();
                A0P();
                A1L();
                if (this.A0s.A0B) {
                    this.A0s.A09 = true;
                } else {
                    this.A00.A07();
                    this.A0s.A09 = false;
                }
                this.A0A = false;
                A1n(false);
            } else if (this.A0s.A0B) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            if (this.A04 != null) {
                this.A0s.A03 = this.A04.A0E();
            } else {
                this.A0s.A03 = 0;
            }
            A1J();
            this.A06.A1J(this.A0r, this.A0s, i, i2);
            A1n(false);
            this.A0s.A09 = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (A1q()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            classLoader = getContext().getClassLoader();
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(state instanceof RecyclerView$SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        this.A0j = (RecyclerView$SavedState) state;
        super.onRestoreInstanceState(this.A0j.A02());
        if (this.A06 != null && this.A0j.A00 != null) {
            this.A06.A1s(this.A0j.A00);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        RecyclerView$SavedState recyclerView$SavedState = new RecyclerView$SavedState(super.onSaveInstanceState());
        RecyclerView$SavedState state = this.A0j;
        if (state != null) {
            RecyclerView$SavedState state2 = this.A0j;
            recyclerView$SavedState.A03(state2);
        } else if (this.A06 != null) {
            recyclerView$SavedState.A00 = this.A06.A1l();
        } else {
            recyclerView$SavedState.A00 = null;
        }
        return new WrappedParcelable(recyclerView$SavedState);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            A0f();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.A0I || this.A0n) {
            return false;
        }
        if (A14(motionEvent)) {
            A0J();
            return true;
        } else if (this.A06 == null) {
            return false;
        } else {
            boolean A20 = this.A06.A20();
            boolean eventAddedToVelocityTracker = this.A06.A21();
            if (this.A0Y == null) {
                this.A0Y = VelocityTracker.obtain();
            }
            boolean canScrollVertically = false;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                int[] iArr = this.A15;
                this.A15[1] = 0;
                iArr[0] = 0;
            }
            float f3 = this.A15[0];
            if (A19[1].charAt(14) == '5') {
                String[] strArr = A19;
                strArr[4] = "SmtdwAgCAQ3d1YsOl1YESVhzKEqu7eKK";
                strArr[5] = "J6uBjvS6jISF4fo0G11W738KKcsSrsAN";
                obtain.offsetLocation(f3, this.A15[1]);
                switch (actionMasked) {
                    case 0:
                        this.A0V = motionEvent.getPointerId(0);
                        int dy = (int) (motionEvent.getX() + 0.5f);
                        this.A0S = dy;
                        this.A0Q = dy;
                        int dx = (int) (motionEvent.getY() + 0.5f);
                        this.A0T = dx;
                        this.A0R = dx;
                        int nestedScrollAxis = 0;
                        if (A20) {
                            nestedScrollAxis = 0 | 1;
                        }
                        if (eventAddedToVelocityTracker) {
                            nestedScrollAxis |= 2;
                        }
                        A1s(nestedScrollAxis, 0);
                        break;
                    case 1:
                        this.A0Y.addMovement(obtain);
                        canScrollVertically = true;
                        this.A0Y.computeCurrentVelocity(1000, this.A0x);
                        if (A20) {
                            f = -this.A0Y.getXVelocity(this.A0V);
                        } else {
                            f = 0.0f;
                        }
                        if (eventAddedToVelocityTracker) {
                            f2 = -this.A0Y.getYVelocity(this.A0V);
                        } else {
                            f2 = 0.0f;
                        }
                        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                        if (A19[1].charAt(14) == '5') {
                            String[] strArr2 = A19;
                            strArr2[0] = "jpSzY3cN6Yd9mC426DHJqMOwyRQLyhoD";
                            strArr2[6] = "NqO1hqm0aSOLr2VmuYam7NnyHk2GnoAg";
                            if ((i == 0 && f2 == 0.0f) || !A12((int) f, (int) f2)) {
                                setScrollState(0);
                            }
                            A0T();
                            break;
                        }
                        break;
                    case 2:
                        int findPointerIndex = motionEvent.findPointerIndex(this.A0V);
                        if (findPointerIndex < 0) {
                            Log.e(A0I(1370, 12, 39), A0I(1063, 46, 66) + this.A0V + A0I(124, 45, 102));
                            return false;
                        }
                        int x = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int actionIndex2 = this.A0S - x;
                        int dy2 = this.A0T - y;
                        if (A1u(actionIndex2, dy2, this.A16, this.A17, 0)) {
                            actionIndex2 -= this.A16[0];
                            dy2 -= this.A16[1];
                            obtain.offsetLocation(this.A17[0], this.A17[1]);
                            int[] iArr2 = this.A15;
                            iArr2[0] = iArr2[0] + this.A17[0];
                            int[] iArr3 = this.A15;
                            iArr3[1] = iArr3[1] + this.A17[1];
                        }
                        if (this.A0W != 1) {
                            boolean z = false;
                            if (A20 && Math.abs(actionIndex2) > this.A0X) {
                                if (actionIndex2 > 0) {
                                    actionIndex2 -= this.A0X;
                                } else {
                                    actionIndex2 += this.A0X;
                                }
                                z = true;
                            }
                            if (eventAddedToVelocityTracker && Math.abs(dy2) > this.A0X) {
                                if (dy2 > 0) {
                                    dy2 -= this.A0X;
                                } else {
                                    dy2 += this.A0X;
                                }
                                z = true;
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.A0W == 1) {
                            this.A0S = x - this.A17[0];
                            this.A0T = y - this.A17[1];
                            if (A13(A20 ? actionIndex2 : 0, eventAddedToVelocityTracker ? dy2 : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            if (this.A03 != null && (actionIndex2 != 0 || dy2 != 0)) {
                                this.A03.A0B(this, actionIndex2, dy2);
                                break;
                            }
                        }
                        break;
                    case 3:
                        A0J();
                        break;
                    case 5:
                        this.A0V = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.A0S = x2;
                        this.A0Q = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.A0T = y2;
                        this.A0R = y2;
                        break;
                    case 6:
                        A0n(motionEvent);
                        break;
                }
                if (!canScrollVertically) {
                    this.A0Y.addMovement(obtain);
                }
                obtain.recycle();
                return true;
            }
            throw new RuntimeException();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC1117656 A0F = A0F(view);
        if (A0F != null) {
            if (A0F.A0c()) {
                A0F.A0P();
            } else if (!A0F.A0f()) {
                throw new IllegalArgumentException(A0I(219, 75, 84) + A0F + A1H());
            }
        }
        view.clearAnimation();
        A1e(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.A06.A1b(this, this.A0s, view, view2) && view2 != null) {
            A0p(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A06.A1Z(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.A13.size();
        for (int i = 0; i < size; i++) {
            ArrayList<InterfaceC111624s> arrayList = this.A13;
            int i2 = A19[7].length();
            if (i2 != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "ALuvCB3Uxfwb6USvRsTQeejOaKQGJDVI";
            strArr[2] = "eH5kVfmfggziqkhtmDEzLdVkGL1u4682";
            arrayList.get(i);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A0O == 0) {
            boolean z = this.A0I;
            String[] strArr = A19;
            if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[0] = "DQNG7v2eQntUoXmxdvl3JfddX2pbwEnJ";
            strArr2[6] = "9dlsUD8r2K7vneFeWRut3F36hDYz7ROo";
            if (!z) {
                super.requestLayout();
                return;
            }
        }
        this.A0J = true;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        if (this.A06 == null) {
            Log.e(A0I(1370, 12, 39), A0I(834, 90, 48));
        } else if (this.A0I) {
        } else {
            boolean A20 = this.A06.A20();
            boolean A21 = this.A06.A21();
            if (A20 || A21) {
                String[] strArr = A19;
                if (strArr[4].charAt(24) != strArr[5].charAt(24)) {
                    throw new RuntimeException();
                }
                A19[1] = "hukuWuX8c8ikYD5Zh6axQSjgAUqwSCKd";
                if (!A20) {
                    i = 0;
                }
                A13(i, A21 ? i2 : 0, null);
            }
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w(A0I(1370, 12, 39), A0I(1382, 93, 57));
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (A18(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C13079ag c13079ag) {
        this.A09 = c13079ag;
        AbstractC110773T.A0B(this, this.A09);
    }

    public void setAdapter(AbstractC111464c abstractC111464c) {
        setLayoutFrozen(false);
        A0q(abstractC111464c, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC111494f interfaceC111494f) {
        if (interfaceC111494f == null) {
            return;
        }
        this.A0e = interfaceC111494f;
        setChildrenDrawingOrderEnabled(0 != 0);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.A0B) {
            A0f();
        }
        this.A0B = z;
        super.setClipToPadding(z);
        if (this.A0D) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z) {
        this.A0E = z;
    }

    public void setItemAnimator(AbstractC111544k abstractC111544k) {
        if (this.A05 != null) {
            this.A05.A0I();
            this.A05.A0B(null);
        }
        this.A05 = abstractC111544k;
        if (this.A05 != null) {
            this.A05.A0B(this.A0f);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.A0r.A0Q(i);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.A0I) {
            A1l(A0I(1021, 42, 1));
            if (!z) {
                this.A0I = false;
                if (this.A0J && this.A06 != null && this.A04 != null) {
                    requestLayout();
                }
                this.A0J = false;
                return;
            }
            long now = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0));
            String[] strArr = A19;
            if (strArr[0].charAt(14) == strArr[6].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[0] = "JdEcOawzhGoMi7SJTaKu9jXFd9l8G1Qn";
            strArr2[6] = "ngxMbpV1qHapbkXJW6JrwI2187obRSoG";
            this.A0I = true;
            this.A0n = true;
            A1R();
        }
    }

    public void setLayoutManager(AbstractC111584o abstractC111584o) {
        if (abstractC111584o == this.A06) {
            return;
        }
        A1R();
        if (this.A06 != null) {
            if (this.A05 != null) {
                this.A05.A0I();
            }
            this.A06.A1I(this.A0r);
            this.A06.A1G(this.A0r);
            this.A0r.A0P();
            if (this.A0F) {
                this.A06.A1Q(this, this.A0r);
            }
            this.A06.A1P(null);
            this.A06 = null;
        } else {
            this.A0r.A0P();
        }
        this.A01.A0B();
        this.A06 = abstractC111584o;
        if (abstractC111584o != null) {
            if (abstractC111584o.A03 == null) {
                this.A06.A1P(this);
                if (this.A0F) {
                    this.A06.A1N(this);
                }
            } else {
                throw new IllegalArgumentException(A0I(1109, 14, 42) + abstractC111584o + A0I(59, 39, 124) + abstractC111584o.A03.A1H());
            }
        }
        this.A0r.A0O();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().A04(z);
    }

    public void setOnFlingListener(AbstractC111614r abstractC111614r) {
        this.A0g = abstractC111614r;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC111634t abstractC111634t) {
        this.A0i = abstractC111634t;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0o = z;
    }

    public void setRecycledViewPool(C111654v c111654v) {
        this.A0r.A0V(c111654v);
    }

    public void setRecyclerListener(InterfaceC111674x interfaceC111674x) {
        this.A07 = interfaceC111674x;
    }

    public void setScrollState(int i) {
        if (i == this.A0W) {
            return;
        }
        this.A0W = i;
        if (i != 2) {
            A0V();
        }
        A0k(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                this.A0X = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                Log.w(A0I(1370, 12, 39), A0I(1994, 47, 98) + i + A0I(198, 21, 88));
                break;
        }
        this.A0X = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC1117454 abstractC1117454) {
        this.A0r.A0W(abstractC1117454);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().A0A(i);
    }

    @Override // android.view.View, com.facebook.ads.redexgen.p370X.InterfaceC110583A
    public final void stopNestedScroll() {
        getScrollingChildHelper().A02();
    }
}
