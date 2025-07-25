package com.facebook.ads.redexgen.p370X;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Jn */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12040Jn {
    public static String[] A00 = {"TYvyTugW0LIK7CMS2wYs9G2uUGgA7Dke", "WsEiqL7ZS4BTI966aPHoJ2dPx2Ea0F4I", "bsmL1TSWcO8d5RdSDpnXrtDP3Rd3pXtR", "xkYelsmw9O3RFB2zMTQOqufEggZJfpsf", "Ou1dyJktpNGGcf9tDpPKvHuJxEoqg2O4", "MwtSqX2RTtZq4kMpP", "Xg7OrQNETkr2DWt43s", "zI20iJtpElrzvKbVLZsd1iWpdjTxU8BC"};

    public static EnumC12038Jl A00(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = displayMetrics.heightPixels;
        int screenHeight = (int) (screenWidth / displayMetrics.density);
        if (C12138LQ.A04(i, screenHeight)) {
            return EnumC12038Jl.A0I;
        }
        if (screenHeight > i) {
            EnumC12038Jl enumC12038Jl = EnumC12038Jl.A0K;
            String[] strArr = A00;
            String str = strArr[5];
            String str2 = strArr[6];
            int screenHeight2 = str.length();
            int screenWidth2 = str2.length();
            if (screenHeight2 != screenWidth2) {
                A00[7] = "zEjIxhk858iOsdYr9SgRsiKXnD8rO3VU";
                return enumC12038Jl;
            }
            throw new RuntimeException();
        }
        return EnumC12038Jl.A0H;
    }

    public static void A01(DisplayMetrics displayMetrics, View view, EnumC12036Jj enumC12036Jj) {
        int ceil;
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = enumC12036Jj.A04();
        if (i >= screenWidth) {
            ceil = displayMetrics.widthPixels;
        } else {
            int screenWidth2 = enumC12036Jj.A04();
            ceil = (int) Math.ceil(screenWidth2 * displayMetrics.density);
        }
        int screenWidth3 = enumC12036Jj.A03();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ceil, (int) Math.ceil(screenWidth3 * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
