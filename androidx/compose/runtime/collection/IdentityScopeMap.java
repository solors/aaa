package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: IdentityScopeMap.kt */
@Metadata
/* loaded from: classes.dex */
public final class IdentityScopeMap<T> {
    @NotNull
    private IdentityArraySet<T>[] scopeSets;
    private int size;
    @NotNull
    private int[] valueOrder;
    @NotNull
    private Object[] values;

    public IdentityScopeMap() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.valueOrder = iArr;
        this.values = new Object[50];
        this.scopeSets = new IdentityArraySet[50];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int find(Object obj) {
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i = this.size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.values[this.valueOrder[i3]];
            Intrinsics.m17074g(obj2);
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i2 = i3 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                return findExactIndex(i3, obj, identityHashCode);
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        return -(r4 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int findExactIndex(int r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = -1
            if (r1 >= r0) goto L1d
            java.lang.Object[] r1 = r3.values
            int[] r2 = r3.valueOrder
            r2 = r2[r0]
            r1 = r1[r2]
            kotlin.jvm.internal.Intrinsics.m17074g(r1)
            if (r1 != r5) goto L13
            return r0
        L13:
            int r1 = androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(r1)
            if (r1 == r6) goto L1a
            goto L1d
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.size
        L21:
            if (r4 >= r0) goto L3e
            java.lang.Object[] r1 = r3.values
            int[] r2 = r3.valueOrder
            r2 = r2[r4]
            r1 = r1[r2]
            kotlin.jvm.internal.Intrinsics.m17074g(r1)
            if (r1 != r5) goto L31
            return r4
        L31:
            int r1 = androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(r1)
            if (r1 == r6) goto L3b
        L37:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L3b:
            int r4 = r4 + 1
            goto L21
        L3e:
            int r4 = r3.size
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.IdentityScopeMap.findExactIndex(int, java.lang.Object, int):int");
    }

    private final IdentityArraySet<T> getOrCreateIdentitySet(Object obj) {
        int i;
        if (this.size > 0) {
            i = find(obj);
            if (i >= 0) {
                return scopeSetAt(i);
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int i3 = this.size;
        int[] iArr = this.valueOrder;
        if (i3 < iArr.length) {
            int i4 = iArr[i3];
            this.values[i4] = obj;
            IdentityArraySet<T> identityArraySet = this.scopeSets[i4];
            if (identityArraySet == null) {
                identityArraySet = new IdentityArraySet<>();
                this.scopeSets[i4] = identityArraySet;
            }
            int i5 = this.size;
            if (i2 < i5) {
                int[] iArr2 = this.valueOrder;
                _ArraysJvm.m17395j(iArr2, iArr2, i2 + 1, i2, i5);
            }
            this.valueOrder[i2] = i4;
            this.size++;
            return identityArraySet;
        }
        int length = iArr.length * 2;
        Object[] copyOf = Arrays.copyOf(this.scopeSets, length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        this.scopeSets = (IdentityArraySet[]) copyOf;
        IdentityArraySet<T> identityArraySet2 = new IdentityArraySet<>();
        this.scopeSets[i3] = identityArraySet2;
        Object[] copyOf2 = Arrays.copyOf(this.values, length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        this.values = copyOf2;
        copyOf2[i3] = obj;
        int[] iArr3 = new int[length];
        int i6 = this.size;
        while (true) {
            i6++;
            if (i6 >= length) {
                break;
            }
            iArr3[i6] = i6;
        }
        int i7 = this.size;
        if (i2 < i7) {
            _ArraysJvm.m17395j(this.valueOrder, iArr3, i2 + 1, i2, i7);
        }
        iArr3[i2] = i3;
        if (i2 > 0) {
            _ArraysJvm.m17390o(this.valueOrder, iArr3, 0, 0, i2, 6, null);
        }
        this.valueOrder = iArr3;
        this.size++;
        return identityArraySet2;
    }

    private final void removingScopes(Function1<? super IdentityArraySet<T>, Unit> function1) {
        int size = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = getValueOrder()[i2];
            IdentityArraySet<T> identityArraySet = getScopeSets()[i3];
            Intrinsics.m17074g(identityArraySet);
            function1.invoke(identityArraySet);
            if (identityArraySet.size() > 0) {
                if (i != i2) {
                    int i4 = getValueOrder()[i];
                    getValueOrder()[i] = i3;
                    getValueOrder()[i2] = i4;
                }
                i++;
            }
        }
        int size2 = getSize();
        for (int i5 = i; i5 < size2; i5++) {
            getValues()[getValueOrder()[i5]] = null;
        }
        setSize(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentityArraySet<T> scopeSetAt(int i) {
        IdentityArraySet<T> identityArraySet = this.scopeSets[this.valueOrder[i]];
        Intrinsics.m17074g(identityArraySet);
        return identityArraySet;
    }

    private final Object valueAt(int i) {
        Object obj = this.values[this.valueOrder[i]];
        Intrinsics.m17074g(obj);
        return obj;
    }

    public final boolean add(@NotNull Object value, @NotNull T scope) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return getOrCreateIdentitySet(value).add(scope);
    }

    public final void clear() {
        int length = this.scopeSets.length;
        for (int i = 0; i < length; i++) {
            IdentityArraySet<T> identityArraySet = this.scopeSets[i];
            if (identityArraySet != null) {
                identityArraySet.clear();
            }
            this.valueOrder[i] = i;
            this.values[i] = null;
        }
        this.size = 0;
    }

    public final boolean contains(@NotNull Object element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (find(element) >= 0) {
            return true;
        }
        return false;
    }

    public final void forEachScopeOf(@NotNull Object value, @NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(block, "block");
        int find = find(value);
        if (find >= 0) {
            for (Object obj : scopeSetAt(find)) {
                block.invoke(obj);
            }
        }
    }

    @NotNull
    public final IdentityArraySet<T>[] getScopeSets() {
        return this.scopeSets;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final int[] getValueOrder() {
        return this.valueOrder;
    }

    @NotNull
    public final Object[] getValues() {
        return this.values;
    }

    public final boolean remove(@NotNull Object value, @NotNull T scope) {
        int i;
        IdentityArraySet<T> identityArraySet;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(scope, "scope");
        int find = find(value);
        if (find < 0 || (identityArraySet = this.scopeSets[(i = this.valueOrder[find])]) == null) {
            return false;
        }
        boolean remove = identityArraySet.remove(scope);
        if (identityArraySet.size() == 0) {
            int i2 = find + 1;
            int i3 = this.size;
            if (i2 < i3) {
                int[] iArr = this.valueOrder;
                _ArraysJvm.m17395j(iArr, iArr, find, i2, i3);
            }
            int[] iArr2 = this.valueOrder;
            int i4 = this.size;
            iArr2[i4 - 1] = i;
            this.values[i] = null;
            this.size = i4 - 1;
        }
        return remove;
    }

    public final void removeScope(@NotNull T scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        int size = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = getValueOrder()[i2];
            IdentityArraySet<T> identityArraySet = getScopeSets()[i3];
            Intrinsics.m17074g(identityArraySet);
            identityArraySet.remove(scope);
            if (identityArraySet.size() > 0) {
                if (i != i2) {
                    int i4 = getValueOrder()[i];
                    getValueOrder()[i] = i3;
                    getValueOrder()[i2] = i4;
                }
                i++;
            }
        }
        int size2 = getSize();
        for (int i5 = i; i5 < size2; i5++) {
            getValues()[getValueOrder()[i5]] = null;
        }
        setSize(i);
    }

    public final void removeValueIf(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = getValueOrder()[i2];
            IdentityArraySet<T> identityArraySet = getScopeSets()[i3];
            Intrinsics.m17074g(identityArraySet);
            int size2 = identityArraySet.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size2; i5++) {
                Object obj = identityArraySet.getValues()[i5];
                if (obj != null) {
                    if (!predicate.invoke(obj).booleanValue()) {
                        if (i4 != i5) {
                            identityArraySet.getValues()[i4] = obj;
                        }
                        i4++;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                }
            }
            int size3 = identityArraySet.size();
            for (int i6 = i4; i6 < size3; i6++) {
                identityArraySet.getValues()[i6] = null;
            }
            identityArraySet.setSize(i4);
            if (identityArraySet.size() > 0) {
                if (i != i2) {
                    int i7 = getValueOrder()[i];
                    getValueOrder()[i] = i3;
                    getValueOrder()[i2] = i7;
                }
                i++;
            }
        }
        int size4 = getSize();
        for (int i8 = i; i8 < size4; i8++) {
            getValues()[getValueOrder()[i8]] = null;
        }
        setSize(i);
    }

    public final void setScopeSets(@NotNull IdentityArraySet<T>[] identityArraySetArr) {
        Intrinsics.checkNotNullParameter(identityArraySetArr, "<set-?>");
        this.scopeSets = identityArraySetArr;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void setValueOrder(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.valueOrder = iArr;
    }

    public final void setValues(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.values = objArr;
    }

    public static /* synthetic */ void getScopeSets$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getValueOrder$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }
}
