package la;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import na.C38480a;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorFunctions.kt */
@Metadata
/* renamed from: la.s */
/* loaded from: classes8.dex */
public final class C38068s extends AbstractC38026n {
    @NotNull

    /* renamed from: g */
    public static final C38068s f100589g = new C38068s();
    @NotNull

    /* renamed from: h */
    private static final String f100590h = "setColorRed";

    /* compiled from: ColorFunctions.kt */
    @Metadata
    /* renamed from: la.s$a */
    /* loaded from: classes8.dex */
    static final class C38069a extends Lambda implements Function2<C38480a, Double, C38480a> {

        /* renamed from: g */
        public static final C38069a f100591g = new C38069a();

        C38069a() {
            super(2);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: la.o.b(double):int
            	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:76)
            	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:51)
            Caused by: java.lang.ArrayIndexOutOfBoundsException: 2
            	at java.util.ArrayList.indexOf(Unknown Source)
            	at jadx.core.utils.ListUtils.safeReplace(ListUtils.java:78)
            	at jadx.core.dex.visitors.InlineMethods.lambda$updateUsageInfo$0(InlineMethods.java:157)
            	at jadx.core.dex.nodes.InsnNode.visitInsns(InsnNode.java:280)
            	at jadx.core.dex.visitors.InlineMethods.updateUsageInfo(InlineMethods.java:149)
            	at jadx.core.dex.visitors.InlineMethods.inlineMethod(InlineMethods.java:122)
            	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
            	... 1 more
            */
        /* renamed from: a */
        public final int m15595a(int r3, double r4) {
            /*
                r2 = this;
                na.a$a r0 = na.C38480a.f101823b
                int r1 = na.C38480a.m14653a(r3)
                int r4 = la.C38034o.m15603b(r4)
                int r5 = na.C38480a.m14647g(r3)
                int r3 = na.C38480a.m14652b(r3)
                int r3 = r0.m14642a(r1, r4, r5, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: la.C38068s.C38069a.m15595a(int, double):int");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ C38480a mo105910invoke(C38480a c38480a, Double d) {
            return C38480a.m14651c(m15595a(c38480a.m14643k(), d.doubleValue()));
        }
    }

    private C38068s() {
        super(C38069a.f100591g);
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: f */
    public String mo15588f() {
        return f100590h;
    }
}
