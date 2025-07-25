package td;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EnumEntries.kt */
@Metadata
/* renamed from: td.c */
/* loaded from: classes7.dex */
public final class C44402c<T extends Enum<T>> extends AbstractList<T> implements EnumEntries<T>, Serializable {
    @NotNull

    /* renamed from: b */
    private final T[] f116544b;

    public C44402c(@NotNull T[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f116544b = entries;
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.f116544b);
    }

    /* renamed from: a */
    public boolean m3112a(@NotNull T element) {
        Object m17324b0;
        Intrinsics.checkNotNullParameter(element, "element");
        m17324b0 = _Arrays.m17324b0(this.f116544b, element.ordinal());
        if (((Enum) m17324b0) == element) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    /* renamed from: c */
    public T get(int i) {
        AbstractList.Companion.m17590b(i, this.f116544b.length);
        return this.f116544b[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return m3112a((Enum) obj);
    }

    /* renamed from: d */
    public int m3110d(@NotNull T element) {
        Object m17324b0;
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        m17324b0 = _Arrays.m17324b0(this.f116544b, ordinal);
        if (((Enum) m17324b0) != element) {
            return -1;
        }
        return ordinal;
    }

    /* renamed from: f */
    public int m3109f(@NotNull T element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f116544b.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return m3110d((Enum) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return m3109f((Enum) obj);
    }
}
