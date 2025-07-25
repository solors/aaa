package com.ironsource;

import android.text.TextUtils;
import java.util.HashSet;

/* renamed from: com.ironsource.x3 */
/* loaded from: classes6.dex */
public class C21209x3 {

    /* renamed from: c */
    private String f54421c;

    /* renamed from: d */
    private String f54422d;

    /* renamed from: f */
    private int f54424f;

    /* renamed from: b */
    private HashSet<String> f54420b = new HashSet<>();

    /* renamed from: a */
    private boolean f54419a = false;

    /* renamed from: e */
    private boolean f54423e = false;

    /* renamed from: g */
    private boolean f54425g = true;

    /* renamed from: a */
    public int m54196a() {
        return this.f54424f;
    }

    /* renamed from: b */
    public HashSet<String> m54192b() {
        return this.f54420b;
    }

    /* renamed from: c */
    public String m54189c() {
        return this.f54422d;
    }

    /* renamed from: d */
    public String m54186d() {
        return this.f54421c;
    }

    /* renamed from: e */
    public boolean m54185e() {
        return this.f54423e;
    }

    /* renamed from: f */
    public boolean m54184f() {
        return this.f54419a;
    }

    /* renamed from: g */
    public boolean m54183g() {
        return this.f54425g;
    }

    /* renamed from: a */
    public void m54195a(int i) {
        this.f54424f = i;
    }

    /* renamed from: b */
    public void m54191b(String str) {
        this.f54422d = str;
    }

    /* renamed from: c */
    public void m54188c(String str) {
        this.f54421c = str;
    }

    /* renamed from: a */
    public void m54194a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f54420b.add(str);
    }

    /* renamed from: b */
    public void m54190b(boolean z) {
        this.f54425g = z;
    }

    /* renamed from: c */
    public void m54187c(boolean z) {
        this.f54423e = z;
    }

    /* renamed from: a */
    public void m54193a(boolean z) {
        this.f54419a = z;
    }
}
