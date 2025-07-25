package com.bytedance.sdk.openadsdk.multipro.aidl.p351bg;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.component.ldr.p261bg.InterfaceC7711ldr;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.settings.C8999PX;
import com.bytedance.sdk.openadsdk.multipro.C9354zx;
import com.bytedance.sdk.openadsdk.multipro.p353bg.C9347bg;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.bg.ldr */
/* loaded from: classes3.dex */
public class BinderC9341ldr extends InterfaceC7711ldr.AbstractBinderC7712bg {

    /* renamed from: bg */
    private static volatile BinderC9341ldr f20856bg;

    /* renamed from: IL */
    public static BinderC9341ldr m83051IL() {
        if (f20856bg == null) {
            synchronized (BinderC9341ldr.class) {
                if (f20856bg == null) {
                    f20856bg = new BinderC9341ldr();
                }
            }
        }
        return f20856bg;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.InterfaceC7711ldr
    /* renamed from: bg */
    public Map mo83046bg(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (C8999PX.m83842bg()) {
            try {
                return C9347bg.m83024bg(C9354zx.m82969bg(C8838VzQ.m84740bg()).mo82964bg(uri, strArr, str, strArr2, str2));
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.InterfaceC7711ldr
    /* renamed from: bg */
    public String mo83050bg(Uri uri) {
        if (C8999PX.m83842bg()) {
            return C9354zx.m82969bg(C8838VzQ.m84740bg()).mo82968bg(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.InterfaceC7711ldr
    /* renamed from: bg */
    public String mo83049bg(Uri uri, ContentValues contentValues) {
        Uri mo82967bg;
        if (C8999PX.m83842bg() && (mo82967bg = C9354zx.m82969bg(C8838VzQ.m84740bg()).mo82967bg(uri, contentValues)) != null) {
            return mo82967bg.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.InterfaceC7711ldr
    /* renamed from: bg */
    public int mo83047bg(Uri uri, String str, String[] strArr) {
        if (C8999PX.m83842bg()) {
            return C9354zx.m82969bg(C8838VzQ.m84740bg()).mo82965bg(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.InterfaceC7711ldr
    /* renamed from: bg */
    public int mo83048bg(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (C8999PX.m83842bg()) {
            return C9354zx.m82969bg(C8838VzQ.m84740bg()).mo82966bg(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
