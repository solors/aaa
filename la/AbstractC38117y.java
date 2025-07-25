package la;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsJVM;
import kotlin.collections._Collections;
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
/* renamed from: la.y */
/* loaded from: classes8.dex */
public abstract class AbstractC38117y extends AbstractC37429h {
    @NotNull

    /* renamed from: c */
    private final AbstractC38019m f100792c;
    @NotNull

    /* renamed from: d */
    private final List<FunctionArgument> f100793d;
    @NotNull

    /* renamed from: e */
    private final EvaluableType f100794e;

    /* renamed from: f */
    private final boolean f100795f;

    public AbstractC38117y(@NotNull AbstractC38019m componentGetter) {
        List<FunctionArgument> m17175e;
        Intrinsics.checkNotNullParameter(componentGetter, "componentGetter");
        this.f100792c = componentGetter;
        m17175e = CollectionsJVM.m17175e(new FunctionArgument(EvaluableType.STRING, false, 2, null));
        this.f100793d = m17175e;
        this.f100794e = EvaluableType.NUMBER;
        this.f100795f = true;
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: c */
    protected Object mo15590c(@NotNull EvaluationContext evaluationContext, @NotNull Evaluable expressionContext, @NotNull List<? extends Object> args) {
        Object m17531p0;
        List<? extends Object> m17175e;
        Intrinsics.checkNotNullParameter(evaluationContext, "evaluationContext");
        Intrinsics.checkNotNullParameter(expressionContext, "expressionContext");
        Intrinsics.checkNotNullParameter(args, "args");
        m17531p0 = _Collections.m17531p0(args);
        Intrinsics.m17073h(m17531p0, "null cannot be cast to non-null type kotlin.String");
        try {
            int m14641b = C38480a.f101823b.m14641b((String) m17531p0);
            AbstractC38019m abstractC38019m = this.f100792c;
            m17175e = CollectionsJVM.m17175e(C38480a.m14651c(m14641b));
            return abstractC38019m.m18064h(evaluationContext, expressionContext, m17175e);
        } catch (IllegalArgumentException e) {
            C37422c.m18101f(mo15588f(), args, "Unable to convert value to Color, expected format #AARRGGBB.", e);
            throw new ExceptionsH();
        }
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: d */
    public List<FunctionArgument> mo15589d() {
        return this.f100793d;
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: g */
    public EvaluableType mo15587g() {
        return this.f100794e;
    }

    @Override // p759ka.AbstractC37429h
    /* renamed from: i */
    public boolean mo15586i() {
        return this.f100795f;
    }
}
