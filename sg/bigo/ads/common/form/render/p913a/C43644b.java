package sg.bigo.ads.common.form.render.p913a;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.api.p903a.InterfaceC43518e;
import sg.bigo.ads.common.form.C43634a;
import sg.bigo.ads.common.form.render.C43641a;
import sg.bigo.ads.common.form.render.p913a.AbstractC43642a;
import sg.bigo.ads.common.utils.C43810a;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.common.form.render.a.b */
/* loaded from: classes10.dex */
public final class C43644b extends AbstractC43642a {
    public C43644b(@NonNull InterfaceC43518e.C43521c c43521c, @Nullable Map<String, Object> map, Context context, AbstractC43642a.InterfaceC43643a interfaceC43643a) {
        super(c43521c, map, context, interfaceC43643a);
    }

    @Override // sg.bigo.ads.common.form.render.p913a.AbstractC43642a
    /* renamed from: b */
    public final View mo5265b() {
        View m4954a = C43810a.m4954a(this.f114247h, C43641a.m5275a(2), null, false);
        this.f114248i = m4954a;
        if (m4954a == null) {
            return null;
        }
        AbstractC43642a.m5271a((TextView) m4954a.findViewById(C42750R.C42753id.edit_title), this.f114243d);
        mo5266a(1);
        final EditText editText = (EditText) this.f114248i.findViewById(C42750R.C42753id.edit_content);
        String m5286a = C43634a.m5286a(this.f114244e, this.f114241b);
        if (editText != null) {
            editText.setTextColor(C43641a.m5274b());
            editText.setHint(C43634a.m5287a(this.f114247h, C42750R.C42755string.form_question_hint));
            if (!C43836q.m4837a((CharSequence) m5286a)) {
                AbstractC43642a.InterfaceC43643a interfaceC43643a = this.f114249j;
                if (interfaceC43643a != null) {
                    interfaceC43643a.mo5268a(this.f114240a.f114035d, m5286a);
                }
                this.f114242c = m5286a;
                editText.setText(m5286a);
            }
            editText.addTextChangedListener(new TextWatcher() { // from class: sg.bigo.ads.common.form.render.a.b.1
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    C43644b.this.f114242c = editText.getText().toString();
                    C43644b c43644b = C43644b.this;
                    AbstractC43642a.InterfaceC43643a interfaceC43643a2 = c43644b.f114249j;
                    if (interfaceC43643a2 != null) {
                        interfaceC43643a2.mo5268a(c43644b.f114240a.f114035d, c43644b.f114242c);
                    }
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sg.bigo.ads.common.form.render.a.b.2
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    C43644b c43644b = C43644b.this;
                    if (z) {
                        c43644b.mo5266a(2);
                    } else {
                        c43644b.m5273a();
                    }
                }
            });
        }
        return this.f114248i;
    }
}
