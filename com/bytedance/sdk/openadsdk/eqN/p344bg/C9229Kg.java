package com.bytedance.sdk.openadsdk.eqN.p344bg;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.InterfaceC7696zx;
import com.bytedance.sdk.openadsdk.core.C9099zx;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.bg.Kg */
/* loaded from: classes3.dex */
public class C9229Kg implements InterfaceC7696zx {

    /* renamed from: bg */
    public static final C9229Kg f20636bg = new C9229Kg();

    /* renamed from: IL */
    private volatile SQLiteDatabase f20637IL;

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.InterfaceC7696zx
    /* renamed from: IL */
    public String mo83376IL() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.InterfaceC7696zx
    /* renamed from: bX */
    public String mo83375bX() {
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.InterfaceC7696zx
    /* renamed from: bg */
    public String mo83374bg() {
        return "loghighpriority";
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.InterfaceC7696zx
    public String eqN() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.InterfaceC7696zx
    public String ldr() {
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.InterfaceC7696zx
    /* renamed from: zx */
    public String mo83372zx() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.InterfaceC7696zx
    /* renamed from: bg */
    public SQLiteDatabase mo83373bg(Context context) {
        if (this.f20637IL == null) {
            synchronized (this) {
                if (this.f20637IL == null) {
                    this.f20637IL = C9099zx.m83543bg(context).mo83544bg().m84360bg();
                }
            }
        }
        return this.f20637IL;
    }
}
