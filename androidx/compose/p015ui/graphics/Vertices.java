package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Vertices.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.Vertices */
/* loaded from: classes.dex */
public final class Vertices {
    @NotNull
    private final int[] colors;
    @NotNull
    private final short[] indices;
    @NotNull
    private final float[] positions;
    @NotNull
    private final float[] textureCoordinates;
    private final int vertexMode;

    public /* synthetic */ Vertices(int i, List list, List list2, List list3, List list4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, list2, list3, list4);
    }

    private final int[] encodeColorList(List<Color> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ColorKt.m107582toArgb8_81llA(list.get(i).m107537unboximpl());
        }
        return iArr;
    }

    private final float[] encodePointList(List<Offset> list) {
        float m107292getYimpl;
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            long m107301unboximpl = list.get(i / 2).m107301unboximpl();
            if (i % 2 == 0) {
                m107292getYimpl = Offset.m107291getXimpl(m107301unboximpl);
            } else {
                m107292getYimpl = Offset.m107292getYimpl(m107301unboximpl);
            }
            fArr[i] = m107292getYimpl;
        }
        return fArr;
    }

    @NotNull
    public final int[] getColors() {
        return this.colors;
    }

    @NotNull
    public final short[] getIndices() {
        return this.indices;
    }

    @NotNull
    public final float[] getPositions() {
        return this.positions;
    }

    @NotNull
    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    /* renamed from: getVertexMode-c2xauaI */
    public final int m107880getVertexModec2xauaI() {
        return this.vertexMode;
    }

    private Vertices(int i, List<Offset> list, List<Offset> list2, List<Color> list3, List<Integer> list4) {
        boolean z;
        this.vertexMode = i;
        Vertices$outOfBounds$1 vertices$outOfBounds$1 = new Vertices$outOfBounds$1(list);
        if (list2.size() == list.size()) {
            if (list3.size() == list.size()) {
                int size = list4.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    } else if (vertices$outOfBounds$1.invoke((Vertices$outOfBounds$1) list4.get(i2)).booleanValue()) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    this.positions = encodePointList(list);
                    this.textureCoordinates = encodePointList(list2);
                    this.colors = encodeColorList(list3);
                    int size2 = list4.size();
                    short[] sArr = new short[size2];
                    for (int i3 = 0; i3 < size2; i3++) {
                        sArr[i3] = (short) list4.get(i3).intValue();
                    }
                    this.indices = sArr;
                    return;
                }
                throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
            }
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
    }
}
