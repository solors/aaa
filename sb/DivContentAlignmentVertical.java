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
/* renamed from: sb.d4 */
/* loaded from: classes8.dex */
public enum DivContentAlignmentVertical {
    TOP(ViewHierarchyConstants.DIMENSION_TOP_KEY),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE(FlowDomainConstant.BASELINE),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");
    
    @NotNull

    /* renamed from: c */
    public static final C40053b f105213c = new C40053b(null);
    @NotNull

    /* renamed from: d */
    private static final Function1<String, DivContentAlignmentVertical> f105214d = C40052a.f105224g;
    @NotNull

    /* renamed from: b */
    private final String f105223b;

    /* compiled from: DivContentAlignmentVertical.kt */
    @Metadata
    /* renamed from: sb.d4$a */
    /* loaded from: classes8.dex */
    static final class C40052a extends Lambda implements Function1<String, DivContentAlignmentVertical> {

        /* renamed from: g */
        public static final C40052a f105224g = new C40052a();

        C40052a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final DivContentAlignmentVertical invoke(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            DivContentAlignmentVertical divContentAlignmentVertical = DivContentAlignmentVertical.TOP;
            if (!Intrinsics.m17075f(string, divContentAlignmentVertical.f105223b)) {
                DivContentAlignmentVertical divContentAlignmentVertical2 = DivContentAlignmentVertical.CENTER;
                if (!Intrinsics.m17075f(string, divContentAlignmentVertical2.f105223b)) {
                    DivContentAlignmentVertical divContentAlignmentVertical3 = DivContentAlignmentVertical.BOTTOM;
                    if (!Intrinsics.m17075f(string, divContentAlignmentVertical3.f105223b)) {
                        DivContentAlignmentVertical divContentAlignmentVertical4 = DivContentAlignmentVertical.BASELINE;
                        if (!Intrinsics.m17075f(string, divContentAlignmentVertical4.f105223b)) {
                            DivContentAlignmentVertical divContentAlignmentVertical5 = DivContentAlignmentVertical.SPACE_BETWEEN;
                            if (!Intrinsics.m17075f(string, divContentAlignmentVertical5.f105223b)) {
                                DivContentAlignmentVertical divContentAlignmentVertical6 = DivContentAlignmentVertical.SPACE_AROUND;
                                if (!Intrinsics.m17075f(string, divContentAlignmentVertical6.f105223b)) {
                                    DivContentAlignmentVertical divContentAlignmentVertical7 = DivContentAlignmentVertical.SPACE_EVENLY;
                                    if (!Intrinsics.m17075f(string, divContentAlignmentVertical7.f105223b)) {
                                        return null;
                                    }
                                    return divContentAlignmentVertical7;
                                }
                                return divContentAlignmentVertical6;
                            }
                            return divContentAlignmentVertical5;
                        }
                        return divContentAlignmentVertical4;
                    }
                    return divContentAlignmentVertical3;
                }
                return divContentAlignmentVertical2;
            }
            return divContentAlignmentVertical;
        }
    }

    /* compiled from: DivContentAlignmentVertical.kt */
    @Metadata
    /* renamed from: sb.d4$b */
    /* loaded from: classes8.dex */
    public static final class C40053b {
        private C40053b() {
        }

        public /* synthetic */ C40053b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Function1<String, DivContentAlignmentVertical> m11334a() {
            return DivContentAlignmentVertical.f105214d;
        }

        @NotNull
        /* renamed from: b */
        public final String m11333b(@NotNull DivContentAlignmentVertical obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f105223b;
        }
    }

    DivContentAlignmentVertical(String str) {
        this.f105223b = str;
    }
}
