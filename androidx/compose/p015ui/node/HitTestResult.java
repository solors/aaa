package androidx.compose.p015ui.node;

import ae.KMarkers;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HitTestResult.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.HitTestResult */
/* loaded from: classes.dex */
public final class HitTestResult<T> implements List<T>, KMarkers {
    private int size;
    @NotNull
    private Object[] values = new Object[16];
    @NotNull
    private long[] distanceFromEdgeAndInLayer = new long[16];
    private int hitDepth = -1;

    /* compiled from: HitTestResult.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.node.HitTestResult$SubList */
    /* loaded from: classes.dex */
    private final class SubList implements List<T>, KMarkers {
        private final int maxIndex;
        private final int minIndex;

        public SubList(int i, int i2) {
            this.minIndex = i;
            this.maxIndex = i2;
        }

        @Override // java.util.List
        public void add(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            if (indexOf(obj) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i) {
            return (T) ((HitTestResult) HitTestResult.this).values[i + this.minIndex];
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public int getSize() {
            return this.maxIndex - this.minIndex;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.minIndex;
            int i2 = this.maxIndex;
            if (i <= i2) {
                while (!Intrinsics.m17075f(((HitTestResult) HitTestResult.this).values[i], obj)) {
                    if (i != i2) {
                        i++;
                    } else {
                        return -1;
                    }
                }
                return i - this.minIndex;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (size() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            HitTestResult<T> hitTestResult = HitTestResult.this;
            int i = this.minIndex;
            return new HitTestResultIterator(i, i, this.maxIndex);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.maxIndex;
            int i2 = this.minIndex;
            if (i2 <= i) {
                while (!Intrinsics.m17075f(((HitTestResult) HitTestResult.this).values[i], obj)) {
                    if (i != i2) {
                        i--;
                    } else {
                        return -1;
                    }
                }
                return i - this.minIndex;
            }
            return -1;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            HitTestResult<T> hitTestResult = HitTestResult.this;
            int i = this.minIndex;
            return new HitTestResultIterator(i, i, this.maxIndex);
        }

        @Override // java.util.List
        public T remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public T set(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int i, int i2) {
            HitTestResult<T> hitTestResult = HitTestResult.this;
            int i3 = this.minIndex;
            return new SubList(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.m17045a(this);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int i) {
            HitTestResult<T> hitTestResult = HitTestResult.this;
            int i2 = this.minIndex;
            return new HitTestResultIterator(i + i2, i2, this.maxIndex);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.m17044b(this, array);
        }
    }

    private final void ensureContainerSize() {
        int i = this.hitDepth;
        Object[] objArr = this.values;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.values = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.distanceFromEdgeAndInLayer, length);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.distanceFromEdgeAndInLayer = copyOf2;
        }
    }

    /* renamed from: findBestHitDistance-ptXAw2c  reason: not valid java name */
    private final long m109139findBestHitDistanceptXAw2c() {
        long DistanceAndInLayer;
        int m17164o;
        DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(Float.POSITIVE_INFINITY, false);
        int i = this.hitDepth + 1;
        m17164o = C37563v.m17164o(this);
        if (i <= m17164o) {
            while (true) {
                long m109100constructorimpl = DistanceAndInLayer.m109100constructorimpl(this.distanceFromEdgeAndInLayer[i]);
                if (DistanceAndInLayer.m109099compareToS_HNhKs(m109100constructorimpl, DistanceAndInLayer) < 0) {
                    DistanceAndInLayer = m109100constructorimpl;
                }
                if (DistanceAndInLayer.m109103getDistanceimpl(DistanceAndInLayer) < 0.0f && DistanceAndInLayer.m109105isInLayerimpl(DistanceAndInLayer)) {
                    return DistanceAndInLayer;
                }
                if (i == m17164o) {
                    break;
                }
                i++;
            }
        }
        return DistanceAndInLayer;
    }

    private final void resizeToHitDepth() {
        int m17164o;
        int i = this.hitDepth + 1;
        m17164o = C37563v.m17164o(this);
        if (i <= m17164o) {
            while (true) {
                this.values[i] = null;
                if (i == m17164o) {
                    break;
                }
                i++;
            }
        }
        this.size = this.hitDepth + 1;
    }

    public final void acceptHits() {
        this.hitDepth = size() - 1;
    }

    @Override // java.util.List
    public void add(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        resizeToHitDepth();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public T get(int i) {
        return (T) this.values[i];
    }

    public int getSize() {
        return this.size;
    }

    public final boolean hasHit() {
        long m109139findBestHitDistanceptXAw2c = m109139findBestHitDistanceptXAw2c();
        if (DistanceAndInLayer.m109103getDistanceimpl(m109139findBestHitDistanceptXAw2c) < 0.0f && DistanceAndInLayer.m109105isInLayerimpl(m109139findBestHitDistanceptXAw2c)) {
            return true;
        }
        return false;
    }

    public final void hit(T t, boolean z, @NotNull Functions<Unit> childHitTest) {
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        hitInMinimumTouchTarget(t, -1.0f, z, childHitTest);
    }

    public final void hitInMinimumTouchTarget(T t, float f, boolean z, @NotNull Functions<Unit> childHitTest) {
        long DistanceAndInLayer;
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        int i = this.hitDepth;
        this.hitDepth = i + 1;
        ensureContainerSize();
        Object[] objArr = this.values;
        int i2 = this.hitDepth;
        objArr[i2] = t;
        long[] jArr = this.distanceFromEdgeAndInLayer;
        DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(f, z);
        jArr[i2] = DistanceAndInLayer;
        resizeToHitDepth();
        childHitTest.invoke();
        this.hitDepth = i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int m17164o;
        m17164o = C37563v.m17164o(this);
        if (m17164o >= 0) {
            int i = 0;
            while (!Intrinsics.m17075f(this.values[i], obj)) {
                if (i != m17164o) {
                    i++;
                } else {
                    return -1;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f, boolean z) {
        int m17164o;
        long DistanceAndInLayer;
        int i = this.hitDepth;
        m17164o = C37563v.m17164o(this);
        if (i != m17164o) {
            DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(f, z);
            if (DistanceAndInLayer.m109099compareToS_HNhKs(m109139findBestHitDistanceptXAw2c(), DistanceAndInLayer) > 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int m17164o;
        for (m17164o = C37563v.m17164o(this); -1 < m17164o; m17164o--) {
            if (Intrinsics.m17075f(this.values[m17164o], obj)) {
                return m17164o;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public T remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public T set(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void siblingHits(@NotNull Functions<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int i = this.hitDepth;
        block.invoke();
        this.hitDepth = i;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void speculativeHit(T t, float f, boolean z, @NotNull Functions<Unit> childHitTest) {
        int m17164o;
        int m17164o2;
        int m17164o3;
        int m17164o4;
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        int i = this.hitDepth;
        m17164o = C37563v.m17164o(this);
        if (i == m17164o) {
            hitInMinimumTouchTarget(t, f, z, childHitTest);
            int i2 = this.hitDepth + 1;
            m17164o4 = C37563v.m17164o(this);
            if (i2 == m17164o4) {
                resizeToHitDepth();
                return;
            }
            return;
        }
        long m109139findBestHitDistanceptXAw2c = m109139findBestHitDistanceptXAw2c();
        int i3 = this.hitDepth;
        m17164o2 = C37563v.m17164o(this);
        this.hitDepth = m17164o2;
        hitInMinimumTouchTarget(t, f, z, childHitTest);
        int i4 = this.hitDepth + 1;
        m17164o3 = C37563v.m17164o(this);
        if (i4 < m17164o3 && DistanceAndInLayer.m109099compareToS_HNhKs(m109139findBestHitDistanceptXAw2c, m109139findBestHitDistanceptXAw2c()) > 0) {
            int i5 = this.hitDepth + 1;
            int i6 = i3 + 1;
            Object[] objArr = this.values;
            _ArraysJvm.m17393l(objArr, objArr, i6, i5, size());
            long[] jArr = this.distanceFromEdgeAndInLayer;
            _ArraysJvm.m17394k(jArr, jArr, i6, i5, size());
            this.hitDepth = ((size() + i3) - this.hitDepth) - 1;
        }
        resizeToHitDepth();
        this.hitDepth = i3;
    }

    @Override // java.util.List
    @NotNull
    public List<T> subList(int i, int i2) {
        return new SubList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m17045a(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator(int i) {
        return new HitTestResultIterator(this, i, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.m17044b(this, array);
    }

    /* compiled from: HitTestResult.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.node.HitTestResult$HitTestResultIterator */
    /* loaded from: classes.dex */
    private final class HitTestResultIterator implements ListIterator<T>, KMarkers {
        private int index;
        private final int maxIndex;
        private final int minIndex;

        public HitTestResultIterator(int i, int i2, int i3) {
            this.index = i;
            this.minIndex = i2;
            this.maxIndex = i3;
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.index < this.maxIndex) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.index > this.minIndex) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            Object[] objArr = ((HitTestResult) HitTestResult.this).values;
            int i = this.index;
            this.index = i + 1;
            return (T) objArr[i];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public T previous() {
            Object[] objArr = ((HitTestResult) HitTestResult.this).values;
            int i = this.index - 1;
            this.index = i;
            return (T) objArr[i];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.index = i;
        }

        public /* synthetic */ HitTestResultIterator(HitTestResult hitTestResult, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? hitTestResult.size() : i3);
        }
    }
}
