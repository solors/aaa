package com.pubmatic.sdk.common.network;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Header;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.ironsource.C20517nb;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBNetworkHandler {
    @NonNull

    /* renamed from: a */
    private final POBRequestQueue f70203a;

    /* loaded from: classes7.dex */
    public interface POBImageNetworkListener<T> {
        void onFailure(POBError pOBError);

        void onSuccess(Bitmap bitmap);
    }

    /* loaded from: classes7.dex */
    public interface POBNetworkListener<T> {
        void onFailure(@NonNull POBError pOBError);

        void onSuccess(@Nullable T t);
    }

    /* loaded from: classes7.dex */
    public interface POBNetworkResultListener {
        void onResult(@Nullable POBNetworkResult pOBNetworkResult);
    }

    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkHandler$a */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C26701a {

        /* renamed from: a */
        static final /* synthetic */ int[] f70204a;

        static {
            int[] iArr = new int[POBHttpRequest.HTTP_METHOD.values().length];
            f70204a = iArr;
            try {
                iArr[POBHttpRequest.HTTP_METHOD.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70204a[POBHttpRequest.HTTP_METHOD.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70204a[POBHttpRequest.HTTP_METHOD.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkHandler$b */
    /* loaded from: classes7.dex */
    public class C26702b implements Response.InterfaceC3756b<String> {

        /* renamed from: a */
        final /* synthetic */ POBNetworkListener f70205a;

        C26702b(POBNetworkListener pOBNetworkListener) {
            POBNetworkHandler.this = r1;
            this.f70205a = pOBNetworkListener;
        }

        @Override // com.android.volley.Response.InterfaceC3756b
        /* renamed from: a */
        public void onResponse(String str) {
            POBNetworkListener pOBNetworkListener = this.f70205a;
            if (pOBNetworkListener != null) {
                pOBNetworkListener.onSuccess(str);
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkHandler$c */
    /* loaded from: classes7.dex */
    public class C26703c extends StringRequest {

        /* renamed from: a */
        final /* synthetic */ POBHttpRequest f70207a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26703c(int i, String str, Response.InterfaceC3756b interfaceC3756b, Response.InterfaceC3755a interfaceC3755a, POBHttpRequest pOBHttpRequest) {
            super(i, str, interfaceC3756b, interfaceC3755a);
            POBNetworkHandler.this = r1;
            this.f70207a = pOBHttpRequest;
        }

        @Override // com.android.volley.Request
        @Nullable
        public byte[] getBody() {
            if (this.f70207a.getPostData() == null) {
                return null;
            }
            return this.f70207a.getPostData().getBytes(StandardCharsets.UTF_8);
        }

        @Override // com.android.volley.Request
        public Map<String, String> getHeaders() {
            return this.f70207a.getHeaders();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkHandler$d */
    /* loaded from: classes7.dex */
    public class C26704d implements Response.InterfaceC3756b<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ POBImageNetworkListener f70209a;

        C26704d(POBImageNetworkListener pOBImageNetworkListener) {
            POBNetworkHandler.this = r1;
            this.f70209a = pOBImageNetworkListener;
        }

        @Override // com.android.volley.Response.InterfaceC3756b
        /* renamed from: a */
        public void onResponse(Bitmap bitmap) {
            POBImageNetworkListener pOBImageNetworkListener = this.f70209a;
            if (pOBImageNetworkListener != null) {
                pOBImageNetworkListener.onSuccess(bitmap);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkHandler$e */
    /* loaded from: classes7.dex */
    public class C26705e implements Response.InterfaceC3755a {

        /* renamed from: a */
        final /* synthetic */ POBImageNetworkListener f70211a;

        C26705e(POBImageNetworkListener pOBImageNetworkListener) {
            POBNetworkHandler.this = r1;
            this.f70211a = pOBImageNetworkListener;
        }

        @Override // com.android.volley.Response.InterfaceC3755a
        public void onErrorResponse(VolleyError volleyError) {
            if (this.f70211a != null) {
                this.f70211a.onFailure(new POBError(1007, "not able to fetch response"));
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkHandler$f */
    /* loaded from: classes7.dex */
    public class C26706f implements Response.InterfaceC3756b<JSONObject> {

        /* renamed from: a */
        final /* synthetic */ POBNetworkListener f70213a;

        C26706f(POBNetworkListener pOBNetworkListener) {
            POBNetworkHandler.this = r1;
            this.f70213a = pOBNetworkListener;
        }

        @Override // com.android.volley.Response.InterfaceC3756b
        /* renamed from: a */
        public void onResponse(JSONObject jSONObject) {
            POBNetworkListener pOBNetworkListener = this.f70213a;
            if (pOBNetworkListener != null) {
                pOBNetworkListener.onSuccess(jSONObject);
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkHandler$g */
    /* loaded from: classes7.dex */
    public class C26707g extends JsonObjectRequest {

        /* renamed from: a */
        final /* synthetic */ POBHttpRequest f70215a;

        /* renamed from: b */
        final /* synthetic */ POBNetworkResultListener f70216b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26707g(int i, String str, JSONObject jSONObject, Response.InterfaceC3756b interfaceC3756b, Response.InterfaceC3755a interfaceC3755a, POBHttpRequest pOBHttpRequest, POBNetworkResultListener pOBNetworkResultListener) {
            super(i, str, jSONObject, interfaceC3756b, interfaceC3755a);
            POBNetworkHandler.this = r7;
            this.f70215a = pOBHttpRequest;
            this.f70216b = pOBNetworkResultListener;
        }

        @Override // com.android.volley.toolbox.JsonRequest, com.android.volley.Request
        @Nullable
        public byte[] getBody() {
            if (this.f70215a.getPostData() == null) {
                return null;
            }
            return this.f70215a.getPostData().getBytes(StandardCharsets.UTF_8);
        }

        @Override // com.android.volley.Request
        public Map<String, String> getHeaders() {
            return this.f70215a.getHeaders();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.volley.toolbox.JsonObjectRequest, com.android.volley.toolbox.JsonRequest, com.android.volley.Request
        public Response<JSONObject> parseNetworkResponse(NetworkResponse networkResponse) {
            try {
                JSONObject jSONObject = new JSONObject(new String(networkResponse.f3480b, HttpHeaderParser.m102233g(networkResponse.f3481c, C20517nb.f52167N)));
                if (this.f70216b != null) {
                    Map map = networkResponse.f3481c;
                    if (map == null) {
                        map = new HashMap();
                    }
                    this.f70216b.onResult(new POBNetworkResult(map, networkResponse.f3484f));
                }
                return Response.m102282c(jSONObject, HttpHeaderParser.m102235e(networkResponse));
            } catch (UnsupportedEncodingException | JSONException unused) {
                return Response.m102284a(new ParseError(networkResponse));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkHandler$h */
    /* loaded from: classes7.dex */
    public class C26708h implements RequestQueue.InterfaceC3753c {

        /* renamed from: a */
        final /* synthetic */ String f70218a;

        C26708h(String str) {
            POBNetworkHandler.this = r1;
            this.f70218a = str;
        }

        @Override // com.android.volley.RequestQueue.InterfaceC3753c
        public boolean apply(Request<?> request) {
            if (!this.f70218a.equals(request.getTag())) {
                return false;
            }
            POBLog.debug("PMNetworkHandler", "Cancelled volley Ad Request for Tag <" + this.f70218a + "> ", new Object[0]);
            return true;
        }
    }

    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkHandler$i */
    /* loaded from: classes7.dex */
    public class C26709i implements Response.InterfaceC3755a {

        /* renamed from: a */
        final /* synthetic */ POBNetworkResultListener f70220a;

        /* renamed from: b */
        final /* synthetic */ POBHttpRequest f70221b;

        /* renamed from: c */
        final /* synthetic */ POBNetworkListener f70222c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC26711k f70223d;

        C26709i(POBNetworkResultListener pOBNetworkResultListener, POBHttpRequest pOBHttpRequest, POBNetworkListener pOBNetworkListener, InterfaceC26711k interfaceC26711k) {
            POBNetworkHandler.this = r1;
            this.f70220a = pOBNetworkResultListener;
            this.f70221b = pOBHttpRequest;
            this.f70222c = pOBNetworkListener;
            this.f70223d = interfaceC26711k;
        }

        @Override // com.android.volley.Response.InterfaceC3755a
        public void onErrorResponse(VolleyError volleyError) {
            if (this.f70220a != null) {
                NetworkResponse m40597a = POBNetworkHandler.this.m40597a(volleyError, this.f70221b);
                Map map = m40597a.f3481c;
                if (map == null) {
                    map = new HashMap();
                }
                this.f70220a.onResult(new POBNetworkResult(map, m40597a.f3484f));
            }
            if (this.f70222c != null) {
                try {
                    POBHttpRequest m40596a = POBNetworkHandler.this.m40596a(volleyError, this.f70221b, this.f70223d);
                    if (m40596a != null) {
                        POBNetworkHandler.this.sendRequest(m40596a, this.f70222c);
                    } else {
                        this.f70222c.onFailure(POBNetworkHandler.this.m40598a(volleyError));
                    }
                } catch (VolleyError e) {
                    this.f70222c.onFailure(POBNetworkHandler.this.m40598a(e));
                }
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkHandler$j */
    /* loaded from: classes7.dex */
    public class C26710j implements Response.InterfaceC3755a {

        /* renamed from: a */
        final /* synthetic */ POBNetworkResultListener f70225a;

        /* renamed from: b */
        final /* synthetic */ POBHttpRequest f70226b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC26711k f70227c;

        /* renamed from: d */
        final /* synthetic */ POBNetworkListener f70228d;

        C26710j(POBNetworkResultListener pOBNetworkResultListener, POBHttpRequest pOBHttpRequest, InterfaceC26711k interfaceC26711k, POBNetworkListener pOBNetworkListener) {
            POBNetworkHandler.this = r1;
            this.f70225a = pOBNetworkResultListener;
            this.f70226b = pOBHttpRequest;
            this.f70227c = interfaceC26711k;
            this.f70228d = pOBNetworkListener;
        }

        @Override // com.android.volley.Response.InterfaceC3755a
        public void onErrorResponse(VolleyError volleyError) {
            if (this.f70225a != null) {
                NetworkResponse m40597a = POBNetworkHandler.this.m40597a(volleyError, this.f70226b);
                Map map = m40597a.f3481c;
                if (map == null) {
                    map = new HashMap();
                }
                this.f70225a.onResult(new POBNetworkResult(map, m40597a.f3484f));
            }
            try {
                POBHttpRequest m40596a = POBNetworkHandler.this.m40596a(volleyError, this.f70226b, this.f70227c);
                if (m40596a != null) {
                    POBNetworkHandler.this.sendJSONRequest(m40596a, this.f70228d);
                    return;
                }
                POBNetworkListener pOBNetworkListener = this.f70228d;
                if (pOBNetworkListener != null) {
                    pOBNetworkListener.onFailure(POBNetworkHandler.this.m40598a(volleyError));
                }
            } catch (VolleyError e) {
                POBNetworkListener pOBNetworkListener2 = this.f70228d;
                if (pOBNetworkListener2 != null) {
                    pOBNetworkListener2.onFailure(POBNetworkHandler.this.m40598a(e));
                }
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.common.network.POBNetworkHandler$k */
    /* loaded from: classes7.dex */
    public interface InterfaceC26711k {
        /* renamed from: a */
        POBHttpRequest m40583a(POBHttpRequest pOBHttpRequest);
    }

    public POBNetworkHandler(@NonNull Context context) {
        this(POBVolley.newRequestQueue(context, new BasicNetwork(new HurlStack())));
    }

    /* renamed from: b */
    private Response.InterfaceC3755a m40588b(@NonNull POBHttpRequest pOBHttpRequest, @Nullable POBNetworkListener<JSONObject> pOBNetworkListener, @Nullable InterfaceC26711k interfaceC26711k, @Nullable POBNetworkResultListener pOBNetworkResultListener) {
        return new C26710j(pOBNetworkResultListener, pOBHttpRequest, interfaceC26711k, pOBNetworkListener);
    }

    /* renamed from: c */
    private void m40587c(@NonNull POBHttpRequest pOBHttpRequest, @Nullable POBNetworkListener<JSONObject> pOBNetworkListener, @Nullable InterfaceC26711k interfaceC26711k, @Nullable POBNetworkResultListener pOBNetworkResultListener) {
        String url;
        int m40595a = m40595a(pOBHttpRequest.getRequestMethod());
        if (pOBHttpRequest.getRequestMethod() == POBHttpRequest.HTTP_METHOD.GET && !POBUtils.isNullOrEmpty(pOBHttpRequest.getPostData())) {
            url = pOBHttpRequest.getUrl() + pOBHttpRequest.getPostData();
        } else {
            url = pOBHttpRequest.getUrl();
        }
        C26707g c26707g = new C26707g(m40595a, url, null, new C26706f(pOBNetworkListener), m40588b(pOBHttpRequest, pOBNetworkListener, interfaceC26711k, pOBNetworkResultListener), pOBHttpRequest, pOBNetworkResultListener);
        m40594a(pOBHttpRequest, c26707g);
        m40599a(c26707g, pOBHttpRequest.getRequestTag());
    }

    public void cancelRequest(@NonNull String str) {
        POBRequestQueue pOBRequestQueue = this.f70203a;
        if (pOBRequestQueue != null) {
            pOBRequestQueue.cancelAll((RequestQueue.InterfaceC3753c) new C26708h(str));
        }
    }

    public void sendImageRequest(@Nullable POBImageRequest pOBImageRequest, @Nullable POBImageNetworkListener<String> pOBImageNetworkListener) {
        if (pOBImageRequest != null && pOBImageRequest.getUrl() != null) {
            ImageRequest imageRequest = new ImageRequest(pOBImageRequest.getUrl(), new C26704d(pOBImageNetworkListener), pOBImageRequest.getMaxWidth(), pOBImageRequest.getMaxHeight(), pOBImageRequest.getScaleType(), pOBImageRequest.getDecodeConfig(), new C26705e(pOBImageNetworkListener));
            m40594a(pOBImageRequest, imageRequest);
            m40599a(imageRequest, pOBImageRequest.getRequestTag());
        } else if (pOBImageNetworkListener != null) {
            pOBImageNetworkListener.onFailure(new POBError(1001, "Request parameter or URL is null."));
        }
    }

    public void sendJSONRequest(POBHttpRequest pOBHttpRequest, @Nullable POBNetworkListener<JSONObject> pOBNetworkListener) {
        m40587c(pOBHttpRequest, pOBNetworkListener, null, null);
    }

    public void sendRequest(@NonNull String str, @Nullable String str2, POBNetworkListener<String> pOBNetworkListener, @Nullable InterfaceC26711k interfaceC26711k) {
        POBHttpRequest pOBHttpRequest = new POBHttpRequest();
        pOBHttpRequest.setUrl(str);
        pOBHttpRequest.setRequestTag(str2);
        sendRequest(pOBHttpRequest, pOBNetworkListener, interfaceC26711k);
    }

    public POBNetworkHandler(@NonNull POBRequestQueue pOBRequestQueue) {
        this.f70203a = pOBRequestQueue;
    }

    /* renamed from: b */
    private boolean m40589b(VolleyError volleyError) {
        NetworkResponse networkResponse = volleyError.f3549b;
        if (networkResponse != null) {
            int i = networkResponse.f3479a;
            return 301 == i || i == 302 || i == 303;
        }
        return false;
    }

    public void sendJSONRequest(@NonNull POBHttpRequest pOBHttpRequest, @Nullable POBNetworkListener<JSONObject> pOBNetworkListener, @Nullable POBNetworkResultListener pOBNetworkResultListener) {
        m40587c(pOBHttpRequest, pOBNetworkListener, null, pOBNetworkResultListener);
    }

    /* renamed from: a */
    private void m40594a(@NonNull POBHttpRequest pOBHttpRequest, @NonNull Request request) {
        if (pOBHttpRequest.getTimeout() > 0 || pOBHttpRequest.getRetryCount() > 0) {
            request.setRetryPolicy(new DefaultRetryPolicy(pOBHttpRequest.getTimeout(), pOBHttpRequest.getRetryCount(), pOBHttpRequest.getRetryBackoffMultiplier()));
        }
    }

    public void sendRequest(String str, String str2, POBNetworkListener<String> pOBNetworkListener) {
        sendRequest(str, str2, pOBNetworkListener, null);
    }

    public void sendRequest(POBHttpRequest pOBHttpRequest, POBNetworkListener<String> pOBNetworkListener) {
        sendRequest(pOBHttpRequest, pOBNetworkListener, (InterfaceC26711k) null);
    }

    public void sendRequest(@Nullable POBHttpRequest pOBHttpRequest, @Nullable POBNetworkListener<String> pOBNetworkListener, @Nullable InterfaceC26711k interfaceC26711k) {
        if (pOBHttpRequest == null || pOBHttpRequest.getUrl() == null || pOBHttpRequest.getRequestMethod() == null) {
            if (pOBNetworkListener != null) {
                pOBNetworkListener.onFailure(new POBError(1001, "Request parameter or URL is null."));
                return;
            }
            return;
        }
        C26703c c26703c = new C26703c(m40595a(pOBHttpRequest.getRequestMethod()), pOBHttpRequest.getUrl(), new C26702b(pOBNetworkListener), m40593a(pOBHttpRequest, pOBNetworkListener, interfaceC26711k, (POBNetworkResultListener) null), pOBHttpRequest);
        m40594a(pOBHttpRequest, c26703c);
        m40599a(c26703c, pOBHttpRequest.getRequestTag());
    }

    /* renamed from: a */
    private <T> void m40599a(@NonNull Request<T> request, @Nullable String str) {
        request.setTag(str);
        this.f70203a.add(request);
    }

    /* renamed from: a */
    private int m40595a(POBHttpRequest.HTTP_METHOD http_method) {
        int i = C26701a.f70204a[http_method.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0 : 3;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    private Response.InterfaceC3755a m40593a(@NonNull POBHttpRequest pOBHttpRequest, @Nullable POBNetworkListener<String> pOBNetworkListener, @Nullable InterfaceC26711k interfaceC26711k, @Nullable POBNetworkResultListener pOBNetworkResultListener) {
        return new C26709i(pOBNetworkResultListener, pOBHttpRequest, pOBNetworkListener, interfaceC26711k);
    }

    @NonNull
    /* renamed from: a */
    public NetworkResponse m40597a(@NonNull VolleyError volleyError, @NonNull POBHttpRequest pOBHttpRequest) {
        NetworkResponse networkResponse = volleyError.f3549b;
        if (networkResponse == null) {
            networkResponse = new NetworkResponse(0, (byte[]) null, false, volleyError.m102200a(), (List<Header>) new ArrayList());
        }
        return networkResponse.f3484f > ((long) pOBHttpRequest.getTimeout()) ? new NetworkResponse(networkResponse.f3479a, networkResponse.f3480b, networkResponse.f3483e, pOBHttpRequest.getTimeout(), networkResponse.f3482d) : networkResponse;
    }

    @NonNull
    /* renamed from: a */
    public POBError m40598a(@NonNull VolleyError volleyError) {
        int i;
        String message = volleyError.getMessage() != null ? volleyError.getMessage() : "Unknown error message.";
        if (volleyError instanceof TimeoutError) {
            return new POBError(1005, message);
        }
        if (volleyError instanceof ParseError) {
            if (volleyError.f3549b != null) {
                String str = "Parsing error with HTTP status code: " + volleyError.f3549b.f3479a;
                if (volleyError.f3549b.f3479a == 204) {
                    return new POBError(1002, str);
                }
                return new POBError(1007, str);
            }
            return new POBError(1007, message);
        }
        NetworkResponse networkResponse = volleyError.f3549b;
        if (networkResponse != null && (i = networkResponse.f3479a) >= 500 && i < 600) {
            return new POBError(1004, message);
        }
        return new POBError(1006, message);
    }

    @Nullable
    /* renamed from: a */
    public POBHttpRequest m40596a(VolleyError volleyError, POBHttpRequest pOBHttpRequest, @Nullable InterfaceC26711k interfaceC26711k) throws VolleyError {
        if (m40589b(volleyError)) {
            Map<String, String> map = volleyError.f3549b.f3481c;
            String str = map != null ? map.get("Location") : null;
            if (str != null) {
                try {
                    POBHttpRequest m110237clone = pOBHttpRequest.m110237clone();
                    m110237clone.setUrl(str);
                    if (interfaceC26711k != null) {
                        POBHttpRequest m40583a = interfaceC26711k.m40583a(m110237clone);
                        return m40583a != null ? m40583a : m110237clone;
                    }
                    return m110237clone;
                } catch (CloneNotSupportedException e) {
                    throw new VolleyError(e);
                }
            }
            throw new VolleyError("Location header does not exists for Redirection");
        }
        return null;
    }
}
