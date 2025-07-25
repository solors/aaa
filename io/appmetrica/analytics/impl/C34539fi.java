package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fi */
/* loaded from: classes9.dex */
public final class C34539fi implements InterfaceC34867rn {

    /* renamed from: a */
    public final C34841qn f94385a = new C34841qn();

    @Override // io.appmetrica.analytics.impl.InterfaceC34867rn
    /* renamed from: a */
    public final C34814pn mo20778a(@Nullable Revenue revenue) {
        C34814pn c34814pn;
        C34841qn c34841qn = this.f94385a;
        C34814pn[] c34814pnArr = new C34814pn[1];
        C34617if c34617if = new C34617if();
        Integer num = revenue.quantity;
        if (num != null && num.intValue() <= 0) {
            c34814pn = new C34814pn(c34617if, false, "Invalid quantity value " + num);
        } else {
            c34814pn = new C34814pn(c34617if, true, "");
        }
        c34814pnArr[0] = c34814pn;
        List<C34814pn> asList = Arrays.asList(c34814pnArr);
        c34841qn.getClass();
        return c34841qn.mo20778a(asList);
    }
}
