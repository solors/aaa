package com.inmobi.media;

import com.ironsource.C21114v8;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.StringsJVM;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.G8 */
/* loaded from: classes6.dex */
public class C18938G8 {

    /* renamed from: a */
    public final String f47267a;

    /* renamed from: b */
    public final String f47268b;

    /* renamed from: c */
    public final C18969Ib f47269c;

    /* renamed from: d */
    public boolean f47270d;

    /* renamed from: e */
    public final InterfaceC18850A4 f47271e;

    /* renamed from: f */
    public final String f47272f;

    /* renamed from: g */
    public final boolean f47273g;

    /* renamed from: h */
    public final String f47274h;

    /* renamed from: i */
    public final HashMap f47275i;

    /* renamed from: j */
    public final HashMap f47276j;

    /* renamed from: k */
    public final HashMap f47277k;

    /* renamed from: l */
    public JSONObject f47278l;

    /* renamed from: m */
    public String f47279m;

    /* renamed from: n */
    public C18952H8 f47280n;

    /* renamed from: o */
    public boolean f47281o;

    /* renamed from: p */
    public int f47282p;

    /* renamed from: q */
    public int f47283q;

    /* renamed from: r */
    public boolean f47284r;

    /* renamed from: s */
    public boolean f47285s;

    /* renamed from: t */
    public boolean f47286t;

    /* renamed from: u */
    public boolean f47287u;

    /* renamed from: v */
    public boolean f47288v;

    /* renamed from: w */
    public C19275fa f47289w;

    /* renamed from: x */
    public boolean f47290x;

    public C18938G8(String requestType, String str, C18969Ib c18969Ib, boolean z, InterfaceC18850A4 interfaceC18850A4, String requestContentType, boolean z2) {
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(requestContentType, "requestContentType");
        this.f47267a = requestType;
        this.f47268b = str;
        this.f47269c = c18969Ib;
        this.f47270d = z;
        this.f47271e = interfaceC18850A4;
        this.f47272f = requestContentType;
        this.f47273g = z2;
        this.f47274h = C18938G8.class.getSimpleName();
        this.f47275i = new HashMap();
        this.f47279m = C18954Ha.m61076b();
        this.f47282p = 60000;
        this.f47283q = 60000;
        this.f47284r = true;
        this.f47286t = true;
        this.f47287u = true;
        this.f47288v = true;
        this.f47290x = true;
        if (Intrinsics.m17075f("GET", requestType)) {
            this.f47276j = new HashMap();
        } else if (Intrinsics.m17075f("POST", requestType)) {
            this.f47277k = new HashMap();
            this.f47278l = new JSONObject();
        }
    }

