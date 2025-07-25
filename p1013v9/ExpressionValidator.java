package p1013v9;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: v9.b */
/* loaded from: classes8.dex */
public final class ExpressionValidator extends BaseValidator {
    @NotNull

    /* renamed from: b */
    private final Functions<Boolean> f116888b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressionValidator(boolean z, @NotNull Functions<Boolean> calculateExpression) {
        super(z);
        Intrinsics.checkNotNullParameter(calculateExpression, "calculateExpression");
        this.f116888b = calculateExpression;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r4 == false) goto L11;
     */
    @Override // p1013v9.BaseValidator
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo2659b(@org.jetbrains.annotations.NotNull java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r3.m2660a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            int r4 = r4.length()
            if (r4 != 0) goto L15
            r4 = r2
            goto L16
        L15:
            r4 = r1
        L16:
            if (r4 != 0) goto L26
        L18:
            kotlin.jvm.functions.Function0<java.lang.Boolean> r4 = r3.f116888b
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L27
        L26:
            r1 = r2
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1013v9.ExpressionValidator.mo2659b(java.lang.String):boolean");
    }
}
