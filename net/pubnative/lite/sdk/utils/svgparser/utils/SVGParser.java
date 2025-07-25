package net.pubnative.lite.sdk.utils.svgparser.utils;

import java.io.InputStream;
import net.pubnative.lite.sdk.utils.svgparser.SVGExternalFileResolver;
import net.pubnative.lite.sdk.utils.svgparser.SVGParseException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes10.dex */
public interface SVGParser {
    SVGBase parseStream(InputStream inputStream) throws SVGParseException;

    SVGParser setExternalFileResolver(SVGExternalFileResolver sVGExternalFileResolver);

    SVGParser setInternalEntitiesEnabled(boolean z);
}