    /* renamed from: a */
    public final void m61109a(Function1 onResponse) {
        Intrinsics.checkNotNullParameter(onResponse, "onResponse");
        InterfaceC18850A4 interfaceC18850A4 = this.f47271e;
        if (interfaceC18850A4 != null) {
            String str = this.f47274h;
            StringBuilder m61272a = AbstractC18851A5.m61272a(str, "TAG", "executeAsync: ");
            m61272a.append(this.f47268b);
            ((C18864B4) interfaceC18850A4).m61259a(str, m61272a.toString());
        }
        m61105e();
        if (!this.f47270d) {
            InterfaceC18850A4 interfaceC18850A42 = this.f47271e;
            if (interfaceC18850A42 != null) {
                String TAG = this.f47274h;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C18864B4) interfaceC18850A42).m61254c(TAG, "Dropping REQUEST FOR GDPR");
            }
            C18952H8 c18952h8 = new C18952H8();
            c18952h8.f47317c = new C18896D8(EnumC19506w3.f48799j, "Network Request dropped as current request is not GDPR compliant.");
            onResponse.invoke(c18952h8);
            return;
        }
        C19289ga request = m61111a();
        C18924F8 responseListener = new C18924F8(this, onResponse);
        Intrinsics.checkNotNullParameter(responseListener, "responseListener");
        request.f48273l = responseListener;
        Set set = AbstractC19317ia.f48368a;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(request, "request");
        AbstractC19317ia.f48368a.add(request);
        AbstractC19317ia.m60221a(request, 0L);
    }

    /* renamed from: b */
    public final C18952H8 m61108b() {
        C19373ma m61236a;
        EnumC19506w3 enumC19506w3;
        InterfaceC18850A4 interfaceC18850A4 = this.f47271e;
        if (interfaceC18850A4 != null) {
            String str = this.f47274h;
            StringBuilder m61272a = AbstractC18851A5.m61272a(str, "TAG", "executeRequest: ");
            m61272a.append(this.f47268b);
            ((C18864B4) interfaceC18850A4).m61254c(str, m61272a.toString());
        }
        m61105e();
        if (!this.f47270d) {
            InterfaceC18850A4 interfaceC18850A42 = this.f47271e;
            if (interfaceC18850A42 != null) {
                String TAG = this.f47274h;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C18864B4) interfaceC18850A42).m61254c(TAG, "Dropping REQUEST FOR GDPR");
            }
            C18952H8 c18952h8 = new C18952H8();
            c18952h8.f47317c = new C18896D8(EnumC19506w3.f48799j, "Network Request dropped as current request is not GDPR compliant.");
            return c18952h8;
        }
        C18896D8 c18896d8 = null;
        if (this.f47280n != null) {
            InterfaceC18850A4 interfaceC18850A43 = this.f47271e;
            if (interfaceC18850A43 != null) {
                String str2 = this.f47274h;
                StringBuilder m61272a2 = AbstractC18851A5.m61272a(str2, "TAG", "response has been failed before execute - ");
                C18952H8 c18952h82 = this.f47280n;
                if (c18952h82 != null) {
                    c18896d8 = c18952h82.f47317c;
                }
                m61272a2.append(c18896d8);
                ((C18864B4) interfaceC18850A43).m61254c(str2, m61272a2.toString());
            }
            C18952H8 c18952h83 = this.f47280n;
            Intrinsics.m17074g(c18952h83);
            return c18952h83;
        }
        C19289ga request = m61111a();
        Intrinsics.checkNotNullParameter(request, "request");
        do {
            m61236a = AbstractC18882C8.m61236a(request, (Function2) null);
            C18896D8 c18896d82 = m61236a.f48511a;
            if (c18896d82 != null) {
                enumC19506w3 = c18896d82.f47181a;
            } else {
                enumC19506w3 = null;
            }
        } while (enumC19506w3 == EnumC19506w3.f48802m);
        Intrinsics.checkNotNullParameter(m61236a, "<this>");
        C18952H8 response = new C18952H8();
        byte[] value = m61236a.f48513c;
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (value.length == 0) {
                response.f47316b = new byte[0];
            } else {
                byte[] bArr = new byte[value.length];
                response.f47316b = bArr;
                System.arraycopy(value, 0, bArr, 0, value.length);
            }
        }
        response.f47319e = m61236a.f48512b;
        response.f47318d = m61236a.f48515e;
        response.f47317c = m61236a.f48511a;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(this, "request");
        return response;
    }

    /* renamed from: c */
    public final String m61107c() {
        String str = this.f47272f;
        if (Intrinsics.m17075f(str, "application/json")) {
            return String.valueOf(this.f47278l);
        }
        if (Intrinsics.m17075f(str, "application/x-www-form-urlencoded")) {
            AbstractC18994K8.m60974a(this.f47277k);
            return AbstractC18994K8.m60976a(C21114v8.C21123i.f54135c, (Map) this.f47277k);
        }
        return "";
    }

    /* renamed from: d */
    public final String m61106d() {
        boolean m16616x;
        boolean m16616x2;
        boolean m16592R;
        int i;
        boolean z;
        String str = this.f47268b;
        HashMap hashMap = this.f47276j;
        if (hashMap != null) {
            AbstractC18994K8.m60974a(hashMap);
            String m60976a = AbstractC18994K8.m60976a(C21114v8.C21123i.f54135c, (Map) this.f47276j);
            InterfaceC18850A4 interfaceC18850A4 = this.f47271e;
            if (interfaceC18850A4 != null) {
                String str2 = this.f47274h;
                ((C18864B4) interfaceC18850A4).m61254c(str2, AbstractC19550z5.m59522a(str2, "TAG", "Get params: ", m60976a));
            }
            int length = m60976a.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (Intrinsics.m17071j(m60976a.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            if (m60976a.subSequence(i2, length + 1).toString().length() > 0) {
                if (str != null) {
                    m16592R = C37690r.m16592R(str, "?", false, 2, null);
                    if (!m16592R) {
                        str = str.concat("?");
                    }
                }
                if (str != null) {
                    m16616x = StringsJVM.m16616x(str, C21114v8.C21123i.f54135c, false, 2, null);
                    if (!m16616x) {
                        m16616x2 = StringsJVM.m16616x(str, "?", false, 2, null);
                        if (!m16616x2) {
                            str = str.concat(C21114v8.C21123i.f54135c);
                        }
                    }
                }
                str = str + m60976a;
            }
        }
        Intrinsics.m17074g(str);
        return str;
    }

    /* renamed from: e */
    public final void m61105e() {
        mo59879f();
        this.f47275i.put("User-Agent", C18954Ha.m61061k());
        if (Intrinsics.m17075f("POST", this.f47267a)) {
            this.f47275i.put("Content-Type", this.f47272f);
            if (this.f47273g) {
                this.f47275i.put("Content-Encoding", "gzip");
            } else {
                this.f47275i.put("Content-Length", String.valueOf(m61107c().length()));
            }
        }
    }

    /* renamed from: f */
    public void mo59879f() {
        HashMap hashMap;
        JSONObject m60912c;
        HashMap hashMap2;
        C19017M3 c19017m3 = C19017M3.f47463a;
        c19017m3.m60904j();
        this.f47270d = c19017m3.m60915a(this.f47270d);
        if (Intrinsics.m17075f("GET", this.f47267a)) {
            HashMap hashMap3 = this.f47276j;
            if (this.f47286t) {
                if (hashMap3 != null) {
                    hashMap3.putAll(C18958I0.f47335e);
                }
                if (hashMap3 != null) {
                    hashMap3.putAll(C19212b3.f48088a.m60462a(this.f47281o));
                }
                if (hashMap3 != null) {
                    hashMap3.putAll(AbstractC19227c4.m60398a());
                }
            }
            HashMap hashMap4 = this.f47276j;
            if (this.f47287u) {
                m61110a(hashMap4);
            }
        } else if (Intrinsics.m17075f("POST", this.f47267a)) {
            HashMap hashMap5 = this.f47277k;
            if (this.f47286t) {
                if (hashMap5 != null) {
                    hashMap5.putAll(C18958I0.f47335e);
                }
                if (hashMap5 != null) {
                    hashMap5.putAll(C19212b3.f48088a.m60462a(this.f47281o));
                }
                if (hashMap5 != null) {
                    hashMap5.putAll(AbstractC19227c4.m60398a());
                }
            }
            HashMap hashMap6 = this.f47277k;
            if (this.f47287u) {
                m61110a(hashMap6);
            }
        }
        if (this.f47288v && (m60912c = C19017M3.m60912c()) != null) {
            if (Intrinsics.m17075f("GET", this.f47267a)) {
                HashMap hashMap7 = this.f47276j;
                if (hashMap7 != null) {
                    String jSONObject = m60912c.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                    String str = (String) hashMap7.put("consentObject", jSONObject);
                }
            } else if (Intrinsics.m17075f("POST", this.f47267a) && (hashMap2 = this.f47277k) != null) {
                String jSONObject2 = m60912c.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                String str2 = (String) hashMap2.put("consentObject", jSONObject2);
            }
        }
        if (this.f47290x) {
            if (Intrinsics.m17075f("GET", this.f47267a)) {
                HashMap hashMap8 = this.f47276j;
                if (hashMap8 != null) {
                    String str3 = (String) hashMap8.put("u-appsecure", String.valueOf((int) C18958I0.f47336f));
                }
            } else if (Intrinsics.m17075f("POST", this.f47267a) && (hashMap = this.f47277k) != null) {
                String str4 = (String) hashMap.put("u-appsecure", String.valueOf((int) C18958I0.f47336f));
            }
        }
    }

    /* renamed from: a */
    public final C19289ga m61111a() {
        EnumC19247da method;
        String type = this.f47267a;
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.m17075f(type, "GET")) {
            method = EnumC19247da.f48165a;
        } else {
            method = Intrinsics.m17075f(type, "POST") ? EnumC19247da.f48166b : EnumC19247da.f48165a;
        }
        String url = this.f47268b;
        Intrinsics.m17074g(url);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        C19233ca c19233ca = new C19233ca(url, method);
        AbstractC18994K8.m60974a(this.f47275i);
        HashMap header = this.f47275i;
        Intrinsics.checkNotNullParameter(header, "header");
        c19233ca.f48138c = header;
        c19233ca.f48143h = Integer.valueOf(this.f47282p);
        c19233ca.f48144i = Integer.valueOf(this.f47283q);
        c19233ca.f48141f = Boolean.valueOf(this.f47284r);
        c19233ca.f48145j = Boolean.valueOf(this.f47285s);
        C19275fa retryPolicy = this.f47289w;
        if (retryPolicy != null) {
            Intrinsics.checkNotNullParameter(retryPolicy, "retryPolicy");
            c19233ca.f48142g = retryPolicy;
        }
        int ordinal = method.ordinal();
        if (ordinal == 0) {
            HashMap queryParams = this.f47276j;
            if (queryParams != null) {
                InterfaceC18850A4 interfaceC18850A4 = this.f47271e;
                if (interfaceC18850A4 != null) {
                    String TAG = this.f47274h;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((C18864B4) interfaceC18850A4).m61254c(TAG, "getParams " + queryParams);
                }
                Intrinsics.checkNotNullParameter(queryParams, "queryParams");
                c19233ca.f48139d = queryParams;
            }
        } else if (ordinal == 1) {
            String postBody = m61107c();
            InterfaceC18850A4 interfaceC18850A42 = this.f47271e;
            if (interfaceC18850A42 != null) {
                String str = this.f47274h;
                ((C18864B4) interfaceC18850A42).m61254c(str, AbstractC19550z5.m59522a(str, "TAG", "httpPostBody ", postBody));
            }
            Intrinsics.checkNotNullParameter(postBody, "postBody");
            c19233ca.f48140e = postBody;
        }
        return new C19289ga(c19233ca);
    }

    public /* synthetic */ C18938G8(String str, String str2, C18969Ib c18969Ib, boolean z, InterfaceC18850A4 interfaceC18850A4, String str3, int i) {
        this(str, str2, c18969Ib, (i & 8) != 0 ? false : z, interfaceC18850A4, (i & 32) != 0 ? "application/x-www-form-urlencoded" : str3, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18938G8(String url, InterfaceC18850A4 interfaceC18850A4) {
        this("GET", url, (C18969Ib) null, false, interfaceC18850A4, "application/x-www-form-urlencoded", 64);
        Intrinsics.checkNotNullParameter("GET", "requestType");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f47288v = false;
    }

    /* renamed from: a */
    public final void m61110a(HashMap hashMap) {
        C19545z0 m61048b;
        String m59530a;
        C18969Ib c18969Ib = this.f47269c;
        if (c18969Ib == null || hashMap == null) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        try {
            if (c18969Ib.f47350a.m60675a() && (m61048b = C18955Hb.f47329a.m61048b()) != null && (m59530a = m61048b.m59530a()) != null) {
                Intrinsics.m17074g(m59530a);
                hashMap3.put("GPID", m59530a);
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue(C18969Ib.class.getSimpleName(), "getSimpleName(...)");
        }
        String jSONObject = new JSONObject(hashMap3).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        hashMap2.put("u-id-map", jSONObject);
        hashMap.putAll(hashMap2);
    }
}
