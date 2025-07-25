package androidx.compose.runtime.external.kotlinx.collections.immutable;

import ae.KMarkers;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImmutableList.kt */
@Metadata
/* loaded from: classes.dex */
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, KMarkers {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ImmutableList.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class SubList<E> extends AbstractList<E> implements ImmutableList<E> {
        private int _size;
        private final int fromIndex;
        @NotNull
        private final ImmutableList<E> source;
        private final int toIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(@NotNull ImmutableList<? extends E> source, int i, int i2) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
            this.fromIndex = i;
            this.toIndex = i2;
            ListImplementation.checkRangeIndexes$runtime_release(i, i2, source.size());
            this._size = i2 - i;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int i) {
            ListImplementation.checkElementIndex$runtime_release(i, this._size);
            return this.source.get(this.fromIndex + i);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this._size;
        }

        @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        @NotNull
        public ImmutableList<E> subList(int i, int i2) {
            ListImplementation.checkRangeIndexes$runtime_release(i, i2, this._size);
            ImmutableList<E> immutableList = this.source;
            int i3 = this.fromIndex;
            return new SubList(immutableList, i + i3, i3 + i2);
        }
    }

    @Override // java.util.List
    @NotNull
    default ImmutableList<E> subList(int i, int i2) {
        return new SubList(this, i, i2);
    }
}
