package com.yandex.mobile.ads.impl;

import com.yandex.div.core.DivKit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ux0 extends by0 {

    /* renamed from: a */
    private final boolean f86448a;
    @NotNull

    /* renamed from: b */
    private final v52 f86449b;

    public /* synthetic */ ux0() {
        this(new v52());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.mobile.ads.impl.by0
    /* renamed from: a */
    public final void mo28604a(@NotNull Function1<? super em0, Unit> onValidationFailed) {
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(onValidationFailed, "onValidationFailed");
        try {
            v52 v52Var = this.f86449b;
            String m37180b = DivKit.f75363b.m37180b();
            v52Var.getClass();
            u52 m28523a = v52.m28523a(m37180b);
            this.f86449b.getClass();
            u52 m28523a2 = v52.m28523a("30.14.0");
            if (m28523a2 != null) {
                num = Integer.valueOf(m28523a2.m28878a());
            } else {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                if (m28523a != null && (this.f86448a || m28523a.m28878a() == intValue)) {
                    return;
                }
                Object[] objArr = new Object[2];
                objArr[0] = num;
                if (m28523a != null) {
                    num2 = Integer.valueOf(m28523a.m28878a());
                } else {
                    num2 = null;
                }
                objArr[1] = num2;
                String m28089a = C31714w0.m28089a(objArr, 2, "Unsupported DivKit major version. Expected: %s. Actual: %s", "format(...)");
                onValidationFailed.invoke(new em0(m28089a, m28089a));
                throw null;
            }
        } catch (NoClassDefFoundError unused) {
            String m28089a2 = C31714w0.m28089a(new Object[0], 0, "DivKit is unavailable. Please check your buildscripts for exclusion rules for 'com.yandex.div:div'", "format(...)");
            onValidationFailed.invoke(new em0(m28089a2, m28089a2));
            throw null;
        }
    }

    public ux0(@NotNull v52 versionNameParser) {
        Intrinsics.checkNotNullParameter(versionNameParser, "versionNameParser");
        this.f86448a = false;
        this.f86449b = versionNameParser;
    }
}
