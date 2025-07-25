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
/* renamed from: sb.pr */
/* loaded from: classes8.dex */
public enum DivVideoScale {
    FILL(Reporting.EventType.FILL),
    NO_SCALE("no_scale"),
    FIT(KeyConstants.RequestBody.KEY_FIT);
    
    @NotNull

    /* renamed from: c */
    public static final C41458b f108524c = new C41458b(null);
    @NotNull

    /* renamed from: d */
    private static final Function1<String, DivVideoScale> f108525d = C41457a.f108531g;
    @NotNull

    /* renamed from: b */
    private final String f108530b;

    /* compiled from: DivVideoScale.kt */
    @Metadata
    /* renamed from: sb.pr$a */
    /* loaded from: classes8.dex */
    static final class C41457a extends Lambda implements Function1<String, DivVideoScale> {

        /* renamed from: g */
        public static final C41457a f108531g = new C41457a();

        C41457a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final DivVideoScale invoke(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            DivVideoScale divVideoScale = DivVideoScale.FILL;
            if (!Intrinsics.m17075f(string, divVideoScale.f108530b)) {
                DivVideoScale divVideoScale2 = DivVideoScale.NO_SCALE;
                if (!Intrinsics.m17075f(string, divVideoScale2.f108530b)) {
                    DivVideoScale divVideoScale3 = DivVideoScale.FIT;
                    if (!Intrinsics.m17075f(string, divVideoScale3.f108530b)) {
                        return null;
                    }
                    return divVideoScale3;
                }
                return divVideoScale2;
            }
            return divVideoScale;
        }
    }

    /* compiled from: DivVideoScale.kt */
    @Metadata
    /* renamed from: sb.pr$b */
    /* loaded from: classes8.dex */
    public static final class C41458b {
        private C41458b() {
        }

        public /* synthetic */ C41458b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Function1<String, DivVideoScale> m9175a() {
            return DivVideoScale.f108525d;
        }

        @NotNull
        /* renamed from: b */
        public final String m9174b(@NotNull DivVideoScale obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f108530b;
        }
    }

    DivVideoScale(String str) {
        this.f108530b = str;
    }
}
