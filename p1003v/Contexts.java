package p1003v;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.XmlRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

@Metadata
/* renamed from: v.d */
/* loaded from: classes2.dex */
public final class Contexts {
    @NotNull
    /* renamed from: a */
    public static final Drawable m2848a(@NotNull Context context, @DrawableRes int i) {
        Drawable drawable = AppCompatResources.getDrawable(context, i);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i).toString());
    }

    @NotNull
    /* renamed from: b */
    public static final Drawable m2847b(@NotNull Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) {
        Drawable drawable = ResourcesCompat.getDrawable(resources, i, theme);
        if (drawable != null) {
            return drawable;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i).toString());
    }

    @Nullable
    /* renamed from: c */
    public static final Lifecycle m2846c(@Nullable Context context) {
        while (!(context instanceof LifecycleOwner)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((LifecycleOwner) context).getLifecycle();
    }

    @NotNull
    /* renamed from: d */
    public static final Drawable m2845d(@NotNull Context context, @NotNull Resources resources, @XmlRes int i) {
        XmlResourceParser xml = resources.getXml(i);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return m2847b(resources, i, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    /* renamed from: e */
    public static final boolean m2844e(@NotNull Context context, @NotNull String str) {
        if (ContextCompat.checkSelfPermission(context, str) == 0) {
            return true;
        }
        return false;
    }
}
