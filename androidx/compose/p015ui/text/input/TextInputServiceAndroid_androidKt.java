package androidx.compose.p015ui.text.input;

import android.view.inputmethod.EditorInfo;
import androidx.compose.p015ui.text.TextRange;
import androidx.compose.p015ui.text.input.ImeAction;
import androidx.compose.p015ui.text.input.KeyboardCapitalization;
import androidx.compose.p015ui.text.input.KeyboardType;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt */
/* loaded from: classes.dex */
public final class TextInputServiceAndroid_androidKt {
    @NotNull
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    private static final boolean hasFlag(int i, int i2) {
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    public static final void update(@NotNull EditorInfo editorInfo, @NotNull ImeOptions imeOptions, @NotNull TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(editorInfo, "<this>");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        int m109523getImeActioneUduSuo = imeOptions.m109523getImeActioneUduSuo();
        ImeAction.Companion companion = ImeAction.Companion;
        int i = 6;
        if (ImeAction.m109508equalsimpl0(m109523getImeActioneUduSuo, companion.m109512getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i = 0;
            }
        } else if (ImeAction.m109508equalsimpl0(m109523getImeActioneUduSuo, companion.m109516getNoneeUduSuo())) {
            i = 1;
        } else if (ImeAction.m109508equalsimpl0(m109523getImeActioneUduSuo, companion.m109514getGoeUduSuo())) {
            i = 2;
        } else if (ImeAction.m109508equalsimpl0(m109523getImeActioneUduSuo, companion.m109515getNexteUduSuo())) {
            i = 5;
        } else if (ImeAction.m109508equalsimpl0(m109523getImeActioneUduSuo, companion.m109517getPreviouseUduSuo())) {
            i = 7;
        } else if (ImeAction.m109508equalsimpl0(m109523getImeActioneUduSuo, companion.m109518getSearcheUduSuo())) {
            i = 3;
        } else if (ImeAction.m109508equalsimpl0(m109523getImeActioneUduSuo, companion.m109519getSendeUduSuo())) {
            i = 4;
        } else if (!ImeAction.m109508equalsimpl0(m109523getImeActioneUduSuo, companion.m109513getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i;
        int m109524getKeyboardTypePjHm6EE = imeOptions.m109524getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion2 = KeyboardType.Companion;
        if (KeyboardType.m109541equalsimpl0(m109524getKeyboardTypePjHm6EE, companion2.m109552getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m109541equalsimpl0(m109524getKeyboardTypePjHm6EE, companion2.m109545getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m109541equalsimpl0(m109524getKeyboardTypePjHm6EE, companion2.m109548getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m109541equalsimpl0(m109524getKeyboardTypePjHm6EE, companion2.m109551getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m109541equalsimpl0(m109524getKeyboardTypePjHm6EE, companion2.m109553getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m109541equalsimpl0(m109524getKeyboardTypePjHm6EE, companion2.m109547getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m109541equalsimpl0(m109524getKeyboardTypePjHm6EE, companion2.m109550getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m109541equalsimpl0(m109524getKeyboardTypePjHm6EE, companion2.m109549getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.m109541equalsimpl0(m109524getKeyboardTypePjHm6EE, companion2.m109546getDecimalPjHm6EE())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m109508equalsimpl0(imeOptions.m109523getImeActioneUduSuo(), companion.m109512getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int m109522getCapitalizationIUNYP9k = imeOptions.m109522getCapitalizationIUNYP9k();
            KeyboardCapitalization.Companion companion3 = KeyboardCapitalization.Companion;
            if (KeyboardCapitalization.m109530equalsimpl0(m109522getCapitalizationIUNYP9k, companion3.m109534getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m109530equalsimpl0(m109522getCapitalizationIUNYP9k, companion3.m109537getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m109530equalsimpl0(m109522getCapitalizationIUNYP9k, companion3.m109536getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m109382getStartimpl(textFieldValue.m109559getSelectiond9O1mEE());
        editorInfo.initialSelEnd = TextRange.m109377getEndimpl(textFieldValue.m109559getSelectiond9O1mEE());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }
}
