package androidx.compose.runtime.snapshots;

import ae.KMarkers;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C37607l0;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SnapshotStateList.kt */
@Metadata
/* loaded from: classes.dex */
public final class SubList$listIterator$1<T> implements ListIterator<T>, KMarkers {
    final /* synthetic */ C37607l0 $current;
    final /* synthetic */ SubList<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubList$listIterator$1(C37607l0 c37607l0, SubList<T> subList) {
        this.$current = c37607l0;
        this.this$0 = subList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        add((SubList$listIterator$1<T>) obj);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.$current.f99325b < this.this$0.size() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.$current.f99325b >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        int i = this.$current.f99325b + 1;
        SnapshotStateListKt.validateRange(i, this.this$0.size());
        this.$current.f99325b = i;
        return this.this$0.get(i);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.$current.f99325b + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        int i = this.$current.f99325b;
        SnapshotStateListKt.validateRange(i, this.this$0.size());
        this.$current.f99325b = i - 1;
        return this.this$0.get(i);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.$current.f99325b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        set((SubList$listIterator$1<T>) obj);
    }

    @Override // java.util.ListIterator
    @NotNull
    public Void add(T t) {
        SnapshotStateListKt.modificationError();
        throw new ExceptionsH();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    @NotNull
    public Void remove() {
        SnapshotStateListKt.modificationError();
        throw new ExceptionsH();
    }

    @Override // java.util.ListIterator
    @NotNull
    public Void set(T t) {
        SnapshotStateListKt.modificationError();
        throw new ExceptionsH();
    }
}
