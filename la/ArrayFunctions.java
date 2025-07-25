package la;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p759ka.Evaluable;
import p759ka.EvaluableType;
import p759ka.EvaluationContext;

@Metadata
/* renamed from: la.a4 */
/* loaded from: classes8.dex */
public final class ArrayFunctions extends AbstractC37949d {
    @NotNull

    /* renamed from: f */
    public static final ArrayFunctions f100016f = new ArrayFunctions();
    @NotNull

    /* renamed from: g */
    private static final String f100017g = "getOptStringFromArray";

    private ArrayFunctions() {
        super(EvaluableType.STRING);
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: c */
    protected Object mo15590c(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Object m15642g;
        String str;
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args.get(2);
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj;
        m15642g = C37942c.m15642g(mo15588f(), args);
        if (m15642g instanceof String) {
            str = (String) m15642g;
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        return str2;
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: f */
    public String mo15588f() {
        return f100017g;
    }
}
