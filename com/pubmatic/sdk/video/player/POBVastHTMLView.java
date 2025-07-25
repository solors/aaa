package com.pubmatic.sdk.video.player;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.p565ui.POBHtmlRendererListener;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.video.POBVastError;
import com.pubmatic.sdk.webrendering.p566ui.POBHTMLRenderer;
import com.pubmatic.sdk.webrendering.p566ui.POBHTMLViewClient;
import java.nio.charset.StandardCharsets;
import java.util.Formatter;
import java.util.IllegalFormatException;
import java.util.Locale;

@MainThread
/* loaded from: classes7.dex */
public abstract class POBVastHTMLView<T extends POBAdDescriptor> extends FrameLayout implements POBHtmlRendererListener, POBHTMLViewClient.OnRenderProcessGoneListener {
    @Nullable

    /* renamed from: a */
    private POBHTMLRenderer f70905a;
    @Nullable

    /* renamed from: b */
    private POBWebView f70906b;

    /* renamed from: com.pubmatic.sdk.video.player.POBVastHTMLView$a */
    /* loaded from: classes7.dex */
    class C26847a extends POBHTMLRenderer {
        C26847a(POBWebView pOBWebView, POBHTMLViewClient pOBHTMLViewClient) {
            super(pOBWebView, pOBHTMLViewClient);
        }

        @Override // com.pubmatic.sdk.webrendering.p566ui.POBHTMLRenderer
        public void loadHTML(@Nullable String str, @Nullable String str2, boolean z) {
            if (str != null) {
                try {
                    Formatter formatter = new Formatter(Locale.getDefault());
                    formatter.format("<html><head><meta name=\"viewport\" content=\"user-scalable=0, width=device-width, initial-scale=1\"/><style>body{margin:0;padding:0;}div{display:block;width:100%%;height:100%%;}</style></head><body><div align=\"center\">%s</div></body></html>", str);
                    String valueOf = String.valueOf(formatter);
                    formatter.close();
                    POBVastHTMLView.this.f70906b.loadDataWithBaseURL(null, valueOf, "text/html", StandardCharsets.UTF_8.name(), null);
                    return;
                } catch (IllegalFormatException e) {
                    notifyError(new POBError(1009, "Unable to render creative, due to " + e.getMessage()));
                    return;
                }
            }
            POBVastHTMLView.this.f70906b.loadUrl(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.video.player.POBVastHTMLView$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC26848b {
        /* renamed from: a */
        void mo40004a();

        /* renamed from: a */
        void mo40003a(@NonNull POBVastError pOBVastError);

        /* renamed from: a */
        void mo40002a(@Nullable String str);
    }

    public POBVastHTMLView(@NonNull Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(getResources().getColor(17170445));
    }

    @Nullable
    @SuppressLint({"SetJavaScriptEnabled"})
    protected POBWebView createWebView(@NonNull Context context) {
        POBWebView createInstance = POBWebView.createInstance(context);
        if (createInstance != null) {
            createInstance.getSettings().setJavaScriptEnabled(true);
            createInstance.getSettings().setCacheMode(2);
            createInstance.setScrollBarStyle(0);
        }
        return createInstance;
    }

    public void destroy() {
        invalidateRenderer();
    }

    public void invalidateRenderer() {
        POBHTMLRenderer pOBHTMLRenderer = this.f70905a;
        if (pOBHTMLRenderer != null) {
            pOBHTMLRenderer.destroy();
            this.f70905a = null;
        }
    }

    public abstract /* synthetic */ void onRenderProcessGone();

    public abstract /* synthetic */ void onViewClicked(@Nullable String str);

    public abstract /* synthetic */ void onViewRendered(@NonNull View view);

    public abstract /* synthetic */ void onViewRenderingFailed(@NonNull POBError pOBError);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean renderVastHTMLView(@NonNull POBAdDescriptor pOBAdDescriptor) {
        POBWebView createWebView = createWebView(getContext());
        this.f70906b = createWebView;
        if (createWebView == null) {
            return false;
        }
        POBHTMLViewClient pOBHTMLViewClient = new POBHTMLViewClient(this);
        pOBHTMLViewClient.disableMultipleOnPageFinished(true);
        C26847a c26847a = new C26847a(this.f70906b, pOBHTMLViewClient);
        this.f70905a = c26847a;
        c26847a.setRendererViewListener(this);
        String renderableContent = pOBAdDescriptor.getRenderableContent();
        if (POBUtils.isNullOrEmpty(renderableContent)) {
            return false;
        }
        if (renderableContent.toLowerCase().startsWith("http")) {
            this.f70905a.loadHTML(null, renderableContent, pOBAdDescriptor.isCompanion());
        } else {
            this.f70905a.loadHTML(renderableContent, "", pOBAdDescriptor.isCompanion());
        }
        return true;
    }
}
