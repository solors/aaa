package net.pubnative.lite.sdk.utils.svgparser.utils;

import net.pubnative.lite.sdk.utils.svgparser.CSS;
import net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio;
import net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase;

/* loaded from: classes10.dex */
public class RenderOptionsBase {
    String css;
    CSSParser.Ruleset cssRuleset;
    PreserveAspectRatio preserveAspectRatio;
    String targetId;
    SVGBase.Box viewBox;
    String viewId;
    SVGBase.Box viewPort;

    public RenderOptionsBase() {
        this.css = null;
        this.cssRuleset = null;
        this.preserveAspectRatio = null;
        this.targetId = null;
        this.viewBox = null;
        this.viewId = null;
        this.viewPort = null;
    }

    public static RenderOptionsBase create() {
        return new RenderOptionsBase();
    }

    public RenderOptionsBase css(CSS css) {
        this.cssRuleset = css.cssRuleset;
        this.css = null;
        return this;
    }

    public boolean hasCss() {
        String str = this.css;
        if ((str != null && str.trim().length() > 0) || this.cssRuleset != null) {
            return true;
        }
        return false;
    }

    public boolean hasPreserveAspectRatio() {
        if (this.preserveAspectRatio != null) {
            return true;
        }
        return false;
    }

    public boolean hasTarget() {
        if (this.targetId != null) {
            return true;
        }
        return false;
    }

    public boolean hasView() {
        if (this.viewId != null) {
            return true;
        }
        return false;
    }

    public boolean hasViewBox() {
        if (this.viewBox != null) {
            return true;
        }
        return false;
    }

    public boolean hasViewPort() {
        if (this.viewPort != null) {
            return true;
        }
        return false;
    }

    public RenderOptionsBase preserveAspectRatio(PreserveAspectRatio preserveAspectRatio) {
        this.preserveAspectRatio = preserveAspectRatio;
        return this;
    }

    public RenderOptionsBase target(String str) {
        this.targetId = str;
        return this;
    }

    public RenderOptionsBase view(String str) {
        this.viewId = str;
        return this;
    }

    public RenderOptionsBase viewBox(float f, float f2, float f3, float f4) {
        this.viewBox = new SVGBase.Box(f, f2, f3, f4);
        return this;
    }

    public RenderOptionsBase viewPort(float f, float f2, float f3, float f4) {
        this.viewPort = new SVGBase.Box(f, f2, f3, f4);
        return this;
    }

    public RenderOptionsBase css(String str) {
        this.css = str;
        this.cssRuleset = null;
        return this;
    }

    public RenderOptionsBase(RenderOptionsBase renderOptionsBase) {
        this.css = null;
        this.cssRuleset = null;
        this.preserveAspectRatio = null;
        this.targetId = null;
        this.viewBox = null;
        this.viewId = null;
        this.viewPort = null;
        if (renderOptionsBase == null) {
            return;
        }
        this.css = renderOptionsBase.css;
        this.cssRuleset = renderOptionsBase.cssRuleset;
        this.preserveAspectRatio = renderOptionsBase.preserveAspectRatio;
        this.viewBox = renderOptionsBase.viewBox;
        this.viewId = renderOptionsBase.viewId;
        this.viewPort = renderOptionsBase.viewPort;
        this.targetId = renderOptionsBase.targetId;
    }
}
