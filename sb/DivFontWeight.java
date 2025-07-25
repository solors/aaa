package sb;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: sb.n8 */
/* loaded from: classes8.dex */
public enum DivFontWeight {
    LIGHT("light"),
    MEDIUM("medium"),
    REGULAR("regular"),
    BOLD("bold");
    
    @NotNull

    /* renamed from: c */
    public static final C41066b f107502c = new C41066b(null);
    @NotNull

    /* renamed from: d */
    private static final Function1<String, DivFontWeight> f107503d = C41065a.f107510g;
    @NotNull

    /* renamed from: b */
    private final String f107509b;

    /* compiled from: DivFontWeight.kt */
    @Metadata
    /* renamed from: sb.n8$a */
    /* loaded from: classes8.dex */
    static final class C41065a extends Lambda implements Function1<String, DivFontWeight> {

        /* renamed from: g */
        public static final C41065a f107510g = new C41065a();

        C41065a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final DivFontWeight invoke(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            DivFontWeight divFontWeight = DivFontWeight.LIGHT;
            if (!Intrinsics.m17075f(string, divFontWeight.f107509b)) {
                DivFontWeight divFontWeight2 = DivFontWeight.MEDIUM;
                if (!Intrinsics.m17075f(string, divFontWeight2.f107509b)) {
                    DivFontWeight divFontWeight3 = DivFontWeight.REGULAR;
                    if (!Intrinsics.m17075f(string, divFontWeight3.f107509b)) {
                        DivFontWeight divFontWeight4 = DivFontWeight.BOLD;
                        if (!Intrinsics.m17075f(string, divFontWeight4.f107509b)) {
                            return null;
                        }
                        return divFontWeight4;
                    }
                    return divFontWeight3;
                }
                return divFontWeight2;
            }
            return divFontWeight;
        }
    }

    /* compiled from: DivFontWeight.kt */
    @Metadata
    /* renamed from: sb.n8$b */
    /* loaded from: classes8.dex */
    public static final class C41066b {
        private C41066b() {
        }

        public /* synthetic */ C41066b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Function1<String, DivFontWeight> m9807a() {
            return DivFontWeight.f107503d;
        }

        @NotNull
        /* renamed from: b */
        public final String m9806b(@NotNull DivFontWeight obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f107509b;
        }
    }

    DivFontWeight(String str) {
        this.f107509b = str;
    }
}
