package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.qn */
/* loaded from: classes9.dex */
public final class C34841qn implements InterfaceC34867rn {
    @Override // io.appmetrica.analytics.impl.InterfaceC34867rn
    /* renamed from: a */
    public final C34814pn mo20778a(@Nullable List<C34814pn> list) {
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (C34814pn c34814pn : list) {
            if (!c34814pn.f95187a) {
                linkedList.add(c34814pn.f95188b);
                z = false;
            }
        }
        if (z) {
            return new C34814pn(this, true, "");
        }
        return new C34814pn(this, false, TextUtils.join(", ", linkedList));
    }
}
