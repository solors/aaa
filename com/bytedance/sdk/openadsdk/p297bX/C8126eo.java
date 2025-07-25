package com.bytedance.sdk.openadsdk.p297bX;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C8840WR;
import com.bytedance.sdk.openadsdk.core.p334bX.C8891eqN;
import com.bytedance.sdk.openadsdk.multipro.C9307IL;
import com.bytedance.sdk.openadsdk.multipro.aidl.C9330bg;
import com.bytedance.sdk.openadsdk.multipro.aidl.p350IL.BinderC9313IL;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.bX.eo */
/* loaded from: classes3.dex */
public class C8126eo {

    /* renamed from: Lq */
    private String f17801Lq;

    /* renamed from: PX */
    private String f17802PX;

    /* renamed from: Ta */
    private String f17803Ta;

    /* renamed from: VB */
    private String f17804VB;
    private FilterWord VzQ;
    protected IListenerManager ldr;

    /* renamed from: vb */
    private int f17808vb;
    private int xxp;
    private String yDt;

    /* renamed from: bg */
    public static FilterWord f17798bg = new FilterWord("", "");

    /* renamed from: IL */
    public static int f17796IL = 1;

    /* renamed from: bX */
    public static int f17797bX = 2;
    public static int eqN = 3;

    /* renamed from: zx */
    public static int f17799zx = 4;

    /* renamed from: iR */
    private final Set<InterfaceC8131bX> f17807iR = new HashSet();

    /* renamed from: Kg */
    private final Set<InterfaceC8130IL> f17800Kg = new HashSet();

    /* renamed from: WR */
    private final Set<InterfaceC8133eqN> f17805WR = new HashSet();

    /* renamed from: eo */
    private final Set<InterfaceC8132bg> f17806eo = new HashSet();

