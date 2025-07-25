package com.bytedance.sdk.component.p275zx.p277bX.p280bg.p281IL;

import com.bytedance.sdk.component.p275zx.InterfaceC7769Fy;
import com.bytedance.sdk.component.p275zx.p277bX.p280bg.C7807bX;

/* renamed from: com.bytedance.sdk.component.zx.bX.bg.IL.bX */
/* loaded from: classes3.dex */
public class C7802bX implements InterfaceC7769Fy {

    /* renamed from: IL */
    private int f17019IL;

    /* renamed from: bX */
    private C7807bX<String, byte[]> f17020bX;

    /* renamed from: bg */
    private int f17021bg;

    public C7802bX(int i, int i2) {
        this.f17019IL = i;
        this.f17021bg = i2;
        this.f17020bX = new C7807bX<String, byte[]>(i) { // from class: com.bytedance.sdk.component.zx.bX.bg.IL.bX.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.p275zx.p277bX.p280bg.C7807bX
            /* renamed from: bg */
            public int mo87693IL(String str, byte[] bArr) {
                if (bArr == null) {
                    return 0;
                }
                return bArr.length;
            }
        };
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7826bg
    /* renamed from: IL  reason: avoid collision after fix types in other method */
    public boolean mo87586IL(String str) {
        return this.f17020bX.m87690bg((C7807bX<String, byte[]>) str) != null;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7826bg
    /* renamed from: bg  reason: avoid collision after fix types in other method */
    public boolean mo87584bg(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            return false;
        }
        this.f17020bX.m87689bg(str, bArr);
        return true;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7826bg
    /* renamed from: bg  reason: avoid collision after fix types in other method */
    public byte[] mo87585bg(String str) {
        return this.f17020bX.m87690bg((C7807bX<String, byte[]>) str);
    }
}
