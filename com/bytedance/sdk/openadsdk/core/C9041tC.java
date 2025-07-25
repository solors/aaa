package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.utils.C7751bg;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.tC */
/* loaded from: classes3.dex */
public class C9041tC implements IDefaultEncrypt {

    /* renamed from: bg */
    private final PangleEncryptConstant.CryptDataScene f20154bg;

    public C9041tC(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.f20154bg = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i) {
        C8990rri.m83865bg(1, this.f20154bg, i);
        return C7751bg.m87838bg(jSONObject);
    }
}
