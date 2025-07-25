package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.adexpress.p243bg.p245bX.C7318bg;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C8599LZ;
import com.bytedance.sdk.openadsdk.core.model.C8943IL;
import com.bytedance.sdk.openadsdk.core.model.C8947LZ;
import com.bytedance.sdk.openadsdk.core.model.C8957bg;
import com.bytedance.sdk.openadsdk.eqN.C9271zx;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.Fy */
/* loaded from: classes3.dex */
public interface InterfaceC8512Fy<T> {

    /* renamed from: com.bytedance.sdk.openadsdk.core.Fy$IL */
    /* loaded from: classes3.dex */
    public interface InterfaceC8513IL {
        /* renamed from: bg */
        void mo85916bg(int i, String str);

        /* renamed from: bg */
        void mo85915bg(C8599LZ.C8613IL c8613il);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.Fy$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC8514bg {
        /* renamed from: bg */
        void mo84425bg(int i, String str);

        /* renamed from: bg */
        void mo84423bg(C8957bg c8957bg, C8943IL c8943il);
    }

    /* renamed from: IL */
    C9271zx mo85585IL(JSONObject jSONObject);

    /* renamed from: bg */
    C7318bg mo85581bg();

    /* renamed from: bg */
    C9271zx mo85549bg(JSONObject jSONObject, String str, boolean z);

    /* renamed from: bg */
    JSONObject mo85556bg(JSONObject jSONObject);

    /* renamed from: bg */
    void mo85573bg(AdSlot adSlot, C8947LZ c8947lz, int i, InterfaceC8514bg interfaceC8514bg);

    /* renamed from: bg */
    void mo85561bg(String str);

    /* renamed from: bg */
    void mo85559bg(String str, List<FilterWord> list, String str2, String str3, String str4);

    /* renamed from: bg */
    void mo85555bg(JSONObject jSONObject, InterfaceC8513IL interfaceC8513IL);

    /* renamed from: bg */
    void mo85553bg(JSONObject jSONObject, String str);
}
