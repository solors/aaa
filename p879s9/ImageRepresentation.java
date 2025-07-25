package p879s9;

import android.graphics.Bitmap;
import android.graphics.drawable.PictureDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: s9.h */
/* loaded from: classes8.dex */
public interface ImageRepresentation {

    /* compiled from: ImageRepresentation.kt */
    @Metadata
    /* renamed from: s9.h$a */
    /* loaded from: classes8.dex */
    public static final class C39630a implements ImageRepresentation {
        @NotNull

        /* renamed from: a */
        private final Bitmap f104114a;

        private /* synthetic */ C39630a(Bitmap bitmap) {
            this.f104114a = bitmap;
        }

        /* renamed from: a */
        public static final /* synthetic */ C39630a m12042a(Bitmap bitmap) {
            return new C39630a(bitmap);
        }

        @NotNull
        /* renamed from: b */
        public static Bitmap m12041b(@NotNull Bitmap value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        /* renamed from: c */
        public static boolean m12040c(Bitmap bitmap, Object obj) {
            if (!(obj instanceof C39630a) || !Intrinsics.m17075f(bitmap, ((C39630a) obj).m12037f())) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public static int m12039d(Bitmap bitmap) {
            return bitmap.hashCode();
        }

        /* renamed from: e */
        public static String m12038e(Bitmap bitmap) {
            return "Bitmap(value=" + bitmap + ')';
        }

        public boolean equals(Object obj) {
            return m12040c(this.f104114a, obj);
        }

        /* renamed from: f */
        public final /* synthetic */ Bitmap m12037f() {
            return this.f104114a;
        }

        public int hashCode() {
            return m12039d(this.f104114a);
        }

        public String toString() {
            return m12038e(this.f104114a);
        }
    }

    /* compiled from: ImageRepresentation.kt */
    @Metadata
    /* renamed from: s9.h$b */
    /* loaded from: classes8.dex */
    public static final class C39631b implements ImageRepresentation {
        @NotNull

        /* renamed from: a */
        private final PictureDrawable f104115a;

        private /* synthetic */ C39631b(PictureDrawable pictureDrawable) {
            this.f104115a = pictureDrawable;
        }

        /* renamed from: a */
        public static final /* synthetic */ C39631b m12036a(PictureDrawable pictureDrawable) {
            return new C39631b(pictureDrawable);
        }

        @NotNull
        /* renamed from: b */
        public static PictureDrawable m12035b(@NotNull PictureDrawable value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        /* renamed from: c */
        public static boolean m12034c(PictureDrawable pictureDrawable, Object obj) {
            if (!(obj instanceof C39631b) || !Intrinsics.m17075f(pictureDrawable, ((C39631b) obj).m12031f())) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public static int m12033d(PictureDrawable pictureDrawable) {
            return pictureDrawable.hashCode();
        }

        /* renamed from: e */
        public static String m12032e(PictureDrawable pictureDrawable) {
            return "PictureDrawable(value=" + pictureDrawable + ')';
        }

        public boolean equals(Object obj) {
            return m12034c(this.f104115a, obj);
        }

        /* renamed from: f */
        public final /* synthetic */ PictureDrawable m12031f() {
            return this.f104115a;
        }

        public int hashCode() {
            return m12033d(this.f104115a);
        }

        public String toString() {
            return m12032e(this.f104115a);
        }
    }
}
