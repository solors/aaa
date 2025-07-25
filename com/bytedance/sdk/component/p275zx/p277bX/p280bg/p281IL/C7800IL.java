package com.bytedance.sdk.component.p275zx.p277bX.p280bg.p281IL;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.p275zx.InterfaceC7850tuV;
import com.bytedance.sdk.component.p275zx.p277bX.p280bg.C7807bX;

/* renamed from: com.bytedance.sdk.component.zx.bX.bg.IL.IL */
/* loaded from: classes3.dex */
public class C7800IL implements InterfaceC7850tuV {

    /* renamed from: IL */
    private int f17015IL;

    /* renamed from: bX */
    private C7807bX<String, Bitmap> f17016bX;

    /* renamed from: bg */
    private int f17017bg;

    public C7800IL(int i, int i2) {
        this.f17015IL = i;
        this.f17017bg = i2;
        this.f17016bX = new C7807bX<String, Bitmap>(i) { // from class: com.bytedance.sdk.component.zx.bX.bg.IL.IL.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.p275zx.p277bX.p280bg.C7807bX
            /* renamed from: bg */
            public int mo87693IL(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return C7800IL.m87708bg(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7826bg
    /* renamed from: IL  reason: avoid collision after fix types in other method */
    public boolean mo87586IL(String str) {
        return this.f17016bX.m87690bg((C7807bX<String, Bitmap>) str) != null;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7826bg
    /* renamed from: bg  reason: avoid collision after fix types in other method */
    public boolean mo87584bg(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.f17016bX.m87689bg(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7826bg
    /* renamed from: bg  reason: avoid collision after fix types in other method */
    public Bitmap mo87585bg(String str) {
        return this.f17016bX.m87690bg((C7807bX<String, Bitmap>) str);
    }

    /* renamed from: bg */
    public static int m87708bg(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
