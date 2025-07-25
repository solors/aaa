package com.bytedance.sdk.openadsdk.eqN.p344bg;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.component.ldr.p261bg.p262IL.p263IL.C7644IL;
import com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.bg.zx */
/* loaded from: classes3.dex */
public class C9258zx implements InterfaceC9345bg {

    /* renamed from: bg */
    private final C7644IL f20692bg;

    public C9258zx(C7644IL c7644il) {
        this.f20692bg = c7644il;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public String mo82970bg() {
        C7644IL c7644il = this.f20692bg;
        if (c7644il != null) {
            return c7644il.m88284bX();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public String mo82968bg(Uri uri) {
        C7644IL c7644il = this.f20692bg;
        if (c7644il != null) {
            return c7644il.m88281bg(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public Cursor mo82964bg(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C7644IL c7644il = this.f20692bg;
        if (c7644il != null) {
            return c7644il.m88277bg(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public Uri mo82967bg(Uri uri, ContentValues contentValues) {
        C7644IL c7644il = this.f20692bg;
        if (c7644il != null) {
            return c7644il.m88280bg(uri, contentValues);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public int mo82965bg(Uri uri, String str, String[] strArr) {
        C7644IL c7644il = this.f20692bg;
        if (c7644il != null) {
            return c7644il.m88278bg(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.InterfaceC9345bg
    /* renamed from: bg */
    public int mo82966bg(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C7644IL c7644il = this.f20692bg;
        if (c7644il != null) {
            return c7644il.m88279bg(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
