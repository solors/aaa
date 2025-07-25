package la;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import na.C38480a;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFunctions.kt */
@Metadata
/* renamed from: la.p */
/* loaded from: classes8.dex */
public final class C38042p extends AbstractC38019m {
    @NotNull

    /* renamed from: g */
    public static final C38042p f100491g = new C38042p();
    @NotNull

    /* renamed from: h */
    private static final String f100492h = "getColorGreen";

    /* compiled from: ColorFunctions.kt */
    @Metadata
    /* renamed from: la.p$a */
    /* loaded from: classes8.dex */
    static final class C38043a extends Lambda implements Function1<C38480a, Integer> {

        /* renamed from: g */
        public static final C38043a f100493g = new C38043a();

        C38043a() {
            super(1);
        }

        @NotNull
        /* renamed from: a */
        public final Integer m15600a(int i) {
            return Integer.valueOf(C38480a.m14647g(i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(C38480a c38480a) {
            return m15600a(c38480a.m14643k());
        }
    }

    private C38042p() {
        super(C38043a.f100493g);
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: f */
    public String mo15588f() {
        return f100492h;
    }
}
