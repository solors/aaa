package sb;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: sb.rk */
/* loaded from: classes8.dex */
public enum DivSizeUnit {
    DP(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORM),
    SP("sp"),
    PX("px");
    
    @NotNull

    /* renamed from: c */
    public static final C41705b f109190c = new C41705b(null);
    @NotNull

    /* renamed from: d */
    private static final Function1<String, DivSizeUnit> f109191d = C41704a.f109197g;
    @NotNull

    /* renamed from: b */
    private final String f109196b;

    /* compiled from: DivSizeUnit.kt */
    @Metadata
    /* renamed from: sb.rk$a */
    /* loaded from: classes8.dex */
    static final class C41704a extends Lambda implements Function1<String, DivSizeUnit> {

        /* renamed from: g */
        public static final C41704a f109197g = new C41704a();

        C41704a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final DivSizeUnit invoke(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            DivSizeUnit divSizeUnit = DivSizeUnit.DP;
            if (!Intrinsics.m17075f(string, divSizeUnit.f109196b)) {
                DivSizeUnit divSizeUnit2 = DivSizeUnit.SP;
                if (!Intrinsics.m17075f(string, divSizeUnit2.f109196b)) {
                    DivSizeUnit divSizeUnit3 = DivSizeUnit.PX;
                    if (!Intrinsics.m17075f(string, divSizeUnit3.f109196b)) {
                        return null;
                    }
                    return divSizeUnit3;
                }
                return divSizeUnit2;
            }
            return divSizeUnit;
        }
    }

    /* compiled from: DivSizeUnit.kt */
    @Metadata
    /* renamed from: sb.rk$b */
    /* loaded from: classes8.dex */
    public static final class C41705b {
        private C41705b() {
        }

        public /* synthetic */ C41705b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Function1<String, DivSizeUnit> m8740a() {
            return DivSizeUnit.f109191d;
        }

        @NotNull
        /* renamed from: b */
        public final String m8739b(@NotNull DivSizeUnit obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f109196b;
        }
    }

    DivSizeUnit(String str) {
        this.f109196b = str;
    }
}
