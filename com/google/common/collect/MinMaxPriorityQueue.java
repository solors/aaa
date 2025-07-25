package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {

    /* renamed from: b */
    private final MinMaxPriorityQueue<E>.Heap f40447b;

    /* renamed from: c */
    private final MinMaxPriorityQueue<E>.Heap f40448c;
    @VisibleForTesting

    /* renamed from: d */
    final int f40449d;

    /* renamed from: f */
    private Object[] f40450f;

    /* renamed from: g */
    private int f40451g;

    /* renamed from: h */
    private int f40452h;

    @Beta
    /* loaded from: classes4.dex */
    public static final class Builder<B> {

        /* renamed from: a */
        private final Comparator<B> f40453a;

        /* renamed from: b */
        private int f40454b;

        /* renamed from: c */
        private int f40455c;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public <T extends B> Ordering<T> m68974c() {
            return Ordering.from(this.f40453a);
        }

        public <T extends B> MinMaxPriorityQueue<T> create() {
            return create(Collections.emptySet());
        }

        @CanIgnoreReturnValue
        public Builder<B> expectedSize(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f40454b = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<B> maximumSize(int i) {
            boolean z;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f40455c = i;
            return this;
        }

        private Builder(Comparator<B> comparator) {
            this.f40454b = -1;
            this.f40455c = Integer.MAX_VALUE;
            this.f40453a = (Comparator) Preconditions.checkNotNull(comparator);
        }

        public <T extends B> MinMaxPriorityQueue<T> create(Iterable<? extends T> iterable) {
            MinMaxPriorityQueue<T> minMaxPriorityQueue = new MinMaxPriorityQueue<>(this, MinMaxPriorityQueue.m68980k(this.f40454b, this.f40455c, iterable));
            for (T t : iterable) {
                minMaxPriorityQueue.offer(t);
            }
            return minMaxPriorityQueue;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class Heap {

        /* renamed from: a */
        final Ordering<E> f40456a;
        @Weak

        /* renamed from: b */
        MinMaxPriorityQueue<E>.Heap f40457b;

        Heap(Ordering<E> ordering) {
            this.f40456a = ordering;
        }

        /* renamed from: j */
        private int m68964j(int i) {
            return m68962l(m68962l(i));
        }

        /* renamed from: k */
        private int m68963k(int i) {
            return (i * 2) + 1;
        }

        /* renamed from: l */
        private int m68962l(int i) {
            return (i - 1) / 2;
        }

        /* renamed from: m */
        private int m68961m(int i) {
            return (i * 2) + 2;
        }

        /* renamed from: a */
        void m68973a(int i, E e) {
            Heap heap;
            int m68969e = m68969e(i, e);
            if (m68969e == i) {
                m68969e = i;
                heap = this;
            } else {
                heap = this.f40457b;
            }
            heap.m68972b(m68969e, e);
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        int m68972b(int i, E e) {
            while (i > 2) {
                int m68964j = m68964j(i);
                Object m68985f = MinMaxPriorityQueue.this.m68985f(m68964j);
                if (((Ordering<E>) this.f40456a).compare(m68985f, e) <= 0) {
                    break;
                }
                MinMaxPriorityQueue.this.f40450f[i] = m68985f;
                i = m68964j;
            }
            MinMaxPriorityQueue.this.f40450f[i] = e;
            return i;
        }

        /* renamed from: c */
        int m68971c(int i, int i2) {
            return ((Ordering<E>) this.f40456a).compare(MinMaxPriorityQueue.this.m68985f(i), MinMaxPriorityQueue.this.m68985f(i2));
        }

        /* renamed from: d */
        int m68970d(int i, E e) {
            int m68966h = m68966h(i);
            if (m68966h > 0 && ((Ordering<E>) this.f40456a).compare(MinMaxPriorityQueue.this.m68985f(m68966h), e) < 0) {
                MinMaxPriorityQueue.this.f40450f[i] = MinMaxPriorityQueue.this.m68985f(m68966h);
                MinMaxPriorityQueue.this.f40450f[m68966h] = e;
                return m68966h;
            }
            return m68969e(i, e);
        }

        /* renamed from: e */
        int m68969e(int i, E e) {
            int m68961m;
            if (i == 0) {
                MinMaxPriorityQueue.this.f40450f[0] = e;
                return 0;
            }
            int m68962l = m68962l(i);
            Object m68985f = MinMaxPriorityQueue.this.m68985f(m68962l);
            if (m68962l != 0 && (m68961m = m68961m(m68962l(m68962l))) != m68962l && m68963k(m68961m) >= MinMaxPriorityQueue.this.f40451g) {
                Object m68985f2 = MinMaxPriorityQueue.this.m68985f(m68961m);
                if (((Ordering<E>) this.f40456a).compare(m68985f2, m68985f) < 0) {
                    m68962l = m68961m;
                    m68985f = m68985f2;
                }
            }
            if (((Ordering<E>) this.f40456a).compare(m68985f, e) < 0) {
                MinMaxPriorityQueue.this.f40450f[i] = m68985f;
                MinMaxPriorityQueue.this.f40450f[m68962l] = e;
                return m68962l;
            }
            MinMaxPriorityQueue.this.f40450f[i] = e;
            return i;
        }

        /* renamed from: f */
        int m68968f(int i) {
            while (true) {
                int m68965i = m68965i(i);
                if (m68965i > 0) {
                    MinMaxPriorityQueue.this.f40450f[i] = MinMaxPriorityQueue.this.m68985f(m68965i);
                    i = m68965i;
                } else {
                    return i;
                }
            }
        }

        /* renamed from: g */
        int m68967g(int i, int i2) {
            boolean z;
            if (i >= MinMaxPriorityQueue.this.f40451g) {
                return -1;
            }
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            int min = Math.min(i, MinMaxPriorityQueue.this.f40451g - i2) + i2;
            for (int i3 = i + 1; i3 < min; i3++) {
                if (m68971c(i3, i) < 0) {
                    i = i3;
                }
            }
            return i;
        }

        /* renamed from: h */
        int m68966h(int i) {
            return m68967g(m68963k(i), 2);
        }

        /* renamed from: i */
        int m68965i(int i) {
            int m68963k = m68963k(i);
            if (m68963k < 0) {
                return -1;
            }
            return m68967g(m68963k(m68963k), 4);
        }

        /* renamed from: n */
        int m68960n(E e) {
            int m68961m;
            int m68962l = m68962l(MinMaxPriorityQueue.this.f40451g);
            if (m68962l != 0 && (m68961m = m68961m(m68962l(m68962l))) != m68962l && m68963k(m68961m) >= MinMaxPriorityQueue.this.f40451g) {
                Object m68985f = MinMaxPriorityQueue.this.m68985f(m68961m);
                if (((Ordering<E>) this.f40456a).compare(m68985f, e) < 0) {
                    MinMaxPriorityQueue.this.f40450f[m68961m] = e;
                    MinMaxPriorityQueue.this.f40450f[MinMaxPriorityQueue.this.f40451g] = m68985f;
                    return m68961m;
                }
            }
            return MinMaxPriorityQueue.this.f40451g;
        }

        /* renamed from: o */
        MoveDesc<E> m68959o(int i, int i2, E e) {
            Object m68985f;
            int m68970d = m68970d(i2, e);
            if (m68970d == i2) {
                return null;
            }
            if (m68970d < i) {
                m68985f = MinMaxPriorityQueue.this.m68985f(i);
            } else {
                m68985f = MinMaxPriorityQueue.this.m68985f(m68962l(i));
            }
            if (this.f40457b.m68972b(m68970d, e) >= i) {
                return null;
            }
            return new MoveDesc<>(e, m68985f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class MoveDesc<E> {

        /* renamed from: a */
        final E f40459a;

        /* renamed from: b */
        final E f40460b;

        MoveDesc(E e, E e2) {
            this.f40459a = e;
            this.f40460b = e2;
        }
    }

    /* loaded from: classes4.dex */
    private class QueueIterator implements Iterator<E> {

        /* renamed from: b */
        private int f40461b;

        /* renamed from: c */
        private int f40462c;

        /* renamed from: d */
        private int f40463d;

        /* renamed from: f */
        private Queue<E> f40464f;

        /* renamed from: g */
        private List<E> f40465g;

        /* renamed from: h */
        private E f40466h;

        /* renamed from: i */
        private boolean f40467i;

        private QueueIterator() {
            this.f40461b = -1;
            this.f40462c = -1;
            this.f40463d = MinMaxPriorityQueue.this.f40452h;
        }

        /* renamed from: a */
        private void m68958a() {
            if (MinMaxPriorityQueue.this.f40452h == this.f40463d) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        private boolean m68957b(Iterable<E> iterable, E e) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                if (it.next() == e) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        private void m68956c(int i) {
            if (this.f40462c < i) {
                if (this.f40465g != null) {
                    while (i < MinMaxPriorityQueue.this.size() && m68957b(this.f40465g, MinMaxPriorityQueue.this.m68985f(i))) {
                        i++;
                    }
                }
                this.f40462c = i;
            }
        }

        /* renamed from: d */
        private boolean m68955d(Object obj) {
            for (int i = 0; i < MinMaxPriorityQueue.this.f40451g; i++) {
                if (MinMaxPriorityQueue.this.f40450f[i] == obj) {
                    MinMaxPriorityQueue.this.m68977n(i);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m68958a();
            m68956c(this.f40461b + 1);
            if (this.f40462c < MinMaxPriorityQueue.this.size()) {
                return true;
            }
            Queue<E> queue = this.f40464f;
            if (queue != null && !queue.isEmpty()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            m68958a();
            m68956c(this.f40461b + 1);
            if (this.f40462c < MinMaxPriorityQueue.this.size()) {
                int i = this.f40462c;
                this.f40461b = i;
                this.f40467i = true;
                return (E) MinMaxPriorityQueue.this.m68985f(i);
            }
            if (this.f40464f != null) {
                this.f40461b = MinMaxPriorityQueue.this.size();
                E poll = this.f40464f.poll();
                this.f40466h = poll;
                if (poll != null) {
                    this.f40467i = true;
                    return poll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.m69724e(this.f40467i);
            m68958a();
            this.f40467i = false;
            this.f40463d++;
            if (this.f40461b < MinMaxPriorityQueue.this.size()) {
                MoveDesc<E> m68977n = MinMaxPriorityQueue.this.m68977n(this.f40461b);
                if (m68977n != null) {
                    if (this.f40464f == null || this.f40465g == null) {
                        this.f40464f = new ArrayDeque();
                        this.f40465g = new ArrayList(3);
                    }
                    if (!m68957b(this.f40465g, m68977n.f40459a)) {
                        this.f40464f.add(m68977n.f40459a);
                    }
                    if (!m68957b(this.f40464f, m68977n.f40460b)) {
                        this.f40465g.add(m68977n.f40460b);
                    }
                }
                this.f40461b--;
                this.f40462c--;
                return;
            }
            E e = this.f40466h;
            Objects.requireNonNull(e);
            Preconditions.checkState(m68955d(e));
            this.f40466h = null;
        }
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create() {
        return new Builder(Ordering.natural()).create();
    }

    /* renamed from: d */
    private int m68987d() {
        int checkedMultiply;
        int length = this.f40450f.length;
        if (length < 64) {
            checkedMultiply = (length + 1) * 2;
        } else {
            checkedMultiply = IntMath.checkedMultiply(length / 2, 3);
        }
        return m68986e(checkedMultiply, this.f40449d);
    }

    /* renamed from: e */
    private static int m68986e(int i, int i2) {
        return Math.min(i - 1, i2) + 1;
    }

    public static Builder<Comparable> expectedSize(int i) {
        return new Builder(Ordering.natural()).expectedSize(i);
    }

    /* renamed from: g */
    private MoveDesc<E> m68984g(int i, E e) {
        MinMaxPriorityQueue<E>.Heap m68981j = m68981j(i);
        int m68968f = m68981j.m68968f(i);
        int m68972b = m68981j.m68972b(m68968f, e);
        if (m68972b == m68968f) {
            return m68981j.m68959o(i, m68968f, e);
        }
        if (m68972b < i) {
            return new MoveDesc<>(e, m68985f(i));
        }
        return null;
    }

    /* renamed from: h */
    private int m68983h() {
        int i = this.f40451g;
        if (i != 1) {
            if (i == 2 || this.f40448c.m68971c(1, 2) <= 0) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    /* renamed from: i */
    private void m68982i() {
        if (this.f40451g > this.f40450f.length) {
            Object[] objArr = new Object[m68987d()];
            Object[] objArr2 = this.f40450f;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f40450f = objArr;
        }
    }

    /* renamed from: j */
    private MinMaxPriorityQueue<E>.Heap m68981j(int i) {
        if (m68979l(i)) {
            return this.f40447b;
        }
        return this.f40448c;
    }

    @VisibleForTesting
    /* renamed from: k */
    static int m68980k(int i, int i2, Iterable<?> iterable) {
        if (i == -1) {
            i = 11;
        }
        if (iterable instanceof Collection) {
            i = Math.max(i, ((Collection) iterable).size());
        }
        return m68986e(i, i2);
    }

    @VisibleForTesting
    /* renamed from: l */
    static boolean m68979l(int i) {
        boolean z;
        int i2 = ~(~(i + 1));
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "negative index");
        if ((1431655765 & i2) > (i2 & (-1431655766))) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private E m68978m(int i) {
        E m68985f = m68985f(i);
        m68977n(i);
        return m68985f;
    }

    public static Builder<Comparable> maximumSize(int i) {
        return new Builder(Ordering.natural()).maximumSize(i);
    }

    public static <B> Builder<B> orderedBy(Comparator<B> comparator) {
        return new Builder<>(comparator);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e) {
        offer(e);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        boolean z = false;
        for (E e : collection) {
            offer(e);
            z = true;
        }
        return z;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i = 0; i < this.f40451g; i++) {
            this.f40450f[i] = null;
        }
        this.f40451g = 0;
    }

    public Comparator<? super E> comparator() {
        return this.f40447b.f40456a;
    }

    /* renamed from: f */
    E m68985f(int i) {
        E e = (E) this.f40450f[i];
        Objects.requireNonNull(e);
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    /* renamed from: n */
    MoveDesc<E> m68977n(int i) {
        Preconditions.checkPositionIndex(i, this.f40451g);
        this.f40452h++;
        int i2 = this.f40451g - 1;
        this.f40451g = i2;
        if (i2 == i) {
            this.f40450f[i2] = null;
            return null;
        }
        E m68985f = m68985f(i2);
        int m68960n = m68981j(this.f40451g).m68960n(m68985f);
        if (m68960n == i) {
            this.f40450f[this.f40451g] = null;
            return null;
        }
        E m68985f2 = m68985f(this.f40451g);
        this.f40450f[this.f40451g] = null;
        MoveDesc<E> m68984g = m68984g(i, m68985f2);
        if (m68960n < i) {
            if (m68984g == null) {
                return new MoveDesc<>(m68985f, m68985f2);
            }
            return new MoveDesc<>(m68985f, m68984g.f40460b);
        }
        return m68984g;
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e) {
        Preconditions.checkNotNull(e);
        this.f40452h++;
        int i = this.f40451g;
        this.f40451g = i + 1;
        m68982i();
        m68981j(i).m68973a(i, e);
        if (this.f40451g <= this.f40449d || pollLast() != e) {
            return true;
        }
        return false;
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return m68985f(0);
    }

    public E peekFirst() {
        return peek();
    }

    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return m68985f(m68983h());
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return m68978m(0);
    }

    @CanIgnoreReturnValue
    public E pollFirst() {
        return poll();
    }

    @CanIgnoreReturnValue
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return m68978m(m68983h());
    }

    @CanIgnoreReturnValue
    public E removeFirst() {
        return remove();
    }

    @CanIgnoreReturnValue
    public E removeLast() {
        if (!isEmpty()) {
            return m68978m(m68983h());
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f40451g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        int i = this.f40451g;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f40450f, 0, objArr, 0, i);
        return objArr;
    }

    private MinMaxPriorityQueue(Builder<? super E> builder, int i) {
        Ordering m68974c = builder.m68974c();
        MinMaxPriorityQueue<E>.Heap heap = new Heap(m68974c);
        this.f40447b = heap;
        MinMaxPriorityQueue<E>.Heap heap2 = new Heap(m68974c.reverse());
        this.f40448c = heap2;
        heap.f40457b = heap2;
        heap2.f40457b = heap;
        this.f40449d = ((Builder) builder).f40455c;
        this.f40450f = new Object[i];
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create(Iterable<? extends E> iterable) {
        return new Builder(Ordering.natural()).create(iterable);
    }
}
