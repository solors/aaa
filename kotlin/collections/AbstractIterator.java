package kotlin.collections;

import ae.KMarkers;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlin.collections.b */
/* loaded from: classes7.dex */
public abstract class AbstractIterator<T> implements Iterator<T>, KMarkers {
    @NotNull

    /* renamed from: b */
    private EnumC37536c1 f99213b = EnumC37536c1.f99232c;
    @Nullable

    /* renamed from: c */
    private T f99214c;

    /* compiled from: AbstractIterator.kt */
    @Metadata
    /* renamed from: kotlin.collections.b$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C37530a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC37536c1.values().length];
            try {
                iArr[EnumC37536c1.f99233d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37536c1.f99231b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: d */
    private final boolean m17601d() {
        this.f99213b = EnumC37536c1.f99234f;
        mo1210a();
        if (this.f99213b == EnumC37536c1.f99231b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected abstract void mo1210a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m17603b() {
        this.f99213b = EnumC37536c1.f99233d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m17602c(T t) {
        this.f99214c = t;
        this.f99213b = EnumC37536c1.f99231b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z;
        EnumC37536c1 enumC37536c1 = this.f99213b;
        if (enumC37536c1 != EnumC37536c1.f99234f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = C37530a.$EnumSwitchMapping$0[enumC37536c1.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            return m17601d();
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f99213b = EnumC37536c1.f99232c;
            return this.f99214c;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
