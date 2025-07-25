package p793n0;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import p793n0.CSSParser;
import p793n0.PreserveAspectRatio;
import p793n0.SVG;

/* renamed from: n0.i */
/* loaded from: classes11.dex */
public class SVGAndroidRenderer {

    /* renamed from: i */
    private static HashSet<String> f101547i;

    /* renamed from: a */
    private Canvas f101548a;

    /* renamed from: b */
    private float f101549b;

    /* renamed from: c */
    private SVG f101550c;

    /* renamed from: d */
    private C38398h f101551d;

    /* renamed from: e */
    private Stack<C38398h> f101552e;

    /* renamed from: f */
    private Stack<SVG.InterfaceC38358j0> f101553f;

    /* renamed from: g */
    private Stack<Matrix> f101554g;

    /* renamed from: h */
    private CSSParser.C38315q f101555h = null;

    /* compiled from: SVGAndroidRenderer.java */
    /* renamed from: n0.i$a */
    /* loaded from: classes11.dex */
    public static /* synthetic */ class C38391a {

        /* renamed from: a */
        static final /* synthetic */ int[] f101556a;

        /* renamed from: b */
        static final /* synthetic */ int[] f101557b;

        /* renamed from: c */
        static final /* synthetic */ int[] f101558c;

        static {
            int[] iArr = new int[SVG.C38337e0.EnumC38341d.values().length];
            f101558c = iArr;
            try {
                iArr[SVG.C38337e0.EnumC38341d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101558c[SVG.C38337e0.EnumC38341d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f101558c[SVG.C38337e0.EnumC38341d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SVG.C38337e0.EnumC38340c.values().length];
            f101557b = iArr2;
            try {
                iArr2[SVG.C38337e0.EnumC38340c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f101557b[SVG.C38337e0.EnumC38340c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f101557b[SVG.C38337e0.EnumC38340c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreserveAspectRatio.EnumC38321a.values().length];
            f101556a = iArr3;
            try {
                iArr3[PreserveAspectRatio.EnumC38321a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f101556a[PreserveAspectRatio.EnumC38321a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f101556a[PreserveAspectRatio.EnumC38321a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f101556a[PreserveAspectRatio.EnumC38321a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f101556a[PreserveAspectRatio.EnumC38321a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f101556a[PreserveAspectRatio.EnumC38321a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f101556a[PreserveAspectRatio.EnumC38321a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f101556a[PreserveAspectRatio.EnumC38321a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    /* renamed from: n0.i$b */
    /* loaded from: classes11.dex */
    public class C38392b implements SVG.InterfaceC38385x {

        /* renamed from: b */
        private float f101560b;

        /* renamed from: c */
        private float f101561c;

        /* renamed from: h */
        private boolean f101566h;

        /* renamed from: a */
        private List<C38393c> f101559a = new ArrayList();

        /* renamed from: d */
        private C38393c f101562d = null;

        /* renamed from: e */
        private boolean f101563e = false;

        /* renamed from: f */
        private boolean f101564f = true;

        /* renamed from: g */
        private int f101565g = -1;

        C38392b(SVG.C38383w c38383w) {
            SVGAndroidRenderer.this = r3;
            if (c38383w == null) {
                return;
            }
            c38383w.m14994c(this);
            if (this.f101566h) {
                this.f101562d.m14883b(this.f101559a.get(this.f101565g));
                this.f101559a.set(this.f101565g, this.f101562d);
                this.f101566h = false;
            }
            C38393c c38393c = this.f101562d;
            if (c38393c != null) {
                this.f101559a.add(c38393c);
            }
        }

        /* renamed from: a */
        List<C38393c> m14885a() {
            return this.f101559a;
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.f101563e = true;
            this.f101564f = false;
            C38393c c38393c = this.f101562d;
            SVGAndroidRenderer.m14923h(c38393c.f101568a, c38393c.f101569b, f, f2, f3, z, z2, f4, f5, this);
            this.f101564f = true;
            this.f101566h = false;
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void close() {
            this.f101559a.add(this.f101562d);
            lineTo(this.f101560b, this.f101561c);
            this.f101566h = true;
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.f101564f || this.f101563e) {
                this.f101562d.m14884a(f, f2);
                this.f101559a.add(this.f101562d);
                this.f101563e = false;
            }
            this.f101562d = new C38393c(f5, f6, f5 - f3, f6 - f4);
            this.f101566h = false;
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void lineTo(float f, float f2) {
            this.f101562d.m14884a(f, f2);
            this.f101559a.add(this.f101562d);
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            C38393c c38393c = this.f101562d;
            this.f101562d = new C38393c(f, f2, f - c38393c.f101568a, f2 - c38393c.f101569b);
            this.f101566h = false;
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void moveTo(float f, float f2) {
            if (this.f101566h) {
                this.f101562d.m14883b(this.f101559a.get(this.f101565g));
                this.f101559a.set(this.f101565g, this.f101562d);
                this.f101566h = false;
            }
            C38393c c38393c = this.f101562d;
            if (c38393c != null) {
                this.f101559a.add(c38393c);
            }
            this.f101560b = f;
            this.f101561c = f2;
            this.f101562d = new C38393c(f, f2, 0.0f, 0.0f);
            this.f101565g = this.f101559a.size();
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void quadTo(float f, float f2, float f3, float f4) {
            this.f101562d.m14884a(f, f2);
            this.f101559a.add(this.f101562d);
            this.f101562d = new C38393c(f3, f4, f3 - f, f4 - f2);
            this.f101566h = false;
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    /* renamed from: n0.i$c */
    /* loaded from: classes11.dex */
    public class C38393c {

        /* renamed from: a */
        float f101568a;

        /* renamed from: b */
        float f101569b;

        /* renamed from: c */
        float f101570c;

        /* renamed from: d */
        float f101571d;

        /* renamed from: e */
        boolean f101572e = false;

        C38393c(float f, float f2, float f3, float f4) {
            SVGAndroidRenderer.this = r3;
            this.f101570c = 0.0f;
            this.f101571d = 0.0f;
            this.f101568a = f;
            this.f101569b = f2;
            double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (sqrt != 0.0d) {
                this.f101570c = (float) (f3 / sqrt);
                this.f101571d = (float) (f4 / sqrt);
            }
        }

        /* renamed from: a */
        void m14884a(float f, float f2) {
            float f3 = f - this.f101568a;
            float f4 = f2 - this.f101569b;
            double sqrt = Math.sqrt((f3 * f3) + (f4 * f4));
            if (sqrt != 0.0d) {
                f3 = (float) (f3 / sqrt);
                f4 = (float) (f4 / sqrt);
            }
            float f5 = this.f101570c;
            if (f3 == (-f5) && f4 == (-this.f101571d)) {
                this.f101572e = true;
                this.f101570c = -f4;
                this.f101571d = f3;
                return;
            }
            this.f101570c = f5 + f3;
            this.f101571d += f4;
        }

        /* renamed from: b */
        void m14883b(C38393c c38393c) {
            float f = c38393c.f101570c;
            float f2 = this.f101570c;
            if (f == (-f2)) {
                float f3 = c38393c.f101571d;
                if (f3 == (-this.f101571d)) {
                    this.f101572e = true;
                    this.f101570c = -f3;
                    this.f101571d = c38393c.f101570c;
                    return;
                }
            }
            this.f101570c = f2 + f;
            this.f101571d += c38393c.f101571d;
        }

        public String toString() {
            return "(" + this.f101568a + "," + this.f101569b + " " + this.f101570c + "," + this.f101571d + ")";
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    /* renamed from: n0.i$d */
    /* loaded from: classes11.dex */
    public class C38394d implements SVG.InterfaceC38385x {

        /* renamed from: a */
        Path f101574a = new Path();

        /* renamed from: b */
        float f101575b;

        /* renamed from: c */
        float f101576c;

        C38394d(SVG.C38383w c38383w) {
            SVGAndroidRenderer.this = r1;
            if (c38383w == null) {
                return;
            }
            c38383w.m14994c(this);
        }

        /* renamed from: a */
        Path m14882a() {
            return this.f101574a;
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            SVGAndroidRenderer.m14923h(this.f101575b, this.f101576c, f, f2, f3, z, z2, f4, f5, this);
            this.f101575b = f4;
            this.f101576c = f5;
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void close() {
            this.f101574a.close();
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f101574a.cubicTo(f, f2, f3, f4, f5, f6);
            this.f101575b = f5;
            this.f101576c = f6;
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void lineTo(float f, float f2) {
            this.f101574a.lineTo(f, f2);
            this.f101575b = f;
            this.f101576c = f2;
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void moveTo(float f, float f2) {
            this.f101574a.moveTo(f, f2);
            this.f101575b = f;
            this.f101576c = f2;
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void quadTo(float f, float f2, float f3, float f4) {
            this.f101574a.quadTo(f, f2, f3, f4);
            this.f101575b = f3;
            this.f101576c = f4;
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    /* renamed from: n0.i$e */
    /* loaded from: classes11.dex */
    public class C38395e extends C38396f {

        /* renamed from: e */
        private Path f101578e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38395e(Path path, float f, float f2) {
            super(f, f2);
            SVGAndroidRenderer.this = r1;
            this.f101578e = path;
        }

        @Override // p793n0.SVGAndroidRenderer.C38396f, p793n0.SVGAndroidRenderer.AbstractC38400j
        /* renamed from: b */
        public void mo14880b(String str) {
            if (SVGAndroidRenderer.this.m14940Y0()) {
                if (SVGAndroidRenderer.this.f101551d.f101588b) {
                    SVGAndroidRenderer.this.f101548a.drawTextOnPath(str, this.f101578e, this.f101580b, this.f101581c, SVGAndroidRenderer.this.f101551d.f101590d);
                }
                if (SVGAndroidRenderer.this.f101551d.f101589c) {
                    SVGAndroidRenderer.this.f101548a.drawTextOnPath(str, this.f101578e, this.f101580b, this.f101581c, SVGAndroidRenderer.this.f101551d.f101591e);
                }
            }
            this.f101580b += SVGAndroidRenderer.this.f101551d.f101590d.measureText(str);
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    /* renamed from: n0.i$f */
    /* loaded from: classes11.dex */
    public class C38396f extends AbstractC38400j {

        /* renamed from: b */
        float f101580b;

        /* renamed from: c */
        float f101581c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38396f(float f, float f2) {
            super(r2, null);
            SVGAndroidRenderer.this = r2;
            this.f101580b = f;
            this.f101581c = f2;
        }

        @Override // p793n0.SVGAndroidRenderer.AbstractC38400j
        /* renamed from: b */
        public void mo14880b(String str) {
            SVGAndroidRenderer.m14889y("TextSequence render", new Object[0]);
            if (SVGAndroidRenderer.this.m14940Y0()) {
                if (SVGAndroidRenderer.this.f101551d.f101588b) {
                    SVGAndroidRenderer.this.f101548a.drawText(str, this.f101580b, this.f101581c, SVGAndroidRenderer.this.f101551d.f101590d);
                }
                if (SVGAndroidRenderer.this.f101551d.f101589c) {
                    SVGAndroidRenderer.this.f101548a.drawText(str, this.f101580b, this.f101581c, SVGAndroidRenderer.this.f101551d.f101591e);
                }
            }
            this.f101580b += SVGAndroidRenderer.this.f101551d.f101590d.measureText(str);
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    /* renamed from: n0.i$g */
    /* loaded from: classes11.dex */
    public class C38397g extends AbstractC38400j {

        /* renamed from: b */
        float f101583b;

        /* renamed from: c */
        float f101584c;

        /* renamed from: d */
        Path f101585d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38397g(float f, float f2, Path path) {
            super(r2, null);
            SVGAndroidRenderer.this = r2;
            this.f101583b = f;
            this.f101584c = f2;
            this.f101585d = path;
        }

        @Override // p793n0.SVGAndroidRenderer.AbstractC38400j
        /* renamed from: a */
        public boolean mo14881a(SVG.AbstractC38388y0 abstractC38388y0) {
            if (abstractC38388y0 instanceof SVG.C38390z0) {
                SVGAndroidRenderer.m14938Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
                return false;
            }
            return true;
        }

        @Override // p793n0.SVGAndroidRenderer.AbstractC38400j
        /* renamed from: b */
        public void mo14880b(String str) {
            if (SVGAndroidRenderer.this.m14940Y0()) {
                Path path = new Path();
                SVGAndroidRenderer.this.f101551d.f101590d.getTextPath(str, 0, str.length(), this.f101583b, this.f101584c, path);
                this.f101585d.addPath(path);
            }
            this.f101583b += SVGAndroidRenderer.this.f101551d.f101590d.measureText(str);
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    /* renamed from: n0.i$i */
    /* loaded from: classes11.dex */
    public class C38399i extends AbstractC38400j {

        /* renamed from: b */
        float f101596b;

        /* renamed from: c */
        float f101597c;

        /* renamed from: d */
        RectF f101598d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38399i(float f, float f2) {
            super(r2, null);
            SVGAndroidRenderer.this = r2;
            this.f101598d = new RectF();
            this.f101596b = f;
            this.f101597c = f2;
        }

        @Override // p793n0.SVGAndroidRenderer.AbstractC38400j
        /* renamed from: a */
        public boolean mo14881a(SVG.AbstractC38388y0 abstractC38388y0) {
            if (!(abstractC38388y0 instanceof SVG.C38390z0)) {
                return true;
            }
            SVG.C38390z0 c38390z0 = (SVG.C38390z0) abstractC38388y0;
            SVG.C38366n0 m15019u = abstractC38388y0.f101490a.m15019u(c38390z0.f101544o);
            if (m15019u == null) {
                SVGAndroidRenderer.m14979F("TextPath path reference '%s' not found", c38390z0.f101544o);
                return false;
            }
            SVG.C38381v c38381v = (SVG.C38381v) m15019u;
            Path m14882a = new C38394d(c38381v.f101527o).m14882a();
            Matrix matrix = c38381v.f101479n;
            if (matrix != null) {
                m14882a.transform(matrix);
            }
            RectF rectF = new RectF();
            m14882a.computeBounds(rectF, true);
            this.f101598d.union(rectF);
            return false;
        }

        @Override // p793n0.SVGAndroidRenderer.AbstractC38400j
        /* renamed from: b */
        public void mo14880b(String str) {
            if (SVGAndroidRenderer.this.m14940Y0()) {
                Rect rect = new Rect();
                SVGAndroidRenderer.this.f101551d.f101590d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f101596b, this.f101597c);
                this.f101598d.union(rectF);
            }
            this.f101596b += SVGAndroidRenderer.this.f101551d.f101590d.measureText(str);
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    /* renamed from: n0.i$j */
    /* loaded from: classes11.dex */
    public abstract class AbstractC38400j {
        private AbstractC38400j() {
            SVGAndroidRenderer.this = r1;
        }

        /* renamed from: a */
        public boolean mo14881a(SVG.AbstractC38388y0 abstractC38388y0) {
            return true;
        }

        /* renamed from: b */
        public abstract void mo14880b(String str);

        /* synthetic */ AbstractC38400j(SVGAndroidRenderer sVGAndroidRenderer, C38391a c38391a) {
            this();
        }
    }

    public SVGAndroidRenderer(Canvas canvas, float f) {
        this.f101548a = canvas;
        this.f101549b = f;
    }

    /* renamed from: A */
    private boolean m14989A() {
        Boolean bool = this.f101551d.f101587a.f101368C;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: A0 */
    private void m14988A0(SVG.C38366n0 c38366n0) {
        if (c38366n0 instanceof SVG.InterfaceC38377t) {
            return;
        }
        m14952S0();
        m14897u(c38366n0);
        if (c38366n0 instanceof SVG.C38349f0) {
            m14890x0((SVG.C38349f0) c38366n0);
        } else if (c38366n0 instanceof SVG.C38347e1) {
            m14980E0((SVG.C38347e1) c38366n0);
        } else if (c38366n0 instanceof SVG.C38376s0) {
            m14986B0((SVG.C38376s0) c38366n0);
        } else if (c38366n0 instanceof SVG.C38363m) {
            m14904q0((SVG.C38363m) c38366n0);
        } else if (c38366n0 instanceof SVG.C38367o) {
            m14902r0((SVG.C38367o) c38366n0);
        } else if (c38366n0 instanceof SVG.C38381v) {
            m14898t0((SVG.C38381v) c38366n0);
        } else if (c38366n0 instanceof SVG.C38328b0) {
            m14892w0((SVG.C38328b0) c38366n0);
        } else if (c38366n0 instanceof SVG.C38333d) {
            m14908o0((SVG.C38333d) c38366n0);
        } else if (c38366n0 instanceof SVG.C38355i) {
            m14906p0((SVG.C38355i) c38366n0);
        } else if (c38366n0 instanceof SVG.C38371q) {
            m14900s0((SVG.C38371q) c38366n0);
        } else if (c38366n0 instanceof SVG.C38325a0) {
            m14894v0((SVG.C38325a0) c38366n0);
        } else if (c38366n0 instanceof SVG.C38389z) {
            m14896u0((SVG.C38389z) c38366n0);
        } else if (c38366n0 instanceof SVG.C38384w0) {
            m14982D0((SVG.C38384w0) c38366n0);
        }
        m14954R0();
    }

    /* renamed from: B */
    private void m14987B(SVG.AbstractC38360k0 abstractC38360k0, Path path) {
        SVG.AbstractC38368o0 abstractC38368o0 = this.f101551d.f101587a.f101382c;
        if (abstractC38368o0 instanceof SVG.C38379u) {
            SVG.C38366n0 m15019u = this.f101550c.m15019u(((SVG.C38379u) abstractC38368o0).f101523b);
            if (m15019u instanceof SVG.C38387y) {
                m14967L(abstractC38360k0, path, (SVG.C38387y) m15019u);
                return;
            }
        }
        this.f101548a.drawPath(path, this.f101551d.f101590d);
    }

    /* renamed from: B0 */
    private void m14986B0(SVG.C38376s0 c38376s0) {
        m14889y("Switch render", new Object[0]);
        m14944W0(this.f101551d, c38376s0);
        if (!m14989A()) {
            return;
        }
        Matrix matrix = c38376s0.f101485o;
        if (matrix != null) {
            this.f101548a.concat(matrix);
        }
        m14907p(c38376s0);
        boolean m14912m0 = m14912m0();
        m14968K0(c38376s0);
        if (m14912m0) {
            m14918j0(c38376s0);
        }
        m14948U0(c38376s0);
    }

    /* renamed from: C */
    private void m14985C(Path path) {
        C38398h c38398h = this.f101551d;
        if (c38398h.f101587a.f101379N == SVG.C38337e0.EnumC38346i.NonScalingStroke) {
            Matrix matrix = this.f101548a.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.f101548a.setMatrix(new Matrix());
            Shader shader = this.f101551d.f101591e.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.f101548a.drawPath(path2, this.f101551d.f101591e);
            this.f101548a.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.f101548a.drawPath(path, c38398h.f101591e);
    }

    /* renamed from: C0 */
    private void m14984C0(SVG.C38378t0 c38378t0, SVG.C38327b c38327b) {
        m14889y("Symbol render", new Object[0]);
        if (c38327b.f101337c != 0.0f && c38327b.f101338d != 0.0f) {
            PreserveAspectRatio preserveAspectRatio = c38378t0.f101500o;
            if (preserveAspectRatio == null) {
                preserveAspectRatio = PreserveAspectRatio.f101294e;
            }
            m14944W0(this.f101551d, c38378t0);
            C38398h c38398h = this.f101551d;
            c38398h.f101592f = c38327b;
            if (!c38398h.f101587a.f101402x.booleanValue()) {
                SVG.C38327b c38327b2 = this.f101551d.f101592f;
                m14960O0(c38327b2.f101335a, c38327b2.f101336b, c38327b2.f101337c, c38327b2.f101338d);
            }
            SVG.C38327b c38327b3 = c38378t0.f101516p;
            if (c38327b3 != null) {
                this.f101548a.concat(m14909o(this.f101551d.f101592f, c38327b3, preserveAspectRatio));
                this.f101551d.f101593g = c38378t0.f101516p;
            } else {
                Canvas canvas = this.f101548a;
                SVG.C38327b c38327b4 = this.f101551d.f101592f;
                canvas.translate(c38327b4.f101335a, c38327b4.f101336b);
            }
            boolean m14912m0 = m14912m0();
            m14978F0(c38378t0, true);
            if (m14912m0) {
                m14918j0(c38378t0);
            }
            m14948U0(c38378t0);
        }
    }

    /* renamed from: D */
    private float m14983D(float f, float f2, float f3, float f4) {
        return (f * f3) + (f2 * f4);
    }

    /* renamed from: D0 */
    private void m14982D0(SVG.C38384w0 c38384w0) {
        float f;
        float f2;
        float f3;
        m14889y("Text render", new Object[0]);
        m14944W0(this.f101551d, c38384w0);
        if (!m14989A()) {
            return;
        }
        Matrix matrix = c38384w0.f101534s;
        if (matrix != null) {
            this.f101548a.concat(matrix);
        }
        List<SVG.C38369p> list = c38384w0.f101331o;
        float f4 = 0.0f;
        if (list != null && list.size() != 0) {
            f = c38384w0.f101331o.get(0).m15002f(this);
        } else {
            f = 0.0f;
        }
        List<SVG.C38369p> list2 = c38384w0.f101332p;
        if (list2 != null && list2.size() != 0) {
            f2 = c38384w0.f101332p.get(0).m15001g(this);
        } else {
            f2 = 0.0f;
        }
        List<SVG.C38369p> list3 = c38384w0.f101333q;
        if (list3 != null && list3.size() != 0) {
            f3 = c38384w0.f101333q.get(0).m15002f(this);
        } else {
            f3 = 0.0f;
        }
        List<SVG.C38369p> list4 = c38384w0.f101334r;
        if (list4 != null && list4.size() != 0) {
            f4 = c38384w0.f101334r.get(0).m15001g(this);
        }
        SVG.C38337e0.EnumC38343f m14961O = m14961O();
        if (m14961O != SVG.C38337e0.EnumC38343f.Start) {
            float m14911n = m14911n(c38384w0);
            if (m14961O == SVG.C38337e0.EnumC38343f.Middle) {
                m14911n /= 2.0f;
            }
            f -= m14911n;
        }
        if (c38384w0.f101478h == null) {
            C38399i c38399i = new C38399i(f, f2);
            m14981E(c38384w0, c38399i);
            RectF rectF = c38399i.f101598d;
            c38384w0.f101478h = new SVG.C38327b(rectF.left, rectF.top, rectF.width(), c38399i.f101598d.height());
        }
        m14948U0(c38384w0);
        m14903r(c38384w0);
        m14907p(c38384w0);
        boolean m14912m0 = m14912m0();
        m14981E(c38384w0, new C38396f(f + f3, f2 + f4));
        if (m14912m0) {
            m14918j0(c38384w0);
        }
    }

    /* renamed from: E */
    private void m14981E(SVG.AbstractC38388y0 abstractC38388y0, AbstractC38400j abstractC38400j) {
        if (!m14989A()) {
            return;
        }
        Iterator<SVG.C38366n0> it = abstractC38388y0.f101454i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            SVG.C38366n0 next = it.next();
            if (next instanceof SVG.C38332c1) {
                abstractC38400j.mo14880b(m14950T0(((SVG.C38332c1) next).f101349c, z, !it.hasNext()));
            } else {
                m14914l0(next, abstractC38400j);
            }
            z = false;
        }
    }

    /* renamed from: E0 */
    private void m14980E0(SVG.C38347e1 c38347e1) {
        float f;
        m14889y("Use render", new Object[0]);
        SVG.C38369p c38369p = c38347e1.f101443s;
        if (c38369p == null || !c38369p.m14999i()) {
            SVG.C38369p c38369p2 = c38347e1.f101444t;
            if (c38369p2 != null && c38369p2.m14999i()) {
                return;
            }
            m14944W0(this.f101551d, c38347e1);
            if (!m14989A()) {
                return;
            }
            SVG.C38366n0 m15019u = c38347e1.f101490a.m15019u(c38347e1.f101440p);
            if (m15019u == null) {
                m14979F("Use reference '%s' not found", c38347e1.f101440p);
                return;
            }
            Matrix matrix = c38347e1.f101485o;
            if (matrix != null) {
                this.f101548a.concat(matrix);
            }
            SVG.C38369p c38369p3 = c38347e1.f101441q;
            float f2 = 0.0f;
            if (c38369p3 != null) {
                f = c38369p3.m15002f(this);
            } else {
                f = 0.0f;
            }
            SVG.C38369p c38369p4 = c38347e1.f101442r;
            if (c38369p4 != null) {
                f2 = c38369p4.m15001g(this);
            }
            this.f101548a.translate(f, f2);
            m14907p(c38347e1);
            boolean m14912m0 = m14912m0();
            m14920i0(c38347e1);
            if (m15019u instanceof SVG.C38349f0) {
                SVG.C38327b m14926f0 = m14926f0(null, null, c38347e1.f101443s, c38347e1.f101444t);
                m14952S0();
                m14888y0((SVG.C38349f0) m15019u, m14926f0);
                m14954R0();
            } else if (m15019u instanceof SVG.C38378t0) {
                SVG.C38369p c38369p5 = c38347e1.f101443s;
                if (c38369p5 == null) {
                    c38369p5 = new SVG.C38369p(100.0f, SVG.EnumC38335d1.percent);
                }
                SVG.C38369p c38369p6 = c38347e1.f101444t;
                if (c38369p6 == null) {
                    c38369p6 = new SVG.C38369p(100.0f, SVG.EnumC38335d1.percent);
                }
                SVG.C38327b m14926f02 = m14926f0(null, null, c38369p5, c38369p6);
                m14952S0();
                m14984C0((SVG.C38378t0) m15019u, m14926f02);
                m14954R0();
            } else {
                m14988A0(m15019u);
            }
            m14922h0();
            if (m14912m0) {
                m14918j0(c38347e1);
            }
            m14948U0(c38347e1);
        }
    }

    /* renamed from: F */
    public static void m14979F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* renamed from: F0 */
    private void m14978F0(SVG.InterfaceC38358j0 interfaceC38358j0, boolean z) {
        if (z) {
            m14920i0(interfaceC38358j0);
        }
        for (SVG.C38366n0 c38366n0 : interfaceC38358j0.getChildren()) {
            m14988A0(c38366n0);
        }
        if (z) {
            m14922h0();
        }
    }

    /* renamed from: G */
    private void m14977G(SVG.AbstractC38388y0 abstractC38388y0, StringBuilder sb2) {
        Iterator<SVG.C38366n0> it = abstractC38388y0.f101454i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            SVG.C38366n0 next = it.next();
            if (next instanceof SVG.AbstractC38388y0) {
                m14977G((SVG.AbstractC38388y0) next, sb2);
            } else if (next instanceof SVG.C38332c1) {
                sb2.append(m14950T0(((SVG.C38332c1) next).f101349c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* renamed from: H */
    private void m14975H(SVG.AbstractC38357j abstractC38357j, String str) {
        SVG.C38366n0 m15019u = abstractC38357j.f101490a.m15019u(str);
        if (m15019u == null) {
            m14938Z0("Gradient reference '%s' not found", str);
        } else if (!(m15019u instanceof SVG.AbstractC38357j)) {
            m14979F("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (m15019u == abstractC38357j) {
            m14979F("Circular reference in gradient href attribute '%s'", str);
        } else {
            SVG.AbstractC38357j abstractC38357j2 = (SVG.AbstractC38357j) m15019u;
            if (abstractC38357j.f101470i == null) {
                abstractC38357j.f101470i = abstractC38357j2.f101470i;
            }
            if (abstractC38357j.f101471j == null) {
                abstractC38357j.f101471j = abstractC38357j2.f101471j;
            }
            if (abstractC38357j.f101472k == null) {
                abstractC38357j.f101472k = abstractC38357j2.f101472k;
            }
            if (abstractC38357j.f101469h.isEmpty()) {
                abstractC38357j.f101469h = abstractC38357j2.f101469h;
            }
            try {
                if (abstractC38357j instanceof SVG.C38364m0) {
                    m14973I((SVG.C38364m0) abstractC38357j, (SVG.C38364m0) m15019u);
                } else {
                    m14971J((SVG.C38372q0) abstractC38357j, (SVG.C38372q0) m15019u);
                }
            } catch (ClassCastException unused) {
            }
            String str2 = abstractC38357j2.f101473l;
            if (str2 != null) {
                m14975H(abstractC38357j, str2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x00ff, code lost:
        if (r7 != 8) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0068  */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m14974H0(p793n0.SVG.C38373r r12, p793n0.SVGAndroidRenderer.C38393c r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p793n0.SVGAndroidRenderer.m14974H0(n0.h$r, n0.i$c):void");
    }

    /* renamed from: I */
    private void m14973I(SVG.C38364m0 c38364m0, SVG.C38364m0 c38364m02) {
        if (c38364m0.f101486m == null) {
            c38364m0.f101486m = c38364m02.f101486m;
        }
        if (c38364m0.f101487n == null) {
            c38364m0.f101487n = c38364m02.f101487n;
        }
        if (c38364m0.f101488o == null) {
            c38364m0.f101488o = c38364m02.f101488o;
        }
        if (c38364m0.f101489p == null) {
            c38364m0.f101489p = c38364m02.f101489p;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0098 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0085  */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m14972I0(p793n0.SVG.AbstractC38361l r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p793n0.SVGAndroidRenderer.m14972I0(n0.h$l):void");
    }

    /* renamed from: J */
    private void m14971J(SVG.C38372q0 c38372q0, SVG.C38372q0 c38372q02) {
        if (c38372q0.f101505m == null) {
            c38372q0.f101505m = c38372q02.f101505m;
        }
        if (c38372q0.f101506n == null) {
            c38372q0.f101506n = c38372q02.f101506n;
        }
        if (c38372q0.f101507o == null) {
            c38372q0.f101507o = c38372q02.f101507o;
        }
        if (c38372q0.f101508p == null) {
            c38372q0.f101508p = c38372q02.f101508p;
        }
        if (c38372q0.f101509q == null) {
            c38372q0.f101509q = c38372q02.f101509q;
        }
    }

    /* renamed from: J0 */
    private void m14970J0(SVG.C38375s c38375s, SVG.AbstractC38360k0 abstractC38360k0, SVG.C38327b c38327b) {
        boolean z;
        float f;
        float f2;
        float f3;
        m14889y("Mask render", new Object[0]);
        Boolean bool = c38375s.f101517o;
        boolean z2 = true;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            SVG.C38369p c38369p = c38375s.f101521s;
            if (c38369p != null) {
                f2 = c38369p.m15002f(this);
            } else {
                f2 = c38327b.f101337c;
            }
            SVG.C38369p c38369p2 = c38375s.f101522t;
            if (c38369p2 != null) {
                f3 = c38369p2.m15001g(this);
            } else {
                f3 = c38327b.f101338d;
            }
        } else {
            SVG.C38369p c38369p3 = c38375s.f101521s;
            float f4 = 1.2f;
            if (c38369p3 != null) {
                f = c38369p3.m15003e(this, 1.0f);
            } else {
                f = 1.2f;
            }
            SVG.C38369p c38369p4 = c38375s.f101522t;
            if (c38369p4 != null) {
                f4 = c38369p4.m15003e(this, 1.0f);
            }
            f2 = f * c38327b.f101337c;
            f3 = f4 * c38327b.f101338d;
        }
        if (f2 != 0.0f && f3 != 0.0f) {
            m14952S0();
            C38398h m14965M = m14965M(c38375s);
            this.f101551d = m14965M;
            m14965M.f101587a.f101393o = Float.valueOf(1.0f);
            boolean m14912m0 = m14912m0();
            this.f101548a.save();
            Boolean bool2 = c38375s.f101518p;
            if (bool2 != null && !bool2.booleanValue()) {
                z2 = false;
            }
            if (!z2) {
                this.f101548a.translate(c38327b.f101335a, c38327b.f101336b);
                this.f101548a.scale(c38327b.f101337c, c38327b.f101338d);
            }
            m14978F0(c38375s, false);
            this.f101548a.restore();
            if (m14912m0) {
                m14916k0(abstractC38360k0, c38327b);
            }
            m14954R0();
        }
    }

    /* renamed from: K */
    private void m14969K(SVG.C38387y c38387y, String str) {
        SVG.C38366n0 m15019u = c38387y.f101490a.m15019u(str);
        if (m15019u == null) {
            m14938Z0("Pattern reference '%s' not found", str);
        } else if (!(m15019u instanceof SVG.C38387y)) {
            m14979F("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (m15019u == c38387y) {
            m14979F("Circular reference in pattern href attribute '%s'", str);
        } else {
            SVG.C38387y c38387y2 = (SVG.C38387y) m15019u;
            if (c38387y.f101535q == null) {
                c38387y.f101535q = c38387y2.f101535q;
            }
            if (c38387y.f101536r == null) {
                c38387y.f101536r = c38387y2.f101536r;
            }
            if (c38387y.f101537s == null) {
                c38387y.f101537s = c38387y2.f101537s;
            }
            if (c38387y.f101538t == null) {
                c38387y.f101538t = c38387y2.f101538t;
            }
            if (c38387y.f101539u == null) {
                c38387y.f101539u = c38387y2.f101539u;
            }
            if (c38387y.f101540v == null) {
                c38387y.f101540v = c38387y2.f101540v;
            }
            if (c38387y.f101541w == null) {
                c38387y.f101541w = c38387y2.f101541w;
            }
            if (c38387y.f101454i.isEmpty()) {
                c38387y.f101454i = c38387y2.f101454i;
            }
            if (c38387y.f101516p == null) {
                c38387y.f101516p = c38387y2.f101516p;
            }
            if (c38387y.f101500o == null) {
                c38387y.f101500o = c38387y2.f101500o;
            }
            String str2 = c38387y2.f101542x;
            if (str2 != null) {
                m14969K(c38387y, str2);
            }
        }
    }

    /* renamed from: K0 */
    private void m14968K0(SVG.C38376s0 c38376s0) {
        Set<String> systemLanguage;
        String language = Locale.getDefault().getLanguage();
        SVG.m15029k();
        for (SVG.C38366n0 c38366n0 : c38376s0.getChildren()) {
            if (c38366n0 instanceof SVG.InterfaceC38352g0) {
                SVG.InterfaceC38352g0 interfaceC38352g0 = (SVG.InterfaceC38352g0) c38366n0;
                if (interfaceC38352g0.getRequiredExtensions() == null && ((systemLanguage = interfaceC38352g0.getSystemLanguage()) == null || (!systemLanguage.isEmpty() && systemLanguage.contains(language)))) {
                    Set<String> requiredFeatures = interfaceC38352g0.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (f101547i == null) {
                            m14947V();
                        }
                        if (!requiredFeatures.isEmpty() && f101547i.containsAll(requiredFeatures)) {
                        }
                    }
                    Set<String> requiredFormats = interfaceC38352g0.getRequiredFormats();
                    if (requiredFormats != null) {
                        requiredFormats.isEmpty();
                    } else {
                        Set<String> requiredFonts = interfaceC38352g0.getRequiredFonts();
                        if (requiredFonts != null) {
                            requiredFonts.isEmpty();
                        } else {
                            m14988A0(c38366n0);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: L */
    private void m14967L(SVG.AbstractC38360k0 abstractC38360k0, Path path, SVG.C38387y c38387y) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        boolean z2;
        Boolean bool = c38387y.f101535q;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        String str = c38387y.f101542x;
        if (str != null) {
            m14969K(c38387y, str);
        }
        if (z) {
            SVG.C38369p c38369p = c38387y.f101538t;
            if (c38369p != null) {
                f5 = c38369p.m15002f(this);
            } else {
                f5 = 0.0f;
            }
            SVG.C38369p c38369p2 = c38387y.f101539u;
            if (c38369p2 != null) {
                f7 = c38369p2.m15001g(this);
            } else {
                f7 = 0.0f;
            }
            SVG.C38369p c38369p3 = c38387y.f101540v;
            if (c38369p3 != null) {
                f8 = c38369p3.m15002f(this);
            } else {
                f8 = 0.0f;
            }
            SVG.C38369p c38369p4 = c38387y.f101541w;
            if (c38369p4 != null) {
                f6 = c38369p4.m15001g(this);
            } else {
                f6 = 0.0f;
            }
        } else {
            SVG.C38369p c38369p5 = c38387y.f101538t;
            if (c38369p5 != null) {
                f = c38369p5.m15003e(this, 1.0f);
            } else {
                f = 0.0f;
            }
            SVG.C38369p c38369p6 = c38387y.f101539u;
            if (c38369p6 != null) {
                f2 = c38369p6.m15003e(this, 1.0f);
            } else {
                f2 = 0.0f;
            }
            SVG.C38369p c38369p7 = c38387y.f101540v;
            if (c38369p7 != null) {
                f3 = c38369p7.m15003e(this, 1.0f);
            } else {
                f3 = 0.0f;
            }
            SVG.C38369p c38369p8 = c38387y.f101541w;
            if (c38369p8 != null) {
                f4 = c38369p8.m15003e(this, 1.0f);
            } else {
                f4 = 0.0f;
            }
            SVG.C38327b c38327b = abstractC38360k0.f101478h;
            float f10 = c38327b.f101335a;
            float f11 = c38327b.f101337c;
            f5 = (f * f11) + f10;
            float f12 = c38327b.f101336b;
            float f13 = c38327b.f101338d;
            float f14 = f3 * f11;
            f6 = f4 * f13;
            f7 = (f2 * f13) + f12;
            f8 = f14;
        }
        if (f8 != 0.0f && f6 != 0.0f) {
            PreserveAspectRatio preserveAspectRatio = c38387y.f101500o;
            if (preserveAspectRatio == null) {
                preserveAspectRatio = PreserveAspectRatio.f101294e;
            }
            m14952S0();
            this.f101548a.clipPath(path);
            C38398h c38398h = new C38398h();
            m14946V0(c38398h, SVG.C38337e0.m15009b());
            c38398h.f101587a.f101402x = Boolean.FALSE;
            this.f101551d = m14963N(c38387y, c38398h);
            SVG.C38327b c38327b2 = abstractC38360k0.f101478h;
            Matrix matrix = c38387y.f101537s;
            if (matrix != null) {
                this.f101548a.concat(matrix);
                Matrix matrix2 = new Matrix();
                if (c38387y.f101537s.invert(matrix2)) {
                    SVG.C38327b c38327b3 = abstractC38360k0.f101478h;
                    SVG.C38327b c38327b4 = abstractC38360k0.f101478h;
                    SVG.C38327b c38327b5 = abstractC38360k0.f101478h;
                    float[] fArr = {c38327b3.f101335a, c38327b3.f101336b, c38327b3.m15013b(), c38327b4.f101336b, c38327b4.m15013b(), abstractC38360k0.f101478h.m15012c(), c38327b5.f101335a, c38327b5.m15012c()};
                    matrix2.mapPoints(fArr);
                    float f15 = fArr[0];
                    float f16 = fArr[1];
                    RectF rectF = new RectF(f15, f16, f15, f16);
                    for (int i = 2; i <= 6; i += 2) {
                        float f17 = fArr[i];
                        if (f17 < rectF.left) {
                            rectF.left = f17;
                        }
                        if (f17 > rectF.right) {
                            rectF.right = f17;
                        }
                        float f18 = fArr[i + 1];
                        if (f18 < rectF.top) {
                            rectF.top = f18;
                        }
                        if (f18 > rectF.bottom) {
                            rectF.bottom = f18;
                        }
                    }
                    float f19 = rectF.left;
                    float f20 = rectF.top;
                    c38327b2 = new SVG.C38327b(f19, f20, rectF.right - f19, rectF.bottom - f20);
                }
            }
            float floor = f5 + (((float) Math.floor((c38327b2.f101335a - f5) / f8)) * f8);
            float m15013b = c38327b2.m15013b();
            float m15012c = c38327b2.m15012c();
            SVG.C38327b c38327b6 = new SVG.C38327b(0.0f, 0.0f, f8, f6);
            boolean m14912m0 = m14912m0();
            for (float floor2 = f7 + (((float) Math.floor((c38327b2.f101336b - f7) / f6)) * f6); floor2 < m15012c; floor2 += f6) {
                float f21 = floor;
                while (f21 < m15013b) {
                    c38327b6.f101335a = f21;
                    c38327b6.f101336b = floor2;
                    m14952S0();
                    if (!this.f101551d.f101587a.f101402x.booleanValue()) {
                        f9 = floor;
                        m14960O0(c38327b6.f101335a, c38327b6.f101336b, c38327b6.f101337c, c38327b6.f101338d);
                    } else {
                        f9 = floor;
                    }
                    SVG.C38327b c38327b7 = c38387y.f101516p;
                    if (c38327b7 != null) {
                        this.f101548a.concat(m14909o(c38327b6, c38327b7, preserveAspectRatio));
                    } else {
                        Boolean bool2 = c38387y.f101536r;
                        if (bool2 != null && !bool2.booleanValue()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        this.f101548a.translate(f21, floor2);
                        if (!z2) {
                            Canvas canvas = this.f101548a;
                            SVG.C38327b c38327b8 = abstractC38360k0.f101478h;
                            canvas.scale(c38327b8.f101337c, c38327b8.f101338d);
                        }
                    }
                    for (SVG.C38366n0 c38366n0 : c38387y.f101454i) {
                        m14988A0(c38366n0);
                    }
                    m14954R0();
                    f21 += f8;
                    floor = f9;
                }
            }
            if (m14912m0) {
                m14918j0(c38387y);
            }
            m14954R0();
        }
    }

    /* renamed from: L0 */
    private void m14966L0(SVG.C38390z0 c38390z0) {
        float f;
        m14889y("TextPath render", new Object[0]);
        m14944W0(this.f101551d, c38390z0);
        if (!m14989A() || !m14940Y0()) {
            return;
        }
        SVG.C38366n0 m15019u = c38390z0.f101490a.m15019u(c38390z0.f101544o);
        if (m15019u == null) {
            m14979F("TextPath reference '%s' not found", c38390z0.f101544o);
            return;
        }
        SVG.C38381v c38381v = (SVG.C38381v) m15019u;
        Path m14882a = new C38394d(c38381v.f101527o).m14882a();
        Matrix matrix = c38381v.f101479n;
        if (matrix != null) {
            m14882a.transform(matrix);
        }
        PathMeasure pathMeasure = new PathMeasure(m14882a, false);
        SVG.C38369p c38369p = c38390z0.f101545p;
        if (c38369p != null) {
            f = c38369p.m15003e(this, pathMeasure.getLength());
        } else {
            f = 0.0f;
        }
        SVG.C38337e0.EnumC38343f m14961O = m14961O();
        if (m14961O != SVG.C38337e0.EnumC38343f.Start) {
            float m14911n = m14911n(c38390z0);
            if (m14961O == SVG.C38337e0.EnumC38343f.Middle) {
                m14911n /= 2.0f;
            }
            f -= m14911n;
        }
        m14903r((SVG.AbstractC38360k0) c38390z0.getTextRoot());
        boolean m14912m0 = m14912m0();
        m14981E(c38390z0, new C38395e(m14882a, f, 0.0f));
        if (m14912m0) {
            m14918j0(c38390z0);
        }
    }

    /* renamed from: M */
    private C38398h m14965M(SVG.C38366n0 c38366n0) {
        C38398h c38398h = new C38398h();
        m14946V0(c38398h, SVG.C38337e0.m15009b());
        return m14963N(c38366n0, c38398h);
    }

    /* renamed from: M0 */
    private boolean m14964M0() {
        if (this.f101551d.f101587a.f101393o.floatValue() >= 1.0f && this.f101551d.f101587a.f101374I == null) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    private C38398h m14963N(SVG.C38366n0 c38366n0, C38398h c38398h) {
        ArrayList<SVG.AbstractC38362l0> arrayList = new ArrayList();
        while (true) {
            if (c38366n0 instanceof SVG.AbstractC38362l0) {
                arrayList.add(0, (SVG.AbstractC38362l0) c38366n0);
            }
            SVG.InterfaceC38358j0 interfaceC38358j0 = c38366n0.f101491b;
            if (interfaceC38358j0 == null) {
                break;
            }
            c38366n0 = (SVG.C38366n0) interfaceC38358j0;
        }
        for (SVG.AbstractC38362l0 abstractC38362l0 : arrayList) {
            m14944W0(c38398h, abstractC38362l0);
        }
        C38398h c38398h2 = this.f101551d;
        c38398h.f101593g = c38398h2.f101593g;
        c38398h.f101592f = c38398h2.f101592f;
        return c38398h;
    }

    /* renamed from: N0 */
    private void m14962N0() {
        this.f101551d = new C38398h();
        this.f101552e = new Stack<>();
        m14946V0(this.f101551d, SVG.C38337e0.m15009b());
        C38398h c38398h = this.f101551d;
        c38398h.f101592f = null;
        c38398h.f101594h = false;
        this.f101552e.push(new C38398h(c38398h));
        this.f101554g = new Stack<>();
        this.f101553f = new Stack<>();
    }

    /* renamed from: O */
    private SVG.C38337e0.EnumC38343f m14961O() {
        SVG.C38337e0.EnumC38343f enumC38343f;
        SVG.C38337e0 c38337e0 = this.f101551d.f101587a;
        if (c38337e0.f101400v != SVG.C38337e0.EnumC38345h.LTR && (enumC38343f = c38337e0.f101401w) != SVG.C38337e0.EnumC38343f.Middle) {
            SVG.C38337e0.EnumC38343f enumC38343f2 = SVG.C38337e0.EnumC38343f.Start;
            if (enumC38343f == enumC38343f2) {
                return SVG.C38337e0.EnumC38343f.End;
            }
            return enumC38343f2;
        }
        return c38337e0.f101401w;
    }

    /* renamed from: O0 */
    private void m14960O0(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        SVG.C38330c c38330c = this.f101551d.f101587a.f101403y;
        if (c38330c != null) {
            f += c38330c.f101348d.m15002f(this);
            f2 += this.f101551d.f101587a.f101403y.f101345a.m15001g(this);
            f5 -= this.f101551d.f101587a.f101403y.f101346b.m15002f(this);
            f6 -= this.f101551d.f101587a.f101403y.f101347c.m15001g(this);
        }
        this.f101548a.clipRect(f, f2, f5, f6);
    }

    /* renamed from: P */
    private Path.FillType m14959P() {
        SVG.C38337e0.EnumC38338a enumC38338a = this.f101551d.f101587a.f101373H;
        if (enumC38338a != null && enumC38338a == SVG.C38337e0.EnumC38338a.EvenOdd) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    /* renamed from: P0 */
    private void m14958P0(C38398h c38398h, boolean z, SVG.AbstractC38368o0 abstractC38368o0) {
        Float f;
        int i;
        SVG.C38337e0 c38337e0 = c38398h.f101587a;
        if (z) {
            f = c38337e0.f101384f;
        } else {
            f = c38337e0.f101386h;
        }
        float floatValue = f.floatValue();
        if (abstractC38368o0 instanceof SVG.C38348f) {
            i = ((SVG.C38348f) abstractC38368o0).f101447b;
        } else if (abstractC38368o0 instanceof SVG.C38351g) {
            i = c38398h.f101587a.f101394p.f101447b;
        } else {
            return;
        }
        int m14891x = m14891x(i, floatValue);
        if (z) {
            c38398h.f101590d.setColor(m14891x);
        } else {
            c38398h.f101591e.setColor(m14891x);
        }
    }

    /* renamed from: Q0 */
    private void m14956Q0(boolean z, SVG.C38331c0 c38331c0) {
        boolean z2 = true;
        if (z) {
            if (m14945W(c38331c0.f101482e, 2147483648L)) {
                C38398h c38398h = this.f101551d;
                SVG.C38337e0 c38337e0 = c38398h.f101587a;
                SVG.AbstractC38368o0 abstractC38368o0 = c38331c0.f101482e.f101375J;
                c38337e0.f101382c = abstractC38368o0;
                if (abstractC38368o0 == null) {
                    z2 = false;
                }
                c38398h.f101588b = z2;
            }
            if (m14945W(c38331c0.f101482e, 4294967296L)) {
                this.f101551d.f101587a.f101384f = c38331c0.f101482e.f101376K;
            }
            if (m14945W(c38331c0.f101482e, 6442450944L)) {
                C38398h c38398h2 = this.f101551d;
                m14958P0(c38398h2, z, c38398h2.f101587a.f101382c);
                return;
            }
            return;
        }
        if (m14945W(c38331c0.f101482e, 2147483648L)) {
            C38398h c38398h3 = this.f101551d;
            SVG.C38337e0 c38337e02 = c38398h3.f101587a;
            SVG.AbstractC38368o0 abstractC38368o02 = c38331c0.f101482e.f101375J;
            c38337e02.f101385g = abstractC38368o02;
            if (abstractC38368o02 == null) {
                z2 = false;
            }
            c38398h3.f101589c = z2;
        }
        if (m14945W(c38331c0.f101482e, 4294967296L)) {
            this.f101551d.f101587a.f101386h = c38331c0.f101482e.f101376K;
        }
        if (m14945W(c38331c0.f101482e, 6442450944L)) {
            C38398h c38398h4 = this.f101551d;
            m14958P0(c38398h4, z, c38398h4.f101587a.f101385g);
        }
    }

    /* renamed from: R0 */
    private void m14954R0() {
        this.f101548a.restore();
        this.f101551d = this.f101552e.pop();
    }

    /* renamed from: S0 */
    private void m14952S0() {
        this.f101548a.save();
        this.f101552e.push(this.f101551d);
        this.f101551d = new C38398h(this.f101551d);
    }

    /* renamed from: T0 */
    private String m14950T0(String str, boolean z, boolean z2) {
        if (this.f101551d.f101594h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    /* renamed from: U */
    private Path.FillType m14949U() {
        SVG.C38337e0.EnumC38338a enumC38338a = this.f101551d.f101587a.f101383d;
        if (enumC38338a != null && enumC38338a == SVG.C38337e0.EnumC38338a.EvenOdd) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    /* renamed from: U0 */
    private void m14948U0(SVG.AbstractC38360k0 abstractC38360k0) {
        if (abstractC38360k0.f101491b == null || abstractC38360k0.f101478h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f101554g.peek().invert(matrix)) {
            SVG.C38327b c38327b = abstractC38360k0.f101478h;
            SVG.C38327b c38327b2 = abstractC38360k0.f101478h;
            SVG.C38327b c38327b3 = abstractC38360k0.f101478h;
            float[] fArr = {c38327b.f101335a, c38327b.f101336b, c38327b.m15013b(), c38327b2.f101336b, c38327b2.m15013b(), abstractC38360k0.f101478h.m15012c(), c38327b3.f101335a, c38327b3.m15012c()};
            matrix.preConcat(this.f101548a.getMatrix());
            matrix.mapPoints(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
            RectF rectF = new RectF(f, f2, f, f2);
            for (int i = 2; i <= 6; i += 2) {
                float f3 = fArr[i];
                if (f3 < rectF.left) {
                    rectF.left = f3;
                }
                if (f3 > rectF.right) {
                    rectF.right = f3;
                }
                float f4 = fArr[i + 1];
                if (f4 < rectF.top) {
                    rectF.top = f4;
                }
                if (f4 > rectF.bottom) {
                    rectF.bottom = f4;
                }
            }
            SVG.AbstractC38360k0 abstractC38360k02 = (SVG.AbstractC38360k0) this.f101553f.peek();
            SVG.C38327b c38327b4 = abstractC38360k02.f101478h;
            if (c38327b4 == null) {
                abstractC38360k02.f101478h = SVG.C38327b.m15014a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                c38327b4.m15010e(SVG.C38327b.m15014a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    /* renamed from: V */
    private static synchronized void m14947V() {
        synchronized (SVGAndroidRenderer.class) {
            HashSet<String> hashSet = new HashSet<>();
            f101547i = hashSet;
            hashSet.add("Structure");
            f101547i.add("BasicStructure");
            f101547i.add("ConditionalProcessing");
            f101547i.add(Constants.IMAGE);
            f101547i.add("Style");
            f101547i.add("ViewportAttribute");
            f101547i.add("Shape");
            f101547i.add("BasicText");
            f101547i.add("PaintAttribute");
            f101547i.add("BasicPaintAttribute");
            f101547i.add("OpacityAttribute");
            f101547i.add("BasicGraphicsAttribute");
            f101547i.add("Marker");
            f101547i.add("Gradient");
            f101547i.add("Pattern");
            f101547i.add("Clip");
            f101547i.add("BasicClip");
            f101547i.add("Mask");
            f101547i.add("View");
        }
    }

    /* renamed from: V0 */
    private void m14946V0(C38398h c38398h, SVG.C38337e0 c38337e0) {
        if (m14945W(c38337e0, 4096L)) {
            c38398h.f101587a.f101394p = c38337e0.f101394p;
        }
        if (m14945W(c38337e0, 2048L)) {
            c38398h.f101587a.f101393o = c38337e0.f101393o;
        }
        if (m14945W(c38337e0, 1L)) {
            c38398h.f101587a.f101382c = c38337e0.f101382c;
            SVG.AbstractC38368o0 abstractC38368o0 = c38337e0.f101382c;
            c38398h.f101588b = (abstractC38368o0 == null || abstractC38368o0 == SVG.C38348f.f101446d) ? false : true;
        }
        if (m14945W(c38337e0, 4L)) {
            c38398h.f101587a.f101384f = c38337e0.f101384f;
        }
        if (m14945W(c38337e0, 6149L)) {
            m14958P0(c38398h, true, c38398h.f101587a.f101382c);
        }
        if (m14945W(c38337e0, 2L)) {
            c38398h.f101587a.f101383d = c38337e0.f101383d;
        }
        if (m14945W(c38337e0, 8L)) {
            c38398h.f101587a.f101385g = c38337e0.f101385g;
            SVG.AbstractC38368o0 abstractC38368o02 = c38337e0.f101385g;
            c38398h.f101589c = (abstractC38368o02 == null || abstractC38368o02 == SVG.C38348f.f101446d) ? false : true;
        }
        if (m14945W(c38337e0, 16L)) {
            c38398h.f101587a.f101386h = c38337e0.f101386h;
        }
        if (m14945W(c38337e0, 6168L)) {
            m14958P0(c38398h, false, c38398h.f101587a.f101385g);
        }
        if (m14945W(c38337e0, 34359738368L)) {
            c38398h.f101587a.f101379N = c38337e0.f101379N;
        }
        if (m14945W(c38337e0, 32L)) {
            SVG.C38337e0 c38337e02 = c38398h.f101587a;
            SVG.C38369p c38369p = c38337e0.f101387i;
            c38337e02.f101387i = c38369p;
            c38398h.f101591e.setStrokeWidth(c38369p.m15004d(this));
        }
        if (m14945W(c38337e0, 64L)) {
            c38398h.f101587a.f101388j = c38337e0.f101388j;
            int i = C38391a.f101557b[c38337e0.f101388j.ordinal()];
            if (i == 1) {
                c38398h.f101591e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                c38398h.f101591e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                c38398h.f101591e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (m14945W(c38337e0, 128L)) {
            c38398h.f101587a.f101389k = c38337e0.f101389k;
            int i2 = C38391a.f101558c[c38337e0.f101389k.ordinal()];
            if (i2 == 1) {
                c38398h.f101591e.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                c38398h.f101591e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                c38398h.f101591e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (m14945W(c38337e0, 256L)) {
            c38398h.f101587a.f101390l = c38337e0.f101390l;
            c38398h.f101591e.setStrokeMiter(c38337e0.f101390l.floatValue());
        }
        if (m14945W(c38337e0, 512L)) {
            c38398h.f101587a.f101391m = c38337e0.f101391m;
        }
        if (m14945W(c38337e0, 1024L)) {
            c38398h.f101587a.f101392n = c38337e0.f101392n;
        }
        Typeface typeface = null;
        if (m14945W(c38337e0, 1536L)) {
            SVG.C38369p[] c38369pArr = c38398h.f101587a.f101391m;
            if (c38369pArr == null) {
                c38398h.f101591e.setPathEffect(null);
            } else {
                int length = c38369pArr.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    float m15004d = c38398h.f101587a.f101391m[i4 % length].m15004d(this);
                    fArr[i4] = m15004d;
                    f += m15004d;
                }
                if (f == 0.0f) {
                    c38398h.f101591e.setPathEffect(null);
                } else {
                    float m15004d2 = c38398h.f101587a.f101392n.m15004d(this);
                    if (m15004d2 < 0.0f) {
                        m15004d2 = (m15004d2 % f) + f;
                    }
                    c38398h.f101591e.setPathEffect(new DashPathEffect(fArr, m15004d2));
                }
            }
        }
        if (m14945W(c38337e0, 16384L)) {
            float m14957Q = m14957Q();
            c38398h.f101587a.f101396r = c38337e0.f101396r;
            c38398h.f101590d.setTextSize(c38337e0.f101396r.m15003e(this, m14957Q));
            c38398h.f101591e.setTextSize(c38337e0.f101396r.m15003e(this, m14957Q));
        }
        if (m14945W(c38337e0, 8192L)) {
            c38398h.f101587a.f101395q = c38337e0.f101395q;
        }
        if (m14945W(c38337e0, 32768L)) {
            if (c38337e0.f101397s.intValue() == -1 && c38398h.f101587a.f101397s.intValue() > 100) {
                SVG.C38337e0 c38337e03 = c38398h.f101587a;
                c38337e03.f101397s = Integer.valueOf(c38337e03.f101397s.intValue() - 100);
            } else if (c38337e0.f101397s.intValue() == 1 && c38398h.f101587a.f101397s.intValue() < 900) {
                SVG.C38337e0 c38337e04 = c38398h.f101587a;
                c38337e04.f101397s = Integer.valueOf(c38337e04.f101397s.intValue() + 100);
            } else {
                c38398h.f101587a.f101397s = c38337e0.f101397s;
            }
        }
        if (m14945W(c38337e0, 65536L)) {
            c38398h.f101587a.f101398t = c38337e0.f101398t;
        }
        if (m14945W(c38337e0, 106496L)) {
            if (c38398h.f101587a.f101395q != null && this.f101550c != null) {
                SVG.m15029k();
                for (String str : c38398h.f101587a.f101395q) {
                    SVG.C38337e0 c38337e05 = c38398h.f101587a;
                    typeface = m14899t(str, c38337e05.f101397s, c38337e05.f101398t);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                SVG.C38337e0 c38337e06 = c38398h.f101587a;
                typeface = m14899t("serif", c38337e06.f101397s, c38337e06.f101398t);
            }
            c38398h.f101590d.setTypeface(typeface);
            c38398h.f101591e.setTypeface(typeface);
        }
        if (m14945W(c38337e0, 131072L)) {
            c38398h.f101587a.f101399u = c38337e0.f101399u;
            Paint paint = c38398h.f101590d;
            SVG.C38337e0.EnumC38344g enumC38344g = c38337e0.f101399u;
            SVG.C38337e0.EnumC38344g enumC38344g2 = SVG.C38337e0.EnumC38344g.LineThrough;
            paint.setStrikeThruText(enumC38344g == enumC38344g2);
            Paint paint2 = c38398h.f101590d;
            SVG.C38337e0.EnumC38344g enumC38344g3 = c38337e0.f101399u;
            SVG.C38337e0.EnumC38344g enumC38344g4 = SVG.C38337e0.EnumC38344g.Underline;
            paint2.setUnderlineText(enumC38344g3 == enumC38344g4);
            c38398h.f101591e.setStrikeThruText(c38337e0.f101399u == enumC38344g2);
            c38398h.f101591e.setUnderlineText(c38337e0.f101399u == enumC38344g4);
        }
        if (m14945W(c38337e0, 68719476736L)) {
            c38398h.f101587a.f101400v = c38337e0.f101400v;
        }
        if (m14945W(c38337e0, 262144L)) {
            c38398h.f101587a.f101401w = c38337e0.f101401w;
        }
        if (m14945W(c38337e0, 524288L)) {
            c38398h.f101587a.f101402x = c38337e0.f101402x;
        }
        if (m14945W(c38337e0, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE)) {
            c38398h.f101587a.f101404z = c38337e0.f101404z;
        }
        if (m14945W(c38337e0, 4194304L)) {
            c38398h.f101587a.f101366A = c38337e0.f101366A;
        }
        if (m14945W(c38337e0, 8388608L)) {
            c38398h.f101587a.f101367B = c38337e0.f101367B;
        }
        if (m14945W(c38337e0, 16777216L)) {
            c38398h.f101587a.f101368C = c38337e0.f101368C;
        }
        if (m14945W(c38337e0, 33554432L)) {
            c38398h.f101587a.f101369D = c38337e0.f101369D;
        }
        if (m14945W(c38337e0, 1048576L)) {
            c38398h.f101587a.f101403y = c38337e0.f101403y;
        }
        if (m14945W(c38337e0, 268435456L)) {
            c38398h.f101587a.f101372G = c38337e0.f101372G;
        }
        if (m14945W(c38337e0, 536870912L)) {
            c38398h.f101587a.f101373H = c38337e0.f101373H;
        }
        if (m14945W(c38337e0, 1073741824L)) {
            c38398h.f101587a.f101374I = c38337e0.f101374I;
        }
        if (m14945W(c38337e0, 67108864L)) {
            c38398h.f101587a.f101370E = c38337e0.f101370E;
        }
        if (m14945W(c38337e0, 134217728L)) {
            c38398h.f101587a.f101371F = c38337e0.f101371F;
        }
        if (m14945W(c38337e0, 8589934592L)) {
            c38398h.f101587a.f101377L = c38337e0.f101377L;
        }
        if (m14945W(c38337e0, 17179869184L)) {
            c38398h.f101587a.f101378M = c38337e0.f101378M;
        }
        if (m14945W(c38337e0, 137438953472L)) {
            c38398h.f101587a.f101380O = c38337e0.f101380O;
        }
    }

    /* renamed from: W */
    private boolean m14945W(SVG.C38337e0 c38337e0, long j) {
        if ((c38337e0.f101381b & j) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: W0 */
    private void m14944W0(C38398h c38398h, SVG.AbstractC38362l0 abstractC38362l0) {
        boolean z;
        if (abstractC38362l0.f101491b == null) {
            z = true;
        } else {
            z = false;
        }
        c38398h.f101587a.m15008c(z);
        SVG.C38337e0 c38337e0 = abstractC38362l0.f101482e;
        if (c38337e0 != null) {
            m14946V0(c38398h, c38337e0);
        }
        if (this.f101550c.m15023q()) {
            for (CSSParser.C38314p c38314p : this.f101550c.m15036d()) {
                if (CSSParser.m15093l(this.f101555h, c38314p.f101273a, abstractC38362l0)) {
                    m14946V0(c38398h, c38314p.f101274b);
                }
            }
        }
        SVG.C38337e0 c38337e02 = abstractC38362l0.f101483f;
        if (c38337e02 != null) {
            m14946V0(c38398h, c38337e02);
        }
    }

    /* renamed from: X */
    private void m14943X(boolean z, SVG.C38327b c38327b, SVG.C38364m0 c38364m0) {
        boolean z2;
        Paint paint;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        String str = c38364m0.f101473l;
        if (str != null) {
            m14975H(c38364m0, str);
        }
        Boolean bool = c38364m0.f101470i;
        int i = 0;
        if (bool != null && bool.booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C38398h c38398h = this.f101551d;
        if (z) {
            paint = c38398h.f101590d;
        } else {
            paint = c38398h.f101591e;
        }
        if (z2) {
            SVG.C38327b m14953S = m14953S();
            SVG.C38369p c38369p = c38364m0.f101486m;
            if (c38369p != null) {
                f10 = c38369p.m15002f(this);
            } else {
                f10 = 0.0f;
            }
            SVG.C38369p c38369p2 = c38364m0.f101487n;
            if (c38369p2 != null) {
                f11 = c38369p2.m15001g(this);
            } else {
                f11 = 0.0f;
            }
            SVG.C38369p c38369p3 = c38364m0.f101488o;
            if (c38369p3 != null) {
                f12 = c38369p3.m15002f(this);
            } else {
                f12 = m14953S.f101337c;
            }
            SVG.C38369p c38369p4 = c38364m0.f101489p;
            if (c38369p4 != null) {
                f13 = c38369p4.m15001g(this);
            } else {
                f13 = 0.0f;
            }
            f8 = f12;
            f5 = f10;
            f7 = f11;
            f6 = f13;
        } else {
            SVG.C38369p c38369p5 = c38364m0.f101486m;
            if (c38369p5 != null) {
                f = c38369p5.m15003e(this, 1.0f);
            } else {
                f = 0.0f;
            }
            SVG.C38369p c38369p6 = c38364m0.f101487n;
            if (c38369p6 != null) {
                f2 = c38369p6.m15003e(this, 1.0f);
            } else {
                f2 = 0.0f;
            }
            SVG.C38369p c38369p7 = c38364m0.f101488o;
            if (c38369p7 != null) {
                f3 = c38369p7.m15003e(this, 1.0f);
            } else {
                f3 = 1.0f;
            }
            SVG.C38369p c38369p8 = c38364m0.f101489p;
            if (c38369p8 != null) {
                f4 = c38369p8.m15003e(this, 1.0f);
            } else {
                f4 = 0.0f;
            }
            f5 = f;
            f6 = f4;
            f7 = f2;
            f8 = f3;
        }
        m14952S0();
        this.f101551d = m14965M(c38364m0);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(c38327b.f101335a, c38327b.f101336b);
            matrix.preScale(c38327b.f101337c, c38327b.f101338d);
        }
        Matrix matrix2 = c38364m0.f101471j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = c38364m0.f101469h.size();
        if (size == 0) {
            m14954R0();
            if (z) {
                this.f101551d.f101588b = false;
                return;
            } else {
                this.f101551d.f101589c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<SVG.C38366n0> it = c38364m0.f101469h.iterator();
        float f14 = -1.0f;
        while (it.hasNext()) {
            SVG.C38334d0 c38334d0 = (SVG.C38334d0) it.next();
            Float f15 = c38334d0.f101354h;
            if (f15 != null) {
                f9 = f15.floatValue();
            } else {
                f9 = 0.0f;
            }
            if (i != 0 && f9 < f14) {
                fArr[i] = f14;
            } else {
                fArr[i] = f9;
                f14 = f9;
            }
            m14952S0();
            m14944W0(this.f101551d, c38334d0);
            SVG.C38337e0 c38337e0 = this.f101551d.f101587a;
            SVG.C38348f c38348f = (SVG.C38348f) c38337e0.f101370E;
            if (c38348f == null) {
                c38348f = SVG.C38348f.f101445c;
            }
            iArr[i] = m14891x(c38348f.f101447b, c38337e0.f101371F.floatValue());
            i++;
            m14954R0();
        }
        if ((f5 == f8 && f7 == f6) || size == 1) {
            m14954R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.EnumC38359k enumC38359k = c38364m0.f101472k;
        if (enumC38359k != null) {
            if (enumC38359k == SVG.EnumC38359k.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (enumC38359k == SVG.EnumC38359k.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        m14954R0();
        LinearGradient linearGradient = new LinearGradient(f5, f7, f8, f6, iArr, fArr, tileMode);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(m14893w(this.f101551d.f101587a.f101384f.floatValue()));
    }

    /* renamed from: X0 */
    private void m14942X0() {
        int i;
        SVG.C38337e0 c38337e0 = this.f101551d.f101587a;
        SVG.AbstractC38368o0 abstractC38368o0 = c38337e0.f101377L;
        if (abstractC38368o0 instanceof SVG.C38348f) {
            i = ((SVG.C38348f) abstractC38368o0).f101447b;
        } else if (abstractC38368o0 instanceof SVG.C38351g) {
            i = c38337e0.f101394p.f101447b;
        } else {
            return;
        }
        Float f = c38337e0.f101378M;
        if (f != null) {
            i = m14891x(i, f.floatValue());
        }
        this.f101548a.drawColor(i);
    }

    /* renamed from: Y */
    private Path m14941Y(SVG.C38333d c38333d) {
        float f;
        SVG.C38369p c38369p = c38333d.f101351o;
        float f2 = 0.0f;
        if (c38369p != null) {
            f = c38369p.m15002f(this);
        } else {
            f = 0.0f;
        }
        SVG.C38369p c38369p2 = c38333d.f101352p;
        if (c38369p2 != null) {
            f2 = c38369p2.m15001g(this);
        }
        float m15004d = c38333d.f101353q.m15004d(this);
        float f3 = f - m15004d;
        float f4 = f2 - m15004d;
        float f5 = f + m15004d;
        float f6 = f2 + m15004d;
        if (c38333d.f101478h == null) {
            float f7 = 2.0f * m15004d;
            c38333d.f101478h = new SVG.C38327b(f3, f4, f7, f7);
        }
        float f8 = 0.5522848f * m15004d;
        Path path = new Path();
        path.moveTo(f, f4);
        float f9 = f + f8;
        float f10 = f2 - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f2 + f8;
        path.cubicTo(f5, f11, f9, f6, f, f6);
        float f12 = f - f8;
        path.cubicTo(f12, f6, f3, f11, f3, f2);
        path.cubicTo(f3, f10, f12, f4, f, f4);
        path.close();
        return path;
    }

    /* renamed from: Y0 */
    public boolean m14940Y0() {
        Boolean bool = this.f101551d.f101587a.f101369D;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: Z */
    private Path m14939Z(SVG.C38355i c38355i) {
        float f;
        SVG.C38369p c38369p = c38355i.f101460o;
        float f2 = 0.0f;
        if (c38369p != null) {
            f = c38369p.m15002f(this);
        } else {
            f = 0.0f;
        }
        SVG.C38369p c38369p2 = c38355i.f101461p;
        if (c38369p2 != null) {
            f2 = c38369p2.m15001g(this);
        }
        float m15002f = c38355i.f101462q.m15002f(this);
        float m15001g = c38355i.f101463r.m15001g(this);
        float f3 = f - m15002f;
        float f4 = f2 - m15001g;
        float f5 = f + m15002f;
        float f6 = f2 + m15001g;
        if (c38355i.f101478h == null) {
            c38355i.f101478h = new SVG.C38327b(f3, f4, m15002f * 2.0f, 2.0f * m15001g);
        }
        float f7 = m15002f * 0.5522848f;
        float f8 = 0.5522848f * m15001g;
        Path path = new Path();
        path.moveTo(f, f4);
        float f9 = f + f7;
        float f10 = f2 - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f8 + f2;
        path.cubicTo(f5, f11, f9, f6, f, f6);
        float f12 = f - f7;
        path.cubicTo(f12, f6, f3, f11, f3, f2);
        path.cubicTo(f3, f10, f12, f4, f, f4);
        path.close();
        return path;
    }

    /* renamed from: Z0 */
    public static void m14938Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* renamed from: a0 */
    private Path m14936a0(SVG.C38371q c38371q) {
        float m15002f;
        float m15001g;
        float m15002f2;
        SVG.C38369p c38369p = c38371q.f101501o;
        float f = 0.0f;
        if (c38369p == null) {
            m15002f = 0.0f;
        } else {
            m15002f = c38369p.m15002f(this);
        }
        SVG.C38369p c38369p2 = c38371q.f101502p;
        if (c38369p2 == null) {
            m15001g = 0.0f;
        } else {
            m15001g = c38369p2.m15001g(this);
        }
        SVG.C38369p c38369p3 = c38371q.f101503q;
        if (c38369p3 == null) {
            m15002f2 = 0.0f;
        } else {
            m15002f2 = c38369p3.m15002f(this);
        }
        SVG.C38369p c38369p4 = c38371q.f101504r;
        if (c38369p4 != null) {
            f = c38369p4.m15001g(this);
        }
        if (c38371q.f101478h == null) {
            c38371q.f101478h = new SVG.C38327b(Math.min(m15002f, m15002f2), Math.min(m15001g, f), Math.abs(m15002f2 - m15002f), Math.abs(f - m15001g));
        }
        Path path = new Path();
        path.moveTo(m15002f, m15001g);
        path.lineTo(m15002f2, f);
        return path;
    }

    /* renamed from: b0 */
    private Path m14934b0(SVG.C38389z c38389z) {
        Path path = new Path();
        float[] fArr = c38389z.f101543o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = c38389z.f101543o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (c38389z instanceof SVG.C38325a0) {
            path.close();
        }
        if (c38389z.f101478h == null) {
            c38389z.f101478h = m14913m(path);
        }
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0069  */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Path m14932c0(p793n0.SVG.C38328b0 r24) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p793n0.SVGAndroidRenderer.m14932c0(n0.h$b0):android.graphics.Path");
    }

    /* renamed from: d0 */
    private Path m14930d0(SVG.C38384w0 c38384w0) {
        float f;
        float f2;
        float f3;
        List<SVG.C38369p> list = c38384w0.f101331o;
        float f4 = 0.0f;
        if (list != null && list.size() != 0) {
            f = c38384w0.f101331o.get(0).m15002f(this);
        } else {
            f = 0.0f;
        }
        List<SVG.C38369p> list2 = c38384w0.f101332p;
        if (list2 != null && list2.size() != 0) {
            f2 = c38384w0.f101332p.get(0).m15001g(this);
        } else {
            f2 = 0.0f;
        }
        List<SVG.C38369p> list3 = c38384w0.f101333q;
        if (list3 != null && list3.size() != 0) {
            f3 = c38384w0.f101333q.get(0).m15002f(this);
        } else {
            f3 = 0.0f;
        }
        List<SVG.C38369p> list4 = c38384w0.f101334r;
        if (list4 != null && list4.size() != 0) {
            f4 = c38384w0.f101334r.get(0).m15001g(this);
        }
        if (this.f101551d.f101587a.f101401w != SVG.C38337e0.EnumC38343f.Start) {
            float m14911n = m14911n(c38384w0);
            if (this.f101551d.f101587a.f101401w == SVG.C38337e0.EnumC38343f.Middle) {
                m14911n /= 2.0f;
            }
            f -= m14911n;
        }
        if (c38384w0.f101478h == null) {
            C38399i c38399i = new C38399i(f, f2);
            m14981E(c38384w0, c38399i);
            RectF rectF = c38399i.f101598d;
            c38384w0.f101478h = new SVG.C38327b(rectF.left, rectF.top, rectF.width(), c38399i.f101598d.height());
        }
        Path path = new Path();
        m14981E(c38384w0, new C38397g(f + f3, f2 + f4, path));
        return path;
    }

    /* renamed from: e0 */
    private void m14928e0(boolean z, SVG.C38327b c38327b, SVG.C38372q0 c38372q0) {
        boolean z2;
        Paint paint;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float m15002f;
        float m15001g;
        float m15004d;
        String str = c38372q0.f101473l;
        if (str != null) {
            m14975H(c38372q0, str);
        }
        Boolean bool = c38372q0.f101470i;
        int i = 0;
        if (bool != null && bool.booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C38398h c38398h = this.f101551d;
        if (z) {
            paint = c38398h.f101590d;
        } else {
            paint = c38398h.f101591e;
        }
        if (z2) {
            SVG.C38369p c38369p = new SVG.C38369p(50.0f, SVG.EnumC38335d1.percent);
            SVG.C38369p c38369p2 = c38372q0.f101505m;
            if (c38369p2 != null) {
                m15002f = c38369p2.m15002f(this);
            } else {
                m15002f = c38369p.m15002f(this);
            }
            SVG.C38369p c38369p3 = c38372q0.f101506n;
            if (c38369p3 != null) {
                m15001g = c38369p3.m15001g(this);
            } else {
                m15001g = c38369p.m15001g(this);
            }
            SVG.C38369p c38369p4 = c38372q0.f101507o;
            if (c38369p4 != null) {
                m15004d = c38369p4.m15004d(this);
            } else {
                m15004d = c38369p.m15004d(this);
            }
            f5 = m15004d;
            f4 = m15002f;
            f6 = m15001g;
        } else {
            SVG.C38369p c38369p5 = c38372q0.f101505m;
            if (c38369p5 != null) {
                f = c38369p5.m15003e(this, 1.0f);
            } else {
                f = 0.5f;
            }
            SVG.C38369p c38369p6 = c38372q0.f101506n;
            if (c38369p6 != null) {
                f2 = c38369p6.m15003e(this, 1.0f);
            } else {
                f2 = 0.5f;
            }
            SVG.C38369p c38369p7 = c38372q0.f101507o;
            if (c38369p7 != null) {
                f3 = c38369p7.m15003e(this, 1.0f);
            } else {
                f3 = 0.5f;
            }
            f4 = f;
            f5 = f3;
            f6 = f2;
        }
        m14952S0();
        this.f101551d = m14965M(c38372q0);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(c38327b.f101335a, c38327b.f101336b);
            matrix.preScale(c38327b.f101337c, c38327b.f101338d);
        }
        Matrix matrix2 = c38372q0.f101471j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = c38372q0.f101469h.size();
        if (size == 0) {
            m14954R0();
            if (z) {
                this.f101551d.f101588b = false;
                return;
            } else {
                this.f101551d.f101589c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<SVG.C38366n0> it = c38372q0.f101469h.iterator();
        float f7 = -1.0f;
        while (true) {
            float f8 = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            SVG.C38334d0 c38334d0 = (SVG.C38334d0) it.next();
            Float f9 = c38334d0.f101354h;
            if (f9 != null) {
                f8 = f9.floatValue();
            }
            if (i != 0 && f8 < f7) {
                fArr[i] = f7;
            } else {
                fArr[i] = f8;
                f7 = f8;
            }
            m14952S0();
            m14944W0(this.f101551d, c38334d0);
            SVG.C38337e0 c38337e0 = this.f101551d.f101587a;
            SVG.C38348f c38348f = (SVG.C38348f) c38337e0.f101370E;
            if (c38348f == null) {
                c38348f = SVG.C38348f.f101445c;
            }
            iArr[i] = m14891x(c38348f.f101447b, c38337e0.f101371F.floatValue());
            i++;
            m14954R0();
        }
        if (f5 != 0.0f && size != 1) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            SVG.EnumC38359k enumC38359k = c38372q0.f101472k;
            if (enumC38359k != null) {
                if (enumC38359k == SVG.EnumC38359k.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (enumC38359k == SVG.EnumC38359k.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            m14954R0();
            RadialGradient radialGradient = new RadialGradient(f4, f6, f5, iArr, fArr, tileMode);
            radialGradient.setLocalMatrix(matrix);
            paint.setShader(radialGradient);
            paint.setAlpha(m14893w(this.f101551d.f101587a.f101384f.floatValue()));
            return;
        }
        m14954R0();
        paint.setColor(iArr[size - 1]);
    }

    /* renamed from: f0 */
    private SVG.C38327b m14926f0(SVG.C38369p c38369p, SVG.C38369p c38369p2, SVG.C38369p c38369p3, SVG.C38369p c38369p4) {
        float f;
        float f2;
        float f3;
        float f4 = 0.0f;
        if (c38369p != null) {
            f = c38369p.m15002f(this);
        } else {
            f = 0.0f;
        }
        if (c38369p2 != null) {
            f4 = c38369p2.m15001g(this);
        }
        SVG.C38327b m14953S = m14953S();
        if (c38369p3 != null) {
            f2 = c38369p3.m15002f(this);
        } else {
            f2 = m14953S.f101337c;
        }
        if (c38369p4 != null) {
            f3 = c38369p4.m15001g(this);
        } else {
            f3 = m14953S.f101338d;
        }
        return new SVG.C38327b(f, f4, f2, f3);
    }

    @TargetApi(19)
    /* renamed from: g0 */
    private Path m14924g0(SVG.AbstractC38360k0 abstractC38360k0, boolean z) {
        Path m14930d0;
        Path m14919j;
        this.f101552e.push(this.f101551d);
        C38398h c38398h = new C38398h(this.f101551d);
        this.f101551d = c38398h;
        m14944W0(c38398h, abstractC38360k0);
        if (m14989A() && m14940Y0()) {
            if (abstractC38360k0 instanceof SVG.C38347e1) {
                if (!z) {
                    m14979F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
                SVG.C38347e1 c38347e1 = (SVG.C38347e1) abstractC38360k0;
                SVG.C38366n0 m15019u = abstractC38360k0.f101490a.m15019u(c38347e1.f101440p);
                if (m15019u == null) {
                    m14979F("Use reference '%s' not found", c38347e1.f101440p);
                    this.f101551d = this.f101552e.pop();
                    return null;
                } else if (!(m15019u instanceof SVG.AbstractC38360k0)) {
                    this.f101551d = this.f101552e.pop();
                    return null;
                } else {
                    m14930d0 = m14924g0((SVG.AbstractC38360k0) m15019u, false);
                    if (m14930d0 == null) {
                        return null;
                    }
                    if (c38347e1.f101478h == null) {
                        c38347e1.f101478h = m14913m(m14930d0);
                    }
                    Matrix matrix = c38347e1.f101485o;
                    if (matrix != null) {
                        m14930d0.transform(matrix);
                    }
                }
            } else if (abstractC38360k0 instanceof SVG.AbstractC38361l) {
                SVG.AbstractC38361l abstractC38361l = (SVG.AbstractC38361l) abstractC38360k0;
                if (abstractC38360k0 instanceof SVG.C38381v) {
                    m14930d0 = new C38394d(((SVG.C38381v) abstractC38360k0).f101527o).m14882a();
                    if (abstractC38360k0.f101478h == null) {
                        abstractC38360k0.f101478h = m14913m(m14930d0);
                    }
                } else {
                    m14930d0 = abstractC38360k0 instanceof SVG.C38328b0 ? m14932c0((SVG.C38328b0) abstractC38360k0) : abstractC38360k0 instanceof SVG.C38333d ? m14941Y((SVG.C38333d) abstractC38360k0) : abstractC38360k0 instanceof SVG.C38355i ? m14939Z((SVG.C38355i) abstractC38360k0) : abstractC38360k0 instanceof SVG.C38389z ? m14934b0((SVG.C38389z) abstractC38360k0) : null;
                }
                if (m14930d0 == null) {
                    return null;
                }
                if (abstractC38361l.f101478h == null) {
                    abstractC38361l.f101478h = m14913m(m14930d0);
                }
                Matrix matrix2 = abstractC38361l.f101479n;
                if (matrix2 != null) {
                    m14930d0.transform(matrix2);
                }
                m14930d0.setFillType(m14959P());
            } else if (abstractC38360k0 instanceof SVG.C38384w0) {
                SVG.C38384w0 c38384w0 = (SVG.C38384w0) abstractC38360k0;
                m14930d0 = m14930d0(c38384w0);
                if (m14930d0 == null) {
                    return null;
                }
                Matrix matrix3 = c38384w0.f101534s;
                if (matrix3 != null) {
                    m14930d0.transform(matrix3);
                }
                m14930d0.setFillType(m14959P());
            } else {
                m14979F("Invalid %s element found in clipPath definition", abstractC38360k0.mo14991b());
                return null;
            }
            if (this.f101551d.f101587a.f101372G != null && (m14919j = m14919j(abstractC38360k0, abstractC38360k0.f101478h)) != null) {
                m14930d0.op(m14919j, Path.Op.INTERSECT);
            }
            this.f101551d = this.f101552e.pop();
            return m14930d0;
        }
        this.f101551d = this.f101552e.pop();
        return null;
    }

    /* renamed from: h */
    public static void m14923h(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, SVG.InterfaceC38385x interfaceC38385x) {
        float f8;
        SVG.InterfaceC38385x interfaceC38385x2;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f) {
            f8 = f6;
            interfaceC38385x2 = interfaceC38385x;
        } else if (f4 != 0.0f) {
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            double radians = Math.toRadians(f5 % 360.0d);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d = (f - f6) / 2.0d;
            double d2 = (f2 - f7) / 2.0d;
            double d3 = (cos * d) + (sin * d2);
            double d4 = ((-sin) * d) + (d2 * cos);
            double d5 = abs * abs;
            double d6 = abs2 * abs2;
            double d7 = d3 * d3;
            double d8 = d4 * d4;
            double d9 = (d7 / d5) + (d8 / d6);
            if (d9 > 0.99999d) {
                double sqrt = Math.sqrt(d9) * 1.00001d;
                abs = (float) (abs * sqrt);
                abs2 = (float) (sqrt * abs2);
                d5 = abs * abs;
                d6 = abs2 * abs2;
            }
            double d10 = z == z2 ? -1.0d : 1.0d;
            double d11 = d5 * d6;
            double d12 = d5 * d8;
            double d13 = d6 * d7;
            double d14 = ((d11 - d12) - d13) / (d12 + d13);
            if (d14 < 0.0d) {
                d14 = 0.0d;
            }
            double sqrt2 = d10 * Math.sqrt(d14);
            double d15 = abs;
            double d16 = abs2;
            double d17 = ((d15 * d4) / d16) * sqrt2;
            float f9 = abs;
            float f10 = abs2;
            double d18 = sqrt2 * (-((d16 * d3) / d15));
            double d19 = ((f + f6) / 2.0d) + ((cos * d17) - (sin * d18));
            double d20 = ((f2 + f7) / 2.0d) + (sin * d17) + (cos * d18);
            double d21 = (d3 - d17) / d15;
            double d22 = (d4 - d18) / d16;
            double d23 = ((-d3) - d17) / d15;
            double d24 = ((-d4) - d18) / d16;
            double d25 = (d21 * d21) + (d22 * d22);
            double acos = (d22 < 0.0d ? -1.0d : 1.0d) * Math.acos(d21 / Math.sqrt(d25));
            double m14895v = ((d21 * d24) - (d22 * d23) >= 0.0d ? 1.0d : -1.0d) * m14895v(((d21 * d23) + (d22 * d24)) / Math.sqrt(d25 * ((d23 * d23) + (d24 * d24))));
            if (!z2 && m14895v > 0.0d) {
                m14895v -= 6.283185307179586d;
            } else if (z2 && m14895v < 0.0d) {
                m14895v += 6.283185307179586d;
            }
            float[] m14921i = m14921i(acos % 6.283185307179586d, m14895v % 6.283185307179586d);
            Matrix matrix = new Matrix();
            matrix.postScale(f9, f10);
            matrix.postRotate(f5);
            matrix.postTranslate((float) d19, (float) d20);
            matrix.mapPoints(m14921i);
            m14921i[m14921i.length - 2] = f6;
            m14921i[m14921i.length - 1] = f7;
            for (int i = 0; i < m14921i.length; i += 6) {
                interfaceC38385x.cubicTo(m14921i[i], m14921i[i + 1], m14921i[i + 2], m14921i[i + 3], m14921i[i + 4], m14921i[i + 5]);
            }
            return;
        } else {
            interfaceC38385x2 = interfaceC38385x;
            f8 = f6;
        }
        interfaceC38385x2.lineTo(f8, f7);
    }

    /* renamed from: h0 */
    private void m14922h0() {
        this.f101553f.pop();
        this.f101554g.pop();
    }

    /* renamed from: i */
    private static float[] m14921i(double d, double d2) {
        int ceil = (int) Math.ceil((Math.abs(d2) * 2.0d) / 3.141592653589793d);
        double d3 = d2 / ceil;
        double d4 = d3 / 2.0d;
        double sin = (Math.sin(d4) * 1.3333333333333333d) / (Math.cos(d4) + 1.0d);
        float[] fArr = new float[ceil * 6];
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            double d5 = d + (i2 * d3);
            double cos = Math.cos(d5);
            double sin2 = Math.sin(d5);
            int i3 = i + 1;
            fArr[i] = (float) (cos - (sin * sin2));
            int i4 = i3 + 1;
            fArr[i3] = (float) (sin2 + (cos * sin));
            d3 = d3;
            double d6 = d5 + d3;
            double cos2 = Math.cos(d6);
            double sin3 = Math.sin(d6);
            int i5 = i4 + 1;
            fArr[i4] = (float) ((sin * sin3) + cos2);
            int i6 = i5 + 1;
            fArr[i5] = (float) (sin3 - (sin * cos2));
            int i7 = i6 + 1;
            fArr[i6] = (float) cos2;
            i = i7 + 1;
            fArr[i7] = (float) sin3;
        }
        return fArr;
    }

    /* renamed from: i0 */
    private void m14920i0(SVG.InterfaceC38358j0 interfaceC38358j0) {
        this.f101553f.push(interfaceC38358j0);
        this.f101554g.push(this.f101548a.getMatrix());
    }

    @TargetApi(19)
    /* renamed from: j */
    private Path m14919j(SVG.AbstractC38360k0 abstractC38360k0, SVG.C38327b c38327b) {
        Path m14924g0;
        SVG.C38366n0 m15019u = abstractC38360k0.f101490a.m15019u(this.f101551d.f101587a.f101372G);
        boolean z = false;
        if (m15019u == null) {
            m14979F("ClipPath reference '%s' not found", this.f101551d.f101587a.f101372G);
            return null;
        }
        SVG.C38336e c38336e = (SVG.C38336e) m15019u;
        this.f101552e.push(this.f101551d);
        this.f101551d = m14965M(c38336e);
        Boolean bool = c38336e.f101365p;
        z = (bool == null || bool.booleanValue()) ? true : true;
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(c38327b.f101335a, c38327b.f101336b);
            matrix.preScale(c38327b.f101337c, c38327b.f101338d);
        }
        Matrix matrix2 = c38336e.f101485o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVG.C38366n0 c38366n0 : c38336e.f101454i) {
            if ((c38366n0 instanceof SVG.AbstractC38360k0) && (m14924g0 = m14924g0((SVG.AbstractC38360k0) c38366n0, true)) != null) {
                path.op(m14924g0, Path.Op.UNION);
            }
        }
        if (this.f101551d.f101587a.f101372G != null) {
            if (c38336e.f101478h == null) {
                c38336e.f101478h = m14913m(path);
            }
            Path m14919j = m14919j(c38336e, c38336e.f101478h);
            if (m14919j != null) {
                path.op(m14919j, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f101551d = this.f101552e.pop();
        return path;
    }

    /* renamed from: j0 */
    private void m14918j0(SVG.AbstractC38360k0 abstractC38360k0) {
        m14916k0(abstractC38360k0, abstractC38360k0.f101478h);
    }

    /* renamed from: k */
    private List<C38393c> m14917k(SVG.C38371q c38371q) {
        float f;
        float f2;
        float f3;
        SVG.C38369p c38369p = c38371q.f101501o;
        float f4 = 0.0f;
        if (c38369p != null) {
            f = c38369p.m15002f(this);
        } else {
            f = 0.0f;
        }
        SVG.C38369p c38369p2 = c38371q.f101502p;
        if (c38369p2 != null) {
            f2 = c38369p2.m15001g(this);
        } else {
            f2 = 0.0f;
        }
        SVG.C38369p c38369p3 = c38371q.f101503q;
        if (c38369p3 != null) {
            f3 = c38369p3.m15002f(this);
        } else {
            f3 = 0.0f;
        }
        SVG.C38369p c38369p4 = c38371q.f101504r;
        if (c38369p4 != null) {
            f4 = c38369p4.m15001g(this);
        }
        float f5 = f4;
        ArrayList arrayList = new ArrayList(2);
        float f6 = f3 - f;
        float f7 = f5 - f2;
        arrayList.add(new C38393c(f, f2, f6, f7));
        arrayList.add(new C38393c(f3, f5, f6, f7));
        return arrayList;
    }

    /* renamed from: k0 */
    private void m14916k0(SVG.AbstractC38360k0 abstractC38360k0, SVG.C38327b c38327b) {
        if (this.f101551d.f101587a.f101374I != null) {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.f101548a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f101548a.saveLayer(null, paint2, 31);
            SVG.C38375s c38375s = (SVG.C38375s) this.f101550c.m15019u(this.f101551d.f101587a.f101374I);
            m14970J0(c38375s, abstractC38360k0, c38327b);
            this.f101548a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.f101548a.saveLayer(null, paint3, 31);
            m14970J0(c38375s, abstractC38360k0, c38327b);
            this.f101548a.restore();
            this.f101548a.restore();
        }
        m14954R0();
    }

    /* renamed from: l */
    private List<C38393c> m14915l(SVG.C38389z c38389z) {
        int length = c38389z.f101543o.length;
        int i = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = c38389z.f101543o;
        C38393c c38393c = new C38393c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f = 0.0f;
        float f2 = 0.0f;
        while (i < length) {
            float[] fArr2 = c38389z.f101543o;
            float f3 = fArr2[i];
            float f4 = fArr2[i + 1];
            c38393c.m14884a(f3, f4);
            arrayList.add(c38393c);
            i += 2;
            c38393c = new C38393c(f3, f4, f3 - c38393c.f101568a, f4 - c38393c.f101569b);
            f2 = f4;
            f = f3;
        }
        if (c38389z instanceof SVG.C38325a0) {
            float[] fArr3 = c38389z.f101543o;
            float f5 = fArr3[0];
            if (f != f5) {
                float f6 = fArr3[1];
                if (f2 != f6) {
                    c38393c.m14884a(f5, f6);
                    arrayList.add(c38393c);
                    C38393c c38393c2 = new C38393c(f5, f6, f5 - c38393c.f101568a, f6 - c38393c.f101569b);
                    c38393c2.m14883b((C38393c) arrayList.get(0));
                    arrayList.add(c38393c2);
                    arrayList.set(0, c38393c2);
                }
            }
        } else {
            arrayList.add(c38393c);
        }
        return arrayList;
    }

    /* renamed from: l0 */
    private void m14914l0(SVG.C38366n0 c38366n0, AbstractC38400j abstractC38400j) {
        float f;
        float f2;
        float f3;
        SVG.C38337e0.EnumC38343f m14961O;
        float m15002f;
        if (!abstractC38400j.mo14881a((SVG.AbstractC38388y0) c38366n0)) {
            return;
        }
        if (c38366n0 instanceof SVG.C38390z0) {
            m14952S0();
            m14966L0((SVG.C38390z0) c38366n0);
            m14954R0();
            return;
        }
        boolean z = true;
        if (c38366n0 instanceof SVG.C38382v0) {
            m14889y("TSpan render", new Object[0]);
            m14952S0();
            SVG.C38382v0 c38382v0 = (SVG.C38382v0) c38366n0;
            m14944W0(this.f101551d, c38382v0);
            if (m14989A()) {
                List<SVG.C38369p> list = c38382v0.f101331o;
                if (list == null || list.size() <= 0) {
                    z = false;
                }
                boolean z2 = abstractC38400j instanceof C38396f;
                float f4 = 0.0f;
                if (z2) {
                    if (!z) {
                        m15002f = ((C38396f) abstractC38400j).f101580b;
                    } else {
                        m15002f = c38382v0.f101331o.get(0).m15002f(this);
                    }
                    List<SVG.C38369p> list2 = c38382v0.f101332p;
                    if (list2 != null && list2.size() != 0) {
                        f2 = c38382v0.f101332p.get(0).m15001g(this);
                    } else {
                        f2 = ((C38396f) abstractC38400j).f101581c;
                    }
                    List<SVG.C38369p> list3 = c38382v0.f101333q;
                    if (list3 != null && list3.size() != 0) {
                        f3 = c38382v0.f101333q.get(0).m15002f(this);
                    } else {
                        f3 = 0.0f;
                    }
                    List<SVG.C38369p> list4 = c38382v0.f101334r;
                    if (list4 != null && list4.size() != 0) {
                        f4 = c38382v0.f101334r.get(0).m15001g(this);
                    }
                    f = f4;
                    f4 = m15002f;
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                }
                if (z && (m14961O = m14961O()) != SVG.C38337e0.EnumC38343f.Start) {
                    float m14911n = m14911n(c38382v0);
                    if (m14961O == SVG.C38337e0.EnumC38343f.Middle) {
                        m14911n /= 2.0f;
                    }
                    f4 -= m14911n;
                }
                m14903r((SVG.AbstractC38360k0) c38382v0.getTextRoot());
                if (z2) {
                    C38396f c38396f = (C38396f) abstractC38400j;
                    c38396f.f101580b = f4 + f3;
                    c38396f.f101581c = f2 + f;
                }
                boolean m14912m0 = m14912m0();
                m14981E(c38382v0, abstractC38400j);
                if (m14912m0) {
                    m14918j0(c38382v0);
                }
            }
            m14954R0();
        } else if (c38366n0 instanceof SVG.C38380u0) {
            m14952S0();
            SVG.C38380u0 c38380u0 = (SVG.C38380u0) c38366n0;
            m14944W0(this.f101551d, c38380u0);
            if (m14989A()) {
                m14903r((SVG.AbstractC38360k0) c38380u0.getTextRoot());
                SVG.C38366n0 m15019u = c38366n0.f101490a.m15019u(c38380u0.f101525o);
                if (m15019u != null && (m15019u instanceof SVG.AbstractC38388y0)) {
                    StringBuilder sb2 = new StringBuilder();
                    m14977G((SVG.AbstractC38388y0) m15019u, sb2);
                    if (sb2.length() > 0) {
                        abstractC38400j.mo14880b(sb2.toString());
                    }
                } else {
                    m14979F("Tref reference '%s' not found", c38380u0.f101525o);
                }
            }
            m14954R0();
        }
    }

    /* renamed from: m */
    private SVG.C38327b m14913m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.C38327b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* renamed from: m0 */
    private boolean m14912m0() {
        SVG.C38366n0 m15019u;
        if (!m14964M0()) {
            return false;
        }
        this.f101548a.saveLayerAlpha(null, m14893w(this.f101551d.f101587a.f101393o.floatValue()), 31);
        this.f101552e.push(this.f101551d);
        C38398h c38398h = new C38398h(this.f101551d);
        this.f101551d = c38398h;
        String str = c38398h.f101587a.f101374I;
        if (str != null && ((m15019u = this.f101550c.m15019u(str)) == null || !(m15019u instanceof SVG.C38375s))) {
            m14979F("Mask reference '%s' not found", this.f101551d.f101587a.f101374I);
            this.f101551d.f101587a.f101374I = null;
        }
        return true;
    }

    /* renamed from: n */
    private float m14911n(SVG.AbstractC38388y0 abstractC38388y0) {
        C38401k c38401k = new C38401k(this, null);
        m14981E(abstractC38388y0, c38401k);
        return c38401k.f101601b;
    }

    /* renamed from: n0 */
    private C38393c m14910n0(C38393c c38393c, C38393c c38393c2, C38393c c38393c3) {
        float m14983D = m14983D(c38393c2.f101570c, c38393c2.f101571d, c38393c2.f101568a - c38393c.f101568a, c38393c2.f101569b - c38393c.f101569b);
        if (m14983D == 0.0f) {
            m14983D = m14983D(c38393c2.f101570c, c38393c2.f101571d, c38393c3.f101568a - c38393c2.f101568a, c38393c3.f101569b - c38393c2.f101569b);
        }
        int i = (m14983D > 0.0f ? 1 : (m14983D == 0.0f ? 0 : -1));
        if (i > 0) {
            return c38393c2;
        }
        if (i == 0 && (c38393c2.f101570c > 0.0f || c38393c2.f101571d >= 0.0f)) {
            return c38393c2;
        }
        c38393c2.f101570c = -c38393c2.f101570c;
        c38393c2.f101571d = -c38393c2.f101571d;
        return c38393c2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0082, code lost:
        if (r12 != 8) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0074  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Matrix m14909o(p793n0.SVG.C38327b r10, p793n0.SVG.C38327b r11, p793n0.PreserveAspectRatio r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9b
            n0.e$a r1 = r12.m15049a()
            if (r1 != 0) goto Lf
            goto L9b
        Lf:
            float r1 = r10.f101337c
            float r2 = r11.f101337c
            float r1 = r1 / r2
            float r2 = r10.f101338d
            float r3 = r11.f101338d
            float r2 = r2 / r3
            float r3 = r11.f101335a
            float r3 = -r3
            float r4 = r11.f101336b
            float r4 = -r4
            n0.e r5 = p793n0.PreserveAspectRatio.f101293d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f101335a
            float r10 = r10.f101336b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            n0.e$b r5 = r12.m15048b()
            n0.e$b r6 = p793n0.PreserveAspectRatio.EnumC38322b.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f101337c
            float r2 = r2 / r1
            float r5 = r10.f101338d
            float r5 = r5 / r1
            int[] r6 = p793n0.SVGAndroidRenderer.C38391a.f101556a
            n0.e$a r7 = r12.m15049a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L62;
                case 2: goto L62;
                case 3: goto L62;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L67
        L5e:
            float r7 = r11.f101337c
            float r7 = r7 - r2
            goto L66
        L62:
            float r7 = r11.f101337c
            float r7 = r7 - r2
            float r7 = r7 / r8
        L66:
            float r3 = r3 - r7
        L67:
            n0.e$a r12 = r12.m15049a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L89
            r2 = 3
            if (r12 == r2) goto L85
            r2 = 5
            if (r12 == r2) goto L89
            r2 = 6
            if (r12 == r2) goto L85
            r2 = 7
            if (r12 == r2) goto L89
            r2 = 8
            if (r12 == r2) goto L85
            goto L8e
        L85:
            float r11 = r11.f101338d
            float r11 = r11 - r5
            goto L8d
        L89:
            float r11 = r11.f101338d
            float r11 = r11 - r5
            float r11 = r11 / r8
        L8d:
            float r4 = r4 - r11
        L8e:
            float r11 = r10.f101335a
            float r10 = r10.f101336b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p793n0.SVGAndroidRenderer.m14909o(n0.h$b, n0.h$b, n0.e):android.graphics.Matrix");
    }

    /* renamed from: o0 */
    private void m14908o0(SVG.C38333d c38333d) {
        m14889y("Circle render", new Object[0]);
        SVG.C38369p c38369p = c38333d.f101353q;
        if (c38369p != null && !c38369p.m14999i()) {
            m14944W0(this.f101551d, c38333d);
            if (!m14989A() || !m14940Y0()) {
                return;
            }
            Matrix matrix = c38333d.f101479n;
            if (matrix != null) {
                this.f101548a.concat(matrix);
            }
            Path m14941Y = m14941Y(c38333d);
            m14948U0(c38333d);
            m14903r(c38333d);
            m14907p(c38333d);
            boolean m14912m0 = m14912m0();
            if (this.f101551d.f101588b) {
                m14987B(c38333d, m14941Y);
            }
            if (this.f101551d.f101589c) {
                m14985C(m14941Y);
            }
            if (m14912m0) {
                m14918j0(c38333d);
            }
        }
    }

    /* renamed from: p */
    private void m14907p(SVG.AbstractC38360k0 abstractC38360k0) {
        m14905q(abstractC38360k0, abstractC38360k0.f101478h);
    }

    /* renamed from: p0 */
    private void m14906p0(SVG.C38355i c38355i) {
        m14889y("Ellipse render", new Object[0]);
        SVG.C38369p c38369p = c38355i.f101462q;
        if (c38369p != null && c38355i.f101463r != null && !c38369p.m14999i() && !c38355i.f101463r.m14999i()) {
            m14944W0(this.f101551d, c38355i);
            if (!m14989A() || !m14940Y0()) {
                return;
            }
            Matrix matrix = c38355i.f101479n;
            if (matrix != null) {
                this.f101548a.concat(matrix);
            }
            Path m14939Z = m14939Z(c38355i);
            m14948U0(c38355i);
            m14903r(c38355i);
            m14907p(c38355i);
            boolean m14912m0 = m14912m0();
            if (this.f101551d.f101588b) {
                m14987B(c38355i, m14939Z);
            }
            if (this.f101551d.f101589c) {
                m14985C(m14939Z);
            }
            if (m14912m0) {
                m14918j0(c38355i);
            }
        }
    }

    /* renamed from: q */
    private void m14905q(SVG.AbstractC38360k0 abstractC38360k0, SVG.C38327b c38327b) {
        Path m14919j;
        if (this.f101551d.f101587a.f101372G != null && (m14919j = m14919j(abstractC38360k0, c38327b)) != null) {
            this.f101548a.clipPath(m14919j);
        }
    }

    /* renamed from: q0 */
    private void m14904q0(SVG.C38363m c38363m) {
        m14889y("Group render", new Object[0]);
        m14944W0(this.f101551d, c38363m);
        if (!m14989A()) {
            return;
        }
        Matrix matrix = c38363m.f101485o;
        if (matrix != null) {
            this.f101548a.concat(matrix);
        }
        m14907p(c38363m);
        boolean m14912m0 = m14912m0();
        m14978F0(c38363m, true);
        if (m14912m0) {
            m14918j0(c38363m);
        }
        m14948U0(c38363m);
    }

    /* renamed from: r */
    private void m14903r(SVG.AbstractC38360k0 abstractC38360k0) {
        SVG.AbstractC38368o0 abstractC38368o0 = this.f101551d.f101587a.f101382c;
        if (abstractC38368o0 instanceof SVG.C38379u) {
            m14887z(true, abstractC38360k0.f101478h, (SVG.C38379u) abstractC38368o0);
        }
        SVG.AbstractC38368o0 abstractC38368o02 = this.f101551d.f101587a.f101385g;
        if (abstractC38368o02 instanceof SVG.C38379u) {
            m14887z(false, abstractC38360k0.f101478h, (SVG.C38379u) abstractC38368o02);
        }
    }

    /* renamed from: r0 */
    private void m14902r0(SVG.C38367o c38367o) {
        SVG.C38369p c38369p;
        String str;
        float f;
        float f2;
        int i = 0;
        m14889y("Image render", new Object[0]);
        SVG.C38369p c38369p2 = c38367o.f101495s;
        if (c38369p2 == null || c38369p2.m14999i() || (c38369p = c38367o.f101496t) == null || c38369p.m14999i() || (str = c38367o.f101492p) == null) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = c38367o.f101500o;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.f101294e;
        }
        Bitmap m14901s = m14901s(str);
        if (m14901s == null) {
            SVG.m15029k();
            return;
        }
        SVG.C38327b c38327b = new SVG.C38327b(0.0f, 0.0f, m14901s.getWidth(), m14901s.getHeight());
        m14944W0(this.f101551d, c38367o);
        if (!m14989A() || !m14940Y0()) {
            return;
        }
        Matrix matrix = c38367o.f101497u;
        if (matrix != null) {
            this.f101548a.concat(matrix);
        }
        SVG.C38369p c38369p3 = c38367o.f101493q;
        if (c38369p3 != null) {
            f = c38369p3.m15002f(this);
        } else {
            f = 0.0f;
        }
        SVG.C38369p c38369p4 = c38367o.f101494r;
        if (c38369p4 != null) {
            f2 = c38369p4.m15001g(this);
        } else {
            f2 = 0.0f;
        }
        this.f101551d.f101592f = new SVG.C38327b(f, f2, c38367o.f101495s.m15002f(this), c38367o.f101496t.m15002f(this));
        if (!this.f101551d.f101587a.f101402x.booleanValue()) {
            SVG.C38327b c38327b2 = this.f101551d.f101592f;
            m14960O0(c38327b2.f101335a, c38327b2.f101336b, c38327b2.f101337c, c38327b2.f101338d);
        }
        c38367o.f101478h = this.f101551d.f101592f;
        m14948U0(c38367o);
        m14907p(c38367o);
        boolean m14912m0 = m14912m0();
        m14942X0();
        this.f101548a.save();
        this.f101548a.concat(m14909o(this.f101551d.f101592f, c38327b, preserveAspectRatio));
        if (this.f101551d.f101587a.f101380O != SVG.C38337e0.EnumC38342e.optimizeSpeed) {
            i = 2;
        }
        this.f101548a.drawBitmap(m14901s, 0.0f, 0.0f, new Paint(i));
        this.f101548a.restore();
        if (m14912m0) {
            m14918j0(c38367o);
        }
    }

    /* renamed from: s */
    private Bitmap m14901s(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception e) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e);
            return null;
        }
    }

    /* renamed from: s0 */
    private void m14900s0(SVG.C38371q c38371q) {
        m14889y("Line render", new Object[0]);
        m14944W0(this.f101551d, c38371q);
        if (!m14989A() || !m14940Y0() || !this.f101551d.f101589c) {
            return;
        }
        Matrix matrix = c38371q.f101479n;
        if (matrix != null) {
            this.f101548a.concat(matrix);
        }
        Path m14936a0 = m14936a0(c38371q);
        m14948U0(c38371q);
        m14903r(c38371q);
        m14907p(c38371q);
        boolean m14912m0 = m14912m0();
        m14985C(m14936a0);
        m14972I0(c38371q);
        if (m14912m0) {
            m14918j0(c38371q);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0052, code lost:
        if (r6.equals("monospace") == false) goto L10;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Typeface m14899t(java.lang.String r6, java.lang.Integer r7, p793n0.SVG.C38337e0.EnumC38339b r8) {
        /*
            r5 = this;
            n0.h$e0$b r0 = p793n0.SVG.C38337e0.EnumC38339b.Italic
            r1 = 1
            r2 = 0
            if (r8 != r0) goto L8
            r8 = r1
            goto L9
        L8:
            r8 = r2
        L9:
            int r7 = r7.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            r3 = 3
            r4 = 2
            if (r7 <= r0) goto L19
            if (r8 == 0) goto L17
            r7 = r3
            goto L1e
        L17:
            r7 = r1
            goto L1e
        L19:
            if (r8 == 0) goto L1d
            r7 = r4
            goto L1e
        L1d:
            r7 = r2
        L1e:
            r6.hashCode()
            int r8 = r6.hashCode()
            r0 = -1
            switch(r8) {
                case -1536685117: goto L55;
                case -1431958525: goto L4c;
                case -1081737434: goto L41;
                case 109326717: goto L36;
                case 1126973893: goto L2b;
                default: goto L29;
            }
        L29:
            r1 = r0
            goto L5f
        L2b:
            java.lang.String r8 = "cursive"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L34
            goto L29
        L34:
            r1 = 4
            goto L5f
        L36:
            java.lang.String r8 = "serif"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L3f
            goto L29
        L3f:
            r1 = r3
            goto L5f
        L41:
            java.lang.String r8 = "fantasy"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L4a
            goto L29
        L4a:
            r1 = r4
            goto L5f
        L4c:
            java.lang.String r8 = "monospace"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L5f
            goto L29
        L55:
            java.lang.String r8 = "sans-serif"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L5e
            goto L29
        L5e:
            r1 = r2
        L5f:
            switch(r1) {
                case 0: goto L80;
                case 1: goto L79;
                case 2: goto L72;
                case 3: goto L6b;
                case 4: goto L64;
                default: goto L62;
            }
        L62:
            r6 = 0
            goto L86
        L64:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L86
        L6b:
            android.graphics.Typeface r6 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L86
        L72:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L86
        L79:
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            goto L86
        L80:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
        L86:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p793n0.SVGAndroidRenderer.m14899t(java.lang.String, java.lang.Integer, n0.h$e0$b):android.graphics.Typeface");
    }

    /* renamed from: t0 */
    private void m14898t0(SVG.C38381v c38381v) {
        m14889y("Path render", new Object[0]);
        if (c38381v.f101527o == null) {
            return;
        }
        m14944W0(this.f101551d, c38381v);
        if (!m14989A() || !m14940Y0()) {
            return;
        }
        C38398h c38398h = this.f101551d;
        if (!c38398h.f101589c && !c38398h.f101588b) {
            return;
        }
        Matrix matrix = c38381v.f101479n;
        if (matrix != null) {
            this.f101548a.concat(matrix);
        }
        Path m14882a = new C38394d(c38381v.f101527o).m14882a();
        if (c38381v.f101478h == null) {
            c38381v.f101478h = m14913m(m14882a);
        }
        m14948U0(c38381v);
        m14903r(c38381v);
        m14907p(c38381v);
        boolean m14912m0 = m14912m0();
        if (this.f101551d.f101588b) {
            m14882a.setFillType(m14949U());
            m14987B(c38381v, m14882a);
        }
        if (this.f101551d.f101589c) {
            m14985C(m14882a);
        }
        m14972I0(c38381v);
        if (m14912m0) {
            m14918j0(c38381v);
        }
    }

    /* renamed from: u */
    private void m14897u(SVG.C38366n0 c38366n0) {
        Boolean bool;
        if ((c38366n0 instanceof SVG.AbstractC38362l0) && (bool = ((SVG.AbstractC38362l0) c38366n0).f101481d) != null) {
            this.f101551d.f101594h = bool.booleanValue();
        }
    }

    /* renamed from: u0 */
    private void m14896u0(SVG.C38389z c38389z) {
        m14889y("PolyLine render", new Object[0]);
        m14944W0(this.f101551d, c38389z);
        if (!m14989A() || !m14940Y0()) {
            return;
        }
        C38398h c38398h = this.f101551d;
        if (!c38398h.f101589c && !c38398h.f101588b) {
            return;
        }
        Matrix matrix = c38389z.f101479n;
        if (matrix != null) {
            this.f101548a.concat(matrix);
        }
        if (c38389z.f101543o.length < 2) {
            return;
        }
        Path m14934b0 = m14934b0(c38389z);
        m14948U0(c38389z);
        m14934b0.setFillType(m14949U());
        m14903r(c38389z);
        m14907p(c38389z);
        boolean m14912m0 = m14912m0();
        if (this.f101551d.f101588b) {
            m14987B(c38389z, m14934b0);
        }
        if (this.f101551d.f101589c) {
            m14985C(m14934b0);
        }
        m14972I0(c38389z);
        if (m14912m0) {
            m14918j0(c38389z);
        }
    }

    /* renamed from: v */
    private static double m14895v(double d) {
        if (d < -1.0d) {
            return 3.141592653589793d;
        }
        if (d > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d);
    }

    /* renamed from: v0 */
    private void m14894v0(SVG.C38325a0 c38325a0) {
        m14889y("Polygon render", new Object[0]);
        m14944W0(this.f101551d, c38325a0);
        if (!m14989A() || !m14940Y0()) {
            return;
        }
        C38398h c38398h = this.f101551d;
        if (!c38398h.f101589c && !c38398h.f101588b) {
            return;
        }
        Matrix matrix = c38325a0.f101479n;
        if (matrix != null) {
            this.f101548a.concat(matrix);
        }
        if (c38325a0.f101543o.length < 2) {
            return;
        }
        Path m14934b0 = m14934b0(c38325a0);
        m14948U0(c38325a0);
        m14903r(c38325a0);
        m14907p(c38325a0);
        boolean m14912m0 = m14912m0();
        if (this.f101551d.f101588b) {
            m14987B(c38325a0, m14934b0);
        }
        if (this.f101551d.f101589c) {
            m14985C(m14934b0);
        }
        m14972I0(c38325a0);
        if (m14912m0) {
            m14918j0(c38325a0);
        }
    }

    /* renamed from: w */
    private static int m14893w(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    /* renamed from: w0 */
    private void m14892w0(SVG.C38328b0 c38328b0) {
        m14889y("Rect render", new Object[0]);
        SVG.C38369p c38369p = c38328b0.f101341q;
        if (c38369p != null && c38328b0.f101342r != null && !c38369p.m14999i() && !c38328b0.f101342r.m14999i()) {
            m14944W0(this.f101551d, c38328b0);
            if (!m14989A() || !m14940Y0()) {
                return;
            }
            Matrix matrix = c38328b0.f101479n;
            if (matrix != null) {
                this.f101548a.concat(matrix);
            }
            Path m14932c0 = m14932c0(c38328b0);
            m14948U0(c38328b0);
            m14903r(c38328b0);
            m14907p(c38328b0);
            boolean m14912m0 = m14912m0();
            if (this.f101551d.f101588b) {
                m14987B(c38328b0, m14932c0);
            }
            if (this.f101551d.f101589c) {
                m14985C(m14932c0);
            }
            if (m14912m0) {
                m14918j0(c38328b0);
            }
        }
    }

    /* renamed from: x */
    private static int m14891x(int i, float f) {
        int i2 = 255;
        int round = Math.round(((i >> 24) & 255) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (i2 << 24);
    }

    /* renamed from: x0 */
    private void m14890x0(SVG.C38349f0 c38349f0) {
        m14886z0(c38349f0, m14926f0(c38349f0.f101448q, c38349f0.f101449r, c38349f0.f101450s, c38349f0.f101451t), c38349f0.f101516p, c38349f0.f101500o);
    }

    /* renamed from: y0 */
    private void m14888y0(SVG.C38349f0 c38349f0, SVG.C38327b c38327b) {
        m14886z0(c38349f0, c38327b, c38349f0.f101516p, c38349f0.f101500o);
    }

    /* renamed from: z */
    private void m14887z(boolean z, SVG.C38327b c38327b, SVG.C38379u c38379u) {
        String str;
        SVG.C38366n0 m15019u = this.f101550c.m15019u(c38379u.f101523b);
        if (m15019u == null) {
            Object[] objArr = new Object[2];
            if (z) {
                str = "Fill";
            } else {
                str = "Stroke";
            }
            objArr[0] = str;
            objArr[1] = c38379u.f101523b;
            m14979F("%s reference '%s' not found", objArr);
            SVG.AbstractC38368o0 abstractC38368o0 = c38379u.f101524c;
            if (abstractC38368o0 != null) {
                m14958P0(this.f101551d, z, abstractC38368o0);
            } else if (z) {
                this.f101551d.f101588b = false;
            } else {
                this.f101551d.f101589c = false;
            }
        } else if (m15019u instanceof SVG.C38364m0) {
            m14943X(z, c38327b, (SVG.C38364m0) m15019u);
        } else if (m15019u instanceof SVG.C38372q0) {
            m14928e0(z, c38327b, (SVG.C38372q0) m15019u);
        } else if (m15019u instanceof SVG.C38331c0) {
            m14956Q0(z, (SVG.C38331c0) m15019u);
        }
    }

    /* renamed from: z0 */
    private void m14886z0(SVG.C38349f0 c38349f0, SVG.C38327b c38327b, SVG.C38327b c38327b2, PreserveAspectRatio preserveAspectRatio) {
        m14889y("Svg render", new Object[0]);
        if (c38327b.f101337c != 0.0f && c38327b.f101338d != 0.0f) {
            if (preserveAspectRatio == null && (preserveAspectRatio = c38349f0.f101500o) == null) {
                preserveAspectRatio = PreserveAspectRatio.f101294e;
            }
            m14944W0(this.f101551d, c38349f0);
            if (!m14989A()) {
                return;
            }
            C38398h c38398h = this.f101551d;
            c38398h.f101592f = c38327b;
            if (!c38398h.f101587a.f101402x.booleanValue()) {
                SVG.C38327b c38327b3 = this.f101551d.f101592f;
                m14960O0(c38327b3.f101335a, c38327b3.f101336b, c38327b3.f101337c, c38327b3.f101338d);
            }
            m14905q(c38349f0, this.f101551d.f101592f);
            if (c38327b2 != null) {
                this.f101548a.concat(m14909o(this.f101551d.f101592f, c38327b2, preserveAspectRatio));
                this.f101551d.f101593g = c38349f0.f101516p;
            } else {
                Canvas canvas = this.f101548a;
                SVG.C38327b c38327b4 = this.f101551d.f101592f;
                canvas.translate(c38327b4.f101335a, c38327b4.f101336b);
            }
            boolean m14912m0 = m14912m0();
            m14942X0();
            m14978F0(c38349f0, true);
            if (m14912m0) {
                m14918j0(c38349f0);
            }
            m14948U0(c38349f0);
        }
    }

    /* renamed from: G0 */
    public void m14976G0(SVG svg, RenderOptions renderOptions) {
        SVG.C38327b c38327b;
        SVG.C38327b c38327b2;
        PreserveAspectRatio preserveAspectRatio;
        if (renderOptions != null) {
            this.f101550c = svg;
            SVG.C38349f0 m15024p = svg.m15024p();
            if (m15024p == null) {
                m14938Z0("Nothing to render. Document is empty.", new Object[0]);
                return;
            }
            if (renderOptions.m15043e()) {
                SVG.AbstractC38362l0 m15031i = this.f101550c.m15031i(renderOptions.f101321e);
                if (m15031i != null && (m15031i instanceof SVG.C38350f1)) {
                    SVG.C38350f1 c38350f1 = (SVG.C38350f1) m15031i;
                    c38327b2 = c38350f1.f101516p;
                    if (c38327b2 == null) {
                        Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", renderOptions.f101321e));
                        return;
                    }
                    preserveAspectRatio = c38350f1.f101500o;
                } else {
                    Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", renderOptions.f101321e));
                    return;
                }
            } else {
                if (renderOptions.m15042f()) {
                    c38327b = renderOptions.f101320d;
                } else {
                    c38327b = m15024p.f101516p;
                }
                c38327b2 = c38327b;
                if (renderOptions.m15045c()) {
                    preserveAspectRatio = renderOptions.f101318b;
                } else {
                    preserveAspectRatio = m15024p.f101500o;
                }
            }
            if (renderOptions.m15046b()) {
                svg.m15039a(renderOptions.f101317a);
            }
            if (renderOptions.m15044d()) {
                CSSParser.C38315q c38315q = new CSSParser.C38315q();
                this.f101555h = c38315q;
                c38315q.f101276a = svg.m15031i(renderOptions.f101319c);
            }
            m14962N0();
            m14897u(m15024p);
            m14952S0();
            SVG.C38327b c38327b3 = new SVG.C38327b(renderOptions.f101322f);
            SVG.C38369p c38369p = m15024p.f101450s;
            if (c38369p != null) {
                c38327b3.f101337c = c38369p.m15003e(this, c38327b3.f101337c);
            }
            SVG.C38369p c38369p2 = m15024p.f101451t;
            if (c38369p2 != null) {
                c38327b3.f101338d = c38369p2.m15003e(this, c38327b3.f101338d);
            }
            m14886z0(m15024p, c38327b3, c38327b2, preserveAspectRatio);
            m14954R0();
            if (renderOptions.m15046b()) {
                svg.m15038b();
                return;
            }
            return;
        }
        throw new NullPointerException("renderOptions shouldn't be null");
    }

    /* renamed from: Q */
    public float m14957Q() {
        return this.f101551d.f101590d.getTextSize();
    }

    /* renamed from: R */
    public float m14955R() {
        return this.f101551d.f101590d.getTextSize() / 2.0f;
    }

    /* renamed from: S */
    public SVG.C38327b m14953S() {
        C38398h c38398h = this.f101551d;
        SVG.C38327b c38327b = c38398h.f101593g;
        if (c38327b != null) {
            return c38327b;
        }
        return c38398h.f101592f;
    }

    /* renamed from: T */
    public float m14951T() {
        return this.f101549b;
    }

    /* compiled from: SVGAndroidRenderer.java */
    /* renamed from: n0.i$k */
    /* loaded from: classes11.dex */
    public class C38401k extends AbstractC38400j {

        /* renamed from: b */
        float f101601b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C38401k() {
            super(r2, null);
            SVGAndroidRenderer.this = r2;
            this.f101601b = 0.0f;
        }

        @Override // p793n0.SVGAndroidRenderer.AbstractC38400j
        /* renamed from: b */
        public void mo14880b(String str) {
            this.f101601b += SVGAndroidRenderer.this.f101551d.f101590d.measureText(str);
        }

        /* synthetic */ C38401k(SVGAndroidRenderer sVGAndroidRenderer, C38391a c38391a) {
            this();
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    /* renamed from: n0.i$h */
    /* loaded from: classes11.dex */
    public class C38398h {

        /* renamed from: a */
        SVG.C38337e0 f101587a;

        /* renamed from: b */
        boolean f101588b;

        /* renamed from: c */
        boolean f101589c;

        /* renamed from: d */
        Paint f101590d;

        /* renamed from: e */
        Paint f101591e;

        /* renamed from: f */
        SVG.C38327b f101592f;

        /* renamed from: g */
        SVG.C38327b f101593g;

        /* renamed from: h */
        boolean f101594h;

        C38398h() {
            SVGAndroidRenderer.this = r4;
            Paint paint = new Paint();
            this.f101590d = paint;
            paint.setFlags(193);
            this.f101590d.setHinting(0);
            this.f101590d.setStyle(Paint.Style.FILL);
            this.f101590d.setTypeface(Typeface.DEFAULT);
            Paint paint2 = new Paint();
            this.f101591e = paint2;
            paint2.setFlags(193);
            this.f101591e.setHinting(0);
            this.f101591e.setStyle(Paint.Style.STROKE);
            this.f101591e.setTypeface(Typeface.DEFAULT);
            this.f101587a = SVG.C38337e0.m15009b();
        }

        C38398h(C38398h c38398h) {
            SVGAndroidRenderer.this = r2;
            this.f101588b = c38398h.f101588b;
            this.f101589c = c38398h.f101589c;
            this.f101590d = new Paint(c38398h.f101590d);
            this.f101591e = new Paint(c38398h.f101591e);
            SVG.C38327b c38327b = c38398h.f101592f;
            if (c38327b != null) {
                this.f101592f = new SVG.C38327b(c38327b);
            }
            SVG.C38327b c38327b2 = c38398h.f101593g;
            if (c38327b2 != null) {
                this.f101593g = new SVG.C38327b(c38327b2);
            }
            this.f101594h = c38398h.f101594h;
            try {
                this.f101587a = (SVG.C38337e0) c38398h.f101587a.clone();
            } catch (CloneNotSupportedException e) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
                this.f101587a = SVG.C38337e0.m15009b();
            }
        }
    }

    /* renamed from: y */
    public static void m14889y(String str, Object... objArr) {
    }
}
