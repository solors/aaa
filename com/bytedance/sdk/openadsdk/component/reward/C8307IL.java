package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.utils.C7740Lq;
import com.bytedance.sdk.component.utils.C7755iR;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.IL */
/* loaded from: classes3.dex */
public class C8307IL extends AbstractRunnableC7227Kg {

    /* renamed from: bg */
    private final List<? extends AbstractRunnableC7227Kg> f18187bg;

    public C8307IL(String str, List<? extends AbstractRunnableC7227Kg> list) {
        super(str);
        this.f18187bg = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends AbstractRunnableC7227Kg> list;
        if (C7740Lq.m87886bX(C8838VzQ.m84740bg()) != 0 && (list = this.f18187bg) != null) {
            Iterator<? extends AbstractRunnableC7227Kg> it = list.iterator();
            while (it.hasNext()) {
                C9519VJ.m82576bg(it.next(), 1);
                it.remove();
            }
        }
        try {
            C7755iR.m87831bg().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
