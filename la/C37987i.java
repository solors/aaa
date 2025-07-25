package la;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import na.C38480a;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFunctions.kt */
@Metadata
/* renamed from: la.i */
/* loaded from: classes8.dex */
public final class C37987i extends AbstractC38026n {
    @NotNull

    /* renamed from: g */
    public static final C37987i f100249g = new C37987i();
    @NotNull

    /* renamed from: h */
    private static final String f100250h = "setColorAlpha";

    /* compiled from: ColorFunctions.kt */
    @Metadata
    /* renamed from: la.i$a */
    /* loaded from: classes8.dex */
    static final class C37988a extends Lambda implements Function2<C38480a, Double, C38480a> {

        /* renamed from: g */
        public static final C37988a f100251g = new C37988a();

        C37988a() {
            super(2);
        }

        /* renamed from: a */
        public final int m15609a(int i, double d) {
            int m15601d;
            C38480a.C38481a c38481a = C38480a.f101823b;
            m15601d = C38034o.m15601d(d);
            return c38481a.m14642a(m15601d, C38480a.m14645i(i), C38480a.m14647g(i), C38480a.m14652b(i));
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ C38480a mo105910invoke(C38480a c38480a, Double d) {
            return C38480a.m14651c(m15609a(c38480a.m14643k(), d.doubleValue()));
        }
    }

    private C37987i() {
        super(C37988a.f100251g);
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: f */
    public String mo15588f() {
        return f100250h;
    }
}
