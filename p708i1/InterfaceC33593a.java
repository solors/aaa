package p708i1;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.io.Serializable;
import p678g1.C33182b;

/* renamed from: i1.a */
/* loaded from: classes3.dex */
public interface InterfaceC33593a<AdView extends View> extends Serializable {
    void onAdClicked();

    void onAdShown();

    void onAdViewReady(@NonNull AdView adview);

    void onError(@NonNull C33182b c33182b);

    void registerAdContainer(@NonNull ViewGroup viewGroup);

    void registerAdView(@NonNull AdView adview);
}
