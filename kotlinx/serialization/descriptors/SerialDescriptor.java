package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import org.jetbrains.annotations.NotNull;
import p851qe.AbstractC39408h;

/* compiled from: SerialDescriptor.kt */
@Metadata
/* loaded from: classes8.dex */
public interface SerialDescriptor {

    /* compiled from: SerialDescriptor.kt */
    @Metadata
    /* renamed from: kotlinx.serialization.descriptors.SerialDescriptor$a */
    /* loaded from: classes8.dex */
    public static final class C37827a {
        @NotNull
        /* renamed from: a */
        public static List<Annotation> m16056a(@NotNull SerialDescriptor serialDescriptor) {
            List<Annotation> m17166m;
            m17166m = C37563v.m17166m();
            return m17166m;
        }

        /* renamed from: b */
        public static boolean m16055b(@NotNull SerialDescriptor serialDescriptor) {
            return false;
        }

        /* renamed from: c */
        public static boolean m16054c(@NotNull SerialDescriptor serialDescriptor) {
            return false;
        }
    }

    /* renamed from: b */
    boolean mo12265b();

    /* renamed from: c */
    int mo12264c(@NotNull String str);

    @NotNull
    /* renamed from: d */
    SerialDescriptor mo12263d(int i);

    /* renamed from: e */
    int mo12262e();

    @NotNull
    /* renamed from: f */
    String mo12261f(int i);

    @NotNull
    /* renamed from: g */
    List<Annotation> mo12260g(int i);

    @NotNull
    List<Annotation> getAnnotations();

    @NotNull
    AbstractC39408h getKind();

    @NotNull
    /* renamed from: h */
    String mo12259h();

    /* renamed from: i */
    boolean mo12258i(int i);

    boolean isInline();
}
