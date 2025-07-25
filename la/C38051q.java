package la;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import na.C38480a;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFunctions.kt */
@Metadata
/* renamed from: la.q */
/* loaded from: classes8.dex */
public final class C38051q extends AbstractC38026n {
    @NotNull

    /* renamed from: g */
    public static final C38051q f100523g = new C38051q();
    @NotNull

    /* renamed from: h */
    private static final String f100524h = "setColorGreen";

    /* compiled from: ColorFunctions.kt */
    @Metadata
    /* renamed from: la.q$a */
    /* loaded from: classes8.dex */
    static final class C38052a extends Lambda implements Function2<C38480a, Double, C38480a> {

        /* renamed from: g */
        public static final C38052a f100525g = new C38052a();

        C38052a() {
            super(2);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: la.o.b(double):int
            	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
            	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
            Caused by: java.lang.ArrayIndexOutOfBoundsException
            */
        /* renamed from: a */
        public final int m15598a(int r4, double r5) {
            /*
                r3 = this;
                na.a$a r0 = na.C38480a.f101823b
                int r1 = na.C38480a.m14653a(r4)
                int r2 = na.C38480a.m14645i(r4)
                int r5 = la.C38034o.m15603b(r5)
                int r4 = na.C38480a.m14652b(r4)
                int r4 = r0.m14642a(r1, r2, r5, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: la.C38051q.C38052a.m15598a(int, double):int");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ C38480a mo105910invoke(C38480a c38480a, Double d) {
            return C38480a.m14651c(m15598a(c38480a.m14643k(), d.doubleValue()));
        }
    }

    private C38051q() {
        super(C38052a.f100525g);
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: f */
    public String mo15588f() {
        return f100524h;
    }
}
