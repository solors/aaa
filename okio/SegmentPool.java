package okio;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: okio.x0 */
/* loaded from: classes10.dex */
public final class SegmentPool {
    @NotNull

    /* renamed from: a */
    public static final SegmentPool f103028a = new SegmentPool();

    /* renamed from: b */
    private static final int f103029b = 65536;
    @NotNull

    /* renamed from: c */
    private static final Segment f103030c = new Segment(new byte[0], 0, 0, false, false);

    /* renamed from: d */
    private static final int f103031d;
    @NotNull

    /* renamed from: e */
    private static final AtomicReference<Segment>[] f103032e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f103031d = highestOneBit;
        AtomicReference<Segment>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f103032e = atomicReferenceArr;
    }

    private SegmentPool() {
    }

    /* renamed from: a */
    private final AtomicReference<Segment> m13409a() {
        return f103032e[(int) (Thread.currentThread().getId() & (f103031d - 1))];
    }

    /* renamed from: b */
    public static final void m13408b(@NotNull Segment segment) {
        boolean z;
        AtomicReference<Segment> m13409a;
        Segment segment2;
        Segment andSet;
        int i;
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f103026f == null && segment.f103027g == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (segment.f103024d || (andSet = (m13409a = f103028a.m13409a()).getAndSet((segment2 = f103030c))) == segment2) {
                return;
            }
            if (andSet != null) {
                i = andSet.f103023c;
            } else {
                i = 0;
            }
            if (i >= f103029b) {
                m13409a.set(andSet);
                return;
            }
            segment.f103026f = andSet;
            segment.f103022b = 0;
            segment.f103023c = i + 8192;
            m13409a.set(segment);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @NotNull
    /* renamed from: c */
    public static final Segment m13407c() {
        AtomicReference<Segment> m13409a = f103028a.m13409a();
        Segment segment = f103030c;
        Segment andSet = m13409a.getAndSet(segment);
        if (andSet == segment) {
            return new Segment();
        }
        if (andSet == null) {
            m13409a.set(null);
            return new Segment();
        }
        m13409a.set(andSet.f103026f);
        andSet.f103026f = null;
        andSet.f103023c = 0;
        return andSet;
    }
}
