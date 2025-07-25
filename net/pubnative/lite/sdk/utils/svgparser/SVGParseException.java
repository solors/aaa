package net.pubnative.lite.sdk.utils.svgparser;

import org.xml.sax.SAXException;

/* loaded from: classes10.dex */
public class SVGParseException extends SAXException {
    public SVGParseException(String str) {
        super(str);
    }

    public SVGParseException(String str, Exception exc) {
        super(str, exc);
    }
}
