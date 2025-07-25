package la;

import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p759ka.Evaluable;
import p759ka.EvaluableType;
import p759ka.EvaluationContext;

/* compiled from: ArrayFunctions.kt */
@Metadata
/* renamed from: la.y3 */
/* loaded from: classes8.dex */
public final class C38121y3 extends AbstractC37949d {
    @NotNull

    /* renamed from: f */
    public static final C38121y3 f100808f = new C38121y3();
    @NotNull

    /* renamed from: g */
    private static final String f100809g = "getOptNumberFromArray";

    private C38121y3() {
        super(EvaluableType.NUMBER);
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: c */
    protected Object mo15590c(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Object m15642g;
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args.get(2);
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type kotlin.Double");
        double doubleValue = ((Double) obj).doubleValue();
        m15642g = C37942c.m15642g(mo15588f(), args);
        if (m15642g instanceof Double) {
            doubleValue = ((Number) m15642g).doubleValue();
        } else if (m15642g instanceof Integer) {
            doubleValue = ((Number) m15642g).intValue();
        } else if (m15642g instanceof Long) {
            doubleValue = ((Number) m15642g).longValue();
        } else if (m15642g instanceof BigDecimal) {
            doubleValue = ((BigDecimal) m15642g).doubleValue();
        }
        return Double.valueOf(doubleValue);
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: f */
    public String mo15588f() {
        return f100809g;
    }
}
