package sb;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: sb.c4 */
/* loaded from: classes8.dex */
public enum DivContentAlignmentHorizontal {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");
    
    @NotNull

    /* renamed from: c */
    public static final C39972b f104994c = new C39972b(null);
    @NotNull

    /* renamed from: d */
    private static final Function1<String, DivContentAlignmentHorizontal> f104995d = C39971a.f105006g;
    @NotNull

    /* renamed from: b */
    private final String f105005b;

    /* compiled from: DivContentAlignmentHorizontal.kt */
    @Metadata
    /* renamed from: sb.c4$a */
    /* loaded from: classes8.dex */
    static final class C39971a extends Lambda implements Function1<String, DivContentAlignmentHorizontal> {

        /* renamed from: g */
        public static final C39971a f105006g = new C39971a();

        C39971a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* renamed from: b */
        public final DivContentAlignmentHorizontal invoke(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            DivContentAlignmentHorizontal divContentAlignmentHorizontal = DivContentAlignmentHorizontal.LEFT;
            if (!Intrinsics.m17075f(string, divContentAlignmentHorizontal.f105005b)) {
                DivContentAlignmentHorizontal divContentAlignmentHorizontal2 = DivContentAlignmentHorizontal.CENTER;
                if (!Intrinsics.m17075f(string, divContentAlignmentHorizontal2.f105005b)) {
                    DivContentAlignmentHorizontal divContentAlignmentHorizontal3 = DivContentAlignmentHorizontal.RIGHT;
                    if (!Intrinsics.m17075f(string, divContentAlignmentHorizontal3.f105005b)) {
                        DivContentAlignmentHorizontal divContentAlignmentHorizontal4 = DivContentAlignmentHorizontal.START;
                        if (!Intrinsics.m17075f(string, divContentAlignmentHorizontal4.f105005b)) {
                            DivContentAlignmentHorizontal divContentAlignmentHorizontal5 = DivContentAlignmentHorizontal.END;
                            if (!Intrinsics.m17075f(string, divContentAlignmentHorizontal5.f105005b)) {
                                DivContentAlignmentHorizontal divContentAlignmentHorizontal6 = DivContentAlignmentHorizontal.SPACE_BETWEEN;
                                if (!Intrinsics.m17075f(string, divContentAlignmentHorizontal6.f105005b)) {
                                    DivContentAlignmentHorizontal divContentAlignmentHorizontal7 = DivContentAlignmentHorizontal.SPACE_AROUND;
                                    if (!Intrinsics.m17075f(string, divContentAlignmentHorizontal7.f105005b)) {
                                        DivContentAlignmentHorizontal divContentAlignmentHorizontal8 = DivContentAlignmentHorizontal.SPACE_EVENLY;
                                        if (!Intrinsics.m17075f(string, divContentAlignmentHorizontal8.f105005b)) {
                                            return null;
                                        }
                                        return divContentAlignmentHorizontal8;
                                    }
                                    return divContentAlignmentHorizontal7;
                                }
                                return divContentAlignmentHorizontal6;
                            }
                            return divContentAlignmentHorizontal5;
                        }
                        return divContentAlignmentHorizontal4;
                    }
                    return divContentAlignmentHorizontal3;
                }
                return divContentAlignmentHorizontal2;
            }
            return divContentAlignmentHorizontal;
        }
    }

    /* compiled from: DivContentAlignmentHorizontal.kt */
    @Metadata
    /* renamed from: sb.c4$b */
    /* loaded from: classes8.dex */
    public static final class C39972b {
        private C39972b() {
        }

        public /* synthetic */ C39972b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Function1<String, DivContentAlignmentHorizontal> m11479a() {
            return DivContentAlignmentHorizontal.f104995d;
        }

        @NotNull
        /* renamed from: b */
        public final String m11478b(@NotNull DivContentAlignmentHorizontal obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return obj.f105005b;
        }
    }

    DivContentAlignmentHorizontal(String str) {
        this.f105005b = str;
    }
}
