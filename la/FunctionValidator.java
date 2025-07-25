package la;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p759ka.AbstractC37429h;
import p759ka.C37422c;
import p759ka.EvaluableException;
import p759ka.EvaluableType;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: la.c1 */
/* loaded from: classes8.dex */
public final class FunctionValidator {
    @NotNull
    /* renamed from: a */
    public static final Exception m15636a(@NotNull String name, @NotNull List<? extends EvaluableType> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        if (args.isEmpty()) {
            return new EvaluableException("Function requires non empty argument list.", null, 2, null);
        }
        return new EvaluableException("Function has no matching overload for given argument types: " + C37422c.m18097j(args) + '.', null, 2, null);
    }

    @NotNull
    /* renamed from: b */
    public static final AbstractC37429h m15635b(@NotNull AbstractC37429h abstractC37429h, @NotNull List<? extends EvaluableType> args) {
        String str;
        Intrinsics.checkNotNullParameter(abstractC37429h, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        AbstractC37429h.AbstractC37432c m18062k = abstractC37429h.m18062k(args);
        if (m18062k instanceof AbstractC37429h.AbstractC37432c.C37435c) {
            return abstractC37429h;
        }
        if (m18062k instanceof AbstractC37429h.AbstractC37432c.C37433a) {
            StringBuilder sb2 = new StringBuilder();
            if (abstractC37429h.m18065e()) {
                str = "At least";
            } else {
                str = "Exactly";
            }
            sb2.append(str);
            sb2.append(' ');
            sb2.append(((AbstractC37429h.AbstractC37432c.C37433a) m18062k).m18060a());
            sb2.append(" argument(s) expected.");
            throw new EvaluableException(sb2.toString(), null, 2, null);
        } else if (m18062k instanceof AbstractC37429h.AbstractC37432c.C37434b) {
            if (Intrinsics.m17075f(abstractC37429h.m18061l(args), AbstractC37429h.AbstractC37432c.C37435c.f98798a)) {
                return abstractC37429h;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Invalid argument type: expected ");
            AbstractC37429h.AbstractC37432c.C37434b c37434b = (AbstractC37429h.AbstractC37432c.C37434b) m18062k;
            sb3.append(c37434b.m18058b());
            sb3.append(", got ");
            sb3.append(c37434b.m18059a());
            sb3.append('.');
            throw new EvaluableException(sb3.toString(), null, 2, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
