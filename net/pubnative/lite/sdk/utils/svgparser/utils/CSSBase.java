package net.pubnative.lite.sdk.utils.svgparser.utils;

import net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser;

/* loaded from: classes10.dex */
public class CSSBase {
    protected CSSParser.Ruleset cssRuleset;

    /* JADX INFO: Access modifiers changed from: protected */
    public CSSBase(String str) {
        this.cssRuleset = new CSSParser(CSSParser.Source.RenderOptions, null).parse(str);
    }
}
