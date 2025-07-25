package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.input.ImeAction;
import androidx.compose.p015ui.text.input.ImeOptions;
import androidx.compose.p015ui.text.input.KeyboardCapitalization;
import androidx.compose.p015ui.text.input.KeyboardType;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KeyboardOptions.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class KeyboardOptions {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final KeyboardOptions Default = new KeyboardOptions(0, false, 0, 0, 15, null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final int imeAction;
    private final int keyboardType;

    /* compiled from: KeyboardOptions.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KeyboardOptions getDefault() {
            return KeyboardOptions.Default;
        }
    }

    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, i2, i3);
    }

    /* renamed from: copy-3m2b7yw$default  reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m106598copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i, boolean z, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = keyboardOptions.capitalization;
        }
        if ((i4 & 2) != 0) {
            z = keyboardOptions.autoCorrect;
        }
        if ((i4 & 4) != 0) {
            i2 = keyboardOptions.keyboardType;
        }
        if ((i4 & 8) != 0) {
            i3 = keyboardOptions.imeAction;
        }
        return keyboardOptions.m106599copy3m2b7yw(i, z, i2, i3);
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation_release$default(KeyboardOptions keyboardOptions, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ImeOptions.Companion.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation_release(z);
    }

    @NotNull
    /* renamed from: copy-3m2b7yw  reason: not valid java name */
    public final KeyboardOptions m106599copy3m2b7yw(int i, boolean z, int i2, int i3) {
        return new KeyboardOptions(i, z, i2, i3, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
        if (KeyboardCapitalization.m109530equalsimpl0(this.capitalization, keyboardOptions.capitalization) && this.autoCorrect == keyboardOptions.autoCorrect && KeyboardType.m109541equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m109508equalsimpl0(this.imeAction, keyboardOptions.imeAction)) {
            return true;
        }
        return false;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getCapitalization-IUNYP9k  reason: not valid java name */
    public final int m106600getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    /* renamed from: getImeAction-eUduSuo  reason: not valid java name */
    public final int m106601getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getKeyboardType-PjHm6EE  reason: not valid java name */
    public final int m106602getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    public int hashCode() {
        return (((((KeyboardCapitalization.m109531hashCodeimpl(this.capitalization) * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + KeyboardType.m109542hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m109509hashCodeimpl(this.imeAction);
    }

    @NotNull
    public final ImeOptions toImeOptions$foundation_release(boolean z) {
        return new ImeOptions(z, this.capitalization, this.autoCorrect, this.keyboardType, this.imeAction, null);
    }

    @NotNull
    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m109532toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m109543toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m109510toStringimpl(this.imeAction)) + ')';
    }

    private KeyboardOptions(int i, boolean z, int i2, int i3) {
        this.capitalization = i;
        this.autoCorrect = z;
        this.keyboardType = i2;
        this.imeAction = i3;
    }

    public /* synthetic */ KeyboardOptions(int i, boolean z, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? KeyboardCapitalization.Companion.m109535getNoneIUNYP9k() : i, (i4 & 2) != 0 ? true : z, (i4 & 4) != 0 ? KeyboardType.Companion.m109552getTextPjHm6EE() : i2, (i4 & 8) != 0 ? ImeAction.Companion.m109512getDefaulteUduSuo() : i3, null);
    }
}
