package sb;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: sb.yq */
/* loaded from: classes8.dex */
public enum DivTransitionSelector {
    NONE("none"),
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    ANY_CHANGE("any_change");
    
    @NotNull

    /* renamed from: c */
    public static final C42475b f111230c = new C42475b(null);
    @NotNull

    /* renamed from: d */
    private static final Function1<String, DivTransitionSelector> f111231d = C42474a.f111238g;
    @NotNull

    /* renamed from: b */
    private final String f111237b;

    /* compiled from: DivTransitionSelector.kt */
    @Metadata
    /* renamed from: sb.yq$a */
    /* loaded from: classes8.dex */
    static final class C42474a extends Lambda implements Function1<String, DivTransitionSelector> {

        /* renamed from: g */
        public static final C42474a f111238g = new C42474a();

        C42474a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final DivTransitionSelector invoke(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            DivTransitionSelector divTransitionSelector = DivTransitionSelector.NONE;
            if (!Intrinsics.m17075f(string, divTransitionSelector.f111237b)) {
                DivTransitionSelector divTransitionSelector2 = DivTransitionSelector.DATA_CHANGE;
                if (!Intrinsics.m17075f(string, divTransitionSelector2.f111237b)) {
                    DivTransitionSelector divTransitionSelector3 = DivTransitionSelector.STATE_CHANGE;
                    if (!Intrinsics.m17075f(string, divTransitionSelector3.f111237b)) {
                        DivTransitionSelector divTransitionSelector4 = DivTransitionSelector.ANY_CHANGE;
                        if (!Intrinsics.m17075f(string, divTransitionSelector4.f111237b)) {
                            return null;
                        }
                        return divTransitionSelector4;
                    }
                    return divTransitionSelector3;
                }
                return divTransitionSelector2;
            }
            return divTransitionSelector;
        }
    }

    /* compiled from: DivTransitionSelector.kt */
    @Metadata
    /* renamed from: sb.yq$b */
    /* loaded from: classes8.dex */
    public static final class C42475b {
        private C42475b() {
        }

        public /* synthetic */ C42475b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Function1<String, DivTransitionSelector> m7336a() {
            return DivTransitionSelector.f111231d;
        }

        @NotNull
        /* renamed from: b */
        public final String m7335b(@NotNull DivTransitionSelector obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f111237b;
        }
    }

    DivTransitionSelector(String str) {
        this.f111237b = str;
    }
}
