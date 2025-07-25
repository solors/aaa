package p1077ze;

import com.ironsource.C20517nb;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ze.h */
/* loaded from: classes10.dex */
public final class Challenge {
    @NotNull

    /* renamed from: a */
    private final String f119138a;
    @NotNull

    /* renamed from: b */
    private final Map<String, String> f119139b;

    public Challenge(@NotNull String scheme, @NotNull Map<String, String> authParams) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.f119138a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                lowerCase = null;
            } else {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = key.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f119139b = unmodifiableMap;
    }

    @NotNull
    /* renamed from: a */
    public final Charset m318a() {
        String str = this.f119139b.get(C20517nb.f52166M);
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    @Nullable
    /* renamed from: b */
    public final String m317b() {
        return this.f119139b.get("realm");
    }

    @NotNull
    /* renamed from: c */
    public final String m316c() {
        return this.f119138a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (Intrinsics.m17075f(challenge.f119138a, this.f119138a) && Intrinsics.m17075f(challenge.f119139b, this.f119139b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f119138a.hashCode()) * 31) + this.f119139b.hashCode();
    }

    @NotNull
    public String toString() {
        return this.f119138a + " authParams=" + this.f119139b;
    }
}
