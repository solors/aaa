package com.mobilefuse.videoplayer.model.utils;

import javax.xml.namespace.QName;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.StringNumberConversions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@Metadata
/* renamed from: com.mobilefuse.videoplayer.model.utils.XmlParsingExtensionsKt */
/* loaded from: classes7.dex */
public final class XmlParsingExtensions {
    @Nullable
    public static final <T> T evaluateNodeOrNull(@NotNull XPath evaluateNodeOrNull, @NotNull String expression, @NotNull Object item, @NotNull Function1<? super Node, ? extends T> callback) {
        Intrinsics.checkNotNullParameter(evaluateNodeOrNull, "$this$evaluateNodeOrNull");
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callback, "callback");
        QName qName = XPathConstants.NODE;
        Intrinsics.checkNotNullExpressionValue(qName, "XPathConstants.NODE");
        Node node = (Node) evaluateOrNull(evaluateNodeOrNull, expression, item, qName);
        if (node == null) {
            return null;
        }
        return callback.invoke(node);
    }

    @Nullable
    public static final <T> T evaluateNodesOrNull(@NotNull XPath evaluateNodesOrNull, @NotNull String expression, @NotNull Object item, @NotNull Function1<? super NodeList, ? extends T> callback) {
        Intrinsics.checkNotNullParameter(evaluateNodesOrNull, "$this$evaluateNodesOrNull");
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callback, "callback");
        QName qName = XPathConstants.NODESET;
        Intrinsics.checkNotNullExpressionValue(qName, "XPathConstants.NODESET");
        NodeList nodeList = (NodeList) evaluateOrNull(evaluateNodesOrNull, expression, item, qName);
        if (nodeList == null) {
            return null;
        }
        return callback.invoke(nodeList);
    }

    private static final Object evaluateOrNull(XPath xPath, String str, Object obj, QName qName) {
        try {
            return xPath.evaluate(str, obj, qName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    public static final Boolean getBoolNodeAttribute(@NotNull String attributeName, @NotNull Node node) {
        Intrinsics.checkNotNullParameter(attributeName, "attributeName");
        Intrinsics.checkNotNullParameter(node, "node");
        String stringNodeAttribute = getStringNodeAttribute(attributeName, node);
        if (stringNodeAttribute != null) {
            return Boolean.valueOf(Boolean.parseBoolean(stringNodeAttribute));
        }
        return null;
    }

    @Nullable
    public static final String getElementValue(@NotNull Node node) {
        CharSequence m16571b1;
        Intrinsics.checkNotNullParameter(node, "node");
        String textContent = node.getTextContent();
        if (textContent != null) {
            m16571b1 = C37690r.m16571b1(textContent);
            return m16571b1.toString();
        }
        return null;
    }

    @Nullable
    public static final Integer getIntNodeAttribute(@NotNull String attributeName, @NotNull Node node) {
        Integer m16640m;
        Intrinsics.checkNotNullParameter(attributeName, "attributeName");
        Intrinsics.checkNotNullParameter(node, "node");
        String stringNodeAttribute = getStringNodeAttribute(attributeName, node);
        if (stringNodeAttribute != null) {
            m16640m = StringNumberConversions.m16640m(stringNodeAttribute);
            return m16640m;
        }
        return null;
    }

    @Nullable
    public static final String getStringNodeAttribute(@NotNull String attributeName, @NotNull Node node) {
        Node namedItem;
        Intrinsics.checkNotNullParameter(attributeName, "attributeName");
        Intrinsics.checkNotNullParameter(node, "node");
        NamedNodeMap attributes = node.getAttributes();
        if (attributes != null && (namedItem = attributes.getNamedItem(attributeName)) != null) {
            return namedItem.getNodeValue();
        }
        return null;
    }

    @Nullable
    public static final String getStringNodeValue(@NotNull String nodeName, @NotNull XPath xpath, @NotNull Node rootNode) {
        Intrinsics.checkNotNullParameter(nodeName, "nodeName");
        Intrinsics.checkNotNullParameter(xpath, "xpath");
        Intrinsics.checkNotNullParameter(rootNode, "rootNode");
        try {
            QName qName = XPathConstants.NODE;
            Intrinsics.checkNotNullExpressionValue(qName, "XPathConstants.NODE");
            Node node = (Node) evaluateOrNull(xpath, nodeName, rootNode, qName);
            if (node == null) {
                return null;
            }
            return getElementValue(node);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
