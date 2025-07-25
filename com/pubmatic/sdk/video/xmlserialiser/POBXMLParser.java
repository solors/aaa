package com.pubmatic.sdk.video.xmlserialiser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* loaded from: classes7.dex */
public class POBXMLParser {
    @NonNull
    protected static Node createNode(@NonNull String str) throws Exception {
        Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(str))).getDocumentElement();
        documentElement.normalize();
        return documentElement;
    }

    @Nullable
    public static <T extends POBXMLNodeListener> T parse(@NonNull String str, @NonNull Class<T> cls) {
        try {
            Node createNode = createNode(str);
            T newInstance = cls.newInstance();
            newInstance.build(new POBNodeBuilder(createNode));
            return newInstance;
        } catch (Exception e) {
            POBLog.error("POBXMLParser", e.getMessage(), new Object[0]);
            return null;
        }
    }
}
