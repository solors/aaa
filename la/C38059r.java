package la;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import na.C38480a;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFunctions.kt */
@Metadata
/* renamed from: la.r */
/* loaded from: classes8.dex */
public final class C38059r extends AbstractC38019m {
    @NotNull

    /* renamed from: g */
    public static final C38059r f100555g = new C38059r();
    @NotNull

    /* renamed from: h */
    private static final String f100556h = "getColorRed";

    /* compiled from: ColorFunctions.kt */
    @Metadata
    /* renamed from: la.r$a */
    /* loaded from: classes8.dex */
    static final class C38060a extends Lambda implements Function1<C38480a, Integer> {

        /* renamed from: g */
        public static final C38060a f100557g = new C38060a();

        C38060a() {
            super(1);
        }

        @NotNull
        /* renamed from: a */
        public final Integer m15597a(int i) {
            return Integer.valueOf(C38480a.m14645i(i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(C38480a c38480a) {
            return m15597a(c38480a.m14643k());
        }
    }

    private C38059r() {
        super(C38060a.f100557g);
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: f */
    public String mo15588f() {
        return f100556h;
    }
}
