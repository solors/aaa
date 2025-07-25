package com.maticoo.sdk.mraid;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.maticoo.sdk.mraid.utils.Utils;
import p978t3.WebViewRenderException;

/* loaded from: classes6.dex */
public class BrowserDialog extends Dialog {
    private static final int ActionBarHeightDp = 50;
    private ImageButton backButton;
    private ImageButton forwardButton;
    private final Handler handler;
    private String url;
    private android.webkit.WebView webView;

    /* loaded from: classes6.dex */
    private class Client extends WebViewClient {
        private Client() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, String str) {
            BrowserDialog.this.backButton.setEnabled(webView.canGoBack());
            BrowserDialog.this.forwardButton.setEnabled(webView.canGoForward());
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewRenderException.m3275a(this);
            if (webView != null && webView.getParent() != null && (webView.getParent() instanceof ViewGroup)) {
                ((ViewGroup) webView.getParent()).removeView(webView);
                webView.destroy();
            }
            if (BrowserDialog.this.isShowing()) {
                BrowserDialog.this.dismiss();
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes6.dex */
    public interface Handler {
        void browserDialogDismissed(BrowserDialog browserDialog);

        void browserDialogOpenUrl(BrowserDialog browserDialog, String str);
    }

    @SuppressLint({"ResourceType"})
    public BrowserDialog(Context context, String str, Handler handler) {
        super(context, 16973833);
        this.backButton = null;
        this.forwardButton = null;
        this.webView = null;
        this.url = str;
        this.handler = handler;
        Resources resources = getContext().getResources();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setBackgroundColor(-1);
        setContentView(relativeLayout, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, Utils.dpToPx(50));
        layoutParams2.addRule(12);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(100);
        linearLayout.setBackgroundDrawable(Assets.getDrawableFromBase64(resources, Assets.ib_bg_down));
        linearLayout.setOrientation(0);
        linearLayout.setVerticalGravity(16);
        relativeLayout.addView(linearLayout, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageDrawable(Assets.getDrawableFromBase64(resources, Assets.ib_close_regular));
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.mraid.BrowserDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BrowserDialog.this.dismiss();
            }
        });
        linearLayout.addView(imageButton, layoutParams3);
        ImageButton imageButton2 = new ImageButton(getContext());
        this.backButton = imageButton2;
        imageButton2.setImageDrawable(Assets.getDrawableFromBase64(resources, Assets.ib_arrow_left_regular));
        this.backButton.setEnabled(false);
        this.backButton.setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.mraid.BrowserDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BrowserDialog.this.webView.goBack();
            }
        });
        linearLayout.addView(this.backButton, layoutParams3);
        ImageButton imageButton3 = new ImageButton(getContext());
        this.forwardButton = imageButton3;
        imageButton3.setImageDrawable(Assets.getDrawableFromBase64(resources, Assets.ib_arrow_right_regular));
        this.forwardButton.setEnabled(false);
        this.forwardButton.setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.mraid.BrowserDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BrowserDialog.this.webView.goForward();
            }
        });
        linearLayout.addView(this.forwardButton, layoutParams3);
        ImageButton imageButton4 = new ImageButton(getContext());
        imageButton4.setImageDrawable(Assets.getDrawableFromBase64(resources, Assets.ib_apdate_regular));
        imageButton4.setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.mraid.BrowserDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BrowserDialog.this.webView.reload();
            }
        });
        linearLayout.addView(imageButton4, layoutParams3);
        ImageButton imageButton5 = new ImageButton(getContext());
        imageButton5.setImageDrawable(Assets.getDrawableFromBase64(resources, Assets.ib_window_regular));
        imageButton5.setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.mraid.BrowserDialog.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Handler handler2 = BrowserDialog.this.handler;
                BrowserDialog browserDialog = BrowserDialog.this;
                handler2.browserDialogOpenUrl(browserDialog, browserDialog.webView.getUrl());
            }
        });
        linearLayout.addView(imageButton5, layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, 0);
        layoutParams4.addRule(10);
        layoutParams4.addRule(2, linearLayout.getId());
        android.webkit.WebView webView = new android.webkit.WebView(getContext());
        this.webView = webView;
        webView.setWebViewClient(new Client());
        relativeLayout.addView(this.webView, layoutParams4);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.maticoo.sdk.mraid.BrowserDialog.6
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                BrowserDialog.this.handler.browserDialogDismissed(BrowserDialog.this);
            }
        });
    }

    public void loadUrl(String str) {
        this.webView.stopLoading();
        this.webView.clearHistory();
        this.webView.loadUrl(this.url);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        this.webView.loadUrl(this.url);
    }
}
