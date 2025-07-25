package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.vr */
/* loaded from: classes2.dex */
public final class C5725vr {

    /* renamed from: f */
    private int f11554f;

    /* renamed from: h */
    private int f11556h;

    /* renamed from: o */
    private float f11563o;

    /* renamed from: a */
    private String f11549a = "";

    /* renamed from: b */
    private String f11550b = "";

    /* renamed from: c */
    private Set f11551c = Collections.emptySet();

    /* renamed from: d */
    private String f11552d = "";

    /* renamed from: e */
    private String f11553e = null;

    /* renamed from: g */
    private boolean f11555g = false;

    /* renamed from: i */
    private boolean f11557i = false;

    /* renamed from: j */
    private int f11558j = -1;

    /* renamed from: k */
    private int f11559k = -1;

    /* renamed from: l */
    private int f11560l = -1;

    /* renamed from: m */
    private int f11561m = -1;

    /* renamed from: n */
    private int f11562n = -1;

    /* renamed from: p */
    private int f11564p = -1;

    /* renamed from: q */
    private boolean f11565q = false;

    /* renamed from: a */
    public int m93792a() {
        if (this.f11557i) {
            return this.f11556h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public boolean m93784b() {
        return this.f11565q;
    }

    /* renamed from: c */
    public int m93780c() {
        if (this.f11555g) {
            return this.f11554f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: d */
    public String m93776d() {
        return this.f11553e;
    }

    /* renamed from: e */
    public float m93772e() {
        return this.f11563o;
    }

    /* renamed from: f */
    public int m93771f() {
        return this.f11562n;
    }

    /* renamed from: g */
    public int m93770g() {
        return this.f11564p;
    }

    /* renamed from: h */
    public int m93769h() {
        int i;
        int i2 = this.f11560l;
        if (i2 == -1 && this.f11561m == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f11561m == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    /* renamed from: i */
    public boolean m93768i() {
        return this.f11557i;
    }

    /* renamed from: j */
    public boolean m93767j() {
        return this.f11555g;
    }

    /* renamed from: k */
    public boolean m93766k() {
        if (this.f11558j == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m93765l() {
        if (this.f11559k == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public C5725vr m93781b(boolean z) {
        this.f11565q = z;
        return this;
    }

    /* renamed from: d */
    public C5725vr m93775d(int i) {
        this.f11564p = i;
        return this;
    }

    /* renamed from: b */
    public C5725vr m93783b(int i) {
        this.f11554f = i;
        this.f11555g = true;
        return this;
    }

    /* renamed from: d */
    public void m93774d(String str) {
        this.f11552d = str;
    }

    /* renamed from: a */
    public int m93787a(String str, String str2, Set set, String str3) {
        if (this.f11549a.isEmpty() && this.f11550b.isEmpty() && this.f11551c.isEmpty() && this.f11552d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int m93789a = m93789a(m93789a(m93789a(0, this.f11549a, str, 1073741824), this.f11550b, str2, 2), this.f11552d, str3, 4);
        if (m93789a == -1 || !set.containsAll(this.f11551c)) {
            return 0;
        }
        return m93789a + (this.f11551c.size() * 4);
    }

    /* renamed from: c */
    public C5725vr m93779c(int i) {
        this.f11562n = i;
        return this;
    }

    /* renamed from: d */
    public C5725vr m93773d(boolean z) {
        this.f11559k = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public void m93782b(String str) {
        this.f11549a = str;
    }

    /* renamed from: c */
    public C5725vr m93777c(boolean z) {
        this.f11561m = z ? 1 : 0;
        return this;
    }

    /* renamed from: c */
    public void m93778c(String str) {
        this.f11550b = str;
    }

    /* renamed from: a */
    public C5725vr m93790a(int i) {
        this.f11556h = i;
        this.f11557i = true;
        return this;
    }

    /* renamed from: a */
    public C5725vr m93786a(boolean z) {
        this.f11560l = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public C5725vr m93788a(String str) {
        this.f11553e = str == null ? null : Ascii.toLowerCase(str);
        return this;
    }

    /* renamed from: a */
    public C5725vr m93791a(float f) {
        this.f11563o = f;
        return this;
    }

    /* renamed from: a */
    public void m93785a(String[] strArr) {
        this.f11551c = new HashSet(Arrays.asList(strArr));
    }

    /* renamed from: a */
    private static int m93789a(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
