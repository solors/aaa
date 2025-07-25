package com.bytedance.sdk.component.adexpress.ldr;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.component.utils.C7741PX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.LZ */
/* loaded from: classes3.dex */
public class C7510LZ extends C7499Fy {

    /* renamed from: bg */
    private TextView f16316bg;

    public C7510LZ(@NonNull Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, view, i, i2, i3, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.ldr.C7499Fy
    /* renamed from: bg */
    protected void mo88641bg(Context context, View view) {
        addView(view);
        this.f16316bg = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.ldr.C7499Fy
    public void setShakeText(String str) {
        if (this.f16316bg == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            try {
                this.f16316bg.setText(C7730Fy.m87924IL(this.f16316bg.getContext(), "tt_splash_default_click_shake"));
                return;
            } catch (Exception e) {
                C7741PX.m87873bg("shakeClickView", e.getMessage());
                return;
            }
        }
        this.f16316bg.setText(str);
    }
}
