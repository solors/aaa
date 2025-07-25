package sg.bigo.ads.core.p964e.p965a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.Tracking;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.w3c.dom.Node;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.core.p964e.C44180a;

/* renamed from: sg.bigo.ads.core.e.a.h */
/* loaded from: classes10.dex */
public final class C44204h {
    @NonNull

    /* renamed from: a */
    final Node f116022a;

    public C44204h(@NonNull Node node) {
        this.f116022a = node;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public final String m3693a() {
        Node m3729a = C44180a.m3729a(this.f116022a, "VideoClicks", null, null);
        if (m3729a == null) {
            return null;
        }
        return C44180a.m3731a(C44180a.m3729a(m3729a, VideoClicks.CLICK_THROUGH, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: b */
    public final List<C44212n> m3690b() {
        List<Node> m3724c;
        ArrayList arrayList = new ArrayList();
        Node m3730a = C44180a.m3730a(this.f116022a, "VideoClicks");
        if (m3730a == null || (m3724c = C44180a.m3724c(m3730a, VideoClicks.CLICK_TRACKING)) == null) {
            return arrayList;
        }
        for (Node node : m3724c) {
            String m3731a = C44180a.m3731a(node);
            if (m3731a != null) {
                arrayList.add(new C44212n(m3731a));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: c */
    public final List<C44206j> m3688c() {
        List<String> m3689b = m3689b("mute");
        ArrayList arrayList = new ArrayList();
        for (String str : m3689b) {
            arrayList.add(new C44206j(str, true));
        }
        for (String str2 : m3689b("unmute")) {
            arrayList.add(new C44206j(str2, false));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: d */
    public final List<C44212n> m3687d() {
        List<C44212n> m3692a = m3692a("close");
        m3692a.addAll(m3692a("closeLinear"));
        return m3692a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: e */
    public final List<C44212n> m3686e() {
        List<String> m3689b = m3689b("pause");
        ArrayList arrayList = new ArrayList();
        for (String str : m3689b) {
            arrayList.add(new C44212n(str, (byte) 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: f */
    public final List<C44212n> m3685f() {
        List<String> m3689b = m3689b("resume");
        ArrayList arrayList = new ArrayList();
        for (String str : m3689b) {
            arrayList.add(new C44212n(str, (byte) 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: g */
    public final List<C44210l> m3684g() {
        ArrayList arrayList = new ArrayList();
        m3691a(arrayList, m3689b("firstQuartile"), 25.0f);
        m3691a(arrayList, m3689b("midpoint"), 50.0f);
        m3691a(arrayList, m3689b("thirdQuartile"), 75.0f);
        List<Node> m3725b = C44180a.m3725b(C44180a.m3730a(this.f116022a, "TrackingEvents"), Tracking.NAME, "event", Collections.singletonList("progress"));
        if (m3725b != null) {
            for (Node node : m3725b) {
                String m3722e = C44180a.m3722e(node, "offset");
                if (m3722e != null) {
                    String trim = m3722e.trim();
                    if (C44213o.m3665a(trim)) {
                        String m3731a = C44180a.m3731a(node);
                        try {
                            int m3662d = C44213o.m3662d(trim);
                            if (m3662d >= 0 && C43836q.m4827b((CharSequence) m3731a)) {
                                arrayList.add(new C44210l(m3731a, m3662d));
                            }
                        } catch (NumberFormatException unused) {
                            C43782a.m5010a(0, 3, "VastLinearNode", String.format("Failed to parse VAST progress tracker %s", trim));
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: h */
    public final List<C44199c> m3683h() {
        ArrayList arrayList = new ArrayList();
        for (String str : m3689b("start")) {
            arrayList.add(new C44199c(str, 0));
        }
        Node m3730a = C44180a.m3730a(this.f116022a, "TrackingEvents");
        List<Node> m3725b = C44180a.m3725b(m3730a, Tracking.NAME, "event", Collections.singletonList("progress"));
        if (m3725b != null) {
            for (Node node : m3725b) {
                String m3722e = C44180a.m3722e(node, "offset");
                if (m3722e != null) {
                    String trim = m3722e.trim();
                    if (C44213o.m3664b(trim)) {
                        String m3727b = C44180a.m3727b(node);
                        if (!C43836q.m4837a((CharSequence) m3727b)) {
                            try {
                                int m3663c = C44213o.m3663c(trim);
                                if (m3663c >= 0) {
                                    arrayList.add(new C44199c(m3727b, m3663c));
                                }
                            } catch (NumberFormatException unused) {
                                C43782a.m5010a(0, 3, "VastLinearNode", String.format("Failed to parse VAST progress tracker %s", trim));
                            }
                        }
                    }
                }
            }
        }
        List<Node> m3725b2 = C44180a.m3725b(m3730a, Tracking.NAME, "event", Collections.singletonList("creativeView"));
        if (m3725b2 != null) {
            for (Node node2 : m3725b2) {
                String m3731a = C44180a.m3731a(node2);
                if (m3731a != null) {
                    arrayList.add(new C44199c(m3731a, 0));
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: i */
    public final int m3682i() {
        String m3726b = C44180a.m3726b(this.f116022a, Linear.DURATION);
        if (C43836q.m4837a((CharSequence) m3726b)) {
            return -1;
        }
        return C44213o.m3663c(m3726b);
    }

    @NonNull
    /* renamed from: b */
    private List<String> m3689b(@NonNull String str) {
        List<Node> m3725b;
        ArrayList arrayList = new ArrayList();
        Node m3730a = C44180a.m3730a(this.f116022a, "TrackingEvents");
        if (m3730a == null || (m3725b = C44180a.m3725b(m3730a, Tracking.NAME, "event", Collections.singletonList(str))) == null) {
            return arrayList;
        }
        for (Node node : m3725b) {
            String m3731a = C44180a.m3731a(node);
            if (m3731a != null) {
                arrayList.add(m3731a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public final List<C44212n> m3692a(@NonNull String str) {
        List<String> m3689b = m3689b(str);
        ArrayList arrayList = new ArrayList(m3689b.size());
        for (String str2 : m3689b) {
            arrayList.add(new C44212n(str2));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m3691a(@NonNull List<C44210l> list, @NonNull List<String> list2, float f) {
        for (String str : list2) {
            list.add(new C44210l(str, f));
        }
    }
}
