package com.facebook.ads.redexgen.p370X;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import androidx.media3.common.C2100C;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.CI */
/* loaded from: assets/audience_network.dex */
public final class View$OnClickListenerC11604CI extends C12764VY implements View.OnClickListener, View.OnTouchListener {
    public static int A09;
    public static int A0A;
    public static int A0B;
    public static int A0C;
    public static int A0D;
    public static byte[] A0E;
    public static String[] A0F = {"KCgVVt0Ap7UjFwdZVPwtujaSBd4wOGh", "pwlBzpehZvT0dx09nfsqJf3x9Ohs0th5", "vfZ4vr2K2y2ARDvqPAWs6IAB7KSzcYkK", "bFCbuQIkoS9nYpv83ewRiG67IWanvmGf", "GLbAB0S4L", "VAKU94yPMVJGstkAs9GlkzAfXtUrDcQU", "ELeO8zIeBErz", "BBoYkiBeDILGrcaYIrD29JxsdoJmJVn4"};
    public int A00;
    public int A01;
    public C12008JF A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final InputMethodManager A06;
    public final Runnable A07;
    public final String A08;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0F[6].length() != 12) {
                throw new RuntimeException();
            }
            A0F[6] = "rGUQ6sPwqM0P";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
            i4++;
        }
    }

    public static void A09() {
        A0E = new byte[]{94, 81, 84, 94, 86, 98, 78, 82, 72, 79, 94, 88, 36, 40, 42, 105, 33, 38, 36, 34, 37, 40, 40, 44, 105, 38, 35, 52, 105, 37, 38, 41, 41, 34, 53, 105, 36, 43, 46, 36, 44, 34, 35, 118, 122, 120, 59, 115, 116, 118, 112, 119, 122, 122, 126, 59, 116, 113, 102, 59, 124, 123, 97, 112, 103, 102, 97, 124, 97, 124, 116, 121, 59, 118, 121, 124, 118, 126, 112, 113, 2, 14, 12, 79, 7, 0, 2, 4, 3, 14, 14, 10, 79, 0, 5, 18, 79, 15, 0, 21, 8, 23, 4, 79, 0, 5, 62, 2, 13, 8, 2, 10, 53, 50, 44, 41, 40, 3, 49, 57, 40, 52, 51, 56, 30, 24, 14, 25, 52, 9, 30, 13, 13, 14, 25, 14, 15, 52, 8, 7, 2, 8, 0, 52, 2, 10, 9, 52, 8, 7, 2, 8, 0, 24, 81, 87, 65, 86, 123, 70, 81, 66, 66, 65, 86, 65, SignedBytes.MAX_POWER_OF_TWO, 123, 71, 72, 77, 71, 79, 123, 77, 69, 70, 123, 80, 93, 84, 77, 74, 67};
    }

    static {
        A09();
        A0B = 450;
        A09 = 500;
        A0A = 50;
        A0D = 450;
        A0C = 150;
    }

    public View$OnClickListenerC11604CI(C111965Q c111965q, C13029Zs c13029Zs, InterfaceC12000J7 interfaceC12000J7, InterfaceC12201MR interfaceC12201MR, String str, int i) {
        super(c111965q, c13029Zs, interfaceC12000J7, interfaceC12201MR);
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = false;
        this.A07 = new RunnableC12204MU(this);
        this.A08 = str;
        this.A05 = new Handler(Looper.getMainLooper());
        this.A06 = (InputMethodManager) c13029Zs.getSystemService(A05(112, 12, 70));
        this.A04 = i;
    }

    public static /* synthetic */ int A02(View$OnClickListenerC11604CI view$OnClickListenerC11604CI) {
        int i = view$OnClickListenerC11604CI.A00;
        view$OnClickListenerC11604CI.A00 = i + 1;
        return i;
    }

    public void A06() {
        AbstractC12177M3.A0M(this, C2100C.ENCODING_PCM_32BIT_BIG_ENDIAN);
    }

    private void A07() {
        if (this.A08 == null) {
            return;
        }
        if (AdPlacementType.BANNER.name().equals(this.A08)) {
            super.A07.A0E(A05(12, 31, 93), null);
        } else if (AdPlacementType.NATIVE.name().equals(this.A08)) {
            super.A07.A0E(A05(80, 32, 123), null);
        } else if (AdPlacementType.INTERSTITIAL.name().equals(this.A08)) {
            super.A07.A0E(A05(43, 37, 15), null);
        } else if (!AdPlacementType.REWARDED_VIDEO.name().equals(this.A08)) {
        } else {
            super.A07.A0E(EnumC12479Qv.A04.A03(), null);
        }
    }

    private void A08() {
        AbstractC12177M3.A0M(this, 0);
    }

    public static /* synthetic */ boolean A0B(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.p370X.C12764VY
    public final InterfaceC12290Ns A0E() {
        return new C12768Vc(this);
    }

    @Override // com.facebook.ads.redexgen.p370X.C12764VY
    public final void A0F() {
        AbstractC12177M3.A0M(this, C2100C.ENCODING_PCM_32BIT_BIG_ENDIAN);
        setPadding(getResources().getConfiguration().orientation);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{A0A, A0A, A0A, A0A, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(-1);
        this.A0B.setBackground(gradientDrawable);
        this.A0B.setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.ads.redexgen.X.MT
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return View$OnClickListenerC11604CI.A0B(view, motionEvent);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        addView(this.A0B, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A0B.getId());
        layoutParams2.addRule(12);
        this.A0E.setBackgroundColor(-1);
        addView(this.A0E, layoutParams2);
        this.A0E.setOnTouchListener(this);
        setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) (AbstractC12137LP.A02 * 2.0f));
        layoutParams3.addRule(3, this.A0B.getId());
        this.A0C.setProgress(0);
        addView(this.A0C, layoutParams3);
        A06();
        this.A0A.A3q(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.p370X.C12764VY
    public final void A0G() {
        A08();
        super.A07.A05().overridePendingTransition(0, 0);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, Resources.getSystem().getDisplayMetrics().heightPixels);
        translateAnimation.setDuration(A09);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new animationAnimation$AnimationListenerC12206MW(this));
        startAnimation(translateAnimation);
    }

    @Override // com.facebook.ads.redexgen.p370X.C12764VY
    public final void A0H(String str) {
        if (this.A04 > 0 && !this.A03) {
            this.A03 = true;
            this.A05.removeCallbacksAndMessages(null);
            Map<String, String> A05 = new C12306O8().A03(null).A02(null).A05();
            A05.put(A05(0, 12, 39), str);
            if (this.A02 != null) {
                this.A02.A04(EnumC12007JE.A0J, A05);
            }
            A07();
            this.A09.AA9(super.A04, A05);
            if (C11979Im.A2J(super.A08)) {
                HashMap hashMap = new HashMap();
                hashMap.put(AbstractC13206cm.A03, Boolean.TRUE.toString());
                hashMap.put(AbstractC13206cm.A04, Boolean.TRUE.toString());
                hashMap.put(AbstractC13206cm.A05, Boolean.TRUE.toString());
                this.A09.AAI(super.A04, hashMap);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.C12764VY, com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void A9q(Intent intent, Bundle bundle, C111965Q c111965q) {
        super.A9q(intent, bundle, c111965q);
        this.A02 = new C12008JF(super.A04, this.A09);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A08();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, Resources.getSystem().getDisplayMetrics().heightPixels, 0.0f);
        translateAnimation.setDuration(A0B);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new animationAnimation$AnimationListenerC12205MV(this));
        startAnimation(translateAnimation);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A0G();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setPadding(configuration.orientation);
    }

    @Override // com.facebook.ads.redexgen.p370X.C12764VY, com.facebook.ads.redexgen.p370X.InterfaceC12202MS
    public final void onDestroy() {
        super.onDestroy();
        this.A05.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (this.A06 != null) {
                    InputMethodManager inputMethodManager = this.A06;
                    if (A0F[1].charAt(4) != 'z') {
                        throw new RuntimeException();
                    }
                    A0F[6] = "wSSlTu5XSXtb";
                    if (!inputMethodManager.isAcceptingText()) {
                        return false;
                    }
                    A0H(A05(154, 30, 62));
                    return false;
                }
                return false;
            case 1:
                this.A01++;
                if (this.A01 < 5) {
                    return false;
                }
                A0H(A05(124, 30, 113));
                return false;
            default:
                return false;
        }
    }

    private void setPadding(int i) {
        if (i == 2) {
            setPadding(0, A0C, 0, 0);
        } else {
            setPadding(0, A0D, 0, 0);
        }
    }
}
