package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0154R;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

/* loaded from: classes.dex */
class AppCompatEmojiEditTextHelper {
    @NonNull
    private final EmojiEditTextHelper mEmojiEditTextHelper;
    @NonNull
    private final EditText mView;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatEmojiEditTextHelper(@NonNull EditText editText) {
        this.mView = editText;
        this.mEmojiEditTextHelper = new EmojiEditTextHelper(editText, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public KeyListener getKeyListener(@Nullable KeyListener keyListener) {
        if (isEmojiCapableKeyListener(keyListener)) {
            return this.mEmojiEditTextHelper.getKeyListener(keyListener);
        }
        return keyListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEmojiCapableKeyListener(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEnabled() {
        return this.mEmojiEditTextHelper.isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadFromAttributes(@Nullable AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, C0154R.styleable.AppCompatTextView, i, 0);
        try {
            int i2 = C0154R.styleable.AppCompatTextView_emojiCompatEnabled;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            setEnabled(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public InputConnection onCreateInputConnection(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return this.mEmojiEditTextHelper.onCreateInputConnection(inputConnection, editorInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEnabled(boolean z) {
        this.mEmojiEditTextHelper.setEnabled(z);
    }
}
