package p660f0;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.IOException;
import p001a0.DocumentData;
import p677g0.AbstractC33178c;

/* renamed from: f0.h */
/* loaded from: classes2.dex */
public class DocumentDataParser implements ValueParser<DocumentData> {

    /* renamed from: a */
    public static final DocumentDataParser f90252a = new DocumentDataParser();

    /* renamed from: b */
    private static final AbstractC33178c.C33179a f90253b = AbstractC33178c.C33179a.m24520a("t", InneractiveMediationDefs.GENDER_FEMALE, "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private DocumentDataParser() {
    }

    @Override // p660f0.ValueParser
    /* renamed from: b */
    public DocumentData mo24962a(AbstractC33178c abstractC33178c, float f) throws IOException {
        DocumentData.EnumC0002a enumC0002a = DocumentData.EnumC0002a.CENTER;
        abstractC33178c.mo24503e();
        DocumentData.EnumC0002a enumC0002a2 = enumC0002a;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (abstractC33178c.mo24500i()) {
            switch (abstractC33178c.mo24493v(f90253b)) {
                case 0:
                    str = abstractC33178c.mo24495r();
                    break;
                case 1:
                    str2 = abstractC33178c.mo24495r();
                    break;
                case 2:
                    f2 = (float) abstractC33178c.mo24498l();
                    break;
                case 3:
                    int mo24497m = abstractC33178c.mo24497m();
                    enumC0002a2 = DocumentData.EnumC0002a.CENTER;
                    if (mo24497m <= enumC0002a2.ordinal() && mo24497m >= 0) {
                        enumC0002a2 = DocumentData.EnumC0002a.values()[mo24497m];
                        break;
                    }
                    break;
                case 4:
                    i = abstractC33178c.mo24497m();
                    break;
                case 5:
                    f3 = (float) abstractC33178c.mo24498l();
                    break;
                case 6:
                    f4 = (float) abstractC33178c.mo24498l();
                    break;
                case 7:
                    i2 = C33073p.m24988d(abstractC33178c);
                    break;
                case 8:
                    i3 = C33073p.m24988d(abstractC33178c);
                    break;
                case 9:
                    f5 = (float) abstractC33178c.mo24498l();
                    break;
                case 10:
                    z = abstractC33178c.mo24499k();
                    break;
                default:
                    abstractC33178c.mo24492w();
                    abstractC33178c.mo24491x();
                    break;
            }
        }
        abstractC33178c.mo24501h();
        return new DocumentData(str, str2, f2, enumC0002a2, i, f3, f4, i2, i3, f5, z);
    }
}
