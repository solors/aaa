package net.pubnative.lite.sdk.utils.svgparser.utils;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioiic.C32664c2oc2i;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.pubnative.lite.sdk.utils.svgparser.PreserveAspectRatio;
import net.pubnative.lite.sdk.utils.svgparser.RenderOptions;
import net.pubnative.lite.sdk.utils.svgparser.SVGExternalFileResolver;
import net.pubnative.lite.sdk.utils.svgparser.SVGParseException;
import net.pubnative.lite.sdk.utils.svgparser.utils.CSSParser;

/* loaded from: classes10.dex */
public class SVGBase {
    private static final int DEFAULT_PICTURE_HEIGHT = 512;
    private static final int DEFAULT_PICTURE_WIDTH = 512;
    private static final double SQRT2 = 1.414213562373095d;
    private static boolean enableInternalEntitiesSingleton = true;
    private static SVGExternalFileResolver externalFileResolverSingleton;
    private final boolean enableInternalEntities;
    private final SVGExternalFileResolver externalFileResolver;
    private Svg rootElement = null;
    private String title = "";
    private String desc = "";
    private float renderDPI = 96.0f;
    private final CSSParser.Ruleset cssRules = new CSSParser.Ruleset();
    private final Map<String, SvgElementBase> idToElementMap = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$1 */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class C387011 {

        /* renamed from: $SwitchMap$net$pubnative$lite$sdk$utils$svgparser$utils$SVGBase$Unit */
        static final /* synthetic */ int[] f102063xd221d003;

        static {
            int[] iArr = new int[Unit.values().length];
            f102063xd221d003 = iArr;
            try {
                iArr[Unit.em.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102063xd221d003[Unit.ex.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f102063xd221d003[Unit.in.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f102063xd221d003[Unit.cm.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f102063xd221d003[Unit.mm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f102063xd221d003[Unit.pt.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f102063xd221d003[Unit.pc.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f102063xd221d003[Unit.percent.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f102063xd221d003[Unit.px.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase$A */
    /* loaded from: classes10.dex */
    static class C38702A extends Group {
        String href;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Group, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "a";
        }
    }

    /* loaded from: classes10.dex */
    public static class CSSClipRect {
        final Length bottom;
        final Length left;
        final Length right;
        final Length top;

        /* JADX INFO: Access modifiers changed from: package-private */
        public CSSClipRect(Length length, Length length2, Length length3, Length length4) {
            this.top = length;
            this.right = length2;
            this.bottom = length3;
            this.left = length4;
        }
    }

    /* loaded from: classes10.dex */
    static class Circle extends GraphicsElement {

        /* renamed from: cx */
        Length f102064cx;

        /* renamed from: cy */
        Length f102065cy;

        /* renamed from: r */
        Length f102066r;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "circle";
        }
    }

    /* loaded from: classes10.dex */
    static class ClipPath extends Group implements NotDirectlyRendered {
        static final String NODE_NAME = "clipPath";
        Boolean clipPathUnitsAreUser;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Group, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return NODE_NAME;
        }
    }

    /* loaded from: classes10.dex */
    public static class Colour extends SvgPaint {
        static final Colour BLACK = new Colour(ViewCompat.MEASURED_STATE_MASK);
        static final Colour TRANSPARENT = new Colour(0);
        final int colour;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Colour(int i) {
            this.colour = i;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.colour));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public static class CurrentColor extends SvgPaint {
        private static final CurrentColor instance = new CurrentColor();

        private CurrentColor() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static CurrentColor getInstance() {
            return instance;
        }
    }

    /* loaded from: classes10.dex */
    static class Defs extends Group implements NotDirectlyRendered {
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Group, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "defs";
        }
    }

    /* loaded from: classes10.dex */
    static class Ellipse extends GraphicsElement {

        /* renamed from: cx */
        Length f102067cx;

        /* renamed from: cy */
        Length f102068cy;

        /* renamed from: rx */
        Length f102069rx;

        /* renamed from: ry */
        Length f102070ry;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "ellipse";
        }
    }

    /* loaded from: classes10.dex */
    static abstract class GradientElement extends SvgElementBase implements SvgContainer {
        List<SvgObject> children = new ArrayList();
        Matrix gradientTransform;
        Boolean gradientUnitsAreUser;
        String href;
        GradientSpread spreadMethod;

        GradientElement() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) throws SVGParseException {
            if (svgObject instanceof Stop) {
                this.children.add(svgObject);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + svgObject + " elements.");
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return this.children;
        }
    }

    /* loaded from: classes10.dex */
    enum GradientSpread {
        pad,
        reflect,
        repeat
    }

    /* loaded from: classes10.dex */
    static abstract class GraphicsElement extends SvgConditionalElement implements HasTransform {
        Matrix transform;

        GraphicsElement() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.HasTransform
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    /* loaded from: classes10.dex */
    static class Group extends SvgConditionalContainer implements HasTransform {
        Matrix transform;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        public String getNodeName() {
            return "group";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.HasTransform
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    /* loaded from: classes10.dex */
    interface HasTransform {
        void setTransform(Matrix matrix);
    }

    /* loaded from: classes10.dex */
    static class Image extends SvgPreserveAspectRatioContainer implements HasTransform {
        Length height;
        String href;
        Matrix transform;
        Length width;

        /* renamed from: x */
        Length f102071x;

        /* renamed from: y */
        Length f102072y;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "image";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.HasTransform
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    /* loaded from: classes10.dex */
    public static class Length implements Cloneable {
        final Unit unit;
        final float value;
        static final Length ZERO = new Length(0.0f);
        static final Length PERCENT_100 = new Length(100.0f, Unit.percent);

        public Length(float f, Unit unit) {
            this.value = f;
            this.unit = unit;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public float floatValue() {
            return this.value;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public float floatValueX(SVGAndroidRenderer sVGAndroidRenderer) {
            switch (C387011.f102063xd221d003[this.unit.ordinal()]) {
                case 1:
                    return this.value * sVGAndroidRenderer.getCurrentFontSize();
                case 2:
                    return this.value * sVGAndroidRenderer.getCurrentFontXHeight();
                case 3:
                    return this.value * sVGAndroidRenderer.getDPI();
                case 4:
                    return (this.value * sVGAndroidRenderer.getDPI()) / 2.54f;
                case 5:
                    return (this.value * sVGAndroidRenderer.getDPI()) / 25.4f;
                case 6:
                    return (this.value * sVGAndroidRenderer.getDPI()) / 72.0f;
                case 7:
                    return (this.value * sVGAndroidRenderer.getDPI()) / 6.0f;
                case 8:
                    Box effectiveViewPortInUserUnits = sVGAndroidRenderer.getEffectiveViewPortInUserUnits();
                    if (effectiveViewPortInUserUnits == null) {
                        return this.value;
                    }
                    return (this.value * effectiveViewPortInUserUnits.width) / 100.0f;
                default:
                    return this.value;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public float floatValueY(SVGAndroidRenderer sVGAndroidRenderer) {
            if (this.unit == Unit.percent) {
                Box effectiveViewPortInUserUnits = sVGAndroidRenderer.getEffectiveViewPortInUserUnits();
                if (effectiveViewPortInUserUnits == null) {
                    return this.value;
                }
                return (this.value * effectiveViewPortInUserUnits.height) / 100.0f;
            }
            return floatValueX(sVGAndroidRenderer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isNegative() {
            if (this.value < 0.0f) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isZero() {
            if (this.value == 0.0f) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.valueOf(this.value) + this.unit;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public float floatValue(SVGAndroidRenderer sVGAndroidRenderer) {
            if (this.unit == Unit.percent) {
                Box effectiveViewPortInUserUnits = sVGAndroidRenderer.getEffectiveViewPortInUserUnits();
                if (effectiveViewPortInUserUnits == null) {
                    return this.value;
                }
                float f = effectiveViewPortInUserUnits.width;
                float f2 = effectiveViewPortInUserUnits.height;
                if (f == f2) {
                    return (this.value * f) / 100.0f;
                }
                return (this.value * ((float) (Math.sqrt((f * f) + (f2 * f2)) / SVGBase.SQRT2))) / 100.0f;
            }
            return floatValueX(sVGAndroidRenderer);
        }

        public Length(float f) {
            this.value = f;
            this.unit = Unit.px;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public float floatValue(SVGAndroidRenderer sVGAndroidRenderer, float f) {
            if (this.unit == Unit.percent) {
                return (this.value * f) / 100.0f;
            }
            return floatValueX(sVGAndroidRenderer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public float floatValue(float f) {
            int i = C387011.f102063xd221d003[this.unit.ordinal()];
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                return this.value;
                            }
                            return (this.value * f) / 6.0f;
                        }
                        return (this.value * f) / 72.0f;
                    }
                    return (this.value * f) / 25.4f;
                }
                return (this.value * f) / 2.54f;
            }
            return this.value * f;
        }
    }

    /* loaded from: classes10.dex */
    static class Line extends GraphicsElement {

        /* renamed from: x1 */
        Length f102073x1;

        /* renamed from: x2 */
        Length f102074x2;

        /* renamed from: y1 */
        Length f102075y1;

        /* renamed from: y2 */
        Length f102076y2;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "line";
        }
    }

    /* loaded from: classes10.dex */
    static class Marker extends SvgViewBoxContainer implements NotDirectlyRendered {
        Length markerHeight;
        boolean markerUnitsAreUser;
        Length markerWidth;
        Float orient;
        Length refX;
        Length refY;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "marker";
        }
    }

    /* loaded from: classes10.dex */
    static class Mask extends SvgConditionalContainer implements NotDirectlyRendered {
        Length height;
        Boolean maskContentUnitsAreUser;
        Boolean maskUnitsAreUser;
        Length width;

        /* renamed from: x */
        Length f102077x;

        /* renamed from: y */
        Length f102078y;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "mask";
        }
    }

    /* loaded from: classes10.dex */
    interface NotDirectlyRendered {
    }

    /* loaded from: classes10.dex */
    static class PaintReference extends SvgPaint {
        final SvgPaint fallback;
        final String href;

        /* JADX INFO: Access modifiers changed from: package-private */
        public PaintReference(String str, SvgPaint svgPaint) {
            this.href = str;
            this.fallback = svgPaint;
        }

        public String toString() {
            return this.href + " " + this.fallback;
        }
    }

    /* loaded from: classes10.dex */
    static class Path extends GraphicsElement {

        /* renamed from: d */
        PathDefinition f102079d;
        Float pathLength;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "path";
        }
    }

    /* loaded from: classes10.dex */
    static class PathDefinition implements PathInterface {
        private static final byte ARCTO = 4;
        private static final byte CLOSE = 8;
        private static final byte CUBICTO = 2;
        private static final byte LINETO = 1;
        private static final byte MOVETO = 0;
        private static final byte QUADTO = 3;
        private int commandsLength = 0;
        private int coordsLength = 0;
        private byte[] commands = new byte[8];
        private float[] coords = new float[16];

        private void addCommand(byte b) {
            int i = this.commandsLength;
            byte[] bArr = this.commands;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.commands = bArr2;
            }
            byte[] bArr3 = this.commands;
            int i2 = this.commandsLength;
            this.commandsLength = i2 + 1;
            bArr3[i2] = b;
        }

        private void coordsEnsure(int i) {
            float[] fArr = this.coords;
            if (fArr.length < this.coordsLength + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.coords = fArr2;
            }
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            int i;
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            addCommand((byte) (i | 4 | (z2 ? 1 : 0)));
            coordsEnsure(5);
            float[] fArr = this.coords;
            int i2 = this.coordsLength;
            int i3 = i2 + 1;
            fArr[i2] = f;
            int i4 = i3 + 1;
            fArr[i3] = f2;
            int i5 = i4 + 1;
            fArr[i4] = f3;
            int i6 = i5 + 1;
            fArr[i5] = f4;
            this.coordsLength = i6 + 1;
            fArr[i6] = f5;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void close() {
            addCommand((byte) 8);
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            addCommand((byte) 2);
            coordsEnsure(6);
            float[] fArr = this.coords;
            int i = this.coordsLength;
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
            this.coordsLength = i6 + 1;
            fArr[i6] = f6;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void enumeratePath(PathInterface pathInterface) {
            int i;
            boolean z;
            boolean z2;
            int i2 = 0;
            for (int i3 = 0; i3 < this.commandsLength; i3++) {
                byte b = this.commands[i3];
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
                                    float[] fArr = this.coords;
                                    int i4 = i2 + 1;
                                    float f = fArr[i2];
                                    int i5 = i4 + 1;
                                    float f2 = fArr[i4];
                                    int i6 = i5 + 1;
                                    float f3 = fArr[i5];
                                    int i7 = i6 + 1;
                                    pathInterface.arcTo(f, f2, f3, z, z2, fArr[i6], fArr[i7]);
                                    i2 = i7 + 1;
                                } else {
                                    pathInterface.close();
                                }
                            } else {
                                float[] fArr2 = this.coords;
                                int i8 = i2 + 1;
                                int i9 = i8 + 1;
                                int i10 = i9 + 1;
                                pathInterface.quadTo(fArr2[i2], fArr2[i8], fArr2[i9], fArr2[i10]);
                                i2 = i10 + 1;
                            }
                        } else {
                            float[] fArr3 = this.coords;
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
                            pathInterface.cubicTo(f4, f5, f6, f7, f8, fArr3[i15]);
                        }
                    } else {
                        float[] fArr4 = this.coords;
                        int i16 = i2 + 1;
                        i = i16 + 1;
                        pathInterface.lineTo(fArr4[i2], fArr4[i16]);
                    }
                } else {
                    float[] fArr5 = this.coords;
                    int i17 = i2 + 1;
                    i = i17 + 1;
                    pathInterface.moveTo(fArr5[i2], fArr5[i17]);
                }
                i2 = i;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean isEmpty() {
            if (this.commandsLength == 0) {
                return true;
            }
            return false;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void lineTo(float f, float f2) {
            addCommand((byte) 1);
            coordsEnsure(2);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            int i2 = i + 1;
            fArr[i] = f;
            this.coordsLength = i2 + 1;
            fArr[i2] = f2;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void moveTo(float f, float f2) {
            addCommand((byte) 0);
            coordsEnsure(2);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            int i2 = i + 1;
            fArr[i] = f;
            this.coordsLength = i2 + 1;
            fArr[i2] = f2;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PathInterface
        public void quadTo(float f, float f2, float f3, float f4) {
            addCommand((byte) 3);
            coordsEnsure(4);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            int i2 = i + 1;
            fArr[i] = f;
            int i3 = i2 + 1;
            fArr[i2] = f2;
            int i4 = i3 + 1;
            fArr[i3] = f3;
            this.coordsLength = i4 + 1;
            fArr[i4] = f4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public interface PathInterface {
        void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void close();

        void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

        void lineTo(float f, float f2);

        void moveTo(float f, float f2);

        void quadTo(float f, float f2, float f3, float f4);
    }

    /* loaded from: classes10.dex */
    static class Pattern extends SvgViewBoxContainer implements NotDirectlyRendered {
        Length height;
        String href;
        Boolean patternContentUnitsAreUser;
        Matrix patternTransform;
        Boolean patternUnitsAreUser;
        Length width;

        /* renamed from: x */
        Length f102080x;

        /* renamed from: y */
        Length f102081y;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "pattern";
        }
    }

    /* loaded from: classes10.dex */
    static class PolyLine extends GraphicsElement {
        float[] points;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "polyline";
        }
    }

    /* loaded from: classes10.dex */
    static class Polygon extends PolyLine {
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.PolyLine, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "polygon";
        }
    }

    /* loaded from: classes10.dex */
    static class Rect extends GraphicsElement {
        Length height;

        /* renamed from: rx */
        Length f102082rx;

        /* renamed from: ry */
        Length f102083ry;
        Length width;

        /* renamed from: x */
        Length f102084x;

        /* renamed from: y */
        Length f102085y;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "rect";
        }
    }

    /* loaded from: classes10.dex */
    public static class Svg extends SvgViewBoxContainer {
        Length height;
        public String version;
        Length width;

        /* renamed from: x */
        Length f102086x;

        /* renamed from: y */
        Length f102087y;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "svg";
        }
    }

    /* loaded from: classes10.dex */
    interface SvgConditional {
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

    /* loaded from: classes10.dex */
    public static abstract class SvgConditionalContainer extends SvgElement implements SvgContainer, SvgConditional {
        List<SvgObject> children = new ArrayList();
        Set<String> requiredFeatures = null;
        String requiredExtensions = null;
        Set<String> systemLanguage = null;
        Set<String> requiredFormats = null;
        Set<String> requiredFonts = null;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) throws SVGParseException {
            this.children.add(svgObject);
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return this.children;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFeatures() {
            return this.requiredFeatures;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFonts() {
            return this.requiredFonts;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFormats() {
            return this.requiredFormats;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getSystemLanguage() {
            return null;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredExtensions(String str) {
            this.requiredExtensions = str;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFeatures(Set<String> set) {
            this.requiredFeatures = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFonts(Set<String> set) {
            this.requiredFonts = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFormats(Set<String> set) {
            this.requiredFormats = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setSystemLanguage(Set<String> set) {
            this.systemLanguage = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgElementBase
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes10.dex */
    static abstract class SvgConditionalElement extends SvgElement implements SvgConditional {
        Set<String> requiredFeatures = null;
        String requiredExtensions = null;
        Set<String> systemLanguage = null;
        Set<String> requiredFormats = null;
        Set<String> requiredFonts = null;

        SvgConditionalElement() {
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFeatures() {
            return this.requiredFeatures;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFonts() {
            return this.requiredFonts;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getRequiredFormats() {
            return this.requiredFormats;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public Set<String> getSystemLanguage() {
            return this.systemLanguage;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredExtensions(String str) {
            this.requiredExtensions = str;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFeatures(Set<String> set) {
            this.requiredFeatures = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFonts(Set<String> set) {
            this.requiredFonts = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setRequiredFormats(Set<String> set) {
            this.requiredFormats = set;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditional
        public void setSystemLanguage(Set<String> set) {
            this.systemLanguage = set;
        }
    }

    /* loaded from: classes10.dex */
    public interface SvgContainer {
        void addChild(SvgObject svgObject) throws SVGParseException;

        List<SvgObject> getChildren();
    }

    /* loaded from: classes10.dex */
    static abstract class SvgElement extends SvgElementBase {
        Box boundingBox = null;

        SvgElement() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public static abstract class SvgElementBase extends SvgObject {

        /* renamed from: id */
        String f102088id = null;
        Boolean spacePreserve = null;
        Style baseStyle = null;
        Style style = null;
        List<String> classNames = null;

        SvgElementBase() {
        }

        public String toString() {
            return getNodeName();
        }
    }

    /* loaded from: classes10.dex */
    static class SvgLinearGradient extends GradientElement {

        /* renamed from: x1 */
        Length f102089x1;

        /* renamed from: x2 */
        Length f102090x2;

        /* renamed from: y1 */
        Length f102091y1;

        /* renamed from: y2 */
        Length f102092y2;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "linearGradient";
        }
    }

    /* loaded from: classes10.dex */
    public static class SvgObject {
        SVGBase document;
        SvgContainer parent;

        /* JADX INFO: Access modifiers changed from: package-private */
        public String getNodeName() {
            return "";
        }
    }

    /* loaded from: classes10.dex */
    public static abstract class SvgPaint implements Cloneable {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public static abstract class SvgPreserveAspectRatioContainer extends SvgConditionalContainer {
        PreserveAspectRatio preserveAspectRatio = null;

        SvgPreserveAspectRatioContainer() {
        }
    }

    /* loaded from: classes10.dex */
    static class SvgRadialGradient extends GradientElement {

        /* renamed from: cx */
        Length f102093cx;

        /* renamed from: cy */
        Length f102094cy;

        /* renamed from: fr */
        Length f102095fr;

        /* renamed from: fx */
        Length f102096fx;

        /* renamed from: fy */
        Length f102097fy;

        /* renamed from: r */
        Length f102098r;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        public String getNodeName() {
            return "radialGradient";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public static abstract class SvgViewBoxContainer extends SvgPreserveAspectRatioContainer {
        Box viewBox;

        SvgViewBoxContainer() {
        }
    }

    /* loaded from: classes10.dex */
    static class Switch extends Group {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Group, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        public String getNodeName() {
            return "switch";
        }
    }

    /* loaded from: classes10.dex */
    static class Symbol extends SvgViewBoxContainer implements NotDirectlyRendered {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        public String getNodeName() {
            return "symbol";
        }
    }

    /* loaded from: classes10.dex */
    static class TRef extends TextContainer implements TextChild {
        String href;
        private TextRoot textRoot;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        public String getNodeName() {
            return "tref";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }
    }

    /* loaded from: classes10.dex */
    static class TSpan extends TextPositionedContainer implements TextChild {
        private TextRoot textRoot;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        public String getNodeName() {
            return "tspan";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }
    }

    /* loaded from: classes10.dex */
    static class Text extends TextPositionedContainer implements TextRoot, HasTransform {
        Matrix transform;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        public String getNodeName() {
            return "text";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.HasTransform
        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    /* loaded from: classes10.dex */
    interface TextChild {
        TextRoot getTextRoot();

        void setTextRoot(TextRoot textRoot);
    }

    /* loaded from: classes10.dex */
    public static abstract class TextContainer extends SvgConditionalContainer {
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgConditionalContainer, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) throws SVGParseException {
            if (svgObject instanceof TextChild) {
                this.children.add(svgObject);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + svgObject + " elements.");
        }
    }

    /* loaded from: classes10.dex */
    static class TextPath extends TextContainer implements TextChild {
        String href;
        Length startOffset;
        private TextRoot textRoot;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        public String getNodeName() {
            return "textPath";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }
    }

    /* loaded from: classes10.dex */
    static abstract class TextPositionedContainer extends TextContainer {

        /* renamed from: dx */
        List<Length> f102099dx;

        /* renamed from: dy */
        List<Length> f102100dy;

        /* renamed from: x */
        List<Length> f102101x;

        /* renamed from: y */
        List<Length> f102102y;

        TextPositionedContainer() {
        }
    }

    /* loaded from: classes10.dex */
    interface TextRoot {
    }

    /* loaded from: classes10.dex */
    public static class TextSequence extends SvgObject implements TextChild {
        String text;
        private TextRoot textRoot;

        public TextSequence(String str) {
            this.text = str;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.TextChild
        public void setTextRoot(TextRoot textRoot) {
            this.textRoot = textRoot;
        }

        public String toString() {
            return "TextChild: '" + this.text + "'";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public enum Unit {
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

    /* loaded from: classes10.dex */
    static class Use extends Group {
        Length height;
        String href;
        Length width;

        /* renamed from: x */
        Length f102111x;

        /* renamed from: y */
        Length f102112y;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.Group, net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        public String getNodeName() {
            return "use";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public static class View extends SvgViewBoxContainer implements NotDirectlyRendered {
        static final String NODE_NAME = "view";

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        public String getNodeName() {
            return "view";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SVGBase(boolean z, SVGExternalFileResolver sVGExternalFileResolver) {
        this.enableInternalEntities = z;
        this.externalFileResolver = sVGExternalFileResolver;
    }

    protected static SVGParser createParser() {
        return new SVGParserImpl().setInternalEntitiesEnabled(enableInternalEntitiesSingleton).setExternalFileResolver(externalFileResolverSingleton);
    }

    private String cssQuotedString(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    private Box getDocumentDimensions(float f) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        Unit unit4;
        float f2;
        Unit unit5;
        Svg svg = this.rootElement;
        Length length = svg.width;
        Length length2 = svg.height;
        if (length != null && !length.isZero() && (unit = length.unit) != (unit2 = Unit.percent) && unit != (unit3 = Unit.em) && unit != (unit4 = Unit.ex)) {
            float floatValue = length.floatValue(f);
            if (length2 != null) {
                if (!length2.isZero() && (unit5 = length2.unit) != unit2 && unit5 != unit3 && unit5 != unit4) {
                    f2 = length2.floatValue(f);
                } else {
                    return new Box(-1.0f, -1.0f, -1.0f, -1.0f);
                }
            } else {
                Box box = this.rootElement.viewBox;
                if (box != null) {
                    f2 = (box.height * floatValue) / box.width;
                } else {
                    f2 = floatValue;
                }
            }
            return new Box(0.0f, 0.0f, floatValue, f2);
        }
        return new Box(-1.0f, -1.0f, -1.0f, -1.0f);
    }

    private List<SvgObject> getElementsByTagName(String str) {
        ArrayList arrayList = new ArrayList();
        getElementsByTagName(arrayList, this.rootElement, str);
        return arrayList;
    }

    public static SVGBase getFromInputStream(InputStream inputStream) throws SVGParseException {
        return createParser().parseStream(inputStream);
    }

    public static SVGBase getFromString(String str) throws SVGParseException {
        return createParser().parseStream(new ByteArrayInputStream(str.getBytes()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addCSSRules(CSSParser.Ruleset ruleset) {
        this.cssRules.addAll(ruleset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearRenderCSSRules() {
        this.cssRules.removeFromSource(CSSParser.Source.RenderOptions);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<CSSParser.Rule> getCSSRules() {
        return this.cssRules.getRules();
    }

    public PreserveAspectRatio getDocumentPreserveAspectRatio() {
        Svg svg = this.rootElement;
        if (svg != null) {
            PreserveAspectRatio preserveAspectRatio = svg.preserveAspectRatio;
            if (preserveAspectRatio == null) {
                return null;
            }
            return preserveAspectRatio;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SvgElementBase getElementById(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.rootElement.f102088id)) {
            return this.rootElement;
        }
        if (this.idToElementMap.containsKey(str)) {
            return this.idToElementMap.get(str);
        }
        SvgElementBase elementById = getElementById(this.rootElement, str);
        this.idToElementMap.put(str, elementById);
        return elementById;
    }

    public Svg getRootElement() {
        return this.rootElement;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasCSSRules() {
        return !this.cssRules.isEmpty();
    }

    public void renderToCanvas(Canvas canvas, RenderOptions renderOptions) {
        if (renderOptions == null) {
            renderOptions = new RenderOptions();
        }
        if (!renderOptions.hasViewPort()) {
            renderOptions.viewPort(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new SVGAndroidRenderer(canvas, this.renderDPI, this.externalFileResolver).renderDocument(this, renderOptions);
    }

    public Picture renderToPicture(RenderOptionsBase renderOptionsBase) {
        Length length;
        Box box = (renderOptionsBase == null || !renderOptionsBase.hasViewBox()) ? this.rootElement.viewBox : renderOptionsBase.viewBox;
        if (renderOptionsBase != null && renderOptionsBase.hasViewPort()) {
            return renderToPicture((int) Math.ceil(renderOptionsBase.viewPort.maxX()), (int) Math.ceil(renderOptionsBase.viewPort.maxY()), renderOptionsBase);
        }
        Svg svg = this.rootElement;
        Length length2 = svg.width;
        if (length2 != null) {
            Unit unit = length2.unit;
            Unit unit2 = Unit.percent;
            if (unit != unit2 && (length = svg.height) != null && length.unit != unit2) {
                return renderToPicture((int) Math.ceil(length2.floatValue(this.renderDPI)), (int) Math.ceil(this.rootElement.height.floatValue(this.renderDPI)), renderOptionsBase);
            }
        }
        if (length2 != null && box != null) {
            float floatValue = length2.floatValue(this.renderDPI);
            return renderToPicture((int) Math.ceil(floatValue), (int) Math.ceil((box.height * floatValue) / box.width), renderOptionsBase);
        }
        Length length3 = svg.height;
        if (length3 != null && box != null) {
            float floatValue2 = length3.floatValue(this.renderDPI);
            return renderToPicture((int) Math.ceil((box.width * floatValue2) / box.height), (int) Math.ceil(floatValue2), renderOptionsBase);
        }
        return renderToPicture(512, 512, renderOptionsBase);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SvgObject resolveIRI(String str) {
        if (str == null) {
            return null;
        }
        String cssQuotedString = cssQuotedString(str);
        if (cssQuotedString.length() <= 1 || !cssQuotedString.startsWith("#")) {
            return null;
        }
        return getElementById(cssQuotedString.substring(1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDesc(String str) {
        this.desc = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRootElement(Svg svg) {
        this.rootElement = svg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTitle(String str) {
        this.title = str;
    }

    private void getElementsByTagName(List<SvgObject> list, SvgObject svgObject, String str) {
        if (svgObject.getNodeName().equals(str)) {
            list.add(svgObject);
        }
        if (svgObject instanceof SvgContainer) {
            for (SvgObject svgObject2 : ((SvgContainer) svgObject).getChildren()) {
                getElementsByTagName(list, svgObject2, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public static class Box {
        float height;
        float minX;
        float minY;
        float width;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Box(float f, float f2, float f3, float f4) {
            this.minX = f;
            this.minY = f2;
            this.width = f3;
            this.height = f4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static Box fromLimits(float f, float f2, float f3, float f4) {
            return new Box(f, f2, f3 - f, f4 - f2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public float maxX() {
            return this.minX + this.width;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public float maxY() {
            return this.minY + this.height;
        }

        RectF toRectF() {
            return new RectF(this.minX, this.minY, maxX(), maxY());
        }

        public String toString() {
            return C21114v8.C21123i.f54137d + this.minX + " " + this.minY + " " + this.width + " " + this.height + C21114v8.C21123i.f54139e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void union(Box box) {
            float f = box.minX;
            if (f < this.minX) {
                this.minX = f;
            }
            float f2 = box.minY;
            if (f2 < this.minY) {
                this.minY = f2;
            }
            if (box.maxX() > maxX()) {
                this.width = box.maxX() - this.minX;
            }
            if (box.maxY() > maxY()) {
                this.height = box.maxY() - this.minY;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Box(Box box) {
            this.minX = box.minX;
            this.minY = box.minY;
            this.width = box.width;
            this.height = box.height;
        }
    }

    private SvgElementBase getElementById(SvgContainer svgContainer, String str) {
        SvgElementBase elementById;
        SvgElementBase svgElementBase = (SvgElementBase) svgContainer;
        if (str.equals(svgElementBase.f102088id)) {
            return svgElementBase;
        }
        for (SvgObject svgObject : svgContainer.getChildren()) {
            if (svgObject instanceof SvgElementBase) {
                SvgElementBase svgElementBase2 = (SvgElementBase) svgObject;
                if (str.equals(svgElementBase2.f102088id)) {
                    return svgElementBase2;
                }
                if ((svgObject instanceof SvgContainer) && (elementById = getElementById((SvgContainer) svgObject, str)) != null) {
                    return elementById;
                }
            }
        }
        return null;
    }

    public Picture renderToPicture(int i, int i2, RenderOptionsBase renderOptionsBase) {
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i, i2);
        if (renderOptionsBase == null || renderOptionsBase.viewPort == null) {
            renderOptionsBase = renderOptionsBase == null ? new RenderOptionsBase() : new RenderOptionsBase(renderOptionsBase);
            renderOptionsBase.viewPort(0.0f, 0.0f, i, i2);
        }
        new SVGAndroidRenderer(beginRecording, this.renderDPI, this.externalFileResolver).renderDocument(this, renderOptionsBase);
        picture.endRecording();
        return picture;
    }

    /* loaded from: classes10.dex */
    static class SolidColor extends SvgElementBase implements SvgContainer {
        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return Collections.emptyList();
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return "solidColor";
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) {
        }
    }

    /* loaded from: classes10.dex */
    static class Stop extends SvgElementBase implements SvgContainer {
        Float offset;

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public List<SvgObject> getChildren() {
            return Collections.emptyList();
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgObject
        String getNodeName() {
            return C32664c2oc2i.c2oc2o;
        }

        @Override // net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase.SvgContainer
        public void addChild(SvgObject svgObject) {
        }
    }
}
