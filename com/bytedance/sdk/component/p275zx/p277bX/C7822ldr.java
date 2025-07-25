package com.bytedance.sdk.component.p275zx.p277bX;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.p275zx.InterfaceC7769Fy;
import com.bytedance.sdk.component.p275zx.InterfaceC7770IL;
import com.bytedance.sdk.component.p275zx.InterfaceC7779PX;
import com.bytedance.sdk.component.p275zx.InterfaceC7780Ta;
import com.bytedance.sdk.component.p275zx.InterfaceC7782VzQ;
import com.bytedance.sdk.component.p275zx.InterfaceC7784bX;
import com.bytedance.sdk.component.p275zx.InterfaceC7832eqN;
import com.bytedance.sdk.component.p275zx.InterfaceC7849tC;
import com.bytedance.sdk.component.p275zx.InterfaceC7850tuV;
import com.bytedance.sdk.component.p275zx.p276IL.C7771IL;
import com.bytedance.sdk.component.p275zx.p277bX.p278IL.C7786bg;
import com.bytedance.sdk.component.p275zx.p277bX.p280bg.C7808bg;
import com.bytedance.sdk.component.p275zx.p277bX.p280bg.p281IL.C7804bg;
import com.bytedance.sdk.component.p275zx.p277bX.p280bg.p281IL.C7806zx;
import com.bytedance.sdk.component.p275zx.p277bX.p280bg.p282bg.C7809IL;
import com.bytedance.sdk.component.p275zx.p283bg.C7827IL;
import com.bytedance.sdk.component.p275zx.p283bg.C7829bX;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.component.zx.bX.ldr */
/* loaded from: classes3.dex */
public class C7822ldr {

    /* renamed from: IL */
    private final InterfaceC7780Ta f17080IL;

    /* renamed from: Kg */
    private ExecutorService f17081Kg;

    /* renamed from: WR */
    private InterfaceC7782VzQ f17082WR;

    /* renamed from: iR */
    private InterfaceC7779PX f17085iR;
    private InterfaceC7832eqN ldr;

    /* renamed from: bg */
    private Map<String, List<C7788bX>> f17084bg = new ConcurrentHashMap();

    /* renamed from: bX */
    private Map<String, InterfaceC7850tuV> f17083bX = new HashMap();
    private Map<String, InterfaceC7769Fy> eqN = new HashMap();

    /* renamed from: zx */
    private Map<String, InterfaceC7784bX> f17086zx = new HashMap();

    public C7822ldr(Context context, InterfaceC7780Ta interfaceC7780Ta) {
        this.f17080IL = (InterfaceC7780Ta) C7787Kg.m87772bg(interfaceC7780Ta);
        C7808bg.m87684bg(context, interfaceC7780Ta.mo87603WR());
    }

    /* renamed from: PX */
    private InterfaceC7782VzQ m87618PX() {
        InterfaceC7782VzQ mo87604Kg = this.f17080IL.mo87604Kg();
        if (mo87604Kg == null) {
            return new C7821iR();
        }
        return mo87604Kg;
    }

    /* renamed from: VB */
    private ExecutorService m87617VB() {
        ExecutorService mo87605IL = this.f17080IL.mo87605IL();
        if (mo87605IL != null) {
            return mo87605IL;
        }
        return C7829bX.m87579bg();
    }

    /* renamed from: WR */
    private InterfaceC7832eqN m87616WR() {
        InterfaceC7832eqN eqN = this.f17080IL.eqN();
        if (eqN == null) {
            return C7771IL.m87785bg();
        }
        return eqN;
    }

    /* renamed from: eo */
    private InterfaceC7779PX m87609eo() {
        InterfaceC7779PX mo87601bg = this.f17080IL.mo87601bg();
        if (mo87601bg != null) {
            return mo87601bg;
        }
        return C7827IL.m87583bg();
    }

    private InterfaceC7850tuV eqN(InterfaceC7770IL interfaceC7770IL) {
        InterfaceC7850tuV mo87598zx = this.f17080IL.mo87598zx();
        if (mo87598zx != null) {
            return C7804bg.m87699bg(mo87598zx);
        }
        return C7804bg.m87700bg(interfaceC7770IL.mo87688IL());
    }

    private InterfaceC7784bX ldr(InterfaceC7770IL interfaceC7770IL) {
        InterfaceC7784bX mo87599iR = this.f17080IL.mo87599iR();
        return mo87599iR != null ? mo87599iR : new C7809IL(interfaceC7770IL.mo87681zx(), interfaceC7770IL.mo87685bg(), ldr());
    }

