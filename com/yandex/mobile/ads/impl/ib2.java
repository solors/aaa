package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC31846xw;
import com.yandex.mobile.ads.impl.InterfaceC31400sw;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class ib2 extends Lambda implements Function2<AbstractC31846xw.C31855h.EnumC31856a, Boolean, Unit> {

    /* renamed from: b */
    final /* synthetic */ nb2 f80399b;

    /* renamed from: com.yandex.mobile.ads.impl.ib2$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C30542a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f80400a;

        static {
            int[] iArr = new int[AbstractC31846xw.C31855h.EnumC31856a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f80400a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib2(nb2 nb2Var) {
        super(2);
        this.f80399b = nb2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public final Unit mo105910invoke(AbstractC31846xw.C31855h.EnumC31856a enumC31856a, Boolean bool) {
        Function1 function1;
        AbstractC31846xw.C31855h.EnumC31856a switchType = enumC31856a;
        boolean booleanValue = bool.booleanValue();
        Intrinsics.checkNotNullParameter(switchType, "switchType");
        if (C30542a.f80400a[switchType.ordinal()] == 1) {
            function1 = this.f80399b.f82663a;
            function1.invoke(new InterfaceC31400sw.C31405e(booleanValue));
        }
        return Unit.f99208a;
    }
}
