package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC31846xw;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
final class hb2 extends Lambda implements Function1<AbstractC31846xw.C31849c.EnumC31850a, Unit> {

    /* renamed from: b */
    public static final hb2 f80027b = new hb2();

    /* renamed from: com.yandex.mobile.ads.impl.hb2$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C30454a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f80028a;

        static {
            int[] iArr = new int[AbstractC31846xw.C31849c.EnumC31850a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f80028a = iArr;
        }
    }

    hb2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC31846xw.C31849c.EnumC31850a enumC31850a) {
        AbstractC31846xw.C31849c.EnumC31850a actionType = enumC31850a;
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        int i = C30454a.f80028a[actionType.ordinal()];
        return Unit.f99208a;
    }
}
