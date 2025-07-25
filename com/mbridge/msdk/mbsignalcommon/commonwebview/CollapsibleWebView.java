package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p978t3.WebViewRenderException;

/* loaded from: classes6.dex */
public class CollapsibleWebView extends CommonWebView {

    /* renamed from: e */
    private CopyOnWriteArrayList<CommonWebView.InterfaceC22221a> f57645e;

    /* renamed from: f */
    private CopyOnWriteArrayList<CommonWebView.InterfaceC22221a> f57646f;

    /* renamed from: g */
    private CopyOnWriteArrayList<InterfaceC22212a> f57647g;

    /* renamed from: h */
    private String f57648h;

    /* renamed from: i */
    private String f57649i;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC22212a {
        /* renamed from: a */
        void mo48671a(View view, String str);

        /* renamed from: a */
        void mo48670a(View view, Map<String, String> map);

        /* renamed from: b */
        void mo48668b(View view, String str);

        /* renamed from: b */
        void mo48667b(View view, Map<String, String> map);
    }

    public CollapsibleWebView(Context context) {
        super(context);
    }

    /* renamed from: a */
    static /* synthetic */ void m51154a(CollapsibleWebView collapsibleWebView) {
        Iterator<CommonWebView.InterfaceC22221a> it = collapsibleWebView.f57645e.iterator();
        while (it.hasNext()) {
            it.next().mo48666a();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m51151b(CollapsibleWebView collapsibleWebView) {
        Iterator<CommonWebView.InterfaceC22221a> it = collapsibleWebView.f57646f.iterator();
        while (it.hasNext()) {
            it.next().mo48666a();
        }
    }

    public String getCollapseIconName() {
        return this.f57648h;
    }

    public String getExpandIconName() {
        return this.f57649i;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView
    public void init() {
        super.init();
        this.f57645e = new CopyOnWriteArrayList<>();
        this.f57646f = new CopyOnWriteArrayList<>();
        this.f57647g = new CopyOnWriteArrayList<>();
        this.f57648h = "mbridge_arrow_down_white_blackbg";
        this.f57649i = "mbridge_arrow_up_white";
        useDeeplink();
        initWebViewListener();
        useProgressBar();
        ArrayList<ToolBar.C22224b> arrayList = new ArrayList<>();
        ToolBar.C22224b c22224b = new ToolBar.C22224b("doCollapse");
        c22224b.f57690c = false;
        c22224b.f57689b = "mbridge_arrow_down_white_blackbg";
        c22224b.f57691d = new View.OnClickListener() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollapsibleWebView.this.hideToolBarButton("doCollapse");
                CollapsibleWebView.this.showToolBarButton("doSpand");
                CollapsibleWebView.m51154a(CollapsibleWebView.this);
            }
        };
        arrayList.add(c22224b);
        ToolBar.C22224b c22224b2 = new ToolBar.C22224b("doSpand");
        c22224b2.f57689b = "mbridge_arrow_up_black";
        c22224b2.f57691d = new View.OnClickListener() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollapsibleWebView.this.hideToolBarButton("doSpand");
                CollapsibleWebView.this.showToolBarButton("doCollapse");
                CollapsibleWebView.m51151b(CollapsibleWebView.this);
            }
        };
        arrayList.add(c22224b2);
        useDefaultToolBar();
        useCustomizedToolBar(arrayList, true);
    }

    public void initWebViewListener() {
        setPageLoadTimtoutListener(new CommonWebView.InterfaceC22222b() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.3
            @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.InterfaceC22222b
            /* renamed from: a */
            public final void mo51131a(String str) {
                CollapsibleWebView collapsibleWebView = CollapsibleWebView.this;
                CollapsibleWebView.m51153a(collapsibleWebView, (View) collapsibleWebView.f57659d, str);
            }
        });
        setPageLoadTimtout(CommonWebView.DEFAULT_JUMP_TIMEOUT);
        addWebViewClient(new WebViewClient() { // from class: com.mbridge.msdk.mbsignalcommon.commonwebview.CollapsibleWebView.4

            /* renamed from: a */
            Boolean f57653a = Boolean.FALSE;

            /* renamed from: b */
            String f57654b = "";

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                if (!this.f57653a.booleanValue()) {
                    CollapsibleWebView.m51150b(CollapsibleWebView.this, webView, str);
                    this.f57653a = Boolean.FALSE;
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                if (!TextUtils.isEmpty(str)) {
                    this.f57654b = str;
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "error");
                hashMap.put("url", str2);
                hashMap.put("description", str);
                if (!this.f57653a.booleanValue() && this.f57654b.equals(str2)) {
                    this.f57653a = Boolean.TRUE;
                    CollapsibleWebView.m51152a(CollapsibleWebView.this, webView, hashMap);
                }
                CollapsibleWebView.m51149b(CollapsibleWebView.this, webView, hashMap);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "http");
                String str = webResourceRequest.getUrl() + "";
                hashMap.put("url", str);
                hashMap.put("statusCode", webResourceResponse.getStatusCode() + "");
                hashMap.put("description", "http error");
                if (!this.f57653a.booleanValue() && (this.f57654b.equals(str) || TextUtils.isEmpty(this.f57654b))) {
                    this.f57653a = Boolean.TRUE;
                    CollapsibleWebView.m51152a(CollapsibleWebView.this, webView, hashMap);
                }
                CollapsibleWebView.m51149b(CollapsibleWebView.this, webView, hashMap);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "ssl");
                hashMap.put("url", sslError.getUrl());
                hashMap.put("description", "ssl error");
                if (!this.f57653a.booleanValue()) {
                    String str = this.f57654b;
                    if (str.equals(sslError.getUrl() + "")) {
                        this.f57653a = Boolean.TRUE;
                        CollapsibleWebView.m51152a(CollapsibleWebView.this, webView, hashMap);
                    }
                }
                CollapsibleWebView.m51149b(CollapsibleWebView.this, webView, hashMap);
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                WebViewRenderException.m3275a(this);
                SameLogTool.m51824b("CollapsibleWebView", "WebView called onRenderProcessGone");
                return true;
            }
        });
    }

    public void setCollapseIconName(String str) {
        this.f57648h = str;
    }

    public void setCollapseListener(CommonWebView.InterfaceC22221a interfaceC22221a) {
        this.f57645e.add(interfaceC22221a);
    }

    public void setCustomizedToolBarMarginWidthPixel(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f57656a.getLayoutParams();
        layoutParams.setMargins(i, i2, i3, i4);
        this.f57656a.setLayoutParams(layoutParams);
    }

    public void setExpandIconName(String str) {
        this.f57649i = str;
    }

    public void setExpandListener(CommonWebView.InterfaceC22221a interfaceC22221a) {
        this.f57646f.add(interfaceC22221a);
    }

    public void setPageLoadListener(InterfaceC22212a interfaceC22212a) {
        this.f57647g.add(interfaceC22212a);
    }

    public CollapsibleWebView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CollapsibleWebView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    static /* synthetic */ void m51153a(CollapsibleWebView collapsibleWebView, View view, String str) {
        Iterator<InterfaceC22212a> it = collapsibleWebView.f57647g.iterator();
        while (it.hasNext()) {
            it.next().mo48668b(view, str);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m51150b(CollapsibleWebView collapsibleWebView, View view, String str) {
        Iterator<InterfaceC22212a> it = collapsibleWebView.f57647g.iterator();
        while (it.hasNext()) {
            it.next().mo48671a(view, str);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m51152a(CollapsibleWebView collapsibleWebView, View view, Map map) {
        Iterator<InterfaceC22212a> it = collapsibleWebView.f57647g.iterator();
        while (it.hasNext()) {
            it.next().mo48670a(view, map);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m51149b(CollapsibleWebView collapsibleWebView, View view, Map map) {
        Iterator<InterfaceC22212a> it = collapsibleWebView.f57647g.iterator();
        while (it.hasNext()) {
            it.next().mo48667b(view, map);
        }
    }
}
