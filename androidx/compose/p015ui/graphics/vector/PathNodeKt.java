package androidx.compose.p015ui.graphics.vector;

import androidx.compose.p015ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.collections.CollectionsJVM;
import kotlin.collections.PrimitiveIterators;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C37629d;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: PathNode.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.PathNodeKt */
/* loaded from: classes.dex */
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [float[], java.lang.Object] */
    private static final List<PathNode> pathNodesFromArgs(float[] fArr, int i, Function1<? super float[], ? extends PathNode> function1) {
        C37629d m16901u;
        int m17154x;
        ?? m17387r;
        m16901u = _Ranges.m16901u(new PrimitiveRanges(0, fArr.length - i), i);
        m17154x = C37566w.m17154x(m16901u, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        Iterator<Integer> it = m16901u.iterator();
        while (it.hasNext()) {
            int nextInt = ((PrimitiveIterators) it).nextInt();
            m17387r = _ArraysJvm.m17387r(fArr, nextInt, nextInt + i);
            Object obj = (PathNode) function1.invoke(m17387r);
            if ((obj instanceof PathNode.MoveTo) && nextInt > 0) {
                obj = new PathNode.LineTo(m17387r[0], m17387r[1]);
            } else if ((obj instanceof PathNode.RelativeMoveTo) && nextInt > 0) {
                obj = new PathNode.RelativeLineTo(m17387r[0], m17387r[1]);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @NotNull
    public static final List<PathNode> toPathNodes(char c, @NotNull float[] args) {
        boolean z;
        C37629d m16901u;
        ArrayList arrayList;
        int m17154x;
        float[] m17387r;
        boolean z2;
        boolean z3;
        C37629d m16901u2;
        int m17154x2;
        float[] m17387r2;
        boolean z4;
        boolean z5;
        C37629d m16901u3;
        int m17154x3;
        float[] m17387r3;
        C37629d m16901u4;
        int m17154x4;
        float[] m17387r4;
        C37629d m16901u5;
        int m17154x5;
        float[] m17387r5;
        C37629d m16901u6;
        int m17154x6;
        float[] m17387r6;
        C37629d m16901u7;
        int m17154x7;
        float[] m17387r7;
        C37629d m16901u8;
        int m17154x8;
        float[] m17387r8;
        C37629d m16901u9;
        int m17154x9;
        float[] m17387r9;
        C37629d m16901u10;
        int m17154x10;
        float[] m17387r10;
        PathNode pathNode;
        C37629d m16901u11;
        int m17154x11;
        float[] m17387r11;
        C37629d m16901u12;
        int m17154x12;
        float[] m17387r12;
        C37629d m16901u13;
        int m17154x13;
        float[] m17387r13;
        C37629d m16901u14;
        int m17154x14;
        float[] m17387r14;
        C37629d m16901u15;
        int m17154x15;
        float[] m17387r15;
        C37629d m16901u16;
        int m17154x16;
        float[] m17387r16;
        C37629d m16901u17;
        int m17154x17;
        float[] m17387r17;
        C37629d m16901u18;
        int m17154x18;
        float[] m17387r18;
        List<PathNode> m17175e;
        Intrinsics.checkNotNullParameter(args, "args");
        if (c == 'z' || c == 'Z') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m17175e = CollectionsJVM.m17175e(PathNode.Close.INSTANCE);
            return m17175e;
        }
        if (c == 'm') {
            m16901u18 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 2), 2);
            m17154x18 = C37566w.m17154x(m16901u18, 10);
            arrayList = new ArrayList(m17154x18);
            Iterator<Integer> it = m16901u18.iterator();
            while (it.hasNext()) {
                int nextInt = ((PrimitiveIterators) it).nextInt();
                m17387r18 = _ArraysJvm.m17387r(args, nextInt, nextInt + 2);
                PathNode relativeMoveTo = new PathNode.RelativeMoveTo(m17387r18[0], m17387r18[1]);
                if ((relativeMoveTo instanceof PathNode.MoveTo) && nextInt > 0) {
                    relativeMoveTo = new PathNode.LineTo(m17387r18[0], m17387r18[1]);
                } else if (nextInt > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(m17387r18[0], m17387r18[1]);
                }
                arrayList.add(relativeMoveTo);
            }
        } else if (c == 'M') {
            m16901u17 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 2), 2);
            m17154x17 = C37566w.m17154x(m16901u17, 10);
            arrayList = new ArrayList(m17154x17);
            Iterator<Integer> it2 = m16901u17.iterator();
            while (it2.hasNext()) {
                int nextInt2 = ((PrimitiveIterators) it2).nextInt();
                m17387r17 = _ArraysJvm.m17387r(args, nextInt2, nextInt2 + 2);
                PathNode moveTo = new PathNode.MoveTo(m17387r17[0], m17387r17[1]);
                if (nextInt2 > 0) {
                    moveTo = new PathNode.LineTo(m17387r17[0], m17387r17[1]);
                } else if ((moveTo instanceof PathNode.RelativeMoveTo) && nextInt2 > 0) {
                    moveTo = new PathNode.RelativeLineTo(m17387r17[0], m17387r17[1]);
                }
                arrayList.add(moveTo);
            }
        } else if (c == 'l') {
            m16901u16 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 2), 2);
            m17154x16 = C37566w.m17154x(m16901u16, 10);
            arrayList = new ArrayList(m17154x16);
            Iterator<Integer> it3 = m16901u16.iterator();
            while (it3.hasNext()) {
                int nextInt3 = ((PrimitiveIterators) it3).nextInt();
                m17387r16 = _ArraysJvm.m17387r(args, nextInt3, nextInt3 + 2);
                PathNode relativeLineTo = new PathNode.RelativeLineTo(m17387r16[0], m17387r16[1]);
                if ((relativeLineTo instanceof PathNode.MoveTo) && nextInt3 > 0) {
                    relativeLineTo = new PathNode.LineTo(m17387r16[0], m17387r16[1]);
                } else if ((relativeLineTo instanceof PathNode.RelativeMoveTo) && nextInt3 > 0) {
                    relativeLineTo = new PathNode.RelativeLineTo(m17387r16[0], m17387r16[1]);
                }
                arrayList.add(relativeLineTo);
            }
        } else if (c == 'L') {
            m16901u15 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 2), 2);
            m17154x15 = C37566w.m17154x(m16901u15, 10);
            arrayList = new ArrayList(m17154x15);
            Iterator<Integer> it4 = m16901u15.iterator();
            while (it4.hasNext()) {
                int nextInt4 = ((PrimitiveIterators) it4).nextInt();
                m17387r15 = _ArraysJvm.m17387r(args, nextInt4, nextInt4 + 2);
                PathNode lineTo = new PathNode.LineTo(m17387r15[0], m17387r15[1]);
                if ((lineTo instanceof PathNode.MoveTo) && nextInt4 > 0) {
                    lineTo = new PathNode.LineTo(m17387r15[0], m17387r15[1]);
                } else if ((lineTo instanceof PathNode.RelativeMoveTo) && nextInt4 > 0) {
                    lineTo = new PathNode.RelativeLineTo(m17387r15[0], m17387r15[1]);
                }
                arrayList.add(lineTo);
            }
        } else if (c == 'h') {
            m16901u14 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 1), 1);
            m17154x14 = C37566w.m17154x(m16901u14, 10);
            arrayList = new ArrayList(m17154x14);
            Iterator<Integer> it5 = m16901u14.iterator();
            while (it5.hasNext()) {
                int nextInt5 = ((PrimitiveIterators) it5).nextInt();
                m17387r14 = _ArraysJvm.m17387r(args, nextInt5, nextInt5 + 1);
                PathNode relativeHorizontalTo = new PathNode.RelativeHorizontalTo(m17387r14[0]);
                if ((relativeHorizontalTo instanceof PathNode.MoveTo) && nextInt5 > 0) {
                    relativeHorizontalTo = new PathNode.LineTo(m17387r14[0], m17387r14[1]);
                } else if ((relativeHorizontalTo instanceof PathNode.RelativeMoveTo) && nextInt5 > 0) {
                    relativeHorizontalTo = new PathNode.RelativeLineTo(m17387r14[0], m17387r14[1]);
                }
                arrayList.add(relativeHorizontalTo);
            }
        } else if (c == 'H') {
            m16901u13 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 1), 1);
            m17154x13 = C37566w.m17154x(m16901u13, 10);
            arrayList = new ArrayList(m17154x13);
            Iterator<Integer> it6 = m16901u13.iterator();
            while (it6.hasNext()) {
                int nextInt6 = ((PrimitiveIterators) it6).nextInt();
                m17387r13 = _ArraysJvm.m17387r(args, nextInt6, nextInt6 + 1);
                PathNode horizontalTo = new PathNode.HorizontalTo(m17387r13[0]);
                if ((horizontalTo instanceof PathNode.MoveTo) && nextInt6 > 0) {
                    horizontalTo = new PathNode.LineTo(m17387r13[0], m17387r13[1]);
                } else if ((horizontalTo instanceof PathNode.RelativeMoveTo) && nextInt6 > 0) {
                    horizontalTo = new PathNode.RelativeLineTo(m17387r13[0], m17387r13[1]);
                }
                arrayList.add(horizontalTo);
            }
        } else if (c == 'v') {
            m16901u12 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 1), 1);
            m17154x12 = C37566w.m17154x(m16901u12, 10);
            arrayList = new ArrayList(m17154x12);
            Iterator<Integer> it7 = m16901u12.iterator();
            while (it7.hasNext()) {
                int nextInt7 = ((PrimitiveIterators) it7).nextInt();
                m17387r12 = _ArraysJvm.m17387r(args, nextInt7, nextInt7 + 1);
                PathNode relativeVerticalTo = new PathNode.RelativeVerticalTo(m17387r12[0]);
                if ((relativeVerticalTo instanceof PathNode.MoveTo) && nextInt7 > 0) {
                    relativeVerticalTo = new PathNode.LineTo(m17387r12[0], m17387r12[1]);
                } else if ((relativeVerticalTo instanceof PathNode.RelativeMoveTo) && nextInt7 > 0) {
                    relativeVerticalTo = new PathNode.RelativeLineTo(m17387r12[0], m17387r12[1]);
                }
                arrayList.add(relativeVerticalTo);
            }
        } else if (c == 'V') {
            m16901u11 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 1), 1);
            m17154x11 = C37566w.m17154x(m16901u11, 10);
            arrayList = new ArrayList(m17154x11);
            Iterator<Integer> it8 = m16901u11.iterator();
            while (it8.hasNext()) {
                int nextInt8 = ((PrimitiveIterators) it8).nextInt();
                m17387r11 = _ArraysJvm.m17387r(args, nextInt8, nextInt8 + 1);
                PathNode verticalTo = new PathNode.VerticalTo(m17387r11[0]);
                if ((verticalTo instanceof PathNode.MoveTo) && nextInt8 > 0) {
                    verticalTo = new PathNode.LineTo(m17387r11[0], m17387r11[1]);
                } else if ((verticalTo instanceof PathNode.RelativeMoveTo) && nextInt8 > 0) {
                    verticalTo = new PathNode.RelativeLineTo(m17387r11[0], m17387r11[1]);
                }
                arrayList.add(verticalTo);
            }
        } else {
            char c2 = 5;
            if (c == 'c') {
                m16901u10 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 6), 6);
                m17154x10 = C37566w.m17154x(m16901u10, 10);
                arrayList = new ArrayList(m17154x10);
                Iterator<Integer> it9 = m16901u10.iterator();
                while (it9.hasNext()) {
                    int nextInt9 = ((PrimitiveIterators) it9).nextInt();
                    m17387r10 = _ArraysJvm.m17387r(args, nextInt9, nextInt9 + 6);
                    PathNode relativeCurveTo = new PathNode.RelativeCurveTo(m17387r10[0], m17387r10[1], m17387r10[2], m17387r10[3], m17387r10[4], m17387r10[c2]);
                    if ((relativeCurveTo instanceof PathNode.MoveTo) && nextInt9 > 0) {
                        pathNode = new PathNode.LineTo(m17387r10[0], m17387r10[1]);
                    } else if ((relativeCurveTo instanceof PathNode.RelativeMoveTo) && nextInt9 > 0) {
                        pathNode = new PathNode.RelativeLineTo(m17387r10[0], m17387r10[1]);
                    } else {
                        pathNode = relativeCurveTo;
                    }
                    arrayList.add(pathNode);
                    c2 = 5;
                }
            } else if (c == 'C') {
                m16901u9 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 6), 6);
                m17154x9 = C37566w.m17154x(m16901u9, 10);
                arrayList = new ArrayList(m17154x9);
                Iterator<Integer> it10 = m16901u9.iterator();
                while (it10.hasNext()) {
                    int nextInt10 = ((PrimitiveIterators) it10).nextInt();
                    m17387r9 = _ArraysJvm.m17387r(args, nextInt10, nextInt10 + 6);
                    PathNode curveTo = new PathNode.CurveTo(m17387r9[0], m17387r9[1], m17387r9[2], m17387r9[3], m17387r9[4], m17387r9[5]);
                    if ((curveTo instanceof PathNode.MoveTo) && nextInt10 > 0) {
                        curveTo = new PathNode.LineTo(m17387r9[0], m17387r9[1]);
                    } else if ((curveTo instanceof PathNode.RelativeMoveTo) && nextInt10 > 0) {
                        curveTo = new PathNode.RelativeLineTo(m17387r9[0], m17387r9[1]);
                    }
                    arrayList.add(curveTo);
                }
            } else if (c == 's') {
                m16901u8 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 4), 4);
                m17154x8 = C37566w.m17154x(m16901u8, 10);
                arrayList = new ArrayList(m17154x8);
                Iterator<Integer> it11 = m16901u8.iterator();
                while (it11.hasNext()) {
                    int nextInt11 = ((PrimitiveIterators) it11).nextInt();
                    m17387r8 = _ArraysJvm.m17387r(args, nextInt11, nextInt11 + 4);
                    PathNode relativeReflectiveCurveTo = new PathNode.RelativeReflectiveCurveTo(m17387r8[0], m17387r8[1], m17387r8[2], m17387r8[3]);
                    if ((relativeReflectiveCurveTo instanceof PathNode.MoveTo) && nextInt11 > 0) {
                        relativeReflectiveCurveTo = new PathNode.LineTo(m17387r8[0], m17387r8[1]);
                    } else if ((relativeReflectiveCurveTo instanceof PathNode.RelativeMoveTo) && nextInt11 > 0) {
                        relativeReflectiveCurveTo = new PathNode.RelativeLineTo(m17387r8[0], m17387r8[1]);
                    }
                    arrayList.add(relativeReflectiveCurveTo);
                }
            } else if (c == 'S') {
                m16901u7 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 4), 4);
                m17154x7 = C37566w.m17154x(m16901u7, 10);
                arrayList = new ArrayList(m17154x7);
                Iterator<Integer> it12 = m16901u7.iterator();
                while (it12.hasNext()) {
                    int nextInt12 = ((PrimitiveIterators) it12).nextInt();
                    m17387r7 = _ArraysJvm.m17387r(args, nextInt12, nextInt12 + 4);
                    PathNode reflectiveCurveTo = new PathNode.ReflectiveCurveTo(m17387r7[0], m17387r7[1], m17387r7[2], m17387r7[3]);
                    if ((reflectiveCurveTo instanceof PathNode.MoveTo) && nextInt12 > 0) {
                        reflectiveCurveTo = new PathNode.LineTo(m17387r7[0], m17387r7[1]);
                    } else if ((reflectiveCurveTo instanceof PathNode.RelativeMoveTo) && nextInt12 > 0) {
                        reflectiveCurveTo = new PathNode.RelativeLineTo(m17387r7[0], m17387r7[1]);
                    }
                    arrayList.add(reflectiveCurveTo);
                }
            } else if (c == 'q') {
                m16901u6 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 4), 4);
                m17154x6 = C37566w.m17154x(m16901u6, 10);
                arrayList = new ArrayList(m17154x6);
                Iterator<Integer> it13 = m16901u6.iterator();
                while (it13.hasNext()) {
                    int nextInt13 = ((PrimitiveIterators) it13).nextInt();
                    m17387r6 = _ArraysJvm.m17387r(args, nextInt13, nextInt13 + 4);
                    PathNode relativeQuadTo = new PathNode.RelativeQuadTo(m17387r6[0], m17387r6[1], m17387r6[2], m17387r6[3]);
                    if ((relativeQuadTo instanceof PathNode.MoveTo) && nextInt13 > 0) {
                        relativeQuadTo = new PathNode.LineTo(m17387r6[0], m17387r6[1]);
                    } else if ((relativeQuadTo instanceof PathNode.RelativeMoveTo) && nextInt13 > 0) {
                        relativeQuadTo = new PathNode.RelativeLineTo(m17387r6[0], m17387r6[1]);
                    }
                    arrayList.add(relativeQuadTo);
                }
            } else if (c == 'Q') {
                m16901u5 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 4), 4);
                m17154x5 = C37566w.m17154x(m16901u5, 10);
                arrayList = new ArrayList(m17154x5);
                Iterator<Integer> it14 = m16901u5.iterator();
                while (it14.hasNext()) {
                    int nextInt14 = ((PrimitiveIterators) it14).nextInt();
                    m17387r5 = _ArraysJvm.m17387r(args, nextInt14, nextInt14 + 4);
                    PathNode quadTo = new PathNode.QuadTo(m17387r5[0], m17387r5[1], m17387r5[2], m17387r5[3]);
                    if ((quadTo instanceof PathNode.MoveTo) && nextInt14 > 0) {
                        quadTo = new PathNode.LineTo(m17387r5[0], m17387r5[1]);
                    } else if ((quadTo instanceof PathNode.RelativeMoveTo) && nextInt14 > 0) {
                        quadTo = new PathNode.RelativeLineTo(m17387r5[0], m17387r5[1]);
                    }
                    arrayList.add(quadTo);
                }
            } else if (c == 't') {
                m16901u4 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 2), 2);
                m17154x4 = C37566w.m17154x(m16901u4, 10);
                arrayList = new ArrayList(m17154x4);
                Iterator<Integer> it15 = m16901u4.iterator();
                while (it15.hasNext()) {
                    int nextInt15 = ((PrimitiveIterators) it15).nextInt();
                    m17387r4 = _ArraysJvm.m17387r(args, nextInt15, nextInt15 + 2);
                    PathNode relativeReflectiveQuadTo = new PathNode.RelativeReflectiveQuadTo(m17387r4[0], m17387r4[1]);
                    if ((relativeReflectiveQuadTo instanceof PathNode.MoveTo) && nextInt15 > 0) {
                        relativeReflectiveQuadTo = new PathNode.LineTo(m17387r4[0], m17387r4[1]);
                    } else if ((relativeReflectiveQuadTo instanceof PathNode.RelativeMoveTo) && nextInt15 > 0) {
                        relativeReflectiveQuadTo = new PathNode.RelativeLineTo(m17387r4[0], m17387r4[1]);
                    }
                    arrayList.add(relativeReflectiveQuadTo);
                }
            } else if (c == 'T') {
                m16901u3 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 2), 2);
                m17154x3 = C37566w.m17154x(m16901u3, 10);
                arrayList = new ArrayList(m17154x3);
                Iterator<Integer> it16 = m16901u3.iterator();
                while (it16.hasNext()) {
                    int nextInt16 = ((PrimitiveIterators) it16).nextInt();
                    m17387r3 = _ArraysJvm.m17387r(args, nextInt16, nextInt16 + 2);
                    PathNode reflectiveQuadTo = new PathNode.ReflectiveQuadTo(m17387r3[0], m17387r3[1]);
                    if ((reflectiveQuadTo instanceof PathNode.MoveTo) && nextInt16 > 0) {
                        reflectiveQuadTo = new PathNode.LineTo(m17387r3[0], m17387r3[1]);
                    } else if ((reflectiveQuadTo instanceof PathNode.RelativeMoveTo) && nextInt16 > 0) {
                        reflectiveQuadTo = new PathNode.RelativeLineTo(m17387r3[0], m17387r3[1]);
                    }
                    arrayList.add(reflectiveQuadTo);
                }
            } else if (c == 'a') {
                m16901u2 = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 7), 7);
                m17154x2 = C37566w.m17154x(m16901u2, 10);
                arrayList = new ArrayList(m17154x2);
                Iterator<Integer> it17 = m16901u2.iterator();
                while (it17.hasNext()) {
                    int nextInt17 = ((PrimitiveIterators) it17).nextInt();
                    m17387r2 = _ArraysJvm.m17387r(args, nextInt17, nextInt17 + 7);
                    float f = m17387r2[0];
                    float f2 = m17387r2[1];
                    float f3 = m17387r2[2];
                    if (Float.compare(m17387r2[3], 0.0f) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (Float.compare(m17387r2[4], 0.0f) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    PathNode relativeArcTo = new PathNode.RelativeArcTo(f, f2, f3, z4, z5, m17387r2[5], m17387r2[6]);
                    if ((relativeArcTo instanceof PathNode.MoveTo) && nextInt17 > 0) {
                        relativeArcTo = new PathNode.LineTo(m17387r2[0], m17387r2[1]);
                    } else if ((relativeArcTo instanceof PathNode.RelativeMoveTo) && nextInt17 > 0) {
                        relativeArcTo = new PathNode.RelativeLineTo(m17387r2[0], m17387r2[1]);
                    }
                    arrayList.add(relativeArcTo);
                }
            } else if (c == 'A') {
                m16901u = _Ranges.m16901u(new PrimitiveRanges(0, args.length - 7), 7);
                m17154x = C37566w.m17154x(m16901u, 10);
                arrayList = new ArrayList(m17154x);
                Iterator<Integer> it18 = m16901u.iterator();
                while (it18.hasNext()) {
                    int nextInt18 = ((PrimitiveIterators) it18).nextInt();
                    m17387r = _ArraysJvm.m17387r(args, nextInt18, nextInt18 + 7);
                    float f4 = m17387r[0];
                    float f5 = m17387r[1];
                    float f6 = m17387r[2];
                    if (Float.compare(m17387r[3], 0.0f) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (Float.compare(m17387r[4], 0.0f) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    PathNode arcTo = new PathNode.ArcTo(f4, f5, f6, z2, z3, m17387r[5], m17387r[6]);
                    if ((arcTo instanceof PathNode.MoveTo) && nextInt18 > 0) {
                        arcTo = new PathNode.LineTo(m17387r[0], m17387r[1]);
                    } else if ((arcTo instanceof PathNode.RelativeMoveTo) && nextInt18 > 0) {
                        arcTo = new PathNode.RelativeLineTo(m17387r[0], m17387r[1]);
                    }
                    arrayList.add(arcTo);
                }
            } else {
                throw new IllegalArgumentException("Unknown command for: " + c);
            }
        }
        return arrayList;
    }
}
