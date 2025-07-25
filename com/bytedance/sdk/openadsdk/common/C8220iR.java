package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.utils.C9503Kg;
import com.bytedance.sdk.openadsdk.utils.C9514Ta;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.common.iR */
/* loaded from: classes3.dex */
public class C8220iR extends Button {
    public C8220iR(Context context) {
        super(context);
        m86754bg();
    }

    /* renamed from: bg */
    private void m86754bg() {
        setId(C9514Ta.f21215jA);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, ZQc.m82537bX(context, 48.0f)));
        setBackground(C9503Kg.m82632bg(context, "tt_browser_download_selector"));
        setText(C7730Fy.m87917bg(context, "tt_video_download_apk"));
        setTextColor(-1);
        setTextSize(2, 16.0f);
    }
}
