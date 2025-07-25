package com.explorestack.iab.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;

/* renamed from: com.explorestack.iab.utils.d */
/* loaded from: classes3.dex */
public class C10507d implements Serializable {
    @Nullable

    /* renamed from: b */
    private Integer f24006b;
    @Nullable

    /* renamed from: c */
    private Integer f24007c;
    @Nullable

    /* renamed from: d */
    private Boolean f24008d;
    @Nullable

    /* renamed from: f */
    private Boolean f24009f;
    @Nullable

    /* renamed from: g */
    private Integer f24010g;
    @Nullable

    /* renamed from: h */
    private Integer f24011h;
    @Nullable

    /* renamed from: i */
    private String f24012i;
    @Nullable

    /* renamed from: j */
    private Float f24013j;
    @Nullable

    /* renamed from: k */
    private Float f24014k;
    @Nullable

    /* renamed from: l */
    private Integer f24015l;
    @Nullable

    /* renamed from: m */
    private Integer f24016m;
    @Nullable

    /* renamed from: n */
    private Integer f24017n;
    @Nullable

    /* renamed from: o */
    private Integer f24018o;
    @Nullable

    /* renamed from: p */
    private Integer f24019p;
    @Nullable

    /* renamed from: q */
    private Integer f24020q;
    @Nullable

    /* renamed from: r */
    private Integer f24021r;
    @Nullable

    /* renamed from: s */
    private Integer f24022s;
    @Nullable

    /* renamed from: t */
    private String f24023t;
    @Nullable

    /* renamed from: u */
    private Float f24024u;
    @Nullable

    /* renamed from: v */
    private Float f24025v;
    @Nullable

    /* renamed from: w */
    private Float f24026w;
    @Nullable

    /* renamed from: x */
    private Integer f24027x;
    @Nullable

    /* renamed from: y */
    private Float f24028y;

    public C10507d() {
    }

    public C10507d(@Nullable C10507d c10507d) {
        m79398E(c10507d);
    }

