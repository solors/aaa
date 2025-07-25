package sg.bigo.ads.core.p964e;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.CDATASection;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.core.e.a */
/* loaded from: classes10.dex */
public final class C44180a {
    /* renamed from: a */
    public static String m3731a(Node node) {
        String nodeValue;
        if (node != null && node.hasChildNodes()) {
            NodeList childNodes = node.getChildNodes();
            int min = Math.min(childNodes.getLength(), 5);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    Node item = childNodes.item(i);
                    if ((item instanceof CDATASection) && item.getNodeValue() != null) {
                        nodeValue = item.getNodeValue();
                        break;
                    }
                }
            }
        }
        if (node == null || node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        nodeValue = node.getFirstChild().getNodeValue();
        return nodeValue.trim();
    }

    /* renamed from: b */
    public static String m3727b(Node node) {
        if (node != null && node.hasChildNodes()) {
            NodeList childNodes = node.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item != null && !C43836q.m4826b(item.getNodeValue())) {
                    return item.getNodeValue();
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static List<Node> m3724c(Node node, String str) {
        return m3725b(node, str, null, null);
    }

    /* renamed from: d */
    public static Integer m3723d(Node node, String str) {
        if (node == null) {
            return -1;
        }
        String m3722e = m3722e(node, str);
        if (C43836q.m4837a((CharSequence) m3722e)) {
            return -1;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m3722e));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: e */
    public static String m3722e(Node node, String str) {
        Node namedItem;
        if (node == null || str == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    /* renamed from: a */
    public static Node m3730a(Node node, String str) {
        return m3729a(node, str, null, null);
    }

    @Nullable
    /* renamed from: b */
    public static String m3726b(Node node, String str) {
        Node m3729a = m3729a(node, str, null, null);
        if (m3729a == null) {
            return null;
        }
        String m3727b = m3727b(m3729a);
        if (C43836q.m4837a((CharSequence) m3727b)) {
            return null;
        }
        return m3727b;
    }

    /* renamed from: a */
    public static Node m3729a(Node node, String str, String str2, List<String> list) {
        List<Node> m3725b;
        if (node == null || str == null || (m3725b = m3725b(node, str, str2, list)) == null || m3725b.isEmpty()) {
            return null;
        }
        return m3725b.get(0);
    }

    /* renamed from: b */
    public static List<Node> m3725b(Node node, String str, String str2, List<String> list) {
        if (node == null || str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeName().equals(str) && m3728a(item, str2, list)) {
                arrayList.add(item);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m3728a(Node node, String str, List<String> list) {
        Node namedItem;
        if (str == null || list == null) {
            return true;
        }
        NamedNodeMap attributes = node.getAttributes();
        return (attributes == null || (namedItem = attributes.getNamedItem(str)) == null || !list.contains(namedItem.getNodeValue())) ? false : true;
    }
}
