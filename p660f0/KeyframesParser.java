package p660f0;

import com.airbnb.lottie.LottieComposition;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p1048y.PathKeyframe;
import p677g0.AbstractC33178c;
import p707i0.Keyframe;

/* renamed from: f0.r */
/* loaded from: classes2.dex */
class KeyframesParser {

    /* renamed from: a */
    static AbstractC33178c.C33179a f90274a = AbstractC33178c.C33179a.m24520a("k");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> List<Keyframe<T>> m24976a(AbstractC33178c abstractC33178c, LottieComposition lottieComposition, float f, ValueParser<T> valueParser, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (abstractC33178c.mo24494t() == AbstractC33178c.EnumC33180b.STRING) {
            lottieComposition.m103398a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC33178c.mo24503e();
        while (abstractC33178c.mo24500i()) {
            if (abstractC33178c.mo24493v(f90274a) != 0) {
                abstractC33178c.mo24491x();
            } else if (abstractC33178c.mo24494t() == AbstractC33178c.EnumC33180b.BEGIN_ARRAY) {
                abstractC33178c.mo24504b();
                if (abstractC33178c.mo24494t() == AbstractC33178c.EnumC33180b.NUMBER) {
                    arrayList.add(KeyframeParser.m24982c(abstractC33178c, lottieComposition, f, valueParser, false, z));
                } else {
                    while (abstractC33178c.mo24500i()) {
                        arrayList.add(KeyframeParser.m24982c(abstractC33178c, lottieComposition, f, valueParser, true, z));
                    }
                }
                abstractC33178c.mo24502f();
            } else {
                arrayList.add(KeyframeParser.m24982c(abstractC33178c, lottieComposition, f, valueParser, false, z));
            }
        }
        abstractC33178c.mo24501h();
        m24975b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static <T> void m24975b(List<? extends Keyframe<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            Keyframe<T> keyframe = list.get(i2);
            i2++;
            Keyframe<T> keyframe2 = list.get(i2);
            keyframe.f91837h = Float.valueOf(keyframe2.f91836g);
            if (keyframe.f91832c == null && (t = keyframe2.f91831b) != null) {
                keyframe.f91832c = t;
                if (keyframe instanceof PathKeyframe) {
                    ((PathKeyframe) keyframe).m1133i();
                }
            }
        }
        Keyframe<T> keyframe3 = list.get(i);
        if ((keyframe3.f91831b == null || keyframe3.f91832c == null) && list.size() > 1) {
            list.remove(keyframe3);
        }
    }
}