    /* renamed from: A */
    public boolean m79402A() {
        if (this.f24007c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public boolean m79401B() {
        if (this.f24006b != null) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: C */
    public Boolean m79400C() {
        Boolean bool = this.f24008d;
        if (bool != null) {
            return bool;
        }
        return Boolean.FALSE;
    }

    @NonNull
    /* renamed from: D */
    public Boolean m79399D() {
        Boolean bool = this.f24009f;
        if (bool != null) {
            return bool;
        }
        return Boolean.TRUE;
    }

    /* renamed from: E */
    public void m79398E(@Nullable C10507d c10507d) {
        if (c10507d == null) {
            return;
        }
        Integer num = c10507d.f24006b;
        if (num != null) {
            this.f24006b = num;
        }
        Integer num2 = c10507d.f24007c;
        if (num2 != null) {
            this.f24007c = num2;
        }
        Boolean bool = c10507d.f24008d;
        if (bool != null) {
            this.f24008d = bool;
        }
        Boolean bool2 = c10507d.f24009f;
        if (bool2 != null) {
            this.f24009f = bool2;
        }
        Integer num3 = c10507d.f24010g;
        if (num3 != null) {
            this.f24010g = num3;
        }
        Integer num4 = c10507d.f24011h;
        if (num4 != null) {
            this.f24011h = num4;
        }
        String str = c10507d.f24012i;
        if (str != null) {
            this.f24012i = str;
        }
        Float f = c10507d.f24013j;
        if (f != null) {
            this.f24013j = f;
        }
        Float f2 = c10507d.f24014k;
        if (f2 != null) {
            this.f24014k = f2;
        }
        Integer num5 = c10507d.f24015l;
        if (num5 != null) {
            this.f24015l = num5;
        }
        Integer num6 = c10507d.f24016m;
        if (num6 != null) {
            this.f24016m = num6;
        }
        Integer num7 = c10507d.f24017n;
        if (num7 != null) {
            this.f24017n = num7;
        }
        Integer num8 = c10507d.f24018o;
        if (num8 != null) {
            this.f24018o = num8;
        }
        Integer num9 = c10507d.f24019p;
        if (num9 != null) {
            this.f24019p = num9;
        }
        Integer num10 = c10507d.f24021r;
        if (num10 != null) {
            this.f24021r = num10;
        }
        Integer num11 = c10507d.f24020q;
        if (num11 != null) {
            this.f24020q = num11;
        }
        Integer num12 = c10507d.f24022s;
        if (num12 != null) {
            this.f24022s = num12;
        }
        String str2 = c10507d.f24023t;
        if (str2 != null) {
            this.f24023t = str2;
        }
        Float f3 = c10507d.f24024u;
        if (f3 != null) {
            this.f24024u = f3;
        }
        Float f4 = c10507d.f24025v;
        if (f4 != null) {
            this.f24025v = f4;
        }
        Float f5 = c10507d.f24026w;
        if (f5 != null) {
            this.f24026w = f5;
        }
        Integer num13 = c10507d.f24027x;
        if (num13 != null) {
            this.f24027x = num13;
        }
        Float f6 = c10507d.f24028y;
        if (f6 != null) {
            this.f24028y = f6;
        }
    }

    /* renamed from: F */
    public int m79397F() {
        return m79353y().intValue() | m79366l().intValue();
    }

    /* renamed from: G */
    public void m79396G(@Nullable String str) {
        this.f24023t = str;
    }

    /* renamed from: H */
    public void m79395H(@Nullable Integer num) {
        this.f24007c = num;
    }

    /* renamed from: I */
    public void m79394I(@Nullable Float f) {
        this.f24028y = f;
    }

    /* renamed from: J */
    public void m79393J(@Nullable Integer num) {
        this.f24027x = num;
    }

    /* renamed from: K */
    public void m79392K(@Nullable Number number) {
        this.f24026w = Float.valueOf(number.floatValue());
    }

    /* renamed from: L */
    public void m79391L(@Nullable Float f) {
        this.f24014k = f;
    }

    /* renamed from: M */
    public void m79390M(@Nullable Integer num) {
        this.f24010g = num;
    }

    /* renamed from: N */
    public void m79389N(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.f24019p = num;
        this.f24020q = num2;
        this.f24021r = num3;
        this.f24022s = num4;
    }

    /* renamed from: O */
    public void m79388O(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            m79389N(null, null, null, null);
            return;
        }
        String[] split = str.split(" ");
        if (split.length == 1) {
            int intValue = C10512g.m79303n(split[0]).intValue();
            m79389N(Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue));
        } else if (split.length == 2) {
            int intValue2 = C10512g.m79303n(split[0]).intValue();
            int intValue3 = C10512g.m79303n(split[1]).intValue();
            m79389N(Integer.valueOf(intValue3), Integer.valueOf(intValue2), Integer.valueOf(intValue3), Integer.valueOf(intValue2));
        } else if (split.length == 3) {
            int intValue4 = C10512g.m79303n(split[0]).intValue();
            int intValue5 = C10512g.m79303n(split[1]).intValue();
            m79389N(Integer.valueOf(intValue5), Integer.valueOf(intValue4), Integer.valueOf(intValue5), Integer.valueOf(C10512g.m79303n(split[2]).intValue()));
        } else if (split.length == 4) {
            m79389N(Integer.valueOf(C10512g.m79303n(split[3]).intValue()), Integer.valueOf(C10512g.m79303n(split[0]).intValue()), Integer.valueOf(C10512g.m79303n(split[1]).intValue()), Integer.valueOf(C10512g.m79303n(split[2]).intValue()));
        }
    }

    /* renamed from: P */
    public void m79387P(@Nullable Float f) {
        this.f24013j = f;
    }

    /* renamed from: Q */
    public void m79386Q(@Nullable Boolean bool) {
        this.f24008d = bool;
    }

    /* renamed from: R */
    public void m79385R(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.f24015l = num;
        this.f24017n = num2;
        this.f24016m = num3;
        this.f24018o = num4;
    }

    /* renamed from: S */
    public void m79384S(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            m79385R(null, null, null, null);
            return;
        }
        String[] split = str.split(" ");
        if (split.length == 1) {
            int intValue = C10512g.m79303n(split[0]).intValue();
            m79385R(Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue));
        } else if (split.length == 2) {
            int intValue2 = C10512g.m79303n(split[0]).intValue();
            int intValue3 = C10512g.m79303n(split[1]).intValue();
            m79385R(Integer.valueOf(intValue3), Integer.valueOf(intValue2), Integer.valueOf(intValue3), Integer.valueOf(intValue2));
        } else if (split.length == 3) {
            int intValue4 = C10512g.m79303n(split[0]).intValue();
            int intValue5 = C10512g.m79303n(split[1]).intValue();
            m79385R(Integer.valueOf(intValue5), Integer.valueOf(intValue4), Integer.valueOf(intValue5), Integer.valueOf(C10512g.m79303n(split[2]).intValue()));
        } else if (split.length == 4) {
            m79385R(Integer.valueOf(C10512g.m79303n(split[3]).intValue()), Integer.valueOf(C10512g.m79303n(split[0]).intValue()), Integer.valueOf(C10512g.m79303n(split[1]).intValue()), Integer.valueOf(C10512g.m79303n(split[2]).intValue()));
        }
    }

    /* renamed from: T */
    public void m79383T(@Nullable Integer num) {
        this.f24006b = num;
    }

    /* renamed from: U */
    public void m79382U(@Nullable Float f) {
        this.f24024u = f;
    }

    /* renamed from: V */
    public void m79381V(@Nullable String str) {
        this.f24012i = str;
    }

    /* renamed from: W */
    public void m79380W(@Nullable Integer num) {
        this.f24011h = num;
    }

    /* renamed from: X */
    public void m79379X(@Nullable Boolean bool) {
        this.f24009f = bool;
    }

    /* renamed from: Y */
    public void m79378Y(@Nullable Number number) {
        this.f24025v = Float.valueOf(number.floatValue());
    }

    /* renamed from: a */
    public void m79377a(@NonNull FrameLayout.LayoutParams layoutParams) {
        layoutParams.gravity = m79397F();
    }

    /* renamed from: b */
    public void m79376b(@NonNull Context context, @NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        marginLayoutParams.leftMargin = m79364n(context).intValue();
        marginLayoutParams.topMargin = m79362p(context).intValue();
        marginLayoutParams.rightMargin = m79363o(context).intValue();
        marginLayoutParams.bottomMargin = m79365m(context).intValue();
    }

    /* renamed from: c */
    public void m79375c(@NonNull Context context, @NonNull View view) {
        view.setPadding(m79359s(context).intValue(), m79357u(context).intValue(), m79358t(context).intValue(), m79360r(context).intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r0 != 17) goto L8;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m79374d(@androidx.annotation.NonNull android.widget.RelativeLayout.LayoutParams r4) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.m79366l()
            int r0 = r0.intValue()
            r1 = 1
            r2 = 17
            if (r0 == r1) goto L1c
            r1 = 3
            if (r0 == r1) goto L19
            r1 = 5
            if (r0 == r1) goto L16
            if (r0 == r2) goto L1c
            goto L21
        L16:
            r0 = 11
            goto L1e
        L19:
            r0 = 9
            goto L1e
        L1c:
            r0 = 14
        L1e:
            r4.addRule(r0)
        L21:
            java.lang.Integer r0 = r3.m79353y()
            int r0 = r0.intValue()
            r1 = 16
            if (r0 == r1) goto L3e
            if (r0 == r2) goto L3e
            r1 = 48
            if (r0 == r1) goto L3b
            r1 = 80
            if (r0 == r1) goto L38
            goto L43
        L38:
            r0 = 12
            goto L40
        L3b:
            r0 = 10
            goto L40
        L3e:
            r0 = 15
        L40:
            r4.addRule(r0)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.utils.C10507d.m79374d(android.widget.RelativeLayout$LayoutParams):void");
    }

    @NonNull
    /* renamed from: e */
    public C10507d m79373e(@Nullable C10507d c10507d) {
        C10507d c10507d2 = new C10507d();
        c10507d2.m79398E(this);
        c10507d2.m79398E(c10507d);
        return c10507d2;
    }

    @Nullable
    /* renamed from: f */
    public String m79372f() {
        return this.f24023t;
    }

    @NonNull
    /* renamed from: g */
    public Integer m79371g() {
        Integer num = this.f24007c;
        if (num != null) {
            return num;
        }
        return Integer.valueOf(C10504a.f23991c);
    }

    @NonNull
    /* renamed from: h */
    public Float m79370h(@NonNull Context context) {
        float f;
        Float f2 = this.f24028y;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            f = 16.0f;
        }
        return Float.valueOf(C10512g.m79302o(context, f));
    }

    @NonNull
    /* renamed from: i */
    public Integer m79369i() {
        Integer num = this.f24027x;
        if (num != null) {
            return num;
        }
        return 0;
    }

    @NonNull
    /* renamed from: j */
    public Integer m79368j(@NonNull Context context) {
        int i;
        Float f = this.f24026w;
        if (f != null) {
            if (f.floatValue() == -1.0f || this.f24026w.floatValue() == -2.0f) {
                i = this.f24026w.intValue();
            } else {
                i = C10512g.m79302o(context, this.f24026w.floatValue());
            }
        } else {
            i = -2;
        }
        return Integer.valueOf(i);
    }

    @Nullable
    /* renamed from: k */
    public Float m79367k() {
        return this.f24014k;
    }

    @NonNull
    /* renamed from: l */
    public Integer m79366l() {
        Integer num = this.f24010g;
        if (num != null) {
            return num;
        }
        return 3;
    }

    @NonNull
    /* renamed from: m */
    public Integer m79365m(@NonNull Context context) {
        int i;
        Integer num = this.f24022s;
        if (num != null) {
            i = C10512g.m79302o(context, num.intValue());
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @NonNull
    /* renamed from: n */
    public Integer m79364n(@NonNull Context context) {
        int i;
        Integer num = this.f24019p;
        if (num != null) {
            i = C10512g.m79302o(context, num.intValue());
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @NonNull
    /* renamed from: o */
    public Integer m79363o(@NonNull Context context) {
        int i;
        Integer num = this.f24021r;
        if (num != null) {
            i = C10512g.m79302o(context, num.intValue());
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @NonNull
    /* renamed from: p */
    public Integer m79362p(@NonNull Context context) {
        int i;
        Integer num = this.f24020q;
        if (num != null) {
            i = C10512g.m79302o(context, num.intValue());
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @NonNull
    /* renamed from: q */
    public Float m79361q() {
        Float f = this.f24013j;
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    @NonNull
    /* renamed from: r */
    public Integer m79360r(@NonNull Context context) {
        int i;
        Integer num = this.f24018o;
        if (num != null) {
            i = C10512g.m79302o(context, num.intValue());
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @NonNull
    /* renamed from: s */
    public Integer m79359s(@NonNull Context context) {
        int i;
        Integer num = this.f24015l;
        if (num != null) {
            i = C10512g.m79302o(context, num.intValue());
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @NonNull
    /* renamed from: t */
    public Integer m79358t(@NonNull Context context) {
        int i;
        Integer num = this.f24016m;
        if (num != null) {
            i = C10512g.m79302o(context, num.intValue());
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @NonNull
    /* renamed from: u */
    public Integer m79357u(@NonNull Context context) {
        int i;
        Integer num = this.f24017n;
        if (num != null) {
            i = C10512g.m79302o(context, num.intValue());
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @NonNull
    /* renamed from: v */
    public Integer m79356v() {
        Integer num = this.f24006b;
        if (num != null) {
            return num;
        }
        return Integer.valueOf(C10504a.f23989a);
    }

    @NonNull
    /* renamed from: w */
    public Float m79355w(@NonNull Context context) {
        float f;
        Float f2 = this.f24024u;
        if (f2 != null) {
            f = C10512g.m79302o(context, f2.floatValue());
        } else {
            f = 0.0f;
        }
        return Float.valueOf(f);
    }

    @Nullable
    /* renamed from: x */
    public String m79354x() {
        return this.f24012i;
    }

    @NonNull
    /* renamed from: y */
    public Integer m79353y() {
        Integer num = this.f24011h;
        if (num != null) {
            return num;
        }
        return 48;
    }

    @NonNull
    /* renamed from: z */
    public Integer m79352z(@NonNull Context context) {
        int i;
        Float f = this.f24025v;
        if (f != null) {
            if (f.floatValue() == -1.0f || this.f24025v.floatValue() == -2.0f) {
                i = this.f24025v.intValue();
            } else {
                i = C10512g.m79302o(context, this.f24025v.floatValue());
            }
        } else {
            i = -2;
        }
        return Integer.valueOf(i);
    }
}
