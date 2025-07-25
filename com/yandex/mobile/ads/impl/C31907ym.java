package com.yandex.mobile.ads.impl;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.yandex.mobile.ads.impl.C31840xt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.ym */
/* loaded from: classes8.dex */
public final class C31907ym extends AbstractC29951an {

    /* renamed from: h */
    private final int f88270h;

    /* renamed from: i */
    private final int f88271i;

    /* renamed from: j */
    private final int f88272j;
    @Nullable

    /* renamed from: n */
    private List<C31840xt> f88276n;
    @Nullable

    /* renamed from: o */
    private List<C31840xt> f88277o;

    /* renamed from: p */
    private int f88278p;

    /* renamed from: q */
    private int f88279q;

    /* renamed from: r */
    private boolean f88280r;

    /* renamed from: s */
    private boolean f88281s;

    /* renamed from: t */
    private byte f88282t;

    /* renamed from: u */
    private byte f88283u;

    /* renamed from: w */
    private boolean f88285w;

    /* renamed from: x */
    private long f88286x;

    /* renamed from: y */
    private static final int[] f88267y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z */
    private static final int[] f88268z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A */
    private static final int[] f88261A = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -65281};

    /* renamed from: B */
    private static final int[] f88262B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C */
    private static final int[] f88263C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D */
    private static final int[] f88264D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E */
    private static final int[] f88265E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F */
    private static final boolean[] f88266F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g */
    private final cc1 f88269g = new cc1();

    /* renamed from: l */
    private final ArrayList<C31908a> f88274l = new ArrayList<>();

    /* renamed from: m */
    private C31908a f88275m = new C31908a(0, 4);

    /* renamed from: v */
    private int f88284v = 0;

    /* renamed from: k */
    private final long f88273k = 16000000;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.ym$a */
    /* loaded from: classes8.dex */
    public static final class C31908a {

        /* renamed from: a */
        private final ArrayList f88287a = new ArrayList();

        /* renamed from: b */
        private final ArrayList f88288b = new ArrayList();

        /* renamed from: c */
        private final StringBuilder f88289c = new StringBuilder();

        /* renamed from: d */
        private int f88290d;

        /* renamed from: e */
        private int f88291e;

        /* renamed from: f */
        private int f88292f;

        /* renamed from: g */
        private int f88293g;

        /* renamed from: h */
        private int f88294h;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.yandex.mobile.ads.impl.ym$a$a */
        /* loaded from: classes8.dex */
        public static class C31909a {

            /* renamed from: a */
            public final int f88295a;

            /* renamed from: b */
            public final boolean f88296b;

            /* renamed from: c */
            public int f88297c;

            public C31909a(int i, int i2, boolean z) {
                this.f88295a = i;
                this.f88296b = z;
                this.f88297c = i2;
            }
        }

        public C31908a(int i, int i2) {
            m26847b(i);
            this.f88294h = i2;
        }

        /* renamed from: a */
        public final void m26851a() {
            int length = this.f88289c.length();
            if (length > 0) {
                this.f88289c.delete(length - 1, length);
                for (int size = this.f88287a.size() - 1; size >= 0; size--) {
                    C31909a c31909a = (C31909a) this.f88287a.get(size);
                    int i = c31909a.f88297c;
                    if (i != length) {
                        return;
                    }
                    c31909a.f88297c = i - 1;
                }
            }
        }

        /* renamed from: b */
        public final void m26847b(int i) {
            this.f88293g = i;
            this.f88287a.clear();
            this.f88288b.clear();
            this.f88289c.setLength(0);
            this.f88290d = 15;
            this.f88291e = 0;
            this.f88292f = 0;
        }

        @Nullable
        /* renamed from: a */
        public final C31840xt m26850a(int i) {
            float f;
            int i2 = this.f88291e + this.f88292f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f88288b.size(); i4++) {
                CharSequence charSequence = (CharSequence) this.f88288b.get(i4);
                int i5 = y32.f88010a;
                if (charSequence.length() > i3) {
                    charSequence = charSequence.subSequence(0, i3);
                }
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.append('\n');
            }
            SpannableString m26848b = m26848b();
            int i6 = y32.f88010a;
            int length = m26848b.length();
            CharSequence charSequence2 = m26848b;
            if (length > i3) {
                charSequence2 = m26848b.subSequence(0, i3);
            }
            spannableStringBuilder.append(charSequence2);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i3 - spannableStringBuilder.length();
            int i7 = i2 - length2;
            if (i == Integer.MIN_VALUE) {
                if (this.f88293g != 2 || (Math.abs(i7) >= 3 && length2 >= 0)) {
                    i = (this.f88293g != 2 || i7 <= 0) ? 0 : 2;
                } else {
                    i = 1;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length2;
                }
                f = ((i2 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i8 = this.f88290d;
            if (i8 > 7) {
                i8 -= 17;
            } else if (this.f88293g == 1) {
                i8 -= this.f88294h - 1;
            }
            return new C31840xt.C31841a().m27244a(spannableStringBuilder).m27239b(Layout.Alignment.ALIGN_NORMAL).m27248a(1, i8).m27242b(f).m27241b(i).m27251a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public SpannableString m26848b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f88289c);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 < this.f88287a.size()) {
                C31909a c31909a = (C31909a) this.f88287a.get(i5);
                boolean z2 = c31909a.f88296b;
                int i7 = c31909a.f88295a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = C31907ym.f88261A[i7];
                    }
                    z = z3;
                }
                int i8 = c31909a.f88297c;
                i5++;
                if (i8 != (i5 < this.f88287a.size() ? ((C31909a) this.f88287a.get(i5)).f88297c : length)) {
                    if (i != -1 && !z2) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i2 != -1 && !z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        if (i3 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                        }
                        i6 = i8;
                        i3 = i4;
                    }
                }
            }
            if (i != -1 && i != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (i2 != -1 && i2 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
            }
            if (i6 != length && i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }
    }

    public C31907ym(String str, int i) {
        int i2;
        if ("application/x-mp4-cea-608".equals(str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.f88270h = i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        gq0.m33792d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f88272j = 0;
                        this.f88271i = 0;
                    } else {
                        this.f88272j = 1;
                        this.f88271i = 1;
                    }
                } else {
                    this.f88272j = 0;
                    this.f88271i = 1;
                }
            } else {
                this.f88272j = 1;
                this.f88271i = 0;
            }
        } else {
            this.f88272j = 0;
            this.f88271i = 0;
        }
        m26856a(0);
        m26853j();
        this.f88285w = true;
        this.f88286x = -9223372036854775807L;
    }

    /* renamed from: i */
    private ArrayList m26854i() {
        int size = this.f88274l.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C31840xt m26850a = this.f88274l.get(i2).m26850a(Integer.MIN_VALUE);
            arrayList.add(m26850a);
            if (m26850a != null) {
                i = Math.min(i, m26850a.f87815j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C31840xt c31840xt = (C31840xt) arrayList.get(i3);
            if (c31840xt != null) {
                if (c31840xt.f87815j != i) {
                    c31840xt = this.f88274l.get(i3).m26850a(i);
                    c31840xt.getClass();
                }
                arrayList2.add(c31840xt);
            }
        }
        return arrayList2;
    }

    /* renamed from: j */
    private void m26853j() {
        this.f88275m.m26847b(this.f88278p);
        this.f88274l.clear();
        this.f88274l.add(this.f88275m);
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0087 A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.AbstractC29951an
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void mo26141b(com.yandex.mobile.ads.impl.sy1 r14) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C31907ym.mo26141b(com.yandex.mobile.ads.impl.sy1):void");
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC29951an
    /* renamed from: c */
    protected final oy1 mo26140c() {
        List<C31840xt> list = this.f88276n;
        this.f88277o = list;
        list.getClass();
        return new C30035bn(list);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC29951an, com.yandex.mobile.ads.impl.InterfaceC30196dx
    @Nullable
    /* renamed from: e */
    public final ty1 mo26002a() throws qy1 {
        ty1 m35818f;
        ty1 mo26002a = super.mo26002a();
        if (mo26002a != null) {
            return mo26002a;
        }
        if (this.f88273k != -9223372036854775807L && this.f88286x != -9223372036854775807L && m35817g() - this.f88286x >= this.f88273k && (m35818f = m35818f()) != null) {
            this.f88276n = Collections.emptyList();
            this.f88286x = -9223372036854775807L;
            m35818f.m28934a(m35817g(), mo26140c(), Long.MAX_VALUE);
            return m35818f;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC29951an, com.yandex.mobile.ads.impl.InterfaceC30196dx
    public final void flush() {
        super.flush();
        this.f88276n = null;
        this.f88277o = null;
        m26856a(0);
        this.f88279q = 4;
        this.f88275m.f88294h = 4;
        m26853j();
        this.f88280r = false;
        this.f88281s = false;
        this.f88282t = (byte) 0;
        this.f88283u = (byte) 0;
        this.f88284v = 0;
        this.f88285w = true;
        this.f88286x = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC29951an
    /* renamed from: h */
    protected final boolean mo26139h() {
        if (this.f88276n != this.f88277o) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m26856a(int i) {
        int i2 = this.f88278p;
        if (i2 == i) {
            return;
        }
        this.f88278p = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.f88274l.size(); i3++) {
                this.f88274l.get(i3).f88293g = i;
            }
            return;
        }
        m26853j();
        if (i2 == 3 || i == 1 || i == 0) {
            this.f88276n = Collections.emptyList();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    public final void release() {
    }
}
