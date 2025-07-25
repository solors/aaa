package la;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import na.C38480a;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFunctions.kt */
@Metadata
/* renamed from: la.k */
/* loaded from: classes8.dex */
public final class C38002k extends AbstractC38019m {
    @NotNull

    /* renamed from: g */
    public static final C38002k f100321g = new C38002k();
    @NotNull

    /* renamed from: h */
    private static final String f100322h = "getColorBlue";

    /* compiled from: ColorFunctions.kt */
    @Metadata
    /* renamed from: la.k$a */
    /* loaded from: classes8.dex */
    static final class C38003a extends Lambda implements Function1<C38480a, Integer> {

        /* renamed from: g */
        public static final C38003a f100323g = new C38003a();

        C38003a() {
            super(1);
        }

        @NotNull
        /* renamed from: a */
        public final Integer m15606a(int i) {
            return Integer.valueOf(C38480a.m14652b(i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(C38480a c38480a) {
            return m15606a(c38480a.m14643k());
        }
    }

    private C38002k() {
        super(C38003a.f100323g);
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: f */
    public String mo15588f() {
        return f100322h;
    }
}
