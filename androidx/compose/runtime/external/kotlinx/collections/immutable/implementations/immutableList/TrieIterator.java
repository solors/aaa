package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TrieIterator.kt */
@Metadata
/* loaded from: classes.dex */
public final class TrieIterator<E> extends AbstractListIterator<E> {
    private int height;
    private boolean isInRightEdge;
    @NotNull
    private Object[] path;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public TrieIterator(@NotNull Object[] root, int i, int i2, int i3) {
        super(i, i2);
        ?? r5;
        Intrinsics.checkNotNullParameter(root, "root");
        this.height = i3;
        Object[] objArr = new Object[i3];
        this.path = objArr;
        if (i == i2) {
            r5 = 1;
        } else {
            r5 = 0;
        }
        this.isInRightEdge = r5;
        objArr[0] = root;
        fillPath(i - r5, 1);
    }

    private final E elementAtCurrentIndex() {
        int index = getIndex() & 31;
        Object obj = this.path[this.height - 1];
        if (obj != null) {
            return (E) ((Object[]) obj)[index];
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
    }

    private final void fillPath(int i, int i2) {
        int i3 = (this.height - i2) * 5;
        while (i2 < this.height) {
            Object[] objArr = this.path;
            Object[] objArr2 = objArr[i2 - 1];
            if (objArr2 != null) {
                objArr[i2] = objArr2[UtilsKt.indexSegment(i, i3)];
                i3 -= 5;
                i2++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
        }
    }

    private final void fillPathIfNeeded(int i) {
        int i2 = 0;
        while (UtilsKt.indexSegment(getIndex(), i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            fillPath(getIndex(), ((this.height - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (hasNext()) {
            E elementAtCurrentIndex = elementAtCurrentIndex();
            setIndex(getIndex() + 1);
            if (getIndex() == getSize()) {
                this.isInRightEdge = true;
                return elementAtCurrentIndex;
            }
            fillPathIfNeeded(0);
            return elementAtCurrentIndex;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (hasPrevious()) {
            setIndex(getIndex() - 1);
            if (this.isInRightEdge) {
                this.isInRightEdge = false;
                return elementAtCurrentIndex();
            }
            fillPathIfNeeded(31);
            return elementAtCurrentIndex();
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void reset$runtime_release(@NotNull Object[] root, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(root, "root");
        setIndex(i);
        setSize(i2);
        this.height = i3;
        if (this.path.length < i3) {
            this.path = new Object[i3];
        }
        ?? r0 = 0;
        this.path[0] = root;
        if (i == i2) {
            r0 = 1;
        }
        this.isInRightEdge = r0;
        fillPath(i - r0, 1);
    }
}
