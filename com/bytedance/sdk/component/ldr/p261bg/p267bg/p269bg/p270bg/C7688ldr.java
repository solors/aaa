package com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg;

import android.content.Context;
import com.bytedance.sdk.component.ldr.p261bg.C7659Kg;
import com.bytedance.sdk.component.ldr.p261bg.eqN.p271IL.C7705bg;

/* renamed from: com.bytedance.sdk.component.ldr.bg.bg.bg.bg.ldr */
/* loaded from: classes3.dex */
public class C7688ldr extends C7687iR {
    public C7688ldr(Context context, C7705bg c7705bg) {
        super(context, c7705bg);
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.C7687iR, com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.AbstractC7683bX
    /* renamed from: IL */
    public String mo88039IL() {
        return C7659Kg.m88154iR().eqN().mo83372zx();
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.C7687iR
    /* renamed from: bX */
    public byte mo88038bX() {
        return (byte) 3;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.C7687iR
    /* renamed from: bg */
    public byte mo88037bg() {
        return (byte) 1;
    }

    /* renamed from: bg */
    public static String m88040bg(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
