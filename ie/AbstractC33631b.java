package ie;

import androidx.concurrent.futures.C1074a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Atomic.kt */
@Metadata
/* renamed from: ie.b */
/* loaded from: classes8.dex */
public abstract class AbstractC33631b<T> extends AbstractC33630a0 {
    @NotNull

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f92081a = AtomicReferenceFieldUpdater.newUpdater(AbstractC33631b.class, Object.class, "_consensus");
    @Nullable
    private volatile Object _consensus = Atomic.f92080a;

    /* renamed from: c */
    private final Object m23010c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f92081a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = Atomic.f92080a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (C1074a.m105283a(atomicReferenceFieldUpdater, this, obj3, obj)) {
            return obj;
        }
        return atomicReferenceFieldUpdater.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ie.AbstractC33630a0
    @Nullable
    /* renamed from: a */
    public final Object mo23011a(@Nullable Object obj) {
        Object obj2 = f92081a.get(this);
        if (obj2 == Atomic.f92080a) {
            obj2 = m23010c(mo16229d(obj));
        }
        mo22899b(obj, obj2);
        return obj2;
    }

    /* renamed from: b */
    public abstract void mo22899b(T t, @Nullable Object obj);

    @Nullable
    /* renamed from: d */
    public abstract Object mo16229d(T t);
}
