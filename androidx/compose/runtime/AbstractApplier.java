package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Applier.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public abstract class AbstractApplier<T> implements Applier<T> {
    public static final int $stable = 8;
    private T current;
    private final T root;
    @NotNull
    private final List<T> stack = new ArrayList();

    public AbstractApplier(T t) {
        this.root = t;
        this.current = t;
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        this.stack.clear();
        setCurrent(this.root);
        onClear();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T t) {
        this.stack.add(getCurrent());
        setCurrent(t);
    }

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    public final T getRoot() {
        return this.root;
    }

    protected final void move(@NotNull List<T> list, int i, int i2, int i3) {
        int i4;
        List m17550c1;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i > i2) {
            i4 = i2;
        } else {
            i4 = i2 - i3;
        }
        if (i3 == 1) {
            if (i != i2 + 1 && i != i2 - 1) {
                list.add(i4, list.remove(i));
                return;
            } else {
                list.set(i, list.set(i2, list.get(i)));
                return;
            }
        }
        List<T> subList = list.subList(i, i3 + i);
        m17550c1 = _Collections.m17550c1(subList);
        subList.clear();
        list.addAll(i4, m17550c1);
    }

    protected abstract void onClear();

    protected final void remove(@NotNull List<T> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i2 == 1) {
            list.remove(i);
        } else {
            list.subList(i, i2 + i).clear();
        }
    }

    protected void setCurrent(T t) {
        this.current = t;
    }

    @Override // androidx.compose.runtime.Applier
    /* renamed from: up */
    public void mo105431up() {
        if (!this.stack.isEmpty()) {
            List<T> list = this.stack;
            setCurrent(list.remove(list.size() - 1));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
