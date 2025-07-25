package com.bytedance.sdk.openadsdk.p290Ta;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;
import com.bytedance.sdk.openadsdk.core.p340zx.C9103bX;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.core.widget.C9057VzQ;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.C9503Kg;

/* renamed from: com.bytedance.sdk.openadsdk.Ta.eo */
/* loaded from: classes3.dex */
public abstract class AbstractC7912eo extends C9103bX {

    /* renamed from: IL */
    protected C9105eqN f17252IL;

    /* renamed from: bX */
    protected C9057VzQ f17253bX;

    /* renamed from: bg */
    protected C9103bX f17254bg;
    protected C9101Kg eqN;
    protected C9101Kg ldr;

    /* renamed from: zx */
    protected C9101Kg f17255zx;

    public AbstractC7912eo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo87429bg(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: IL */
    public C9101Kg mo87432IL(Context context) {
        C9101Kg c9101Kg = new C9101Kg(context);
        c9101Kg.setEllipsize(TextUtils.TruncateAt.END);
        c9101Kg.setMaxLines(1);
        c9101Kg.setTextColor(Color.parseColor("#FF999999"));
        c9101Kg.setTextSize(2, 16.0f);
        return c9101Kg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Kg */
    public PAGLogoView m87435Kg(Context context) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.setId(520093739);
        return pAGLogoView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bX */
    public C9101Kg mo87431bX(Context context) {
        C9101Kg c9101Kg = new C9101Kg(context);
        c9101Kg.setEllipsize(TextUtils.TruncateAt.END);
        c9101Kg.setMaxLines(1);
        c9101Kg.setSingleLine();
        c9101Kg.setTextColor(Color.parseColor("#FF999999"));
        c9101Kg.setTextSize(2, 12.0f);
        return c9101Kg;
    }

    /* renamed from: bg */
    protected abstract void mo87429bg(Context context);

    /* JADX INFO: Access modifiers changed from: protected */
    public C9101Kg eqN(Context context) {
        C9101Kg c9101Kg = new C9101Kg(context);
        c9101Kg.setBackground(C9503Kg.m82632bg(context, "tt_backup_btn_1"));
        c9101Kg.setGravity(17);
        c9101Kg.setText(C7730Fy.m87917bg(context, "tt_video_download_apk"));
        c9101Kg.setTextColor(-1);
        c9101Kg.setTextSize(2, 14.0f);
        return c9101Kg;
    }

    public FrameLayout getTtAdContainer() {
        return this.f17254bg;
    }

    public TextView getTtFullAdAppName() {
        return this.eqN;
    }

    public TextView getTtFullAdDesc() {
        return this.f17255zx;
    }

    public TextView getTtFullAdDownload() {
        return this.ldr;
    }

    public C9057VzQ getTtFullAdIcon() {
        return this.f17253bX;
    }

    public ImageView getTtFullImg() {
        return this.f17252IL;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: iR */
    public C9057VzQ m87434iR(Context context) {
        C9057VzQ c9057VzQ = new C9057VzQ(context);
        c9057VzQ.setScaleType(ImageView.ScaleType.FIT_XY);
        c9057VzQ.setBackgroundColor(0);
        return c9057VzQ;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C9105eqN ldr(Context context) {
        C9105eqN c9105eqN = new C9105eqN(context);
        c9105eqN.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return c9105eqN;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: zx */
    public C9103bX m87433zx(Context context) {
        return new C9103bX(context);
    }
}
