package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.EnumC14630w;
import com.fyber.inneractive.sdk.response.InterfaceC15390i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.measurement.h */
/* loaded from: classes4.dex */
public final class C14589h implements InterfaceC15390i {

    /* renamed from: a */
    public final /* synthetic */ List f27635a;

    /* renamed from: b */
    public final /* synthetic */ EnumC14591j f27636b;

    public C14589h(List list, EnumC14591j enumC14591j) {
        this.f27635a = list;
        this.f27636b = enumC14591j;
    }

    @Override // com.fyber.inneractive.sdk.response.InterfaceC15390i
    /* renamed from: a */
    public final List mo76574a(EnumC14630w enumC14630w) {
        if (enumC14630w != null && this.f27635a != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f27635a) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str.replace("[REASON]", String.valueOf(this.f27636b.mReason)));
                }
            }
            return arrayList;
        }
        return null;
    }
}
