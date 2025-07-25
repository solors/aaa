package com.zeus.gmc.sdk.mobileads.columbus.internal.ciii2coi2;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.xiaomi.walking.EnumC18802c;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32488c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32489c2oc2o;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32611ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32707coiic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciii2coi2.coi222o222 */
/* loaded from: classes8.dex */
public class C32617coi222o222 {
    private boolean cicic;
    private final HashMap<View, String> coo2iico = new HashMap<>();
    private final HashMap<View, C32618coo2iico> coi222o222 = new HashMap<>();
    private final HashMap<String, View> c2oc2i = new HashMap<>();
    private final HashSet<View> cioccoiococ = new HashSet<>();
    private final HashSet<String> c2oc2o = new HashSet<>();
    private final HashSet<String> cco22 = new HashSet<>();
    private final HashMap<String, String> cii2c2 = new HashMap<>();
    private final HashSet<String> ciii2coi2 = new HashSet<>();
    private final Map<View, Boolean> coiic = new WeakHashMap();

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciii2coi2.coi222o222$coo2iico */
    /* loaded from: classes8.dex */
    public static class C32618coo2iico {
        private final ArrayList<String> coi222o222 = new ArrayList<>();
        private final C32489c2oc2o coo2iico;

        public C32618coo2iico(C32489c2oc2o c32489c2oc2o, String str) {
            this.coo2iico = c32489c2oc2o;
            coo2iico(str);
        }

        public ArrayList<String> coi222o222() {
            return this.coi222o222;
        }

        public C32489c2oc2o coo2iico() {
            return this.coo2iico;
        }

        public void coo2iico(String str) {
            this.coi222o222.add(str);
        }
    }

    public String c2oc2i(View view) {
        if (this.coo2iico.size() == 0) {
            return null;
        }
        String str = this.coo2iico.get(view);
        if (str != null) {
            this.coo2iico.remove(view);
        }
        return str;
    }

    public void c2oc2o() {
        C32488c2oc2i c2oc2i = C32488c2oc2i.c2oc2i();
        if (c2oc2i != null) {
            for (C32707coiic c32707coiic : c2oc2i.coo2iico()) {
                View ciii2coi2 = c32707coiic.ciii2coi2();
                if (c32707coiic.cicc2iiccc()) {
                    String coi222o222 = c32707coiic.coi222o222();
                    if (ciii2coi2 != null) {
                        boolean c2oc2o = C32611ciii2coi2.c2oc2o(ciii2coi2);
                        if (c2oc2o) {
                            this.ciii2coi2.add(coi222o222);
                        }
                        String coo2iico = coo2iico(ciii2coi2, c2oc2o);
                        if (coo2iico == null) {
                            this.c2oc2o.add(coi222o222);
                            this.coo2iico.put(ciii2coi2, coi222o222);
                            coo2iico(c32707coiic);
                        } else if (coo2iico != "noWindowFocus") {
                            this.cco22.add(coi222o222);
                            this.c2oc2i.put(coi222o222, ciii2coi2);
                            this.cii2c2.put(coi222o222, coo2iico);
                        }
                    } else {
                        this.cco22.add(coi222o222);
                        this.cii2c2.put(coi222o222, "noAdView");
                    }
                }
            }
        }
    }

    public EnumC18802c cioccoiococ(View view) {
        return this.cioccoiococ.contains(view) ? EnumC18802c.PARENT_VIEW : this.cicic ? EnumC18802c.OBSTRUCTION_VIEW : EnumC18802c.UNDERLYING_VIEW;
    }

    public C32618coo2iico coi222o222(View view) {
        C32618coo2iico c32618coo2iico = this.coi222o222.get(view);
        if (c32618coo2iico != null) {
            this.coi222o222.remove(view);
        }
        return c32618coo2iico;
    }

    public View coo2iico(String str) {
        return this.c2oc2i.get(str);
    }

    private Boolean coo2iico(View view) {
        if (view.hasWindowFocus()) {
            this.coiic.remove(view);
            return Boolean.FALSE;
        } else if (this.coiic.containsKey(view)) {
            return this.coiic.get(view);
        } else {
            Map<View, Boolean> map = this.coiic;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public HashSet<String> c2oc2i() {
        return this.c2oc2o;
    }

    public boolean c2oc2o(View view) {
        if (this.coiic.containsKey(view)) {
            this.coiic.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    public void cioccoiococ() {
        this.cicic = true;
    }

    public String coi222o222(String str) {
        return this.cii2c2.get(str);
    }

    private String coo2iico(View view, boolean z) {
        if (view.isAttachedToWindow()) {
            if (!coo2iico(view).booleanValue() || z) {
                HashSet hashSet = new HashSet();
                while (view != null) {
                    String coo2iico = C32611ciii2coi2.coo2iico(view);
                    if (coo2iico != null) {
                        return coo2iico;
                    }
                    hashSet.add(view);
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                this.cioccoiococ.addAll(hashSet);
                return null;
            }
            return "noWindowFocus";
        }
        return "notAttached";
    }

    @VisibleForTesting
    public boolean c2oc2i(String str) {
        return this.ciii2coi2.contains(str);
    }

    public HashSet<String> coi222o222() {
        return this.cco22;
    }

    public void coo2iico() {
        this.coo2iico.clear();
        this.coi222o222.clear();
        this.c2oc2i.clear();
        this.cioccoiococ.clear();
        this.c2oc2o.clear();
        this.cco22.clear();
        this.cii2c2.clear();
        this.cicic = false;
        this.ciii2coi2.clear();
    }

    private void coo2iico(C32489c2oc2o c32489c2oc2o, C32707coiic c32707coiic) {
        View view = c32489c2oc2o.c2oc2i().get();
        if (view == null) {
            return;
        }
        C32618coo2iico c32618coo2iico = this.coi222o222.get(view);
        if (c32618coo2iico != null) {
            c32618coo2iico.coo2iico(c32707coiic.coi222o222());
        } else {
            this.coi222o222.put(view, new C32618coo2iico(c32489c2oc2o, c32707coiic.coi222o222()));
        }
    }

    private void coo2iico(C32707coiic c32707coiic) {
        for (C32489c2oc2o c32489c2oc2o : c32707coiic.coiic()) {
            coo2iico(c32489c2oc2o, c32707coiic);
        }
    }
}
