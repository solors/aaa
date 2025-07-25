package kotlin.text;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: kotlin.text.g */
/* loaded from: classes7.dex */
public final class StringNumberConversionsJVM {
    @NotNull

    /* renamed from: a */
    public static final StringNumberConversionsJVM f99485a = new StringNumberConversionsJVM();
    @NotNull

    /* renamed from: b */
    public static final Regex f99486b;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        f99486b = new Regex("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private StringNumberConversionsJVM() {
    }
}
