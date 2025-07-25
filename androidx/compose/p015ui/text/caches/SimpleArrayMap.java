package androidx.compose.p015ui.text.caches;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C20517nb;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SimpleArrayMap.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.caches.SimpleArrayMap */
/* loaded from: classes.dex */
public final class SimpleArrayMap<K, V> {
    private int _size;
    @NotNull
    private int[] hashes;
    @NotNull
    private Object[] keyValues;

    public SimpleArrayMap() {
        this(0, 1, null);
    }

    public final void clear() {
        if (this._size > 0) {
            this.hashes = ContainerHelpers.EMPTY_INTS;
            this.keyValues = ContainerHelpers.EMPTY_OBJECTS;
            this._size = 0;
        }
        if (this._size <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean containsKey(K k) {
        if (indexOfKey(k) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(V v) {
        if (indexOfValue$ui_text_release(v) >= 0) {
            return true;
        }
        return false;
    }

    public final void ensureCapacity(int i) {
        int i2 = this._size;
        int[] iArr = this.hashes;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.keyValues, i << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.keyValues = copyOf2;
        }
        if (this._size == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i = this._size;
                if (i != simpleArrayMap._size) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    K keyAt = keyAt(i2);
                    V valueAt = valueAt(i2);
                    Object obj2 = simpleArrayMap.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!Intrinsics.m17075f(valueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this._size != ((Map) obj).size()) {
                return false;
            } else {
                int i3 = this._size;
                for (int i4 = 0; i4 < i3; i4++) {
                    K keyAt2 = keyAt(i4);
                    V valueAt2 = valueAt(i4);
                    Object obj3 = ((Map) obj).get(keyAt2);
                    if (valueAt2 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(keyAt2)) {
                            return false;
                        }
                    } else if (!Intrinsics.m17075f(valueAt2, obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @Nullable
    public final V get(K k) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return (V) this.keyValues[(indexOfKey << 1) + 1];
        }
        return null;
    }

    public final V getOrDefault(K k, V v) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return (V) this.keyValues[(indexOfKey << 1) + 1];
        }
        return v;
    }

    protected final int get_size() {
        return this._size;
    }

    public int hashCode() {
        int i;
        int[] iArr = this.hashes;
        Object[] objArr = this.keyValues;
        int i2 = this._size;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    protected final int indexOf(@NotNull Object key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i2 = this._size;
        if (i2 == 0) {
            return -1;
        }
        int binarySearchInternal = ContainerHelpers.binarySearchInternal(this.hashes, i2, i);
        if (binarySearchInternal < 0) {
            return binarySearchInternal;
        }
        if (Intrinsics.m17075f(key, this.keyValues[binarySearchInternal << 1])) {
            return binarySearchInternal;
        }
        int i3 = binarySearchInternal + 1;
        while (i3 < i2 && this.hashes[i3] == i) {
            if (Intrinsics.m17075f(key, this.keyValues[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = binarySearchInternal - 1; i4 >= 0 && this.hashes[i4] == i; i4--) {
            if (Intrinsics.m17075f(key, this.keyValues[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int indexOfKey(@Nullable Object obj) {
        if (obj == null) {
            return indexOfNull();
        }
        return indexOf(obj, obj.hashCode());
    }

    protected final int indexOfNull() {
        int i = this._size;
        if (i == 0) {
            return -1;
        }
        int binarySearchInternal = ContainerHelpers.binarySearchInternal(this.hashes, i, 0);
        if (binarySearchInternal < 0) {
            return binarySearchInternal;
        }
        if (this.keyValues[binarySearchInternal << 1] == null) {
            return binarySearchInternal;
        }
        int i2 = binarySearchInternal + 1;
        while (i2 < i && this.hashes[i2] == 0) {
            if (this.keyValues[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = binarySearchInternal - 1; i3 >= 0 && this.hashes[i3] == 0; i3--) {
            if (this.keyValues[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int indexOfValue$ui_text_release(V v) {
        int i = this._size << 1;
        Object[] objArr = this.keyValues;
        if (v == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (Intrinsics.m17075f(v, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (this._size <= 0) {
            return true;
        }
        return false;
    }

    public final K keyAt(int i) {
        return (K) this.keyValues[i << 1];
    }

    @Nullable
    public final V put(K k, V v) {
        int hashCode;
        int indexOf;
        int i = this._size;
        if (k == null) {
            indexOf = indexOfNull();
            hashCode = 0;
        } else {
            hashCode = k.hashCode();
            indexOf = indexOf(k, hashCode);
        }
        if (indexOf >= 0) {
            int i2 = (indexOf << 1) + 1;
            Object[] objArr = this.keyValues;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~indexOf;
        int[] iArr = this.hashes;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.keyValues, i4 << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.keyValues = copyOf2;
            if (i != this._size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.hashes;
            int i5 = i3 + 1;
            _ArraysJvm.m17395j(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.keyValues;
            _ArraysJvm.m17393l(objArr2, objArr2, i5 << 1, i3 << 1, this._size << 1);
        }
        int i6 = this._size;
        if (i == i6) {
            int[] iArr3 = this.hashes;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.keyValues;
                int i7 = i3 << 1;
                objArr3[i7] = k;
                objArr3[i7 + 1] = v;
                this._size = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void putAll(@NotNull SimpleArrayMap<? extends K, ? extends V> array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i = array._size;
        ensureCapacity(this._size + i);
        if (this._size == 0) {
            if (i > 0) {
                _ArraysJvm.m17395j(array.hashes, this.hashes, 0, 0, i);
                _ArraysJvm.m17393l(array.keyValues, this.keyValues, 0, 0, i << 1);
                this._size = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            put(array.keyAt(i2), array.valueAt(i2));
        }
    }

    @Nullable
    public final V putIfAbsent(K k, V v) {
        V v2 = get(k);
        if (v2 == null) {
            return put(k, v);
        }
        return v2;
    }

    @Nullable
    public final V remove(K k) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    @Nullable
    public final V removeAt(int i) {
        Object[] objArr = this.keyValues;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this._size;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.hashes;
            int i5 = 8;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                if (i3 > 8) {
                    i5 = i3 + (i3 >> 1);
                }
                int[] iArr2 = new int[i5];
                this.hashes = iArr2;
                this.keyValues = new Object[i5 << 1];
                if (i > 0) {
                    _ArraysJvm.m17395j(iArr, iArr2, 0, 0, i);
                    _ArraysJvm.m17393l(objArr, this.keyValues, 0, 0, i2);
                }
                if (i < i4) {
                    int i6 = i + 1;
                    int i7 = i4 + 1;
                    _ArraysJvm.m17395j(iArr, this.hashes, i, i6, i7);
                    _ArraysJvm.m17393l(objArr, this.keyValues, i2, i6 << 1, i7 << 1);
                }
            } else {
                if (i < i4) {
                    int i8 = i + 1;
                    int i9 = i4 + 1;
                    _ArraysJvm.m17395j(iArr, iArr, i, i8, i9);
                    Object[] objArr2 = this.keyValues;
                    _ArraysJvm.m17393l(objArr2, objArr2, i2, i8 << 1, i9 << 1);
                }
                Object[] objArr3 = this.keyValues;
                int i10 = i4 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            }
            if (i3 == this._size) {
                this._size = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v;
    }

    @Nullable
    public final V replace(K k, V v) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v);
        }
        return null;
    }

    public final V setValueAt(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.keyValues;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    protected final void set_size(int i) {
        this._size = i;
    }

    public final int size() {
        return this._size;
    }

    @NotNull
    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this._size * 28);
        sb2.append('{');
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb2.append(", ");
            }
            K keyAt = keyAt(i2);
            if (keyAt != this) {
                sb2.append(keyAt);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append(C20517nb.f52173T);
            V valueAt = valueAt(i2);
            if (valueAt != this) {
                sb2.append(valueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "buffer.toString()");
        return sb3;
    }

    public final V valueAt(int i) {
        return (V) this.keyValues[(i << 1) + 1];
    }

    public SimpleArrayMap(int i) {
        if (i == 0) {
            this.hashes = ContainerHelpers.EMPTY_INTS;
            this.keyValues = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            this.hashes = new int[i];
            this.keyValues = new Object[i << 1];
        }
        this._size = 0;
    }

    public final boolean remove(K k, V v) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey < 0 || !Intrinsics.m17075f(v, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int indexOfKey = indexOfKey(k);
        if (indexOfKey < 0 || valueAt(indexOfKey) != v) {
            return false;
        }
        setValueAt(indexOfKey, v2);
        return true;
    }

    public /* synthetic */ SimpleArrayMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(@Nullable SimpleArrayMap<K, V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != 0) {
            putAll(simpleArrayMap);
        }
    }

    public static /* synthetic */ void size$annotations() {
    }
}
