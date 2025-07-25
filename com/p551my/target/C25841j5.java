package com.p551my.target;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.j5 */
/* loaded from: classes7.dex */
public final class C25841j5 {

    /* renamed from: a */
    public final String f67046a;

    /* renamed from: b */
    public final String f67047b;

    /* renamed from: c */
    public final String f67048c;

    /* renamed from: f */
    public String f67051f;

    /* renamed from: g */
    public AbstractC26019q f67052g;

    /* renamed from: d */
    public final C25711da f67049d = C25711da.m43995c();

    /* renamed from: e */
    public final HashMap f67050e = new HashMap();

    /* renamed from: h */
    public int f67053h = 10000;

    /* renamed from: i */
    public float f67054i = 0.0f;

    public C25841j5(String str, String str2, String str3) {
        this.f67046a = str;
        this.f67047b = str2;
        this.f67048c = str3;
    }

    /* renamed from: a */
    public String m43710a() {
        return this.f67048c;
    }

    /* renamed from: b */
    public String m43703b() {
        return this.f67046a;
    }

    /* renamed from: c */
    public Map m43702c() {
        return new HashMap(this.f67050e);
    }

    /* renamed from: d */
    public String m43701d() {
        return this.f67051f;
    }

    /* renamed from: e */
    public String m43700e() {
        return this.f67047b;
    }

    /* renamed from: f */
    public float m43699f() {
        return this.f67054i;
    }

    /* renamed from: g */
    public AbstractC26019q m43698g() {
        return this.f67052g;
    }

    /* renamed from: h */
    public C25711da m43697h() {
        return this.f67049d;
    }

    /* renamed from: i */
    public int m43696i() {
        return this.f67053h;
    }

    /* renamed from: a */
    public static C25841j5 m43704a(String str, String str2, String str3) {
        return new C25841j5(str, str2, str3);
    }

    /* renamed from: a */
    public void m43705a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str2 == null) {
            this.f67050e.remove(str);
        } else {
            this.f67050e.put(str, str2);
        }
    }

    /* renamed from: a */
    public void m43706a(String str) {
        this.f67051f = str;
    }

    /* renamed from: a */
    public void m43709a(float f) {
        this.f67054i = f;
    }

    /* renamed from: a */
    public void m43707a(AbstractC26019q abstractC26019q) {
        this.f67052g = abstractC26019q;
    }

    /* renamed from: a */
    public void m43708a(int i) {
        this.f67053h = i;
    }
}
