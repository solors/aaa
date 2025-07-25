package se;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: JsonExceptions.kt */
@Metadata
/* renamed from: se.k0 */
/* loaded from: classes8.dex */
public final class C42710k0 {
    @NotNull
    /* renamed from: a */
    public static final JsonExceptions m6758a(@NotNull Number value, @NotNull String key, @NotNull String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return m6754e(-1, m6748k(value, key, output));
    }

    @NotNull
    /* renamed from: b */
    public static final C42705i0 m6757b(@NotNull Number value, @NotNull String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new C42705i0("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m6750i(output, 0, 1, null)));
    }

    @NotNull
    /* renamed from: c */
    public static final C42705i0 m6756c(@NotNull Number value, @NotNull String key, @NotNull String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return new C42705i0(m6748k(value, key, output));
    }

    @NotNull
    /* renamed from: d */
    public static final C42705i0 m6755d(@NotNull SerialDescriptor keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new C42705i0("Value of type '" + keyDescriptor.mo12259h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    @NotNull
    /* renamed from: e */
    public static final JsonExceptions m6754e(int i, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i >= 0) {
            message = "Unexpected JSON token at offset " + i + ": " + message;
        }
        return new JsonExceptions(message);
    }

    @NotNull
    /* renamed from: f */
    public static final JsonExceptions m6753f(int i, @NotNull String message, @NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return m6754e(i, message + "\nJSON input: " + ((Object) m6751h(input, i)));
    }

    @NotNull
    /* renamed from: g */
    public static final JsonExceptions m6752g(@NotNull String key, @NotNull String input) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(input, "input");
        return m6754e(-1, "Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) m6750i(input, 0, 1, null)));
    }

    /* renamed from: h */
    private static final CharSequence m6751h(CharSequence charSequence, int i) {
        String str;
        int m16917e;
        int m16912j;
        int length;
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str2 = ".....";
        if (i == -1) {
            if (charSequence.length() - 60 <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i2 = i - 30;
        int i3 = i + 30;
        if (i2 > 0) {
            str = ".....";
        } else {
            str = "";
        }
        if (i3 >= charSequence.length()) {
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        m16917e = _Ranges.m16917e(i2, 0);
        m16912j = _Ranges.m16912j(i3, charSequence.length());
        sb2.append(charSequence.subSequence(m16917e, m16912j).toString());
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: i */
    static /* synthetic */ CharSequence m6750i(CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return m6751h(charSequence, i);
    }

    @NotNull
    /* renamed from: j */
    public static final Void m6749j(@NotNull AbstractJsonLexer abstractJsonLexer, @NotNull Number result) {
        Intrinsics.checkNotNullParameter(abstractJsonLexer, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        AbstractJsonLexer.m6929y(abstractJsonLexer, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new ExceptionsH();
    }

    /* renamed from: k */
    private static final String m6748k(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m6750i(str2, 0, 1, null));
    }
}
