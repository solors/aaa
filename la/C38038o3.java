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
/* renamed from: la.o3 */
/* loaded from: classes8.dex */
public final class C38038o3 extends AbstractC37949d {
    @NotNull

    /* renamed from: f */
    public static final C38038o3 f100474f = new C38038o3();
    @NotNull

    /* renamed from: g */
    private static final String f100475g = "getOptBooleanFromArray";

    private C38038o3() {
        super(EvaluableType.BOOLEAN);
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: c */
    protected Object mo15590c(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Object m15642g;
        Boolean bool;
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args.get(2);
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m15642g = C37942c.m15642g(mo15588f(), args);
        if (m15642g instanceof Boolean) {
            bool = (Boolean) m15642g;
        } else {
            bool = null;
        }
        if (bool == null) {
            return Boolean.valueOf(booleanValue);
        }
        return bool;
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: f */
    public String mo15588f() {
        return f100475g;
    }
}
