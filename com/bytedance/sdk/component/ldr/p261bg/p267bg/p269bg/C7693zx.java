package com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.InterfaceC7696zx;

/* renamed from: com.bytedance.sdk.component.ldr.bg.bg.bg.zx */
/* loaded from: classes3.dex */
public class C7693zx implements InterfaceC7696zx {

    /* renamed from: bg */
    public static final C7693zx f16827bg = new C7693zx();

    /* renamed from: IL */
    private volatile SQLiteDatabase f16828IL;

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
        if (this.f16828IL == null) {
            synchronized (this) {
                if (this.f16828IL == null) {
                    this.f16828IL = new C7690eqN(context).getWritableDatabase();
                }
            }
        }
        return this.f16828IL;
    }
}
