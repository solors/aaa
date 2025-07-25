package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.commonFunctions;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C37598c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PersistentVectorBuilder.kt */
@Metadata
/* loaded from: classes.dex */
public final class PersistentVectorBuilder<E> extends AbstractMutableList<E> implements PersistentList.Builder<E> {
    @NotNull
    private MutabilityOwnership ownership;
    @Nullable
    private Object[] root;
    private int rootShift;
    private int size;
    @NotNull
    private Object[] tail;
    @NotNull
    private PersistentList<? extends E> vector;
    @Nullable
    private Object[] vectorRoot;
    @NotNull
    private Object[] vectorTail;

    public PersistentVectorBuilder(@NotNull PersistentList<? extends E> vector, @Nullable Object[] objArr, @NotNull Object[] vectorTail, int i) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        Intrinsics.checkNotNullParameter(vectorTail, "vectorTail");
        this.vector = vector;
        this.vectorRoot = objArr;
        this.vectorTail = vectorTail;
        this.rootShift = i;
        this.ownership = new MutabilityOwnership();
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final Object[] bufferFor(int i) {
        if (rootSize() <= i) {
            return this.tail;
        }
        Object[] objArr = this.root;
        Intrinsics.m17074g(objArr);
        for (int i2 = this.rootShift; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i, i2)];
            if (objArr2 != null) {
                objArr = objArr2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
        }
        return objArr;
    }

    private final Object[] copyToBuffer(Object[] objArr, int i, Iterator<? extends Object> it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object[] insertIntoRoot(java.lang.Object[] r9, int r10, int r11, java.lang.Object r12, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.Utils r13) {
        /*
            r8 = this;
            int r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(r11, r10)
            if (r10 != 0) goto L1a
            r10 = 31
            r11 = r9[r10]
            r13.setValue(r11)
            java.lang.Object[] r11 = r8.makeMutable(r9)
            int r13 = r0 + 1
            java.lang.Object[] r9 = kotlin.collections.C37551l.m17443l(r9, r11, r13, r0, r10)
            r9[r0] = r12
            return r9
        L1a:
            java.lang.Object[] r9 = r8.makeMutable(r9)
            int r10 = r10 + (-5)
            r1 = r9[r0]
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            if (r1 == 0) goto L59
            r2 = r1
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object[] r11 = r1.insertIntoRoot(r2, r3, r4, r5, r6)
            r9[r0] = r11
        L34:
            int r0 = r0 + 1
            r11 = 32
            if (r0 >= r11) goto L58
            r11 = r9[r0]
            if (r11 == 0) goto L58
            if (r11 == 0) goto L52
            r2 = r11
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r4 = 0
            java.lang.Object r5 = r13.getValue()
            r1 = r8
            r3 = r10
            r6 = r13
            java.lang.Object[] r11 = r1.insertIntoRoot(r2, r3, r4, r5, r6)
            r9[r0] = r11
            goto L34
        L52:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r7)
            throw r9
        L58:
            return r9
        L59:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.insertIntoRoot(java.lang.Object[], int, int, java.lang.Object, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef):java.lang.Object[]");
    }

    private final void insertIntoTail(Object[] objArr, int i, E e) {
        int tailSize = tailSize();
        Object[] makeMutable = makeMutable(this.tail);
        if (tailSize < 32) {
            _ArraysJvm.m17393l(this.tail, makeMutable, i + 1, i, tailSize);
            makeMutable[i] = e;
            this.root = objArr;
            this.tail = makeMutable;
            this.size = size() + 1;
            return;
        }
        Object[] objArr2 = this.tail;
        Object obj = objArr2[31];
        _ArraysJvm.m17393l(objArr2, makeMutable, i + 1, i, 31);
        makeMutable[i] = e;
        pushFilledTail(objArr, makeMutable, mutableBufferWith(obj));
    }

    private final boolean isMutable(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.ownership) {
            return true;
        }
        return false;
    }

    private final ListIterator<Object[]> leafBufferIterator(int i) {
        if (this.root != null) {
            int rootSize = rootSize() >> 5;
            ListImplementation.checkPositionIndex$runtime_release(i, rootSize);
            int i2 = this.rootShift;
            if (i2 == 0) {
                Object[] objArr = this.root;
                Intrinsics.m17074g(objArr);
                return new SingleElementListIterator(objArr, i);
            }
            Object[] objArr2 = this.root;
            Intrinsics.m17074g(objArr2);
            return new TrieIterator(objArr2, i, rootSize, i2 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final Object[] makeMutable(Object[] objArr) {
        int m16912j;
        Object[] m17389p;
        if (objArr == null) {
            return mutableBuffer();
        }
        if (isMutable(objArr)) {
            return objArr;
        }
        Object[] mutableBuffer = mutableBuffer();
        m16912j = _Ranges.m16912j(objArr.length, 32);
        m17389p = _ArraysJvm.m17389p(objArr, mutableBuffer, 0, 0, m16912j, 6, null);
        return m17389p;
    }

    private final Object[] makeMutableShiftingRight(Object[] objArr, int i) {
        Object[] m17393l;
        Object[] m17393l2;
        if (isMutable(objArr)) {
            m17393l2 = _ArraysJvm.m17393l(objArr, objArr, i, 0, 32 - i);
            return m17393l2;
        }
        m17393l = _ArraysJvm.m17393l(objArr, mutableBuffer(), i, 0, 32 - i);
        return m17393l;
    }

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] mutableBufferWith(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] nullifyAfter(Object[] objArr, int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 == 0) {
                return objArr;
            }
            int indexSegment = UtilsKt.indexSegment(i, i2);
            Object obj = objArr[indexSegment];
            if (obj != null) {
                Object nullifyAfter = nullifyAfter((Object[]) obj, i, i2 - 5);
                if (indexSegment < 31) {
                    int i3 = indexSegment + 1;
                    if (objArr[i3] != null) {
                        if (isMutable(objArr)) {
                            _ArraysJvm.m17383v(objArr, null, i3, 32);
                        }
                        objArr = _ArraysJvm.m17393l(objArr, mutableBuffer(), 0, 0, i3);
                    }
                }
                if (nullifyAfter != objArr[indexSegment]) {
                    Object[] makeMutable = makeMutable(objArr);
                    makeMutable[indexSegment] = nullifyAfter;
                    return makeMutable;
                }
                return objArr;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i, int i2, Utils utils) {
        Object[] pullLastBuffer;
        int indexSegment = UtilsKt.indexSegment(i2 - 1, i);
        if (i == 5) {
            utils.setValue(objArr[indexSegment]);
            pullLastBuffer = null;
        } else {
            Object obj = objArr[indexSegment];
            if (obj != null) {
                pullLastBuffer = pullLastBuffer((Object[]) obj, i - 5, i2, utils);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
        }
        if (pullLastBuffer == null && indexSegment == 0) {
            return null;
        }
        Object[] makeMutable = makeMutable(objArr);
        makeMutable[indexSegment] = pullLastBuffer;
        return makeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.root = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.tail = objArr;
            this.size = i;
            this.rootShift = i2;
            return;
        }
        Utils utils = new Utils(null);
        Intrinsics.m17074g(objArr);
        Object[] pullLastBuffer = pullLastBuffer(objArr, i2, i, utils);
        Intrinsics.m17074g(pullLastBuffer);
        Object value = utils.getValue();
        if (value != null) {
            this.tail = (Object[]) value;
            this.size = i;
            if (pullLastBuffer[1] == null) {
                this.root = (Object[]) pullLastBuffer[0];
                this.rootShift = i2 - 5;
                return;
            }
            this.root = pullLastBuffer;
            this.rootShift = i2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    private final Object[] pushBuffers(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        boolean z;
        if (it.hasNext()) {
            if (i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i2 == 0) {
                    return it.next();
                }
                Object[] makeMutable = makeMutable(objArr);
                int indexSegment = UtilsKt.indexSegment(i, i2);
                int i3 = i2 - 5;
                makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], i, i3, it);
                while (true) {
                    indexSegment++;
                    if (indexSegment >= 32 || !it.hasNext()) {
                        break;
                    }
                    makeMutable[indexSegment] = pushBuffers((Object[]) makeMutable[indexSegment], 0, i3, it);
                }
                return makeMutable;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] objArr, int i, Object[][] objArr2) {
        Object[] makeMutable;
        Iterator<Object[]> m17055a = C37598c.m17055a(objArr2);
        int i2 = i >> 5;
        int i3 = this.rootShift;
        if (i2 < (1 << i3)) {
            makeMutable = pushBuffers(objArr, i, i3, m17055a);
        } else {
            makeMutable = makeMutable(objArr);
        }
        while (m17055a.hasNext()) {
            this.rootShift += 5;
            makeMutable = mutableBufferWith(makeMutable);
            int i4 = this.rootShift;
            pushBuffers(makeMutable, 1 << i4, i4, m17055a);
        }
        return makeMutable;
    }

    private final void pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.rootShift;
        if (size > (1 << i)) {
            this.root = pushTail(mutableBufferWith(objArr), objArr2, this.rootShift + 5);
            this.tail = objArr3;
            this.rootShift += 5;
            this.size = size() + 1;
        } else if (objArr == null) {
            this.root = objArr2;
            this.tail = objArr3;
            this.size = size() + 1;
        } else {
            this.root = pushTail(objArr, objArr2, i);
            this.tail = objArr3;
            this.size = size() + 1;
        }
    }

    private final Object[] pushTail(Object[] objArr, Object[] objArr2, int i) {
        int indexSegment = UtilsKt.indexSegment(size() - 1, i);
        Object[] makeMutable = makeMutable(objArr);
        if (i == 5) {
            makeMutable[indexSegment] = objArr2;
        } else {
            makeMutable[indexSegment] = pushTail((Object[]) makeMutable[indexSegment], objArr2, i - 5);
        }
        return makeMutable;
    }

    private final int recyclableRemoveAll(Function1<? super E, Boolean> function1, Object[] objArr, int i, int i2, Utils utils, List<Object[]> list, List<Object[]> list2) {
        Object[] mutableBuffer;
        if (isMutable(objArr)) {
            list.add(objArr);
        }
        Object value = utils.getValue();
        if (value != null) {
            Object[] objArr2 = (Object[]) value;
            Object[] objArr3 = objArr2;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (!function1.invoke(obj).booleanValue()) {
                    if (i2 == 32) {
                        if (!list.isEmpty()) {
                            mutableBuffer = list.remove(list.size() - 1);
                        } else {
                            mutableBuffer = mutableBuffer();
                        }
                        objArr3 = mutableBuffer;
                        i2 = 0;
                    }
                    objArr3[i2] = obj;
                    i2++;
                }
            }
            utils.setValue(objArr3);
            if (objArr2 != utils.getValue()) {
                list2.add(objArr2);
            }
            return i2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    private final int removeAllFromTail(Function1<? super E, Boolean> function1, int i, Utils utils) {
        boolean z;
        int removeAll = removeAll(function1, this.tail, i, utils);
        if (removeAll == i) {
            if (utils.getValue() == this.tail) {
                z = true;
            } else {
                z = false;
            }
            commonFunctions.m107194assert(z);
            return i;
        }
        Object value = utils.getValue();
        if (value != null) {
            Object[] objArr = (Object[]) value;
            _ArraysJvm.m17383v(objArr, null, removeAll, i);
            this.tail = objArr;
            this.size = size() - (i - removeAll);
            return removeAll;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i, int i2, Utils utils) {
        Object[] m17393l;
        int indexSegment = UtilsKt.indexSegment(i2, i);
        int i3 = 31;
        if (i == 0) {
            Object obj = objArr[indexSegment];
            m17393l = _ArraysJvm.m17393l(objArr, makeMutable(objArr), indexSegment, indexSegment + 1, 32);
            m17393l[31] = utils.getValue();
            utils.setValue(obj);
            return m17393l;
        }
        if (objArr[31] == null) {
            i3 = UtilsKt.indexSegment(rootSize() - 1, i);
        }
        Object[] makeMutable = makeMutable(objArr);
        int i4 = i - 5;
        int i5 = indexSegment + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj2 = makeMutable[i3];
                if (obj2 != null) {
                    makeMutable[i3] = removeFromRootAt((Object[]) obj2, i4, 0, utils);
                    if (i3 == i5) {
                        break;
                    }
                    i3--;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        Object obj3 = makeMutable[indexSegment];
        if (obj3 != null) {
            makeMutable[indexSegment] = removeFromRootAt((Object[]) obj3, i4, i2, utils);
            return makeMutable;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    private final Object removeFromTailAt(Object[] objArr, int i, int i2, int i3) {
        boolean z;
        Object[] m17393l;
        int size = size() - i;
        if (i3 < size) {
            z = true;
        } else {
            z = false;
        }
        commonFunctions.m107194assert(z);
        if (size == 1) {
            Object obj = this.tail[0];
            pullLastBufferFromRoot(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.tail;
        Object obj2 = objArr2[i3];
        m17393l = _ArraysJvm.m17393l(objArr2, makeMutable(objArr2), i3, i3 + 1, size);
        m17393l[size - 1] = null;
        this.root = objArr;
        this.tail = m17393l;
        this.size = (i + size) - 1;
        this.rootShift = i2;
        return obj2;
    }

    private final Object[] retainFirst(Object[] objArr, int i) {
        boolean z;
        if ((i & 31) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                this.rootShift = 0;
                return null;
            }
            int i2 = i - 1;
            while (true) {
                int i3 = this.rootShift;
                if ((i2 >> i3) == 0) {
                    this.rootShift = i3 - 5;
                    Object[] objArr2 = objArr[0];
                    if (objArr2 != null) {
                        objArr = objArr2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    }
                } else {
                    return nullifyAfter(objArr, i2, i3);
                }
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i, int i2, E e, Utils utils) {
        int indexSegment = UtilsKt.indexSegment(i2, i);
        Object[] makeMutable = makeMutable(objArr);
        if (i == 0) {
            if (makeMutable != objArr) {
                ((AbstractList) this).modCount++;
            }
            utils.setValue(makeMutable[indexSegment]);
            makeMutable[indexSegment] = e;
            return makeMutable;
        }
        Object obj = makeMutable[indexSegment];
        if (obj != null) {
            makeMutable[indexSegment] = setInRoot((Object[]) obj, i - 5, i2, e, utils);
            return makeMutable;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    private final Object[] shiftLeafBuffers(int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.root != null) {
            ListIterator<Object[]> leafBufferIterator = leafBufferIterator(rootSize() >> 5);
            while (leafBufferIterator.previousIndex() != i) {
                Object[] previous = leafBufferIterator.previous();
                _ArraysJvm.m17393l(previous, objArr2, 0, 32 - i2, 32);
                objArr2 = makeMutableShiftingRight(previous, i2);
                i3--;
                objArr[i3] = objArr2;
            }
            return leafBufferIterator.previous();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final void splitToBuffers(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        boolean z;
        Object[] mutableBuffer;
        if (i3 >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] makeMutable = makeMutable(objArr);
            objArr2[0] = makeMutable;
            int i4 = i & 31;
            int size = ((i + collection.size()) - 1) & 31;
            int i5 = (i2 - i4) + size;
            if (i5 < 32) {
                _ArraysJvm.m17393l(makeMutable, objArr3, size + 1, i4, i2);
            } else {
                int i6 = (i5 - 32) + 1;
                if (i3 == 1) {
                    mutableBuffer = makeMutable;
                } else {
                    mutableBuffer = mutableBuffer();
                    i3--;
                    objArr2[i3] = mutableBuffer;
                }
                int i7 = i2 - i6;
                _ArraysJvm.m17393l(makeMutable, objArr3, 0, i7, i2);
                _ArraysJvm.m17393l(makeMutable, mutableBuffer, size + 1, i4, i7);
                objArr3 = mutableBuffer;
            }
            Iterator<? extends E> it = collection.iterator();
            copyToBuffer(makeMutable, i4, it);
            for (int i8 = 1; i8 < i3; i8++) {
                objArr2[i8] = copyToBuffer(mutableBuffer(), 0, it);
            }
            copyToBuffer(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final int tailSize(int i) {
        return i <= 32 ? i : i - UtilsKt.rootSize(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        if (tailSize < 32) {
            Object[] makeMutable = makeMutable(this.tail);
            makeMutable[tailSize] = e;
            this.tail = makeMutable;
            this.size = size() + 1;
        } else {
            pushFilledTail(this.root, this.tail, mutableBufferWith(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int tailSize = tailSize();
        Iterator<? extends E> it = elements.iterator();
        if (32 - tailSize >= elements.size()) {
            this.tail = copyToBuffer(makeMutable(this.tail), tailSize, it);
            this.size = size() + elements.size();
        } else {
            int size = ((elements.size() + tailSize) - 1) / 32;
            Object[][] objArr = new Object[size];
            objArr[0] = copyToBuffer(makeMutable(this.tail), tailSize, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = copyToBuffer(mutableBuffer(), 0, it);
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), objArr);
            this.tail = copyToBuffer(mutableBuffer(), 0, it);
            this.size = size() + elements.size();
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        return (E) bufferFor(i)[i & 31];
    }

    public final int getModCount$runtime_release() {
        return ((AbstractList) this).modCount;
    }

    @Nullable
    public final Object[] getRoot$runtime_release() {
        return this.root;
    }

    public final int getRootShift$runtime_release() {
        return this.rootShift;
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    @NotNull
    public final Object[] getTail$runtime_release() {
        return this.tail;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return removeAllWithPredicate(new PersistentVectorBuilder$removeAll$1(elements));
    }

    public final boolean removeAllWithPredicate(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean removeAll = removeAll(predicate);
        if (removeAll) {
            ((AbstractList) this).modCount++;
        }
        return removeAll;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (i >= rootSize) {
            return (E) removeFromTailAt(this.root, rootSize, this.rootShift, i - rootSize);
        }
        Utils utils = new Utils(this.tail[0]);
        Object[] objArr = this.root;
        Intrinsics.m17074g(objArr);
        removeFromTailAt(removeFromRootAt(objArr, this.rootShift, i, utils), rootSize, this.rootShift, 0);
        return (E) utils.getValue();
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        if (rootSize() <= i) {
            Object[] makeMutable = makeMutable(this.tail);
            if (makeMutable != this.tail) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            E e2 = (E) makeMutable[i2];
            makeMutable[i2] = e;
            this.tail = makeMutable;
            return e2;
        }
        Utils utils = new Utils(null);
        Object[] objArr = this.root;
        Intrinsics.m17074g(objArr);
        this.root = setInRoot(objArr, this.rootShift, i, e, utils);
        return (E) utils.getValue();
    }

    public final void setRootShift$runtime_release(int i) {
        this.rootShift = i;
    }

    private final boolean removeAll(Function1<? super E, Boolean> function1) {
        Object[] pushBuffers;
        int tailSize = tailSize();
        Utils utils = new Utils(null);
        if (this.root == null) {
            return removeAllFromTail(function1, tailSize, utils) != tailSize;
        }
        ListIterator<Object[]> leafBufferIterator = leafBufferIterator(0);
        int i = 32;
        while (i == 32 && leafBufferIterator.hasNext()) {
            i = removeAll(function1, leafBufferIterator.next(), 32, utils);
        }
        if (i == 32) {
            commonFunctions.m107194assert(!leafBufferIterator.hasNext());
            int removeAllFromTail = removeAllFromTail(function1, tailSize, utils);
            if (removeAllFromTail == 0) {
                pullLastBufferFromRoot(this.root, size(), this.rootShift);
            }
            return removeAllFromTail != tailSize;
        }
        int previousIndex = leafBufferIterator.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = i;
        while (leafBufferIterator.hasNext()) {
            i2 = recyclableRemoveAll(function1, leafBufferIterator.next(), 32, i2, utils, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i3 = previousIndex;
        int recyclableRemoveAll = recyclableRemoveAll(function1, this.tail, tailSize, i2, utils, arrayList2, arrayList);
        Object value = utils.getValue();
        if (value != null) {
            Object[] objArr = (Object[]) value;
            _ArraysJvm.m17383v(objArr, null, recyclableRemoveAll, 32);
            if (arrayList.isEmpty()) {
                pushBuffers = this.root;
                Intrinsics.m17074g(pushBuffers);
            } else {
                pushBuffers = pushBuffers(this.root, i3, this.rootShift, arrayList.iterator());
            }
            int size = i3 + (arrayList.size() << 5);
            this.root = retainFirst(pushBuffers, size);
            this.tail = objArr;
            this.size = size + recyclableRemoveAll;
            return true;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    private final int tailSize() {
        return tailSize(size());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    @NotNull
    public PersistentList<E> build() {
        PersistentVector persistentVector;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            persistentVector = this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    persistentVector = UtilsKt.persistentVectorOf();
                } else {
                    Object[] copyOf = Arrays.copyOf(this.tail, size());
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                    persistentVector = new SmallPersistentVector(copyOf);
                }
            } else {
                Object[] objArr3 = this.root;
                Intrinsics.m17074g(objArr3);
                persistentVector = new PersistentVector(objArr3, this.tail, size(), this.rootShift);
            }
        }
        this.vector = persistentVector;
        return (PersistentList<E>) persistentVector;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        return new PersistentVectorMutableIterator(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int rootSize = rootSize();
        if (i >= rootSize) {
            insertIntoTail(this.root, i - rootSize, e);
            return;
        }
        Utils utils = new Utils(null);
        Object[] objArr = this.root;
        Intrinsics.m17074g(objArr);
        insertIntoTail(insertIntoRoot(objArr, this.rootShift, i, e, utils), 0, utils.getValue());
    }

    private final void insertIntoRoot(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.root != null) {
            int i4 = i >> 5;
            Object[] shiftLeafBuffers = shiftLeafBuffers(i4, i2, objArr, i3, objArr2);
            int rootSize = i3 - (((rootSize() >> 5) - 1) - i4);
            if (rootSize < i3) {
                objArr2 = objArr[rootSize];
                Intrinsics.m17074g(objArr2);
            }
            splitToBuffers(collection, i, shiftLeafBuffers, 32, objArr, rootSize, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> elements) {
        Object[] m17393l;
        Object[] m17393l2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((size() - i2) + elements.size()) - 1) / 32;
        if (size == 0) {
            commonFunctions.m107194assert(i >= rootSize());
            int i3 = i & 31;
            Object[] objArr = this.tail;
            m17393l2 = _ArraysJvm.m17393l(objArr, makeMutable(objArr), (((i + elements.size()) - 1) & 31) + 1, i3, tailSize());
            copyToBuffer(m17393l2, i3, elements.iterator());
            this.tail = m17393l2;
            this.size = size() + elements.size();
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int tailSize = tailSize();
        int tailSize2 = tailSize(size() + elements.size());
        if (i >= rootSize()) {
            m17393l = mutableBuffer();
            splitToBuffers(elements, i, this.tail, tailSize, objArr2, size, m17393l);
        } else if (tailSize2 <= tailSize) {
            int i4 = tailSize - tailSize2;
            m17393l = _ArraysJvm.m17393l(this.tail, mutableBuffer(), 0, i4, tailSize);
            int i5 = 32 - i4;
            Object[] makeMutableShiftingRight = makeMutableShiftingRight(this.tail, i5);
            int i6 = size - 1;
            objArr2[i6] = makeMutableShiftingRight;
            insertIntoRoot(elements, i, i5, objArr2, i6, makeMutableShiftingRight);
        } else {
            int i7 = tailSize2 - tailSize;
            m17393l = makeMutableShiftingRight(this.tail, i7);
            insertIntoRoot(elements, i, i7, objArr2, size, m17393l);
        }
        this.root = pushBuffersIncreasingHeightIfNeeded(this.root, i2, objArr2);
        this.tail = m17393l;
        this.size = size() + elements.size();
        return true;
    }

    private final int removeAll(Function1<? super E, Boolean> function1, Object[] objArr, int i, Utils utils) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (function1.invoke(obj).booleanValue()) {
                if (!z) {
                    objArr2 = makeMutable(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        utils.setValue(objArr2);
        return i2;
    }
}