    /* renamed from: zx */
    private InterfaceC7769Fy m87606zx(InterfaceC7770IL interfaceC7770IL) {
        InterfaceC7769Fy ldr = this.f17080IL.ldr();
        return ldr != null ? ldr : C7806zx.m87695bg(interfaceC7770IL.mo87688IL());
    }

    /* renamed from: IL */
    public Collection<InterfaceC7769Fy> m87621IL() {
        return this.eqN.values();
    }

    /* renamed from: Kg */
    public InterfaceC7782VzQ m87619Kg() {
        if (this.f17082WR == null) {
            this.f17082WR = m87618PX();
        }
        return this.f17082WR;
    }

    /* renamed from: bX */
    public Collection<InterfaceC7784bX> m87615bX() {
        return this.f17086zx.values();
    }

    /* renamed from: bg */
    public Collection<InterfaceC7850tuV> m87613bg() {
        return this.f17083bX.values();
    }

    /* renamed from: iR */
    public Map<String, List<C7788bX>> m87608iR() {
        return this.f17084bg;
    }

    /* renamed from: IL */
    public InterfaceC7769Fy m87620IL(InterfaceC7770IL interfaceC7770IL) {
        if (interfaceC7770IL == null) {
            interfaceC7770IL = C7808bg.m87682iR();
        }
        String file = interfaceC7770IL.mo87681zx().toString();
        InterfaceC7769Fy interfaceC7769Fy = this.eqN.get(file);
        if (interfaceC7769Fy == null) {
            InterfaceC7769Fy m87606zx = m87606zx(interfaceC7770IL);
            this.eqN.put(file, m87606zx);
            return m87606zx;
        }
        return interfaceC7769Fy;
    }

    /* renamed from: bX */
    public InterfaceC7784bX m87614bX(InterfaceC7770IL interfaceC7770IL) {
        if (interfaceC7770IL == null) {
            interfaceC7770IL = C7808bg.m87682iR();
        }
        String file = interfaceC7770IL.mo87681zx().toString();
        InterfaceC7784bX interfaceC7784bX = this.f17086zx.get(file);
        if (interfaceC7784bX == null) {
            InterfaceC7784bX ldr = ldr(interfaceC7770IL);
            this.f17086zx.put(file, ldr);
            return ldr;
        }
        return interfaceC7784bX;
    }

    /* renamed from: bg */
    public InterfaceC7850tuV m87612bg(InterfaceC7770IL interfaceC7770IL) {
        if (interfaceC7770IL == null) {
            interfaceC7770IL = C7808bg.m87682iR();
        }
        String file = interfaceC7770IL.mo87681zx().toString();
        InterfaceC7850tuV interfaceC7850tuV = this.f17083bX.get(file);
        if (interfaceC7850tuV == null) {
            InterfaceC7850tuV eqN = eqN(interfaceC7770IL);
            this.f17083bX.put(file, eqN);
            return eqN;
        }
        return interfaceC7850tuV;
    }

    public ExecutorService ldr() {
        ExecutorService mo87346bg;
        InterfaceC7849tC mo87602bX = this.f17080IL.mo87602bX();
        if (mo87602bX == null || (mo87346bg = mo87602bX.mo87346bg()) == null) {
            if (this.f17081Kg == null) {
                this.f17081Kg = m87617VB();
            }
            return this.f17081Kg;
        }
        return mo87346bg;
    }

    /* renamed from: zx */
    public InterfaceC7779PX m87607zx() {
        if (this.f17085iR == null) {
            this.f17085iR = m87609eo();
        }
        return this.f17085iR;
    }

    public InterfaceC7832eqN eqN() {
        if (this.ldr == null) {
            this.ldr = m87616WR();
        }
        return this.ldr;
    }

    /* renamed from: bg */
    public InterfaceC7784bX m87610bg(String str) {
        return m87614bX(C7808bg.m87683bg(new File(str)));
    }

    /* renamed from: bg */
    public C7786bg m87611bg(C7788bX c7788bX) {
        ImageView.ScaleType eqN = c7788bX.eqN();
        if (eqN == null) {
            eqN = C7786bg.f16957bg;
        }
        ImageView.ScaleType scaleType = eqN;
        Bitmap.Config m87761VB = c7788bX.m87761VB();
        if (m87761VB == null) {
            m87761VB = C7786bg.f16956IL;
        }
        return new C7786bg(c7788bX.mo87770IL(), c7788bX.mo87758bX(), scaleType, m87761VB, c7788bX.m87743iR(), c7788bX.m87767Kg());
    }
}
