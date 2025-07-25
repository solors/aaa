package com.p551my.target;

import android.content.Context;
import com.p551my.target.common.menu.Menu;
import com.p551my.target.common.menu.MenuAction;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.e */
/* loaded from: classes7.dex */
public final class C25718e implements Menu {

    /* renamed from: a */
    public final List f66757a = new ArrayList();

    /* renamed from: b */
    public WeakReference f66758b = null;

    /* renamed from: c */
    public WeakReference f66759c;

    @Override // com.p551my.target.common.menu.Menu
    public void addAction(MenuAction menuAction) {
        this.f66757a.add(menuAction);
    }

    @Override // com.p551my.target.common.menu.Menu
    public void dismiss() {
        String str;
        WeakReference weakReference = this.f66759c;
        if (weakReference == null) {
            str = "AdChoicesOptionMenu: can't dismiss not existing view";
        } else {
            C25762g c25762g = (C25762g) weakReference.get();
            if (c25762g == null) {
                str = "AdChoicesOptionMenu: can't dismiss not existing or garbage-collected view";
            } else {
                c25762g.m43895a();
                return;
            }
        }
        AbstractC25846ja.m43680a(str);
    }

    @Override // com.p551my.target.common.menu.Menu
    public void present(Context context) {
        if (this.f66757a.isEmpty()) {
            AbstractC25846ja.m43680a("AdChoicesOptionMenu: there are no actions, can't present.");
        } else if (this.f66758b == null) {
            AbstractC25846ja.m43680a("AdChoicesOptionMenu: there is no listener, can't present");
        } else {
            C25762g c25762g = new C25762g(context, this.f66757a, this.f66758b);
            this.f66759c = new WeakReference(c25762g);
            c25762g.m43892b();
        }
    }

    @Override // com.p551my.target.common.menu.Menu
    public void setListener(Menu.Listener listener) {
        this.f66758b = new WeakReference(listener);
    }
}
