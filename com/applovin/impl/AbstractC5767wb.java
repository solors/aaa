package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.applovin.impl.wb */
/* loaded from: classes2.dex */
public abstract class AbstractC5767wb {

    /* renamed from: com.applovin.impl.wb$a */
    /* loaded from: classes2.dex */
    class C5768a extends AbstractC5139pp {

        /* renamed from: a */
        boolean f11701a;

        /* renamed from: b */
        final /* synthetic */ Object f11702b;

        C5768a(Object obj) {
            this.f11702b = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f11701a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f11701a) {
                this.f11701a = true;
                return this.f11702b;
            }
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.wb$b */
    /* loaded from: classes2.dex */
    public static final class C5769b extends AbstractC4154c {

        /* renamed from: f */
        static final AbstractC5211qp f11703f = new C5769b(new Object[0], 0, 0, 0);

        /* renamed from: c */
        private final Object[] f11704c;

        /* renamed from: d */
        private final int f11705d;

        C5769b(Object[] objArr, int i, int i2, int i3) {
            super(i2, i3);
            this.f11704c = objArr;
            this.f11705d = i;
        }

        @Override // com.applovin.impl.AbstractC4154c
        /* renamed from: a */
        protected Object mo93585a(int i) {
            return this.f11704c[this.f11705d + i];
        }
    }

    /* renamed from: com.applovin.impl.wb$c */
    /* loaded from: classes2.dex */
    private enum EnumC5770c implements Iterator {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            AbstractC5103p3.m96596a(false);
        }
    }

    /* renamed from: a */
    public static boolean m93595a(Collection collection, Iterator it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    public static Object m93589b(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Object m93587c(Iterator it) {
        if (it.hasNext()) {
            Object next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    /* renamed from: d */
    public static String m93586d(Iterator it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z = false;
        }
        sb2.append(']');
        return sb2.toString();
    }

    /* renamed from: b */
    static AbstractC5211qp m93590b() {
        return C5769b.f11703f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Iterator m93588c() {
        return EnumC5770c.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m93594a(Iterator it) {
        Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m93591a(java.util.Iterator r3, java.util.Iterator r4) {
        /*
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.applovin.exoplayer2.common.base.Objects.equal(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.AbstractC5767wb.m93591a(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* renamed from: a */
    public static Object m93593a(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    /* renamed from: a */
    public static boolean m93592a(Iterator it, Collection collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC5139pp m93597a() {
        return m93590b();
    }

    /* renamed from: a */
    public static AbstractC5139pp m93596a(Object obj) {
        return new C5768a(obj);
    }
}
