package com.bytedance.sdk.openadsdk.core.p316PX.p319bg.p320bg;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.sdk.openadsdk.core.p316PX.C8633bX;
import com.bytedance.sdk.openadsdk.core.p316PX.p318bX.C8637bg;
import com.bytedance.sdk.openadsdk.core.p316PX.p319bg.p320bg.C8651zx;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.Tracking;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.bg.bg.bg */
/* loaded from: classes3.dex */
public class C8649bg {
    /* renamed from: bg */
    public static C8633bX m85435bg(Context context, XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        int i;
        C8633bX c8633bX;
        int i2;
        C8651zx.C8652bg c8652bg;
        int i3;
        int i4;
        C8637bg.EnumC8641bg enumC8641bg;
        String m85432IL;
        int i5;
        char c;
        if (context == null) {
            C8651zx.m85426bg(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i6 = displayMetrics.widthPixels;
        int i7 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        int i8 = (int) (i6 / f);
        int i9 = (int) (i7 / f);
        float f2 = Float.MIN_VALUE;
        C8633bX c8633bX2 = null;
        while (true) {
            int i10 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return c8633bX2;
            }
            xmlPullParser.next();
            int i11 = 2;
            if (xmlPullParser.getEventType() == 2) {
                String str = "Companion";
                if (xmlPullParser.getName().equals("Companion")) {
                    String str2 = C8651zx.f19089iR;
                    int m85433IL = C8651zx.m85433IL(xmlPullParser.getAttributeValue(str2, "width"));
                    int m85433IL2 = C8651zx.m85433IL(xmlPullParser.getAttributeValue(str2, "height"));
                    if (m85433IL >= 300 && m85433IL2 >= 250) {
                        C8651zx.C8652bg c8652bg2 = new C8651zx.C8652bg();
                        while (true) {
                            if (xmlPullParser.getEventType() == i10 && xmlPullParser.getName().equals(str)) {
                                if (!TextUtils.isEmpty(c8652bg2.f19092bg) && c8652bg2.f19093iR >= f2) {
                                    c8633bX2 = new C8633bX(m85433IL, m85433IL2, c8652bg2.f19090IL, c8652bg2.f19091bX, c8652bg2.f19092bg, c8652bg2.f19094zx, c8652bg2.ldr, c8652bg2.eqN);
                                    f2 = c8652bg2.f19093iR;
                                }
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == i11) {
                                    String name = xmlPullParser.getName();
                                    name.hashCode();
                                    C8633bX c8633bX3 = c8633bX2;
                                    String str3 = str;
                                    char c2 = 65535;
                                    switch (name.hashCode()) {
                                        case -375340334:
                                            if (name.equals("IFrameResource")) {
                                                c = 0;
                                                c2 = c;
                                                break;
                                            }
                                            break;
                                        case -348198615:
                                            if (name.equals(Companion.COMPANION_CLICK_THROUGH)) {
                                                c = 1;
                                                c2 = c;
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name.equals("TrackingEvents")) {
                                                c2 = 2;
                                                break;
                                            }
                                            break;
                                        case 676623548:
                                            if (name.equals("StaticResource")) {
                                                c2 = 3;
                                                break;
                                            }
                                            break;
                                        case 1877773523:
                                            if (name.equals(Companion.COMPANION_CLICK_TRACKING)) {
                                                c = 4;
                                                c2 = c;
                                                break;
                                            }
                                            break;
                                        case 1928285401:
                                            if (name.equals("HTMLResource")) {
                                                c = 5;
                                                c2 = c;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (c2) {
                                        case 0:
                                            i2 = i9;
                                            C8651zx.C8652bg c8652bg3 = c8652bg2;
                                            int i12 = m85433IL2;
                                            int i13 = m85433IL;
                                            Point m85479bg = C8637bg.m85479bg(context, i13, i12, C8637bg.EnumC8640IL.HTML_RESOURCE);
                                            int i14 = m85479bg.x;
                                            int i15 = m85479bg.y;
                                            C8637bg.EnumC8640IL enumC8640IL = C8637bg.EnumC8640IL.IFRAME_RESOURCE;
                                            C8637bg.EnumC8641bg enumC8641bg2 = C8637bg.EnumC8641bg.NONE;
                                            float m85491bg = C8633bX.m85491bg(i8, i2, i14, i15, enumC8640IL, enumC8641bg2);
                                            String m85432IL2 = C8651zx.m85432IL(xmlPullParser, "IFrameResource");
                                            if (!TextUtils.isEmpty(m85432IL2) && m85491bg > c8652bg3.f19093iR && m85491bg > f2) {
                                                c8652bg3.f19093iR = m85491bg;
                                                c8652bg3.m85420bg(m85432IL2, enumC8641bg2, enumC8640IL);
                                                c8652bg2 = c8652bg3;
                                                m85433IL = i13;
                                                m85433IL2 = i12;
                                                i11 = 2;
                                                c8633bX2 = c8633bX3;
                                                str = str3;
                                                i9 = i2;
                                                i10 = 3;
                                                break;
                                            } else {
                                                i5 = 3;
                                                C8651zx.m85424bg(xmlPullParser, "IFrameResource", 3);
                                                c8652bg2 = c8652bg3;
                                                m85433IL = i13;
                                                m85433IL2 = i12;
                                                i11 = 2;
                                                c8633bX2 = c8633bX3;
                                                str = str3;
                                                i10 = i5;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            c8652bg2.eqN = C8651zx.m85432IL(xmlPullParser, Companion.COMPANION_CLICK_THROUGH);
                                            i11 = 2;
                                            m85433IL = m85433IL;
                                            c8633bX2 = c8633bX3;
                                            str = str3;
                                            i10 = 3;
                                            break;
                                        case 2:
                                            i2 = i9;
                                            c8652bg = c8652bg2;
                                            i3 = m85433IL2;
                                            i4 = m85433IL;
                                            while (true) {
                                                if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                    m85433IL = i4;
                                                    m85433IL2 = i3;
                                                    c8652bg2 = c8652bg;
                                                    c8633bX2 = c8633bX3;
                                                    str = str3;
                                                    i9 = i2;
                                                    i10 = 3;
                                                    i11 = 2;
                                                    break;
                                                } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(Tracking.NAME)) {
                                                    c8652bg.m85422IL(C8651zx.m85432IL(xmlPullParser, Tracking.NAME));
                                                }
                                            }
                                            break;
                                        case 3:
                                            c8652bg = c8652bg2;
                                            i3 = m85433IL2;
                                            i4 = m85433IL;
                                            C8637bg.EnumC8641bg enumC8641bg3 = C8637bg.EnumC8641bg.NONE;
                                            String lowerCase = xmlPullParser.getAttributeValue(C8651zx.f19089iR, "creativeType").toLowerCase();
                                            Set<String> set = C8637bg.f19055bg;
                                            if (set.contains(lowerCase)) {
                                                enumC8641bg = C8637bg.EnumC8641bg.IMAGE;
                                            } else {
                                                enumC8641bg = C8637bg.EnumC8641bg.JAVASCRIPT;
                                            }
                                            C8637bg.EnumC8641bg enumC8641bg4 = enumC8641bg;
                                            C8637bg.EnumC8640IL enumC8640IL2 = C8637bg.EnumC8640IL.STATIC_RESOURCE;
                                            Point m85479bg2 = C8637bg.m85479bg(context, i4, i3, enumC8640IL2);
                                            i2 = i9;
                                            float m85491bg2 = C8633bX.m85491bg(i8, i9, m85479bg2.x, m85479bg2.y, enumC8640IL2, enumC8641bg4);
                                            if (!set.contains(lowerCase) && !C8637bg.f19054IL.contains(lowerCase)) {
                                                m85432IL = null;
                                            } else {
                                                m85432IL = C8651zx.m85432IL(xmlPullParser, "StaticResource");
                                            }
                                            if (m85491bg2 >= c8652bg.f19093iR && m85491bg2 > f2 && !TextUtils.isEmpty(m85432IL)) {
                                                c8652bg.f19093iR = m85491bg2;
                                                c8652bg.m85420bg(m85432IL, enumC8641bg4, enumC8640IL2);
                                                m85433IL = i4;
                                                m85433IL2 = i3;
                                                c8652bg2 = c8652bg;
                                                c8633bX2 = c8633bX3;
                                                str = str3;
                                                i9 = i2;
                                                i10 = 3;
                                                i11 = 2;
                                                break;
                                            } else {
                                                i5 = 3;
                                                C8651zx.m85424bg(xmlPullParser, "StaticResource", 3);
                                                m85433IL = i4;
                                                m85433IL2 = i3;
                                                c8652bg2 = c8652bg;
                                                c8633bX2 = c8633bX3;
                                                str = str3;
                                                i11 = 2;
                                                i10 = i5;
                                                break;
                                            }
                                            break;
                                        case 4:
                                            c8652bg2.m85421bg(C8651zx.m85432IL(xmlPullParser, Companion.COMPANION_CLICK_TRACKING));
                                            c8633bX2 = c8633bX3;
                                            str = str3;
                                            i10 = 3;
                                            i11 = 2;
                                            break;
                                        case 5:
                                            C8637bg.EnumC8640IL enumC8640IL3 = C8637bg.EnumC8640IL.HTML_RESOURCE;
                                            Point m85479bg3 = C8637bg.m85479bg(context, m85433IL, m85433IL2, enumC8640IL3);
                                            int i16 = m85479bg3.x;
                                            int i17 = m85479bg3.y;
                                            C8637bg.EnumC8641bg enumC8641bg5 = C8637bg.EnumC8641bg.NONE;
                                            C8651zx.C8652bg c8652bg4 = c8652bg2;
                                            int i18 = m85433IL2;
                                            int i19 = m85433IL;
                                            float m85491bg3 = C8633bX.m85491bg(i8, i9, i16, i17, enumC8640IL3, enumC8641bg5);
                                            String m85432IL3 = C8651zx.m85432IL(xmlPullParser, "HTMLResource");
                                            if (!TextUtils.isEmpty(m85432IL3) && m85491bg3 > c8652bg4.f19093iR && m85491bg3 > f2) {
                                                c8652bg4.f19093iR = m85491bg3;
                                                c8652bg4.m85420bg(m85432IL3, enumC8641bg5, enumC8640IL3);
                                                m85433IL = i19;
                                                c8652bg2 = c8652bg4;
                                                c8633bX2 = c8633bX3;
                                                str = str3;
                                                m85433IL2 = i18;
                                                i10 = 3;
                                                i11 = 2;
                                            } else {
                                                C8651zx.m85424bg(xmlPullParser, "HTMLResource", 3);
                                                i10 = 3;
                                                m85433IL = i19;
                                                c8652bg2 = c8652bg4;
                                                c8633bX2 = c8633bX3;
                                                str = str3;
                                                m85433IL2 = i18;
                                                i11 = 2;
                                                break;
                                            }
                                            break;
                                        default:
                                            C8651zx.m85426bg(xmlPullParser);
                                            i2 = i9;
                                            c8652bg = c8652bg2;
                                            i3 = m85433IL2;
                                            i4 = m85433IL;
                                            m85433IL = i4;
                                            m85433IL2 = i3;
                                            c8652bg2 = c8652bg;
                                            c8633bX2 = c8633bX3;
                                            str = str3;
                                            i9 = i2;
                                            i10 = 3;
                                            i11 = 2;
                                            break;
                                    }
                                } else {
                                    i2 = i9;
                                }
                                i9 = i2;
                            }
                        }
                    } else {
                        i = i9;
                        c8633bX = c8633bX2;
                        C8651zx.m85426bg(xmlPullParser);
                        c8633bX2 = c8633bX;
                        i9 = i;
                    }
                }
            }
            i = i9;
            c8633bX = c8633bX2;
            c8633bX2 = c8633bX;
            i9 = i;
        }
    }
}
