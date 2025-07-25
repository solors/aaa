package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p143zx;

import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.C6388WR;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq;
import com.bytedance.sdk.component.p228IL.p229bg.C7219ldr;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.zx.ldr */
/* loaded from: classes3.dex */
public class C6445ldr extends AbstractC6443bg {

    /* renamed from: bX */
    private AbstractC7189Lq f13444bX;

    public C6445ldr(AbstractC7189Lq abstractC7189Lq, C6446zx c6446zx) {
        C7219ldr mo89606iR;
        this.f13444bX = abstractC7189Lq;
        this.f13442bg = new ArrayList();
        if (abstractC7189Lq != null && (mo89606iR = abstractC7189Lq.mo89606iR()) != null) {
            for (int i = 0; i < mo89606iR.m89567bg(); i++) {
                this.f13442bg.add(new C6388WR.C6389IL(mo89606iR.m89566bg(i), mo89606iR.m89568IL(i)));
            }
        }
        this.f13441IL = c6446zx;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p143zx.AbstractC6443bg
    /* renamed from: IL */
    public boolean mo91942IL() {
        if (this.f13444bX.mo89611bX() >= 200 && this.f13444bX.mo89611bX() < 300) {
            return true;
        }
        return false;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p143zx.AbstractC6443bg
    /* renamed from: bX */
    public List<C6388WR.C6389IL> mo91941bX() {
        return this.f13442bg;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p143zx.AbstractC6443bg
    /* renamed from: bg */
    public int mo91940bg() {
        return this.f13444bX.mo89611bX();
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p143zx.AbstractC6443bg
    public InputStream eqN() {
        return this.f13444bX.ldr().mo89564bX();
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p143zx.AbstractC6443bg
    public String ldr() {
        return m91946bg(this.f13444bX.mo89611bX());
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p143zx.AbstractC6443bg
    /* renamed from: zx */
    public String mo91938zx() {
        AbstractC7189Lq abstractC7189Lq = this.f13444bX;
        if (abstractC7189Lq != null && abstractC7189Lq.mo89613Kg() != null) {
            return this.f13444bX.mo89613Kg().toString();
        }
        return "http/1.1";
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p143zx.AbstractC6443bg
    /* renamed from: bg */
    public String mo91939bg(String str, String str2) {
        return m91945bg(str) != null ? m91945bg(str).f13322IL : str2;
    }
}
