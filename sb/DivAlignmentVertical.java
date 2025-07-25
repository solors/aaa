package sb;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.meevii.abtest.util.FlowDomainConstant;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: sb.i1 */
/* loaded from: classes8.dex */
public enum DivAlignmentVertical {
    TOP(ViewHierarchyConstants.DIMENSION_TOP_KEY),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE(FlowDomainConstant.BASELINE);
    
    @NotNull

    /* renamed from: c */
    public static final C40448b f106037c = new C40448b(null);
    @NotNull

    /* renamed from: d */
    private static final Function1<String, DivAlignmentVertical> f106038d = C40447a.f106045g;
    @NotNull

    /* renamed from: b */
    private final String f106044b;

    /* compiled from: DivAlignmentVertical.kt */
    @Metadata
    /* renamed from: sb.i1$a */
    /* loaded from: classes8.dex */
    static final class C40447a extends Lambda implements Function1<String, DivAlignmentVertical> {

        /* renamed from: g */
        public static final C40447a f106045g = new C40447a();

        C40447a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final DivAlignmentVertical invoke(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
            if (!Intrinsics.m17075f(string, divAlignmentVertical.f106044b)) {
                DivAlignmentVertical divAlignmentVertical2 = DivAlignmentVertical.CENTER;
                if (!Intrinsics.m17075f(string, divAlignmentVertical2.f106044b)) {
                    DivAlignmentVertical divAlignmentVertical3 = DivAlignmentVertical.BOTTOM;
                    if (!Intrinsics.m17075f(string, divAlignmentVertical3.f106044b)) {
                        DivAlignmentVertical divAlignmentVertical4 = DivAlignmentVertical.BASELINE;
                        if (!Intrinsics.m17075f(string, divAlignmentVertical4.f106044b)) {
                            return null;
                        }
                        return divAlignmentVertical4;
                    }
                    return divAlignmentVertical3;
                }
                return divAlignmentVertical2;
            }
            return divAlignmentVertical;
        }
    }

    /* compiled from: DivAlignmentVertical.kt */
    @Metadata
    /* renamed from: sb.i1$b */
    /* loaded from: classes8.dex */
    public static final class C40448b {
        private C40448b() {
        }

        public /* synthetic */ C40448b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Function1<String, DivAlignmentVertical> m10701a() {
            return DivAlignmentVertical.f106038d;
        }

        @NotNull
        /* renamed from: b */
        public final String m10700b(@NotNull DivAlignmentVertical obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f106044b;
        }
    }

    DivAlignmentVertical(String str) {
        this.f106044b = str;
    }
}
