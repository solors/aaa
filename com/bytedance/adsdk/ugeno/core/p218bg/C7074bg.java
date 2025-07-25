package com.bytedance.adsdk.ugeno.core.p218bg;

import android.util.Log;
import com.bytedance.adsdk.ugeno.core.C7077eo;
import com.bytedance.adsdk.ugeno.core.InterfaceC7065PX;
import com.bytedance.adsdk.ugeno.eqN.C7086IL;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import com.bytedance.sdk.component.uchain.action.EventChainAction;
import com.bytedance.sdk.component.uchain.listener.ICustomRouter;
import com.bytedance.sdk.component.uchain.listener.IEventChainLifeCycleListener;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.core.bg.bg */
/* loaded from: classes3.dex */
public class C7074bg implements InterfaceC7065PX {

    /* renamed from: IL */
    private String f15206IL;

    /* renamed from: bg */
    private InterfaceC7065PX f15208bg;
    private JSONObject eqN;

    /* renamed from: zx */
    private volatile C7076bg f15209zx;

    /* renamed from: bX */
    private boolean f15207bX = true;
    private boolean ldr = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.adsdk.ugeno.core.bg.bg$bg */
    /* loaded from: classes3.dex */
    public class C7076bg implements ICustomRouter {

        /* renamed from: bX */
        private C7077eo f15212bX;

        /* renamed from: bg */
        InterfaceC7065PX.InterfaceC7067bg f15213bg;
        private InterfaceC7065PX.InterfaceC7066IL eqN;

        C7076bg() {
        }

        /* renamed from: bg */
        public void m90102bg(C7077eo c7077eo) {
            this.f15212bX = c7077eo;
        }

        /* renamed from: bg */
        public void m90104bg(InterfaceC7065PX.InterfaceC7066IL interfaceC7066IL) {
            this.eqN = interfaceC7066IL;
        }

        /* renamed from: bg */
        public void m90103bg(InterfaceC7065PX.InterfaceC7067bg interfaceC7067bg) {
            this.f15213bg = interfaceC7067bg;
        }
    }

    public C7074bg(InterfaceC7065PX interfaceC7065PX) {
        this.f15208bg = interfaceC7065PX;
    }

    /* renamed from: bX */
    private void m90118bX(C7077eo c7077eo, InterfaceC7065PX.InterfaceC7066IL interfaceC7066IL, InterfaceC7065PX.InterfaceC7067bg interfaceC7067bg) {
        if (this.f15209zx == null) {
            this.f15209zx = m90128IL();
        }
        this.f15209zx.m90102bg(c7077eo);
        this.f15209zx.m90104bg(interfaceC7066IL);
        this.f15209zx.m90103bg(interfaceC7067bg);
        JSONObject m90099bX = c7077eo.m90099bX();
        if (m90099bX == null) {
            return;
        }
        new EventChainAction.Builder(m90099bX.optString("type")).setChainData(this.eqN).setEventChainLifeCycleListener(new IEventChainLifeCycleListener() { // from class: com.bytedance.adsdk.ugeno.core.bg.bg.1
        }).build().run();
    }

    /* renamed from: IL */
    public void m90123IL(boolean z) {
        this.ldr = z;
    }

    /* renamed from: bg */
    public void m90111bg(JSONObject jSONObject) {
        this.eqN = jSONObject;
    }

    /* renamed from: IL */
    private void m90125IL(C7077eo c7077eo, InterfaceC7065PX.InterfaceC7066IL interfaceC7066IL, InterfaceC7065PX.InterfaceC7067bg interfaceC7067bg) {
        InterfaceC7065PX interfaceC7065PX = this.f15208bg;
        if (interfaceC7065PX == null) {
            return;
        }
        interfaceC7065PX.mo84830bg(c7077eo, interfaceC7066IL, interfaceC7067bg);
    }

    public void bg(String str) {
        this.f15206IL = str;
    }

    /* renamed from: bg */
    public void m90109bg(boolean z) {
        this.f15207bX = z;
    }

    /* renamed from: IL */
    private C7076bg m90128IL() {
        if (this.f15209zx != null) {
            return this.f15209zx;
        }
        synchronized (C7076bg.class) {
            if (this.f15209zx != null) {
                return this.f15209zx;
            }
            this.f15209zx = new C7076bg();
            return this.f15209zx;
        }
    }

    /* renamed from: bg */
    public boolean m90115bg() {
        String str;
        return this.f15207bX && (str = this.f15206IL) != null && "3".compareTo(str) <= 0 && this.eqN != null;
    }

    @Override // com.bytedance.adsdk.ugeno.core.InterfaceC7065PX
    /* renamed from: bg */
    public void mo84830bg(C7077eo c7077eo, InterfaceC7065PX.InterfaceC7066IL interfaceC7066IL, InterfaceC7065PX.InterfaceC7067bg interfaceC7067bg) {
        if (m90115bg()) {
            m90118bX(c7077eo, interfaceC7066IL, interfaceC7067bg);
        } else {
            m90125IL(c7077eo, interfaceC7066IL, interfaceC7067bg);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.InterfaceC7065PX
    /* renamed from: bg */
    public void mo84783bg(AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, String str, C7086IL.C7087bg c7087bg) {
        InterfaceC7065PX interfaceC7065PX = this.f15208bg;
        if (interfaceC7065PX == null) {
            return;
        }
        interfaceC7065PX.mo84783bg(abstractView$OnTouchListenerC6981bX, str, c7087bg);
        Log.d("UGenEvent", "onUGenEvent: ");
    }
}
