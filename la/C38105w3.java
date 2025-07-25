package la;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p759ka.Evaluable;
import p759ka.EvaluableType;
import p759ka.EvaluationContext;

/* compiled from: ArrayFunctions.kt */
@Metadata
/* renamed from: la.w3 */
/* loaded from: classes8.dex */
public final class C38105w3 extends AbstractC37949d {
    @NotNull

    /* renamed from: f */
    public static final C38105w3 f100738f = new C38105w3();
    @NotNull

    /* renamed from: g */
    private static final String f100739g = "getOptIntegerFromArray";

    private C38105w3() {
        super(EvaluableType.INTEGER);
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
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj).longValue();
        m15642g = C37942c.m15642g(mo15588f(), args);
        if (m15642g instanceof Integer) {
            longValue = ((Number) m15642g).intValue();
        } else if (m15642g instanceof Long) {
            longValue = ((Number) m15642g).longValue();
        }
        return Long.valueOf(longValue);
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: f */
    public String mo15588f() {
        return f100739g;
    }
}
