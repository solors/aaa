package com.pubmatic.sdk.video.xmlserialiser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import java.util.ArrayList;
import java.util.List;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes7.dex */
public class POBNodeBuilder {
    @Nullable

    /* renamed from: a */
    private Node f71129a;

    public POBNodeBuilder(@Nullable Node node) {
        this.f71129a = node;
    }

    @Nullable
    /* renamed from: a */
    private NodeList m39929a(@NonNull String str) {
        try {
            return (NodeList) XPathFactory.newInstance().newXPath().compile(str).evaluate(this.f71129a, XPathConstants.NODESET);
        } catch (Exception e) {
            POBLog.error("POBNodeBuilder", e.getMessage(), new Object[0]);
            return null;
        }
    }

    @Nullable
    public String getAttributeValue(@NonNull String str) {
        Node node = getNode("@" + str);
        if (node != null) {
            return node.getTextContent().trim();
        }
        return null;
    }

    @Nullable
    public Node getNode(@NonNull String str) {
        try {
            return (Node) XPathFactory.newInstance().newXPath().compile(str).evaluate(this.f71129a, XPathConstants.NODE);
        } catch (Exception e) {
            POBLog.error("POBNodeBuilder", e.getMessage(), new Object[0]);
            return null;
        }
    }

    @Nullable
    public String getNodeName() {
        Node node = this.f71129a;
        if (node != null) {
            return node.getNodeName();
        }
        return null;
    }

    @Nullable
    public <T extends POBXMLNodeListener> T getNodeObject(@NonNull String str, @NonNull Class<T> cls) {
        Node node = getNode(str);
        if (node != null) {
            try {
                T newInstance = cls.newInstance();
                newInstance.build(new POBNodeBuilder(node));
                return newInstance;
            } catch (Exception e) {
                POBLog.error("POBNodeBuilder", e.getMessage(), new Object[0]);
            }
        }
        return null;
    }

    @Nullable
    public String getNodeValue() {
        Node node = this.f71129a;
        if (node == null || node.getTextContent().isEmpty()) {
            return null;
        }
        return this.f71129a.getTextContent().trim();
    }

    @Nullable
    public <T extends POBXMLNodeListener> List<T> getObjectList(@NonNull String str, @NonNull Class<T> cls) {
        NodeList m39929a = m39929a(str);
        if (m39929a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < m39929a.getLength(); i++) {
            Node item = m39929a.item(i);
            if (item != null) {
                try {
                    T newInstance = cls.newInstance();
                    newInstance.build(new POBNodeBuilder(item));
                    arrayList.add(newInstance);
                } catch (Exception e) {
                    POBLog.error("POBNodeBuilder", e.getMessage(), new Object[0]);
                    return null;
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public List<String> getStringList(@NonNull String str) {
        NodeList m39929a = m39929a(str);
        if (m39929a != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < m39929a.getLength(); i++) {
                Node item = m39929a.item(i);
                if (item != null) {
                    arrayList.add(item.getTextContent().trim());
                }
            }
            return arrayList;
        }
        return null;
    }

    @Nullable
    public String getNodeValue(@NonNull String str) {
        Node node = getNode(str);
        if (node != null) {
            return node.getTextContent().trim();
        }
        return null;
    }
}
