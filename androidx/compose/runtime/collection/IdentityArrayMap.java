package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IdentityArrayMap.kt */
@Metadata
/* loaded from: classes.dex */
public final class IdentityArrayMap<Key, Value> {
    @NotNull
    private Object[] keys;
    private int size;
    @NotNull
    private Object[] values;

    public IdentityArrayMap() {
        this(0, 1, null);
    }

    private final int find(Object obj) {
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i = this.size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.keys[i3];
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

    public final boolean contains(@NotNull Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (find(key) >= 0) {
            return true;
        }
        return false;
    }

    public final void forEach(@NotNull Function2<? super Key, ? super Value, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size$runtime_release = getSize$runtime_release();
        for (int i = 0; i < size$runtime_release; i++) {
            Object obj = getKeys$runtime_release()[i];
            if (obj != null) {
                block.mo105910invoke(obj, getValues$runtime_release()[i]);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            }
        }
    }

    @Nullable
    public final Value get(@NotNull Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int find = find(key);
        if (find >= 0) {
            return (Value) this.values[find];
        }
        return null;
    }

    @NotNull
    public final Object[] getKeys$runtime_release() {
        return this.keys;
    }

    public final int getSize$runtime_release() {
        return this.size;
    }

    @NotNull
    public final Object[] getValues$runtime_release() {
        return this.values;
    }

    public final boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (this.size > 0) {
            return true;
        }
        return false;
    }

    public final boolean remove(@NotNull Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int find = find(key);
        if (find >= 0) {
            int i = this.size;
            Object[] objArr = this.keys;
            Object[] objArr2 = this.values;
            int i2 = find + 1;
            _ArraysJvm.m17393l(objArr, objArr, find, i2, i);
            _ArraysJvm.m17393l(objArr2, objArr2, find, i2, i);
            int i3 = i - 1;
            objArr[i3] = null;
            objArr2[i3] = null;
            this.size = i3;
            return true;
        }
        return false;
    }

    public final void removeValueIf(@NotNull Function1<? super Value, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size$runtime_release = getSize$runtime_release();
        int i = 0;
        for (int i2 = 0; i2 < size$runtime_release; i2++) {
            Object obj = getValues$runtime_release()[i2];
            if (!block.invoke(obj).booleanValue()) {
                if (i != i2) {
                    getKeys$runtime_release()[i] = getKeys$runtime_release()[i2];
                    getValues$runtime_release()[i] = obj;
                }
                i++;
            }
        }
        if (getSize$runtime_release() > i) {
            int size$runtime_release2 = getSize$runtime_release();
            for (int i3 = i; i3 < size$runtime_release2; i3++) {
                getKeys$runtime_release()[i3] = null;
                getValues$runtime_release()[i3] = null;
            }
            setSize$runtime_release(i);
        }
    }

    public final void set(@NotNull Key key, Value value) {
        boolean z;
        Object[] objArr;
        Object[] objArr2;
        Intrinsics.checkNotNullParameter(key, "key");
        int find = find(key);
        if (find >= 0) {
            this.values[find] = value;
            return;
        }
        int i = -(find + 1);
        int i2 = this.size;
        Object[] objArr3 = this.keys;
        if (i2 == objArr3.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            objArr = new Object[i2 * 2];
        } else {
            objArr = objArr3;
        }
        int i3 = i + 1;
        _ArraysJvm.m17393l(objArr3, objArr, i3, i, i2);
        if (z) {
            _ArraysJvm.m17389p(this.keys, objArr, 0, 0, i, 6, null);
        }
        objArr[i] = key;
        this.keys = objArr;
        if (z) {
            objArr2 = new Object[this.size * 2];
        } else {
            objArr2 = this.values;
        }
        _ArraysJvm.m17393l(this.values, objArr2, i3, i, this.size);
        if (z) {
            _ArraysJvm.m17389p(this.values, objArr2, 0, 0, i, 6, null);
        }
        objArr2[i] = value;
        this.values = objArr2;
        this.size++;
    }

    public final void setKeys$runtime_release(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.keys = objArr;
    }

    public final void setSize$runtime_release(int i) {
        this.size = i;
    }

    public final void setValues$runtime_release(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.values = objArr;
    }

    public IdentityArrayMap(int i) {
        this.keys = new Object[i];
        this.values = new Object[i];
    }

    public /* synthetic */ IdentityArrayMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
