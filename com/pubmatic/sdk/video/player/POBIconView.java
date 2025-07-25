package com.pubmatic.sdk.video.player;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import com.pubmatic.sdk.video.POBVastError;
import com.pubmatic.sdk.video.player.POBVastHTMLView;
import com.pubmatic.sdk.video.vastmodels.POBIcon;

/* loaded from: classes7.dex */
public class POBIconView extends POBVastHTMLView<POBIcon> {
    @Nullable

    /* renamed from: c */
    private POBVastHTMLView.InterfaceC26848b f70837c;
    @Nullable

    /* renamed from: d */
    private View f70838d;

    public POBIconView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m40125a(@Nullable POBIcon pOBIcon) {
        POBVastHTMLView.InterfaceC26848b interfaceC26848b;
        if (pOBIcon != null) {
            if (POBNetworkMonitor.isNetworkAvailable(getContext())) {
                if (!renderVastHTMLView(pOBIcon) && (interfaceC26848b = this.f70837c) != null) {
                    interfaceC26848b.mo40003a(new POBVastError(900, "Unable to render Icon due to invalid details."));
                    return;
                }
                return;
            }
            POBLog.debug("POBIconView", "Failed to render icon due to network connectivity issue.", new Object[0]);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastHTMLView, com.pubmatic.sdk.common.p565ui.POBHtmlRendererListener, com.pubmatic.sdk.webrendering.p566ui.POBHTMLViewClient.OnRenderProcessGoneListener
    public void onRenderProcessGone() {
        removeAllViews();
        this.f70838d = null;
        POBVastHTMLView.InterfaceC26848b interfaceC26848b = this.f70837c;
        if (interfaceC26848b != null) {
            interfaceC26848b.mo40003a(new POBVastError(900, "Failed to render icon."));
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastHTMLView, com.pubmatic.sdk.common.p565ui.POBHtmlRendererListener
    public void onViewClicked(@Nullable String str) {
        if (this.f70837c != null && str != null) {
            if ("https://obplaceholder.click.com/".contentEquals(str)) {
                this.f70837c.mo40002a((String) null);
            } else {
                this.f70837c.mo40002a(str);
            }
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastHTMLView, com.pubmatic.sdk.common.p565ui.POBHtmlRendererListener
    public void onViewRendered(@NonNull View view) {
        this.f70838d = view;
        if (getChildCount() == 0) {
            POBVastHTMLView.InterfaceC26848b interfaceC26848b = this.f70837c;
            if (interfaceC26848b != null) {
                interfaceC26848b.mo40004a();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            addView(view, layoutParams);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVastHTMLView, com.pubmatic.sdk.common.p565ui.POBHtmlRendererListener
    public void onViewRenderingFailed(@NonNull POBError pOBError) {
        POBVastHTMLView.InterfaceC26848b interfaceC26848b = this.f70837c;
        if (interfaceC26848b != null) {
            interfaceC26848b.mo40003a(new POBVastError(900, "Failed to render icon."));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListener(@NonNull POBVastHTMLView.InterfaceC26848b interfaceC26848b) {
        this.f70837c = interfaceC26848b;
    }
}
