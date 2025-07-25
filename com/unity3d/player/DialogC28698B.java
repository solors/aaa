package com.unity3d.player;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

/* renamed from: com.unity3d.player.B */
/* loaded from: classes7.dex */
public class DialogC28698B extends Dialog implements View.OnClickListener, TextWatcher {

    /* renamed from: a */
    private Context f74512a;

    /* renamed from: b */
    private UnityPlayer f74513b;

    /* renamed from: c */
    private boolean f74514c;

    /* renamed from: d */
    public boolean f74515d;

    public DialogC28698B(Context context, UnityPlayer unityPlayer, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        super(context);
        int i3;
        int i4;
        this.f74512a = context;
        this.f74513b = unityPlayer;
        Window window = getWindow();
        this.f74515d = z6;
        window.requestFeature(1);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.x = 0;
        attributes.y = 0;
        window.setAttributes(attributes);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View createSoftInputView = createSoftInputView();
        setContentView(createSoftInputView);
        window.setLayout(-1, -2);
        window.clearFlags(2);
        window.clearFlags(134217728);
        window.clearFlags(67108864);
        if (!this.f74515d) {
            window.addFlags(32);
            window.addFlags(262144);
        }
        i3 = AbstractC28697A.f74509b;
        EditText editText = (EditText) findViewById(i3);
        i4 = AbstractC28697A.f74508a;
        m37765a(editText, str, i, z, z2, z3, str2, i2);
        ((Button) findViewById(i4)).setOnClickListener(this);
        editText.getCurrentTextColor();
        m37761a(z5);
        this.f74513b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC28801x(this, createSoftInputView));
        getWindow().setSoftInputMode(5);
        editText.requestFocus();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        int i;
        this.f74513b.reportSoftInputStr(editable.toString(), 0, false);
        i = AbstractC28697A.f74509b;
        EditText editText = (EditText) findViewById(i);
        int selectionStart = editText.getSelectionStart();
        this.f74513b.reportSoftInputSelection(selectionStart, editText.getSelectionEnd() - selectionStart);
    }

    protected View createSoftInputView() {
        int i;
        int i2;
        int i3;
        RelativeLayout relativeLayout = new RelativeLayout(this.f74512a);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(-1);
        i = AbstractC28697A.f74510c;
        relativeLayout.setId(i);
        View c28802y = new C28802y(this, this.f74512a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        i2 = AbstractC28697A.f74508a;
        layoutParams.addRule(0, i2);
        c28802y.setLayoutParams(layoutParams);
        i3 = AbstractC28697A.f74509b;
        c28802y.setId(i3);
        relativeLayout.addView(c28802y);
        Button button = new Button(this.f74512a);
        button.setText(this.f74512a.getResources().getIdentifier("ok", "string", "android"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(11);
        button.setLayoutParams(layoutParams2);
        button.setId(i2);
        button.setBackgroundColor(0);
        relativeLayout.addView(button);
        ((EditText) relativeLayout.findViewById(i3)).setOnEditorActionListener(new C28803z(this));
        relativeLayout.setPadding(16, 16, 16, 16);
        return relativeLayout;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f74515d && (motionEvent.getAction() == 4 || this.f74514c)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        m37762a(m37760b(), true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m37762a(m37760b(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public String m37760b() {
        int i;
        i = AbstractC28697A.f74509b;
        EditText editText = (EditText) findViewById(i);
        if (editText == null) {
            return null;
        }
        return editText.getText().toString();
    }

    /* renamed from: a */
    public String m37768a() {
        InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) this.f74512a.getSystemService("input_method")).getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype == null) {
            return null;
        }
        String locale = currentInputMethodSubtype.getLocale();
        if (locale == null || locale.equals("")) {
            String mode = currentInputMethodSubtype.getMode();
            String extraValue = currentInputMethodSubtype.getExtraValue();
            return mode + " " + extraValue;
        }
        return locale;
    }

    /* renamed from: a */
    public void m37767a(int i) {
        int i2;
        i2 = AbstractC28697A.f74509b;
        EditText editText = (EditText) findViewById(i2);
        if (editText != null) {
            if (i > 0) {
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
            } else {
                editText.setFilters(new InputFilter[0]);
            }
        }
    }

    /* renamed from: a */
    public void m37766a(int i, int i2) {
        int i3;
        int i4;
        i3 = AbstractC28697A.f74509b;
        EditText editText = (EditText) findViewById(i3);
        if (editText == null || editText.getText().length() < (i4 = i2 + i)) {
            return;
        }
        editText.setSelection(i, i4);
    }

    /* renamed from: a */
    public void m37763a(String str) {
        int i;
        i = AbstractC28697A.f74509b;
        EditText editText = (EditText) findViewById(i);
        if (editText != null) {
            editText.setText(str);
            editText.setSelection(str.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m37762a(String str, boolean z) {
        int i;
        i = AbstractC28697A.f74509b;
        ((EditText) findViewById(i)).setSelection(0, 0);
        this.f74513b.reportSoftInputStr(str, 1, z);
    }

    /* renamed from: a */
    public void m37761a(boolean z) {
        int i;
        int i2;
        int i3;
        this.f74514c = z;
        i = AbstractC28697A.f74509b;
        EditText editText = (EditText) findViewById(i);
        i2 = AbstractC28697A.f74508a;
        Button button = (Button) findViewById(i2);
        i3 = AbstractC28697A.f74510c;
        View findViewById = findViewById(i3);
        if (z) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) editText.getLayoutParams();
            layoutParams.height = 1;
            editText.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) button.getLayoutParams();
            layoutParams2.height = 1;
            button.setLayoutParams(layoutParams2);
            findViewById.setPadding(0, 0, 0, 0);
            findViewById.setVisibility(4);
        } else {
            findViewById.setVisibility(0);
            findViewById.setPadding(16, 16, 16, 16);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) editText.getLayoutParams();
            layoutParams3.height = -2;
            editText.setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) button.getLayoutParams();
            layoutParams4.height = -2;
            button.setLayoutParams(layoutParams4);
        }
        findViewById.invalidate();
        findViewById.requestLayout();
    }

    /* renamed from: a */
    private void m37765a(EditText editText, String str, int i, boolean z, boolean z2, boolean z3, String str2, int i2) {
        editText.setBackgroundColor(-1);
        editText.setImeOptions(6);
        editText.setText(str);
        editText.setHint(str2);
        editText.setHintTextColor(1627389952);
        int i3 = (z ? 32768 : 524288) | (z2 ? 131072 : 0) | (z3 ? 128 : 0);
        if (i >= 0 && i <= 11) {
            int i4 = new int[]{1, 16385, 12290, 17, 2, 3, 8289, 33, 1, 16417, 17, 8194}[i];
            i3 = (i4 & 2) != 0 ? i4 : i3 | i4;
        }
        editText.setInputType(i3);
        editText.setImeOptions(33554432);
        if (i2 > 0) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
        }
        editText.addTextChangedListener(this);
        editText.setSelection(editText.getText().length());
        editText.setClickable(true);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
