package la;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import na.C38480a;
import org.jetbrains.annotations.NotNull;
import p759ka.AbstractC37429h;
import p759ka.C37422c;
import p759ka.Evaluable;
import p759ka.EvaluableType;
import p759ka.EvaluationContext;
import p759ka.FunctionArgument;
import p804nd.ExceptionsH;

/* compiled from: ColorFunctions.kt */
@Metadata
/* renamed from: la.n */
/* loaded from: classes8.dex */
public abstract class AbstractC38026n extends AbstractC37429h {
    @NotNull

    /* renamed from: c */
    private final Function2<C38480a, Double, C38480a> f100425c;
    @NotNull

    /* renamed from: d */
    private final List<FunctionArgument> f100426d;
    @NotNull

    /* renamed from: e */
    private final EvaluableType f100427e;

    /* renamed from: f */
    private final boolean f100428f;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC38026n(@NotNull Function2<? super C38480a, ? super Double, C38480a> componentSetter) {
        List<FunctionArgument> m17163p;
        Intrinsics.checkNotNullParameter(componentSetter, "componentSetter");
        this.f100425c = componentSetter;
        EvaluableType evaluableType = EvaluableType.COLOR;
        m17163p = C37563v.m17163p(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.NUMBER, false, 2, null));
        this.f100426d = m17163p;
        this.f100427e = evaluableType;
        this.f100428f = true;
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: c */
    protected Object mo15590c(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        List m17163p;
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args.get(0);
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        int m14643k = ((C38480a) obj).m14643k();
        Object obj2 = args.get(1);
        Intrinsics.m17073h(obj2, "null cannot be cast to non-null type kotlin.Double");
        double doubleValue = ((Double) obj2).doubleValue();
        try {
            return C38480a.m14651c(this.f100425c.mo105910invoke(C38480a.m14651c(m14643k), Double.valueOf(doubleValue)).m14643k());
        } catch (IllegalArgumentException unused) {
            String mo15588f = mo15588f();
            m17163p = C37563v.m17163p(C38480a.m14644j(m14643k), Double.valueOf(doubleValue));
            C37422c.m18100g(mo15588f, m17163p, "Value out of range 0..1.", null, 8, null);
            throw new ExceptionsH();
        }
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: d */
    public List<FunctionArgument> mo15589d() {
        return this.f100426d;
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: g */
    public EvaluableType mo15587g() {
        return this.f100427e;
    }

    @Override // p759ka.AbstractC37429h
    /* renamed from: i */
    public boolean mo15586i() {
        return this.f100428f;
    }
}
