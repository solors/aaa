package p656eb;

import com.amazon.aps.shared.util.APSSharedUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text._Strings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p1059ya.C45074h;
import p1059ya.C45076j;
import p1059ya.JsonNode;

/* compiled from: ParsingException.kt */
@Metadata
/* renamed from: eb.h */
/* loaded from: classes8.dex */
public final class C32965h {
    @NotNull
    /* renamed from: a */
    public static final ParsingException m25389a(@NotNull JSONObject json, @NotNull String key, @NotNull ParsingException cause) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(cause, "cause");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.DEPENDENCY_FAILED;
        return new ParsingException(parsingExceptionReason, "Value for key '" + key + "' is failed to create", cause, new C45074h(json), C45076j.m996e(json, 0, 1, null));
    }

    @NotNull
    /* renamed from: b */
    public static final <T> ParsingException m25388b(@NotNull String path, T t) {
        Intrinsics.checkNotNullParameter(path, "path");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        return new ParsingException(parsingExceptionReason, "Value '" + m25373q(t) + "' at path '" + path + "' is not valid", null, null, null, 28, null);
    }

    @NotNull
    /* renamed from: c */
    public static final <T> ParsingException m25387c(@NotNull String key, @NotNull String path, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(path, "path");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        return new ParsingException(parsingExceptionReason, "Value '" + m25373q(t) + "' for key '" + key + "' at path '" + path + "' is not valid", null, null, null, 28, null);
    }

    @NotNull
    /* renamed from: d */
    public static final ParsingException m25386d(@NotNull String expressionKey, @NotNull String rawExpression, @Nullable Object obj, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(expressionKey, "expressionKey");
        Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        return new ParsingException(parsingExceptionReason, "Field '" + expressionKey + "' with expression '" + rawExpression + "' received wrong value: '" + obj + '\'', th, null, null, 24, null);
    }

    @NotNull
    /* renamed from: e */
    public static final <T> ParsingException m25385e(@NotNull JSONArray json, @NotNull String key, int i, T t) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        return new ParsingException(parsingExceptionReason, "Value '" + m25373q(t) + "' at " + i + " position of '" + key + "' is not valid", null, new JsonNode(json), C45076j.m997d(json, 0, 1, null), 4, null);
    }

    @NotNull
    /* renamed from: f */
    public static final <T> ParsingException m25384f(@NotNull JSONArray json, @NotNull String key, int i, T t, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(cause, "cause");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        return new ParsingException(parsingExceptionReason, "Value '" + m25373q(t) + "' at " + i + " position of '" + key + "' is not valid", cause, new JsonNode(json), null, 16, null);
    }

    @NotNull
    /* renamed from: g */
    public static final <T> ParsingException m25383g(@NotNull JSONObject json, @NotNull String key, T t) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        return new ParsingException(parsingExceptionReason, "Value '" + m25373q(t) + "' for key '" + key + "' is not valid", null, new C45074h(json), C45076j.m996e(json, 0, 1, null), 4, null);
    }

    @NotNull
    /* renamed from: h */
    public static final <T> ParsingException m25382h(@NotNull JSONObject json, @NotNull String key, T t, @NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(cause, "cause");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        return new ParsingException(parsingExceptionReason, "Value '" + m25373q(t) + "' for key '" + key + "' is not valid", cause, new C45074h(json), null, 16, null);
    }

    @NotNull
    /* renamed from: i */
    public static final ParsingException m25381i(@NotNull String key, @NotNull String path) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(path, "path");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.MISSING_VALUE;
        return new ParsingException(parsingExceptionReason, "Value for key '" + key + "' at path '" + path + "' is missing", null, null, null, 28, null);
    }

    @NotNull
    /* renamed from: j */
    public static final ParsingException m25380j(@NotNull JSONObject json, @NotNull String key) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.MISSING_VALUE;
        return new ParsingException(parsingExceptionReason, "Value for key '" + key + "' is missing", null, new C45074h(json), C45076j.m996e(json, 0, 1, null), 4, null);
    }

    @NotNull
    /* renamed from: k */
    public static final ParsingException m25379k(@NotNull String key, @NotNull String expression, @NotNull String variableName, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.MISSING_VARIABLE;
        return new ParsingException(parsingExceptionReason, "Undefined variable '" + variableName + "' at \"" + key + "\": \"" + expression + '\"', th, null, null, 24, null);
    }

    @NotNull
    /* renamed from: l */
    public static final ParsingException m25378l(@NotNull String variableName, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(variableName, "variableName");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.MISSING_VARIABLE;
        return new ParsingException(parsingExceptionReason, "No variable could be resolved for '" + variableName, th, null, null, 24, null);
    }

    /* renamed from: m */
    public static /* synthetic */ ParsingException m25377m(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        return m25378l(str, th);
    }

    @NotNull
    /* renamed from: n */
    public static final <T> ParsingException m25376n(@NotNull String key, T t, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(key, "key");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.INVALID_VALUE;
        return new ParsingException(parsingExceptionReason, "Value '" + m25373q(t) + "' for key '" + key + "' could not be resolved", th, null, null, 24, null);
    }

    /* renamed from: o */
    public static /* synthetic */ ParsingException m25375o(String str, Object obj, Throwable th, int i, Object obj2) {
        if ((i & 4) != 0) {
            th = null;
        }
        return m25376n(str, obj, th);
    }

    @NotNull
    /* renamed from: p */
    public static final ParsingException m25374p(@NotNull JSONObject json, @NotNull String templateId) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.MISSING_TEMPLATE;
        return new ParsingException(parsingExceptionReason, "Template '" + templateId + "' is missing!", null, new C45074h(json), C45076j.m996e(json, 0, 1, null), 4, null);
    }

    /* renamed from: q */
    private static final String m25373q(Object obj) {
        String m16531o1;
        String valueOf = String.valueOf(obj);
        if (valueOf.length() > 100) {
            StringBuilder sb2 = new StringBuilder();
            m16531o1 = _Strings.m16531o1(valueOf, 97);
            sb2.append(m16531o1);
            sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
            return sb2.toString();
        }
        return valueOf;
    }

    @NotNull
    /* renamed from: r */
    public static final ParsingException m25372r(int i, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.TYPE_MISMATCH;
        return new ParsingException(parsingExceptionReason, "Item builder data at " + i + " position has wrong type: " + value.getClass().getName(), null, null, null, 28, null);
    }

    @NotNull
    /* renamed from: s */
    public static final ParsingException m25371s(@NotNull String expressionKey, @NotNull String rawExpression, @Nullable Object obj, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(expressionKey, "expressionKey");
        Intrinsics.checkNotNullParameter(rawExpression, "rawExpression");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.TYPE_MISMATCH;
        return new ParsingException(parsingExceptionReason, "Expression '" + expressionKey + "': '" + rawExpression + "' received value of wrong type: '" + obj + '\'', th, null, null, 24, null);
    }

    @NotNull
    /* renamed from: t */
    public static final ParsingException m25370t(@NotNull JSONArray json, @NotNull String key, int i, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.TYPE_MISMATCH;
        return new ParsingException(parsingExceptionReason, "Value at " + i + " position of '" + key + "' has wrong type " + value.getClass().getName(), null, new JsonNode(json), C45076j.m997d(json, 0, 1, null), 4, null);
    }

    @NotNull
    /* renamed from: u */
    public static final ParsingException m25369u(@NotNull JSONObject json, @NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ParsingExceptionReason parsingExceptionReason = ParsingExceptionReason.TYPE_MISMATCH;
        return new ParsingException(parsingExceptionReason, "Value for key '" + key + "' has wrong type " + value.getClass().getName(), null, new C45074h(json), C45076j.m996e(json, 0, 1, null), 4, null);
    }

    /* renamed from: v */
    public static /* synthetic */ ParsingException m25368v(String str, String str2, Object obj, Throwable th, int i, Object obj2) {
        if ((i & 8) != 0) {
            th = null;
        }
        return m25371s(str, str2, obj, th);
    }
}
