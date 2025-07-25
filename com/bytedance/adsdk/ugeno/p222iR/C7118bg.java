package com.bytedance.adsdk.ugeno.p222iR;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.ViewCompat;
import com.ironsource.C21114v8;

/* renamed from: com.bytedance.adsdk.ugeno.iR.bg */
/* loaded from: classes3.dex */
public class C7118bg {

    /* renamed from: com.bytedance.adsdk.ugeno.iR.bg$bg */
    /* loaded from: classes3.dex */
    public static class C7119bg {

        /* renamed from: IL */
        public int[] f15287IL;

        /* renamed from: bX */
        public float[] f15288bX;

        /* renamed from: bg */
        public GradientDrawable.Orientation f15289bg;
    }

    /* renamed from: IL */
    public static C7119bg m89998IL(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String substring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        int m89994bg = m89994bg(substring, '%');
        int indexOf2 = substring.indexOf(",");
        String substring2 = substring.substring(0, indexOf2);
        C7119bg c7119bg = new C7119bg();
        c7119bg.f15289bg = eqN(substring2);
        String substring3 = substring.substring(indexOf2 + 1);
        int[] iArr = new int[m89994bg];
        float[] fArr = new float[m89994bg];
        for (int i = 0; i < m89994bg; i++) {
            int indexOf3 = substring3.indexOf("%");
            String trim = substring3.substring(0, indexOf3 + 1).trim();
            if (trim.contains("rgba")) {
                indexOf = trim.indexOf(")");
            } else {
                indexOf = trim.indexOf(" ");
            }
            int i2 = indexOf + 1;
            iArr[i] = m89995bg(trim.substring(0, i2).trim());
            fArr[i] = C7117bX.m90002bg(trim.substring(i2, trim.indexOf("%")).trim(), 0.0f) / 100.0f;
            int i3 = indexOf3 + 2;
            if (substring3.length() <= i3) {
                break;
            }
            substring3 = substring3.substring(i3);
        }
        c7119bg.f15287IL = iArr;
        c7119bg.f15288bX = fArr;
        return c7119bg;
    }

    /* renamed from: bX */
    public static boolean m89997bX(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("linear-gradient")) {
            return false;
        }
        return true;
    }

    /* renamed from: bg */
    public static int m89995bg(String str) {
        return m89993bg(str, (int) ViewCompat.MEASURED_STATE_MASK);
    }

    public static GradientDrawable.Orientation eqN(String str) {
        int parseInt;
        try {
            if (str.contains("deg")) {
                parseInt = Integer.parseInt(str.substring(0, str.length() - 3).trim());
            } else {
                parseInt = Integer.parseInt(str);
            }
            if (parseInt == 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseInt == 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseInt == 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (parseInt == 135) {
                return GradientDrawable.Orientation.TL_BR;
            }
            if (parseInt == 45) {
                return GradientDrawable.Orientation.BL_TR;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    /* renamed from: bg */
    public static int m89993bg(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        if (str.equals(C21114v8.C21122h.f54047T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 4) {
            StringBuilder sb2 = new StringBuilder("#");
            char[] charArray = str.toCharArray();
            for (int i2 = 1; i2 < charArray.length; i2++) {
                sb2.append(charArray[i2]);
                sb2.append(charArray[i2]);
            }
            return Color.parseColor(sb2.toString());
        } else if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        } else {
            if (str.charAt(0) == '#' && str.length() == 9) {
                return Color.parseColor(str);
            }
            if (str.startsWith("rgba")) {
                String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
                if (split == null || split.length != 4) {
                    return i;
                }
                return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2])) | 0;
            }
            return ViewCompat.MEASURED_STATE_MASK;
        }
    }

    /* renamed from: bg */
    public static int m89994bg(String str, char c) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: bg */
    public static int m89996bg(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            Log.e("ColorUtils", "alpha must be between 0 and 255. ");
            i2 = 255;
        }
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (i2 << 24);
    }
}
