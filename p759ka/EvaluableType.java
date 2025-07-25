package p759ka;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ka.d */
/* loaded from: classes8.dex */
public enum EvaluableType {
    INTEGER("Integer"),
    NUMBER("Number"),
    BOOLEAN("Boolean"),
    STRING("String"),
    DATETIME(ExifInterface.TAG_DATETIME),
    COLOR("Color"),
    URL("Url"),
    DICT("Dict"),
    ARRAY("Array");
    
    @NotNull

    /* renamed from: c */
    public static final C37425a f98769c = new C37425a(null);
    @NotNull

    /* renamed from: b */
    private final String f98780b;

    /* compiled from: EvaluableType.kt */
    @Metadata
    /* renamed from: ka.d$a */
    /* loaded from: classes8.dex */
    public static final class C37425a {
        private C37425a() {
        }

        public /* synthetic */ C37425a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    EvaluableType(String str) {
        this.f98780b = str;
    }

    @NotNull
    /* renamed from: c */
    public final String m18093c() {
        return this.f98780b;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.f98780b;
    }
}
