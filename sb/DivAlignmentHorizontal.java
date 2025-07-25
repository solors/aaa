package sb;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: sb.h1 */
/* loaded from: classes8.dex */
public enum DivAlignmentHorizontal {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end");
    
    @NotNull

    /* renamed from: c */
    public static final C40365b f105802c = new C40365b(null);
    @NotNull

    /* renamed from: d */
    private static final Function1<String, DivAlignmentHorizontal> f105803d = C40364a.f105811g;
    @NotNull

    /* renamed from: b */
    private final String f105810b;

    /* compiled from: DivAlignmentHorizontal.kt */
    @Metadata
    /* renamed from: sb.h1$a */
    /* loaded from: classes8.dex */
    static final class C40364a extends Lambda implements Function1<String, DivAlignmentHorizontal> {

        /* renamed from: g */
        public static final C40364a f105811g = new C40364a();

        C40364a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final DivAlignmentHorizontal invoke(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.LEFT;
            if (!Intrinsics.m17075f(string, divAlignmentHorizontal.f105810b)) {
                DivAlignmentHorizontal divAlignmentHorizontal2 = DivAlignmentHorizontal.CENTER;
                if (!Intrinsics.m17075f(string, divAlignmentHorizontal2.f105810b)) {
                    DivAlignmentHorizontal divAlignmentHorizontal3 = DivAlignmentHorizontal.RIGHT;
                    if (!Intrinsics.m17075f(string, divAlignmentHorizontal3.f105810b)) {
                        DivAlignmentHorizontal divAlignmentHorizontal4 = DivAlignmentHorizontal.START;
                        if (!Intrinsics.m17075f(string, divAlignmentHorizontal4.f105810b)) {
                            DivAlignmentHorizontal divAlignmentHorizontal5 = DivAlignmentHorizontal.END;
                            if (!Intrinsics.m17075f(string, divAlignmentHorizontal5.f105810b)) {
                                return null;
                            }
                            return divAlignmentHorizontal5;
                        }
                        return divAlignmentHorizontal4;
                    }
                    return divAlignmentHorizontal3;
                }
                return divAlignmentHorizontal2;
            }
            return divAlignmentHorizontal;
        }
    }

    /* compiled from: DivAlignmentHorizontal.kt */
    @Metadata
    /* renamed from: sb.h1$b */
    /* loaded from: classes8.dex */
    public static final class C40365b {
        private C40365b() {
        }

        public /* synthetic */ C40365b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Function1<String, DivAlignmentHorizontal> m10876a() {
            return DivAlignmentHorizontal.f105803d;
        }

        @NotNull
        /* renamed from: b */
        public final String m10875b(@NotNull DivAlignmentHorizontal obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f105810b;
        }
    }

    DivAlignmentHorizontal(String str) {
        this.f105810b = str;
    }
}
