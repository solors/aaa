package la;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import na.C38480a;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFunctions.kt */
@Metadata
/* renamed from: la.l */
/* loaded from: classes8.dex */
public final class C38010l extends AbstractC38026n {
    @NotNull

    /* renamed from: g */
    public static final C38010l f100356g = new C38010l();
    @NotNull

    /* renamed from: h */
    private static final String f100357h = "setColorBlue";

    /* compiled from: ColorFunctions.kt */
    @Metadata
    /* renamed from: la.l$a */
    /* loaded from: classes8.dex */
    static final class C38011a extends Lambda implements Function2<C38480a, Double, C38480a> {

        /* renamed from: g */
        public static final C38011a f100358g = new C38011a();

        C38011a() {
            super(2);
        }

        /* renamed from: a */
        public final int m15605a(int i, double d) {
            int m15601d;
            C38480a.C38481a c38481a = C38480a.f101823b;
            int m14653a = C38480a.m14653a(i);
            int m14645i = C38480a.m14645i(i);
            int m14647g = C38480a.m14647g(i);
            m15601d = C38034o.m15601d(d);
            return c38481a.m14642a(m14653a, m14645i, m14647g, m15601d);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ C38480a mo105910invoke(C38480a c38480a, Double d) {
            return C38480a.m14651c(m15605a(c38480a.m14643k(), d.doubleValue()));
        }
    }

    private C38010l() {
        super(C38011a.f100358g);
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: f */
    public String mo15588f() {
        return f100357h;
    }
}
