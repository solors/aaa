package p819oc;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: oc.a */
/* loaded from: classes9.dex */
public final class CopyOnWriteHashMap<K, V> {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f102815a = AtomicReferenceFieldUpdater.newUpdater(CopyOnWriteHashMap.class, Object.class, "current");
    @NotNull
    private volatile /* synthetic */ Object current;

    public CopyOnWriteHashMap() {
        Map m17284j;
        m17284j = C37559r0.m17284j();
        this.current = m17284j;
    }

    @Nullable
    /* renamed from: a */
    public final V m13844a(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (V) ((Map) this.current).get(key);
    }
}
