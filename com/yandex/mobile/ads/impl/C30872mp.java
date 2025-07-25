package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.ironsource.C21114v8;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.yandex.mobile.ads.impl.mp */
/* loaded from: classes8.dex */
public final class C30872mp {

    /* renamed from: a */
    private static final Pattern f82331a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b */
    private static final Pattern f82332b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c */
    private static final Pattern f82333c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d */
    private static final HashMap f82334d;

    static {
        HashMap hashMap = new HashMap();
        f82334d = hashMap;
        mr0.m31868a(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        mr0.m31868a(-16711681, hashMap, "aqua", -8388652, "aquamarine");
        mr0.m31868a(-983041, hashMap, "azure", -657956, "beige");
        mr0.m31868a(-6972, hashMap, "bisque", ViewCompat.MEASURED_STATE_MASK, "black");
        mr0.m31868a(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        mr0.m31868a(-7722014, hashMap, "blueviolet", -5952982, "brown");
        mr0.m31868a(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        mr0.m31868a(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        mr0.m31868a(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        mr0.m31868a(-1828, hashMap, "cornsilk", -2354116, "crimson");
        mr0.m31868a(-16711681, hashMap, "cyan", -16777077, "darkblue");
        mr0.m31868a(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        mr0.m31868a(-5658199, hashMap, "darkgray", -16751616, "darkgreen");
        mr0.m31868a(-5658199, hashMap, "darkgrey", -4343957, "darkkhaki");
        mr0.m31868a(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        mr0.m31868a(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        mr0.m31868a(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        mr0.m31868a(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        mr0.m31868a(-13676721, hashMap, "darkslategray", -13676721, "darkslategrey");
        mr0.m31868a(-16724271, hashMap, "darkturquoise", -7077677, "darkviolet");
        mr0.m31868a(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        mr0.m31868a(-9868951, hashMap, "dimgray", -9868951, "dimgrey");
        mr0.m31868a(-14774017, hashMap, "dodgerblue", -5103070, "firebrick");
        mr0.m31868a(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        mr0.m31868a(-65281, hashMap, "fuchsia", -2302756, "gainsboro");
        mr0.m31868a(-460545, hashMap, "ghostwhite", -10496, "gold");
        mr0.m31868a(-2448096, hashMap, "goldenrod", -8355712, "gray");
        mr0.m31868a(-16744448, hashMap, "green", -5374161, "greenyellow");
        mr0.m31868a(-8355712, hashMap, "grey", -983056, "honeydew");
        mr0.m31868a(-38476, hashMap, "hotpink", -3318692, "indianred");
        mr0.m31868a(-11861886, hashMap, "indigo", -16, "ivory");
        mr0.m31868a(-989556, hashMap, "khaki", -1644806, "lavender");
        mr0.m31868a(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        mr0.m31868a(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        mr0.m31868a(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        mr0.m31868a(-329006, hashMap, "lightgoldenrodyellow", -2894893, "lightgray");
        mr0.m31868a(-7278960, hashMap, "lightgreen", -2894893, "lightgrey");
        mr0.m31868a(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        mr0.m31868a(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        mr0.m31868a(-8943463, hashMap, "lightslategray", -8943463, "lightslategrey");
        mr0.m31868a(-5192482, hashMap, "lightsteelblue", -32, "lightyellow");
        mr0.m31868a(-16711936, hashMap, "lime", -13447886, "limegreen");
        mr0.m31868a(-331546, hashMap, "linen", -65281, "magenta");
        mr0.m31868a(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        mr0.m31868a(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        mr0.m31868a(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        mr0.m31868a(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        mr0.m31868a(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        mr0.m31868a(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        mr0.m31868a(-6943, hashMap, "mistyrose", -6987, "moccasin");
        mr0.m31868a(-8531, hashMap, "navajowhite", -16777088, "navy");
        mr0.m31868a(-133658, hashMap, "oldlace", -8355840, "olive");
        mr0.m31868a(-9728477, hashMap, "olivedrab", -23296, "orange");
        mr0.m31868a(-47872, hashMap, "orangered", -2461482, "orchid");
        mr0.m31868a(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        mr0.m31868a(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        mr0.m31868a(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        mr0.m31868a(-3308225, hashMap, "peru", -16181, "pink");
        mr0.m31868a(-2252579, hashMap, "plum", -5185306, "powderblue");
        mr0.m31868a(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        mr0.m31868a(SupportMenu.CATEGORY_MASK, hashMap, "red", -4419697, "rosybrown");
        mr0.m31868a(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        mr0.m31868a(-360334, hashMap, "salmon", -744352, "sandybrown");
        mr0.m31868a(-13726889, hashMap, "seagreen", -2578, "seashell");
        mr0.m31868a(-6270419, hashMap, "sienna", -4144960, "silver");
        mr0.m31868a(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        mr0.m31868a(-9404272, hashMap, "slategray", -9404272, "slategrey");
        mr0.m31868a(-1286, hashMap, "snow", -16711809, "springgreen");
        mr0.m31868a(-12156236, hashMap, "steelblue", -2968436, "tan");
        mr0.m31868a(-16744320, hashMap, "teal", -2572328, "thistle");
        mr0.m31868a(-40121, hashMap, "tomato", 0, C21114v8.C21122h.f54047T);
        mr0.m31868a(-12525360, hashMap, "turquoise", -1146130, "violet");
        mr0.m31868a(-663885, hashMap, "wheat", -1, "white");
        mr0.m31868a(-657931, hashMap, "whitesmoke", InputDeviceCompat.SOURCE_ANY, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    @ColorInt
    /* renamed from: a */
    private static int m31883a(String str, boolean z) {
        int parseInt;
        if (!TextUtils.isEmpty(str)) {
            String replace = str.replace(" ", "");
            if (replace.charAt(0) == '#') {
                int parseLong = (int) Long.parseLong(replace.substring(1), 16);
                if (replace.length() == 7) {
                    return (-16777216) | parseLong;
                }
                if (replace.length() == 9) {
                    return ((parseLong & 255) << 24) | (parseLong >>> 8);
                }
                throw new IllegalArgumentException();
            }
            if (replace.startsWith("rgba")) {
                Matcher matcher = (z ? f82333c : f82332b).matcher(replace);
                if (matcher.matches()) {
                    if (z) {
                        String group = matcher.group(4);
                        group.getClass();
                        parseInt = (int) (Float.parseFloat(group) * 255.0f);
                    } else {
                        String group2 = matcher.group(4);
                        group2.getClass();
                        parseInt = Integer.parseInt(group2, 10);
                    }
                    String group3 = matcher.group(1);
                    group3.getClass();
                    int parseInt2 = Integer.parseInt(group3, 10);
                    String group4 = matcher.group(2);
                    group4.getClass();
                    int parseInt3 = Integer.parseInt(group4, 10);
                    String group5 = matcher.group(3);
                    group5.getClass();
                    return Color.argb(parseInt, parseInt2, parseInt3, Integer.parseInt(group5, 10));
                }
            } else if (replace.startsWith("rgb")) {
                Matcher matcher2 = f82331a.matcher(replace);
                if (matcher2.matches()) {
                    String group6 = matcher2.group(1);
                    group6.getClass();
                    int parseInt4 = Integer.parseInt(group6, 10);
                    String group7 = matcher2.group(2);
                    group7.getClass();
                    int parseInt5 = Integer.parseInt(group7, 10);
                    String group8 = matcher2.group(3);
                    group8.getClass();
                    return Color.rgb(parseInt4, parseInt5, Integer.parseInt(group8, 10));
                }
            } else {
                Integer num = (Integer) f82334d.get(C30784lf.m32278b(replace));
                if (num != null) {
                    return num.intValue();
                }
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @ColorInt
    /* renamed from: b */
    public static int m31882b(String str) {
        return m31883a(str, false);
    }

    @ColorInt
    /* renamed from: a */
    public static int m31884a(String str) {
        return m31883a(str, true);
    }
}
