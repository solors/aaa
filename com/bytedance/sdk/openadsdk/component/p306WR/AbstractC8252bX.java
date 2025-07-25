package com.bytedance.sdk.openadsdk.component.p306WR;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;
import com.bytedance.sdk.openadsdk.core.p340zx.C9103bX;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;
import com.bytedance.sdk.openadsdk.core.p340zx.C9106iR;
import com.bytedance.sdk.openadsdk.core.p340zx.C9109zx;
import com.bytedance.sdk.openadsdk.core.widget.C9057VzQ;
import com.bytedance.sdk.openadsdk.core.widget.C9062bX;
import com.bytedance.sdk.openadsdk.core.widget.C9084xxp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* renamed from: com.bytedance.sdk.openadsdk.component.WR.bX */
/* loaded from: classes3.dex */
public abstract class AbstractC8252bX extends C9106iR {

    /* renamed from: IL */
    C9103bX f18059IL;

    /* renamed from: Kg */
    final C8256iR f18060Kg;

    /* renamed from: PX */
    C9062bX f18061PX;

    /* renamed from: VB */
    C9101Kg f18062VB;

    /* renamed from: WR */
    C9057VzQ f18063WR;

    /* renamed from: bX */
    C9105eqN f18064bX;

    /* renamed from: bg */
    C9105eqN f18065bg;

    /* renamed from: eo */
    C9101Kg f18066eo;
    PAGLogoView eqN;

    /* renamed from: iR */
    C9101Kg f18067iR;
    C9057VzQ ldr;

    /* renamed from: zx */
    C9101Kg f18068zx;

    public AbstractC8252bX(Context context) {
        super(context);
        this.f18060Kg = new C8256iR(context);
    }

    public abstract C9105eqN getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.eqN;
    }

    public abstract C9101Kg getAdTitleTextView();

    public C9105eqN getBackImage() {
        return this.f18065bg;
    }

    public C9101Kg getClickButton() {
        return this.f18068zx;
    }

    public C9101Kg getContent() {
        return this.f18062VB;
    }

    public C9062bX getDspAdChoice() {
        return this.f18061PX;
    }

    public C9057VzQ getHostAppIcon() {
        return this.ldr;
    }

    public C9101Kg getHostAppName() {
        return this.f18067iR;
    }

    public C9057VzQ getIconOnlyView() {
        return this.f18063WR;
    }

    public C9105eqN getImageView() {
        return this.f18064bX;
    }

    public C9109zx getOverlayLayout() {
        return null;
    }

    public abstract C9084xxp getScoreBar();

    public C9101Kg getTitle() {
        return this.f18066eo;
    }

    public View getTopDisLike() {
        C8256iR c8256iR = this.f18060Kg;
        if (c8256iR != null) {
            return c8256iR.getTopDislike();
        }
        return null;
    }

    public C9105eqN getTopSkip() {
        C8256iR c8256iR = this.f18060Kg;
        if (c8256iR != null) {
            return c8256iR.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public C9103bX getVideoContainer() {
        return this.f18059IL;
    }
}
