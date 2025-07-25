package androidx.window.core;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: Version.kt */
@Metadata
/* loaded from: classes2.dex */
public final class Version implements Comparable<Version> {
    @NotNull
    private static final Version CURRENT;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Version UNKNOWN = new Version(0, 0, 0, "");
    @NotNull
    private static final Version VERSION_0_1 = new Version(0, 1, 0, "");
    @NotNull
    private static final Version VERSION_1_0;
    @NotNull
    private static final String VERSION_PATTERN_STRING = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";
    @NotNull
    private final InterfaceC38501j bigInteger$delegate;
    @NotNull
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    /* compiled from: Version.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Version getCURRENT() {
            return Version.CURRENT;
        }

        @NotNull
        public final Version getUNKNOWN() {
            return Version.UNKNOWN;
        }

        @NotNull
        public final Version getVERSION_0_1() {
            return Version.VERSION_0_1;
        }

        @NotNull
        public final Version getVERSION_1_0() {
            return Version.VERSION_1_0;
        }

        @Nullable
        public final Version parse(@Nullable String str) {
            boolean m16635B;
            Integer valueOf;
            Integer valueOf2;
            Integer valueOf3;
            String str2;
            if (str != null) {
                m16635B = StringsJVM.m16635B(str);
                if (!m16635B) {
                    Matcher matcher = Pattern.compile(Version.VERSION_PATTERN_STRING).matcher(str);
                    if (!matcher.matches()) {
                        return null;
                    }
                    String group = matcher.group(1);
                    if (group == null) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(Integer.parseInt(group));
                    }
                    if (valueOf == null) {
                        return null;
                    }
                    int intValue = valueOf.intValue();
                    String group2 = matcher.group(2);
                    if (group2 == null) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(Integer.parseInt(group2));
                    }
                    if (valueOf2 == null) {
                        return null;
                    }
                    int intValue2 = valueOf2.intValue();
                    String group3 = matcher.group(3);
                    if (group3 == null) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(Integer.parseInt(group3));
                    }
                    if (valueOf3 == null) {
                        return null;
                    }
                    int intValue3 = valueOf3.intValue();
                    if (matcher.group(4) != null) {
                        str2 = matcher.group(4);
                    } else {
                        str2 = "";
                    }
                    String description = str2;
                    Intrinsics.checkNotNullExpressionValue(description, "description");
                    return new Version(intValue, intValue2, intValue3, description, null);
                }
            }
            return null;
        }
    }

    static {
        Version version = new Version(1, 0, 0, "");
        VERSION_1_0 = version;
        CURRENT = version;
    }

    public /* synthetic */ Version(int i, int i2, int i3, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str);
    }

    private final BigInteger getBigInteger() {
        Object value = this.bigInteger$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    @Nullable
    public static final Version parse(@Nullable String str) {
        return Companion.parse(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        if (this.major != version.major || this.minor != version.minor || this.patch != version.patch) {
            return false;
        }
        return true;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    @NotNull
    public String toString() {
        boolean m16635B;
        String str;
        m16635B = StringsJVM.m16635B(this.description);
        if (!m16635B) {
            str = Intrinsics.m17064q("-", this.description);
        } else {
            str = "";
        }
        return this.major + '.' + this.minor + '.' + this.patch + str;
    }

    private Version(int i, int i2, int i3, String str) {
        InterfaceC38501j m14554a;
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        this.description = str;
        m14554a = LazyJVM.m14554a(new Version$bigInteger$2(this));
        this.bigInteger$delegate = m14554a;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Version other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return getBigInteger().compareTo(other.getBigInteger());
    }
}
