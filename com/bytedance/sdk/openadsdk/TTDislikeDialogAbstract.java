package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.p297bX.C8126eo;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements C8126eo.InterfaceC8130IL {

    /* renamed from: IL */
    protected List<FilterWord> f17242IL;

    /* renamed from: bX */
    protected final C8126eo f17243bX;

    /* renamed from: bg */
    protected String f17244bg;
    private View eqN;

    /* renamed from: zx */
    private String f17245zx;

    public TTDislikeDialogAbstract(@NonNull Context context) {
        super(context);
        C8126eo c8126eo = new C8126eo();
        this.f17243bX = c8126eo;
        c8126eo.m86959bg(this);
    }

    public void destroy() {
        C8126eo c8126eo = this.f17243bX;
        if (c8126eo != null) {
            c8126eo.m86965bg();
        }
    }

    public C8126eo getDislikeManager() {
        return this.f17243bX;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View layoutView = getLayoutView();
        this.eqN = layoutView;
        if (layoutView == null) {
            C7741PX.m87880IL("getLayoutView,layout  may be abnormal, please check");
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.eqN;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void onSuggestionSubmit(String str) {
        C8126eo c8126eo = this.f17243bX;
        if (c8126eo != null) {
            c8126eo.m86966bX(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.f17244bg = str;
        this.f17242IL = list;
        this.f17243bX.m86954bg(str);
        this.f17243bX.m86953bg(this.f17242IL);
    }

    public TTDislikeDialogAbstract(@NonNull Context context, int i, String str) {
        super(context, i);
        this.f17245zx = str;
        C8126eo c8126eo = new C8126eo();
        this.f17243bX = c8126eo;
        c8126eo.m86959bg(this);
    }
}
