package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IndexedValue.kt */
@Metadata
/* loaded from: classes7.dex */
public final class IndexedValue<T> {

    /* renamed from: a */
    private final int f99210a;

    /* renamed from: b */
    private final T f99211b;

    public IndexedValue(int i, T t) {
        this.f99210a = i;
        this.f99211b = t;
    }

    /* renamed from: a */
    public final int m17627a() {
        return this.f99210a;
    }

    /* renamed from: b */
    public final T m17626b() {
        return this.f99211b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        if (this.f99210a == indexedValue.f99210a && Intrinsics.m17075f(this.f99211b, indexedValue.f99211b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f99210a) * 31;
        T t = this.f99211b;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        return "IndexedValue(index=" + this.f99210a + ", value=" + this.f99211b + ')';
    }
}
