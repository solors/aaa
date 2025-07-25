package sb;

import com.maticoo.sdk.utils.constant.KeyConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: sb.db */
/* loaded from: classes8.dex */
public enum DivImageScale {
    FILL(Reporting.EventType.FILL),
    NO_SCALE("no_scale"),
    FIT(KeyConstants.RequestBody.KEY_FIT),
    STRETCH("stretch");
    
    @NotNull

    /* renamed from: c */
    public static final C40063b f105230c = new C40063b(null);
    @NotNull

    /* renamed from: d */
    private static final Function1<String, DivImageScale> f105231d = C40062a.f105238g;
    @NotNull

    /* renamed from: b */
    private final String f105237b;

    /* compiled from: DivImageScale.kt */
    @Metadata
    /* renamed from: sb.db$a */
    /* loaded from: classes8.dex */
    static final class C40062a extends Lambda implements Function1<String, DivImageScale> {

        /* renamed from: g */
        public static final C40062a f105238g = new C40062a();

        C40062a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final DivImageScale invoke(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            DivImageScale divImageScale = DivImageScale.FILL;
            if (!Intrinsics.m17075f(string, divImageScale.f105237b)) {
                DivImageScale divImageScale2 = DivImageScale.NO_SCALE;
                if (!Intrinsics.m17075f(string, divImageScale2.f105237b)) {
                    DivImageScale divImageScale3 = DivImageScale.FIT;
                    if (!Intrinsics.m17075f(string, divImageScale3.f105237b)) {
                        DivImageScale divImageScale4 = DivImageScale.STRETCH;
                        if (!Intrinsics.m17075f(string, divImageScale4.f105237b)) {
                            return null;
                        }
                        return divImageScale4;
                    }
                    return divImageScale3;
                }
                return divImageScale2;
            }
            return divImageScale;
        }
    }

    /* compiled from: DivImageScale.kt */
    @Metadata
    /* renamed from: sb.db$b */
    /* loaded from: classes8.dex */
    public static final class C40063b {
        private C40063b() {
        }

        public /* synthetic */ C40063b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Function1<String, DivImageScale> m11323a() {
            return DivImageScale.f105231d;
        }

        @NotNull
        /* renamed from: b */
        public final String m11322b(@NotNull DivImageScale obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f105237b;
        }
    }

    DivImageScale(String str) {
        this.f105237b = str;
    }
}
