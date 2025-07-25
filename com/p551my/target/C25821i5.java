package com.p551my.target;

import java.util.ArrayList;

/* renamed from: com.my.target.i5 */
/* loaded from: classes7.dex */
public class C25821i5 {

    /* renamed from: a */
    public final ArrayList f66985a = new ArrayList();

    /* renamed from: b */
    public int f66986b = 60;

    /* renamed from: c */
    public static final C25821i5 m43753c() {
        return new C25821i5();
    }

    /* renamed from: a */
    public void m43755a(C25841j5 c25841j5) {
        int size = this.f66985a.size();
        for (int i = 0; i < size; i++) {
            if (c25841j5.m43699f() > ((C25841j5) this.f66985a.get(i)).m43699f()) {
                this.f66985a.add(i, c25841j5);
                return;
            }
        }
        this.f66985a.add(c25841j5);
    }

    /* renamed from: b */
    public boolean m43754b() {
        return !this.f66985a.isEmpty();
    }

    /* renamed from: d */
    public C25841j5 m43752d() {
        if (this.f66985a.isEmpty()) {
            return null;
        }
        return (C25841j5) this.f66985a.remove(0);
    }

    /* renamed from: a */
    public int m43757a() {
        return this.f66986b;
    }

    /* renamed from: a */
    public void m43756a(int i) {
        this.f66986b = i;
    }
}
