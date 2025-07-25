package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.common.primitives.SignedBytes;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.WJ */
/* loaded from: assets/audience_network.dex */
public final class C12811WJ extends C112045Y implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G = {"gicLODNc4Ss02ASp0SH6jYH1jReGCf7D", "ud1g41PfTpgHVgN2zMRJY9l5AGp7t", "qgXpVhlOa1wHLevNk8n", "YvRZAMwcrsdunGxdPmTtNWzK4vSRpQc4", "eiRiwAROr6ki2Hau4nBgoUP0cJGv3yGG", "AknM7mKZVSENDtzyALrGWQlwPvra0WAt", "RqySj6gASebQYnIOdgQzgXbIWVvFlmni", "rcToBCOkHOudlFUS35924ELLk4KD1"};
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public C13029Zs A01;
    public InterfaceC12018JP A02;
    public C11580Bu A04;
    public C113137V A05;
    public View$OnClickListenerC113087O A06;
    public AbstractC12529Rj A07;
    public C12530Rk A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC12472Qo A0C = new C12817WP(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public EnumC12028JZ A03 = EnumC12028JZ.A03;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{11, 44, 52, 35, 46, 43, 38, 98, 48, 39, 44, 38, 39, 48, 39, 48, 98, 33, 42, 43, 46, 38, 98, 33, 45, 44, 36, 43, 37, 108, 7, 47, 46, 35, 43, 28, 35, 47, 61, 28, 35, 46, 47, 37, 106, 35, 57, 106, 36, 63, 38, 38, 113, 106, 63, 36, 43, 40, 38, 47, 106, 62, 37, 106, 44, 35, 36, 46, 106, 35, 62, 100, 122, 65, 78, 77, 67, 74, 15, 91, SignedBytes.MAX_POWER_OF_TWO, 15, 73, 70, 65, 75, 15, 98, 74, 75, 70, 78, 121, 70, 74, 88, 121, 70, 75, 74, SignedBytes.MAX_POWER_OF_TWO, 15, 76, 71, 70, 67, 75, 1};
    }

    static {
        A0E();
        A0H = C12811WJ.class.getSimpleName();
    }

    private C12816WO A00(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new C12816WO(this, mediaViewVideoRendererApi);
    }

    private C12815WN A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new C12815WN(this, mediaViewVideoRendererApi);
    }

    private C12813WL A02() {
        return new C12813WL(this);
    }

    private C12530Rk A05() {
        return new C12530Rk(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        if (this.A04 != null) {
            C11580Bu c11580Bu = this.A04;
            if (A0G[6].charAt(16) != 'd') {
                throw new RuntimeException();
            }
            A0G[5] = "Ntv0Vby76dSesAjQjgB6ptCIElpzOEzL";
            ((C12473Qp) c11580Bu.getVideoView()).setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        if (this.A04 != null) {
            this.A04.getVideoView().setOnTouchListener(new View$OnTouchListenerC12017JO(this));
        }
    }

    private void A0B() {
        if (this.A04 != null) {
            ((C12473Qp) this.A04.getVideoView()).setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09 && this.A00.hasWindowFocus()) {
            this.A08.A0U();
            return;
        }
        if (this.A04 != null) {
            EnumC12527Rh state = this.A04.getState();
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A0G[4] = "z79LrkWpr7afRwAllWq14kp6jWBswbkV";
            if (state == EnumC12527Rh.A05) {
                this.A0B = true;
            }
        }
        this.A08.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = EnumC12028JZ.A03;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(C12799W7 c12799w7, InterfaceC12018JP interfaceC12018JP) {
        String str;
        this.A0A = false;
        this.A0B = false;
        this.A02 = interfaceC12018JP;
        A09();
        C113137V c113137v = this.A05;
        if (c12799w7 != null && c12799w7.getAdCoverImage() != null) {
            C12023JU adCoverImage = c12799w7.getAdCoverImage();
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                throw new RuntimeException();
            }
            A0G[5] = "TnDtOWvYiNMfLmp09Wf7ctnD5adJ0dsa";
            str = adCoverImage.getUrl();
        } else {
            str = null;
        }
        c113137v.setImage(str, new C12814WM(this));
        this.A03 = c12799w7.A18();
        this.A06.setPlayAccessibilityLabel(c12799w7.A1E());
        this.A06.setPauseAccessibilityLabel(c12799w7.A1D());
        this.A08.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(EnumC12476Qs enumC12476Qs) {
        if (this.A04 != null) {
            this.A04.A0b(enumC12476Qs, 24);
        } else if (!AdInternalSettings.isDebugBuild()) {
        } else {
            Log.e(A0H, A06(30, 42, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        if (this.A04 == null || this.A04.getState() == EnumC12527Rh.A06) {
            return false;
        }
        return this.A03 == EnumC12028JZ.A05 || this.A03 == EnumC12028JZ.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i) {
        InterfaceC12020JR A01;
        ((C112045Y) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        switch (i) {
            case 0:
                A01 = A01(mediaViewVideoRendererApi);
                break;
            case 1:
                A01 = A00(mediaViewVideoRendererApi);
                break;
            default:
                throw new IllegalArgumentException(A06(0, 30, 15));
        }
        ((C112135h) mediaViewVideoRendererApi).A06(A01);
        this.A01 = C112075b.A03(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new C113137V(this.A01);
        this.A07 = A02();
        this.A08 = A05();
        float density = AbstractC12137LP.A02;
        int bigPadding = (int) (2.0f * density);
        int smallPadding = (int) (25.0f * density);
        this.A06 = new View$OnClickListenerC113087O(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(bigPadding, smallPadding, smallPadding, bigPadding);
        this.A06.setLayoutParams(layoutParams);
        int i2 = 0;
        while (true) {
            int i3 = this.A00.getChildCount();
            if (A0G[2].length() == 26) {
                throw new RuntimeException();
            }
            A0G[6] = "7BCad5LO6te39ERddnjUHTKJR8zzbght";
            if (i2 < i3) {
                View childAt = this.A00.getChildAt(0);
                if (childAt instanceof C11580Bu) {
                    this.A04 = (C11580Bu) childAt;
                } else {
                    i2++;
                }
            }
        }
        if (this.A04 == null) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.e(A0H, A06(72, 36, 98));
            }
        } else {
            this.A04.A0c(this.A05);
            C11580Bu c11580Bu = this.A04;
            View$OnClickListenerC113087O view$OnClickListenerC113087O = this.A06;
            String[] strArr = A0G;
            if (strArr[0].charAt(7) != strArr[3].charAt(7)) {
                c11580Bu.A0c(view$OnClickListenerC113087O);
            } else {
                A0G[5] = "Z21owOXIiAfqNY46KReygSjUmuqXSFx4";
                c11580Bu.A0c(view$OnClickListenerC113087O);
            }
        }
        this.A08.A0W(0);
        this.A08.A0X(250);
        A01.AGT();
    }

    @Override // com.facebook.ads.redexgen.p370X.C112045Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.p370X.C112045Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        boolean A0p = C11979Im.A0p(this.A01);
        this.A00.setOnTouchListener(new View$OnTouchListenerC12016JN(this, A0p));
        if (!A0p) {
            A0A();
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.C112045Y, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.p370X.C112045Y, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0C();
    }
}
