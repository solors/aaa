package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
abstract class AbstractIterator<T> implements Iterator<T> {

    /* renamed from: b */
    private State f39301b = State.NOT_READY;

    /* renamed from: c */
    private T f39302c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.base.AbstractIterator$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C166361 {

        /* renamed from: a */
        static final /* synthetic */ int[] f39303a;

        static {
            int[] iArr = new int[State.values().length];
            f39303a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39303a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: c */
    private boolean m70110c() {
        this.f39301b = State.FAILED;
        this.f39302c = mo70009a();
        if (this.f39301b != State.DONE) {
            this.f39301b = State.READY;
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected abstract T mo70009a();

    /* JADX INFO: Access modifiers changed from: protected */
    @CanIgnoreReturnValue
    /* renamed from: b */
    public final T m70111b() {
        this.f39301b = State.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.f39301b != State.FAILED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        int i = C166361.f39303a[this.f39301b.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        return m70110c();
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        if (hasNext()) {
            this.f39301b = State.NOT_READY;
            T t = (T) NullnessCasts.m70058a(this.f39302c);
            this.f39302c = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
