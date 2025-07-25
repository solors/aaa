package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;

/* renamed from: com.inmobi.media.H7 */
/* loaded from: classes6.dex */
public class C18951H7 extends C19162X6 {

    /* renamed from: l */
    public int f47311l;

    /* renamed from: m */
    public final byte f47312m;

    /* renamed from: n */
    public String f47313n;

    /* renamed from: o */
    public List f47314o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18951H7(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String borderStrokeStyle, String borderCornerStyle, String borderColor, String backgroundColor, int i9, byte b, String textColor, List textStyles, C18993K7 c18993k7) {
        super(i, i2, i3, i4, i5, i6, i7, i8, Reporting.EventType.FILL, borderStrokeStyle, borderCornerStyle, borderColor, backgroundColor, c18993k7);
        Intrinsics.checkNotNullParameter(borderStrokeStyle, "borderStrokeStyle");
        Intrinsics.checkNotNullParameter(borderCornerStyle, "borderCornerStyle");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(textStyles, "textStyles");
        this.f47311l = i9;
        this.f47312m = b;
        this.f47313n = textColor.length() == 0 ? "#ff000000" : textColor;
        int min = Math.min(textStyles.size(), 4);
        this.f47314o = new ArrayList();
        for (int i10 = 0; i10 < min; i10++) {
            this.f47314o.add(textStyles.get(i10));
        }
    }

    @Override // com.inmobi.media.C19162X6
    /* renamed from: a */
    public final String mo60558a() {
        String str = this.f47975j;
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
