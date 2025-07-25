package ie;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ie.d */
/* loaded from: classes8.dex */
public final class ConcurrentLinkedList {
    @NotNull

    /* renamed from: a */
    private static final Symbol f92084a = new Symbol("CLOSED");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ie.e] */
    @NotNull
    /* renamed from: b */
    public static final <N extends AbstractC33632e<N>> N m23004b(@NotNull N n) {
        while (true) {
            Object m22997f = n.m22997f();
            if (m22997f == f92084a) {
                return n;
            }
            ?? r0 = (AbstractC33632e) m22997f;
            if (r0 == 0) {
                if (n.m22994j()) {
                    return n;
                }
            } else {
                n = r0;
            }
        }
    }

    @NotNull
    /* renamed from: c */
    public static final <S extends AbstractC33633e0<S>> Object m23003c(@NotNull S s, long j, @NotNull Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s.f92089d < j || s.mo22991h()) {
                Object m22997f = s.m22997f();
                if (m22997f == f92084a) {
                    return C33635f0.m22987a(f92084a);
                }
                S s2 = (S) ((AbstractC33632e) m22997f);
                if (s2 == null) {
                    s2 = function2.mo105910invoke(Long.valueOf(s.f92089d + 1), s);
                    if (s.m22992l(s2)) {
                        if (s.mo22991h()) {
                            s.m22993k();
                        }
                    }
                }
                s = s2;
            } else {
                return C33635f0.m22987a(s);
            }
        }
    }
}
