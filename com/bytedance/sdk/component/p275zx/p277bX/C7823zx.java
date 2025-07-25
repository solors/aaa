package com.bytedance.sdk.component.p275zx.p277bX;

import android.content.Context;
import com.bytedance.sdk.component.p275zx.InterfaceC7769Fy;
import com.bytedance.sdk.component.p275zx.InterfaceC7770IL;
import com.bytedance.sdk.component.p275zx.InterfaceC7779PX;
import com.bytedance.sdk.component.p275zx.InterfaceC7780Ta;
import com.bytedance.sdk.component.p275zx.InterfaceC7782VzQ;
import com.bytedance.sdk.component.p275zx.InterfaceC7784bX;
import com.bytedance.sdk.component.p275zx.InterfaceC7832eqN;
import com.bytedance.sdk.component.p275zx.InterfaceC7849tC;
import com.bytedance.sdk.component.p275zx.InterfaceC7850tuV;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.component.zx.bX.zx */
/* loaded from: classes3.dex */
public class C7823zx implements InterfaceC7780Ta {

    /* renamed from: IL */
    private ExecutorService f17087IL;

    /* renamed from: Kg */
    private InterfaceC7770IL f17088Kg;

    /* renamed from: WR */
    private InterfaceC7849tC f17089WR;

    /* renamed from: bX */
    private InterfaceC7832eqN f17090bX;

    /* renamed from: bg */
    private InterfaceC7779PX f17091bg;
    private InterfaceC7850tuV eqN;

    /* renamed from: iR */
    private InterfaceC7782VzQ f17092iR;
    private InterfaceC7784bX ldr;

    /* renamed from: zx */
    private InterfaceC7769Fy f17093zx;

    /* renamed from: com.bytedance.sdk.component.zx.bX.zx$bg */
    /* loaded from: classes3.dex */
    public static class C7825bg {

        /* renamed from: IL */
        private ExecutorService f17094IL;

        /* renamed from: Kg */
        private InterfaceC7770IL f17095Kg;

        /* renamed from: WR */
        private InterfaceC7849tC f17096WR;

        /* renamed from: bX */
        private InterfaceC7832eqN f17097bX;

        /* renamed from: bg */
        private InterfaceC7779PX f17098bg;
        private InterfaceC7850tuV eqN;

        /* renamed from: iR */
        private InterfaceC7782VzQ f17099iR;
        private InterfaceC7784bX ldr;

        /* renamed from: zx */
        private InterfaceC7769Fy f17100zx;

        /* renamed from: bg */
        public C7825bg m87592bg(InterfaceC7770IL interfaceC7770IL) {
            this.f17095Kg = interfaceC7770IL;
            return this;
        }

        /* renamed from: bg */
        public C7825bg m87589bg(InterfaceC7849tC interfaceC7849tC) {
            this.f17096WR = interfaceC7849tC;
            return this;
        }

        /* renamed from: bg */
        public C7825bg m87590bg(InterfaceC7832eqN interfaceC7832eqN) {
            this.f17097bX = interfaceC7832eqN;
            return this;
        }

        /* renamed from: bg */
        public C7823zx m87593bg() {
            return new C7823zx(this);
        }
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7780Ta
    /* renamed from: IL */
    public ExecutorService mo87605IL() {
        return this.f17087IL;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7780Ta
    /* renamed from: Kg */
    public InterfaceC7782VzQ mo87604Kg() {
        return this.f17092iR;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7780Ta
    /* renamed from: WR */
    public InterfaceC7770IL mo87603WR() {
        return this.f17088Kg;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7780Ta
    /* renamed from: bX */
    public InterfaceC7849tC mo87602bX() {
        return this.f17089WR;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7780Ta
    /* renamed from: bg */
    public InterfaceC7779PX mo87601bg() {
        return this.f17091bg;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7780Ta
    public InterfaceC7832eqN eqN() {
        return this.f17090bX;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7780Ta
    /* renamed from: iR */
    public InterfaceC7784bX mo87599iR() {
        return this.ldr;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7780Ta
    public InterfaceC7769Fy ldr() {
        return this.f17093zx;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7780Ta
    /* renamed from: zx */
    public InterfaceC7850tuV mo87598zx() {
        return this.eqN;
    }

    private C7823zx(C7825bg c7825bg) {
        this.f17091bg = c7825bg.f17098bg;
        this.f17087IL = c7825bg.f17094IL;
        this.f17090bX = c7825bg.f17097bX;
        this.eqN = c7825bg.eqN;
        this.f17093zx = c7825bg.f17100zx;
        this.ldr = c7825bg.ldr;
        this.f17088Kg = c7825bg.f17095Kg;
        this.f17092iR = c7825bg.f17099iR;
        this.f17089WR = c7825bg.f17096WR;
    }

    /* renamed from: bg */
    public static C7823zx m87600bg(Context context) {
        return new C7825bg().m87593bg();
    }
}
