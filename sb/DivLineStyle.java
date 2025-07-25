package sb;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: sb.zd */
/* loaded from: classes8.dex */
public enum DivLineStyle {
    NONE("none"),
    SINGLE("single");
    
    @NotNull

    /* renamed from: c */
    public static final C42514b f111325c = new C42514b(null);
    @NotNull

    /* renamed from: d */
    private static final Function1<String, DivLineStyle> f111326d = C42513a.f111331g;
    @NotNull

    /* renamed from: b */
    private final String f111330b;

    /* compiled from: DivLineStyle.kt */
    @Metadata
    /* renamed from: sb.zd$a */
    /* loaded from: classes8.dex */
    static final class C42513a extends Lambda implements Function1<String, DivLineStyle> {

        /* renamed from: g */
        public static final C42513a f111331g = new C42513a();

        C42513a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final DivLineStyle invoke(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            DivLineStyle divLineStyle = DivLineStyle.NONE;
            if (!Intrinsics.m17075f(string, divLineStyle.f111330b)) {
                DivLineStyle divLineStyle2 = DivLineStyle.SINGLE;
                if (!Intrinsics.m17075f(string, divLineStyle2.f111330b)) {
                    return null;
                }
                return divLineStyle2;
            }
            return divLineStyle;
        }
    }

    /* compiled from: DivLineStyle.kt */
    @Metadata
    /* renamed from: sb.zd$b */
    /* loaded from: classes8.dex */
    public static final class C42514b {
        private C42514b() {
        }

        public /* synthetic */ C42514b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Function1<String, DivLineStyle> m7263a() {
            return DivLineStyle.f111326d;
        }

        @NotNull
        /* renamed from: b */
        public final String m7262b(@NotNull DivLineStyle obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f111330b;
        }
    }

    DivLineStyle(String str) {
        this.f111330b = str;
    }
}
