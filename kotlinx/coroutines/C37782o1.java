package kotlinx.coroutines;

import ie.Symbol;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: EventLoop.common.kt */
@Metadata
/* renamed from: kotlinx.coroutines.o1 */
/* loaded from: classes7.dex */
public final class C37782o1 {
    @NotNull

    /* renamed from: a */
    private static final Symbol f99622a = new Symbol("REMOVED_TASK");
    @NotNull

    /* renamed from: b */
    private static final Symbol f99623b = new Symbol("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m16166c(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
