package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.C6200R;

/* renamed from: com.applovin.impl.cc */
/* loaded from: classes2.dex */
public class C4176cc {

    /* renamed from: a */
    protected EnumC4179c f5232a;

    /* renamed from: b */
    protected boolean f5233b;

    /* renamed from: c */
    protected SpannedString f5234c;

    /* renamed from: d */
    protected SpannedString f5235d;

    /* renamed from: e */
    protected String f5236e;

    /* renamed from: f */
    protected String f5237f;

    /* renamed from: g */
    protected int f5238g;

    /* renamed from: h */
    protected int f5239h;

    /* renamed from: i */
    protected int f5240i;

    /* renamed from: j */
    protected int f5241j;

    /* renamed from: k */
    protected int f5242k;

    /* renamed from: l */
    protected int f5243l;

    /* renamed from: m */
    protected boolean f5244m;

    /* renamed from: com.applovin.impl.cc$b */
    /* loaded from: classes2.dex */
    public static class C4178b {

        /* renamed from: a */
        final EnumC4179c f5245a;

        /* renamed from: b */
        boolean f5246b;

        /* renamed from: c */
        SpannedString f5247c;

        /* renamed from: d */
        SpannedString f5248d;

        /* renamed from: e */
        String f5249e;

        /* renamed from: f */
        String f5250f;

        /* renamed from: g */
        int f5251g = 0;

        /* renamed from: h */
        int f5252h = 0;

        /* renamed from: i */
        int f5253i = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: j */
        int f5254j = ViewCompat.MEASURED_STATE_MASK;

        /* renamed from: k */
        int f5255k = 0;

        /* renamed from: l */
        int f5256l = 0;

        /* renamed from: m */
        boolean f5257m;

        public C4178b(EnumC4179c enumC4179c) {
            this.f5245a = enumC4179c;
        }

        /* renamed from: a */
        public C4178b m100207a(String str) {
            this.f5250f = str;
            return this;
        }

        /* renamed from: b */
        public C4178b m100203b(String str) {
            this.f5249e = str;
            return this;
        }

        /* renamed from: c */
        public C4178b m100200c(String str) {
            return m100208a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        /* renamed from: d */
        public C4178b m100198d(String str) {
            return m100204b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        /* renamed from: a */
        public C4178b m100210a(int i) {
            this.f5252h = i;
            return this;
        }

        /* renamed from: b */
        public C4178b m100205b(int i) {
            this.f5256l = i;
            return this;
        }

        /* renamed from: a */
        public C4178b m100209a(Context context) {
            this.f5252h = C6200R.C6203drawable.applovin_ic_disclosure_arrow;
            this.f5256l = AbstractC5539t3.m94551a(C6200R.C6202color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        /* renamed from: b */
        public C4178b m100202b(boolean z) {
            this.f5257m = z;
            return this;
        }

        /* renamed from: c */
        public C4178b m100201c(int i) {
            this.f5254j = i;
            return this;
        }

        /* renamed from: d */
        public C4178b m100199d(int i) {
            this.f5253i = i;
            return this;
        }

        /* renamed from: b */
        public C4178b m100204b(SpannedString spannedString) {
            this.f5247c = spannedString;
            return this;
        }

        /* renamed from: a */
        public C4178b m100206a(boolean z) {
            this.f5246b = z;
            return this;
        }

        /* renamed from: a */
        public C4178b m100208a(SpannedString spannedString) {
            this.f5248d = spannedString;
            return this;
        }

        /* renamed from: a */
        public C4176cc m100211a() {
            return new C4176cc(this);
        }
    }

    /* renamed from: com.applovin.impl.cc$c */
    /* loaded from: classes2.dex */
    public enum EnumC4179c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);
        

        /* renamed from: a */
        private final int f5265a;

        EnumC4179c(int i) {
            this.f5265a = i;
        }

        /* renamed from: b */
        public int m100196b() {
            if (this == SECTION) {
                return C6200R.C6206layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return C6200R.C6206layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return 17367043;
            }
            if (this == DETAIL) {
                return C6200R.C6206layout.applovin_debugger_list_item_detail;
            }
            return C6200R.C6206layout.mediation_debugger_list_item_right_detail;
        }

        /* renamed from: c */
        public int m100195c() {
            return this.f5265a;
        }
    }

    private C4176cc(C4178b c4178b) {
        this.f5238g = 0;
        this.f5239h = 0;
        this.f5240i = ViewCompat.MEASURED_STATE_MASK;
        this.f5241j = ViewCompat.MEASURED_STATE_MASK;
        this.f5242k = 0;
        this.f5243l = 0;
        this.f5232a = c4178b.f5245a;
        this.f5233b = c4178b.f5246b;
        this.f5234c = c4178b.f5247c;
        this.f5235d = c4178b.f5248d;
        this.f5236e = c4178b.f5249e;
        this.f5237f = c4178b.f5250f;
        this.f5238g = c4178b.f5251g;
        this.f5239h = c4178b.f5252h;
        this.f5240i = c4178b.f5253i;
        this.f5241j = c4178b.f5254j;
        this.f5242k = c4178b.f5255k;
        this.f5243l = c4178b.f5256l;
        this.f5244m = c4178b.f5257m;
    }

    /* renamed from: a */
    public static C4178b m100221a() {
        return m100220a(EnumC4179c.RIGHT_DETAIL);
    }

    /* renamed from: n */
    public static int m100212n() {
        return EnumC4179c.COUNT.m100195c();
    }

    /* renamed from: b */
    public String m100219b() {
        return this.f5237f;
    }

    /* renamed from: c */
    public String m100218c() {
        return this.f5236e;
    }

    /* renamed from: d */
    public int mo93835d() {
        return this.f5239h;
    }

    /* renamed from: e */
    public int mo93834e() {
        return this.f5243l;
    }

    /* renamed from: f */
    public SpannedString mo93106f() {
        return this.f5235d;
    }

    /* renamed from: g */
    public int mo92900g() {
        return this.f5241j;
    }

    /* renamed from: h */
    public int mo100217h() {
        return this.f5238g;
    }

    /* renamed from: i */
    public int m100216i() {
        return this.f5242k;
    }

    /* renamed from: j */
    public int m100215j() {
        return this.f5232a.m100196b();
    }

    /* renamed from: k */
    public SpannedString mo93833k() {
        return this.f5234c;
    }

    /* renamed from: l */
    public int m100214l() {
        return this.f5240i;
    }

    /* renamed from: m */
    public int m100213m() {
        return this.f5232a.m100195c();
    }

    /* renamed from: o */
    public boolean mo92899o() {
        return this.f5233b;
    }

    /* renamed from: p */
    public boolean mo93105p() {
        return this.f5244m;
    }

    /* renamed from: a */
    public static C4178b m100220a(EnumC4179c enumC4179c) {
        return new C4178b(enumC4179c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C4176cc(EnumC4179c enumC4179c) {
        this.f5238g = 0;
        this.f5239h = 0;
        this.f5240i = ViewCompat.MEASURED_STATE_MASK;
        this.f5241j = ViewCompat.MEASURED_STATE_MASK;
        this.f5242k = 0;
        this.f5243l = 0;
        this.f5232a = enumC4179c;
    }
}
