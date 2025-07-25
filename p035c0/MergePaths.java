package p035c0;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import p1032x.InterfaceC44659c;
import p1032x.MergePathsContent;
import p629d0.BaseLayer;
import p690h0.C33453f;

/* renamed from: c0.h */
/* loaded from: classes2.dex */
public class MergePaths implements ContentModel {

    /* renamed from: a */
    private final String f1751a;

    /* renamed from: b */
    private final EnumC3406a f1752b;

    /* renamed from: c */
    private final boolean f1753c;

    /* compiled from: MergePaths.java */
    /* renamed from: c0.h$a */
    /* loaded from: classes2.dex */
    public enum EnumC3406a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        /* renamed from: b */
        public static EnumC3406a m103742b(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public MergePaths(String str, EnumC3406a enumC3406a, boolean z) {
        this.f1751a = str;
        this.f1752b = enumC3406a;
        this.f1753c = z;
    }

    @Override // p035c0.ContentModel
    @Nullable
    /* renamed from: a */
    public InterfaceC44659c mo103692a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        if (!lottieDrawable.m103283r()) {
            C33453f.m23901c("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new MergePathsContent(this);
    }

    /* renamed from: b */
    public EnumC3406a m103745b() {
        return this.f1752b;
    }

    /* renamed from: c */
    public String m103744c() {
        return this.f1751a;
    }

    /* renamed from: d */
    public boolean m103743d() {
        return this.f1753c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f1752b + '}';
    }
}
