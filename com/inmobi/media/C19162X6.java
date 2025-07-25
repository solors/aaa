package com.inmobi.media;

import android.graphics.Point;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;

/* renamed from: com.inmobi.media.X6 */
/* loaded from: classes6.dex */
public class C19162X6 {

    /* renamed from: a */
    public final Point f47966a;

    /* renamed from: b */
    public final Point f47967b;

    /* renamed from: c */
    public final Point f47968c;

    /* renamed from: d */
    public final Point f47969d;

    /* renamed from: e */
    public final String f47970e;

    /* renamed from: f */
    public final String f47971f;

    /* renamed from: g */
    public final String f47972g;

    /* renamed from: h */
    public final float f47973h;

    /* renamed from: i */
    public final String f47974i;

    /* renamed from: j */
    public final String f47975j;

    /* renamed from: k */
    public final C18993K7 f47976k;

    public C19162X6() {
        this.f47966a = new Point(0, 0);
        this.f47968c = new Point(0, 0);
        this.f47967b = new Point(0, 0);
        this.f47969d = new Point(0, 0);
        this.f47970e = "none";
        this.f47971f = "straight";
        this.f47973h = 10.0f;
        this.f47974i = "#ff000000";
        this.f47975j = "#00000000";
        this.f47972g = Reporting.EventType.FILL;
        this.f47976k = null;
    }

    /* renamed from: a */
    public String mo60558a() {
        String str = this.f47975j;
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public C19162X6(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String contentMode, String borderStrokeStyle, String borderCornerStyle, String borderColor, String backgroundColor, C18993K7 c18993k7) {
        Intrinsics.checkNotNullParameter(contentMode, "contentMode");
        Intrinsics.checkNotNullParameter(borderStrokeStyle, "borderStrokeStyle");
        Intrinsics.checkNotNullParameter(borderCornerStyle, "borderCornerStyle");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.f47966a = new Point(i3, i4);
        this.f47967b = new Point(i7, i8);
        this.f47968c = new Point(i, i2);
        this.f47969d = new Point(i5, i6);
        this.f47970e = borderStrokeStyle;
        this.f47971f = borderCornerStyle;
        this.f47973h = 10.0f;
        this.f47972g = contentMode;
        this.f47974i = borderColor.length() == 0 ? "#ff000000" : borderColor;
        this.f47975j = backgroundColor.length() == 0 ? "#00000000" : backgroundColor;
        this.f47976k = c18993k7;
    }
}
