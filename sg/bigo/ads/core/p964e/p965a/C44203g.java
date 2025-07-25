package sg.bigo.ads.core.p964e.p965a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.Extension;
import com.smaato.sdk.video.vast.model.InLine;
import com.smaato.sdk.video.vast.model.Verification;
import com.smaato.sdk.video.vast.model.ViewableImpression;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sg.bigo.ads.common.utils.C43828k;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.core.p957b.C44125a;
import sg.bigo.ads.core.p964e.C44180a;
import sg.bigo.ads.core.p964e.p965a.p966a.InterfaceC44191b;
import sg.bigo.ads.core.p964e.p965a.p966a.p967a.C44185b;

/* renamed from: sg.bigo.ads.core.e.a.g */
/* loaded from: classes10.dex */
public class C44203g {

    /* renamed from: a */
    final List<InterfaceC44191b> f116020a = new ArrayList();
    @NonNull

    /* renamed from: b */
    protected final Node f116021b;

    public C44203g(@NonNull Node node) {
        this.f116021b = node;
    }

    @NonNull
    /* renamed from: a */
    public final List<C44212n> m3704a() {
        ArrayList arrayList = new ArrayList();
        List<Node> m3724c = C44180a.m3724c(this.f116021b, "Error");
        if (m3724c == null) {
            return arrayList;
        }
        for (Node node : m3724c) {
            String m3731a = C44180a.m3731a(node);
            if (!TextUtils.isEmpty(m3731a)) {
                arrayList.add(new C44212n(m3731a));
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: b */
    public final List<C44212n> m3702b() {
        List<Node> m3725b = C44180a.m3725b(this.f116021b, "Impression", null, null);
        ArrayList arrayList = new ArrayList();
        if (m3725b == null) {
            return arrayList;
        }
        for (Node node : m3725b) {
            String m3731a = C44180a.m3731a(node);
            if (!TextUtils.isEmpty(m3731a)) {
                arrayList.add(new C44212n(m3731a));
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: c */
    public final List<C44212n> m3701c() {
        Node m3729a = C44180a.m3729a(this.f116021b, "ViewableImpression", null, null);
        ArrayList arrayList = new ArrayList();
        if (m3729a == null) {
            return arrayList;
        }
        List<Node> m3724c = C44180a.m3724c(m3729a, ViewableImpression.VIEWABLE);
        if (m3724c == null) {
            return arrayList;
        }
        for (Node node : m3724c) {
            String m3731a = C44180a.m3731a(node);
            if (!TextUtils.isEmpty(m3731a)) {
                arrayList.add(new C44212n(m3731a));
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: d */
    public final List<C44212n> m3700d() {
        Node m3729a = C44180a.m3729a(this.f116021b, "ViewableImpression", null, null);
        ArrayList arrayList = new ArrayList();
        if (m3729a == null) {
            return arrayList;
        }
        List<Node> m3724c = C44180a.m3724c(m3729a, ViewableImpression.NOT_VIEWABLE);
        if (m3724c == null) {
            return arrayList;
        }
        for (Node node : m3724c) {
            String m3731a = C44180a.m3731a(node);
            if (!TextUtils.isEmpty(m3731a)) {
                arrayList.add(new C44212n(m3731a));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final int m3699e() {
        String m3726b = C44180a.m3726b(this.f116021b, "Expires");
        if (C43836q.m4837a((CharSequence) m3726b)) {
            return 0;
        }
        try {
            return Integer.parseInt(m3726b);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @NonNull
    /* renamed from: f */
    public final String m3698f() {
        String m3726b = C44180a.m3726b(this.f116021b, InLine.AD_TITLE);
        if (m3726b == null) {
            return "";
        }
        return m3726b;
    }

    @NonNull
    /* renamed from: g */
    public final String m3697g() {
        String m3726b = C44180a.m3726b(this.f116021b, InLine.DESCRIPTION);
        if (m3726b == null) {
            return "";
        }
        return m3726b;
    }

    @NonNull
    /* renamed from: h */
    public final String m3696h() {
        String m3726b = C44180a.m3726b(this.f116021b, "AdSystem");
        if (m3726b == null) {
            return "";
        }
        return m3726b;
    }

    /* renamed from: i */
    public final int m3695i() {
        List<Node> m3725b;
        Node m3729a = C44180a.m3729a(this.f116021b, "Extensions", null, null);
        if (m3729a != null && (m3725b = C44180a.m3725b(m3729a, Extension.NAME, null, null)) != null && !m3725b.isEmpty()) {
            for (Node node : m3725b) {
                String m3726b = C44180a.m3726b(node, "Mute");
                if (C43836q.m4827b((CharSequence) m3726b)) {
                    return C43836q.m4834a(m3726b, -1);
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: j */
    public final List<C44125a> m3694j() {
        List<Node> m3725b;
        List<Node> m3724c;
        Node namedItem;
        NodeList childNodes;
        String str;
        NodeList childNodes2;
        String nodeValue;
        String nodeValue2;
        Node m3729a = C44180a.m3729a(this.f116021b, "Extensions", null, null);
        if (m3729a == null || (m3725b = C44180a.m3725b(m3729a, Extension.NAME, null, null)) == null || m3725b.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Node node : m3725b) {
            Node m3730a = C44180a.m3730a(node, "AdVerifications");
            if (m3730a != null && (m3724c = C44180a.m3724c(m3730a, Verification.NAME)) != null && !m3724c.isEmpty()) {
                for (Node node2 : m3724c) {
                    NamedNodeMap attributes = node2.getAttributes();
                    if (attributes != null && (namedItem = attributes.getNamedItem(Verification.VENDOR)) != null) {
                        C44125a c44125a = new C44125a();
                        c44125a.f115802b = namedItem.getNodeValue();
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(CampaignEx.KEY_OMID);
                        Node m3729a2 = C44180a.m3729a(node2, "JavaScriptResource", "apiFramework", arrayList2);
                        if (m3729a2 != null && (childNodes = m3729a2.getChildNodes()) != null) {
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                if (i2 < childNodes.getLength()) {
                                    Node item = childNodes.item(i2);
                                    if (item != null && (nodeValue2 = item.getNodeValue()) != null && nodeValue2.trim().startsWith("http")) {
                                        str = nodeValue2.trim();
                                        break;
                                    }
                                    i2++;
                                } else {
                                    str = "";
                                    break;
                                }
                            }
                            if (!str.isEmpty()) {
                                c44125a.f115801a = str;
                                Node m3730a2 = C44180a.m3730a(node2, Verification.VERIFICATION_PARAMETERS);
                                if (m3730a2 != null && (childNodes2 = m3730a2.getChildNodes()) != null) {
                                    while (true) {
                                        if (i >= childNodes2.getLength()) {
                                            break;
                                        }
                                        Node item2 = childNodes2.item(i);
                                        if (item2 != null && (nodeValue = item2.getNodeValue()) != null && nodeValue.trim().length() > 0) {
                                            c44125a.f115803c = nodeValue.trim();
                                            break;
                                        }
                                        i++;
                                    }
                                }
                                arrayList.add(c44125a);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    public final List<C44204h> m3703a(String... strArr) {
        List<Node> m3724c;
        ArrayList arrayList = new ArrayList();
        Node m3730a = C44180a.m3730a(this.f116021b, "Creatives");
        if (m3730a == null || (m3724c = C44180a.m3724c(m3730a, Creative.NAME)) == null) {
            return arrayList;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("Linear");
        if (!C43828k.m4872a(strArr)) {
            linkedHashSet.addAll(Arrays.asList(strArr));
        }
        for (Node node : m3724c) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Node m3730a2 = C44180a.m3730a(node, str);
                if (m3730a2 != null) {
                    str.hashCode();
                    if (str.equals("Linear")) {
                        arrayList.add(new C44204h(m3730a2));
                    } else if (str.equals("CompanionAds")) {
                        this.f116020a.add(new C44185b(m3730a2));
                    }
                }
            }
        }
        return arrayList;
    }
}
