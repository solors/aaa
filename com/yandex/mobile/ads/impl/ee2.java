package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public final class ee2 {
    @ColorInt

    /* renamed from: f */
    private int f78522f;

    /* renamed from: h */
    private int f78524h;

    /* renamed from: o */
    private float f78531o;

    /* renamed from: a */
    private String f78517a = "";

    /* renamed from: b */
    private String f78518b = "";

    /* renamed from: c */
    private Set<String> f78519c = Collections.emptySet();

    /* renamed from: d */
    private String f78520d = "";
    @Nullable

    /* renamed from: e */
    private String f78521e = null;

    /* renamed from: g */
    private boolean f78523g = false;

    /* renamed from: i */
    private boolean f78525i = false;

    /* renamed from: j */
    private int f78526j = -1;

    /* renamed from: k */
    private int f78527k = -1;

    /* renamed from: l */
    private int f78528l = -1;

    /* renamed from: m */
    private int f78529m = -1;

    /* renamed from: n */
    private int f78530n = -1;

    /* renamed from: p */
    private int f78532p = -1;

    /* renamed from: q */
    private boolean f78533q = false;

    /* renamed from: a */
    public final int m34629a() {
        if (this.f78525i) {
            return this.f78524h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public final boolean m34622b() {
        return this.f78533q;
    }

    /* renamed from: c */
    public final int m34619c() {
        if (this.f78523g) {
            return this.f78522f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    @Nullable
    /* renamed from: d */
    public final String m34616d() {
        return this.f78521e;
    }

    /* renamed from: e */
    public final float m34613e() {
        return this.f78531o;
    }

    /* renamed from: f */
    public final int m34612f() {
        return this.f78530n;
    }

    /* renamed from: g */
    public final int m34611g() {
        return this.f78532p;
    }

    /* renamed from: h */
    public final int m34610h() {
        int i;
        int i2 = this.f78528l;
        if (i2 == -1 && this.f78529m == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f78529m == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    /* renamed from: i */
    public final boolean m34609i() {
        return this.f78525i;
    }

    /* renamed from: j */
    public final boolean m34608j() {
        return this.f78523g;
    }

    /* renamed from: k */
    public final boolean m34607k() {
        if (this.f78526j == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m34606l() {
        if (this.f78527k == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void m34605m() {
        this.f78528l = 1;
    }

    /* renamed from: n */
    public final void m34604n() {
        this.f78529m = 1;
    }

    /* renamed from: o */
    public final void m34603o() {
        this.f78527k = 1;
    }

    /* renamed from: b */
    public final void m34621b(int i) {
        this.f78522f = i;
        this.f78523g = true;
    }

    /* renamed from: d */
    public final void m34615d(int i) {
        this.f78532p = i;
    }

    /* renamed from: d */
    public final void m34614d(String str) {
        this.f78520d = str;
    }

    /* renamed from: a */
    public final int m34625a(@Nullable String str, @Nullable String str2, Set<String> set, @Nullable String str3) {
        int i;
        if (this.f78517a.isEmpty() && this.f78518b.isEmpty() && this.f78519c.isEmpty() && this.f78520d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        String str4 = this.f78517a;
        if (str4.isEmpty()) {
            i = 0;
        } else {
            i = str4.equals(str) ? 1073741824 : -1;
        }
        String str5 = this.f78518b;
        if (!str5.isEmpty() && i != -1) {
            i = str5.equals(str2) ? i + 2 : -1;
        }
        String str6 = this.f78520d;
        if (!str6.isEmpty() && i != -1) {
            i = str6.equals(str3) ? i + 4 : -1;
        }
        if (i == -1 || !set.containsAll(this.f78519c)) {
            return 0;
        }
        return (this.f78519c.size() * 4) + i;
    }

    /* renamed from: b */
    public final void m34620b(String str) {
        this.f78517a = str;
    }

    /* renamed from: c */
    public final void m34618c(int i) {
        this.f78530n = i;
    }

    /* renamed from: c */
    public final void m34617c(String str) {
        this.f78518b = str;
    }

    /* renamed from: a */
    public final void m34627a(int i) {
        this.f78524h = i;
        this.f78525i = true;
    }

    /* renamed from: a */
    public final void m34624a(boolean z) {
        this.f78533q = z;
    }

    /* renamed from: a */
    public final void m34626a(@Nullable String str) {
        this.f78521e = C30784lf.m32278b(str);
    }

    /* renamed from: a */
    public final void m34628a(float f) {
        this.f78531o = f;
    }

    /* renamed from: a */
    public final void m34623a(String[] strArr) {
        this.f78519c = new HashSet(Arrays.asList(strArr));
    }
}
