package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class AbstractIterator<T> extends UnmodifiableIterator<T> {

    /* renamed from: b */
    private State f39722b = State.NOT_READY;

    /* renamed from: c */
    private T f39723c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.AbstractIterator$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C167101 {

        /* renamed from: a */
        static final /* synthetic */ int[] f39724a;

        static {
            int[] iArr = new int[State.values().length];
            f39724a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39724a[State.READY.ordinal()] = 2;
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

    /* renamed from: b */
    private boolean m69806b() {
        this.f39722b = State.FAILED;
        this.f39723c = computeNext();
        if (this.f39722b != State.DONE) {
            this.f39722b = State.READY;
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CanIgnoreReturnValue
    /* renamed from: a */
    public final T m69807a() {
        this.f39722b = State.DONE;
        return null;
    }

    protected abstract T computeNext();

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final boolean hasNext() {
        boolean z;
        if (this.f39722b != State.FAILED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        int i = C167101.f39724a[this.f39722b.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        return m69806b();
    }

    @Override // java.util.Iterator
    @ParametricNullness
    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.f39722b = State.NOT_READY;
            T t = (T) NullnessCasts.m68906a(this.f39723c);
            this.f39723c = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @ParametricNullness
    public final T peek() {
        if (hasNext()) {
            return (T) NullnessCasts.m68906a(this.f39723c);
        }
        throw new NoSuchElementException();
    }
}
