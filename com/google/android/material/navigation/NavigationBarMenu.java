package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public final class NavigationBarMenu extends MenuBuilder {
    @NonNull

    /* renamed from: a */
    private final Class<?> f37921a;

    /* renamed from: b */
    private final int f37922b;

    public NavigationBarMenu(@NonNull Context context, @NonNull Class<?> cls, int i) {
        super(context);
        this.f37921a = cls;
        this.f37922b = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.MenuBuilder
    @NonNull
    public MenuItem addInternal(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        if (size() + 1 <= this.f37922b) {
            stopDispatchingItemsChanged();
            MenuItem addInternal = super.addInternal(i, i2, i3, charSequence);
            if (addInternal instanceof MenuItemImpl) {
                ((MenuItemImpl) addInternal).setExclusiveCheckable(true);
            }
            startDispatchingItemsChanged();
            return addInternal;
        }
        String simpleName = this.f37921a.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f37922b + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i, int i2, int i3, @NonNull CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f37921a.getSimpleName() + " does not support submenus");
    }

    public int getMaxItemCount() {
        return this.f37922b;
    }
}
