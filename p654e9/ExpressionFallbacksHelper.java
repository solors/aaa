package p654e9;

import kotlin.Metadata;
import p656eb.ParsingException;
import p656eb.ParsingExceptionReason;

@Metadata
/* renamed from: e9.a */
/* loaded from: classes8.dex */
public final class ExpressionFallbacksHelper {
    /* renamed from: a */
    public static final /* synthetic */ boolean m25441a(ParsingException parsingException) {
        return m25440b(parsingException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m25440b(ParsingException parsingException) {
        if (parsingException.m25391b() != ParsingExceptionReason.MISSING_VARIABLE && parsingException.m25391b() != ParsingExceptionReason.INVALID_VALUE && parsingException.m25391b() != ParsingExceptionReason.TYPE_MISMATCH) {
            return false;
        }
        return true;
    }
}
