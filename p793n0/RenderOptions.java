package p793n0;

import p793n0.CSSParser;
import p793n0.SVG;

/* renamed from: n0.g */
/* loaded from: classes11.dex */
public class RenderOptions {

    /* renamed from: a */
    CSSParser.C38316r f101317a;

    /* renamed from: b */
    PreserveAspectRatio f101318b;

    /* renamed from: c */
    String f101319c;

    /* renamed from: d */
    SVG.C38327b f101320d;

    /* renamed from: e */
    String f101321e;

    /* renamed from: f */
    SVG.C38327b f101322f;

    public RenderOptions() {
        this.f101317a = null;
        this.f101318b = null;
        this.f101319c = null;
        this.f101320d = null;
        this.f101321e = null;
        this.f101322f = null;
    }

    /* renamed from: a */
    public RenderOptions m15047a(String str) {
        this.f101317a = new CSSParser(CSSParser.EnumC38319u.RenderOptions).m15101d(str);
        return this;
    }

    /* renamed from: b */
    public boolean m15046b() {
        CSSParser.C38316r c38316r = this.f101317a;
        if (c38316r != null && c38316r.m15065f() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m15045c() {
        if (this.f101318b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m15044d() {
        if (this.f101319c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m15043e() {
        if (this.f101321e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m15042f() {
        if (this.f101320d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m15041g() {
        if (this.f101322f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public RenderOptions m15040h(float f, float f2, float f3, float f4) {
        this.f101322f = new SVG.C38327b(f, f2, f3, f4);
        return this;
    }

    public RenderOptions(RenderOptions renderOptions) {
        this.f101317a = null;
        this.f101318b = null;
        this.f101319c = null;
        this.f101320d = null;
        this.f101321e = null;
        this.f101322f = null;
        if (renderOptions == null) {
            return;
        }
        this.f101317a = renderOptions.f101317a;
        this.f101318b = renderOptions.f101318b;
        this.f101320d = renderOptions.f101320d;
        this.f101321e = renderOptions.f101321e;
        this.f101322f = renderOptions.f101322f;
    }
}
