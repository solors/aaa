package sb;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: sb.js */
/* loaded from: classes8.dex */
public enum DivVisibility {
    VISIBLE("visible"),
    INVISIBLE("invisible"),
    GONE("gone");
    
    @NotNull

    /* renamed from: c */
    public static final C40699b f106646c = new C40699b(null);
    @NotNull

    /* renamed from: d */
    private static final Function1<String, DivVisibility> f106647d = C40698a.f106653g;
    @NotNull

    /* renamed from: b */
    private final String f106652b;

    /* compiled from: DivVisibility.kt */
    @Metadata
    /* renamed from: sb.js$a */
    /* loaded from: classes8.dex */
    static final class C40698a extends Lambda implements Function1<String, DivVisibility> {

        /* renamed from: g */
        public static final C40698a f106653g = new C40698a();

        C40698a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final DivVisibility invoke(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            DivVisibility divVisibility = DivVisibility.VISIBLE;
            if (!Intrinsics.m17075f(string, divVisibility.f106652b)) {
                DivVisibility divVisibility2 = DivVisibility.INVISIBLE;
                if (!Intrinsics.m17075f(string, divVisibility2.f106652b)) {
                    DivVisibility divVisibility3 = DivVisibility.GONE;
                    if (!Intrinsics.m17075f(string, divVisibility3.f106652b)) {
                        return null;
                    }
                    return divVisibility3;
                }
                return divVisibility2;
            }
            return divVisibility;
        }
    }

    /* compiled from: DivVisibility.kt */
    @Metadata
    /* renamed from: sb.js$b */
    /* loaded from: classes8.dex */
    public static final class C40699b {
        private C40699b() {
        }

        public /* synthetic */ C40699b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Function1<String, DivVisibility> m10328a() {
            return DivVisibility.f106647d;
        }

        @NotNull
        /* renamed from: b */
        public final String m10327b(@NotNull DivVisibility obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f106652b;
        }
    }

    DivVisibility(String str) {
        this.f106652b = str;
    }
}
