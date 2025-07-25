package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bx1;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.yandex.mobile.ads.impl.l */
/* loaded from: classes8.dex */
abstract class AbstractC30760l<T> implements Iterator<T> {

    /* renamed from: b */
    private int f81643b = 2;

    /* renamed from: c */
    private String f81644c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int mo33514a;
        int i = this.f81643b;
        if (i != 4) {
            int m28855a = C31558u8.m28855a(i);
            if (m28855a == 0) {
                return true;
            }
            if (m28855a == 2) {
                return false;
            }
            this.f81643b = 4;
            bx1.AbstractC30056a abstractC30056a = (bx1.AbstractC30056a) this;
            int i2 = abstractC30056a.f77435g;
            while (true) {
                int i3 = abstractC30056a.f77435g;
                if (i3 != -1) {
                    zw1 zw1Var = (zw1) abstractC30056a;
                    mo33514a = zw1Var.f89134i.f76947a.mo33514a(zw1Var.f77432d, i3);
                    if (mo33514a == -1) {
                        mo33514a = abstractC30056a.f77432d.length();
                        abstractC30056a.f77435g = -1;
                    } else {
                        abstractC30056a.f77435g = mo33514a + 1;
                    }
                    int i4 = abstractC30056a.f77435g;
                    if (i4 == i2) {
                        int i5 = i4 + 1;
                        abstractC30056a.f77435g = i5;
                        if (i5 > abstractC30056a.f77432d.length()) {
                            abstractC30056a.f77435g = -1;
                        }
                    } else {
                        while (i2 < mo33514a && abstractC30056a.f77433e.mo33515a(abstractC30056a.f77432d.charAt(i2))) {
                            i2++;
                        }
                        while (mo33514a > i2 && abstractC30056a.f77433e.mo33515a(abstractC30056a.f77432d.charAt(mo33514a - 1))) {
                            mo33514a--;
                        }
                        if (!abstractC30056a.f77434f || i2 != mo33514a) {
                            break;
                        }
                        i2 = abstractC30056a.f77435g;
                    }
                } else {
                    abstractC30056a.f81643b = 3;
                    str = null;
                    break;
                }
            }
            int i6 = abstractC30056a.f77436h;
            if (i6 == 1) {
                mo33514a = abstractC30056a.f77432d.length();
                abstractC30056a.f77435g = -1;
                while (mo33514a > i2 && abstractC30056a.f77433e.mo33515a(abstractC30056a.f77432d.charAt(mo33514a - 1))) {
                    mo33514a--;
                }
            } else {
                abstractC30056a.f77436h = i6 - 1;
            }
            str = abstractC30056a.f77432d.subSequence(i2, mo33514a).toString();
            this.f81644c = str;
            if (this.f81643b == 3) {
                return false;
            }
            this.f81643b = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f81643b = 2;
            T t = (T) this.f81644c;
            this.f81644c = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
