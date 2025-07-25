package sb;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: sb.zq */
/* loaded from: classes8.dex */
public enum DivTransitionTrigger {
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    VISIBILITY_CHANGE("visibility_change");
    
    @NotNull

    /* renamed from: c */
    public static final C42680b f111768c = new C42680b(null);
    @NotNull

    /* renamed from: d */
    private static final Function1<String, DivTransitionTrigger> f111769d = C42679a.f111775g;
    @NotNull

    /* renamed from: b */
    private final String f111774b;

    /* compiled from: DivTransitionTrigger.kt */
    @Metadata
    /* renamed from: sb.zq$a */
    /* loaded from: classes8.dex */
    static final class C42679a extends Lambda implements Function1<String, DivTransitionTrigger> {

        /* renamed from: g */
        public static final C42679a f111775g = new C42679a();

        C42679a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final DivTransitionTrigger invoke(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            DivTransitionTrigger divTransitionTrigger = DivTransitionTrigger.DATA_CHANGE;
            if (!Intrinsics.m17075f(string, divTransitionTrigger.f111774b)) {
                DivTransitionTrigger divTransitionTrigger2 = DivTransitionTrigger.STATE_CHANGE;
                if (!Intrinsics.m17075f(string, divTransitionTrigger2.f111774b)) {
                    DivTransitionTrigger divTransitionTrigger3 = DivTransitionTrigger.VISIBILITY_CHANGE;
                    if (!Intrinsics.m17075f(string, divTransitionTrigger3.f111774b)) {
                        return null;
                    }
                    return divTransitionTrigger3;
                }
                return divTransitionTrigger2;
            }
            return divTransitionTrigger;
        }
    }

    /* compiled from: DivTransitionTrigger.kt */
    @Metadata
    /* renamed from: sb.zq$b */
    /* loaded from: classes8.dex */
    public static final class C42680b {
        private C42680b() {
        }

        public /* synthetic */ C42680b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Function1<String, DivTransitionTrigger> m6973a() {
            return DivTransitionTrigger.f111769d;
        }

        @NotNull
        /* renamed from: b */
        public final String m6972b(@NotNull DivTransitionTrigger obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f111774b;
        }
    }

    DivTransitionTrigger(String str) {
        this.f111774b = str;
    }
}
