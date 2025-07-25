package com.smaato.sdk.richmedia.util;

/* loaded from: classes7.dex */
public class HtmlPlayerUtils {
    private final OutstreamAdTemplateResourceCache outstreamAdTemplateResourceCache;

    public HtmlPlayerUtils(OutstreamAdTemplateResourceCache outstreamAdTemplateResourceCache) {
        this.outstreamAdTemplateResourceCache = outstreamAdTemplateResourceCache;
    }

    public String vastToRichMedia(String str) {
        return this.outstreamAdTemplateResourceCache.get().replace("$$$vast$$$", str);
    }
}
