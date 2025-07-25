package p660f0;

import android.graphics.PointF;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p001a0.CubicCurveData;
import p035c0.ShapeData;
import p677g0.AbstractC33178c;
import p690h0.MiscUtils;

/* renamed from: f0.d0 */
/* loaded from: classes2.dex */
public class ShapeDataParser implements ValueParser<ShapeData> {

    /* renamed from: a */
    public static final ShapeDataParser f90244a = new ShapeDataParser();

    /* renamed from: b */
    private static final AbstractC33178c.C33179a f90245b = AbstractC33178c.C33179a.m24520a(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "v", "i", "o");

    private ShapeDataParser() {
    }

    @Override // p660f0.ValueParser
    /* renamed from: b */
    public ShapeData mo24962a(AbstractC33178c abstractC33178c, float f) throws IOException {
        if (abstractC33178c.mo24494t() == AbstractC33178c.EnumC33180b.BEGIN_ARRAY) {
            abstractC33178c.mo24504b();
        }
        abstractC33178c.mo24503e();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (abstractC33178c.mo24500i()) {
            int mo24493v = abstractC33178c.mo24493v(f90245b);
            if (mo24493v != 0) {
                if (mo24493v != 1) {
                    if (mo24493v != 2) {
                        if (mo24493v != 3) {
                            abstractC33178c.mo24492w();
                            abstractC33178c.mo24491x();
                        } else {
                            list3 = C33073p.m24986f(abstractC33178c, f);
                        }
                    } else {
                        list2 = C33073p.m24986f(abstractC33178c, f);
                    }
                } else {
                    list = C33073p.m24986f(abstractC33178c, f);
                }
            } else {
                z = abstractC33178c.mo24499k();
            }
        }
        abstractC33178c.mo24501h();
        if (abstractC33178c.mo24494t() == AbstractC33178c.EnumC33180b.END_ARRAY) {
            abstractC33178c.mo24502f();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new ShapeData(new PointF(), false, Collections.emptyList());
            }
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new CubicCurveData(MiscUtils.m23875a(list.get(i2), list3.get(i2)), MiscUtils.m23875a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new CubicCurveData(MiscUtils.m23875a(list.get(i3), list3.get(i3)), MiscUtils.m23875a(pointF3, list2.get(0)), pointF3));
            }
            return new ShapeData(pointF, z, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
