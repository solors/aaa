package p1013v9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: v9.c */
/* loaded from: classes8.dex */
public final class RegexValidator extends BaseValidator {
    @NotNull

    /* renamed from: b */
    private final Regex f116889b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegexValidator(@NotNull Regex regex, boolean z) {
        super(z);
        Intrinsics.checkNotNullParameter(regex, "regex");
        this.f116889b = regex;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r0 == false) goto L11;
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
            int r0 = r4.length()
            if (r0 != 0) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 != 0) goto L20
        L18:
            kotlin.text.Regex r0 = r3.f116889b
            boolean r4 = r0.m16766e(r4)
            if (r4 == 0) goto L21
        L20:
            r1 = r2
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1013v9.RegexValidator.mo2659b(java.lang.String):boolean");
    }
}
