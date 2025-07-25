package sg.bigo.ads.api;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes10.dex */
public interface SplashAd extends InterfaceC43501Ad {
    @RequiresApi(api = 21)
    public static final String APP_LOGO_TRANSITION_NAME = "bigoads:splash:app_logo";
    @RequiresApi(api = 21)
    public static final String APP_NAME_TRANSITION_NAME = "bigoads:splash:app_name";

    /* loaded from: classes10.dex */
    public enum Style {
        VERTICAL_FULLSCREEN,
        VERTICAL_HALFSCREEN,
        HORIZONTAL
    }

    Style getStyle();

    boolean isSkippable();

    @Override // sg.bigo.ads.api.InterfaceC43501Ad, sg.bigo.ads.api.IconAds
    @Deprecated
    void setAdInteractionListener(AdInteractionListener adInteractionListener);

    void setAdInteractionListener(SplashAdInteractionListener splashAdInteractionListener);

    void show();

    void show(Activity activity);

    void showInAdContainer(@NonNull ViewGroup viewGroup);
}
