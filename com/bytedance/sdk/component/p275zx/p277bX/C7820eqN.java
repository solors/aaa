package com.bytedance.sdk.component.p275zx.p277bX;

import com.bytedance.sdk.component.p275zx.InterfaceC7781VB;
import com.bytedance.sdk.component.p275zx.InterfaceC7847iR;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.zx.bX.eqN */
/* loaded from: classes3.dex */
public class C7820eqN<T> implements InterfaceC7781VB {

    /* renamed from: IL */
    private String f17071IL;

    /* renamed from: Kg */
    private boolean f17072Kg;

    /* renamed from: VB */
    private int f17073VB;

    /* renamed from: WR */
    private boolean f17074WR;

    /* renamed from: bX */
    private T f17075bX;

    /* renamed from: bg */
    private String f17076bg;

    /* renamed from: eo */
    private InterfaceC7847iR f17077eo;
    private T eqN;

    /* renamed from: iR */
    private Map<String, String> f17078iR;
    private int ldr;

    /* renamed from: zx */
    private int f17079zx;

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7781VB
    /* renamed from: IL */
    public T mo87629IL() {
        return this.f17075bX;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7781VB
    /* renamed from: bX */
    public T mo87628bX() {
        return this.eqN;
    }

    /* renamed from: bg */
    public C7820eqN m87626bg(C7788bX c7788bX, T t) {
        this.f17075bX = t;
        this.f17076bg = c7788bX.mo87739zx();
        this.f17071IL = c7788bX.mo87756bg();
        this.f17079zx = c7788bX.mo87770IL();
        this.ldr = c7788bX.mo87758bX();
        this.f17074WR = c7788bX.m87764Lq();
        this.f17077eo = c7788bX.m87740vb();
        this.f17073VB = c7788bX.xxp();
        return this;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7781VB
    public Map<String, String> eqN() {
        return this.f17078iR;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7781VB
    /* renamed from: iR */
    public int mo87623iR() {
        return this.f17073VB;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7781VB
    public boolean ldr() {
        return this.f17074WR;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7781VB
    /* renamed from: zx */
    public boolean mo87622zx() {
        return this.f17072Kg;
    }

    /* renamed from: bg */
    public C7820eqN m87625bg(C7788bX c7788bX, T t, Map<String, String> map, boolean z) {
        this.f17078iR = map;
        this.f17072Kg = z;
        return m87626bg(c7788bX, t);
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7781VB
    /* renamed from: bg */
    public String mo87627bg() {
        return this.f17071IL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7781VB
    /* renamed from: bg */
    public void mo87624bg(Object obj) {
        this.eqN = this.f17075bX;
        this.f17075bX = obj;
    }
}
