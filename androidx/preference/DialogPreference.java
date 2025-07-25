package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.TypedArrayUtils;

/* loaded from: classes2.dex */
public abstract class DialogPreference extends Preference {
    private Drawable mDialogIcon;
    private int mDialogLayoutResId;
    private CharSequence mDialogMessage;
    private CharSequence mDialogTitle;
    private CharSequence mNegativeButtonText;
    private CharSequence mPositiveButtonText;

    /* loaded from: classes2.dex */
    public interface TargetFragment {
        @Nullable
        <T extends Preference> T findPreference(@NonNull CharSequence charSequence);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2850R.styleable.DialogPreference, i, i2);
        String string = TypedArrayUtils.getString(obtainStyledAttributes, C2850R.styleable.DialogPreference_dialogTitle, C2850R.styleable.DialogPreference_android_dialogTitle);
        this.mDialogTitle = string;
        if (string == null) {
            this.mDialogTitle = getTitle();
        }
        this.mDialogMessage = TypedArrayUtils.getString(obtainStyledAttributes, C2850R.styleable.DialogPreference_dialogMessage, C2850R.styleable.DialogPreference_android_dialogMessage);
        this.mDialogIcon = TypedArrayUtils.getDrawable(obtainStyledAttributes, C2850R.styleable.DialogPreference_dialogIcon, C2850R.styleable.DialogPreference_android_dialogIcon);
        this.mPositiveButtonText = TypedArrayUtils.getString(obtainStyledAttributes, C2850R.styleable.DialogPreference_positiveButtonText, C2850R.styleable.DialogPreference_android_positiveButtonText);
        this.mNegativeButtonText = TypedArrayUtils.getString(obtainStyledAttributes, C2850R.styleable.DialogPreference_negativeButtonText, C2850R.styleable.DialogPreference_android_negativeButtonText);
        this.mDialogLayoutResId = TypedArrayUtils.getResourceId(obtainStyledAttributes, C2850R.styleable.DialogPreference_dialogLayout, C2850R.styleable.DialogPreference_android_dialogLayout, 0);
        obtainStyledAttributes.recycle();
    }

    @Nullable
    public Drawable getDialogIcon() {
        return this.mDialogIcon;
    }

    public int getDialogLayoutResource() {
        return this.mDialogLayoutResId;
    }

    @Nullable
    public CharSequence getDialogMessage() {
        return this.mDialogMessage;
    }

    @Nullable
    public CharSequence getDialogTitle() {
        return this.mDialogTitle;
    }

    @Nullable
    public CharSequence getNegativeButtonText() {
        return this.mNegativeButtonText;
    }

    @Nullable
    public CharSequence getPositiveButtonText() {
        return this.mPositiveButtonText;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void onClick() {
        getPreferenceManager().showDialog(this);
    }

    public void setDialogIcon(@Nullable Drawable drawable) {
        this.mDialogIcon = drawable;
    }

    public void setDialogLayoutResource(int i) {
        this.mDialogLayoutResId = i;
    }

    public void setDialogMessage(@Nullable CharSequence charSequence) {
        this.mDialogMessage = charSequence;
    }

    public void setDialogTitle(@Nullable CharSequence charSequence) {
        this.mDialogTitle = charSequence;
    }

    public void setNegativeButtonText(@Nullable CharSequence charSequence) {
        this.mNegativeButtonText = charSequence;
    }

    public void setPositiveButtonText(@Nullable CharSequence charSequence) {
        this.mPositiveButtonText = charSequence;
    }

    public void setDialogIcon(int i) {
        this.mDialogIcon = AppCompatResources.getDrawable(getContext(), i);
    }

    public void setDialogMessage(int i) {
        setDialogMessage(getContext().getString(i));
    }

    public void setDialogTitle(int i) {
        setDialogTitle(getContext().getString(i));
    }

    public void setNegativeButtonText(int i) {
        setNegativeButtonText(getContext().getString(i));
    }

    public void setPositiveButtonText(int i) {
        setPositiveButtonText(getContext().getString(i));
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, C2850R.attr.dialogPreferenceStyle, 16842897));
    }

    public DialogPreference(@NonNull Context context) {
        this(context, null);
    }
}
