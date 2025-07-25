package com.bytedance.sdk.component.adexpress.dynamic.p252zx;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.p252zx.C7470IL;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.zx.VB */
/* loaded from: classes3.dex */
public class C7475VB {

    /* renamed from: IL */
    private static String f16252IL;

    /* renamed from: bg */
    private static final Set<String> f16253bg = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));

    /* renamed from: IL */
    public static double m88730IL(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString("fontSize"));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(3:179|(1:182)|183)(2:208|(1:210)(5:211|185|(5:195|196|197|(3:199|(1:205)(1:202)|203)|206)|193|194))|184|185|(3:187|189|191)|195|196|197|(0)|206) */
    /* JADX WARN: Removed duplicated region for block: B:221:0x047f A[Catch: Exception -> 0x0490, TryCatch #0 {Exception -> 0x0490, blocks: (B:219:0x0475, B:221:0x047f, B:226:0x0489), top: B:270:0x0475 }] */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.sdk.component.adexpress.dynamic.p252zx.C7470IL.C7472bX m88723bg(java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, boolean r24, int r25, com.bytedance.sdk.component.adexpress.dynamic.eqN.C7457Kg r26, double r27, int r29, double r30, java.lang.String r32, com.bytedance.sdk.component.adexpress.p241IL.C7282Ta r33) {
        /*
            Method dump skipped, instructions count: 1337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.p252zx.C7475VB.m88723bg(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, com.bytedance.sdk.component.adexpress.dynamic.eqN.Kg, double, int, double, java.lang.String, com.bytedance.sdk.component.adexpress.IL.Ta):com.bytedance.sdk.component.adexpress.dynamic.zx.IL$bX");
    }

    /* renamed from: IL */
    public static int[] m88729IL(String str, float f, boolean z) {
        try {
            TextView textView = new TextView(C7487eqN.m88683bg());
            textView.setTextSize(f);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    /* renamed from: IL */
    public static boolean m88731IL() {
        return !TextUtils.isEmpty(f16252IL);
    }

    /* renamed from: bg */
    public static String m88726bg(String str) {
        String[] split;
        return (TextUtils.isEmpty(str) || (split = str.split("adx:")) == null || split.length < 2) ? "" : split[1];
    }

    /* renamed from: bg */
    private static C7470IL.C7472bX m88727bg(C7470IL.C7472bX c7472bX, String str, String str2, String str3) {
        if (str.contains("union")) {
            c7472bX.f16248bg = 0.0f;
            c7472bX.f16247IL = 0.0f;
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = m88726bg(str);
            }
            if (TextUtils.isEmpty(str3)) {
                c7472bX.f16248bg = 0.0f;
                c7472bX.f16247IL = 0.0f;
            } else {
                return m88724bg(str3, str2);
            }
        }
        return c7472bX;
    }

    /* renamed from: bg */
    public static C7470IL.C7472bX m88724bg(String str, String str2) {
        return m88722bg(str, str2, false);
    }

    /* renamed from: bg */
    public static C7470IL.C7472bX m88722bg(String str, String str2, boolean z) {
        C7470IL.C7472bX c7472bX = new C7470IL.C7472bX();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] m88725bg = m88725bg(str, (float) m88730IL(str2), z);
            c7472bX.f16248bg = m88725bg[0];
            c7472bX.f16247IL = m88725bg[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                c7472bX.f16247IL = 0.0f;
            }
        } catch (Exception unused) {
        }
        return c7472bX;
    }

    /* renamed from: bg */
    public static int[] m88725bg(String str, float f, boolean z) {
        int[] m88729IL = m88729IL(str, f, z);
        return new int[]{C7489Kg.m88680IL(C7487eqN.m88683bg(), m88729IL[0]), C7489Kg.m88680IL(C7487eqN.m88683bg(), m88729IL[1])};
    }

    /* renamed from: bg */
    public static String m88728bg() {
        return f16252IL;
    }
}
