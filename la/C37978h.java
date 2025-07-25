package la;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import na.C38480a;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFunctions.kt */
@Metadata
/* renamed from: la.h */
/* loaded from: classes8.dex */
public final class C37978h extends AbstractC38019m {
    @NotNull

    /* renamed from: g */
    public static final C37978h f100215g = new C37978h();
    @NotNull

    /* renamed from: h */
    private static final String f100216h = "getColorAlpha";

    /* compiled from: ColorFunctions.kt */
    @Metadata
    /* renamed from: la.h$a */
    /* loaded from: classes8.dex */
    static final class C37979a extends Lambda implements Function1<C38480a, Integer> {

        /* renamed from: g */
        public static final C37979a f100217g = new C37979a();

        C37979a() {
            super(1);
        }

        @NotNull
        /* renamed from: a */
        public final Integer m15623a(int i) {
            return Integer.valueOf(C38480a.m14653a(i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(C38480a c38480a) {
            return m15623a(c38480a.m14643k());
        }
    }

    private C37978h() {
        super(C37979a.f100217g);
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: f */
    public String mo15588f() {
        return f100216h;
    }
}
