package p793n0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioiic.C32664c2oc2i;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p793n0.CSSParser;

/* renamed from: n0.h */
/* loaded from: classes11.dex */
public class SVG {

    /* renamed from: g */
    private static boolean f101323g = true;

    /* renamed from: a */
    private C38349f0 f101324a = null;

    /* renamed from: b */
    private String f101325b = "";

    /* renamed from: c */
    private String f101326c = "";

    /* renamed from: d */
    private float f101327d = 96.0f;

    /* renamed from: e */
    private CSSParser.C38316r f101328e = new CSSParser.C38316r();

    /* renamed from: f */
    private Map<String, AbstractC38362l0> f101329f = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$a */
    /* loaded from: classes11.dex */
    public static /* synthetic */ class C38324a {

        /* renamed from: a */
        static final /* synthetic */ int[] f101330a;

        static {
            int[] iArr = new int[EnumC38335d1.values().length];
            f101330a = iArr;
            try {
                iArr[EnumC38335d1.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f101330a[EnumC38335d1.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f101330a[EnumC38335d1.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f101330a[EnumC38335d1.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f101330a[EnumC38335d1.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f101330a[EnumC38335d1.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f101330a[EnumC38335d1.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f101330a[EnumC38335d1.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f101330a[EnumC38335d1.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$a0 */
    /* loaded from: classes11.dex */
    public static class C38325a0 extends C38389z {
        @Override // p793n0.SVG.C38389z, p793n0.SVG.C38366n0
        /* renamed from: b */
        String mo14991b() {
            return "polygon";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$a1 */
    /* loaded from: classes11.dex */
    public static abstract class AbstractC38326a1 extends AbstractC38388y0 {

        /* renamed from: o */
        List<C38369p> f101331o;

        /* renamed from: p */
        List<C38369p> f101332p;

        /* renamed from: q */
        List<C38369p> f101333q;

        /* renamed from: r */
        List<C38369p> f101334r;

        AbstractC38326a1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$b0 */
    /* loaded from: classes11.dex */
    public static class C38328b0 extends AbstractC38361l {

        /* renamed from: o */
        C38369p f101339o;

        /* renamed from: p */
        C38369p f101340p;

        /* renamed from: q */
        C38369p f101341q;

        /* renamed from: r */
        C38369p f101342r;

        /* renamed from: s */
        C38369p f101343s;

        /* renamed from: t */
        C38369p f101344t;

        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        String mo14991b() {
            return "rect";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$b1 */
    /* loaded from: classes11.dex */
    public interface InterfaceC38329b1 {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$c */
    /* loaded from: classes11.dex */
    public static class C38330c {

        /* renamed from: a */
        C38369p f101345a;

        /* renamed from: b */
        C38369p f101346b;

        /* renamed from: c */
        C38369p f101347c;

        /* renamed from: d */
        C38369p f101348d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C38330c(C38369p c38369p, C38369p c38369p2, C38369p c38369p3, C38369p c38369p4) {
            this.f101345a = c38369p;
            this.f101346b = c38369p2;
            this.f101347c = c38369p3;
            this.f101348d = c38369p4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$c1 */
    /* loaded from: classes11.dex */
    public static class C38332c1 extends C38366n0 implements InterfaceC38386x0 {

        /* renamed from: c */
        String f101349c;

        /* renamed from: d */
        private InterfaceC38329b1 f101350d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C38332c1(String str) {
            this.f101349c = str;
        }

        @Override // p793n0.SVG.InterfaceC38386x0
        public InterfaceC38329b1 getTextRoot() {
            return this.f101350d;
        }

        public String toString() {
            return "TextChild: '" + this.f101349c + "'";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$d */
    /* loaded from: classes11.dex */
    public static class C38333d extends AbstractC38361l {

        /* renamed from: o */
        C38369p f101351o;

        /* renamed from: p */
        C38369p f101352p;

        /* renamed from: q */
        C38369p f101353q;

        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        String mo14991b() {
            return "circle";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$d1 */
    /* loaded from: classes11.dex */
    public enum EnumC38335d1 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$e */
    /* loaded from: classes11.dex */
    public static class C38336e extends C38363m implements InterfaceC38377t {

        /* renamed from: p */
        Boolean f101365p;

        @Override // p793n0.SVG.C38363m, p793n0.SVG.C38366n0
        /* renamed from: b */
        String mo14991b() {
            return "clipPath";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$e0 */
    /* loaded from: classes11.dex */
    public static class C38337e0 implements Cloneable {

        /* renamed from: A */
        String f101366A;

        /* renamed from: B */
        String f101367B;

        /* renamed from: C */
        Boolean f101368C;

        /* renamed from: D */
        Boolean f101369D;

        /* renamed from: E */
        AbstractC38368o0 f101370E;

        /* renamed from: F */
        Float f101371F;

        /* renamed from: G */
        String f101372G;

        /* renamed from: H */
        EnumC38338a f101373H;

        /* renamed from: I */
        String f101374I;

        /* renamed from: J */
        AbstractC38368o0 f101375J;

        /* renamed from: K */
        Float f101376K;

        /* renamed from: L */
        AbstractC38368o0 f101377L;

        /* renamed from: M */
        Float f101378M;

        /* renamed from: N */
        EnumC38346i f101379N;

        /* renamed from: O */
        EnumC38342e f101380O;

        /* renamed from: b */
        long f101381b = 0;

        /* renamed from: c */
        AbstractC38368o0 f101382c;

        /* renamed from: d */
        EnumC38338a f101383d;

        /* renamed from: f */
        Float f101384f;

        /* renamed from: g */
        AbstractC38368o0 f101385g;

        /* renamed from: h */
        Float f101386h;

        /* renamed from: i */
        C38369p f101387i;

        /* renamed from: j */
        EnumC38340c f101388j;

        /* renamed from: k */
        EnumC38341d f101389k;

        /* renamed from: l */
        Float f101390l;

        /* renamed from: m */
        C38369p[] f101391m;

        /* renamed from: n */
        C38369p f101392n;

        /* renamed from: o */
        Float f101393o;

        /* renamed from: p */
        C38348f f101394p;

        /* renamed from: q */
        List<String> f101395q;

        /* renamed from: r */
        C38369p f101396r;

        /* renamed from: s */
        Integer f101397s;

        /* renamed from: t */
        EnumC38339b f101398t;

        /* renamed from: u */
        EnumC38344g f101399u;

        /* renamed from: v */
        EnumC38345h f101400v;

        /* renamed from: w */
        EnumC38343f f101401w;

        /* renamed from: x */
        Boolean f101402x;

        /* renamed from: y */
        C38330c f101403y;

        /* renamed from: z */
        String f101404z;

        /* compiled from: SVG.java */
        /* renamed from: n0.h$e0$a */
        /* loaded from: classes11.dex */
        public enum EnumC38338a {
            NonZero,
            EvenOdd
        }

        /* compiled from: SVG.java */
        /* renamed from: n0.h$e0$b */
        /* loaded from: classes11.dex */
        public enum EnumC38339b {
            Normal,
            Italic,
            Oblique
        }

        /* compiled from: SVG.java */
        /* renamed from: n0.h$e0$c */
        /* loaded from: classes11.dex */
        public enum EnumC38340c {
            Butt,
            Round,
            Square
        }

        /* compiled from: SVG.java */
        /* renamed from: n0.h$e0$d */
        /* loaded from: classes11.dex */
        public enum EnumC38341d {
            Miter,
            Round,
            Bevel
        }

        /* compiled from: SVG.java */
        /* renamed from: n0.h$e0$e */
        /* loaded from: classes11.dex */
        public enum EnumC38342e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        /* compiled from: SVG.java */
        /* renamed from: n0.h$e0$f */
        /* loaded from: classes11.dex */
        public enum EnumC38343f {
            Start,
            Middle,
            End
        }

        /* compiled from: SVG.java */
        /* renamed from: n0.h$e0$g */
        /* loaded from: classes11.dex */
        public enum EnumC38344g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        /* compiled from: SVG.java */
        /* renamed from: n0.h$e0$h */
        /* loaded from: classes11.dex */
        public enum EnumC38345h {
            LTR,
            RTL
        }

        /* compiled from: SVG.java */
        /* renamed from: n0.h$e0$i */
        /* loaded from: classes11.dex */
        public enum EnumC38346i {
            None,
            NonScalingStroke
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public static C38337e0 m15009b() {
            C38337e0 c38337e0 = new C38337e0();
            c38337e0.f101381b = -1L;
            C38348f c38348f = C38348f.f101445c;
            c38337e0.f101382c = c38348f;
            EnumC38338a enumC38338a = EnumC38338a.NonZero;
            c38337e0.f101383d = enumC38338a;
            Float valueOf = Float.valueOf(1.0f);
            c38337e0.f101384f = valueOf;
            c38337e0.f101385g = null;
            c38337e0.f101386h = valueOf;
            c38337e0.f101387i = new C38369p(1.0f);
            c38337e0.f101388j = EnumC38340c.Butt;
            c38337e0.f101389k = EnumC38341d.Miter;
            c38337e0.f101390l = Float.valueOf(4.0f);
            c38337e0.f101391m = null;
            c38337e0.f101392n = new C38369p(0.0f);
            c38337e0.f101393o = valueOf;
            c38337e0.f101394p = c38348f;
            c38337e0.f101395q = null;
            c38337e0.f101396r = new C38369p(12.0f, EnumC38335d1.pt);
            c38337e0.f101397s = 400;
            c38337e0.f101398t = EnumC38339b.Normal;
            c38337e0.f101399u = EnumC38344g.None;
            c38337e0.f101400v = EnumC38345h.LTR;
            c38337e0.f101401w = EnumC38343f.Start;
            Boolean bool = Boolean.TRUE;
            c38337e0.f101402x = bool;
            c38337e0.f101403y = null;
            c38337e0.f101404z = null;
            c38337e0.f101366A = null;
            c38337e0.f101367B = null;
            c38337e0.f101368C = bool;
            c38337e0.f101369D = bool;
            c38337e0.f101370E = c38348f;
            c38337e0.f101371F = valueOf;
            c38337e0.f101372G = null;
            c38337e0.f101373H = enumC38338a;
            c38337e0.f101374I = null;
            c38337e0.f101375J = null;
            c38337e0.f101376K = valueOf;
            c38337e0.f101377L = null;
            c38337e0.f101378M = valueOf;
            c38337e0.f101379N = EnumC38346i.None;
            c38337e0.f101380O = EnumC38342e.auto;
            return c38337e0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public void m15008c(boolean z) {
            Boolean bool = Boolean.TRUE;
            this.f101368C = bool;
            if (!z) {
                bool = Boolean.FALSE;
            }
            this.f101402x = bool;
            this.f101403y = null;
            this.f101372G = null;
            this.f101393o = Float.valueOf(1.0f);
            this.f101370E = C38348f.f101445c;
            this.f101371F = Float.valueOf(1.0f);
            this.f101374I = null;
            this.f101375J = null;
            this.f101376K = Float.valueOf(1.0f);
            this.f101377L = null;
            this.f101378M = Float.valueOf(1.0f);
            this.f101379N = EnumC38346i.None;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Object clone() throws CloneNotSupportedException {
            C38337e0 c38337e0 = (C38337e0) super.clone();
            C38369p[] c38369pArr = this.f101391m;
            if (c38369pArr != null) {
                c38337e0.f101391m = (C38369p[]) c38369pArr.clone();
            }
            return c38337e0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$e1 */
    /* loaded from: classes11.dex */
    public static class C38347e1 extends C38363m {

        /* renamed from: p */
        String f101440p;

        /* renamed from: q */
        C38369p f101441q;

        /* renamed from: r */
        C38369p f101442r;

        /* renamed from: s */
        C38369p f101443s;

        /* renamed from: t */
        C38369p f101444t;

        @Override // p793n0.SVG.C38363m, p793n0.SVG.C38366n0
        /* renamed from: b */
        String mo14991b() {
            return "use";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$f */
    /* loaded from: classes11.dex */
    public static class C38348f extends AbstractC38368o0 {

        /* renamed from: c */
        static final C38348f f101445c = new C38348f(ViewCompat.MEASURED_STATE_MASK);

        /* renamed from: d */
        static final C38348f f101446d = new C38348f(0);

        /* renamed from: b */
        int f101447b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C38348f(int i) {
            this.f101447b = i;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f101447b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$f0 */
    /* loaded from: classes11.dex */
    public static class C38349f0 extends AbstractC38374r0 {

        /* renamed from: q */
        C38369p f101448q;

        /* renamed from: r */
        C38369p f101449r;

        /* renamed from: s */
        C38369p f101450s;

        /* renamed from: t */
        C38369p f101451t;

        /* renamed from: u */
        public String f101452u;

        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        String mo14991b() {
            return "svg";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$f1 */
    /* loaded from: classes11.dex */
    public static class C38350f1 extends AbstractC38374r0 implements InterfaceC38377t {
        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        String mo14991b() {
            return "view";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$g */
    /* loaded from: classes11.dex */
    public static class C38351g extends AbstractC38368o0 {

        /* renamed from: b */
        private static C38351g f101453b = new C38351g();

        private C38351g() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public static C38351g m15007b() {
            return f101453b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$g0 */
    /* loaded from: classes11.dex */
    public interface InterfaceC38352g0 {
        String getRequiredExtensions();

        Set<String> getRequiredFeatures();

        Set<String> getRequiredFonts();

        Set<String> getRequiredFormats();

        Set<String> getSystemLanguage();

        void setRequiredExtensions(String str);

        void setRequiredFeatures(Set<String> set);

        void setRequiredFonts(Set<String> set);

        void setRequiredFormats(Set<String> set);

        void setSystemLanguage(Set<String> set);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$h */
    /* loaded from: classes11.dex */
    public static class C38353h extends C38363m implements InterfaceC38377t {
        @Override // p793n0.SVG.C38363m, p793n0.SVG.C38366n0
        /* renamed from: b */
        String mo14991b() {
            return "defs";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$h0 */
    /* loaded from: classes11.dex */
    public static abstract class AbstractC38354h0 extends AbstractC38360k0 implements InterfaceC38358j0, InterfaceC38352g0 {

        /* renamed from: i */
        List<C38366n0> f101454i = new ArrayList();

        /* renamed from: j */
        Set<String> f101455j = null;

        /* renamed from: k */
        String f101456k = null;

        /* renamed from: l */
        Set<String> f101457l = null;

        /* renamed from: m */
        Set<String> f101458m = null;

        /* renamed from: n */
        Set<String> f101459n = null;

        AbstractC38354h0() {
        }

        @Override // p793n0.SVG.InterfaceC38358j0
        /* renamed from: a */
        public void mo14992a(C38366n0 c38366n0) throws SVGParseException {
            this.f101454i.add(c38366n0);
        }

        @Override // p793n0.SVG.InterfaceC38358j0
        public List<C38366n0> getChildren() {
            return this.f101454i;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public String getRequiredExtensions() {
            return this.f101456k;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public Set<String> getRequiredFeatures() {
            return this.f101455j;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public Set<String> getRequiredFonts() {
            return this.f101459n;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public Set<String> getRequiredFormats() {
            return this.f101458m;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public Set<String> getSystemLanguage() {
            return null;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public void setRequiredExtensions(String str) {
            this.f101456k = str;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public void setRequiredFeatures(Set<String> set) {
            this.f101455j = set;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public void setRequiredFonts(Set<String> set) {
            this.f101459n = set;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public void setRequiredFormats(Set<String> set) {
            this.f101458m = set;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public void setSystemLanguage(Set<String> set) {
            this.f101457l = set;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$i */
    /* loaded from: classes11.dex */
    public static class C38355i extends AbstractC38361l {

        /* renamed from: o */
        C38369p f101460o;

        /* renamed from: p */
        C38369p f101461p;

        /* renamed from: q */
        C38369p f101462q;

        /* renamed from: r */
        C38369p f101463r;

        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        String mo14991b() {
            return "ellipse";
        }
    }

    /* compiled from: SVG.java */
    /* renamed from: n0.h$i0 */
    /* loaded from: classes11.dex */
    static abstract class AbstractC38356i0 extends AbstractC38360k0 implements InterfaceC38352g0 {

        /* renamed from: i */
        Set<String> f101464i = null;

        /* renamed from: j */
        String f101465j = null;

        /* renamed from: k */
        Set<String> f101466k = null;

        /* renamed from: l */
        Set<String> f101467l = null;

        /* renamed from: m */
        Set<String> f101468m = null;

        AbstractC38356i0() {
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public String getRequiredExtensions() {
            return this.f101465j;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public Set<String> getRequiredFeatures() {
            return this.f101464i;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public Set<String> getRequiredFonts() {
            return this.f101468m;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public Set<String> getRequiredFormats() {
            return this.f101467l;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public Set<String> getSystemLanguage() {
            return this.f101466k;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public void setRequiredExtensions(String str) {
            this.f101465j = str;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public void setRequiredFeatures(Set<String> set) {
            this.f101464i = set;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public void setRequiredFonts(Set<String> set) {
            this.f101468m = set;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public void setRequiredFormats(Set<String> set) {
            this.f101467l = set;
        }

        @Override // p793n0.SVG.InterfaceC38352g0
        public void setSystemLanguage(Set<String> set) {
            this.f101466k = set;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$j */
    /* loaded from: classes11.dex */
    public static abstract class AbstractC38357j extends AbstractC38362l0 implements InterfaceC38358j0 {

        /* renamed from: h */
        List<C38366n0> f101469h = new ArrayList();

        /* renamed from: i */
        Boolean f101470i;

        /* renamed from: j */
        Matrix f101471j;

        /* renamed from: k */
        EnumC38359k f101472k;

        /* renamed from: l */
        String f101473l;

        AbstractC38357j() {
        }

        @Override // p793n0.SVG.InterfaceC38358j0
        /* renamed from: a */
        public void mo14992a(C38366n0 c38366n0) throws SVGParseException {
            if (c38366n0 instanceof C38334d0) {
                this.f101469h.add(c38366n0);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + c38366n0 + " elements.");
        }

        @Override // p793n0.SVG.InterfaceC38358j0
        public List<C38366n0> getChildren() {
            return this.f101469h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$j0 */
    /* loaded from: classes11.dex */
    public interface InterfaceC38358j0 {
        /* renamed from: a */
        void mo14992a(C38366n0 c38366n0) throws SVGParseException;

        List<C38366n0> getChildren();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$k */
    /* loaded from: classes11.dex */
    public enum EnumC38359k {
        pad,
        reflect,
        repeat
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$k0 */
    /* loaded from: classes11.dex */
    public static abstract class AbstractC38360k0 extends AbstractC38362l0 {

        /* renamed from: h */
        C38327b f101478h = null;

        AbstractC38360k0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$l */
    /* loaded from: classes11.dex */
    public static abstract class AbstractC38361l extends AbstractC38356i0 implements InterfaceC38365n {

        /* renamed from: n */
        Matrix f101479n;

        AbstractC38361l() {
        }

        @Override // p793n0.SVG.InterfaceC38365n
        public void setTransform(Matrix matrix) {
            this.f101479n = matrix;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$l0 */
    /* loaded from: classes11.dex */
    public static abstract class AbstractC38362l0 extends C38366n0 {

        /* renamed from: c */
        String f101480c = null;

        /* renamed from: d */
        Boolean f101481d = null;

        /* renamed from: e */
        C38337e0 f101482e = null;

        /* renamed from: f */
        C38337e0 f101483f = null;

        /* renamed from: g */
        List<String> f101484g = null;

        AbstractC38362l0() {
        }

        public String toString() {
            return mo14991b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$m */
    /* loaded from: classes11.dex */
    public static class C38363m extends AbstractC38354h0 implements InterfaceC38365n {

        /* renamed from: o */
        Matrix f101485o;

        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        String mo14991b() {
            return "group";
        }

        @Override // p793n0.SVG.InterfaceC38365n
        public void setTransform(Matrix matrix) {
            this.f101485o = matrix;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$m0 */
    /* loaded from: classes11.dex */
    public static class C38364m0 extends AbstractC38357j {

        /* renamed from: m */
        C38369p f101486m;

        /* renamed from: n */
        C38369p f101487n;

        /* renamed from: o */
        C38369p f101488o;

        /* renamed from: p */
        C38369p f101489p;

        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        String mo14991b() {
            return "linearGradient";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$n */
    /* loaded from: classes11.dex */
    public interface InterfaceC38365n {
        void setTransform(Matrix matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$n0 */
    /* loaded from: classes11.dex */
    public static class C38366n0 {

        /* renamed from: a */
        SVG f101490a;

        /* renamed from: b */
        InterfaceC38358j0 f101491b;

        C38366n0() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo14991b() {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$o */
    /* loaded from: classes11.dex */
    public static class C38367o extends AbstractC38370p0 implements InterfaceC38365n {

        /* renamed from: p */
        String f101492p;

        /* renamed from: q */
        C38369p f101493q;

        /* renamed from: r */
        C38369p f101494r;

        /* renamed from: s */
        C38369p f101495s;

        /* renamed from: t */
        C38369p f101496t;

        /* renamed from: u */
        Matrix f101497u;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        public String mo14991b() {
            return "image";
        }

        @Override // p793n0.SVG.InterfaceC38365n
        public void setTransform(Matrix matrix) {
            this.f101497u = matrix;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$o0 */
    /* loaded from: classes11.dex */
    public static abstract class AbstractC38368o0 implements Cloneable {
        AbstractC38368o0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$p0 */
    /* loaded from: classes11.dex */
    public static abstract class AbstractC38370p0 extends AbstractC38354h0 {

        /* renamed from: o */
        PreserveAspectRatio f101500o = null;

        AbstractC38370p0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$q */
    /* loaded from: classes11.dex */
    public static class C38371q extends AbstractC38361l {

        /* renamed from: o */
        C38369p f101501o;

        /* renamed from: p */
        C38369p f101502p;

        /* renamed from: q */
        C38369p f101503q;

        /* renamed from: r */
        C38369p f101504r;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        public String mo14991b() {
            return "line";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$q0 */
    /* loaded from: classes11.dex */
    public static class C38372q0 extends AbstractC38357j {

        /* renamed from: m */
        C38369p f101505m;

        /* renamed from: n */
        C38369p f101506n;

        /* renamed from: o */
        C38369p f101507o;

        /* renamed from: p */
        C38369p f101508p;

        /* renamed from: q */
        C38369p f101509q;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        public String mo14991b() {
            return "radialGradient";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$r */
    /* loaded from: classes11.dex */
    public static class C38373r extends AbstractC38374r0 implements InterfaceC38377t {

        /* renamed from: q */
        boolean f101510q;

        /* renamed from: r */
        C38369p f101511r;

        /* renamed from: s */
        C38369p f101512s;

        /* renamed from: t */
        C38369p f101513t;

        /* renamed from: u */
        C38369p f101514u;

        /* renamed from: v */
        Float f101515v;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        public String mo14991b() {
            return "marker";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$r0 */
    /* loaded from: classes11.dex */
    public static abstract class AbstractC38374r0 extends AbstractC38370p0 {

        /* renamed from: p */
        C38327b f101516p;

        AbstractC38374r0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$s */
    /* loaded from: classes11.dex */
    public static class C38375s extends AbstractC38354h0 implements InterfaceC38377t {

        /* renamed from: o */
        Boolean f101517o;

        /* renamed from: p */
        Boolean f101518p;

        /* renamed from: q */
        C38369p f101519q;

        /* renamed from: r */
        C38369p f101520r;

        /* renamed from: s */
        C38369p f101521s;

        /* renamed from: t */
        C38369p f101522t;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        public String mo14991b() {
            return "mask";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$s0 */
    /* loaded from: classes11.dex */
    public static class C38376s0 extends C38363m {
        @Override // p793n0.SVG.C38363m, p793n0.SVG.C38366n0
        /* renamed from: b */
        String mo14991b() {
            return "switch";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$t */
    /* loaded from: classes11.dex */
    public interface InterfaceC38377t {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$t0 */
    /* loaded from: classes11.dex */
    public static class C38378t0 extends AbstractC38374r0 implements InterfaceC38377t {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        public String mo14991b() {
            return "symbol";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$u */
    /* loaded from: classes11.dex */
    public static class C38379u extends AbstractC38368o0 {

        /* renamed from: b */
        String f101523b;

        /* renamed from: c */
        AbstractC38368o0 f101524c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C38379u(String str, AbstractC38368o0 abstractC38368o0) {
            this.f101523b = str;
            this.f101524c = abstractC38368o0;
        }

        public String toString() {
            return this.f101523b + " " + this.f101524c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$u0 */
    /* loaded from: classes11.dex */
    public static class C38380u0 extends AbstractC38388y0 implements InterfaceC38386x0 {

        /* renamed from: o */
        String f101525o;

        /* renamed from: p */
        private InterfaceC38329b1 f101526p;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        public String mo14991b() {
            return "tref";
        }

        /* renamed from: c */
        public void m14998c(InterfaceC38329b1 interfaceC38329b1) {
            this.f101526p = interfaceC38329b1;
        }

        @Override // p793n0.SVG.InterfaceC38386x0
        public InterfaceC38329b1 getTextRoot() {
            return this.f101526p;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$v */
    /* loaded from: classes11.dex */
    public static class C38381v extends AbstractC38361l {

        /* renamed from: o */
        C38383w f101527o;

        /* renamed from: p */
        Float f101528p;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        public String mo14991b() {
            return "path";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$v0 */
    /* loaded from: classes11.dex */
    public static class C38382v0 extends AbstractC38326a1 implements InterfaceC38386x0 {

        /* renamed from: s */
        private InterfaceC38329b1 f101529s;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        public String mo14991b() {
            return "tspan";
        }

        /* renamed from: c */
        public void m14997c(InterfaceC38329b1 interfaceC38329b1) {
            this.f101529s = interfaceC38329b1;
        }

        @Override // p793n0.SVG.InterfaceC38386x0
        public InterfaceC38329b1 getTextRoot() {
            return this.f101529s;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$w */
    /* loaded from: classes11.dex */
    public static class C38383w implements InterfaceC38385x {

        /* renamed from: b */
        private int f101531b = 0;

        /* renamed from: d */
        private int f101533d = 0;

        /* renamed from: a */
        private byte[] f101530a = new byte[8];

        /* renamed from: c */
        private float[] f101532c = new float[16];

        /* renamed from: a */
        private void m14996a(byte b) {
            int i = this.f101531b;
            byte[] bArr = this.f101530a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f101530a = bArr2;
            }
            byte[] bArr3 = this.f101530a;
            int i2 = this.f101531b;
            this.f101531b = i2 + 1;
            bArr3[i2] = b;
        }

        /* renamed from: b */
        private void m14995b(int i) {
            float[] fArr = this.f101532c;
            if (fArr.length < this.f101533d + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f101532c = fArr2;
            }
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            int i;
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            m14996a((byte) (i | 4 | (z2 ? 1 : 0)));
            m14995b(5);
            float[] fArr = this.f101532c;
            int i2 = this.f101533d;
            int i3 = i2 + 1;
            fArr[i2] = f;
            int i4 = i3 + 1;
            fArr[i3] = f2;
            int i5 = i4 + 1;
            fArr[i4] = f3;
            int i6 = i5 + 1;
            fArr[i5] = f4;
            this.f101533d = i6 + 1;
            fArr[i6] = f5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public void m14994c(InterfaceC38385x interfaceC38385x) {
            int i;
            boolean z;
            boolean z2;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f101531b; i3++) {
                byte b = this.f101530a[i3];
                if (b != 0) {
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b != 8) {
                                    if ((b & 2) != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if ((b & 1) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    float[] fArr = this.f101532c;
                                    int i4 = i2 + 1;
                                    float f = fArr[i2];
                                    int i5 = i4 + 1;
                                    float f2 = fArr[i4];
                                    int i6 = i5 + 1;
                                    float f3 = fArr[i5];
                                    int i7 = i6 + 1;
                                    interfaceC38385x.arcTo(f, f2, f3, z, z2, fArr[i6], fArr[i7]);
                                    i2 = i7 + 1;
                                } else {
                                    interfaceC38385x.close();
                                }
                            } else {
                                float[] fArr2 = this.f101532c;
                                int i8 = i2 + 1;
                                int i9 = i8 + 1;
                                int i10 = i9 + 1;
                                interfaceC38385x.quadTo(fArr2[i2], fArr2[i8], fArr2[i9], fArr2[i10]);
                                i2 = i10 + 1;
                            }
                        } else {
                            float[] fArr3 = this.f101532c;
                            int i11 = i2 + 1;
                            float f4 = fArr3[i2];
                            int i12 = i11 + 1;
                            float f5 = fArr3[i11];
                            int i13 = i12 + 1;
                            float f6 = fArr3[i12];
                            int i14 = i13 + 1;
                            float f7 = fArr3[i13];
                            int i15 = i14 + 1;
                            float f8 = fArr3[i14];
                            i2 = i15 + 1;
                            interfaceC38385x.cubicTo(f4, f5, f6, f7, f8, fArr3[i15]);
                        }
                    } else {
                        float[] fArr4 = this.f101532c;
                        int i16 = i2 + 1;
                        i = i16 + 1;
                        interfaceC38385x.lineTo(fArr4[i2], fArr4[i16]);
                    }
                } else {
                    float[] fArr5 = this.f101532c;
                    int i17 = i2 + 1;
                    i = i17 + 1;
                    interfaceC38385x.moveTo(fArr5[i2], fArr5[i17]);
                }
                i2 = i;
            }
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void close() {
            m14996a((byte) 8);
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            m14996a((byte) 2);
            m14995b(6);
            float[] fArr = this.f101532c;
            int i = this.f101533d;
            int i2 = i + 1;
            fArr[i] = f;
            int i3 = i2 + 1;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            fArr[i3] = f3;
            int i5 = i4 + 1;
            fArr[i4] = f4;
            int i6 = i5 + 1;
            fArr[i5] = f5;
            this.f101533d = i6 + 1;
            fArr[i6] = f6;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean m14993d() {
            if (this.f101531b == 0) {
                return true;
            }
            return false;
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void lineTo(float f, float f2) {
            m14996a((byte) 1);
            m14995b(2);
            float[] fArr = this.f101532c;
            int i = this.f101533d;
            int i2 = i + 1;
            fArr[i] = f;
            this.f101533d = i2 + 1;
            fArr[i2] = f2;
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void moveTo(float f, float f2) {
            m14996a((byte) 0);
            m14995b(2);
            float[] fArr = this.f101532c;
            int i = this.f101533d;
            int i2 = i + 1;
            fArr[i] = f;
            this.f101533d = i2 + 1;
            fArr[i2] = f2;
        }

        @Override // p793n0.SVG.InterfaceC38385x
        public void quadTo(float f, float f2, float f3, float f4) {
            m14996a((byte) 3);
            m14995b(4);
            float[] fArr = this.f101532c;
            int i = this.f101533d;
            int i2 = i + 1;
            fArr[i] = f;
            int i3 = i2 + 1;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            fArr[i3] = f3;
            this.f101533d = i4 + 1;
            fArr[i4] = f4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$w0 */
    /* loaded from: classes11.dex */
    public static class C38384w0 extends AbstractC38326a1 implements InterfaceC38329b1, InterfaceC38365n {

        /* renamed from: s */
        Matrix f101534s;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        public String mo14991b() {
            return "text";
        }

        @Override // p793n0.SVG.InterfaceC38365n
        public void setTransform(Matrix matrix) {
            this.f101534s = matrix;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$x */
    /* loaded from: classes11.dex */
    public interface InterfaceC38385x {
        void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void close();

        void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

        void lineTo(float f, float f2);

        void moveTo(float f, float f2);

        void quadTo(float f, float f2, float f3, float f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$x0 */
    /* loaded from: classes11.dex */
    public interface InterfaceC38386x0 {
        InterfaceC38329b1 getTextRoot();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$y */
    /* loaded from: classes11.dex */
    public static class C38387y extends AbstractC38374r0 implements InterfaceC38377t {

        /* renamed from: q */
        Boolean f101535q;

        /* renamed from: r */
        Boolean f101536r;

        /* renamed from: s */
        Matrix f101537s;

        /* renamed from: t */
        C38369p f101538t;

        /* renamed from: u */
        C38369p f101539u;

        /* renamed from: v */
        C38369p f101540v;

        /* renamed from: w */
        C38369p f101541w;

        /* renamed from: x */
        String f101542x;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        public String mo14991b() {
            return "pattern";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$y0 */
    /* loaded from: classes11.dex */
    public static abstract class AbstractC38388y0 extends AbstractC38354h0 {
        AbstractC38388y0() {
        }

        @Override // p793n0.SVG.AbstractC38354h0, p793n0.SVG.InterfaceC38358j0
        /* renamed from: a */
        public void mo14992a(C38366n0 c38366n0) throws SVGParseException {
            if (c38366n0 instanceof InterfaceC38386x0) {
                this.f101454i.add(c38366n0);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + c38366n0 + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$z */
    /* loaded from: classes11.dex */
    public static class C38389z extends AbstractC38361l {

        /* renamed from: o */
        float[] f101543o;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        public String mo14991b() {
            return "polyline";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$z0 */
    /* loaded from: classes11.dex */
    public static class C38390z0 extends AbstractC38388y0 implements InterfaceC38386x0 {

        /* renamed from: o */
        String f101544o;

        /* renamed from: p */
        C38369p f101545p;

        /* renamed from: q */
        private InterfaceC38329b1 f101546q;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        public String mo14991b() {
            return "textPath";
        }

        /* renamed from: c */
        public void m14990c(InterfaceC38329b1 interfaceC38329b1) {
            this.f101546q = interfaceC38329b1;
        }

        @Override // p793n0.SVG.InterfaceC38386x0
        public InterfaceC38329b1 getTextRoot() {
            return this.f101546q;
        }
    }

    /* renamed from: c */
    private String m15037c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    /* renamed from: e */
    private C38327b m15035e(float f) {
        EnumC38335d1 enumC38335d1;
        EnumC38335d1 enumC38335d12;
        EnumC38335d1 enumC38335d13;
        EnumC38335d1 enumC38335d14;
        float f2;
        EnumC38335d1 enumC38335d15;
        C38349f0 c38349f0 = this.f101324a;
        C38369p c38369p = c38349f0.f101450s;
        C38369p c38369p2 = c38349f0.f101451t;
        if (c38369p != null && !c38369p.m14999i() && (enumC38335d1 = c38369p.f101499c) != (enumC38335d12 = EnumC38335d1.percent) && enumC38335d1 != (enumC38335d13 = EnumC38335d1.em) && enumC38335d1 != (enumC38335d14 = EnumC38335d1.ex)) {
            float m15005c = c38369p.m15005c(f);
            if (c38369p2 != null) {
                if (!c38369p2.m14999i() && (enumC38335d15 = c38369p2.f101499c) != enumC38335d12 && enumC38335d15 != enumC38335d13 && enumC38335d15 != enumC38335d14) {
                    f2 = c38369p2.m15005c(f);
                } else {
                    return new C38327b(-1.0f, -1.0f, -1.0f, -1.0f);
                }
            } else {
                C38327b c38327b = this.f101324a.f101516p;
                if (c38327b != null) {
                    f2 = (c38327b.f101338d * m15005c) / c38327b.f101337c;
                } else {
                    f2 = m15005c;
                }
            }
            return new C38327b(0.0f, 0.0f, m15005c, f2);
        }
        return new C38327b(-1.0f, -1.0f, -1.0f, -1.0f);
    }

    /* renamed from: j */
    private AbstractC38362l0 m15030j(InterfaceC38358j0 interfaceC38358j0, String str) {
        AbstractC38362l0 m15030j;
        AbstractC38362l0 abstractC38362l0 = (AbstractC38362l0) interfaceC38358j0;
        if (str.equals(abstractC38362l0.f101480c)) {
            return abstractC38362l0;
        }
        for (C38366n0 c38366n0 : interfaceC38358j0.getChildren()) {
            if (c38366n0 instanceof AbstractC38362l0) {
                AbstractC38362l0 abstractC38362l02 = (AbstractC38362l0) c38366n0;
                if (str.equals(abstractC38362l02.f101480c)) {
                    return abstractC38362l02;
                }
                if ((c38366n0 instanceof InterfaceC38358j0) && (m15030j = m15030j((InterfaceC38358j0) c38366n0, str)) != null) {
                    return m15030j;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static SVGExternalFileResolver m15029k() {
        return null;
    }

    /* renamed from: l */
    public static SVG m15028l(InputStream inputStream) throws SVGParseException {
        return new SVGParser().m14766z(inputStream, f101323g);
    }

    /* renamed from: m */
    public static SVG m15027m(Context context, int i) throws SVGParseException {
        return m15026n(context.getResources(), i);
    }

    /* renamed from: n */
    public static SVG m15026n(Resources resources, int i) throws SVGParseException {
        SVGParser sVGParser = new SVGParser();
        InputStream openRawResource = resources.openRawResource(i);
        try {
            return sVGParser.m14766z(openRawResource, f101323g);
        } finally {
            try {
                openRawResource.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: o */
    public static SVG m15025o(String str) throws SVGParseException {
        return new SVGParser().m14766z(new ByteArrayInputStream(str.getBytes()), f101323g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15039a(CSSParser.C38316r c38316r) {
        this.f101328e.m15069b(c38316r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m15038b() {
        this.f101328e.m15066e(CSSParser.EnumC38319u.RenderOptions);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public List<CSSParser.C38314p> m15036d() {
        return this.f101328e.m15068c();
    }

    /* renamed from: f */
    public float m15034f() {
        if (this.f101324a != null) {
            return m15035e(this.f101327d).f101338d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* renamed from: g */
    public RectF m15033g() {
        C38349f0 c38349f0 = this.f101324a;
        if (c38349f0 != null) {
            C38327b c38327b = c38349f0.f101516p;
            if (c38327b == null) {
                return null;
            }
            return c38327b.m15011d();
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* renamed from: h */
    public float m15032h() {
        if (this.f101324a != null) {
            return m15035e(this.f101327d).f101337c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public AbstractC38362l0 m15031i(String str) {
        if (str != null && str.length() != 0) {
            if (str.equals(this.f101324a.f101480c)) {
                return this.f101324a;
            }
            if (this.f101329f.containsKey(str)) {
                return this.f101329f.get(str);
            }
            AbstractC38362l0 m15030j = m15030j(this.f101324a, str);
            this.f101329f.put(str, m15030j);
            return m15030j;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public C38349f0 m15024p() {
        return this.f101324a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean m15023q() {
        return !this.f101328e.m15067d();
    }

    /* renamed from: r */
    public Picture m15022r() {
        return m15020t(null);
    }

    /* renamed from: s */
    public Picture m15021s(int i, int i2, RenderOptions renderOptions) {
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i, i2);
        if (renderOptions == null || renderOptions.f101322f == null) {
            if (renderOptions == null) {
                renderOptions = new RenderOptions();
            } else {
                renderOptions = new RenderOptions(renderOptions);
            }
            renderOptions.m15040h(0.0f, 0.0f, i, i2);
        }
        new SVGAndroidRenderer(beginRecording, this.f101327d).m14976G0(this, renderOptions);
        picture.endRecording();
        return picture;
    }

    /* renamed from: t */
    public Picture m15020t(RenderOptions renderOptions) {
        C38327b c38327b;
        C38369p c38369p;
        if (renderOptions != null && renderOptions.m15042f()) {
            c38327b = renderOptions.f101320d;
        } else {
            c38327b = this.f101324a.f101516p;
        }
        if (renderOptions != null && renderOptions.m15041g()) {
            return m15021s((int) Math.ceil(renderOptions.f101322f.m15013b()), (int) Math.ceil(renderOptions.f101322f.m15012c()), renderOptions);
        }
        C38349f0 c38349f0 = this.f101324a;
        C38369p c38369p2 = c38349f0.f101450s;
        if (c38369p2 != null) {
            EnumC38335d1 enumC38335d1 = c38369p2.f101499c;
            EnumC38335d1 enumC38335d12 = EnumC38335d1.percent;
            if (enumC38335d1 != enumC38335d12 && (c38369p = c38349f0.f101451t) != null && c38369p.f101499c != enumC38335d12) {
                return m15021s((int) Math.ceil(c38369p2.m15005c(this.f101327d)), (int) Math.ceil(this.f101324a.f101451t.m15005c(this.f101327d)), renderOptions);
            }
        }
        if (c38369p2 != null && c38327b != null) {
            float m15005c = c38369p2.m15005c(this.f101327d);
            return m15021s((int) Math.ceil(m15005c), (int) Math.ceil((c38327b.f101338d * m15005c) / c38327b.f101337c), renderOptions);
        }
        C38369p c38369p3 = c38349f0.f101451t;
        if (c38369p3 != null && c38327b != null) {
            float m15005c2 = c38369p3.m15005c(this.f101327d);
            return m15021s((int) Math.ceil((c38327b.f101337c * m15005c2) / c38327b.f101338d), (int) Math.ceil(m15005c2), renderOptions);
        }
        return m15021s(512, 512, renderOptions);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public C38366n0 m15019u(String str) {
        if (str == null) {
            return null;
        }
        String m15037c = m15037c(str);
        if (m15037c.length() <= 1 || !m15037c.startsWith("#")) {
            return null;
        }
        return m15031i(m15037c.substring(1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m15018v(String str) {
        this.f101326c = str;
    }

    /* renamed from: w */
    public void m15017w(float f, float f2, float f3, float f4) {
        C38349f0 c38349f0 = this.f101324a;
        if (c38349f0 != null) {
            c38349f0.f101516p = new C38327b(f, f2, f3, f4);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m15016x(C38349f0 c38349f0) {
        this.f101324a = c38349f0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m15015y(String str) {
        this.f101325b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$p */
    /* loaded from: classes11.dex */
    public static class C38369p implements Cloneable {

        /* renamed from: b */
        float f101498b;

        /* renamed from: c */
        EnumC38335d1 f101499c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C38369p(float f, EnumC38335d1 enumC38335d1) {
            this.f101498b = f;
            this.f101499c = enumC38335d1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public float m15006b() {
            return this.f101498b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public float m15005c(float f) {
            int i = C38324a.f101330a[this.f101499c.ordinal()];
            if (i != 1) {
                switch (i) {
                    case 4:
                        return this.f101498b * f;
                    case 5:
                        return (this.f101498b * f) / 2.54f;
                    case 6:
                        return (this.f101498b * f) / 25.4f;
                    case 7:
                        return (this.f101498b * f) / 72.0f;
                    case 8:
                        return (this.f101498b * f) / 6.0f;
                    default:
                        return this.f101498b;
                }
            }
            return this.f101498b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public float m15004d(SVGAndroidRenderer sVGAndroidRenderer) {
            if (this.f101499c == EnumC38335d1.percent) {
                C38327b m14953S = sVGAndroidRenderer.m14953S();
                if (m14953S == null) {
                    return this.f101498b;
                }
                float f = m14953S.f101337c;
                float f2 = m14953S.f101338d;
                if (f == f2) {
                    return (this.f101498b * f) / 100.0f;
                }
                return (this.f101498b * ((float) (Math.sqrt((f * f) + (f2 * f2)) / 1.414213562373095d))) / 100.0f;
            }
            return m15002f(sVGAndroidRenderer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public float m15003e(SVGAndroidRenderer sVGAndroidRenderer, float f) {
            if (this.f101499c == EnumC38335d1.percent) {
                return (this.f101498b * f) / 100.0f;
            }
            return m15002f(sVGAndroidRenderer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f */
        public float m15002f(SVGAndroidRenderer sVGAndroidRenderer) {
            switch (C38324a.f101330a[this.f101499c.ordinal()]) {
                case 1:
                    return this.f101498b;
                case 2:
                    return this.f101498b * sVGAndroidRenderer.m14957Q();
                case 3:
                    return this.f101498b * sVGAndroidRenderer.m14955R();
                case 4:
                    return this.f101498b * sVGAndroidRenderer.m14951T();
                case 5:
                    return (this.f101498b * sVGAndroidRenderer.m14951T()) / 2.54f;
                case 6:
                    return (this.f101498b * sVGAndroidRenderer.m14951T()) / 25.4f;
                case 7:
                    return (this.f101498b * sVGAndroidRenderer.m14951T()) / 72.0f;
                case 8:
                    return (this.f101498b * sVGAndroidRenderer.m14951T()) / 6.0f;
                case 9:
                    C38327b m14953S = sVGAndroidRenderer.m14953S();
                    if (m14953S == null) {
                        return this.f101498b;
                    }
                    return (this.f101498b * m14953S.f101337c) / 100.0f;
                default:
                    return this.f101498b;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public float m15001g(SVGAndroidRenderer sVGAndroidRenderer) {
            if (this.f101499c == EnumC38335d1.percent) {
                C38327b m14953S = sVGAndroidRenderer.m14953S();
                if (m14953S == null) {
                    return this.f101498b;
                }
                return (this.f101498b * m14953S.f101338d) / 100.0f;
            }
            return m15002f(sVGAndroidRenderer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean m15000h() {
            if (this.f101498b < 0.0f) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean m14999i() {
            if (this.f101498b == 0.0f) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.valueOf(this.f101498b) + this.f101499c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C38369p(float f) {
            this.f101498b = f;
            this.f101499c = EnumC38335d1.px;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$b */
    /* loaded from: classes11.dex */
    public static class C38327b {

        /* renamed from: a */
        float f101335a;

        /* renamed from: b */
        float f101336b;

        /* renamed from: c */
        float f101337c;

        /* renamed from: d */
        float f101338d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C38327b(float f, float f2, float f3, float f4) {
            this.f101335a = f;
            this.f101336b = f2;
            this.f101337c = f3;
            this.f101338d = f4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static C38327b m15014a(float f, float f2, float f3, float f4) {
            return new C38327b(f, f2, f3 - f, f4 - f2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public float m15013b() {
            return this.f101335a + this.f101337c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public float m15012c() {
            return this.f101336b + this.f101338d;
        }

        /* renamed from: d */
        RectF m15011d() {
            return new RectF(this.f101335a, this.f101336b, m15013b(), m15012c());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: e */
        public void m15010e(C38327b c38327b) {
            float f = c38327b.f101335a;
            if (f < this.f101335a) {
                this.f101335a = f;
            }
            float f2 = c38327b.f101336b;
            if (f2 < this.f101336b) {
                this.f101336b = f2;
            }
            if (c38327b.m15013b() > m15013b()) {
                this.f101337c = c38327b.m15013b() - this.f101335a;
            }
            if (c38327b.m15012c() > m15012c()) {
                this.f101338d = c38327b.m15012c() - this.f101336b;
            }
        }

        public String toString() {
            return C21114v8.C21123i.f54137d + this.f101335a + " " + this.f101336b + " " + this.f101337c + " " + this.f101338d + C21114v8.C21123i.f54139e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C38327b(C38327b c38327b) {
            this.f101335a = c38327b.f101335a;
            this.f101336b = c38327b.f101336b;
            this.f101337c = c38327b.f101337c;
            this.f101338d = c38327b.f101338d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$c0 */
    /* loaded from: classes11.dex */
    public static class C38331c0 extends AbstractC38362l0 implements InterfaceC38358j0 {
        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        String mo14991b() {
            return "solidColor";
        }

        @Override // p793n0.SVG.InterfaceC38358j0
        public List<C38366n0> getChildren() {
            return Collections.emptyList();
        }

        @Override // p793n0.SVG.InterfaceC38358j0
        /* renamed from: a */
        public void mo14992a(C38366n0 c38366n0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SVG.java */
    /* renamed from: n0.h$d0 */
    /* loaded from: classes11.dex */
    public static class C38334d0 extends AbstractC38362l0 implements InterfaceC38358j0 {

        /* renamed from: h */
        Float f101354h;

        @Override // p793n0.SVG.C38366n0
        /* renamed from: b */
        String mo14991b() {
            return C32664c2oc2i.c2oc2o;
        }

        @Override // p793n0.SVG.InterfaceC38358j0
        public List<C38366n0> getChildren() {
            return Collections.emptyList();
        }

        @Override // p793n0.SVG.InterfaceC38358j0
        /* renamed from: a */
        public void mo14992a(C38366n0 c38366n0) {
        }
    }
}
