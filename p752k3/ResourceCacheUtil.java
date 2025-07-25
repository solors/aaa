package p752k3;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.helpshift.log.HSLogger;
import com.ironsource.C20517nb;
import java.io.InputStream;
import java.util.Map;
import p856r2.HelpshiftResourceCacheManager;

/* renamed from: k3.i */
/* loaded from: classes5.dex */
public class ResourceCacheUtil {
    /* renamed from: a */
    public static WebResourceResponse m18244a(HelpshiftResourceCacheManager helpshiftResourceCacheManager, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        String path = url.getPath();
        String query = url.getQuery();
        InputStream m12697e = helpshiftResourceCacheManager.m12697e(webResourceRequest.getUrl().toString(), path, query, webResourceRequest.getRequestHeaders());
        if (m12697e == null) {
            HSLogger.m65439e("ResCacheUtil", "Error in receiving response for intercepted request to be cached- " + url + " \n Path: " + path + "\n Query: " + query);
            return null;
        }
        String m12689m = helpshiftResourceCacheManager.m12689m(path, query);
        Map<String, String> m12692j = helpshiftResourceCacheManager.m12692j(path, query);
        HSLogger.m65441d("ResCacheUtil", "Response received for intercepted request to be cached- " + url.toString() + " MimeType:" + m12689m);
        return new WebResourceResponse(m12689m, C20517nb.f52167N, 200, "OK", m12692j, m12697e);
    }
}
