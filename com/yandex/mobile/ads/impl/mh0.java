package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import com.yandex.mobile.ads.impl.oh0;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@DoNotMock("Use ImmutableList.of or another implementation")
/* loaded from: classes8.dex */
public abstract class mh0<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b */
    private static final Object[] f82196b = new Object[0];

    @DoNotMock
    /* renamed from: com.yandex.mobile.ads.impl.mh0$b */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC30856b<E> {
        AbstractC30856b() {
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    int mo30882a(int i, Object[] objArr) {
        d32<E> it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public oh0<E> mo30356b() {
        if (isEmpty()) {
            int i = oh0.f83515d;
            return (oh0<E>) ck1.f77657g;
        }
        Object[] array = toArray(f82196b);
        int i2 = oh0.f83515d;
        return oh0.m31012b(array.length, array);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Object[] mo31004c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* renamed from: d */
    int mo31003d() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo31002e() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract boolean mo30881f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract d32<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f82196b);
    }

    Object writeReplace() {
        return new oh0.C31041c(toArray(f82196b));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] mo31004c = mo31004c();
            if (mo31004c != null) {
                return (T[]) pd1.m30757a(mo31004c, mo31002e(), mo31003d(), tArr);
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo30882a(0, tArr);
        return tArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.mh0$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC30855a<E> extends AbstractC30856b<E> {

        /* renamed from: a */
        Object[] f82197a;

        /* renamed from: b */
        int f82198b;

        /* renamed from: c */
        boolean f82199c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC30855a() {
            C30644jp.m32828a(4, "initialCapacity");
            this.f82197a = new Object[4];
            this.f82198b = 0;
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public final void m32001a(Object obj) {
            obj.getClass();
            int i = this.f82198b;
            int i2 = i + 1;
            Object[] objArr = this.f82197a;
            if (objArr.length < i2) {
                int length = objArr.length;
                if (i2 >= 0) {
                    int i3 = length + (length >> 1) + 1;
                    if (i3 < i2) {
                        i3 = Integer.highestOneBit(i) << 1;
                    }
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    this.f82197a = Arrays.copyOf(objArr, i3);
                    this.f82199c = false;
                } else {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
            } else if (this.f82199c) {
                this.f82197a = (Object[]) objArr.clone();
                this.f82199c = false;
            }
            Object[] objArr2 = this.f82197a;
            int i4 = this.f82198b;
            this.f82198b = i4 + 1;
            objArr2[i4] = obj;
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public void m31999b(Object obj) {
            m32001a(obj);
        }

        @CanIgnoreReturnValue
        /* renamed from: a */
        public final AbstractC30856b m32000a(List list) {
            if (list instanceof Collection) {
                int size = list.size() + this.f82198b;
                Object[] objArr = this.f82197a;
                if (objArr.length < size) {
                    int length = objArr.length;
                    if (size >= 0) {
                        int i = length + (length >> 1) + 1;
                        if (i < size) {
                            i = Integer.highestOneBit(size - 1) << 1;
                        }
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                        this.f82197a = Arrays.copyOf(objArr, i);
                        this.f82199c = false;
                    } else {
                        throw new AssertionError("cannot store more than MAX_VALUE elements");
                    }
                } else if (this.f82199c) {
                    this.f82197a = (Object[]) objArr.clone();
                    this.f82199c = false;
                }
                if (list instanceof mh0) {
                    this.f82198b = ((mh0) list).mo30882a(this.f82198b, this.f82197a);
                    return this;
                }
            }
            for (Object obj : list) {
                ((oh0.C31039a) this).m32001a(obj);
            }
            return this;
        }
    }
}
