package p840q2;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.helpshift.log.HSLogger;
import com.helpshift.log.WebviewConsoleLogger;
import com.maticoo.sdk.utils.request.network.Headers;
import p752k3.C37383m;

/* compiled from: CommonWebChromeClient.java */
/* renamed from: q2.a */
/* loaded from: classes5.dex */
public class C39329a extends WebChromeClient {

    /* renamed from: a */
    private final String f103411a;

    /* renamed from: b */
    private final WebviewAttachmentCallbackProxy f103412b;

    /* renamed from: c */
    private ValueCallback<Uri[]> f103413c;

    public C39329a(String str, WebviewAttachmentCallbackProxy webviewAttachmentCallbackProxy) {
        this.f103411a = str;
        this.f103412b = webviewAttachmentCallbackProxy;
    }

    /* renamed from: a */
    private String m13002a(int i, String str) {
        if (i != 2) {
            if (i != 7) {
                return "";
            }
            return str;
        }
        return "tel:" + str;
    }

    /* renamed from: b */
    public void m13001b(ValueCallback<Uri[]> valueCallback) {
        this.f103413c = valueCallback;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
        String str = this.f103411a;
        WebviewConsoleLogger.log(messageLevel, str, consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (!z2) {
            return false;
        }
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        String m13002a = m13002a(hitTestResult.getType(), hitTestResult.getExtra());
        if (C37383m.m18233g(m13002a)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(m13002a));
            this.f103412b.m12997d(intent);
            return true;
        }
        WebView webView2 = new WebView(webView.getContext());
        this.f103412b.m12999b(webView2);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (this.f103413c != null) {
            HSLogger.m65441d(this.f103411a, "filePathCallback is not null, returning false.");
            this.f103413c.onReceiveValue(null);
            this.f103413c = null;
            return false;
        }
        this.f103413c = valueCallback;
        this.f103412b.m12996e(valueCallback);
        try {
            Intent createIntent = fileChooserParams.createIntent();
            createIntent.setType(Headers.VALUE_ACCEPT_ALL);
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            if (acceptTypes.length != 0) {
                createIntent.putExtra("android.intent.extra.MIME_TYPES", acceptTypes);
            }
            createIntent.setAction("android.intent.action.OPEN_DOCUMENT");
            createIntent.addCategory("android.intent.category.OPENABLE");
            HSLogger.m65441d(this.f103411a, "Starting open file chooser request.");
            this.f103412b.m12998c(createIntent, 1001);
            HSLogger.m65441d(this.f103411a, "onShowFileChooser success, returning true");
            return true;
        } catch (ActivityNotFoundException e) {
            HSLogger.m65438e(this.f103411a, "ActivityNotFoundException error in opening the attachment file chooser.", e);
            this.f103413c = null;
            return true;
        } catch (Exception e2) {
            HSLogger.m65438e(this.f103411a, "error in opening the attachment in browser window, returning false", e2);
            this.f103413c = null;
            return false;
        }
    }
}
