package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: IdentityArrayIntMap.kt */
@Metadata
/* loaded from: classes.dex */
public final class IdentityArrayIntMap {
    private int size;
    @NotNull
    private Object[] keys = new Object[4];
    @NotNull
    private int[] values = new int[4];

    private final int find(Object obj) {
        int i = this.size - 1;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.keys[i3];
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i2 = i3 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i = i3 - 1;
            } else if (obj2 == obj) {
                return i3;
            } else {
                return findExactIndex(i3, obj, identityHashCode);
            }
        }
        return -(i2 + 1);
    }

    private final int findExactIndex(int i, Object obj, int i2) {
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = this.keys[i3];
            if (obj2 == obj) {
                return i3;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int i5 = this.size;
        while (true) {
            if (i4 < i5) {
                Object obj3 = this.keys[i4];
                if (obj3 == obj) {
                    return i4;
                }
                if (ActualJvm_jvmKt.identityHashCode(obj3) != i2) {
                    break;
                }
                i4++;
            } else {
                i4 = this.size;
                break;
            }
        }
        return -(i4 + 1);
    }

    public final void add(@NotNull Object key, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.size > 0) {
            i2 = find(key);
            if (i2 >= 0) {
                this.values[i2] = i;
                return;
            }
        } else {
            i2 = -1;
        }
        int i3 = -(i2 + 1);
        int i4 = this.size;
        Object[] objArr = this.keys;
        if (i4 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr = new int[objArr.length * 2];
            int i5 = i3 + 1;
            _ArraysJvm.m17393l(objArr, objArr2, i5, i3, i4);
            _ArraysJvm.m17395j(this.values, iArr, i5, i3, this.size);
            _ArraysJvm.m17389p(this.keys, objArr2, 0, 0, i3, 6, null);
            _ArraysJvm.m17390o(this.values, iArr, 0, 0, i3, 6, null);
            this.keys = objArr2;
            this.values = iArr;
        } else {
            int i6 = i3 + 1;
            _ArraysJvm.m17393l(objArr, objArr, i6, i3, i4);
            int[] iArr2 = this.values;
            _ArraysJvm.m17395j(iArr2, iArr2, i6, i3, this.size);
        }
        this.keys[i3] = key;
        this.values[i3] = i;
        this.size++;
    }

    public final boolean any(@NotNull Function2<Object, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        for (int i = 0; i < size; i++) {
            Object obj = getKeys()[i];
            if (obj != null) {
                if (predicate.mo105910invoke(obj, Integer.valueOf(getValues()[i])).booleanValue()) {
                    return true;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
        }
        return false;
    }

    public final void forEach(@NotNull Function2<Object, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        for (int i = 0; i < size; i++) {
            Object obj = getKeys()[i];
            if (obj != null) {
                block.mo105910invoke(obj, Integer.valueOf(getValues()[i]));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
        }
    }

    public final int get(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int find = find(key);
        if (find >= 0) {
            return this.values[find];
        }
        throw new IllegalStateException("Key not found".toString());
    }

    @NotNull
    public final Object[] getKeys() {
        return this.keys;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final int[] getValues() {
        return this.values;
    }

    public final boolean remove(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int find = find(key);
        if (find >= 0) {
            int i = this.size;
            if (find < i - 1) {
                Object[] objArr = this.keys;
                int i2 = find + 1;
                _ArraysJvm.m17393l(objArr, objArr, find, i2, i);
                int[] iArr = this.values;
                _ArraysJvm.m17395j(iArr, iArr, find, i2, this.size);
            }
            int i3 = this.size - 1;
            this.size = i3;
            this.keys[i3] = null;
            return true;
        }
        return false;
    }

    public final void removeValueIf(@NotNull Function2<Object, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = getKeys()[i2];
            if (obj != null) {
                int i3 = getValues()[i2];
                if (!predicate.mo105910invoke(obj, Integer.valueOf(i3)).booleanValue()) {
                    if (i != i2) {
                        getKeys()[i] = obj;
                        getValues()[i] = i3;
                    }
                    i++;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
        }
        int size2 = getSize();
        for (int i4 = i; i4 < size2; i4++) {
            getKeys()[i4] = null;
        }
        setSize(i);
    }

    public final void setKeys(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.keys = objArr;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void setValues(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.values = iArr;
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }
}
