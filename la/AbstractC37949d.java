package la;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p759ka.AbstractC37429h;
import p759ka.EvaluableType;
import p759ka.FunctionArgument;

/* compiled from: ArrayFunctions.kt */
@Metadata
/* renamed from: la.d */
/* loaded from: classes8.dex */
public abstract class AbstractC37949d extends AbstractC37429h {
    @NotNull

    /* renamed from: c */
    private final EvaluableType f100089c;
    @NotNull

    /* renamed from: d */
    private final List<FunctionArgument> f100090d;

    /* renamed from: e */
    private final boolean f100091e;

    public AbstractC37949d(@NotNull EvaluableType resultType) {
        List<FunctionArgument> m17163p;
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        this.f100089c = resultType;
        m17163p = C37563v.m17163p(new FunctionArgument(EvaluableType.ARRAY, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null), new FunctionArgument(resultType, false, 2, null));
        this.f100090d = m17163p;
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: d */
    public List<FunctionArgument> mo15589d() {
        return this.f100090d;
    }

    @Override // p759ka.AbstractC37429h
    @NotNull
    /* renamed from: g */
    public final EvaluableType mo15587g() {
        return this.f100089c;
    }

    @Override // p759ka.AbstractC37429h
    /* renamed from: i */
    public boolean mo15586i() {
        return this.f100091e;
    }
}
