package sg.bigo.ads.core.p964e.p965a.p966a.p967a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.smaato.sdk.video.vast.model.AdParameters;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.Tracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.w3c.dom.Node;
import sg.bigo.ads.common.utils.C43828k;
import sg.bigo.ads.core.p964e.C44180a;
import sg.bigo.ads.core.p964e.p965a.p966a.InterfaceC44183a;
import sg.bigo.ads.core.p964e.p965a.p966a.InterfaceC44192c;
import sg.bigo.ads.core.p964e.p965a.p966a.InterfaceC44193d;
import sg.bigo.ads.core.p964e.p965a.p966a.InterfaceC44196g;

/* renamed from: sg.bigo.ads.core.e.a.a.a.d */
/* loaded from: classes10.dex */
public final class C44187d implements InterfaceC44193d {
    @NonNull

    /* renamed from: a */
    private final Node f115987a;

    /* renamed from: b */
    private final String f115988b;

    /* renamed from: c */
    private final int f115989c;

    /* renamed from: d */
    private final int f115990d;

    /* renamed from: g */
    private String f115993g;

    /* renamed from: h */
    private InterfaceC44183a f115994h;

    /* renamed from: i */
    private String f115995i;

    /* renamed from: e */
    private final List<InterfaceC44196g> f115991e = new ArrayList();

    /* renamed from: f */
    private final List<String> f115992f = new ArrayList();

    /* renamed from: j */
    private final List<InterfaceC44192c> f115996j = new ArrayList();

    public C44187d(@NonNull Node node) {
        this.f115987a = node;
        this.f115988b = C44180a.m3722e(node, "id");
        this.f115989c = C44180a.m3723d(node, "width").intValue();
        this.f115990d = C44180a.m3723d(node, "height").intValue();
        m3716g();
    }

    /* renamed from: g */
    private void m3716g() {
        List<Node> m3725b = C44180a.m3725b(this.f115987a, "StaticResource", null, null);
        if (!C43828k.m4877a((Collection) m3725b)) {
            for (Node node : m3725b) {
                this.f115991e.add(new C44190g(C44180a.m3722e(node, "creativeType"), C44180a.m3731a(node)));
            }
        }
        List<Node> m3725b2 = C44180a.m3725b(this.f115987a, "IFrameResource", null, null);
        if (!C43828k.m4877a((Collection) m3725b2)) {
            for (Node node2 : m3725b2) {
                this.f115991e.add(new C44189f(C44180a.m3727b(node2)));
            }
        }
        List<Node> m3725b3 = C44180a.m3725b(this.f115987a, "HTMLResource", null, null);
        if (!C43828k.m4877a((Collection) m3725b3)) {
            for (Node node3 : m3725b3) {
                this.f115991e.add(new C44188e(C44180a.m3727b(node3)));
            }
        }
        Node m3729a = C44180a.m3729a(this.f115987a, Companion.ALT_TEXT, null, null);
        if (m3729a != null) {
            this.f115993g = C44180a.m3727b(m3729a);
        }
        Node m3729a2 = C44180a.m3729a(this.f115987a, "AdParameters", null, null);
        if (m3729a2 != null) {
            this.f115994h = new C44184a(TextUtils.equals(C44180a.m3722e(m3729a2, AdParameters.XML_ENCODED), "true"), C44180a.m3727b(m3729a2));
        }
        Node m3729a3 = C44180a.m3729a(this.f115987a, Companion.COMPANION_CLICK_THROUGH, null, null);
        if (m3729a3 != null) {
            this.f115995i = C44180a.m3731a(m3729a3);
        }
        List<Node> m3725b4 = C44180a.m3725b(this.f115987a, Companion.COMPANION_CLICK_TRACKING, null, null);
        if (!C43828k.m4877a((Collection) m3725b4)) {
            for (Node node4 : m3725b4) {
                this.f115996j.add(new C44186c(C44180a.m3722e(node4, "id"), C44180a.m3731a(node4)));
            }
        }
        Node m3729a4 = C44180a.m3729a(this.f115987a, "TrackingEvents", null, null);
        if (m3729a4 != null) {
            List<Node> m3725b5 = C44180a.m3725b(m3729a4, Tracking.NAME, "event", Arrays.asList("creativeView"));
            if (!C43828k.m4877a((Collection) m3725b5)) {
                for (Node node5 : m3725b5) {
                    String m3731a = C44180a.m3731a(node5);
                    if (!TextUtils.isEmpty(m3731a)) {
                        this.f115992f.add(m3731a);
                    }
                }
            }
        }
    }

    @Override // sg.bigo.ads.core.p964e.p965a.p966a.InterfaceC44193d
    /* renamed from: a */
    public final int mo3713a() {
        return this.f115989c;
    }

    @Override // sg.bigo.ads.core.p964e.p965a.p966a.InterfaceC44193d
    /* renamed from: b */
    public final int mo3712b() {
        return this.f115990d;
    }

    @Override // sg.bigo.ads.core.p964e.p965a.p966a.InterfaceC44193d
    /* renamed from: c */
    public final List<InterfaceC44196g> mo3711c() {
        return this.f115991e;
    }

    @Override // sg.bigo.ads.core.p964e.p965a.p966a.InterfaceC44193d
    /* renamed from: d */
    public final String mo3710d() {
        return this.f115995i;
    }

    @Override // sg.bigo.ads.core.p964e.p965a.p966a.InterfaceC44193d
    /* renamed from: e */
    public final List<InterfaceC44192c> mo3709e() {
        return this.f115996j;
    }

    @Override // sg.bigo.ads.core.p964e.p965a.p966a.InterfaceC44193d
    /* renamed from: f */
    public final List<String> mo3708f() {
        return this.f115992f;
    }
}
