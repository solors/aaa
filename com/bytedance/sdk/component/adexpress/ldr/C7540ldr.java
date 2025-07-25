package com.bytedance.sdk.component.adexpress.ldr;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.adexpress.p242bX.C7300bg;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.ldr */
/* loaded from: classes3.dex */
public class C7540ldr extends C7541rri {

    /* renamed from: bg */
    private C7510LZ f16417bg;

    public C7540ldr(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        m88591bg(context, i, i2, i3, jSONObject);
    }

    /* renamed from: bg */
    private void m88591bg(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        C7510LZ c7510lz = new C7510LZ(context, C7300bg.m89246bX(context), i, i2, i3, jSONObject);
        this.f16417bg = c7510lz;
        addView(c7510lz);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.f16417bg.setLayoutParams(layoutParams);
    }

    public C7510LZ getShakeView() {
        return this.f16417bg;
    }

    public void setShakeText(String str) {
        if (this.f16417bg == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f16417bg.setShakeText("");
        } else {
            this.f16417bg.setShakeText(str);
        }
    }
}
