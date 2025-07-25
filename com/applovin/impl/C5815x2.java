package com.applovin.impl;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.core.view.ViewCompat;

/* renamed from: com.applovin.impl.x2 */
/* loaded from: classes2.dex */
public final class C5815x2 {

    /* renamed from: g */
    public static final C5815x2 f11863g = new C5815x2(-1, ViewCompat.MEASURED_STATE_MASK, 0, 0, -1, null);

    /* renamed from: a */
    public final int f11864a;

    /* renamed from: b */
    public final int f11865b;

    /* renamed from: c */
    public final int f11866c;

    /* renamed from: d */
    public final int f11867d;

    /* renamed from: e */
    public final int f11868e;

    /* renamed from: f */
    public final Typeface f11869f;

    public C5815x2(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f11864a = i;
        this.f11865b = i2;
        this.f11866c = i3;
        this.f11867d = i4;
        this.f11868e = i5;
        this.f11869f = typeface;
    }

    /* renamed from: a */
    public static C5815x2 m93321a(CaptioningManager.CaptionStyle captionStyle) {
        if (AbstractC5863xp.f12151a >= 21) {
            return m93319c(captionStyle);
        }
        return m93320b(captionStyle);
    }

    /* renamed from: b */
    private static C5815x2 m93320b(CaptioningManager.CaptionStyle captionStyle) {
        return new C5815x2(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    /* renamed from: c */
    private static C5815x2 m93319c(CaptioningManager.CaptionStyle captionStyle) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (captionStyle.hasForegroundColor()) {
            i = captionStyle.foregroundColor;
        } else {
            i = f11863g.f11864a;
        }
        int i6 = i;
        if (captionStyle.hasBackgroundColor()) {
            i2 = captionStyle.backgroundColor;
        } else {
            i2 = f11863g.f11865b;
        }
        int i7 = i2;
        if (captionStyle.hasWindowColor()) {
            i3 = captionStyle.windowColor;
        } else {
            i3 = f11863g.f11866c;
        }
        int i8 = i3;
        if (captionStyle.hasEdgeType()) {
            i4 = captionStyle.edgeType;
        } else {
            i4 = f11863g.f11867d;
        }
        int i9 = i4;
        if (captionStyle.hasEdgeColor()) {
            i5 = captionStyle.edgeColor;
        } else {
            i5 = f11863g.f11868e;
        }
        return new C5815x2(i6, i7, i8, i9, i5, captionStyle.getTypeface());
    }
}
