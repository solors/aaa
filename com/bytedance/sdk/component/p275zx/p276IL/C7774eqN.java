package com.bytedance.sdk.component.p275zx.p276IL;

import com.bytedance.sdk.component.p275zx.InterfaceC7847iR;
import com.bytedance.sdk.component.p275zx.InterfaceC7848ldr;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.zx.IL.eqN */
/* loaded from: classes3.dex */
public class C7774eqN<T> implements InterfaceC7848ldr {

    /* renamed from: IL */
    private int f16948IL;

    /* renamed from: bX */
    private T f16949bX;

    /* renamed from: bg */
    Map<String, String> f16950bg;
    private String eqN;

    /* renamed from: zx */
    private InterfaceC7847iR f16951zx;

    public C7774eqN(int i, T t, String str) {
        this.f16948IL = i;
        this.f16949bX = t;
        this.eqN = str;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7848ldr
    /* renamed from: IL */
    public int mo87553IL() {
        return this.f16948IL;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7848ldr
    /* renamed from: bX */
    public T mo87552bX() {
        return this.f16949bX;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7848ldr
    /* renamed from: bg */
    public InterfaceC7847iR mo87551bg() {
        return this.f16951zx;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7848ldr
    public String eqN() {
        return this.eqN;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7848ldr
    /* renamed from: zx */
    public Map<String, String> mo87550zx() {
        return this.f16950bg;
    }

    /* renamed from: bg */
    public void m87782bg(InterfaceC7847iR interfaceC7847iR) {
        this.f16951zx = interfaceC7847iR;
    }

    public C7774eqN(int i, T t, String str, Map<String, String> map) {
        this(i, t, str);
        this.f16950bg = map;
    }
}
