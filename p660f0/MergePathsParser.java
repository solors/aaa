package p660f0;

import java.io.IOException;
import p035c0.MergePaths;
import p677g0.AbstractC33178c;

/* renamed from: f0.v */
/* loaded from: classes2.dex */
class MergePathsParser {

    /* renamed from: a */
    private static final AbstractC33178c.C33179a f90283a = AbstractC33178c.C33179a.m24520a("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static MergePaths m24965a(AbstractC33178c abstractC33178c) throws IOException {
        String str = null;
        boolean z = false;
        MergePaths.EnumC3406a enumC3406a = null;
        while (abstractC33178c.mo24500i()) {
            int mo24493v = abstractC33178c.mo24493v(f90283a);
            if (mo24493v != 0) {
                if (mo24493v != 1) {
                    if (mo24493v != 2) {
                        abstractC33178c.mo24492w();
                        abstractC33178c.mo24491x();
                    } else {
                        z = abstractC33178c.mo24499k();
                    }
                } else {
                    enumC3406a = MergePaths.EnumC3406a.m103742b(abstractC33178c.mo24497m());
                }
            } else {
                str = abstractC33178c.mo24495r();
            }
        }
        return new MergePaths(str, enumC3406a, z);
    }
}