    /* renamed from: com.bytedance.sdk.openadsdk.bX.eo$IL */
    /* loaded from: classes3.dex */
    public interface InterfaceC8130IL {
        /* renamed from: bg */
        void mo86844bg(int i);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.bX.eo$bX */
    /* loaded from: classes3.dex */
    public interface InterfaceC8131bX {
        /* renamed from: bg */
        void mo86928bg(FilterWord filterWord);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.bX.eo$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC8132bg {
        /* renamed from: bg */
        void mo86948bg(List<FilterWord> list);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.bX.eo$eqN */
    /* loaded from: classes3.dex */
    public interface InterfaceC8133eqN {
        /* renamed from: bg */
        void mo86947bg(String str);
    }

    /* renamed from: eo */
    private void m86952eo() {
        for (InterfaceC8131bX interfaceC8131bX : this.f17807iR) {
            interfaceC8131bX.mo86928bg(this.VzQ);
        }
    }

    /* renamed from: IL */
    public void m86970IL(String str) {
        this.f17802PX = str;
    }

    /* renamed from: Kg */
    public int m86969Kg() {
        return this.f17808vb;
    }

    /* renamed from: WR */
    public boolean m86968WR() {
        if (this.f17808vb < this.xxp) {
            return true;
        }
        return false;
    }

    /* renamed from: bX */
    public boolean m86967bX() {
        FilterWord filterWord = this.VzQ;
        return (filterWord == null || filterWord.equals(f17798bg)) ? false : true;
    }

    public void eqN() {
        if (!m86967bX() && !TextUtils.isEmpty(this.yDt)) {
            this.VzQ = new FilterWord("0:00", this.yDt);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.VzQ);
        if (!TextUtils.isEmpty(this.f17804VB)) {
            if (TextUtils.isEmpty(this.yDt)) {
                C8105IL.m87010bg().m87009bg(this.f17804VB, arrayList, this.f17802PX);
            } else {
                C8105IL.m87010bg().m87008bg(this.f17804VB, arrayList, this.f17801Lq, this.yDt, this.f17802PX);
            }
        }
        if (!TextUtils.isEmpty(this.f17803Ta)) {
            if (C9307IL.m83088bX()) {
                m86949zx("onItemClickClosed");
            } else {
                C8891eqN.InterfaceC8901bg m84694zx = C8840WR.m84734IL().m84694zx(this.f17803Ta);
                if (m84694zx != null) {
                    m84694zx.mo84455bg();
                    C8840WR.m84734IL().ldr(this.f17803Ta);
                }
            }
        }
        for (InterfaceC8130IL interfaceC8130IL : this.f17800Kg) {
            interfaceC8130IL.mo86844bg(f17796IL);
        }
        m86960bg(f17798bg);
        m86966bX("");
    }

    /* renamed from: iR */
    public String m86951iR() {
        return this.yDt;
    }

    public void ldr() {
        for (InterfaceC8130IL interfaceC8130IL : this.f17800Kg) {
            interfaceC8130IL.mo86844bg(f17799zx);
        }
    }

    /* renamed from: zx */
    public void m86950zx() {
        for (InterfaceC8130IL interfaceC8130IL : this.f17800Kg) {
            interfaceC8130IL.mo86844bg(f17797bX);
        }
    }

    /* renamed from: IL */
    public FilterWord m86971IL() {
        return this.VzQ;
    }

    /* renamed from: bX */
    public void m86966bX(String str) {
        this.yDt = str;
        for (InterfaceC8133eqN interfaceC8133eqN : this.f17805WR) {
            interfaceC8133eqN.mo86947bg(this.yDt);
        }
    }

    /* renamed from: bg */
    public void m86965bg() {
        this.f17807iR.clear();
        this.f17800Kg.clear();
        this.f17805WR.clear();
        this.f17806eo.clear();
    }

    /* renamed from: zx */
    private void m86949zx(final String str) {
        C9519VJ.m82579bX(new AbstractRunnableC7227Kg("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.bX.eo.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!TextUtils.isEmpty(C8126eo.this.f17803Ta)) {
                        C8126eo.this.m86964bg(6).executeDisLikeClosedCallback(C8126eo.this.f17803Ta, str);
                    }
                } catch (Throwable th) {
                    C7741PX.m87871bg("TTDislikeManager", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* renamed from: bg */
    public void m86954bg(String str) {
        this.f17804VB = str;
    }

    /* renamed from: bg */
    public void m86960bg(FilterWord filterWord) {
        this.VzQ = filterWord;
        m86952eo();
    }

    /* renamed from: bg */
    public void m86958bg(InterfaceC8131bX interfaceC8131bX) {
        this.f17807iR.add(interfaceC8131bX);
    }

    /* renamed from: bg */
    public void m86959bg(InterfaceC8130IL interfaceC8130IL) {
        this.f17800Kg.add(interfaceC8130IL);
    }

    /* renamed from: bg */
    public void m86956bg(InterfaceC8133eqN interfaceC8133eqN) {
        this.f17805WR.add(interfaceC8133eqN);
    }

    /* renamed from: bg */
    public void m86957bg(InterfaceC8132bg interfaceC8132bg) {
        this.f17806eo.add(interfaceC8132bg);
    }

    /* renamed from: bg */
    public void m86953bg(List<FilterWord> list) {
        for (InterfaceC8132bg interfaceC8132bg : this.f17806eo) {
            interfaceC8132bg.mo86948bg(list);
        }
    }

    /* renamed from: bg */
    protected IListenerManager m86964bg(int i) {
        if (this.ldr == null) {
            this.ldr = IListenerManager.Stub.asInterface(C9330bg.m83064bg().m83063bg(i));
        }
        return this.ldr;
    }

    public void eqN(String str) {
        this.f17801Lq = str;
    }

    /* renamed from: bg */
    public static void m86961bg(final int i, final String str, final C8891eqN.InterfaceC8901bg interfaceC8901bg) {
        if (C9307IL.m83088bX()) {
            C9519VJ.m82579bX(new AbstractRunnableC7227Kg("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.bX.eo.2
                @Override // java.lang.Runnable
                public void run() {
                    C9330bg m83064bg = C9330bg.m83064bg();
                    if (i == 6 && interfaceC8901bg != null) {
                        try {
                            BinderC9313IL binderC9313IL = new BinderC9313IL(str, interfaceC8901bg);
                            IListenerManager asInterface = IListenerManager.Stub.asInterface(m83064bg.m83063bg(6));
                            if (asInterface != null) {
                                asInterface.registerDisLikeClosedListener(str, binderC9313IL);
                            }
                        } catch (RemoteException e) {
                            C7741PX.m87873bg("TTDislikeManager", e.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }

    /* renamed from: bg */
    public static void m86962bg(final int i, final String str) {
        if (C9307IL.m83088bX()) {
            C9519VJ.m82579bX(new AbstractRunnableC7227Kg("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.bX.eo.3
                @Override // java.lang.Runnable
                public void run() {
                    C9330bg m83064bg = C9330bg.m83064bg();
                    if (i == 6) {
                        try {
                            IListenerManager asInterface = IListenerManager.Stub.asInterface(m83064bg.m83063bg(6));
                            if (asInterface != null) {
                                asInterface.unregisterDisLikeClosedListener(str);
                            }
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }, 5);
        }
    }

    /* renamed from: bg */
    public void m86963bg(int i, int i2) {
        this.f17808vb = i;
        this.xxp = i2;
    }
}
