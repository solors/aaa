package com.p551my.target;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.p551my.target.C25669c;
import com.p551my.target.C25697d;
import com.p551my.target.common.menu.Menu;
import com.p551my.target.common.menu.MenuAction;
import com.p551my.target.common.menu.MenuFactory;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.f */
/* loaded from: classes7.dex */
public final class C25741f implements Menu.Listener {

    /* renamed from: a */
    public final List f66826a;

    /* renamed from: b */
    public final MenuFactory f66827b;

    /* renamed from: c */
    public Map f66828c;

    /* renamed from: d */
    public Menu f66829d;

    /* renamed from: e */
    public C25697d.InterfaceC25698a f66830e;

    /* renamed from: f */
    public WeakReference f66831f;

    public C25741f(List list, MenuFactory menuFactory) {
        this.f66826a = list;
        this.f66827b = menuFactory;
    }

    /* renamed from: a */
    public final void m43949a() {
        Menu menu = this.f66829d;
        if (menu == null) {
            return;
        }
        menu.dismiss();
        this.f66829d = null;
        this.f66828c = null;
    }

    /* renamed from: b */
    public boolean m43945b() {
        if (this.f66829d != null) {
            return true;
        }
        return false;
    }

    @Override // com.p551my.target.common.menu.Menu.Listener
    public void onActionClick(MenuAction menuAction) {
        C25697d.InterfaceC25698a interfaceC25698a;
        String str;
        if (menuAction.style == 1) {
            m43949a();
            return;
        }
        WeakReference weakReference = this.f66831f;
        if (weakReference == null) {
            AbstractC25846ja.m43680a("AdChoicesOptionsController: there is no context, can't process action click");
            return;
        }
        Context context = (Context) weakReference.get();
        if (context == null) {
            AbstractC25846ja.m43680a("AdChoicesOptionsController: there is no context, can't process action click");
            return;
        }
        Map map = this.f66828c;
        if (map == null) {
            str = "AdChoicesOptionsController: there are no associatedOptions, can't process action click";
        } else {
            C25669c.C25670a c25670a = (C25669c.C25670a) map.get(menuAction);
            if (c25670a == null) {
                str = "AdChoicesOptionsController: can't obtain option by menu action.";
            } else {
                String str2 = c25670a.f66666c;
                if (!TextUtils.isEmpty(str2)) {
                    C25735ea.m43953c(str2, context);
                }
                if (c25670a.f66665b.equals("copy")) {
                    String str3 = c25670a.f66668e;
                    if (str3 != null) {
                        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied id", str3));
                    }
                    m43949a();
                    return;
                }
                String str4 = c25670a.f66667d;
                if (!TextUtils.isEmpty(str4)) {
                    AbstractC25883l3.m43561a(str4, context);
                }
                if (c25670a.f66669f && (interfaceC25698a = this.f66830e) != null) {
                    interfaceC25698a.mo42225a(context);
                }
                m43949a();
                return;
            }
        }
        AbstractC25846ja.m43680a(str);
    }

    /* renamed from: a */
    public static C25741f m43946a(List list, MenuFactory menuFactory) {
        return new C25741f(list, menuFactory);
    }

    /* renamed from: a */
    public void m43948a(Context context) {
        if (this.f66826a.size() == 0) {
            return;
        }
        Menu createMenu = this.f66827b.createMenu();
        this.f66829d = createMenu;
        this.f66831f = new WeakReference(context);
        if (this.f66828c == null) {
            this.f66828c = new HashMap();
        }
        for (C25669c.C25670a c25670a : this.f66826a) {
            MenuAction menuAction = new MenuAction(c25670a.f66664a, 0);
            createMenu.addAction(menuAction);
            this.f66828c.put(menuAction, c25670a);
        }
        createMenu.addAction(new MenuAction("", 1));
        createMenu.setListener(this);
        createMenu.present(context);
    }

    /* renamed from: a */
    public void m43947a(C25697d.InterfaceC25698a interfaceC25698a) {
        this.f66830e = interfaceC25698a;
    }
}
