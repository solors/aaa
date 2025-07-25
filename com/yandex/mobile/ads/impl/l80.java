package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.PopupMenu;
import com.yandex.mobile.ads.impl.c80;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class l80 {
    @NotNull
    /* renamed from: a */
    public static PopupMenu m32306a(@NotNull Context context, @NotNull ImageView view, @NotNull List items) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(items, "items");
        PopupMenu popupMenu = new PopupMenu(context, view, 5);
        Menu menu = popupMenu.getMenu();
        Iterator it = items.iterator();
        int i = 0;
        while (it.hasNext()) {
            menu.add(0, i, 0, ((c80.C30076a) it.next()).m35342a());
            i++;
        }
        return popupMenu;
    }
}
