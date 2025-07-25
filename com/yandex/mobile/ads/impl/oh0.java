package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import com.yandex.mobile.ads.impl.mh0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
public abstract class oh0<E> extends mh0<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    private static final e32<Object> f83514c = new C31040b(0, ck1.f77657g);

    /* renamed from: d */
    public static final /* synthetic */ int f83515d = 0;

    /* renamed from: com.yandex.mobile.ads.impl.oh0$a */
    /* loaded from: classes8.dex */
    public static final class C31039a<E> extends mh0.AbstractC30855a<E> {
        public C31039a() {
            this(0);
        }

        /* renamed from: a */
        public final oh0<E> m31008a() {
            this.f82199c = true;
            return oh0.m31012b(this.f82198b, this.f82197a);
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public final C31039a m31007b(List list) {
            m32000a(list);
            return this;
        }

        C31039a(int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.oh0$b */
    /* loaded from: classes8.dex */
    public static class C31040b<E> extends AbstractC30593j<E> {

        /* renamed from: d */
        private final oh0<E> f83516d;

        C31040b(int i, oh0 oh0Var) {
            super(oh0Var.size(), i);
            this.f83516d = oh0Var;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30593j
        /* renamed from: a */
        protected final E mo31006a(int i) {
            return this.f83516d.get(i);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.oh0$c */
    /* loaded from: classes8.dex */
    static class C31041c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        final Object[] f83517b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C31041c(Object[] objArr) {
            this.f83517b = objArr;
        }

        Object readResolve() {
            return oh0.m31011b(this.f83517b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.oh0$d */
    /* loaded from: classes8.dex */
    public class C31042d extends oh0<E> {

        /* renamed from: e */
        final transient int f83518e;

        /* renamed from: f */
        final transient int f83519f;

        C31042d(int i, int i2) {
            this.f83518e = i;
            this.f83519f = i2;
        }

        @Override // com.yandex.mobile.ads.impl.oh0, java.util.List
        /* renamed from: a */
        public final oh0<E> subList(int i, int i2) {
            uf1.m28795a(i, i2, this.f83519f);
            oh0 oh0Var = oh0.this;
            int i3 = this.f83518e;
            return oh0Var.subList(i + i3, i2 + i3);
        }

        @Override // com.yandex.mobile.ads.impl.mh0
        /* renamed from: c */
        final Object[] mo31004c() {
            return oh0.this.mo31004c();
        }

        @Override // com.yandex.mobile.ads.impl.mh0
        /* renamed from: d */
        final int mo31003d() {
            return oh0.this.mo31002e() + this.f83518e + this.f83519f;
        }

        @Override // com.yandex.mobile.ads.impl.mh0
        /* renamed from: e */
        final int mo31002e() {
            return oh0.this.mo31002e() + this.f83518e;
        }

        @Override // com.yandex.mobile.ads.impl.mh0
        /* renamed from: f */
        final boolean mo30881f() {
            return true;
        }

        @Override // java.util.List
        public final E get(int i) {
            uf1.m28796a(i, this.f83519f);
            return oh0.this.get(i + this.f83518e);
        }

        @Override // com.yandex.mobile.ads.impl.oh0, com.yandex.mobile.ads.impl.mh0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.yandex.mobile.ads.impl.oh0, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f83519f;
        }

        @Override // com.yandex.mobile.ads.impl.oh0, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    /* renamed from: a */
    private static <E> oh0<E> m31013a(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(C31736wd.m27978a("at index ", i));
            }
        }
        return m31012b(objArr.length, objArr);
    }

    /* renamed from: g */
    public static <E> C31039a<E> m31010g() {
        return new C31039a<>();
    }

    /* renamed from: h */
    public static <E> oh0<E> m31009h() {
        return (oh0<E>) ck1.f77657g;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.List
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.mh0
    @InlineMe(replacement = "this")
    @Deprecated
    /* renamed from: b */
    public final oh0<E> mo30356b() {
        return this;
    }

    @Override // com.yandex.mobile.ads.impl.mh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (da1.m34981a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = list.iterator();
                for (E e : this) {
                    if (it.hasNext()) {
                        if (!da1.m34981a(e, it.next())) {
                        }
                    }
                }
                return true ^ it.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (obj.equals(get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.mh0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final d32<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj != null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (obj.equals(get(size))) {
                    return size;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.mh0
    Object writeReplace() {
        return new C31041c(toArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static oh0 m31012b(int i, Object[] objArr) {
        if (i == 0) {
            return ck1.f77657g;
        }
        return new ck1(i, objArr);
    }

    @Override // com.yandex.mobile.ads.impl.mh0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: b */
    public static <E> oh0<E> m31011b(E[] eArr) {
        if (eArr.length == 0) {
            return (oh0<E>) ck1.f77657g;
        }
        return m31013a((Object[]) eArr.clone());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.yandex.mobile.ads.impl.mh0
    /* renamed from: a */
    public int mo30882a(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: a */
    public static <E> oh0<E> m31014a(Collection<? extends E> collection) {
        if (collection instanceof mh0) {
            oh0<E> mo30356b = ((mh0) collection).mo30356b();
            if (mo30356b.mo30881f()) {
                Object[] array = mo30356b.toArray();
                return m31012b(array.length, array);
            }
            return mo30356b;
        }
        return m31013a(collection.toArray());
    }

    @Override // java.util.List
    /* renamed from: a */
    public final e32<E> listIterator(int i) {
        uf1.m28791b(i, size());
        if (isEmpty()) {
            return (e32<E>) f83514c;
        }
        return new C31040b(i, this);
    }

    /* renamed from: a */
    public static oh0 m31017a(Long l, Long l2, Long l3, Long l4, Long l5) {
        return m31013a(l, l2, l3, l4, l5);
    }

    /* renamed from: a */
    public static <E> oh0<E> m31016a(E e) {
        return m31013a(e);
    }

    /* renamed from: a */
    public static <E> oh0<E> m31015a(E e, E e2) {
        return m31013a(e, e2);
    }

    @Override // java.util.List
    /* renamed from: a */
    public oh0<E> subList(int i, int i2) {
        uf1.m28795a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return (oh0<E>) ck1.f77657g;
        }
        return new C31042d(i, i3);
    }
}
