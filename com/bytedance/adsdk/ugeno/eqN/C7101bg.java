package com.bytedance.adsdk.ugeno.eqN;

import android.content.Context;
import com.bytedance.adsdk.ugeno.eqN.p220bX.AbstractC7097bg;
import com.bytedance.adsdk.ugeno.eqN.p220bX.C7096bX;
import com.bytedance.adsdk.ugeno.eqN.p220bX.C7099eqN;
import com.bytedance.adsdk.ugeno.eqN.p220bX.C7100zx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.adsdk.ugeno.eqN.bg */
/* loaded from: classes3.dex */
public class C7101bg implements InterfaceC7109eqN {
    @Override // com.bytedance.adsdk.ugeno.eqN.InterfaceC7109eqN
    /* renamed from: bg */
    public List<C7094bX> mo90026bg() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C7094bX("slide") { // from class: com.bytedance.adsdk.ugeno.eqN.bg.1
            @Override // com.bytedance.adsdk.ugeno.eqN.C7094bX
            /* renamed from: bg */
            public AbstractC7097bg mo90032bg(Context context) {
                return new C7096bX(context);
            }
        });
        arrayList.add(new C7094bX("tap") { // from class: com.bytedance.adsdk.ugeno.eqN.bg.2
            @Override // com.bytedance.adsdk.ugeno.eqN.C7094bX
            /* renamed from: bg */
            public AbstractC7097bg mo90032bg(Context context) {
                return new C7099eqN(context);
            }
        });
        arrayList.add(new C7094bX("timer") { // from class: com.bytedance.adsdk.ugeno.eqN.bg.3
            @Override // com.bytedance.adsdk.ugeno.eqN.C7094bX
            /* renamed from: bg */
            public AbstractC7097bg mo90032bg(Context context) {
                return new C7100zx(context);
            }
        });
        return arrayList;
    }
}
