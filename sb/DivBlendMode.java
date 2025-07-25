package sb;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: sb.h2 */
/* loaded from: classes8.dex */
public enum DivBlendMode {
    SOURCE_IN("source_in"),
    SOURCE_ATOP("source_atop"),
    DARKEN("darken"),
    LIGHTEN("lighten"),
    MULTIPLY("multiply"),
    SCREEN("screen");
    
    @NotNull

    /* renamed from: c */
    public static final C40367b f105812c = new C40367b(null);
    @NotNull

    /* renamed from: d */
    private static final Function1<String, DivBlendMode> f105813d = C40366a.f105822g;
    @NotNull

    /* renamed from: b */
    private final String f105821b;

    /* compiled from: DivBlendMode.kt */
    @Metadata
    /* renamed from: sb.h2$a */
    /* loaded from: classes8.dex */
    static final class C40366a extends Lambda implements Function1<String, DivBlendMode> {

        /* renamed from: g */
        public static final C40366a f105822g = new C40366a();

        C40366a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final DivBlendMode invoke(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            DivBlendMode divBlendMode = DivBlendMode.SOURCE_IN;
            if (!Intrinsics.m17075f(string, divBlendMode.f105821b)) {
                DivBlendMode divBlendMode2 = DivBlendMode.SOURCE_ATOP;
                if (!Intrinsics.m17075f(string, divBlendMode2.f105821b)) {
                    DivBlendMode divBlendMode3 = DivBlendMode.DARKEN;
                    if (!Intrinsics.m17075f(string, divBlendMode3.f105821b)) {
                        DivBlendMode divBlendMode4 = DivBlendMode.LIGHTEN;
                        if (!Intrinsics.m17075f(string, divBlendMode4.f105821b)) {
                            DivBlendMode divBlendMode5 = DivBlendMode.MULTIPLY;
                            if (!Intrinsics.m17075f(string, divBlendMode5.f105821b)) {
                                DivBlendMode divBlendMode6 = DivBlendMode.SCREEN;
                                if (!Intrinsics.m17075f(string, divBlendMode6.f105821b)) {
                                    return null;
                                }
                                return divBlendMode6;
                            }
                            return divBlendMode5;
                        }
                        return divBlendMode4;
                    }
                    return divBlendMode3;
                }
                return divBlendMode2;
            }
            return divBlendMode;
        }
    }

    /* compiled from: DivBlendMode.kt */
    @Metadata
    /* renamed from: sb.h2$b */
    /* loaded from: classes8.dex */
    public static final class C40367b {
        private C40367b() {
        }

        public /* synthetic */ C40367b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Function1<String, DivBlendMode> m10870a() {
            return DivBlendMode.f105813d;
        }

        @NotNull
        /* renamed from: b */
        public final String m10869b(@NotNull DivBlendMode obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f105821b;
        }
    }

    DivBlendMode(String str) {
        this.f105821b = str;
    }
}
