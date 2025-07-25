package kotlin.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MatchResult.kt */
@Metadata
/* loaded from: classes7.dex */
public interface MatchResult {

    /* compiled from: MatchResult.kt */
    @Metadata
    /* renamed from: kotlin.text.MatchResult$a */
    /* loaded from: classes7.dex */
    public static final class C37673a {
        @NotNull
        /* renamed from: a */
        public static C37674b m16772a(@NotNull MatchResult matchResult) {
            return new C37674b(matchResult);
        }
    }

    /* compiled from: MatchResult.kt */
    @Metadata
    /* renamed from: kotlin.text.MatchResult$b */
    /* loaded from: classes7.dex */
    public static final class C37674b {
        @NotNull

        /* renamed from: a */
        private final MatchResult f99451a;

        public C37674b(@NotNull MatchResult match) {
            Intrinsics.checkNotNullParameter(match, "match");
            this.f99451a = match;
        }

        @NotNull
        /* renamed from: a */
        public final MatchResult m16771a() {
            return this.f99451a;
        }
    }

    @NotNull
    /* renamed from: a */
    C37674b mo16750a();

    @NotNull
    /* renamed from: b */
    InterfaceC37679c mo16749b();

    @NotNull
    /* renamed from: c */
    List<String> mo16748c();

    @NotNull
    /* renamed from: d */
    PrimitiveRanges mo16747d();

    @NotNull
    String getValue();

    @Nullable
    MatchResult next();
}
