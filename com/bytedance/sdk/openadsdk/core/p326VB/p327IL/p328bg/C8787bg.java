package com.bytedance.sdk.openadsdk.core.p326VB.p327IL.p328bg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.bytedance.adsdk.ugeno.p207WR.p208IL.C7009bg;

/* renamed from: com.bytedance.sdk.openadsdk.core.VB.IL.bg.bg */
/* loaded from: classes3.dex */
public class C8787bg extends C7009bg {

    /* renamed from: IL */
    private final C7009bg f19378IL;

    /* renamed from: bg */
    private final C7009bg f19379bg;

    public C8787bg(Context context) {
        super(context);
        C7009bg c7009bg = new C7009bg(context);
        this.f19379bg = c7009bg;
        addView(c7009bg, new FrameLayout.LayoutParams(-1, -1));
        C7009bg c7009bg2 = new C7009bg(context);
        this.f19378IL = c7009bg2;
        c7009bg2.setBackgroundColor(0);
        addView(c7009bg2, new FrameLayout.LayoutParams(-1, -1));
    }

    public C7009bg getVideoView() {
        return this.f19379bg;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f19378IL.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f19378IL.setOnTouchListener(onTouchListener);
    }
}
