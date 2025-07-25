package p643df;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Task.kt */
@Metadata
/* renamed from: df.a */
/* loaded from: classes10.dex */
public abstract class AbstractC32871a {
    @NotNull

    /* renamed from: a */
    private final String f89600a;

    /* renamed from: b */
    private final boolean f89601b;
    @Nullable

    /* renamed from: c */
    private C32872d f89602c;

    /* renamed from: d */
    private long f89603d;

    public AbstractC32871a(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f89600a = name;
        this.f89601b = z;
        this.f89603d = -1L;
    }

    /* renamed from: a */
    public final boolean m25657a() {
        return this.f89601b;
    }

    @NotNull
    /* renamed from: b */
    public final String m25656b() {
        return this.f89600a;
    }

    /* renamed from: c */
    public final long m25655c() {
        return this.f89603d;
    }

    @Nullable
    /* renamed from: d */
    public final C32872d m25654d() {
        return this.f89602c;
    }

    /* renamed from: e */
    public final void m25653e(@NotNull C32872d queue) {
        boolean z;
        Intrinsics.checkNotNullParameter(queue, "queue");
        C32872d c32872d = this.f89602c;
        if (c32872d == queue) {
            return;
        }
        if (c32872d == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f89602c = queue;
            return;
        }
        throw new IllegalStateException("task is in multiple queues".toString());
    }

    /* renamed from: f */
    public abstract long mo23439f();

    /* renamed from: g */
    public final void m25652g(long j) {
        this.f89603d = j;
    }

    @NotNull
    public String toString() {
        return this.f89600a;
    }

    public /* synthetic */ AbstractC32871a(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
