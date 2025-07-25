package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlinx.coroutines.n0 */
/* loaded from: classes7.dex */
public final class CoroutineName extends CoroutineContextImpl {
    @NotNull

    /* renamed from: c */
    public static final C37778a f99620c = new C37778a(null);
    @NotNull

    /* renamed from: b */
    private final String f99621b;

    /* compiled from: CoroutineName.kt */
    @Metadata
    /* renamed from: kotlinx.coroutines.n0$a */
    /* loaded from: classes7.dex */
    public static final class C37778a implements CoroutineContext.InterfaceC37576b<CoroutineName> {
        private C37778a() {
        }

        public /* synthetic */ C37778a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CoroutineName(@NotNull String str) {
        super(f99620c);
        this.f99621b = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CoroutineName) && Intrinsics.m17075f(this.f99621b, ((CoroutineName) obj).f99621b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f99621b.hashCode();
    }

    @NotNull
    /* renamed from: r */
    public final String m16172r() {
        return this.f99621b;
    }

    @NotNull
    public String toString() {
        return "CoroutineName(" + this.f99621b + ')';
    }
}
