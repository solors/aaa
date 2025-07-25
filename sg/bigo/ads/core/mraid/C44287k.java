package sg.bigo.ads.core.mraid;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.vungle.ads.internal.Constants;
import java.io.ByteArrayInputStream;
import java.util.Locale;
import sg.bigo.ads.core.p969g.AbstractC44224d;

/* renamed from: sg.bigo.ads.core.mraid.k */
/* loaded from: classes10.dex */
public class C44287k extends AbstractC44224d {

    /* renamed from: a */
    private static final String f116269a = "javascript:" + C44269f.f116223a;

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(@NonNull WebView webView, @NonNull String str) {
        if (Constants.AD_MRAID_JS_FILE_NAME.equals(Uri.parse(str.toLowerCase(Locale.US)).getLastPathSegment())) {
            return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(f116269a.getBytes()));
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // sg.bigo.ads.core.p969g.AbstractC44224d
    /* renamed from: a */
    public void mo3439a(RenderProcessGoneDetail renderProcessGoneDetail) {
    }
}
