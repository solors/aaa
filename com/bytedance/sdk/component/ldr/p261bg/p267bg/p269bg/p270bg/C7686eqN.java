package com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg;

import android.content.Context;
import com.bytedance.sdk.component.ldr.p261bg.C7659Kg;
import com.bytedance.sdk.component.ldr.p261bg.eqN.p271IL.C7705bg;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.InterfaceC7696zx;

/* renamed from: com.bytedance.sdk.component.ldr.bg.bg.bg.bg.eqN */
/* loaded from: classes3.dex */
public class C7686eqN extends C7685bg {
    public C7686eqN(Context context, C7705bg c7705bg) {
        super(context, c7705bg);
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.C7685bg, com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.AbstractC7683bX
    /* renamed from: IL */
    public String mo88039IL() {
        InterfaceC7696zx eqN = C7659Kg.m88154iR().eqN();
        if (eqN != null) {
            return eqN.mo83374bg();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.C7685bg
    /* renamed from: bX */
    public byte mo88052bX() {
        return (byte) 1;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.C7685bg
    public byte eqN() {
        return (byte) 0;
    }

    /* renamed from: bX */
    public static String m88051bX(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
