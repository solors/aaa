package sg.bigo.ads.core.p964e.p965a;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/* renamed from: sg.bigo.ads.core.e.a.m */
/* loaded from: classes10.dex */
public final class C44211m {

    /* renamed from: a */
    Document f116040a;

    /* renamed from: a */
    public final List<C44200d> m3666a() {
        ArrayList arrayList = new ArrayList();
        Document document = this.f116040a;
        if (document == null) {
            return arrayList;
        }
        NodeList elementsByTagName = document.getElementsByTagName("Ad");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            arrayList.add(new C44200d(elementsByTagName.item(i)));
        }
        return arrayList;
    }
}
