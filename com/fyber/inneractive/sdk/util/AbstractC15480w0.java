package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import java.util.ArrayList;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: com.fyber.inneractive.sdk.util.w0 */
/* loaded from: classes4.dex */
public abstract class AbstractC15480w0 {
    /* renamed from: a */
    public static Integer m76448a(Node node, String str) {
        String m76447b = m76447b(node, str);
        if (TextUtils.isEmpty(m76447b)) {
            return null;
        }
        try {
            return Integer.valueOf(m76447b);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m76447b(Node node, String str) {
        Node namedItem;
        if (node == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    /* renamed from: c */
    public static ArrayList m76446c(Node node, String str) {
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeName().equals(str)) {
                arrayList.add(item);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static Node m76445d(Node node, String str) {
        if (node == null) {
            return null;
        }
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeName().equals(str)) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m76449a(Node node) {
        if (node == null || node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        return node.getFirstChild().getNodeValue().trim();
    }
}
