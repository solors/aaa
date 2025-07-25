package com.yandex.div.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.yandex.div.core.f0 */
/* loaded from: classes8.dex */
public class ObserverList<E> implements Iterable<E> {

    /* renamed from: b */
    private final List<E> f75255b = new ArrayList();

    /* renamed from: c */
    private int f75256c;

    /* renamed from: d */
    private int f75257d;

    /* renamed from: f */
    private boolean f75258f;

    /* compiled from: ObserverList.java */
    /* renamed from: com.yandex.div.core.f0$b */
    /* loaded from: classes8.dex */
    private class C29604b implements Iterator {

        /* renamed from: b */
        private int f75259b;

        /* renamed from: c */
        private int f75260c;

        /* renamed from: d */
        private boolean f75261d;

        /* renamed from: a */
        private void m37270a() {
            if (!this.f75261d) {
                this.f75261d = true;
                ObserverList.this.m37274h();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.f75260c;
            while (i < this.f75259b && ObserverList.this.m37273i(i) == null) {
                i++;
            }
            if (i < this.f75259b) {
                return true;
            }
            m37270a();
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            while (true) {
                int i = this.f75260c;
                if (i >= this.f75259b || ObserverList.this.m37273i(i) != null) {
                    break;
                }
                this.f75260c++;
            }
            int i2 = this.f75260c;
            if (i2 < this.f75259b) {
                ObserverList observerList = ObserverList.this;
                this.f75260c = i2 + 1;
                return (E) observerList.m37273i(i2);
            }
            m37270a();
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C29604b() {
            ObserverList.this.m37272j();
            this.f75259b = ObserverList.this.m37276f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public int m37276f() {
        return this.f75255b.size();
    }

    /* renamed from: g */
    private void m37275g() {
        for (int size = this.f75255b.size() - 1; size >= 0; size--) {
            if (this.f75255b.get(size) == null) {
                this.f75255b.remove(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m37274h() {
        int i = this.f75256c - 1;
        this.f75256c = i;
        if (i > 0 || !this.f75258f) {
            return;
        }
        this.f75258f = false;
        m37275g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public E m37273i(int i) {
        return this.f75255b.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m37272j() {
        this.f75256c++;
    }

    public void clear() {
        boolean z;
        this.f75257d = 0;
        if (this.f75256c == 0) {
            this.f75255b.clear();
            return;
        }
        int size = this.f75255b.size();
        boolean z2 = this.f75258f;
        if (size != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f75258f = z2 | z;
        for (int i = 0; i < size; i++) {
            this.f75255b.set(i, null);
        }
    }

    /* renamed from: e */
    public boolean m37277e(E e) {
        if (e != null && !this.f75255b.contains(e)) {
            this.f75255b.add(e);
            this.f75257d++;
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return new C29604b();
    }

    /* renamed from: k */
    public boolean m37271k(E e) {
        int indexOf;
        if (e == null || (indexOf = this.f75255b.indexOf(e)) == -1) {
            return false;
        }
        if (this.f75256c == 0) {
            this.f75255b.remove(indexOf);
        } else {
            this.f75258f = true;
            this.f75255b.set(indexOf, null);
        }
        this.f75257d--;
        return true;
    }
}
