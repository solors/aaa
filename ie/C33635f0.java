package ie;

import ie.AbstractC33633e0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata
/* renamed from: ie.f0 */
/* loaded from: classes8.dex */
public final class C33635f0<S extends AbstractC33633e0<S>> {
    @NotNull
    /* renamed from: b */
    public static final S m22986b(Object obj) {
        if (obj != ConcurrentLinkedList.f92084a) {
            Intrinsics.m17073h(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    /* renamed from: c */
    public static final boolean m22985c(Object obj) {
        if (obj == ConcurrentLinkedList.f92084a) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: a */
    public static <S extends AbstractC33633e0<S>> Object m22987a(@Nullable Object obj) {
        return obj;
    }
}
